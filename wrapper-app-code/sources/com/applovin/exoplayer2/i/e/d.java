package com.applovin.exoplayer2.i.e;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;

final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<List<a>> f13086a;

    /* renamed from: b  reason: collision with root package name */
    private final List<Long> f13087b;

    public d(List<List<a>> list, List<Long> list2) {
        this.f13086a = list;
        this.f13087b = list2;
    }

    public int a(long j) {
        int b2 = ai.b(this.f13087b, Long.valueOf(j), false, false);
        if (b2 < this.f13087b.size()) {
            return b2;
        }
        return -1;
    }

    public long a(int i) {
        boolean z = true;
        com.applovin.exoplayer2.l.a.a(i >= 0);
        if (i >= this.f13087b.size()) {
            z = false;
        }
        com.applovin.exoplayer2.l.a.a(z);
        return this.f13087b.get(i).longValue();
    }

    public List<a> b(long j) {
        int a2 = ai.a(this.f13087b, Long.valueOf(j), true, false);
        return a2 == -1 ? Collections.emptyList() : this.f13086a.get(a2);
    }

    public int f_() {
        return this.f13087b.size();
    }
}
