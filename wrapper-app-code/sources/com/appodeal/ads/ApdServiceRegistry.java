package com.appodeal.ads;

import android.content.Context;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.utils.Log;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

@Deprecated
public class ApdServiceRegistry {
    private static ApdServiceRegistry instance;
    private final Map<String, ApdService> services = new HashMap();

    public class a implements ApdServiceInitializationListener {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ String f16111a;

        public a(String str) {
            this.f16111a = str;
        }

        public final void onInitializationFailed(LoadingError loadingError) {
            String str;
            if (loadingError == null) {
                str = String.format("%s", new Object[]{this.f16111a});
            } else {
                str = String.format("[%s]: %s (%s)", new Object[]{this.f16111a, loadingError.toString().toUpperCase(), Integer.valueOf(loadingError.getCode())});
            }
            Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INITIALIZE_FAILED, str);
        }

        public final void onInitializationFinished() {
            Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INITIALIZE, String.format("[%s]: Success", new Object[]{n5.a(this.f16111a)}));
        }
    }

    private ApdServiceRegistry() {
    }

    public static synchronized ApdServiceRegistry getInstance() {
        ApdServiceRegistry apdServiceRegistry;
        synchronized (ApdServiceRegistry.class) {
            if (instance == null) {
                instance = new ApdServiceRegistry();
            }
            apdServiceRegistry = instance;
        }
        return apdServiceRegistry;
    }

    public static void register(ApdService apdService) {
        getInstance().registerService(apdService);
    }

    private void registerService(ApdService apdService) {
        this.services.put(apdService.getName(), apdService);
        Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_REGISTER, apdService.getName());
    }

    public void initialize(Context context, JSONArray jSONArray) {
        if (context != null && jSONArray != null) {
            try {
                if (jSONArray.length() != 0) {
                    initializeServiceConfiguration(context, jSONArray);
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }

    public void initializeServiceConfiguration(Context context, JSONArray jSONArray) {
        for (int i = 0; i < jSONArray.length(); i++) {
            JSONObject optJSONObject = jSONArray.optJSONObject(i);
            if (optJSONObject != null) {
                String optString = optJSONObject.optString("status");
                ApdService apdService = this.services.get(optString);
                boolean z = true;
                if (apdService != null) {
                    try {
                        g0 g0Var = new g0(optJSONObject);
                        q4 q4Var = q4.f17047a;
                        if (r0.f17088d != Log.LogLevel.verbose) {
                            z = false;
                        }
                        apdService.setLogging(z);
                        apdService.dispatchInitialize(context, g0Var, new a(optString));
                    } catch (Throwable th) {
                        Log.log(th);
                    }
                } else {
                    Log.log(LogConstants.KEY_SERVICE, LogConstants.EVENT_INITIALIZE_FAILED, String.format("[%s]: %s", new Object[]{optString, "not found"}));
                }
            }
        }
    }
}
