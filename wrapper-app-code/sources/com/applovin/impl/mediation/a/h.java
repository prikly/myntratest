package com.applovin.impl.mediation.a;

import com.applovin.impl.sdk.n;
import java.util.Map;
import org.json.JSONObject;

public class h extends f {
    public h(Map<String, Object> map, JSONObject jSONObject, JSONObject jSONObject2, n nVar) {
        super(map, jSONObject, jSONObject2, nVar);
    }

    public boolean a() {
        return b("only_collect_signal_when_initialized", (Boolean) false).booleanValue();
    }

    public boolean b() {
        return b("use_cached_adapter", (Boolean) true).booleanValue();
    }

    public String toString() {
        return "SignalProviderSpec{adObject=" + Q() + '}';
    }
}
