package com.criteo.publisher.advancednative;

import com.criteo.publisher.x;
import java.net.URI;

/* compiled from: ClickHelper */
public class f {

    /* renamed from: a  reason: collision with root package name */
    private final com.criteo.publisher.b0.b f2317a;

    /* renamed from: b  reason: collision with root package name */
    private final com.criteo.publisher.a0.b f2318b;

    /* renamed from: c  reason: collision with root package name */
    private final com.criteo.publisher.e0.c f2319c;

    public f(com.criteo.publisher.b0.b bVar, com.criteo.publisher.a0.b bVar2, com.criteo.publisher.e0.c cVar) {
        this.f2317a = bVar;
        this.f2318b = bVar2;
        this.f2319c = cVar;
    }

    /* compiled from: ClickHelper */
    class a extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CriteoNativeAdListener f2320c;

        a(f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f2320c = criteoNativeAdListener;
        }

        public void a() {
            this.f2320c.onAdClicked();
        }
    }

    /* access modifiers changed from: package-private */
    public void a(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f2319c.a(new a(this, criteoNativeAdListener));
        }
    }

    /* compiled from: ClickHelper */
    class b extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CriteoNativeAdListener f2321c;

        b(f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f2321c = criteoNativeAdListener;
        }

        public void a() {
            this.f2321c.onAdLeftApplication();
        }
    }

    /* access modifiers changed from: package-private */
    public void c(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f2319c.a(new b(this, criteoNativeAdListener));
        }
    }

    /* compiled from: ClickHelper */
    class c extends x {

        /* renamed from: c  reason: collision with root package name */
        final /* synthetic */ CriteoNativeAdListener f2322c;

        c(f fVar, CriteoNativeAdListener criteoNativeAdListener) {
            this.f2322c = criteoNativeAdListener;
        }

        public void a() {
            this.f2322c.onAdClosed();
        }
    }

    /* access modifiers changed from: package-private */
    public void b(CriteoNativeAdListener criteoNativeAdListener) {
        if (criteoNativeAdListener != null) {
            this.f2319c.a(new c(this, criteoNativeAdListener));
        }
    }

    /* access modifiers changed from: package-private */
    public void a(URI uri, com.criteo.publisher.b0.c cVar) {
        this.f2317a.a(uri.toString(), this.f2318b.a(), cVar);
    }
}
