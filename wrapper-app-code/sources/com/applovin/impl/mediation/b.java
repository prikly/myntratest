package com.applovin.impl.mediation;

import com.applovin.impl.mediation.a;
import com.applovin.impl.mediation.c;
import com.applovin.impl.sdk.n;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.sdk.AppLovinSdkUtils;

public class b implements a.C0140a, c.a {

    /* renamed from: a  reason: collision with root package name */
    private final a f14545a;

    /* renamed from: b  reason: collision with root package name */
    private final c f14546b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final MaxAdListener f14547c;

    public b(n nVar, MaxAdListener maxAdListener) {
        this.f14547c = maxAdListener;
        this.f14545a = new a(nVar);
        this.f14546b = new c(nVar, this);
    }

    public void a(final com.applovin.impl.mediation.a.c cVar) {
        AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
            public void run() {
                b.this.f14547c.onAdHidden(cVar);
            }
        }, cVar.C());
    }

    public void a(MaxAd maxAd) {
        this.f14546b.a();
        this.f14545a.a();
    }

    public void b(com.applovin.impl.mediation.a.c cVar) {
        long A = cVar.A();
        if (A >= 0) {
            this.f14546b.a(cVar, A);
        }
        if (cVar.B()) {
            this.f14545a.a(cVar, this);
        }
    }

    public void c(com.applovin.impl.mediation.a.c cVar) {
        this.f14547c.onAdHidden(cVar);
    }
}
