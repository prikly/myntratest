package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.i.ad;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.l.z;
import com.applovin.exoplayer2.v;
import com.unity3d.services.core.device.MimeTypes;
import java.util.Collections;
import java.util.List;

public final class n implements j {

    /* renamed from: a  reason: collision with root package name */
    private final z f12302a;

    /* renamed from: b  reason: collision with root package name */
    private String f12303b;

    /* renamed from: c  reason: collision with root package name */
    private x f12304c;

    /* renamed from: d  reason: collision with root package name */
    private a f12305d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f12306e;

    /* renamed from: f  reason: collision with root package name */
    private final boolean[] f12307f = new boolean[3];

    /* renamed from: g  reason: collision with root package name */
    private final r f12308g = new r(32, 128);

    /* renamed from: h  reason: collision with root package name */
    private final r f12309h = new r(33, 128);
    private final r i = new r(34, 128);
    private final r j = new r(39, 128);
    private final r k = new r(40, 128);
    private long l;
    private long m = -9223372036854775807L;
    private final y n = new y();

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        private final x f12310a;

        /* renamed from: b  reason: collision with root package name */
        private long f12311b;

        /* renamed from: c  reason: collision with root package name */
        private boolean f12312c;

        /* renamed from: d  reason: collision with root package name */
        private int f12313d;

        /* renamed from: e  reason: collision with root package name */
        private long f12314e;

        /* renamed from: f  reason: collision with root package name */
        private boolean f12315f;

        /* renamed from: g  reason: collision with root package name */
        private boolean f12316g;

        /* renamed from: h  reason: collision with root package name */
        private boolean f12317h;
        private boolean i;
        private boolean j;
        private long k;
        private long l;
        private boolean m;

        public a(x xVar) {
            this.f12310a = xVar;
        }

        private void a(int i2) {
            long j2 = this.l;
            if (j2 != -9223372036854775807L) {
                boolean z = this.m;
                this.f12310a.a(j2, z ? 1 : 0, (int) (this.f12311b - this.k), i2, (x.a) null);
            }
        }

        private static boolean b(int i2) {
            return (32 <= i2 && i2 <= 35) || i2 == 39;
        }

        private static boolean c(int i2) {
            return i2 < 32 || i2 == 40;
        }

        public void a() {
            this.f12315f = false;
            this.f12316g = false;
            this.f12317h = false;
            this.i = false;
            this.j = false;
        }

        public void a(long j2, int i2, int i3, long j3, boolean z) {
            boolean z2 = false;
            this.f12316g = false;
            this.f12317h = false;
            this.f12314e = j3;
            this.f12313d = 0;
            this.f12311b = j2;
            if (!c(i3)) {
                if (this.i && !this.j) {
                    if (z) {
                        a(i2);
                    }
                    this.i = false;
                }
                if (b(i3)) {
                    this.f12317h = !this.j;
                    this.j = true;
                }
            }
            boolean z3 = i3 >= 16 && i3 <= 21;
            this.f12312c = z3;
            if (z3 || i3 <= 9) {
                z2 = true;
            }
            this.f12315f = z2;
        }

        public void a(long j2, int i2, boolean z) {
            if (this.j && this.f12316g) {
                this.m = this.f12312c;
                this.j = false;
            } else if (this.f12317h || this.f12316g) {
                if (z && this.i) {
                    a(i2 + ((int) (j2 - this.f12311b)));
                }
                this.k = this.f12311b;
                this.l = this.f12314e;
                this.m = this.f12312c;
                this.i = true;
            }
        }

        public void a(byte[] bArr, int i2, int i3) {
            if (this.f12315f) {
                int i4 = this.f12313d;
                int i5 = (i2 + 2) - i4;
                if (i5 < i3) {
                    this.f12316g = (bArr[i5] & 128) != 0;
                    this.f12315f = false;
                    return;
                }
                this.f12313d = i4 + (i3 - i2);
            }
        }
    }

    public n(z zVar) {
        this.f12302a = zVar;
    }

    private static v a(String str, r rVar, r rVar2, r rVar3) {
        r rVar4 = rVar;
        r rVar5 = rVar2;
        r rVar6 = rVar3;
        byte[] bArr = new byte[(rVar4.f12341b + rVar5.f12341b + rVar6.f12341b)];
        System.arraycopy(rVar4.f12340a, 0, bArr, 0, rVar4.f12341b);
        System.arraycopy(rVar5.f12340a, 0, bArr, rVar4.f12341b, rVar5.f12341b);
        System.arraycopy(rVar6.f12340a, 0, bArr, rVar4.f12341b + rVar5.f12341b, rVar6.f12341b);
        z zVar = new z(rVar5.f12340a, 0, rVar5.f12341b);
        zVar.a(44);
        int c2 = zVar.c(3);
        zVar.a();
        zVar.a(88);
        zVar.a(8);
        int i2 = 0;
        for (int i3 = 0; i3 < c2; i3++) {
            if (zVar.b()) {
                i2 += 89;
            }
            if (zVar.b()) {
                i2 += 8;
            }
        }
        zVar.a(i2);
        if (c2 > 0) {
            zVar.a((8 - c2) * 2);
        }
        zVar.d();
        int d2 = zVar.d();
        if (d2 == 3) {
            zVar.a();
        }
        int d3 = zVar.d();
        int d4 = zVar.d();
        if (zVar.b()) {
            int d5 = zVar.d();
            int d6 = zVar.d();
            int d7 = zVar.d();
            int d8 = zVar.d();
            d3 -= ((d2 == 1 || d2 == 2) ? 2 : 1) * (d5 + d6);
            d4 -= (d2 == 1 ? 2 : 1) * (d7 + d8);
        }
        zVar.d();
        zVar.d();
        int d9 = zVar.d();
        int i4 = zVar.b() ? 0 : c2;
        while (true) {
            zVar.d();
            zVar.d();
            zVar.d();
            if (i4 > c2) {
                break;
            }
            i4++;
        }
        zVar.d();
        zVar.d();
        zVar.d();
        if (zVar.b() && zVar.b()) {
            a(zVar);
        }
        zVar.a(2);
        if (zVar.b()) {
            zVar.a(8);
            zVar.d();
            zVar.d();
            zVar.a();
        }
        b(zVar);
        if (zVar.b()) {
            for (int i5 = 0; i5 < zVar.d(); i5++) {
                zVar.a(d9 + 4 + 1);
            }
        }
        zVar.a(2);
        float f2 = 1.0f;
        if (zVar.b()) {
            if (zVar.b()) {
                int c3 = zVar.c(8);
                if (c3 == 255) {
                    int c4 = zVar.c(16);
                    int c5 = zVar.c(16);
                    if (!(c4 == 0 || c5 == 0)) {
                        f2 = ((float) c4) / ((float) c5);
                    }
                } else if (c3 < com.applovin.exoplayer2.l.v.f13582b.length) {
                    f2 = com.applovin.exoplayer2.l.v.f13582b[c3];
                } else {
                    q.c("H265Reader", "Unexpected aspect_ratio_idc value: " + c3);
                }
            }
            if (zVar.b()) {
                zVar.a();
            }
            if (zVar.b()) {
                zVar.a(4);
                if (zVar.b()) {
                    zVar.a(24);
                }
            }
            if (zVar.b()) {
                zVar.d();
                zVar.d();
            }
            zVar.a();
            if (zVar.b()) {
                d4 *= 2;
            }
        }
        zVar.a(rVar5.f12340a, 0, rVar5.f12341b);
        zVar.a(24);
        return new v.a().a(str).f(MimeTypes.VIDEO_H265).d(e.a(zVar)).g(d3).h(d4).b(f2).a((List<byte[]>) Collections.singletonList(bArr)).a();
    }

    private void a(long j2, int i2, int i3, long j3) {
        this.f12305d.a(j2, i2, i3, j3, this.f12306e);
        if (!this.f12306e) {
            this.f12308g.a(i3);
            this.f12309h.a(i3);
            this.i.a(i3);
        }
        this.j.a(i3);
        this.k.a(i3);
    }

    private static void a(z zVar) {
        for (int i2 = 0; i2 < 4; i2++) {
            int i3 = 0;
            while (i3 < 6) {
                int i4 = 1;
                if (!zVar.b()) {
                    zVar.d();
                } else {
                    int min = Math.min(64, 1 << ((i2 << 1) + 4));
                    if (i2 > 1) {
                        zVar.e();
                    }
                    for (int i5 = 0; i5 < min; i5++) {
                        zVar.e();
                    }
                }
                if (i2 == 3) {
                    i4 = 3;
                }
                i3 += i4;
            }
        }
    }

    private void a(byte[] bArr, int i2, int i3) {
        this.f12305d.a(bArr, i2, i3);
        if (!this.f12306e) {
            this.f12308g.a(bArr, i2, i3);
            this.f12309h.a(bArr, i2, i3);
            this.i.a(bArr, i2, i3);
        }
        this.j.a(bArr, i2, i3);
        this.k.a(bArr, i2, i3);
    }

    private void b(long j2, int i2, int i3, long j3) {
        this.f12305d.a(j2, i2, this.f12306e);
        if (!this.f12306e) {
            this.f12308g.b(i3);
            this.f12309h.b(i3);
            this.i.b(i3);
            if (this.f12308g.b() && this.f12309h.b() && this.i.b()) {
                this.f12304c.a(a(this.f12303b, this.f12308g, this.f12309h, this.i));
                this.f12306e = true;
            }
        }
        if (this.j.b(i3)) {
            this.n.a(this.j.f12340a, com.applovin.exoplayer2.l.v.a(this.j.f12340a, this.j.f12341b));
            this.n.e(5);
            this.f12302a.a(j3, this.n);
        }
        if (this.k.b(i3)) {
            this.n.a(this.k.f12340a, com.applovin.exoplayer2.l.v.a(this.k.f12340a, this.k.f12341b));
            this.n.e(5);
            this.f12302a.a(j3, this.n);
        }
    }

    private static void b(z zVar) {
        int d2 = zVar.d();
        boolean z = false;
        int i2 = 0;
        for (int i3 = 0; i3 < d2; i3++) {
            if (i3 != 0) {
                z = zVar.b();
            }
            if (z) {
                zVar.a();
                zVar.d();
                for (int i4 = 0; i4 <= i2; i4++) {
                    if (zVar.b()) {
                        zVar.a();
                    }
                }
            } else {
                int d3 = zVar.d();
                int d4 = zVar.d();
                int i5 = d3 + d4;
                for (int i6 = 0; i6 < d3; i6++) {
                    zVar.d();
                    zVar.a();
                }
                for (int i7 = 0; i7 < d4; i7++) {
                    zVar.d();
                    zVar.a();
                }
                i2 = i5;
            }
        }
    }

    private void c() {
        com.applovin.exoplayer2.l.a.a(this.f12304c);
        ai.a(this.f12305d);
    }

    public void a() {
        this.l = 0;
        this.m = -9223372036854775807L;
        com.applovin.exoplayer2.l.v.a(this.f12307f);
        this.f12308g.a();
        this.f12309h.a();
        this.i.a();
        this.j.a();
        this.k.a();
        a aVar = this.f12305d;
        if (aVar != null) {
            aVar.a();
        }
    }

    public void a(long j2, int i2) {
        if (j2 != -9223372036854775807L) {
            this.m = j2;
        }
    }

    public void a(j jVar, ad.d dVar) {
        dVar.a();
        this.f12303b = dVar.c();
        x a2 = jVar.a(dVar.b(), 2);
        this.f12304c = a2;
        this.f12305d = new a(a2);
        this.f12302a.a(jVar, dVar);
    }

    public void a(y yVar) {
        c();
        while (yVar.a() > 0) {
            int c2 = yVar.c();
            int b2 = yVar.b();
            byte[] d2 = yVar.d();
            this.l += (long) yVar.a();
            this.f12304c.a(yVar, yVar.a());
            while (true) {
                if (c2 < b2) {
                    int a2 = com.applovin.exoplayer2.l.v.a(d2, c2, b2, this.f12307f);
                    if (a2 == b2) {
                        a(d2, c2, b2);
                        return;
                    }
                    int c3 = com.applovin.exoplayer2.l.v.c(d2, a2);
                    int i2 = a2 - c2;
                    if (i2 > 0) {
                        a(d2, c2, a2);
                    }
                    int i3 = b2 - a2;
                    long j2 = this.l - ((long) i3);
                    int i4 = i2 < 0 ? -i2 : 0;
                    long j3 = j2;
                    int i5 = i3;
                    b(j3, i5, i4, this.m);
                    a(j3, i5, c3, this.m);
                    c2 = a2 + 3;
                }
            }
        }
    }

    public void b() {
    }
}
