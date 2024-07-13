package com.applovin.exoplayer2.e.h;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.h.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.n;
import com.applovin.exoplayer2.e.o;
import com.applovin.exoplayer2.e.p;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.util.Arrays;

final class b extends h {

    /* renamed from: a  reason: collision with root package name */
    private p f12101a;

    /* renamed from: b  reason: collision with root package name */
    private a f12102b;

    private static final class a implements f {

        /* renamed from: a  reason: collision with root package name */
        private p f12103a;

        /* renamed from: b  reason: collision with root package name */
        private p.a f12104b;

        /* renamed from: c  reason: collision with root package name */
        private long f12105c = -1;

        /* renamed from: d  reason: collision with root package name */
        private long f12106d = -1;

        public a(p pVar, p.a aVar) {
            this.f12103a = pVar;
            this.f12104b = aVar;
        }

        public long a(i iVar) {
            long j = this.f12106d;
            if (j < 0) {
                return -1;
            }
            long j2 = -(j + 2);
            this.f12106d = -1;
            return j2;
        }

        public void a(long j) {
            long[] jArr = this.f12104b.f12440a;
            this.f12106d = jArr[ai.a(jArr, j, true, true)];
        }

        public v b() {
            com.applovin.exoplayer2.l.a.b(this.f12105c != -1);
            return new o(this.f12103a, this.f12105c);
        }

        public void b(long j) {
            this.f12105c = j;
        }
    }

    b() {
    }

    public static boolean a(y yVar) {
        return yVar.a() >= 5 && yVar.h() == 127 && yVar.o() == 1179402563;
    }

    private static boolean a(byte[] bArr) {
        return bArr[0] == -1;
    }

    private int c(y yVar) {
        int i = (yVar.d()[2] & 255) >> 4;
        if (i == 6 || i == 7) {
            yVar.e(4);
            yVar.D();
        }
        int a2 = m.a(yVar, i);
        yVar.d(0);
        return a2;
    }

    /* access modifiers changed from: protected */
    public void a(boolean z) {
        super.a(z);
        if (z) {
            this.f12101a = null;
            this.f12102b = null;
        }
    }

    /* access modifiers changed from: protected */
    public boolean a(y yVar, long j, h.a aVar) {
        byte[] d2 = yVar.d();
        p pVar = this.f12101a;
        if (pVar == null) {
            p pVar2 = new p(d2, 17);
            this.f12101a = pVar2;
            aVar.f12134a = pVar2.a(Arrays.copyOfRange(d2, 9, yVar.b()), (com.applovin.exoplayer2.g.a) null);
            return true;
        } else if ((d2[0] & Ascii.DEL) == 3) {
            p.a a2 = n.a(yVar);
            p a3 = pVar.a(a2);
            this.f12101a = a3;
            this.f12102b = new a(a3, a2);
            return true;
        } else if (!a(d2)) {
            return true;
        } else {
            a aVar2 = this.f12102b;
            if (aVar2 != null) {
                aVar2.b(j);
                aVar.f12135b = this.f12102b;
            }
            com.applovin.exoplayer2.l.a.b(aVar.f12134a);
            return false;
        }
    }

    /* access modifiers changed from: protected */
    public long b(y yVar) {
        if (!a(yVar.d())) {
            return -1;
        }
        return (long) c(yVar);
    }
}
