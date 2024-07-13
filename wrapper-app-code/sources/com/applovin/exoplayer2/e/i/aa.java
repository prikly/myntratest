package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class aa extends com.applovin.exoplayer2.e.a {

    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ag f12150a;

        /* renamed from: b  reason: collision with root package name */
        private final y f12151b = new y();

        /* renamed from: c  reason: collision with root package name */
        private final int f12152c;

        /* renamed from: d  reason: collision with root package name */
        private final int f12153d;

        public a(int i, ag agVar, int i2) {
            this.f12152c = i;
            this.f12150a = agVar;
            this.f12153d = i2;
        }

        private a.e a(y yVar, long j, long j2) {
            int a2;
            int i;
            y yVar2 = yVar;
            long j3 = j2;
            int b2 = yVar.b();
            long j4 = -1;
            long j5 = -1;
            long j6 = -9223372036854775807L;
            while (yVar.a() >= 188 && (i = a2 + 188) <= b2) {
                long a3 = ae.a(yVar2, (a2 = ae.a(yVar.d(), yVar.c(), b2)), this.f12152c);
                if (a3 != -9223372036854775807L) {
                    long b3 = this.f12150a.b(a3);
                    if (b3 > j) {
                        return j6 == -9223372036854775807L ? a.e.a(b3, j3) : a.e.a(j3 + j5);
                    }
                    if (100000 + b3 > j) {
                        return a.e.a(j3 + ((long) a2));
                    }
                    j5 = (long) a2;
                    j6 = b3;
                }
                yVar2.d(i);
                j4 = (long) i;
            }
            return j6 != -9223372036854775807L ? a.e.b(j6, j3 + j4) : a.e.f11830a;
        }

        public a.e a(i iVar, long j) throws IOException {
            long c2 = iVar.c();
            int min = (int) Math.min((long) this.f12153d, iVar.d() - c2);
            this.f12151b.a(min);
            iVar.d(this.f12151b.d(), 0, min);
            return a(this.f12151b, j, c2);
        }

        public void a() {
            this.f12151b.a(ai.f13530f);
        }
    }

    /* JADX WARNING: Illegal instructions before constructor call */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public aa(com.applovin.exoplayer2.l.ag r17, long r18, long r20, int r22, int r23) {
        /*
            r16 = this;
            com.applovin.exoplayer2.e.a$b r1 = new com.applovin.exoplayer2.e.a$b
            r1.<init>()
            com.applovin.exoplayer2.e.i.aa$a r2 = new com.applovin.exoplayer2.e.i.aa$a
            r0 = r17
            r3 = r22
            r4 = r23
            r2.<init>(r3, r0, r4)
            r3 = 1
            long r7 = r18 + r3
            r5 = 0
            r9 = 0
            r13 = 188(0xbc, double:9.3E-322)
            r15 = 940(0x3ac, float:1.317E-42)
            r0 = r16
            r3 = r18
            r11 = r20
            r0.<init>(r1, r2, r3, r5, r7, r9, r11, r13, r15)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.i.aa.<init>(com.applovin.exoplayer2.l.ag, long, long, int, int):void");
    }
}
