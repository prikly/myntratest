package com.applovin.exoplayer2.h;

import com.applovin.exoplayer2.c.c;
import com.applovin.exoplayer2.c.g;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.h.w;
import com.applovin.exoplayer2.k.b;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

class v {

    /* renamed from: a  reason: collision with root package name */
    private final b f12879a;

    /* renamed from: b  reason: collision with root package name */
    private final int f12880b;

    /* renamed from: c  reason: collision with root package name */
    private final y f12881c = new y(32);

    /* renamed from: d  reason: collision with root package name */
    private a f12882d;

    /* renamed from: e  reason: collision with root package name */
    private a f12883e;

    /* renamed from: f  reason: collision with root package name */
    private a f12884f;

    /* renamed from: g  reason: collision with root package name */
    private long f12885g;

    private static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final long f12886a;

        /* renamed from: b  reason: collision with root package name */
        public final long f12887b;

        /* renamed from: c  reason: collision with root package name */
        public boolean f12888c;

        /* renamed from: d  reason: collision with root package name */
        public com.applovin.exoplayer2.k.a f12889d;

        /* renamed from: e  reason: collision with root package name */
        public a f12890e;

        public a(long j, int i) {
            this.f12886a = j;
            this.f12887b = j + ((long) i);
        }

        public int a(long j) {
            return ((int) (j - this.f12886a)) + this.f12889d.f13331b;
        }

        public a a() {
            this.f12889d = null;
            a aVar = this.f12890e;
            this.f12890e = null;
            return aVar;
        }

        public void a(com.applovin.exoplayer2.k.a aVar, a aVar2) {
            this.f12889d = aVar;
            this.f12890e = aVar2;
            this.f12888c = true;
        }
    }

    public v(b bVar) {
        this.f12879a = bVar;
        this.f12880b = bVar.c();
        a aVar = new a(0, this.f12880b);
        this.f12882d = aVar;
        this.f12883e = aVar;
        this.f12884f = aVar;
    }

    private int a(int i) {
        if (!this.f12884f.f12888c) {
            this.f12884f.a(this.f12879a.a(), new a(this.f12884f.f12887b, this.f12880b));
        }
        return Math.min(i, (int) (this.f12884f.f12887b - this.f12885g));
    }

    private static a a(a aVar, long j) {
        while (j >= aVar.f12887b) {
            aVar = aVar.f12890e;
        }
        return aVar;
    }

    private static a a(a aVar, long j, ByteBuffer byteBuffer, int i) {
        a a2 = a(aVar, j);
        while (i > 0) {
            int min = Math.min(i, (int) (a2.f12887b - j));
            byteBuffer.put(a2.f12889d.f13330a, a2.a(j), min);
            i -= min;
            j += (long) min;
            if (j == a2.f12887b) {
                a2 = a2.f12890e;
            }
        }
        return a2;
    }

    private static a a(a aVar, long j, byte[] bArr, int i) {
        a a2 = a(aVar, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (a2.f12887b - j));
            System.arraycopy(a2.f12889d.f13330a, a2.a(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == a2.f12887b) {
                a2 = a2.f12890e;
            }
        }
        return a2;
    }

    private static a a(a aVar, g gVar, w.a aVar2, y yVar) {
        ByteBuffer byteBuffer;
        long j;
        if (gVar.g()) {
            aVar = b(aVar, gVar, aVar2, yVar);
        }
        if (gVar.e()) {
            yVar.a(4);
            a a2 = a(aVar, aVar2.f12900b, yVar.d(), 4);
            int w = yVar.w();
            aVar2.f12900b += 4;
            aVar2.f12899a -= 4;
            gVar.f(w);
            aVar = a(a2, aVar2.f12900b, gVar.f11419b, w);
            aVar2.f12900b += (long) w;
            aVar2.f12899a -= w;
            gVar.e(aVar2.f12899a);
            j = aVar2.f12900b;
            byteBuffer = gVar.f11422e;
        } else {
            gVar.f(aVar2.f12899a);
            j = aVar2.f12900b;
            byteBuffer = gVar.f11419b;
        }
        return a(aVar, j, byteBuffer, aVar2.f12899a);
    }

    private void a(a aVar) {
        if (aVar.f12888c) {
            int i = (this.f12884f.f12888c ? 1 : 0) + (((int) (this.f12884f.f12886a - aVar.f12886a)) / this.f12880b);
            com.applovin.exoplayer2.k.a[] aVarArr = new com.applovin.exoplayer2.k.a[i];
            for (int i2 = 0; i2 < i; i2++) {
                aVarArr[i2] = aVar.f12889d;
                aVar = aVar.a();
            }
            this.f12879a.a(aVarArr);
        }
    }

    private static a b(a aVar, g gVar, w.a aVar2, y yVar) {
        int i;
        w.a aVar3 = aVar2;
        y yVar2 = yVar;
        long j = aVar3.f12900b;
        yVar2.a(1);
        a a2 = a(aVar, j, yVar.d(), 1);
        long j2 = j + 1;
        byte b2 = yVar.d()[0];
        boolean z = (b2 & 128) != 0;
        byte b3 = b2 & Ascii.DEL;
        c cVar = gVar.f11418a;
        if (cVar.f11400a == null) {
            cVar.f11400a = new byte[16];
        } else {
            Arrays.fill(cVar.f11400a, (byte) 0);
        }
        a a3 = a(a2, j2, cVar.f11400a, (int) b3);
        long j3 = j2 + ((long) b3);
        if (z) {
            yVar2.a(2);
            a3 = a(a3, j3, yVar.d(), 2);
            j3 += 2;
            i = yVar.i();
        } else {
            i = 1;
        }
        int[] iArr = cVar.f11403d;
        if (iArr == null || iArr.length < i) {
            iArr = new int[i];
        }
        int[] iArr2 = iArr;
        int[] iArr3 = cVar.f11404e;
        if (iArr3 == null || iArr3.length < i) {
            iArr3 = new int[i];
        }
        int[] iArr4 = iArr3;
        if (z) {
            int i2 = i * 6;
            yVar2.a(i2);
            a3 = a(a3, j3, yVar.d(), i2);
            j3 += (long) i2;
            yVar2.d(0);
            for (int i3 = 0; i3 < i; i3++) {
                iArr2[i3] = yVar.i();
                iArr4[i3] = yVar.w();
            }
        } else {
            iArr2[0] = 0;
            iArr4[0] = aVar3.f12899a - ((int) (j3 - aVar3.f12900b));
        }
        x.a aVar4 = (x.a) ai.a(aVar3.f12901c);
        cVar.a(i, iArr2, iArr4, aVar4.f12460b, cVar.f11400a, aVar4.f12459a, aVar4.f12461c, aVar4.f12462d);
        int i4 = (int) (j3 - aVar3.f12900b);
        aVar3.f12900b += (long) i4;
        aVar3.f12899a -= i4;
        return a3;
    }

    private void b(int i) {
        long j = this.f12885g + ((long) i);
        this.f12885g = j;
        if (j == this.f12884f.f12887b) {
            this.f12884f = this.f12884f.f12890e;
        }
    }

    public int a(com.applovin.exoplayer2.k.g gVar, int i, boolean z) throws IOException {
        int a2 = gVar.a(this.f12884f.f12889d.f13330a, this.f12884f.a(this.f12885g), a(i));
        if (a2 != -1) {
            b(a2);
            return a2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public void a() {
        a(this.f12882d);
        a aVar = new a(0, this.f12880b);
        this.f12882d = aVar;
        this.f12883e = aVar;
        this.f12884f = aVar;
        this.f12885g = 0;
        this.f12879a.b();
    }

    public void a(long j) {
        if (j != -1) {
            while (j >= this.f12882d.f12887b) {
                this.f12879a.a(this.f12882d.f12889d);
                this.f12882d = this.f12882d.a();
            }
            if (this.f12883e.f12886a < this.f12882d.f12886a) {
                this.f12883e = this.f12882d;
            }
        }
    }

    public void a(g gVar, w.a aVar) {
        this.f12883e = a(this.f12883e, gVar, aVar, this.f12881c);
    }

    public void a(y yVar, int i) {
        while (i > 0) {
            int a2 = a(i);
            yVar.a(this.f12884f.f12889d.f13330a, this.f12884f.a(this.f12885g), a2);
            i -= a2;
            b(a2);
        }
    }

    public void b() {
        this.f12883e = this.f12882d;
    }

    public void b(g gVar, w.a aVar) {
        a(this.f12883e, gVar, aVar, this.f12881c);
    }

    public long c() {
        return this.f12885g;
    }
}
