package com.ironsource.sdk.a;

import com.ironsource.mediationsdk.adunit.a.a;
import com.ironsource.sdk.g.c;
import com.ironsource.sdk.g.d;

public class e {

    /* renamed from: a  reason: collision with root package name */
    private a f8998a = new a();

    public static d.e a(c cVar, d.e eVar) {
        return (cVar == null || cVar.f9518d == null || cVar.f9518d.get("rewarded") == null) ? eVar : Boolean.parseBoolean(cVar.f9518d.get("rewarded")) ? d.e.RewardedVideo : d.e.Interstitial;
    }

    public static boolean a(c cVar) {
        if (cVar == null || cVar.f9518d.get("inAppBidding") == null) {
            return false;
        }
        return Boolean.parseBoolean(cVar.f9518d.get("inAppBidding"));
    }

    public void a(int i) {
        a.a("sdia", (Object) Integer.valueOf(i));
    }

    public void b(int i) {
        a.a("sdra", (Object) Integer.valueOf(i));
    }

    public void c(int i) {
        a.a("sdba", (Object) Integer.valueOf(i));
    }
}
