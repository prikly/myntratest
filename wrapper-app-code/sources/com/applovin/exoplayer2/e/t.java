package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

public final class t implements v {

    /* renamed from: a  reason: collision with root package name */
    private final long[] f12447a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f12448b;

    /* renamed from: c  reason: collision with root package name */
    private final long f12449c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12450d;

    public t(long[] jArr, long[] jArr2, long j) {
        a.a(jArr.length == jArr2.length);
        int length = jArr2.length;
        boolean z = length > 0;
        this.f12450d = z;
        if (!z || jArr2[0] <= 0) {
            this.f12447a = jArr;
            this.f12448b = jArr2;
        } else {
            int i = length + 1;
            long[] jArr3 = new long[i];
            this.f12447a = jArr3;
            this.f12448b = new long[i];
            System.arraycopy(jArr, 0, jArr3, 1, length);
            System.arraycopy(jArr2, 0, this.f12448b, 1, length);
        }
        this.f12449c = j;
    }

    public v.a a(long j) {
        if (!this.f12450d) {
            return new v.a(w.f12456a);
        }
        int a2 = ai.a(this.f12448b, j, true, true);
        w wVar = new w(this.f12448b[a2], this.f12447a[a2]);
        if (wVar.f12457b != j) {
            long[] jArr = this.f12448b;
            if (a2 != jArr.length - 1) {
                int i = a2 + 1;
                return new v.a(wVar, new w(jArr[i], this.f12447a[i]));
            }
        }
        return new v.a(wVar);
    }

    public boolean a() {
        return this.f12450d;
    }

    public long b() {
        return this.f12449c;
    }
}
