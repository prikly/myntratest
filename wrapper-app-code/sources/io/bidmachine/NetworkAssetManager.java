package io.bidmachine;

import android.content.Context;
import android.content.res.AssetManager;
import android.text.TextUtils;
import io.bidmachine.core.Logger;
import io.bidmachine.core.Utils;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

class NetworkAssetManager {
    static final /* synthetic */ boolean $assertionsDisabled = false;
    private static final String BID_MACHINE_ASSET_FILE_EXTENSION = "bmnetwork";
    private static final String BID_MACHINE_ASSET_PATH = "bm_networks";
    private static final String KEY_CLASSPATH = "classpath";
    private static final String KEY_NAME = "name";
    private static final String KEY_SDK_VERSION = "sdk_version";
    private static final String KEY_VERSION = "version";
    static final Map<String, NetworkAssetParams> networkAssetParamsMap = new ConcurrentHashMap();

    NetworkAssetManager() {
    }

    static Map<String, NetworkAssetParams> getNetworkAssetParamsMap(Context context) {
        if (networkAssetParamsMap.size() > 0) {
            return networkAssetParamsMap;
        }
        findNetworks(context);
        return networkAssetParamsMap;
    }

    static void findNetworks(Context context) {
        if (networkAssetParamsMap.size() <= 0) {
            try {
                AssetManager assets = context.getAssets();
                if (assets != null) {
                    for (String findNetwork : assets.list(BID_MACHINE_ASSET_PATH)) {
                        findNetwork(assets, findNetwork);
                    }
                }
            } catch (Exception unused) {
            }
        }
    }

    static NetworkAssetParams getNetworkAssetParams(Context context, String str) {
        if (networkAssetParamsMap.containsKey(str)) {
            return networkAssetParamsMap.get(str);
        }
        try {
            AssetManager assets = context.getAssets();
            if (assets == null) {
                return null;
            }
            return findNetwork(assets, String.format("%s.%s", new Object[]{str, BID_MACHINE_ASSET_FILE_EXTENSION}));
        } catch (Exception unused) {
            return null;
        }
    }

    private static NetworkAssetParams findNetwork(AssetManager assetManager, String str) {
        NetworkAssetParams createNetworkParams = createNetworkParams(assetManager, str);
        if (createNetworkParams != null) {
            networkAssetParamsMap.put(createNetworkParams.getName(), createNetworkParams);
        }
        return createNetworkParams;
    }

    private static NetworkAssetParams createNetworkParams(AssetManager assetManager, String str) {
        try {
            if (TextUtils.isEmpty(str)) {
                return null;
            }
            String readAssetByNetworkName = readAssetByNetworkName(assetManager, str);
            if (TextUtils.isEmpty(readAssetByNetworkName)) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(readAssetByNetworkName);
            String optString = jSONObject.optString("name");
            String optString2 = jSONObject.optString("version");
            String optString3 = jSONObject.optString(KEY_CLASSPATH);
            String optString4 = jSONObject.optString(KEY_SDK_VERSION);
            if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && !TextUtils.isEmpty(optString3)) {
                if (!TextUtils.isEmpty(optString4)) {
                    return new NetworkAssetParams(optString, optString2, optString3, optString4);
                }
            }
            return null;
        } catch (Exception unused) {
        }
    }

    private static String readAssetByNetworkName(AssetManager assetManager, String str) {
        InputStream inputStream;
        try {
            inputStream = assetManager.open(String.format("%s/%s", new Object[]{BID_MACHINE_ASSET_PATH, str}));
            try {
                String streamToString = Utils.streamToString(inputStream);
                Utils.close(inputStream);
                return streamToString;
            } catch (Throwable th) {
                th = th;
                try {
                    Logger.log(th);
                    return null;
                } finally {
                    Utils.close(inputStream);
                }
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
            Logger.log(th);
            return null;
        }
    }
}
