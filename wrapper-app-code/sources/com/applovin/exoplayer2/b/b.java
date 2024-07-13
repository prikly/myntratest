package com.applovin.exoplayer2.b;

import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import com.applovin.exoplayer2.v;
import com.explorestack.protobuf.openrtb.LossReason;
import java.nio.ByteBuffer;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f11193a = {1, 2, 3, 6};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f11194b = {48000, 44100, 32000};

    /* renamed from: c  reason: collision with root package name */
    private static final int[] f11195c = {24000, 22050, 16000};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f11196d = {2, 1, 2, 3, 3, 4, 4, 5};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f11197e = {32, 40, 48, 56, 64, 80, 96, 112, 128, 160, 192, 224, 256, 320, 384, 448, 512, 576, 640};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f11198f = {69, 87, 104, 121, 139, 174, LossReason.LOSS_REASON_CREATIVE_FILTERED_CATEGORY_EXCLUSIONS_VALUE, 243, 278, 348, 417, 487, 557, 696, 835, 975, 1114, 1253, 1393};

    public static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f11199a;

        /* renamed from: b  reason: collision with root package name */
        public final int f11200b;

        /* renamed from: c  reason: collision with root package name */
        public final int f11201c;

        /* renamed from: d  reason: collision with root package name */
        public final int f11202d;

        /* renamed from: e  reason: collision with root package name */
        public final int f11203e;

        /* renamed from: f  reason: collision with root package name */
        public final int f11204f;

        private a(String str, int i, int i2, int i3, int i4, int i5) {
            this.f11199a = str;
            this.f11200b = i;
            this.f11202d = i2;
            this.f11201c = i3;
            this.f11203e = i4;
            this.f11204f = i5;
        }
    }

    private static int a(int i, int i2) {
        int i3 = i2 / 2;
        if (i < 0) {
            return -1;
        }
        int[] iArr = f11194b;
        if (i >= iArr.length || i2 < 0) {
            return -1;
        }
        int[] iArr2 = f11198f;
        if (i3 >= iArr2.length) {
            return -1;
        }
        int i4 = iArr[i];
        if (i4 == 44100) {
            return (iArr2[i3] + (i2 % 2)) * 2;
        }
        int i5 = f11197e[i3];
        return i4 == 32000 ? i5 * 6 : i5 * 4;
    }

    public static int a(ByteBuffer byteBuffer) {
        int i = 3;
        if (!(((byteBuffer.get(byteBuffer.position() + 5) & 248) >> 3) > 10)) {
            return 1536;
        }
        if (((byteBuffer.get(byteBuffer.position() + 4) & 192) >> 6) != 3) {
            i = (byteBuffer.get(byteBuffer.position() + 4) & 48) >> 4;
        }
        return f11193a[i] * 256;
    }

    public static int a(ByteBuffer byteBuffer, int i) {
        return 40 << ((byteBuffer.get((byteBuffer.position() + i) + ((byteBuffer.get((byteBuffer.position() + i) + 7) & 255) == 187 ? 9 : 8)) >> 4) & 7);
    }

    public static int a(byte[] bArr) {
        if (bArr.length < 6) {
            return -1;
        }
        if (!(((bArr[5] & 248) >> 3) > 10)) {
            return a((bArr[4] & 192) >> 6, (int) bArr[4] & 63);
        }
        return (((bArr[3] & 255) | ((bArr[2] & 7) << 8)) + 1) * 2;
    }

    public static a a(x xVar) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        String str;
        int i6;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        x xVar2 = xVar;
        int b2 = xVar.b();
        xVar2.b(40);
        boolean z = xVar2.c(5) > 10;
        xVar2.a(b2);
        int i12 = -1;
        if (z) {
            xVar2.b(16);
            int c2 = xVar2.c(2);
            if (c2 == 0) {
                i12 = 0;
            } else if (c2 == 1) {
                i12 = 1;
            } else if (c2 == 2) {
                i12 = 2;
            }
            xVar2.b(3);
            int c3 = (xVar2.c(11) + 1) * 2;
            int c4 = xVar2.c(2);
            if (c4 == 3) {
                i6 = f11195c[xVar2.c(2)];
                i8 = 3;
                i7 = 6;
            } else {
                i8 = xVar2.c(2);
                i7 = f11193a[i8];
                i6 = f11194b[c4];
            }
            int i13 = i7 * 256;
            int c5 = xVar2.c(3);
            boolean e2 = xVar.e();
            int i14 = f11196d[c5] + (e2 ? 1 : 0);
            xVar2.b(10);
            if (xVar.e()) {
                xVar2.b(8);
            }
            if (c5 == 0) {
                xVar2.b(5);
                if (xVar.e()) {
                    xVar2.b(8);
                }
            }
            if (i12 == 1 && xVar.e()) {
                xVar2.b(16);
            }
            if (xVar.e()) {
                if (c5 > 2) {
                    xVar2.b(2);
                }
                if ((c5 & 1) == 0 || c5 <= 2) {
                    i10 = 6;
                } else {
                    i10 = 6;
                    xVar2.b(6);
                }
                if ((c5 & 4) != 0) {
                    xVar2.b(i10);
                }
                if (e2 && xVar.e()) {
                    xVar2.b(5);
                }
                if (i12 == 0) {
                    if (xVar.e()) {
                        i11 = 6;
                        xVar2.b(6);
                    } else {
                        i11 = 6;
                    }
                    if (c5 == 0 && xVar.e()) {
                        xVar2.b(i11);
                    }
                    if (xVar.e()) {
                        xVar2.b(i11);
                    }
                    int c6 = xVar2.c(2);
                    if (c6 == 1) {
                        xVar2.b(5);
                    } else if (c6 == 2) {
                        xVar2.b(12);
                    } else if (c6 == 3) {
                        int c7 = xVar2.c(5);
                        if (xVar.e()) {
                            xVar2.b(5);
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                xVar2.b(4);
                            }
                            if (xVar.e()) {
                                if (xVar.e()) {
                                    xVar2.b(4);
                                }
                                if (xVar.e()) {
                                    xVar2.b(4);
                                }
                            }
                        }
                        if (xVar.e()) {
                            xVar2.b(5);
                            if (xVar.e()) {
                                xVar2.b(7);
                                if (xVar.e()) {
                                    xVar2.b(8);
                                }
                            }
                        }
                        xVar2.b((c7 + 2) * 8);
                        xVar.f();
                    }
                    if (c5 < 2) {
                        if (xVar.e()) {
                            xVar2.b(14);
                        }
                        if (c5 == 0 && xVar.e()) {
                            xVar2.b(14);
                        }
                    }
                    if (xVar.e()) {
                        if (i8 == 0) {
                            xVar2.b(5);
                        } else {
                            for (int i15 = 0; i15 < i7; i15++) {
                                if (xVar.e()) {
                                    xVar2.b(5);
                                }
                            }
                        }
                    }
                }
            }
            if (xVar.e()) {
                xVar2.b(5);
                if (c5 == 2) {
                    xVar2.b(4);
                }
                if (c5 >= 6) {
                    xVar2.b(2);
                }
                if (xVar.e()) {
                    xVar2.b(8);
                }
                if (c5 == 0 && xVar.e()) {
                    xVar2.b(8);
                }
                if (c4 < 3) {
                    xVar.d();
                }
            }
            if (i12 == 0 && i8 != 3) {
                xVar.d();
            }
            if (i12 != 2 || (i8 != 3 && !xVar.e())) {
                i9 = 6;
            } else {
                i9 = 6;
                xVar2.b(6);
            }
            str = (xVar.e() && xVar2.c(i9) == 1 && xVar2.c(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
            i5 = i12;
            i = i13;
            i2 = c3;
            i3 = i6;
            i4 = i14;
        } else {
            xVar2.b(32);
            int c8 = xVar2.c(2);
            String str2 = c8 == 3 ? null : "audio/ac3";
            int a2 = a(c8, xVar2.c(6));
            xVar2.b(8);
            int c9 = xVar2.c(3);
            if (!((c9 & 1) == 0 || c9 == 1)) {
                xVar2.b(2);
            }
            if ((c9 & 4) != 0) {
                xVar2.b(2);
            }
            if (c9 == 2) {
                xVar2.b(2);
            }
            int[] iArr = f11194b;
            str = str2;
            i2 = a2;
            i3 = c8 < iArr.length ? iArr[c8] : -1;
            i4 = f11196d[c9] + (xVar.e() ? 1 : 0);
            i5 = -1;
            i = 1536;
        }
        return new a(str, i5, i4, i3, i2, i);
    }

    public static v a(y yVar, String str, String str2, e eVar) {
        int i = f11194b[(yVar.h() & 192) >> 6];
        int h2 = yVar.h();
        int i2 = f11196d[(h2 & 56) >> 3];
        if ((h2 & 4) != 0) {
            i2++;
        }
        return new v.a().a(str).f("audio/ac3").k(i2).l(i).a(eVar).c(str2).a();
    }

    public static int b(ByteBuffer byteBuffer) {
        int position = byteBuffer.position();
        int limit = byteBuffer.limit() - 10;
        for (int i = position; i <= limit; i++) {
            if ((ai.a(byteBuffer, i + 4) & -2) == -126718022) {
                return i - position;
            }
        }
        return -1;
    }

    public static int b(byte[] bArr) {
        boolean z = false;
        if (bArr[4] != -8 || bArr[5] != 114 || bArr[6] != 111 || (bArr[7] & 254) != 186) {
            return 0;
        }
        if ((bArr[7] & 255) == 187) {
            z = true;
        }
        return 40 << ((bArr[z ? (char) 9 : 8] >> 4) & 7);
    }

    public static v b(y yVar, String str, String str2, e eVar) {
        yVar.e(2);
        int i = f11194b[(yVar.h() & 192) >> 6];
        int h2 = yVar.h();
        int i2 = f11196d[(h2 & 14) >> 1];
        if ((h2 & 1) != 0) {
            i2++;
        }
        if (((yVar.h() & 30) >> 1) > 0 && (2 & yVar.h()) != 0) {
            i2 += 2;
        }
        return new v.a().a(str).f((yVar.a() <= 0 || (yVar.h() & 1) == 0) ? "audio/eac3" : "audio/eac3-joc").k(i2).l(i).a(eVar).c(str2).a();
    }
}
