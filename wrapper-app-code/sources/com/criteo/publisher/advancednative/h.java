package com.criteo.publisher.advancednative;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: ImageLoaderHolder */
public class h {

    /* renamed from: a  reason: collision with root package name */
    private final AtomicReference<ImageLoader> f2330a;

    public h(ImageLoader imageLoader) {
        this.f2330a = new AtomicReference<>(imageLoader);
    }

    /* access modifiers changed from: package-private */
    public ImageLoader a() {
        return this.f2330a.get();
    }

    /* access modifiers changed from: package-private */
    public void a(ImageLoader imageLoader) {
        this.f2330a.set(imageLoader);
    }
}
