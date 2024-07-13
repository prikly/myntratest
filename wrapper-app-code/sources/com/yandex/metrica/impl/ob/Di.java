package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.If;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class Di {

    /* renamed from: a  reason: collision with root package name */
    private final C0793w9 f3887a;

    public Di() {
        this(new C0793w9());
    }

    public Ph a(JSONObject jSONObject) {
        If.c cVar = new If.c();
        JSONObject optJSONObject = jSONObject.optJSONObject("cache_control");
        if (optJSONObject != null) {
            Long a2 = Tl.a(optJSONObject, "cells_around_ttl", (Long) null);
            TimeUnit timeUnit = TimeUnit.SECONDS;
            cVar.f4153a = Tl.a(a2, timeUnit, cVar.f4153a);
            cVar.f4154b = Tl.a(Tl.a(optJSONObject, "wifi_networks_ttl", (Long) null), timeUnit, cVar.f4154b);
            cVar.f4155c = Tl.a(Tl.a(optJSONObject, "last_known_location_ttl", (Long) null), timeUnit, cVar.f4155c);
            cVar.f4156d = Tl.a(Tl.a(optJSONObject, "net_interfaces_ttl", (Long) null), timeUnit, cVar.f4156d);
        }
        return this.f3887a.toModel(cVar);
    }

    Di(C0793w9 w9Var) {
        this.f3887a = w9Var;
    }
}
