package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.v;
import java.nio.ByteBuffer;
import java.util.Arrays;

public final class o {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11308a = {1, 2, 2, 2, 2, 3, 3, 4, 4, 5, 6, 6, 6, 7, 8, 8};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11309b = {-1, 8000, 16000, 32000, -1, -1, 11025, 22050, 44100, -1, -1, 12000, 24000, 48000, -1, -1};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11310c = {64, 112, 128, 192, 224, 256, 384, 448, 512, 640, 768, 896, 1024, 1152, 1280, 1536, 1920, 2048, 2304, 2560, 2688, 2816, 2823, 2944, 3072, 3840, 4096, 6144, 7680};

    public static int a(ByteBuffer byteBuffer) {
        byte b2;
        int i;
        int i2;
        int i3;
        int i4;
        int position = byteBuffer.position();
        byte b3 = byteBuffer.get(position);
        if (b3 != -2) {
            if (b3 == -1) {
                i = (byteBuffer.get(position + 4) & 7) << 4;
                i4 = position + 7;
            } else if (b3 != 31) {
                i3 = (byteBuffer.get(position + 4) & 1) << 6;
                i2 = position + 5;
            } else {
                i = (byteBuffer.get(position + 5) & 7) << 4;
                i4 = position + 6;
            }
            b2 = byteBuffer.get(i4) & 60;
            return (((b2 >> 2) | i) + 1) * 32;
        }
        i3 = (byteBuffer.get(position + 5) & 1) << 6;
        i2 = position + 4;
        b2 = byteBuffer.get(i2) & 252;
        return (((b2 >> 2) | i) + 1) * 32;
    }

    public static int a(byte[] bArr) {
        byte b2;
        int i;
        byte b3;
        int i2;
        byte b4;
        byte b5 = bArr[0];
        if (b5 != -2) {
            if (b5 == -1) {
                i = (bArr[4] & 7) << 4;
                b4 = bArr[7];
            } else if (b5 != 31) {
                i2 = (bArr[4] & 1) << 6;
                b3 = bArr[5];
            } else {
                i = (bArr[5] & 7) << 4;
                b4 = bArr[6];
            }
            b2 = b4 & 60;
            return (((b2 >> 2) | i) + 1) * 32;
        }
        i2 = (bArr[5] & 1) << 6;
        b3 = bArr[4];
        b2 = b3 & 252;
        return (((b2 >> 2) | i) + 1) * 32;
    }

    public static v a(byte[] bArr, String str, String str2, e eVar) {
        x c2 = c(bArr);
        c2.b(60);
        int i = f11308a[c2.c(6)];
        int i2 = f11309b[c2.c(4)];
        int c3 = c2.c(5);
        int[] iArr = f11310c;
        int i3 = c3 >= iArr.length ? -1 : (iArr[c3] * 1000) / 2;
        c2.b(10);
        return new v.a().a(str).f("audio/vnd.dts").d(i3).k(i + (c2.c(2) > 0 ? 1 : 0)).l(i2).a(eVar).c(str2).a();
    }

    public static boolean a(int i) {
        return i == 2147385345 || i == -25230976 || i == 536864768 || i == -14745368;
    }

    /* JADX WARNING: Removed duplicated region for block: B:13:0x005f  */
    /* JADX WARNING: Removed duplicated region for block: B:15:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static int b(byte[] r7) {
        /*
            r0 = 0
            byte r1 = r7[r0]
            r2 = -2
            r3 = 6
            r4 = 7
            r5 = 1
            r6 = 4
            if (r1 == r2) goto L_0x004a
            r2 = -1
            if (r1 == r2) goto L_0x0032
            r2 = 31
            if (r1 == r2) goto L_0x0021
            r1 = 5
            byte r1 = r7[r1]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r3]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r4]
            goto L_0x0058
        L_0x0021:
            byte r0 = r7[r3]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r4]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 8
            byte r7 = r7[r1]
            goto L_0x0042
        L_0x0032:
            byte r0 = r7[r4]
            r0 = r0 & 3
            int r0 = r0 << 12
            byte r1 = r7[r3]
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << r6
            r0 = r0 | r1
            r1 = 9
            byte r7 = r7[r1]
        L_0x0042:
            r7 = r7 & 60
            int r7 = r7 >> 2
            r7 = r7 | r0
            int r7 = r7 + r5
            r0 = 1
            goto L_0x005d
        L_0x004a:
            byte r1 = r7[r6]
            r1 = r1 & 3
            int r1 = r1 << 12
            byte r2 = r7[r4]
            r2 = r2 & 255(0xff, float:3.57E-43)
            int r2 = r2 << r6
            r1 = r1 | r2
            byte r7 = r7[r3]
        L_0x0058:
            r7 = r7 & 240(0xf0, float:3.36E-43)
            int r7 = r7 >> r6
            r7 = r7 | r1
            int r7 = r7 + r5
        L_0x005d:
            if (r0 == 0) goto L_0x0063
            int r7 = r7 * 16
            int r7 = r7 / 14
        L_0x0063:
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.b.o.b(byte[]):int");
    }

    private static x c(byte[] bArr) {
        if (bArr[0] == Byte.MAX_VALUE) {
            return new x(bArr);
        }
        byte[] copyOf = Arrays.copyOf(bArr, bArr.length);
        if (d(copyOf)) {
            for (int i = 0; i < copyOf.length - 1; i += 2) {
                byte b2 = copyOf[i];
                int i2 = i + 1;
                copyOf[i] = copyOf[i2];
                copyOf[i2] = b2;
            }
        }
        x xVar = new x(copyOf);
        if (copyOf[0] == 31) {
            x xVar2 = new x(copyOf);
            while (xVar2.a() >= 16) {
                xVar2.b(2);
                xVar.a(xVar2.c(14), 14);
            }
        }
        xVar.a(copyOf);
        return xVar;
    }

    private static boolean d(byte[] bArr) {
        return bArr[0] == -2 || bArr[0] == -1;
    }
}
