package com.yandex.metrica.impl.ob;

import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.eh  reason: case insensitive filesystem */
public class C0360eh {

    /* renamed from: a  reason: collision with root package name */
    public final List<C0435hh> f5753a;

    /* renamed from: b  reason: collision with root package name */
    public final String f5754b;

    /* renamed from: c  reason: collision with root package name */
    public final long f5755c;

    /* renamed from: d  reason: collision with root package name */
    public final boolean f5756d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f5757e;

    public C0360eh(List<C0435hh> list, String str, long j, boolean z, boolean z2) {
        this.f5753a = A2.c(list);
        this.f5754b = str;
        this.f5755c = j;
        this.f5756d = z;
        this.f5757e = z2;
    }

    public String toString() {
        return "SdkFingerprintingState{sdkItemList=" + this.f5753a + ", etag='" + this.f5754b + '\'' + ", lastAttemptTime=" + this.f5755c + ", hasFirstCollectionOccurred=" + this.f5756d + ", shouldRetry=" + this.f5757e + '}';
    }
}
