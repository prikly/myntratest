package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

public final class o implements j {

    /* renamed from: a  reason: collision with root package name */
    private final y f12318a = new y(10);

    /* renamed from: b  reason: collision with root package name */
    private x f12319b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f12320c;

    /* renamed from: d  reason: collision with root package name */
    private long f12321d = -9223372036854775807L;

    /* renamed from: e  reason: collision with root package name */
    private int f12322e;

    /* renamed from: f  reason: collision with root package name */
    private int f12323f;

    public void a() {
        this.f12320c = false;
        this.f12321d = -9223372036854775807L;
    }

    public void a(long j, int i) {
        if ((i & 4) != 0) {
            this.f12320c = true;
            if (j != -9223372036854775807L) {
                this.f12321d = j;
            }
            this.f12322e = 0;
            this.f12323f = 0;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        x a2 = jVar.a(dVar.b(), 5);
        this.f12319b = a2;
        a2.a(new v.a().a(dVar.c()).f("application/id3").a());
    }

    public void a(y yVar) {
        a.a(this.f12319b);
        if (this.f12320c) {
            int a2 = yVar.a();
            int i = this.f12323f;
            if (i < 10) {
                int min = Math.min(a2, 10 - i);
                System.arraycopy(yVar.d(), yVar.c(), this.f12318a.d(), this.f12323f, min);
                if (this.f12323f + min == 10) {
                    this.f12318a.d(0);
                    if (73 == this.f12318a.h() && 68 == this.f12318a.h() && 51 == this.f12318a.h()) {
                        this.f12318a.e(3);
                        this.f12322e = this.f12318a.v() + 10;
                    } else {
                        q.c("Id3Reader", "Discarding invalid ID3 tag");
                        this.f12320c = false;
                        return;
                    }
                }
            }
            int min2 = Math.min(a2, this.f12322e - this.f12323f);
            this.f12319b.a(yVar, min2);
            this.f12323f += min2;
        }
    }

    public void b() {
        int i;
        a.a(this.f12319b);
        if (this.f12320c && (i = this.f12322e) != 0 && this.f12323f == i) {
            long j = this.f12321d;
            if (j != -9223372036854775807L) {
                this.f12319b.a(j, 1, i, 0, (x.a) null);
            }
            this.f12320c = false;
        }
    }
}
