package com.applovin.impl.mediation.c;

import com.applovin.impl.sdk.c.a;
import com.applovin.impl.sdk.c.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

public class b extends i {

    /* renamed from: a  reason: collision with root package name */
    private static final String[] f14608a = {"ads", com.appnext.core.a.b.hW, "auto_init_adapters", "test_mode_idfas", "test_mode_auto_init_adapters"};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f14609b = {"ads", com.appnext.core.a.b.hW, "signal_providers"};

    public static String a(n nVar) {
        return i.a((String) nVar.a(a.f15337c), "1.0/mediate", nVar);
    }

    public static void a(JSONObject jSONObject, n nVar) {
        if (JsonUtils.valueExists(jSONObject, "signal_providers")) {
            JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
            JsonUtils.removeObjectsForKeys(shallowCopy, f14608a);
            nVar.a(d.x, shallowCopy.toString());
            if (((Boolean) nVar.a(com.applovin.impl.sdk.c.b.ff)).booleanValue()) {
                com.applovin.impl.mediation.b.b.a(shallowCopy);
            }
        }
    }

    public static String b(n nVar) {
        return i.a((String) nVar.a(a.f15338d), "1.0/mediate", nVar);
    }

    public static void b(JSONObject jSONObject, n nVar) {
        if (jSONObject.length() != 0) {
            if (JsonUtils.valueExists(jSONObject, "auto_init_adapters") || JsonUtils.valueExists(jSONObject, "test_mode_auto_init_adapters")) {
                JSONObject shallowCopy = JsonUtils.shallowCopy(jSONObject);
                JsonUtils.removeObjectsForKeys(shallowCopy, f14609b);
                nVar.a(d.y, shallowCopy.toString());
                return;
            }
            nVar.b(d.y);
        }
    }

    public static String c(n nVar) {
        return i.a((String) nVar.a(a.f15337c), "1.0/mediate_debug", nVar);
    }

    public static String d(n nVar) {
        return i.a((String) nVar.a(a.f15338d), "1.0/mediate_debug", nVar);
    }
}
