package com.applovin.exoplayer2.i.a;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import java.util.Collections;
import java.util.List;

final class d implements f {

    /* renamed from: a  reason: collision with root package name */
    private final List<a> f12973a;

    public d(List<a> list) {
        this.f12973a = list;
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i == 0);
        return 0;
    }

    public List<a> b(long j) {
        return j >= 0 ? this.f12973a : Collections.emptyList();
    }

    public int f_() {
        return 1;
    }
}
