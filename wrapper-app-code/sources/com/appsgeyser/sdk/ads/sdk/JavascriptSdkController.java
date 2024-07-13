package com.appsgeyser.sdk.ads.sdk;

import android.content.Context;
import android.webkit.JavascriptInterface;
import com.appsgeyser.sdk.InternalEntryPoint;
import com.appsgeyser.sdk.ads.BaseSecureJsInterface;
import com.appsgeyser.sdk.ads.FullScreenBanner;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

public class JavascriptSdkController extends BaseSecureJsInterface {
    private final Context context;

    @JavascriptInterface
    public void setFSBannerCallbacksForSdk(String str, String str2, String str3, String str4, String str5) {
    }

    protected JavascriptSdkController(Context context2) {
        this.context = context2;
    }

    private HashMap<String, String> jsonStringToMap(String str) {
        HashMap<String, String> hashMap = new HashMap<>();
        try {
            JSONObject jSONObject = new JSONObject(str);
            Iterator<String> keys = jSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                hashMap.put(next, jSONObject.getString(next));
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        return hashMap;
    }

    @JavascriptInterface
    public void startSessionForSdk(String str, String str2) {
        SdkWrapper wrapperByKey = SdkWrapperFactory.getInstance().getWrapperByKey(str);
        wrapperByKey.addExtras(jsonStringToMap(str2));
        if (this.context != null) {
            InternalEntryPoint.getInstance().getFullScreenBanner(this.context).setBannerType(FullScreenBanner.BannerTypes.SDK);
            wrapperByKey.startSession(this.context);
        }
    }

    @JavascriptInterface
    public void stopSessionForSdk(String str) {
        SdkWrapperFactory.getInstance().getWrapperByKey(str).stopSession();
    }

    @JavascriptInterface
    public boolean isSdkActive(String str) {
        return SdkWrapperFactory.getInstance().getWrapperByKey(str).isActive();
    }

    @JavascriptInterface
    public void showFSBannerForSdk(String str) {
        SdkWrapperFactory.getInstance().getWrapperByKey(str).showFsBanner();
    }
}
