package com.appsgeyser.sdk.server;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import com.appsgeyser.sdk.configuration.Configuration;
import com.appsgeyser.sdk.configuration.models.ConfigPhp;
import com.appsgeyser.sdk.utils.DeviceInfoGetter;
import com.yandex.metrica.YandexMetrica;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;

public class StatController {
    private static StatController instance;
    private HashMap<String, String> items;

    public enum AdsType {
        NATIVE,
        REWARDED,
        FULLSCREEN
    }

    private StatController() {
    }

    public static synchronized StatController getInstance() {
        StatController statController;
        synchronized (StatController.class) {
            if (instance == null) {
                instance = new StatController();
            }
            statController = instance;
        }
        return statController;
    }

    public void init(HashMap<String, String> hashMap) {
        this.items = hashMap;
    }

    public void sendRequestAsyncByKey(String str) {
        sendRequestAsyncByKey(str, (HashMap<String, String>) null, (Context) null, false);
    }

    public void sendRequestAsyncByKey(String str, final HashMap<String, String> hashMap, Context context, boolean z) {
        if (!(!z || context == null || hashMap == null)) {
            HashMap<String, String> deviceInfoMap = DeviceInfoGetter.getDeviceInfoMap(context);
            if (deviceInfoMap != null) {
                hashMap.putAll(deviceInfoMap);
            }
            String templateVersion = Configuration.getInstance(context).getTemplateVersion();
            if (templateVersion != null) {
                hashMap.put("templateversion", templateVersion);
            }
        }
        sendQueryToYandexMetrica(str, hashMap);
        if (!isInitialized()) {
            Log.d("StatController", "StatController not initialized, skipping stat request on: " + str);
            return;
        }
        final String str2 = this.items.get(str);
        if (str2 == null) {
            Log.d("StatController", "Stat url not set, skipping stat request on: " + str);
            return;
        }
        new Thread() {
            public void run() {
                String str = str2;
                if (hashMap != null) {
                    Uri.Builder buildUpon = Uri.parse(str).buildUpon();
                    for (Map.Entry entry : hashMap.entrySet()) {
                        buildUpon.appendQueryParameter((String) entry.getKey(), (String) entry.getValue());
                    }
                    str = buildUpon.build().toString();
                }
                RequestQueueHolder.addUrl(str);
            }
        }.start();
    }

    private void sendQueryToYandexMetrica(String str, HashMap<String, String> hashMap) {
        String str2 = null;
        if (hashMap != null) {
            try {
                str2 = new JSONObject(hashMap).toString();
            } catch (Exception e2) {
                e2.printStackTrace();
                return;
            }
        }
        YandexMetrica.reportEvent(str, str2);
    }

    private boolean isInitialized() {
        return this.items != null;
    }

    public static HashMap<String, String> generateQueryParametersForSdk(ConfigPhp configPhp, Context context, AdsType adsType, String str, String str2) {
        String str3;
        HashMap<String, String> hashMap = new HashMap<>();
        Configuration instance2 = Configuration.getInstance(context);
        hashMap.put("wdid", instance2.getApplicationId());
        hashMap.put("guid", instance2.getAppGuid());
        hashMap.put("details", str);
        String str4 = "";
        if (adsType == AdsType.NATIVE) {
            str4 = configPhp.getAdsNetworkSdk().get(str2).getUniqueId();
            str3 = configPhp.getAdsNetworkSdk().get(str2).getBannerId();
        } else if (adsType == AdsType.REWARDED) {
            str4 = configPhp.getRewardedVideoSdk().get(str2).getUniqueId();
            str3 = configPhp.getRewardedVideoSdk().get(str2).getBannerId();
        } else if (adsType == AdsType.FULLSCREEN) {
            str4 = configPhp.getFullscreenSdk().get(str2).getUniqueId();
            str3 = configPhp.getFullscreenSdk().get(str2).getBannerId();
        } else {
            str3 = str4;
        }
        hashMap.put("uniqid", str4);
        hashMap.put("bannerid", str3);
        return hashMap;
    }
}
