package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.c;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;

public final class d implements j {

    /* renamed from: a  reason: collision with root package name */
    private final x f12203a;

    /* renamed from: b  reason: collision with root package name */
    private final y f12204b;

    /* renamed from: c  reason: collision with root package name */
    private final String f12205c;

    /* renamed from: d  reason: collision with root package name */
    private String f12206d;

    /* renamed from: e  reason: collision with root package name */
    private com.applovin.exoplayer2.e.x f12207e;

    /* renamed from: f  reason: collision with root package name */
    private int f12208f;

    /* renamed from: g  reason: collision with root package name */
    private int f12209g;

    /* renamed from: h  reason: collision with root package name */
    private boolean f12210h;
    private boolean i;
    private long j;
    private v k;
    private int l;
    private long m;

    public d() {
        this((String) null);
    }

    public d(String str) {
        x xVar = new x(new byte[16]);
        this.f12203a = xVar;
        this.f12204b = new y(xVar.f13604a);
        this.f12208f = 0;
        this.f12209g = 0;
        this.f12210h = false;
        this.i = false;
        this.m = -9223372036854775807L;
        this.f12205c = str;
    }

    private boolean a(y yVar, byte[] bArr, int i2) {
        int min = Math.min(yVar.a(), i2 - this.f12209g);
        yVar.a(bArr, this.f12209g, min);
        int i3 = this.f12209g + min;
        this.f12209g = i3;
        return i3 == i2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x002d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean b(com.applovin.exoplayer2.l.y r6) {
        /*
            r5 = this;
        L_0x0000:
            int r0 = r6.a()
            r1 = 0
            if (r0 <= 0) goto L_0x0031
            boolean r0 = r5.f12210h
            r2 = 172(0xac, float:2.41E-43)
            r3 = 1
            if (r0 != 0) goto L_0x0018
            int r0 = r6.h()
            if (r0 != r2) goto L_0x0015
            r1 = 1
        L_0x0015:
            r5.f12210h = r1
            goto L_0x0000
        L_0x0018:
            int r0 = r6.h()
            if (r0 != r2) goto L_0x0020
            r2 = 1
            goto L_0x0021
        L_0x0020:
            r2 = 0
        L_0x0021:
            r5.f12210h = r2
            r2 = 64
            r4 = 65
            if (r0 == r2) goto L_0x002b
            if (r0 != r4) goto L_0x0000
        L_0x002b:
            if (r0 != r4) goto L_0x002e
            r1 = 1
        L_0x002e:
            r5.i = r1
            return r3
        L_0x0031:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.d.b(com.applovin.exoplayer2.l.y):boolean");
    }

    private void c() {
        this.f12203a.a(0);
        c.a a2 = c.a(this.f12203a);
        if (this.k == null || a2.f11208c != this.k.y || a2.f11207b != this.k.z || !"audio/ac4".equals(this.k.l)) {
            v a3 = new v.a().a(this.f12206d).f("audio/ac4").k(a2.f11208c).l(a2.f11207b).c(this.f12205c).a();
            this.k = a3;
            this.f12207e.a(a3);
        }
        this.l = a2.f11209d;
        this.j = (((long) a2.f11210e) * 1000000) / ((long) this.k.z);
    }

    public void a() {
        this.f12208f = 0;
        this.f12209g = 0;
        this.f12210h = false;
        this.i = false;
        this.m = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.m = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12206d = dVar.c();
        this.f12207e = jVar.a(dVar.b(), 1);
    }

    public void a(y yVar) {
        a.a(this.f12207e);
        while (yVar.a() > 0) {
            int i2 = this.f12208f;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(yVar.a(), this.l - this.f12209g);
                        this.f12207e.a(yVar, min);
                        int i3 = this.f12209g + min;
                        this.f12209g = i3;
                        int i4 = this.l;
                        if (i3 == i4) {
                            long j2 = this.m;
                            if (j2 != -9223372036854775807L) {
                                this.f12207e.a(j2, 1, i4, 0, (x.a) null);
                                this.m += this.j;
                            }
                            this.f12208f = 0;
                        }
                    }
                } else if (a(yVar, this.f12204b.d(), 16)) {
                    c();
                    this.f12204b.d(0);
                    this.f12207e.a(this.f12204b, 16);
                    this.f12208f = 2;
                }
            } else if (b(yVar)) {
                this.f12208f = 1;
                this.f12204b.d()[0] = -84;
                this.f12204b.d()[1] = (byte) (this.i ? 65 : 64);
                this.f12209g = 2;
            }
        }
    }

    public void b() {
    }
}
