package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.ai;

final class n {

    /* renamed from: a  reason: collision with root package name */
    public final k f12084a;

    /* renamed from: b  reason: collision with root package name */
    public final int f12085b;

    /* renamed from: c  reason: collision with root package name */
    public final long[] f12086c;

    /* renamed from: d  reason: collision with root package name */
    public final int[] f12087d;

    /* renamed from: e  reason: collision with root package name */
    public final int f12088e;

    /* renamed from: f  reason: collision with root package name */
    public final long[] f12089f;

    /* renamed from: g  reason: collision with root package name */
    public final int[] f12090g;

    /* renamed from: h  reason: collision with root package name */
    public final long f12091h;

    public n(k kVar, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z = false;
        a.a(iArr.length == jArr2.length);
        a.a(jArr.length == jArr2.length);
        a.a(iArr2.length == jArr2.length ? true : z);
        this.f12084a = kVar;
        this.f12086c = jArr;
        this.f12087d = iArr;
        this.f12088e = i;
        this.f12089f = jArr2;
        this.f12090g = iArr2;
        this.f12091h = j;
        this.f12085b = jArr.length;
        if (iArr2.length > 0) {
            int length = iArr2.length - 1;
            iArr2[length] = iArr2[length] | 536870912;
        }
    }

    public int a(long j) {
        for (int a2 = ai.a(this.f12089f, j, true, false); a2 >= 0; a2--) {
            if ((this.f12090g[a2] & 1) != 0) {
                return a2;
            }
        }
        return -1;
    }

    public int b(long j) {
        for (int b2 = ai.b(this.f12089f, j, true, false); b2 < this.f12089f.length; b2++) {
            if ((this.f12090g[b2] & 1) != 0) {
                return b2;
            }
        }
        return -1;
    }
}
