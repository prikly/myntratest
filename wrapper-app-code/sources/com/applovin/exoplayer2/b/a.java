package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;

public final class a {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11188a = {96000, 88200, 64000, 48000, 44100, 32000, 24000, 22050, 16000, 12000, 11025, 8000, 7350};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11189b = {0, 1, 2, 3, 4, 5, 6, 8, -1, -1, -1, 7, 8, -1, 8, -1};

    /* renamed from: com.applovin.exoplayer2.b.a$a  reason: collision with other inner class name */
    public static final class C0106a {

        /* renamed from: a  reason: collision with root package name */
        public final int f11190a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11191b;

        /* renamed from: c  reason: collision with root package name */
        public final String f11192c;

        private C0106a(int i, int i2, String str) {
            this.f11190a = i;
            this.f11191b = i2;
            this.f11192c = str;
        }
    }

    private static int a(x xVar) {
        int c2 = xVar.c(5);
        return c2 == 31 ? xVar.c(6) + 32 : c2;
    }

    public static C0106a a(x xVar, boolean z) throws ai {
        int a2 = a(xVar);
        int b2 = b(xVar);
        int c2 = xVar.c(4);
        String str = "mp4a.40." + a2;
        if (a2 == 5 || a2 == 29) {
            b2 = b(xVar);
            a2 = a(xVar);
            if (a2 == 22) {
                c2 = xVar.c(4);
            }
        }
        if (z) {
            if (!(a2 == 1 || a2 == 2 || a2 == 3 || a2 == 4 || a2 == 6 || a2 == 7 || a2 == 17)) {
                switch (a2) {
                    case 19:
                    case 20:
                    case 21:
                    case 22:
                    case 23:
                        break;
                    default:
                        throw ai.a("Unsupported audio object type: " + a2);
                }
            }
            a(xVar, a2, c2);
            switch (a2) {
                case 17:
                case 19:
                case 20:
                case 21:
                case 22:
                case 23:
                    int c3 = xVar.c(2);
                    if (c3 == 2 || c3 == 3) {
                        throw ai.a("Unsupported epConfig: " + c3);
                    }
            }
        }
        int i = f11189b[c2];
        if (i != -1) {
            return new C0106a(b2, i, str);
        }
        throw ai.b((String) null, (Throwable) null);
    }

    public static C0106a a(byte[] bArr) throws ai {
        return a(new x(bArr), false);
    }

    private static void a(x xVar, int i, int i2) {
        if (xVar.e()) {
            q.c("AacUtil", "Unexpected frameLengthFlag = 1");
        }
        if (xVar.e()) {
            xVar.b(14);
        }
        boolean e2 = xVar.e();
        if (i2 != 0) {
            if (i == 6 || i == 20) {
                xVar.b(3);
            }
            if (e2) {
                if (i == 22) {
                    xVar.b(16);
                }
                if (i == 17 || i == 19 || i == 20 || i == 23) {
                    xVar.b(3);
                }
                xVar.b(1);
                return;
            }
            return;
        }
        throw new UnsupportedOperationException();
    }

    public static byte[] a(int i, int i2, int i3) {
        return new byte[]{(byte) (((i << 3) & 248) | ((i2 >> 1) & 7)), (byte) (((i2 << 7) & 128) | ((i3 << 3) & 120))};
    }

    private static int b(x xVar) throws ai {
        int c2 = xVar.c(4);
        if (c2 == 15) {
            return xVar.c(24);
        }
        if (c2 < 13) {
            return f11188a[c2];
        }
        throw ai.b((String) null, (Throwable) null);
    }
}
