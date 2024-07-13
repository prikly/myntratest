package com.applovin.exoplayer2.m.a;

import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.m.a.e;
import java.util.ArrayList;
import java.util.zip.Inflater;

final class f {
    private static int a(int i) {
        return (-(i & 1)) ^ (i >> 1);
    }

    public static e a(byte[] bArr, int i) {
        ArrayList<e.a> arrayList;
        y yVar = new y(bArr);
        try {
            arrayList = a(yVar) ? b(yVar) : c(yVar);
        } catch (ArrayIndexOutOfBoundsException unused) {
            arrayList = null;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        if (size == 1) {
            return new e(arrayList.get(0), i);
        }
        if (size != 2) {
            return null;
        }
        return new e(arrayList.get(0), arrayList.get(1), i);
    }

    private static boolean a(y yVar) {
        yVar.e(4);
        int q = yVar.q();
        yVar.d(0);
        return q == 1886547818;
    }

    private static ArrayList<e.a> b(y yVar) {
        int q;
        yVar.e(8);
        int c2 = yVar.c();
        int b2 = yVar.b();
        while (c2 < b2 && (q = yVar.q() + c2) > c2 && q <= b2) {
            int q2 = yVar.q();
            if (q2 == 2037673328 || q2 == 1836279920) {
                yVar.c(q);
                return c(yVar);
            }
            yVar.d(q);
            c2 = q;
        }
        return null;
    }

    private static ArrayList<e.a> c(y yVar) {
        if (yVar.h() != 0) {
            return null;
        }
        yVar.e(7);
        int q = yVar.q();
        if (q == 1684433976) {
            y yVar2 = new y();
            Inflater inflater = new Inflater(true);
            try {
                if (!ai.a(yVar, yVar2, inflater)) {
                    return null;
                }
                yVar = yVar2;
            } finally {
                inflater.end();
            }
        } else if (q != 1918990112) {
            return null;
        }
        return d(yVar);
    }

    private static ArrayList<e.a> d(y yVar) {
        ArrayList<e.a> arrayList = new ArrayList<>();
        int c2 = yVar.c();
        int b2 = yVar.b();
        while (c2 < b2) {
            int q = yVar.q() + c2;
            if (q <= c2 || q > b2) {
                return null;
            }
            if (yVar.q() == 1835365224) {
                e.a e2 = e(yVar);
                if (e2 == null) {
                    return null;
                }
                arrayList.add(e2);
            }
            yVar.d(q);
            c2 = q;
        }
        return arrayList;
    }

    private static e.a e(y yVar) {
        int q = yVar.q();
        if (q > 10000) {
            return null;
        }
        float[] fArr = new float[q];
        for (int i = 0; i < q; i++) {
            fArr[i] = yVar.z();
        }
        int q2 = yVar.q();
        if (q2 > 32000) {
            return null;
        }
        double d2 = 2.0d;
        double log = Math.log(2.0d);
        int ceil = (int) Math.ceil(Math.log(((double) q) * 2.0d) / log);
        x xVar = new x(yVar.d());
        int i2 = 8;
        xVar.a(yVar.c() * 8);
        float[] fArr2 = new float[(q2 * 5)];
        int i3 = 5;
        int[] iArr = new int[5];
        int i4 = 0;
        int i5 = 0;
        while (i4 < q2) {
            int i6 = 0;
            while (i6 < i3) {
                int a2 = iArr[i6] + a(xVar.c(ceil));
                if (a2 >= q || a2 < 0) {
                    return null;
                }
                fArr2[i5] = fArr[a2];
                iArr[i6] = a2;
                i6++;
                i5++;
                i3 = 5;
            }
            i4++;
            i3 = 5;
        }
        xVar.a((xVar.b() + 7) & -8);
        int i7 = 32;
        int c2 = xVar.c(32);
        e.b[] bVarArr = new e.b[c2];
        int i8 = 0;
        while (i8 < c2) {
            int c3 = xVar.c(i2);
            int c4 = xVar.c(i2);
            int c5 = xVar.c(i7);
            if (c5 > 128000) {
                return null;
            }
            int i9 = c3;
            int ceil2 = (int) Math.ceil(Math.log(((double) q2) * d2) / log);
            float[] fArr3 = new float[(c5 * 3)];
            float[] fArr4 = new float[(c5 * 2)];
            int i10 = 0;
            for (int i11 = 0; i11 < c5; i11++) {
                i10 += a(xVar.c(ceil2));
                if (i10 < 0 || i10 >= q2) {
                    return null;
                }
                int i12 = i11 * 3;
                int i13 = i10 * 5;
                fArr3[i12] = fArr2[i13];
                fArr3[i12 + 1] = fArr2[i13 + 1];
                fArr3[i12 + 2] = fArr2[i13 + 2];
                int i14 = i11 * 2;
                fArr4[i14] = fArr2[i13 + 3];
                fArr4[i14 + 1] = fArr2[i13 + 4];
            }
            bVarArr[i8] = new e.b(i9, fArr3, fArr4, c4);
            i8++;
            i7 = 32;
            d2 = 2.0d;
            i2 = 8;
        }
        return new e.a(bVarArr);
    }
}
