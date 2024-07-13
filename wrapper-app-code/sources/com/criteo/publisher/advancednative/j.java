package com.criteo.publisher.advancednative;

import java.lang.ref.Reference;
import java.net.URL;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: ImpressionTask */
class j implements p {

    /* renamed from: a  reason: collision with root package name */
    private final Iterable<URL> f2337a;

    /* renamed from: b  reason: collision with root package name */
    private final Reference<CriteoNativeAdListener> f2338b;

    /* renamed from: c  reason: collision with root package name */
    private final i f2339c;

    /* renamed from: d  reason: collision with root package name */
    private final AtomicBoolean f2340d = new AtomicBoolean(false);

    j(Iterable<URL> iterable, Reference<CriteoNativeAdListener> reference, i iVar) {
        this.f2337a = iterable;
        this.f2338b = reference;
        this.f2339c = iVar;
    }

    public void a() {
        if (this.f2340d.compareAndSet(false, true)) {
            this.f2339c.a(this.f2337a);
            CriteoNativeAdListener criteoNativeAdListener = this.f2338b.get();
            if (criteoNativeAdListener != null) {
                this.f2339c.a(criteoNativeAdListener);
            }
        }
    }
}
