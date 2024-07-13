package com.criteo.publisher;

import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.m0.d;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.a0;
import com.criteo.publisher.model.s;
import com.criteo.publisher.model.u;

/* compiled from: CriteoInterstitialEventController */
public class n {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a0 f2863a;

    /* renamed from: b  reason: collision with root package name */
    private final u f2864b;

    /* renamed from: c  reason: collision with root package name */
    private final Criteo f2865c;

    /* renamed from: d  reason: collision with root package name */
    private final com.criteo.publisher.j0.a f2866d;

    /* renamed from: e  reason: collision with root package name */
    private final d f2867e;

    public n(a0 a0Var, com.criteo.publisher.j0.a aVar, Criteo criteo, d dVar) {
        this.f2863a = a0Var;
        this.f2866d = aVar;
        this.f2865c = criteo;
        this.f2864b = criteo.getDeviceInfo();
        this.f2867e = dVar;
    }

    public boolean a() {
        return this.f2863a.e();
    }

    public void a(AdUnit adUnit, ContextData contextData) {
        if (!this.f2866d.b()) {
            b();
        } else if (!this.f2863a.f()) {
            this.f2863a.b();
            this.f2865c.getBidForAdUnit(adUnit, contextData, new a());
        }
    }

    /* compiled from: CriteoInterstitialEventController */
    class a implements d {
        a() {
        }

        public void a(s sVar) {
            n.this.a(sVar.d());
        }

        public void a() {
            n.this.b();
            n.this.f2863a.a();
        }
    }

    public void a(Bid bid) {
        String str;
        if (!this.f2866d.b()) {
            b();
            return;
        }
        if (bid == null) {
            str = null;
        } else {
            str = bid.a(com.criteo.publisher.n0.a.CRITEO_INTERSTITIAL);
        }
        if (str == null) {
            b();
        } else {
            a(str);
        }
    }

    /* access modifiers changed from: package-private */
    public void b() {
        this.f2867e.a(p.INVALID);
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f2863a.a(str, this.f2864b, this.f2867e);
    }

    public void c() {
        if (a()) {
            this.f2866d.a(this.f2863a.d(), this.f2867e);
            this.f2867e.a(p.OPEN);
            this.f2863a.g();
        }
    }
}
