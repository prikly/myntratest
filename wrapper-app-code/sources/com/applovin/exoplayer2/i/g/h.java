package com.applovin.exoplayer2.i.g;

import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import java.util.Collections;
import java.util.List;
import java.util.Map;

final class h implements f {

    /* renamed from: a  reason: collision with root package name */
    private final d f13141a;

    /* renamed from: b  reason: collision with root package name */
    private final long[] f13142b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, g> f13143c;

    /* renamed from: d  reason: collision with root package name */
    private final Map<String, e> f13144d;

    /* renamed from: e  reason: collision with root package name */
    private final Map<String, String> f13145e;

    public h(d dVar, Map<String, g> map, Map<String, e> map2, Map<String, String> map3) {
        this.f13141a = dVar;
        this.f13144d = map2;
        this.f13145e = map3;
        this.f13143c = map != null ? Collections.unmodifiableMap(map) : Collections.emptyMap();
        this.f13142b = dVar.b();
    }

    public int a(long j) {
        int b2 = ai.b(this.f13142b, j, false, false);
        if (b2 < this.f13142b.length) {
            return b2;
        }
        return -1;
    }

    public long a(int i) {
        return this.f13142b[i];
    }

    public List<a> b(long j) {
        return this.f13141a.a(j, this.f13143c, this.f13144d, this.f13145e);
    }

    public int f_() {
        return this.f13142b.length;
    }
}
