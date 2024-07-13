package com.applovin.exoplayer2.i.h;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import java.util.Collections;
import java.util.List;

final class b implements f {

    /* renamed from: a  reason: collision with root package name */
    public static final b f13153a = new b();

    /* renamed from: b  reason: collision with root package name */
    private final List<a> f13154b;

    private b() {
        this.f13154b = Collections.emptyList();
    }

    public b(a aVar) {
        this.f13154b = Collections.singletonList(aVar);
    }

    public int a(long j) {
        return j < 0 ? 0 : -1;
    }

    public long a(int i) {
        com.applovin.exoplayer2.l.a.a(i == 0);
        return 0;
    }

    public List<a> b(long j) {
        return j >= 0 ? this.f13154b : Collections.emptyList();
    }

    public int f_() {
        return 1;
    }
}
