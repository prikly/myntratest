package com.applovin.exoplayer2.e.g;

import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class m {

    /* renamed from: a  reason: collision with root package name */
    public c f12076a;

    /* renamed from: b  reason: collision with root package name */
    public long f12077b;

    /* renamed from: c  reason: collision with root package name */
    public long f12078c;

    /* renamed from: d  reason: collision with root package name */
    public long f12079d;

    /* renamed from: e  reason: collision with root package name */
    public int f12080e;

    /* renamed from: f  reason: collision with root package name */
    public int f12081f;

    /* renamed from: g  reason: collision with root package name */
    public long[] f12082g = new long[0];

    /* renamed from: h  reason: collision with root package name */
    public int[] f12083h = new int[0];
    public int[] i = new int[0];
    public int[] j = new int[0];
    public long[] k = new long[0];
    public boolean[] l = new boolean[0];
    public boolean m;
    public boolean[] n = new boolean[0];
    public l o;
    public final y p = new y();
    public boolean q;
    public long r;
    public boolean s;

    public void a() {
        this.f12080e = 0;
        this.r = 0;
        this.s = false;
        this.m = false;
        this.q = false;
        this.o = null;
    }

    public void a(int i2) {
        this.p.a(i2);
        this.m = true;
        this.q = true;
    }

    public void a(int i2, int i3) {
        this.f12080e = i2;
        this.f12081f = i3;
        if (this.f12083h.length < i2) {
            this.f12082g = new long[i2];
            this.f12083h = new int[i2];
        }
        if (this.i.length < i3) {
            int i4 = (i3 * 125) / 100;
            this.i = new int[i4];
            this.j = new int[i4];
            this.k = new long[i4];
            this.l = new boolean[i4];
            this.n = new boolean[i4];
        }
    }

    public void a(i iVar) throws IOException {
        iVar.b(this.p.d(), 0, this.p.b());
        this.p.d(0);
        this.q = false;
    }

    public void a(y yVar) {
        yVar.a(this.p.d(), 0, this.p.b());
        this.p.d(0);
        this.q = false;
    }

    public long b(int i2) {
        return this.k[i2] + ((long) this.j[i2]);
    }

    public boolean c(int i2) {
        return this.m && this.n[i2];
    }
}
