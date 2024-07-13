package com.unity3d.services.ads.operation.load;

import com.unity3d.services.core.configuration.ConfigurationReader;
import com.unity3d.services.core.configuration.InitializationNotificationCenter;
import com.unity3d.services.core.request.metrics.ISDKMetrics;
import com.unity3d.services.core.request.metrics.SDKMetrics;
import org.json.JSONException;
import org.json.JSONObject;

public class LoadModule extends BaseLoadModule {
    static ILoadModule _instance;

    /* access modifiers changed from: package-private */
    public void addOptionalParameters(LoadOperationState loadOperationState, JSONObject jSONObject) throws JSONException {
    }

    public static ILoadModule getInstance() {
        if (_instance == null) {
            _instance = new LoadModuleDecoratorTimeout(new LoadModuleDecoratorInitializationBuffer(new LoadModule(SDKMetrics.getInstance()), InitializationNotificationCenter.getInstance()), new ConfigurationReader());
        }
        return _instance;
    }

    public LoadModule(ISDKMetrics iSDKMetrics) {
        super(iSDKMetrics);
    }
}
