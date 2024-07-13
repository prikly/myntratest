package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import java.util.Collections;
import java.util.List;

public final class i implements j {

    /* renamed from: a  reason: collision with root package name */
    private final List<ad.a> f12237a;

    /* renamed from: b  reason: collision with root package name */
    private final x[] f12238b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12239c;

    /* renamed from: d  reason: collision with root package name */
    private int f12240d;

    /* renamed from: e  reason: collision with root package name */
    private int f12241e;

    /* renamed from: f  reason: collision with root package name */
    private long f12242f = -9223372036854775807L;

    public i(List<ad.a> list) {
        this.f12237a = list;
        this.f12238b = new x[list.size()];
    }

    private boolean a(y yVar, int i) {
        if (yVar.a() == 0) {
            return false;
        }
        if (yVar.h() != i) {
            this.f12239c = false;
        }
        this.f12240d--;
        return this.f12239c;
    }

    public void a() {
        this.f12239c = false;
        this.f12242f = -9223372036854775807L;
    }

    public void a(long j, int i) {
        if ((i & 4) != 0) {
            this.f12239c = true;
            if (j != -9223372036854775807L) {
                this.f12242f = j;
            }
            this.f12241e = 0;
            this.f12240d = 2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        for (int i = 0; i < this.f12238b.length; i++) {
            ad.a aVar = this.f12237a.get(i);
            dVar.a();
            x a2 = jVar.a(dVar.b(), 3);
            a2.a(new v.a().a(dVar.c()).f("application/dvbsubs").a((List<byte[]>) Collections.singletonList(aVar.f12179c)).c(aVar.f12177a).a());
            this.f12238b[i] = a2;
        }
    }

    public void a(y yVar) {
        if (!this.f12239c) {
            return;
        }
        if (this.f12240d != 2 || a(yVar, 32)) {
            if (this.f12240d != 1 || a(yVar, 0)) {
                int c2 = yVar.c();
                int a2 = yVar.a();
                for (x a3 : this.f12238b) {
                    yVar.d(c2);
                    a3.a(yVar, a2);
                }
                this.f12241e += a2;
            }
        }
    }

    public void b() {
        if (this.f12239c) {
            if (this.f12242f != -9223372036854775807L) {
                for (x a2 : this.f12238b) {
                    a2.a(this.f12242f, 1, this.f12241e, 0, (x.a) null);
                }
            }
            this.f12239c = false;
        }
    }
}
