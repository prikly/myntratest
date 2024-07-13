package com.criteo.publisher;

import android.app.Application;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.context.UserData;
import com.criteo.publisher.l0.c;
import com.criteo.publisher.logging.g;
import com.criteo.publisher.logging.h;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.t;
import com.criteo.publisher.model.u;
import java.util.List;
import java.util.concurrent.Executor;

/* compiled from: CriteoInternal */
class m extends Criteo {

    /* renamed from: a  reason: collision with root package name */
    private final g f2676a = h.b(getClass());

    /* renamed from: b  reason: collision with root package name */
    private final s f2677b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final e f2678c;

    /* renamed from: d  reason: collision with root package name */
    private final u f2679d;

    /* renamed from: e  reason: collision with root package name */
    private final t f2680e;

    /* renamed from: f  reason: collision with root package name */
    private final c f2681f;

    /* renamed from: g  reason: collision with root package name */
    private final j f2682g;

    /* renamed from: h  reason: collision with root package name */
    private final com.criteo.publisher.h0.c f2683h;
    private final com.criteo.publisher.j0.a i;

    m(Application application, List<AdUnit> list, Boolean bool, String str, s sVar) {
        this.f2677b = sVar;
        sVar.f1();
        u z0 = sVar.z0();
        this.f2679d = z0;
        z0.d();
        sVar.d0().f();
        this.f2680e = sVar.q0();
        this.f2678c = sVar.k0();
        this.f2682g = sVar.u0();
        this.f2683h = sVar.C0();
        this.i = sVar.G0();
        c l1 = sVar.l1();
        this.f2681f = l1;
        if (bool != null) {
            l1.a(bool.booleanValue());
        }
        if (str != null) {
            this.f2681f.a(str);
        }
        application.registerActivityLifecycleCallbacks(sVar.g0());
        sVar.i1().a(application);
        sVar.j0().a();
        a((Executor) sVar.c1(), list);
    }

    /* compiled from: CriteoInternal */
    class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ List f2684c;

        a(List list) {
            this.f2684c = list;
        }

        public void a() {
            m.this.f2678c.a((List<AdUnit>) this.f2684c);
        }
    }

    private void a(Executor executor, List<AdUnit> list) {
        executor.execute(new a(list));
    }

    public void enrichAdObjectWithBid(Object obj, Bid bid) {
        try {
            a(obj, bid);
        } catch (Throwable th) {
            this.f2676a.a(v.b(th));
        }
    }

    private void a(Object obj, Bid bid) {
        this.f2683h.a(obj, bid);
    }

    /* access modifiers changed from: package-private */
    public void getBidForAdUnit(AdUnit adUnit, ContextData contextData, d dVar) {
        this.f2678c.a(adUnit, contextData, dVar);
    }

    public void loadBid(AdUnit adUnit, ContextData contextData, BidResponseListener bidResponseListener) {
        try {
            this.f2682g.a(adUnit, contextData, bidResponseListener);
        } catch (Throwable th) {
            this.f2676a.a(v.b(th));
            bidResponseListener.onResponse((Bid) null);
        }
    }

    /* access modifiers changed from: package-private */
    public u getDeviceInfo() {
        return this.f2679d;
    }

    /* access modifiers changed from: package-private */
    public t getConfig() {
        return this.f2680e;
    }

    /* access modifiers changed from: package-private */
    public com.criteo.publisher.j0.a getInterstitialActivityHelper() {
        return this.i;
    }

    public l createBannerController(CriteoBannerView criteoBannerView) {
        return new l(criteoBannerView, this, this.f2677b.i1(), this.f2677b.c1());
    }

    public void setUsPrivacyOptOut(boolean z) {
        this.f2681f.a(z);
    }

    public void setMopubConsent(String str) {
        this.f2681f.a(str);
    }

    public void setUserData(UserData userData) {
        this.f2677b.k1().a(userData);
    }
}
