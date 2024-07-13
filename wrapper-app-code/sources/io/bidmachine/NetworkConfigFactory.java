package io.bidmachine;

import android.content.Context;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import io.bidmachine.protobuf.AdNetwork;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

class NetworkConfigFactory {
    private static final String KEY_AD_UNITS = "ad_units";
    private static final String KEY_FORMAT = "format";
    private static final String KEY_NETWORK = "network";
    private static final String[] PRIVATE_FIELDS = {KEY_NETWORK, KEY_FORMAT, KEY_AD_UNITS};

    NetworkConfigFactory() {
    }

    static NetworkConfig create(Context context, AdNetwork adNetwork) {
        NetworkConfig create;
        if (context == null) {
            return null;
        }
        String name = adNetwork.getName();
        if (TextUtils.isEmpty(name) || (create = create(context, name, adNetwork.getCustomParamsMap())) == null) {
            return null;
        }
        for (AdNetwork.AdUnit next : adNetwork.getAdUnitsList()) {
            AdsFormat byRemoteName = AdsFormat.byRemoteName(next.getAdFormat());
            if (byRemoteName != null) {
                create.withMediationConfig(byRemoteName, next.getCustomParamsMap());
            } else {
                Logger.log(String.format("Network (%s) adUnit register fail: %s not provided", new Object[]{name, KEY_FORMAT}));
            }
        }
        return create;
    }

    static NetworkConfig create(Context context, JSONObject jSONObject) {
        String str;
        if (context == null) {
            return null;
        }
        try {
            str = jSONObject.getString(KEY_NETWORK);
            try {
                NetworkConfig create = create(context, str, Utils.toMap(jSONObject));
                if (create == null) {
                    return null;
                }
                JSONArray jSONArray = jSONObject.getJSONArray(KEY_AD_UNITS);
                for (int i = 0; i < jSONArray.length(); i++) {
                    JSONObject jSONObject2 = jSONArray.getJSONObject(i);
                    AdsFormat byRemoteName = AdsFormat.byRemoteName(jSONObject2.getString(KEY_FORMAT));
                    if (byRemoteName != null) {
                        create.withMediationConfig(byRemoteName, filterParams(Utils.toMap(jSONObject2)));
                    } else {
                        Logger.log(String.format("Network (%s) adUnit register fail: %s not provided", new Object[]{str, KEY_FORMAT}));
                    }
                }
                Logger.log(String.format("Load network from json config completed successfully: %s", new Object[]{create.getNetworkKey()}));
                return create;
            } catch (Throwable th) {
                th = th;
                Logger.log(String.format("Network (%s) load fail!", new Object[]{str}));
                Logger.log(th);
                return null;
            }
        } catch (Throwable th2) {
            th = th2;
            str = null;
            Logger.log(String.format("Network (%s) load fail!", new Object[]{str}));
            Logger.log(th);
            return null;
        }
    }

    private static NetworkConfig create(Context context, String str, Map<String, String> map) {
        NetworkAssetParams networkAssetParams = NetworkAssetManager.getNetworkAssetParams(context, str);
        if (networkAssetParams == null) {
            return null;
        }
        try {
            return (NetworkConfig) Class.forName(networkAssetParams.getClasspath()).getConstructor(new Class[]{Map.class}).newInstance(new Object[]{filterParams(map)});
        } catch (Throwable th) {
            Logger.log(String.format("Network (%s) load fail!", new Object[]{str}));
            Logger.log(th);
            return null;
        }
    }

    private static Map<String, String> filterParams(Map<String, String> map) {
        if (map != null) {
            try {
                for (String remove : PRIVATE_FIELDS) {
                    map.remove(remove);
                }
            } catch (Exception unused) {
            }
        }
        return map;
    }
}
