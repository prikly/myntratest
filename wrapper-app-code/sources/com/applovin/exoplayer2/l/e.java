package com.applovin.exoplayer2.l;

import android.util.Pair;
import java.util.Collections;
import java.util.List;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    private static final byte[] f13535a = {0, 0, 0, 1};

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f13536b = {"", "A", "B", "C"};

    public static Pair<Integer, Integer> a(byte[] bArr) {
        y yVar = new y(bArr);
        yVar.d(9);
        int h2 = yVar.h();
        yVar.d(20);
        return Pair.create(Integer.valueOf(yVar.w()), Integer.valueOf(h2));
    }

    public static String a(int i, int i2, int i3) {
        return String.format("avc1.%02X%02X%02X", new Object[]{Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3)});
    }

    public static String a(z zVar) {
        zVar.a(24);
        int c2 = zVar.c(2);
        boolean b2 = zVar.b();
        int c3 = zVar.c(5);
        int i = 0;
        for (int i2 = 0; i2 < 32; i2++) {
            if (zVar.b()) {
                i |= 1 << i2;
            }
        }
        int i3 = 6;
        int[] iArr = new int[6];
        for (int i4 = 0; i4 < 6; i4++) {
            iArr[i4] = zVar.c(8);
        }
        int c4 = zVar.c(8);
        Object[] objArr = new Object[5];
        objArr[0] = f13536b[c2];
        objArr[1] = Integer.valueOf(c3);
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Character.valueOf(b2 ? 'H' : 'L');
        objArr[4] = Integer.valueOf(c4);
        StringBuilder sb = new StringBuilder(ai.a("hvc1.%s%d.%X.%c%d", objArr));
        while (i3 > 0 && iArr[i3 - 1] == 0) {
            i3--;
        }
        for (int i5 = 0; i5 < i3; i5++) {
            sb.append(String.format(".%02X", new Object[]{Integer.valueOf(iArr[i5])}));
        }
        return sb.toString();
    }

    public static List<byte[]> a(boolean z) {
        return Collections.singletonList(z ? new byte[]{1} : new byte[]{0});
    }

    public static boolean a(List<byte[]> list) {
        return list.size() == 1 && list.get(0).length == 1 && list.get(0)[0] == 1;
    }

    public static byte[] a(byte[] bArr, int i, int i2) {
        byte[] bArr2 = f13535a;
        byte[] bArr3 = new byte[(bArr2.length + i2)];
        System.arraycopy(bArr2, 0, bArr3, 0, bArr2.length);
        System.arraycopy(bArr, i, bArr3, f13535a.length, i2);
        return bArr3;
    }
}
