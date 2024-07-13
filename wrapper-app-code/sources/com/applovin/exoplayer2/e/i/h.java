package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.b.o;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.a;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import kotlin.KotlinVersion;

public final class h implements j {

    /* renamed from: a  reason: collision with root package name */
    private final y f12229a = new y(new byte[18]);

    /* renamed from: b  reason: collision with root package name */
    private final String f12230b;

    /* renamed from: c  reason: collision with root package name */
    private String f12231c;

    /* renamed from: d  reason: collision with root package name */
    private x f12232d;

    /* renamed from: e  reason: collision with root package name */
    private int f12233e = 0;

    /* renamed from: f  reason: collision with root package name */
    private int f12234f;

    /* renamed from: g  reason: collision with root package name */
    private int f12235g;

    /* renamed from: h  reason: collision with root package name */
    private long f12236h;
    private v i;
    private int j;
    private long k = -9223372036854775807L;

    public h(String str) {
        this.f12230b = str;
    }

    private boolean a(y yVar, byte[] bArr, int i2) {
        int min = Math.min(yVar.a(), i2 - this.f12234f);
        yVar.a(bArr, this.f12234f, min);
        int i3 = this.f12234f + min;
        this.f12234f = i3;
        return i3 == i2;
    }

    private boolean b(y yVar) {
        while (yVar.a() > 0) {
            int i2 = this.f12235g << 8;
            this.f12235g = i2;
            int h2 = i2 | yVar.h();
            this.f12235g = h2;
            if (o.a(h2)) {
                byte[] d2 = this.f12229a.d();
                int i3 = this.f12235g;
                d2[0] = (byte) ((i3 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[1] = (byte) ((i3 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[2] = (byte) ((i3 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                d2[3] = (byte) (i3 & KotlinVersion.MAX_COMPONENT_VALUE);
                this.f12234f = 4;
                this.f12235g = 0;
                return true;
            }
        }
        return false;
    }

    private void c() {
        byte[] d2 = this.f12229a.d();
        if (this.i == null) {
            v a2 = o.a(d2, this.f12231c, this.f12230b, (e) null);
            this.i = a2;
            this.f12232d.a(a2);
        }
        this.j = o.b(d2);
        this.f12236h = (long) ((int) ((((long) o.a(d2)) * 1000000) / ((long) this.i.z)));
    }

    public void a() {
        this.f12233e = 0;
        this.f12234f = 0;
        this.f12235g = 0;
        this.k = -9223372036854775807L;
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.k = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12231c = dVar.c();
        this.f12232d = jVar.a(dVar.b(), 1);
    }

    public void a(y yVar) {
        a.a(this.f12232d);
        while (yVar.a() > 0) {
            int i2 = this.f12233e;
            if (i2 != 0) {
                if (i2 != 1) {
                    if (i2 == 2) {
                        int min = Math.min(yVar.a(), this.j - this.f12234f);
                        this.f12232d.a(yVar, min);
                        int i3 = this.f12234f + min;
                        this.f12234f = i3;
                        int i4 = this.j;
                        if (i3 == i4) {
                            long j2 = this.k;
                            if (j2 != -9223372036854775807L) {
                                this.f12232d.a(j2, 1, i4, 0, (x.a) null);
                                this.k += this.f12236h;
                            }
                            this.f12233e = 0;
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                } else if (a(yVar, this.f12229a.d(), 18)) {
                    c();
                    this.f12229a.d(0);
                    this.f12232d.a(this.f12229a, 18);
                    this.f12233e = 2;
                }
            } else if (b(yVar)) {
                this.f12233e = 1;
            }
        }
    }

    public void b() {
    }
}
