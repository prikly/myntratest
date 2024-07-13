package com.applovin.exoplayer2.e.b;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.m;
import com.applovin.exoplayer2.e.p;
import java.io.IOException;

final class a extends com.applovin.exoplayer2.e.a {

    /* renamed from: com.applovin.exoplayer2.e.b.a$a  reason: collision with other inner class name */
    private static final class C0114a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final p f11834a;

        /* renamed from: b  reason: collision with root package name */
        private final int f11835b;

        /* renamed from: c  reason: collision with root package name */
        private final m.a f11836c;

        private C0114a(p pVar, int i) {
            this.f11834a = pVar;
            this.f11835b = i;
            this.f11836c = new m.a();
        }

        private long a(i iVar) throws IOException {
            while (iVar.b() < iVar.d() - 6 && !m.a(iVar, this.f11834a, this.f11835b, this.f11836c)) {
                iVar.c(1);
            }
            if (iVar.b() < iVar.d() - 6) {
                return this.f11836c.f12428a;
            }
            iVar.c((int) (iVar.d() - iVar.b()));
            return this.f11834a.j;
        }

        public a.e a(i iVar, long j) throws IOException {
            long c2 = iVar.c();
            long a2 = a(iVar);
            long b2 = iVar.b();
            iVar.c(Math.max(6, this.f11834a.f12434c));
            long a3 = a(iVar);
            return (a2 > j || a3 <= j) ? a3 <= j ? a.e.b(a3, iVar.b()) : a.e.a(a2, c2) : a.e.a(b2);
        }

        public /* synthetic */ void a() {
            a.f.CC.$default$a(this);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public a(com.applovin.exoplayer2.e.p r17, int r18, long r19, long r21) {
        /*
            r16 = this;
            r0 = r17
            java.util.Objects.requireNonNull(r17)
            com.applovin.exoplayer2.e.b.-$$Lambda$j8d1aKHw5rH2C1JuYHZWhX0kWts r1 = new com.applovin.exoplayer2.e.b.-$$Lambda$j8d1aKHw5rH2C1JuYHZWhX0kWts
            r1.<init>()
            com.applovin.exoplayer2.e.b.a$a r2 = new com.applovin.exoplayer2.e.b.a$a
            r3 = 0
            r4 = r18
            r2.<init>(r0, r4)
            long r3 = r17.a()
            long r7 = r0.j
            long r13 = r17.b()
            int r0 = r0.f12434c
            r5 = 6
            int r15 = java.lang.Math.max(r5, r0)
            r5 = 0
            r0 = r16
            r9 = r19
            r11 = r21
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.b.a.<init>(com.applovin.exoplayer2.e.p, int, long, long):void");
    }
}
