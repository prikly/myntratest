package com.applovin.exoplayer2.e;

import com.applovin.exoplayer2.ai;
import com.applovin.exoplayer2.l.y;
import java.io.IOException;

public final class m {

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public long f12428a;
    }

    public static int a(y yVar, int i) {
        switch (i) {
            case 1:
                return 192;
            case 2:
            case 3:
            case 4:
            case 5:
                return 576 << (i - 2);
            case 6:
                return yVar.h() + 1;
            case 7:
                return yVar.i() + 1;
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return 256 << (i - 8);
            default:
                return -1;
        }
    }

    public static long a(i iVar, p pVar) throws IOException {
        iVar.a();
        boolean z = true;
        iVar.c(1);
        byte[] bArr = new byte[1];
        iVar.d(bArr, 0, 1);
        if ((bArr[0] & 1) != 1) {
            z = false;
        }
        iVar.c(2);
        int i = z ? 7 : 6;
        y yVar = new y(i);
        yVar.c(k.a(iVar, yVar.d(), 0, i));
        iVar.a();
        a aVar = new a();
        if (a(yVar, pVar, z, aVar)) {
            return aVar.f12428a;
        }
        throw ai.b((String) null, (Throwable) null);
    }

    private static boolean a(int i, p pVar) {
        return i <= 7 ? i == pVar.f12438g - 1 : i <= 10 && pVar.f12438g == 2;
    }

    public static boolean a(i iVar, p pVar, int i, a aVar) throws IOException {
        long b2 = iVar.b();
        byte[] bArr = new byte[2];
        iVar.d(bArr, 0, 2);
        if ((((bArr[0] & 255) << 8) | (bArr[1] & 255)) != i) {
            iVar.a();
            iVar.c((int) (b2 - iVar.c()));
            return false;
        }
        y yVar = new y(16);
        System.arraycopy(bArr, 0, yVar.d(), 0, 2);
        yVar.c(k.a(iVar, yVar.d(), 2, 14));
        iVar.a();
        iVar.c((int) (b2 - iVar.c()));
        return a(yVar, pVar, i, aVar);
    }

    private static boolean a(y yVar, p pVar, int i) {
        int a2 = a(yVar, i);
        return a2 != -1 && a2 <= pVar.f12433b;
    }

    public static boolean a(y yVar, p pVar, int i, a aVar) {
        y yVar2 = yVar;
        p pVar2 = pVar;
        int c2 = yVar.c();
        long o = yVar.o();
        long j = o >>> 16;
        if (j != ((long) i)) {
            return false;
        }
        return a((int) (15 & (o >> 4)), pVar2) && b((int) ((o >> 1) & 7), pVar2) && !(((o & 1) > 1 ? 1 : ((o & 1) == 1 ? 0 : -1)) == 0) && a(yVar2, pVar2, ((j & 1) > 1 ? 1 : ((j & 1) == 1 ? 0 : -1)) == 0, aVar) && a(yVar2, pVar2, (int) ((o >> 12) & 15)) && b(yVar2, pVar2, (int) ((o >> 8) & 15)) && b(yVar2, c2);
    }

    private static boolean a(y yVar, p pVar, boolean z, a aVar) {
        try {
            long D = yVar.D();
            if (!z) {
                D *= (long) pVar.f12433b;
            }
            aVar.f12428a = D;
            return true;
        } catch (NumberFormatException unused) {
            return false;
        }
    }

    private static boolean b(int i, p pVar) {
        return i == 0 || i == pVar.i;
    }

    private static boolean b(y yVar, int i) {
        return yVar.h() == com.applovin.exoplayer2.l.ai.b(yVar.d(), i, yVar.c() - 1, 0);
    }

    private static boolean b(y yVar, p pVar, int i) {
        int i2 = pVar.f12436e;
        if (i == 0) {
            return true;
        }
        if (i <= 11) {
            return i == pVar.f12437f;
        }
        if (i == 12) {
            return yVar.h() * 1000 == i2;
        }
        if (i > 14) {
            return false;
        }
        int i3 = yVar.i();
        if (i == 14) {
            i3 *= 10;
        }
        return i3 == i2;
    }
}
