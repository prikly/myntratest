package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import java.util.Arrays;

public final class c implements v {

    /* renamed from: a  reason: collision with root package name */
    public final int f11845a;

    /* renamed from: b  reason: collision with root package name */
    public final int[] f11846b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f11847c;

    /* renamed from: d  reason: collision with root package name */
    public final long[] f11848d;

    /* renamed from: e  reason: collision with root package name */
    public final long[] f11849e;

    /* renamed from: f  reason: collision with root package name */
    private final long f11850f;

    public c(int[] iArr, long[] jArr, long[] jArr2, long[] jArr3) {
        this.f11846b = iArr;
        this.f11847c = jArr;
        this.f11848d = jArr2;
        this.f11849e = jArr3;
        int length = iArr.length;
        this.f11845a = length;
        if (length > 0) {
            this.f11850f = jArr2[length - 1] + jArr3[length - 1];
        } else {
            this.f11850f = 0;
        }
    }

    public v.a a(long j) {
        int b2 = b(j);
        w wVar = new w(this.f11849e[b2], this.f11847c[b2]);
        if (wVar.f12457b >= j || b2 == this.f11845a - 1) {
            return new v.a(wVar);
        }
        int i = b2 + 1;
        return new v.a(wVar, new w(this.f11849e[i], this.f11847c[i]));
    }

    public boolean a() {
        return true;
    }

    public int b(long j) {
        return ai.a(this.f11849e, j, true, true);
    }

    public long b() {
        return this.f11850f;
    }

    public String toString() {
        return "ChunkIndex(length=" + this.f11845a + ", sizes=" + Arrays.toString(this.f11846b) + ", offsets=" + Arrays.toString(this.f11847c) + ", timeUs=" + Arrays.toString(this.f11849e) + ", durationsUs=" + Arrays.toString(this.f11848d) + ")";
    }
}
