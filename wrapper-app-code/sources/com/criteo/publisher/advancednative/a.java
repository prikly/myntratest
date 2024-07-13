package com.criteo.publisher.advancednative;

import com.criteo.publisher.b0.c;
import java.lang.ref.Reference;
import java.net.URI;

/* compiled from: AdChoiceClickHandler */
class a implements n {

    /* renamed from: a  reason: collision with root package name */
    private final URI f2304a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final Reference<CriteoNativeAdListener> f2305b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final f f2306c;

    a(URI uri, Reference<CriteoNativeAdListener> reference, f fVar) {
        this.f2304a = uri;
        this.f2305b = reference;
        this.f2306c = fVar;
    }

    /* renamed from: com.criteo.publisher.advancednative.a$a  reason: collision with other inner class name */
    /* compiled from: AdChoiceClickHandler */
    class C0018a implements c {
        C0018a() {
        }

        public void b() {
            a.this.f2306c.c((CriteoNativeAdListener) a.this.f2305b.get());
        }

        public void a() {
            a.this.f2306c.b((CriteoNativeAdListener) a.this.f2305b.get());
        }
    }

    public void a() {
        this.f2306c.a(this.f2304a, new C0018a());
    }
}
