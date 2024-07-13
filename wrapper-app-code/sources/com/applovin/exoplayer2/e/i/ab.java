package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class ab {

    /* renamed from: a  reason: collision with root package name */
    private final int f12154a;

    /* renamed from: b  reason: collision with root package name */
    private final ag f12155b = new ag(0);

    /* renamed from: c  reason: collision with root package name */
    private final y f12156c = new y();

    /* renamed from: d  reason: collision with root package name */
    private boolean f12157d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12158e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f12159f;

    /* renamed from: g  reason: collision with root package name */
    private long f12160g = -9223372036854775807L;

    /* renamed from: h  reason: collision with root package name */
    private long f12161h = -9223372036854775807L;
    private long i = -9223372036854775807L;

    ab(int i2) {
        this.f12154a = i2;
    }

    private int a(i iVar) {
        this.f12156c.a(ai.f13530f);
        this.f12157d = true;
        iVar.a();
        return 0;
    }

    private long a(y yVar, int i2) {
        int b2 = yVar.b();
        for (int c2 = yVar.c(); c2 < b2; c2++) {
            if (yVar.d()[c2] == 71) {
                long a2 = ae.a(yVar, c2, i2);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int b(i iVar, u uVar, int i2) throws IOException {
        int min = (int) Math.min((long) this.f12154a, iVar.d());
        long j = (long) 0;
        if (iVar.c() != j) {
            uVar.f12451a = j;
            return 1;
        }
        this.f12156c.a(min);
        iVar.a();
        iVar.d(this.f12156c.d(), 0, min);
        this.f12160g = a(this.f12156c, i2);
        this.f12158e = true;
        return 0;
    }

    private long b(y yVar, int i2) {
        int c2 = yVar.c();
        int b2 = yVar.b();
        for (int i3 = b2 - 188; i3 >= c2; i3--) {
            if (ae.a(yVar.d(), c2, b2, i3)) {
                long a2 = ae.a(yVar, i3, i2);
                if (a2 != -9223372036854775807L) {
                    return a2;
                }
            }
        }
        return -9223372036854775807L;
    }

    private int c(i iVar, u uVar, int i2) throws IOException {
        long d2 = iVar.d();
        int min = (int) Math.min((long) this.f12154a, d2);
        long j = d2 - ((long) min);
        if (iVar.c() != j) {
            uVar.f12451a = j;
            return 1;
        }
        this.f12156c.a(min);
        iVar.a();
        iVar.d(this.f12156c.d(), 0, min);
        this.f12161h = b(this.f12156c, i2);
        this.f12159f = true;
        return 0;
    }

    public int a(i iVar, u uVar, int i2) throws IOException {
        if (i2 <= 0) {
            return a(iVar);
        }
        if (!this.f12159f) {
            return c(iVar, uVar, i2);
        }
        if (this.f12161h == -9223372036854775807L) {
            return a(iVar);
        }
        if (!this.f12158e) {
            return b(iVar, uVar, i2);
        }
        long j = this.f12160g;
        if (j == -9223372036854775807L) {
            return a(iVar);
        }
        long b2 = this.f12155b.b(this.f12161h) - this.f12155b.b(j);
        this.i = b2;
        if (b2 < 0) {
            q.c("TsDurationReader", "Invalid duration: " + this.i + ". Using TIME_UNSET instead.");
            this.i = -9223372036854775807L;
        }
        return a(iVar);
    }

    public boolean a() {
        return this.f12157d;
    }

    public long b() {
        return this.i;
    }

    public ag c() {
        return this.f12155b;
    }
}
