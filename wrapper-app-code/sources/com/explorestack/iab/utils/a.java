package com.explorestack.iab.utils;

import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;

public class a {

    /* renamed from: a  reason: collision with root package name */
    public static final byte[] f3077a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, Ascii.SUB, Ascii.ESC, Ascii.FS, Ascii.GS, Ascii.RS, Ascii.US, -1, -1, -1, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM, -1, -1, -1, -1, -1, -1, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, Ascii.VT, Ascii.FF, Ascii.CR, Ascii.SO, Ascii.SI, Ascii.DLE, 17, Ascii.DC2, 19, Ascii.DC4, Ascii.NAK, Ascii.SYN, Ascii.ETB, Ascii.CAN, Ascii.EM};

    public static final class b {

        /* renamed from: a  reason: collision with root package name */
        public long f3078a;

        /* renamed from: b  reason: collision with root package name */
        public byte[] f3079b;

        /* renamed from: c  reason: collision with root package name */
        public int f3080c;

        /* renamed from: d  reason: collision with root package name */
        public int f3081d;

        /* renamed from: e  reason: collision with root package name */
        public boolean f3082e;

        /* renamed from: f  reason: collision with root package name */
        public int f3083f;

        private b() {
        }
    }

    public final int a(int i, int i2) {
        int i3 = i + RecyclerView.UNDEFINED_DURATION;
        int i4 = i2 + RecyclerView.UNDEFINED_DURATION;
        if (i3 < i4) {
            return -1;
        }
        return i3 == i4 ? 0 : 1;
    }

    public final int a(b bVar) {
        if (bVar.f3079b != null) {
            return bVar.f3080c - bVar.f3081d;
        }
        return 0;
    }

    public String a(String str) {
        return a(str.getBytes(Charset.forName("UTF-8")));
    }

    public String a(byte[] bArr) {
        if (bArr == null || bArr.length == 0) {
            return new String(bArr);
        }
        b bVar = new b();
        a(bArr, 0, bArr.length, bVar);
        a(bArr, 0, -1, bVar);
        int i = bVar.f3080c;
        byte[] bArr2 = new byte[i];
        a(bArr2, i, bVar);
        return new String(bArr2);
    }

    public final void a(byte[] bArr, int i, int i2, b bVar) {
        byte b2;
        int i3 = i2;
        b bVar2 = bVar;
        if (!bVar2.f3082e) {
            boolean z = true;
            if (i3 < 0) {
                bVar2.f3082e = true;
            }
            int i4 = i;
            int i5 = 0;
            while (true) {
                if (i5 >= i3) {
                    break;
                }
                int i6 = i4 + 1;
                byte b3 = bArr[i4];
                if (b3 == 61) {
                    bVar2.f3082e = z;
                    break;
                }
                byte[] a2 = a(7, bVar2);
                if (b3 >= 0) {
                    byte[] bArr2 = f3077a;
                    if (b3 < bArr2.length && (b2 = bArr2[b3]) >= 0) {
                        int i7 = (bVar2.f3083f + (z ? 1 : 0)) % 8;
                        bVar2.f3083f = i7;
                        long j = (bVar2.f3078a << 5) + ((long) b2);
                        bVar2.f3078a = j;
                        if (i7 == 0) {
                            int i8 = bVar2.f3080c;
                            int i9 = i8 + 1;
                            bVar2.f3080c = i9;
                            a2[i8] = (byte) ((int) ((j >> 32) & 255));
                            int i10 = i9 + 1;
                            bVar2.f3080c = i10;
                            a2[i9] = (byte) ((int) ((j >> 24) & 255));
                            int i11 = i10 + 1;
                            bVar2.f3080c = i11;
                            a2[i10] = (byte) ((int) ((j >> 16) & 255));
                            int i12 = i11 + 1;
                            bVar2.f3080c = i12;
                            a2[i11] = (byte) ((int) ((j >> 8) & 255));
                            bVar2.f3080c = i12 + 1;
                            a2[i12] = (byte) ((int) (j & 255));
                        }
                    }
                }
                i5++;
                i4 = i6;
                z = true;
            }
            if (bVar2.f3082e && bVar2.f3083f > 0) {
                byte[] a3 = a(7, bVar2);
                switch (bVar2.f3083f) {
                    case 1:
                    case 2:
                        int i13 = bVar2.f3080c;
                        bVar2.f3080c = i13 + 1;
                        a3[i13] = (byte) ((int) ((bVar2.f3078a >> 2) & 255));
                        return;
                    case 3:
                        int i14 = bVar2.f3080c;
                        bVar2.f3080c = i14 + 1;
                        a3[i14] = (byte) ((int) ((bVar2.f3078a >> 7) & 255));
                        return;
                    case 4:
                        long j2 = bVar2.f3078a >> 4;
                        bVar2.f3078a = j2;
                        int i15 = bVar2.f3080c;
                        int i16 = i15 + 1;
                        bVar2.f3080c = i16;
                        a3[i15] = (byte) ((int) ((j2 >> 8) & 255));
                        bVar2.f3080c = i16 + 1;
                        a3[i16] = (byte) ((int) (j2 & 255));
                        return;
                    case 5:
                        long j3 = bVar2.f3078a >> 1;
                        bVar2.f3078a = j3;
                        int i17 = bVar2.f3080c;
                        int i18 = i17 + 1;
                        bVar2.f3080c = i18;
                        a3[i17] = (byte) ((int) ((j3 >> 16) & 255));
                        int i19 = i18 + 1;
                        bVar2.f3080c = i19;
                        a3[i18] = (byte) ((int) ((j3 >> 8) & 255));
                        bVar2.f3080c = i19 + 1;
                        a3[i19] = (byte) ((int) (j3 & 255));
                        return;
                    case 6:
                        long j4 = bVar2.f3078a >> 6;
                        bVar2.f3078a = j4;
                        int i20 = bVar2.f3080c;
                        int i21 = i20 + 1;
                        bVar2.f3080c = i21;
                        a3[i20] = (byte) ((int) ((j4 >> 16) & 255));
                        int i22 = i21 + 1;
                        bVar2.f3080c = i22;
                        a3[i21] = (byte) ((int) ((j4 >> 8) & 255));
                        bVar2.f3080c = i22 + 1;
                        a3[i22] = (byte) ((int) (j4 & 255));
                        return;
                    case 7:
                        long j5 = bVar2.f3078a >> 3;
                        bVar2.f3078a = j5;
                        int i23 = bVar2.f3080c;
                        int i24 = i23 + 1;
                        bVar2.f3080c = i24;
                        a3[i23] = (byte) ((int) ((j5 >> 24) & 255));
                        int i25 = i24 + 1;
                        bVar2.f3080c = i25;
                        a3[i24] = (byte) ((int) ((j5 >> 16) & 255));
                        int i26 = i25 + 1;
                        bVar2.f3080c = i26;
                        a3[i25] = (byte) ((int) ((j5 >> 8) & 255));
                        bVar2.f3080c = i26 + 1;
                        a3[i26] = (byte) ((int) (j5 & 255));
                        return;
                    default:
                        throw new IllegalStateException("Impossible modulus " + bVar2.f3083f);
                }
            }
        }
    }

    public final void a(byte[] bArr, int i, b bVar) {
        if (bVar.f3079b != null) {
            int min = Math.min(a(bVar), i);
            System.arraycopy(bVar.f3079b, bVar.f3081d, bArr, 0, min);
            int i2 = bVar.f3081d + min;
            bVar.f3081d = i2;
            if (i2 >= bVar.f3080c) {
                bVar.f3079b = null;
            }
        }
    }

    public final byte[] a(int i, b bVar) {
        byte[] bArr = bVar.f3079b;
        if (bArr == null) {
            bVar.f3079b = new byte[Math.max(i, 8192)];
            bVar.f3080c = 0;
            bVar.f3081d = 0;
        } else {
            int i2 = bVar.f3080c + i;
            if (i2 - bArr.length > 0) {
                return a(bVar, i2);
            }
        }
        return bVar.f3079b;
    }

    public final byte[] a(b bVar, int i) {
        int length = bVar.f3079b.length * 2;
        if (a(length, i) < 0) {
            length = i;
        }
        if (a(length, 2147483639) > 0) {
            length = Math.max(i, 2147483639);
        }
        byte[] bArr = new byte[length];
        byte[] bArr2 = bVar.f3079b;
        System.arraycopy(bArr2, 0, bArr, 0, bArr2.length);
        bVar.f3079b = bArr;
        return bArr;
    }
}
