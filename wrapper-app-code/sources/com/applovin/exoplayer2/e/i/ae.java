package com.applovin.exoplayer2.e.i;

import com.applovin.exoplayer2.l.y;

public final class ae {
    public static int a(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long a(y yVar, int i, int i2) {
        yVar.d(i);
        if (yVar.a() < 5) {
            return -9223372036854775807L;
        }
        int q = yVar.q();
        if ((8388608 & q) != 0 || ((2096896 & q) >> 8) != i2) {
            return -9223372036854775807L;
        }
        boolean z = true;
        if (((q & 32) != 0) && yVar.h() >= 7 && yVar.a() >= 7) {
            if ((yVar.h() & 16) != 16) {
                z = false;
            }
            if (z) {
                byte[] bArr = new byte[6];
                yVar.a(bArr, 0, 6);
                return a(bArr);
            }
        }
        return -9223372036854775807L;
    }

    private static long a(byte[] bArr) {
        return ((((long) bArr[0]) & 255) << 25) | ((((long) bArr[1]) & 255) << 17) | ((((long) bArr[2]) & 255) << 9) | ((((long) bArr[3]) & 255) << 1) | ((255 & ((long) bArr[4])) >> 7);
    }

    public static boolean a(byte[] bArr, int i, int i2, int i3) {
        int i4 = 0;
        for (int i5 = -4; i5 <= 4; i5++) {
            int i6 = (i5 * 188) + i3;
            if (i6 < i || i6 >= i2 || bArr[i6] != 71) {
                i4 = 0;
            } else {
                i4++;
                if (i4 == 5) {
                    return true;
                }
            }
        }
        return false;
    }
}
