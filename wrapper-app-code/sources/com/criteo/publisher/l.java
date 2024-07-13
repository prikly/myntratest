package com.criteo.publisher;

import android.webkit.WebViewClient;
import com.criteo.publisher.context.ContextData;
import com.criteo.publisher.e0.c;
import com.criteo.publisher.model.AdUnit;
import com.criteo.publisher.model.s;
import java.lang.ref.WeakReference;

/* compiled from: CriteoBannerEventController */
public class l {

    /* renamed from: a  reason: collision with root package name */
    private final WeakReference<CriteoBannerView> f2591a;

    /* renamed from: b  reason: collision with root package name */
    private final CriteoBannerAdListener f2592b;

    /* renamed from: c  reason: collision with root package name */
    private final Criteo f2593c;

    /* renamed from: d  reason: collision with root package name */
    private final com.criteo.publisher.a0.b f2594d;

    /* renamed from: e  reason: collision with root package name */
    private final c f2595e;

    public l(CriteoBannerView criteoBannerView, Criteo criteo, com.criteo.publisher.a0.b bVar, c cVar) {
        this.f2591a = new WeakReference<>(criteoBannerView);
        this.f2592b = criteoBannerView.getCriteoBannerAdListener();
        this.f2593c = criteo;
        this.f2594d = bVar;
        this.f2595e = cVar;
    }

    /* compiled from: CriteoBannerEventController */
    class a implements d {
        a() {
        }

        public void a(s sVar) {
            l.this.a(p.VALID);
            l.this.a(sVar.d());
        }

        public void a() {
            l.this.a(p.INVALID);
        }
    }

    public void a(AdUnit adUnit, ContextData contextData) {
        this.f2593c.getBidForAdUnit(adUnit, contextData, new a());
    }

    public void a(Bid bid) {
        String a2 = bid == null ? null : bid.a(com.criteo.publisher.n0.a.CRITEO_BANNER);
        if (a2 == null) {
            a(p.INVALID);
            return;
        }
        a(p.VALID);
        a(a2);
    }

    /* access modifiers changed from: package-private */
    public void a(p pVar) {
        this.f2595e.a(new com.criteo.publisher.m0.a(this.f2592b, this.f2591a, pVar));
    }

    /* access modifiers changed from: package-private */
    public void a(String str) {
        this.f2595e.a(new com.criteo.publisher.m0.b(this.f2591a, a(), this.f2593c.getConfig(), str));
    }

    /* access modifiers changed from: package-private */
    public WebViewClient a() {
        return new com.criteo.publisher.b0.a(new b(), this.f2594d.a());
    }

    /* compiled from: CriteoBannerEventController */
    class b implements com.criteo.publisher.b0.c {
        public void a() {
        }

        b() {
        }

        public void b() {
            l.this.a(p.CLICK);
        }
    }
}
