package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.e.a;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.l.ag;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

final class u extends com.applovin.exoplayer2.e.a {

    private static final class a implements a.f {

        /* renamed from: a  reason: collision with root package name */
        private final ag f12356a;

        /* renamed from: b  reason: collision with root package name */
        private final y f12357b;

        private a(ag agVar) {
            this.f12356a = agVar;
            this.f12357b = new y();
        }

        private a.e a(y yVar, long j, long j2) {
            int i = -1;
            long j3 = -9223372036854775807L;
            int i2 = -1;
            while (yVar.a() >= 4) {
                if (u.b(yVar.d(), yVar.c()) != 442) {
                    yVar.e(1);
                } else {
                    yVar.e(4);
                    long a2 = v.a(yVar);
                    if (a2 != -9223372036854775807L) {
                        long b2 = this.f12356a.b(a2);
                        if (b2 > j) {
                            return j3 == -9223372036854775807L ? a.e.a(b2, j2) : a.e.a(j2 + ((long) i2));
                        }
                        if (100000 + b2 > j) {
                            return a.e.a(j2 + ((long) yVar.c()));
                        }
                        i2 = yVar.c();
                        j3 = b2;
                    }
                    a(yVar);
                    i = yVar.c();
                }
            }
            return j3 != -9223372036854775807L ? a.e.b(j3, j2 + ((long) i)) : a.e.f11830a;
        }

        private static void a(y yVar) {
            int b2 = yVar.b();
            if (yVar.a() < 10) {
                yVar.d(b2);
                return;
            }
            yVar.e(9);
            int h2 = yVar.h() & 7;
            if (yVar.a() < h2) {
                yVar.d(b2);
                return;
            }
            yVar.e(h2);
            if (yVar.a() < 4) {
                yVar.d(b2);
                return;
            }
            if (u.b(yVar.d(), yVar.c()) == 443) {
                yVar.e(4);
                int i = yVar.i();
                if (yVar.a() < i) {
                    yVar.d(b2);
                    return;
                }
                yVar.e(i);
            }
            while (yVar.a() >= 4 && (r1 = u.b(yVar.d(), yVar.c())) != 442 && r1 != 441 && (r1 >>> 8) == 1) {
                yVar.e(4);
                if (yVar.a() < 2) {
                    yVar.d(b2);
                    return;
                } else {
                    yVar.d(Math.min(yVar.b(), yVar.c() + yVar.i()));
                }
            }
        }

        public a.e a(i iVar, long j) throws IOException {
            long c2 = iVar.c();
            int min = (int) Math.min(20000, iVar.d() - c2);
            this.f12357b.a(min);
            iVar.d(this.f12357b.d(), 0, min);
            return a(this.f12357b, j, c2);
        }

        public void a() {
            this.f12357b.a(ai.f13530f);
        }
    }

    public u(ag agVar, long j, long j2) {
        super(new a.b(), new a(agVar), j, 0, j + 1, 0, j2, 188, 1000);
    }

    /* access modifiers changed from: private */
    public static int b(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << Ascii.CAN) | ((bArr[i + 1] & 255) << Ascii.DLE) | ((bArr[i + 2] & 255) << 8);
    }
}
