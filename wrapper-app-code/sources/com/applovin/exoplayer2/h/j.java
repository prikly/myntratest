package com.applovin.exoplayer2.h;

import android.net.Uri;
import com.applovin.exoplayer2.k.l;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicLong;

public final class j {

    /* renamed from: h  reason: collision with root package name */
    private static final AtomicLong f12794h = new AtomicLong();

    /* renamed from: a  reason: collision with root package name */
    public final long f12795a;

    /* renamed from: b  reason: collision with root package name */
    public final l f12796b;

    /* renamed from: c  reason: collision with root package name */
    public final Uri f12797c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f12798d;

    /* renamed from: e  reason: collision with root package name */
    public final long f12799e;

    /* renamed from: f  reason: collision with root package name */
    public final long f12800f;

    /* renamed from: g  reason: collision with root package name */
    public final long f12801g;

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public j(long r13, com.applovin.exoplayer2.k.l r15, long r16) {
        /*
            r12 = this;
            r3 = r15
            android.net.Uri r4 = r3.f13370a
            java.util.Map r5 = java.util.Collections.emptyMap()
            r8 = 0
            r10 = 0
            r0 = r12
            r1 = r13
            r6 = r16
            r0.<init>(r1, r3, r4, r5, r6, r8, r10)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.h.j.<init>(long, com.applovin.exoplayer2.k.l, long):void");
    }

    public j(long j, l lVar, Uri uri, Map<String, List<String>> map, long j2, long j3, long j4) {
        this.f12795a = j;
        this.f12796b = lVar;
        this.f12797c = uri;
        this.f12798d = map;
        this.f12799e = j2;
        this.f12800f = j3;
        this.f12801g = j4;
    }

    public static long a() {
        return f12794h.getAndIncrement();
    }
}
