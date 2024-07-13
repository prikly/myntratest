package com.applovin.exoplayer2.e.a;

import com.applovin.exoplayer2.e.d;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.v;
import java.io.EOFException;
import java.io.IOException;
import java.util.Arrays;

public final class a implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f11814a = $$Lambda$a$KDgqD9ThGuSDD_G_B5kq2FWtrM.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11815b = {13, 14, 16, 18, 20, 21, 27, 32, 6, 7, 6, 6, 1, 1, 1, 1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11816c = {18, 24, 33, 37, 41, 47, 51, 59, 61, 6, 1, 1, 1, 1, 1, 1};

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f11817d = ai.c("#!AMR\n");

    /* renamed from: e  reason: collision with root package name */
    private static final byte[] f11818e = ai.c("#!AMR-WB\n");

    /* renamed from: f  reason: collision with root package name */
    private static final int f11819f = f11816c[8];

    /* renamed from: g  reason: collision with root package name */
    private final byte[] f11820g;

    /* renamed from: h  reason: collision with root package name */
    private final int f11821h;
    private boolean i;
    private long j;
    private int k;
    private int l;
    private boolean m;
    private long n;
    private int o;
    private int p;
    private long q;
    private j r;
    private x s;
    private v t;
    private boolean u;

    public a() {
        this(0);
    }

    public a(int i2) {
        this.f11821h = (i2 & 2) != 0 ? i2 | 1 : i2;
        this.f11820g = new byte[1];
        this.o = -1;
    }

    private int a(int i2) throws com.applovin.exoplayer2.ai {
        if (b(i2)) {
            return this.i ? f11816c[i2] : f11815b[i2];
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Illegal AMR ");
        sb.append(this.i ? "WB" : "NB");
        sb.append(" frame type ");
        sb.append(i2);
        throw com.applovin.exoplayer2.ai.b(sb.toString(), (Throwable) null);
    }

    private static int a(int i2, long j2) {
        return (int) ((((long) (i2 * 8)) * 1000000) / j2);
    }

    private v a(long j2, boolean z) {
        return new d(j2, this.n, a(this.o, 20000), this.o, z);
    }

    private void a() {
        if (!this.u) {
            this.u = true;
            this.s.a(new v.a().f(this.i ? "audio/amr-wb" : "audio/3gpp").f(f11819f).k(1).l(this.i ? 16000 : 8000).a());
        }
    }

    private void a(long j2, int i2) {
        com.applovin.exoplayer2.e.v vVar;
        int i3;
        if (!this.m) {
            if ((this.f11821h & 1) == 0 || j2 == -1 || !((i3 = this.o) == -1 || i3 == this.k)) {
                vVar = new v.b(-9223372036854775807L);
            } else if (this.p >= 20 || i2 == -1) {
                vVar = a(j2, (this.f11821h & 2) != 0);
            } else {
                return;
            }
            this.t = vVar;
            this.r.a(vVar);
            this.m = true;
        }
    }

    private static boolean a(i iVar, byte[] bArr) throws IOException {
        iVar.a();
        byte[] bArr2 = new byte[bArr.length];
        iVar.d(bArr2, 0, bArr.length);
        return Arrays.equals(bArr2, bArr);
    }

    private void b() {
        com.applovin.exoplayer2.l.a.a(this.s);
        ai.a(this.r);
    }

    private boolean b(int i2) {
        return i2 >= 0 && i2 <= 15 && (c(i2) || d(i2));
    }

    private boolean b(i iVar) throws IOException {
        int length;
        if (a(iVar, f11817d)) {
            this.i = false;
            length = f11817d.length;
        } else if (!a(iVar, f11818e)) {
            return false;
        } else {
            this.i = true;
            length = f11818e.length;
        }
        iVar.b(length);
        return true;
    }

    private int c(i iVar) throws IOException {
        if (this.l == 0) {
            try {
                int d2 = d(iVar);
                this.k = d2;
                this.l = d2;
                if (this.o == -1) {
                    this.n = iVar.c();
                    this.o = this.k;
                }
                if (this.o == this.k) {
                    this.p++;
                }
            } catch (EOFException unused) {
                return -1;
            }
        }
        int a2 = this.s.a((g) iVar, this.l, true);
        if (a2 == -1) {
            return -1;
        }
        int i2 = this.l - a2;
        this.l = i2;
        if (i2 > 0) {
            return 0;
        }
        this.s.a(this.q + this.j, 1, this.k, 0, (x.a) null);
        this.j += 20000;
        return 0;
    }

    private boolean c(int i2) {
        return this.i && (i2 < 10 || i2 > 13);
    }

    private int d(i iVar) throws IOException {
        iVar.a();
        iVar.d(this.f11820g, 0, 1);
        byte b2 = this.f11820g[0];
        if ((b2 & 131) <= 0) {
            return a((b2 >> 3) & 15);
        }
        throw com.applovin.exoplayer2.ai.b("Invalid padding bits for frame header " + b2, (Throwable) null);
    }

    private boolean d(int i2) {
        return !this.i && (i2 < 12 || i2 > 14);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] d() {
        return new h[]{new a()};
    }

    public int a(i iVar, u uVar) throws IOException {
        b();
        if (iVar.c() != 0 || b(iVar)) {
            a();
            int c2 = c(iVar);
            a(iVar.d(), c2);
            return c2;
        }
        throw com.applovin.exoplayer2.ai.b("Could not find AMR header.", (Throwable) null);
    }

    public void a(long j2, long j3) {
        this.j = 0;
        this.k = 0;
        this.l = 0;
        if (j2 != 0) {
            com.applovin.exoplayer2.e.v vVar = this.t;
            if (vVar instanceof d) {
                this.q = ((d) vVar).b(j2);
                return;
            }
        }
        this.q = 0;
    }

    public void a(j jVar) {
        this.r = jVar;
        this.s = jVar.a(0, 1);
        jVar.a();
    }

    public boolean a(i iVar) throws IOException {
        return b(iVar);
    }

    public void c() {
    }
}
