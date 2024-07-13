package com.applovin.exoplayer2.i.f;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    private final a[] f13092a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f13093b;

    public b(a[] aVarArr, long[] jArr) {
        this.f13092a = aVarArr;
        this.f13093b = jArr;
    }

    public int a(long j) {
        int b2 = ai.b(this.f13093b, j, false, false);
        if (b2 < this.f13093b.length) {
            return b2;
        }
        return -1;
    }

    public long a(int i) {
        boolean z = true;
        com.applovin.exoplayer2.l.a.a(i >= 0);
        if (i >= this.f13093b.length) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        return this.f13093b[i];
    }

    public List<a> b(long j) {
        int a2 = ai.a(this.f13093b, j, true, false);
        return (a2 == -1 || this.f13092a[a2] == a.f12907a) ? Collections.emptyList() : Collections.singletonList(this.f13092a[a2]);
    }

    public int f_() {
        return this.f13093b.length;
    }
}
