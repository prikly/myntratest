package com.criteo.publisher.advancednative;

import java.lang.ref.Reference;
import java.net.URI;

/* compiled from: AdViewClickHandler */
class c implements n {

    /* renamed from: a  reason: collision with root package name */
    private final URI f2311a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Reference<CriteoNativeAdListener> f2312b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final f f2313c;

    c(URI uri, Reference<CriteoNativeAdListener> reference, f fVar) {
        this.f2311a = uri;
        this.f2312b = reference;
        this.f2313c = fVar;
    }

    public void a() {
        this.f2313c.a(this.f2312b.get());
        this.f2313c.a(this.f2311a, new a());
    }

    /* compiled from: AdViewClickHandler */
    class a implements com.criteo.publisher.b0.c {
        a() {
        }

        public void b() {
            c.this.f2313c.c((CriteoNativeAdListener) c.this.f2312b.get());
        }

        public void a() {
            c.this.f2313c.b((CriteoNativeAdListener) c.this.f2312b.get());
        }
    }
}
