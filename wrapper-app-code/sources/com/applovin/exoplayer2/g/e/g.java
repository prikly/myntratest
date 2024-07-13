package com.applovin.exoplayer2.g.e;

import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.g.a;
import com.applovin.exoplayer2.g.d;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;

public final class g extends com.applovin.exoplayer2.g.g {

    /* renamed from: a  reason: collision with root package name */
    public static final a f12638a = $$Lambda$g$k1XRr02Td0ZR_6qrKsLkLkVUk.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private final a f12639b;

    public interface a {
        boolean evaluate(int i, int i2, int i3, int i4, int i5);
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final int f12640a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final boolean f12641b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f12642c;

        public b(int i, boolean z, int i2) {
            this.f12640a = i;
            this.f12641b = z;
            this.f12642c = i2;
        }
    }

    public g() {
        this((a) null);
    }

    public g(a aVar) {
        this.f12639b = aVar;
    }

    private static int a(byte[] bArr, int i, int i2) {
        int b2 = b(bArr, i);
        if (i2 == 0 || i2 == 3) {
            return b2;
        }
        while (b2 < bArr.length - 1) {
            if ((b2 - i) % 2 == 0 && bArr[b2 + 1] == 0) {
                return b2;
            }
            b2 = b(bArr, b2 + 1);
        }
        return bArr.length;
    }

    private static a a(y yVar, int i, int i2) throws UnsupportedEncodingException {
        int i3;
        String str;
        int h2 = yVar.h();
        String a2 = a(h2);
        int i4 = i - 1;
        byte[] bArr = new byte[i4];
        yVar.a(bArr, 0, i4);
        if (i2 == 2) {
            str = "image/" + Ascii.toLowerCase(new String(bArr, 0, 3, "ISO-8859-1"));
            if ("image/jpg".equals(str)) {
                str = "image/jpeg";
            }
            i3 = 2;
        } else {
            i3 = b(bArr, 0);
            String lowerCase = Ascii.toLowerCase(new String(bArr, 0, i3, "ISO-8859-1"));
            if (lowerCase.indexOf(47) == -1) {
                str = "image/" + lowerCase;
            } else {
                str = lowerCase;
            }
        }
        int i5 = i3 + 2;
        int a3 = a(bArr, i5, h2);
        return new a(str, new String(bArr, i5, a3 - i5, a2), bArr[i3 + 1] & 255, b(bArr, a3 + b(h2), i4));
    }

    private static c a(y yVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        y yVar2 = yVar;
        int c2 = yVar.c();
        int b2 = b(yVar.d(), c2);
        String str = new String(yVar.d(), c2, b2 - c2, "ISO-8859-1");
        yVar.d(b2 + 1);
        int q = yVar.q();
        int q2 = yVar.q();
        long o = yVar.o();
        long j = o == 4294967295L ? -1 : o;
        long o2 = yVar.o();
        long j2 = o2 == 4294967295L ? -1 : o2;
        ArrayList arrayList = new ArrayList();
        int i4 = c2 + i;
        while (yVar.c() < i4) {
            h a2 = a(i2, yVar, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new c(str, q, q2, j, j2, (h[]) arrayList.toArray(new h[0]));
    }

    private static b a(y yVar) {
        StringBuilder sb;
        String str;
        if (yVar.a() < 10) {
            str = "Data too short to be an ID3 tag";
        } else {
            int m = yVar.m();
            boolean z = false;
            if (m != 4801587) {
                sb = new StringBuilder();
                sb.append("Unexpected first three bytes of ID3 tag header: 0x");
                sb.append(String.format("%06X", new Object[]{Integer.valueOf(m)}));
            } else {
                int h2 = yVar.h();
                yVar.e(1);
                int h3 = yVar.h();
                int v = yVar.v();
                if (h2 == 2) {
                    if ((h3 & 64) != 0) {
                        str = "Skipped ID3 tag with majorVersion=2 and undefined compression scheme";
                    }
                } else if (h2 == 3) {
                    if ((h3 & 64) != 0) {
                        int q = yVar.q();
                        yVar.e(q);
                        v -= q + 4;
                    }
                } else if (h2 == 4) {
                    if ((h3 & 64) != 0) {
                        int v2 = yVar.v();
                        yVar.e(v2 - 4);
                        v -= v2;
                    }
                    if ((h3 & 16) != 0) {
                        v -= 10;
                    }
                } else {
                    sb = new StringBuilder();
                    sb.append("Skipped ID3 tag with unsupported majorVersion=");
                    sb.append(h2);
                }
                if (h2 < 4 && (h3 & 128) != 0) {
                    z = true;
                }
                return new b(h2, z, v);
            }
            str = sb.toString();
        }
        q.c("Id3Decoder", str);
        return null;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:129:0x0190, code lost:
        if (r13 == 67) goto L_0x0192;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.g.e.h a(int r19, com.applovin.exoplayer2.l.y r20, boolean r21, int r22, com.applovin.exoplayer2.g.e.g.a r23) {
        /*
            r0 = r19
            r7 = r20
            int r8 = r20.h()
            int r9 = r20.h()
            int r10 = r20.h()
            r11 = 3
            if (r0 < r11) goto L_0x0019
            int r1 = r20.h()
            r13 = r1
            goto L_0x001a
        L_0x0019:
            r13 = 0
        L_0x001a:
            r14 = 4
            if (r0 != r14) goto L_0x003c
            int r1 = r20.w()
            if (r21 != 0) goto L_0x003a
            r2 = r1 & 255(0xff, float:3.57E-43)
            int r3 = r1 >> 8
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 7
            r2 = r2 | r3
            int r3 = r1 >> 16
            r3 = r3 & 255(0xff, float:3.57E-43)
            int r3 = r3 << 14
            r2 = r2 | r3
            int r1 = r1 >> 24
            r1 = r1 & 255(0xff, float:3.57E-43)
            int r1 = r1 << 21
            r1 = r1 | r2
        L_0x003a:
            r15 = r1
            goto L_0x0048
        L_0x003c:
            if (r0 != r11) goto L_0x0043
            int r1 = r20.w()
            goto L_0x003a
        L_0x0043:
            int r1 = r20.m()
            goto L_0x003a
        L_0x0048:
            if (r0 < r11) goto L_0x0050
            int r1 = r20.i()
            r6 = r1
            goto L_0x0051
        L_0x0050:
            r6 = 0
        L_0x0051:
            r16 = 0
            if (r8 != 0) goto L_0x0067
            if (r9 != 0) goto L_0x0067
            if (r10 != 0) goto L_0x0067
            if (r13 != 0) goto L_0x0067
            if (r15 != 0) goto L_0x0067
            if (r6 != 0) goto L_0x0067
            int r0 = r20.b()
            r7.d(r0)
            return r16
        L_0x0067:
            int r1 = r20.c()
            int r5 = r1 + r15
            int r1 = r20.b()
            java.lang.String r4 = "Id3Decoder"
            if (r5 <= r1) goto L_0x0082
            java.lang.String r0 = "Frame size exceeds remaining tag data"
            com.applovin.exoplayer2.l.q.c(r4, r0)
            int r0 = r20.b()
            r7.d(r0)
            return r16
        L_0x0082:
            if (r23 == 0) goto L_0x009a
            r1 = r23
            r2 = r19
            r3 = r8
            r12 = r4
            r4 = r9
            r14 = r5
            r5 = r10
            r18 = r6
            r6 = r13
            boolean r1 = r1.evaluate(r2, r3, r4, r5, r6)
            if (r1 != 0) goto L_0x009e
            r7.d(r14)
            return r16
        L_0x009a:
            r12 = r4
            r14 = r5
            r18 = r6
        L_0x009e:
            r1 = 1
            if (r0 != r11) goto L_0x00bc
            r2 = r18
            r3 = r2 & 128(0x80, float:1.794E-43)
            if (r3 == 0) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            r4 = r2 & 64
            if (r4 == 0) goto L_0x00b0
            r4 = 1
            goto L_0x00b1
        L_0x00b0:
            r4 = 0
        L_0x00b1:
            r2 = r2 & 32
            if (r2 == 0) goto L_0x00b7
            r2 = 1
            goto L_0x00b8
        L_0x00b7:
            r2 = 0
        L_0x00b8:
            r17 = r3
            r6 = 0
            goto L_0x00f2
        L_0x00bc:
            r2 = r18
            r3 = 4
            if (r0 != r3) goto L_0x00ec
            r3 = r2 & 64
            if (r3 == 0) goto L_0x00c7
            r3 = 1
            goto L_0x00c8
        L_0x00c7:
            r3 = 0
        L_0x00c8:
            r4 = r2 & 8
            if (r4 == 0) goto L_0x00ce
            r4 = 1
            goto L_0x00cf
        L_0x00ce:
            r4 = 0
        L_0x00cf:
            r5 = r2 & 4
            if (r5 == 0) goto L_0x00d5
            r5 = 1
            goto L_0x00d6
        L_0x00d5:
            r5 = 0
        L_0x00d6:
            r6 = r2 & 2
            if (r6 == 0) goto L_0x00dc
            r6 = 1
            goto L_0x00dd
        L_0x00dc:
            r6 = 0
        L_0x00dd:
            r2 = r2 & r1
            if (r2 == 0) goto L_0x00e3
            r17 = 1
            goto L_0x00e5
        L_0x00e3:
            r17 = 0
        L_0x00e5:
            r2 = r3
            r3 = r17
            r17 = r4
            r4 = r5
            goto L_0x00f2
        L_0x00ec:
            r2 = 0
            r3 = 0
            r4 = 0
            r6 = 0
            r17 = 0
        L_0x00f2:
            if (r17 != 0) goto L_0x0225
            if (r4 == 0) goto L_0x00f8
            goto L_0x0225
        L_0x00f8:
            if (r2 == 0) goto L_0x00ff
            int r15 = r15 + -1
            r7.e(r1)
        L_0x00ff:
            if (r3 == 0) goto L_0x0107
            int r15 = r15 + -4
            r1 = 4
            r7.e(r1)
        L_0x0107:
            if (r6 == 0) goto L_0x010d
            int r15 = g(r7, r15)
        L_0x010d:
            r1 = 84
            r2 = 2
            r3 = 88
            if (r8 != r1) goto L_0x0122
            if (r9 != r3) goto L_0x0122
            if (r10 != r3) goto L_0x0122
            if (r0 == r2) goto L_0x011c
            if (r13 != r3) goto L_0x0122
        L_0x011c:
            com.applovin.exoplayer2.g.e.l r1 = a((com.applovin.exoplayer2.l.y) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0122:
            if (r8 != r1) goto L_0x0131
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.l r1 = a((com.applovin.exoplayer2.l.y) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x012e:
            r0 = move-exception
            goto L_0x0221
        L_0x0131:
            r4 = 87
            if (r8 != r4) goto L_0x0143
            if (r9 != r3) goto L_0x0143
            if (r10 != r3) goto L_0x0143
            if (r0 == r2) goto L_0x013d
            if (r13 != r3) goto L_0x0143
        L_0x013d:
            com.applovin.exoplayer2.g.e.m r1 = b((com.applovin.exoplayer2.l.y) r7, (int) r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0143:
            if (r8 != r4) goto L_0x014f
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.m r1 = b((com.applovin.exoplayer2.l.y) r7, (int) r15, (java.lang.String) r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x014f:
            r3 = 73
            r4 = 80
            if (r8 != r4) goto L_0x0165
            r5 = 82
            if (r9 != r5) goto L_0x0165
            if (r10 != r3) goto L_0x0165
            r5 = 86
            if (r13 != r5) goto L_0x0165
            com.applovin.exoplayer2.g.e.k r1 = c(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0165:
            r5 = 71
            r6 = 79
            if (r8 != r5) goto L_0x017d
            r5 = 69
            if (r9 != r5) goto L_0x017d
            if (r10 != r6) goto L_0x017d
            r5 = 66
            if (r13 == r5) goto L_0x0177
            if (r0 != r2) goto L_0x017d
        L_0x0177:
            com.applovin.exoplayer2.g.e.f r1 = d(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x017d:
            r5 = 65
            r11 = 67
            if (r0 != r2) goto L_0x018a
            if (r8 != r4) goto L_0x0198
            if (r9 != r3) goto L_0x0198
            if (r10 != r11) goto L_0x0198
            goto L_0x0192
        L_0x018a:
            if (r8 != r5) goto L_0x0198
            if (r9 != r4) goto L_0x0198
            if (r10 != r3) goto L_0x0198
            if (r13 != r11) goto L_0x0198
        L_0x0192:
            com.applovin.exoplayer2.g.e.a r1 = a((com.applovin.exoplayer2.l.y) r7, (int) r15, (int) r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x0198:
            r3 = 77
            if (r8 != r11) goto L_0x01a9
            if (r9 != r6) goto L_0x01a9
            if (r10 != r3) goto L_0x01a9
            if (r13 == r3) goto L_0x01a4
            if (r0 != r2) goto L_0x01a9
        L_0x01a4:
            com.applovin.exoplayer2.g.e.e r1 = e(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01a9:
            if (r8 != r11) goto L_0x01c3
            r2 = 72
            if (r9 != r2) goto L_0x01c3
            if (r10 != r5) goto L_0x01c3
            if (r13 != r4) goto L_0x01c3
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.exoplayer2.g.e.c r1 = a(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01c3:
            if (r8 != r11) goto L_0x01db
            if (r9 != r1) goto L_0x01db
            if (r10 != r6) goto L_0x01db
            if (r13 != r11) goto L_0x01db
            r1 = r20
            r2 = r15
            r3 = r19
            r4 = r21
            r5 = r22
            r6 = r23
            com.applovin.exoplayer2.g.e.d r1 = b(r1, r2, r3, r4, r5, r6)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01db:
            if (r8 != r3) goto L_0x01ea
            r2 = 76
            if (r9 != r2) goto L_0x01ea
            if (r10 != r2) goto L_0x01ea
            if (r13 != r1) goto L_0x01ea
            com.applovin.exoplayer2.g.e.j r1 = f(r7, r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            goto L_0x01f2
        L_0x01ea:
            java.lang.String r1 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.g.e.b r1 = c(r7, r15, r1)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x01f2:
            if (r1 != 0) goto L_0x0214
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.<init>()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r3 = "Failed to decode frame: id="
            r2.append(r3)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = a((int) r0, (int) r8, (int) r9, (int) r10, (int) r13)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = ", frameSize="
            r2.append(r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            r2.append(r15)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            java.lang.String r0 = r2.toString()     // Catch:{ UnsupportedEncodingException -> 0x0218 }
            com.applovin.exoplayer2.l.q.c(r12, r0)     // Catch:{ UnsupportedEncodingException -> 0x0218 }
        L_0x0214:
            r7.d(r14)
            return r1
        L_0x0218:
            java.lang.String r0 = "Unsupported character encoding"
            com.applovin.exoplayer2.l.q.c(r12, r0)     // Catch:{ all -> 0x012e }
            r7.d(r14)
            return r16
        L_0x0221:
            r7.d(r14)
            throw r0
        L_0x0225:
            java.lang.String r0 = "Skipping unsupported compressed or encrypted frame"
            com.applovin.exoplayer2.l.q.c(r12, r0)
            r7.d(r14)
            return r16
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.g.a(int, com.applovin.exoplayer2.l.y, boolean, int, com.applovin.exoplayer2.g.e.g$a):com.applovin.exoplayer2.g.e.h");
    }

    private static l a(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h2 = yVar.h();
        String a2 = a(h2);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int a3 = a(bArr, 0, h2);
        String str = new String(bArr, 0, a3, a2);
        int b2 = a3 + b(h2);
        return new l("TXXX", str, a(bArr, b2, a(bArr, b2, h2), a2));
    }

    private static l a(y yVar, int i, String str) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h2 = yVar.h();
        String a2 = a(h2);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        return new l(str, (String) null, new String(bArr, 0, a(bArr, 0, h2), a2));
    }

    private static String a(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "ISO-8859-1" : "UTF-8" : "UTF-16BE" : "UTF-16";
    }

    private static String a(int i, int i2, int i3, int i4, int i5) {
        if (i == 2) {
            return String.format(Locale.US, "%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4)});
        }
        return String.format(Locale.US, "%c%c%c%c", new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf(i5)});
    }

    private static String a(byte[] bArr, int i, int i2, String str) throws UnsupportedEncodingException {
        return (i2 <= i || i2 > bArr.length) ? "" : new String(bArr, i, i2 - i, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:30:0x0076, code lost:
        if ((r10 & 1) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x0085, code lost:
        if ((r10 & 128) != 0) goto L_0x0078;
     */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0090  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x009b A[SYNTHETIC, Splitter:B:49:0x009b] */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0097 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(com.applovin.exoplayer2.l.y r18, int r19, int r20, boolean r21) {
        /*
            r1 = r18
            r0 = r19
            int r2 = r18.c()
        L_0x0008:
            int r3 = r18.a()     // Catch:{ all -> 0x00b2 }
            r4 = 1
            r5 = r20
            if (r3 < r5) goto L_0x00ae
            r3 = 3
            r6 = 0
            if (r0 < r3) goto L_0x0022
            int r7 = r18.q()     // Catch:{ all -> 0x00b2 }
            long r8 = r18.o()     // Catch:{ all -> 0x00b2 }
            int r10 = r18.i()     // Catch:{ all -> 0x00b2 }
            goto L_0x002c
        L_0x0022:
            int r7 = r18.m()     // Catch:{ all -> 0x00b2 }
            int r8 = r18.m()     // Catch:{ all -> 0x00b2 }
            long r8 = (long) r8
            r10 = 0
        L_0x002c:
            r11 = 0
            if (r7 != 0) goto L_0x003a
            int r7 = (r8 > r11 ? 1 : (r8 == r11 ? 0 : -1))
            if (r7 != 0) goto L_0x003a
            if (r10 != 0) goto L_0x003a
            r1.d(r2)
            return r4
        L_0x003a:
            r7 = 4
            if (r0 != r7) goto L_0x006b
            if (r21 != 0) goto L_0x006b
            r13 = 8421504(0x808080, double:4.160776E-317)
            long r13 = r13 & r8
            int r15 = (r13 > r11 ? 1 : (r13 == r11 ? 0 : -1))
            if (r15 == 0) goto L_0x004b
            r1.d(r2)
            return r6
        L_0x004b:
            r11 = 255(0xff, double:1.26E-321)
            long r13 = r8 & r11
            r15 = 8
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 7
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 16
            long r15 = r8 >> r15
            long r15 = r15 & r11
            r17 = 14
            long r15 = r15 << r17
            long r13 = r13 | r15
            r15 = 24
            long r8 = r8 >> r15
            long r8 = r8 & r11
            r11 = 21
            long r8 = r8 << r11
            long r8 = r8 | r13
        L_0x006b:
            if (r0 != r7) goto L_0x007a
            r3 = r10 & 64
            if (r3 == 0) goto L_0x0073
            r3 = 1
            goto L_0x0074
        L_0x0073:
            r3 = 0
        L_0x0074:
            r7 = r10 & 1
            if (r7 == 0) goto L_0x0089
        L_0x0078:
            r7 = 1
            goto L_0x008a
        L_0x007a:
            if (r0 != r3) goto L_0x0088
            r3 = r10 & 32
            if (r3 == 0) goto L_0x0082
            r3 = 1
            goto L_0x0083
        L_0x0082:
            r3 = 0
        L_0x0083:
            r7 = r10 & 128(0x80, float:1.794E-43)
            if (r7 == 0) goto L_0x0089
            goto L_0x0078
        L_0x0088:
            r3 = 0
        L_0x0089:
            r7 = 0
        L_0x008a:
            if (r3 == 0) goto L_0x008d
            goto L_0x008e
        L_0x008d:
            r4 = 0
        L_0x008e:
            if (r7 == 0) goto L_0x0092
            int r4 = r4 + 4
        L_0x0092:
            long r3 = (long) r4
            int r7 = (r8 > r3 ? 1 : (r8 == r3 ? 0 : -1))
            if (r7 >= 0) goto L_0x009b
            r1.d(r2)
            return r6
        L_0x009b:
            int r3 = r18.a()     // Catch:{ all -> 0x00b2 }
            long r3 = (long) r3
            int r7 = (r3 > r8 ? 1 : (r3 == r8 ? 0 : -1))
            if (r7 >= 0) goto L_0x00a8
            r1.d(r2)
            return r6
        L_0x00a8:
            int r3 = (int) r8
            r1.e(r3)     // Catch:{ all -> 0x00b2 }
            goto L_0x0008
        L_0x00ae:
            r1.d(r2)
            return r4
        L_0x00b2:
            r0 = move-exception
            r1.d(r2)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.g.e.g.a(com.applovin.exoplayer2.l.y, int, int, boolean):boolean");
    }

    private static int b(int i) {
        return (i == 0 || i == 3) ? 1 : 2;
    }

    private static int b(byte[] bArr, int i) {
        while (i < bArr.length) {
            if (bArr[i] == 0) {
                return i;
            }
            i++;
        }
        return bArr.length;
    }

    private static d b(y yVar, int i, int i2, boolean z, int i3, a aVar) throws UnsupportedEncodingException {
        y yVar2 = yVar;
        int c2 = yVar.c();
        int b2 = b(yVar.d(), c2);
        String str = new String(yVar.d(), c2, b2 - c2, "ISO-8859-1");
        yVar2.d(b2 + 1);
        int h2 = yVar.h();
        boolean z2 = (h2 & 2) != 0;
        boolean z3 = (h2 & 1) != 0;
        int h3 = yVar.h();
        String[] strArr = new String[h3];
        for (int i4 = 0; i4 < h3; i4++) {
            int c3 = yVar.c();
            int b3 = b(yVar.d(), c3);
            strArr[i4] = new String(yVar.d(), c3, b3 - c3, "ISO-8859-1");
            yVar2.d(b3 + 1);
        }
        ArrayList arrayList = new ArrayList();
        int i5 = c2 + i;
        while (yVar.c() < i5) {
            h a2 = a(i2, yVar2, z, i3, aVar);
            if (a2 != null) {
                arrayList.add(a2);
            }
        }
        return new d(str, z2, z3, strArr, (h[]) arrayList.toArray(new h[0]));
    }

    private static m b(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 1) {
            return null;
        }
        int h2 = yVar.h();
        String a2 = a(h2);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int a3 = a(bArr, 0, h2);
        String str = new String(bArr, 0, a3, a2);
        int b2 = a3 + b(h2);
        return new m("WXXX", str, a(bArr, b2, b(bArr, b2), "ISO-8859-1"));
    }

    private static m b(y yVar, int i, String str) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        return new m(str, (String) null, new String(bArr, 0, b(bArr, 0), "ISO-8859-1"));
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ boolean b(int i, int i2, int i3, int i4, int i5) {
        return false;
    }

    private static byte[] b(byte[] bArr, int i, int i2) {
        return i2 <= i ? ai.f13530f : Arrays.copyOfRange(bArr, i, i2);
    }

    private static b c(y yVar, int i, String str) {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        return new b(str, bArr);
    }

    private static k c(y yVar, int i) throws UnsupportedEncodingException {
        byte[] bArr = new byte[i];
        yVar.a(bArr, 0, i);
        int b2 = b(bArr, 0);
        return new k(new String(bArr, 0, b2, "ISO-8859-1"), b(bArr, b2 + 1, i));
    }

    private static f d(y yVar, int i) throws UnsupportedEncodingException {
        int h2 = yVar.h();
        String a2 = a(h2);
        int i2 = i - 1;
        byte[] bArr = new byte[i2];
        yVar.a(bArr, 0, i2);
        int b2 = b(bArr, 0);
        String str = new String(bArr, 0, b2, "ISO-8859-1");
        int i3 = b2 + 1;
        int a3 = a(bArr, i3, h2);
        String a4 = a(bArr, i3, a3, a2);
        int b3 = a3 + b(h2);
        int a5 = a(bArr, b3, h2);
        return new f(str, a4, a(bArr, b3, a5, a2), b(bArr, a5 + b(h2), i2));
    }

    private static e e(y yVar, int i) throws UnsupportedEncodingException {
        if (i < 4) {
            return null;
        }
        int h2 = yVar.h();
        String a2 = a(h2);
        byte[] bArr = new byte[3];
        yVar.a(bArr, 0, 3);
        String str = new String(bArr, 0, 3);
        int i2 = i - 4;
        byte[] bArr2 = new byte[i2];
        yVar.a(bArr2, 0, i2);
        int a3 = a(bArr2, 0, h2);
        String str2 = new String(bArr2, 0, a3, a2);
        int b2 = a3 + b(h2);
        return new e(str, str2, a(bArr2, b2, a(bArr2, b2, h2), a2));
    }

    private static j f(y yVar, int i) {
        int i2 = yVar.i();
        int m = yVar.m();
        int m2 = yVar.m();
        int h2 = yVar.h();
        int h3 = yVar.h();
        x xVar = new x();
        xVar.a(yVar);
        int i3 = ((i - 10) * 8) / (h2 + h3);
        int[] iArr = new int[i3];
        int[] iArr2 = new int[i3];
        for (int i4 = 0; i4 < i3; i4++) {
            int c2 = xVar.c(h2);
            int c3 = xVar.c(h3);
            iArr[i4] = c2;
            iArr2[i4] = c3;
        }
        return new j(i2, m, m2, iArr, iArr2);
    }

    private static int g(y yVar, int i) {
        byte[] d2 = yVar.d();
        int c2 = yVar.c();
        int i2 = c2;
        while (true) {
            int i3 = i2 + 1;
            if (i3 >= c2 + i) {
                return i;
            }
            if ((d2[i2] & 255) == 255 && d2[i3] == 0) {
                System.arraycopy(d2, i2 + 2, d2, i3, (i - (i2 - c2)) - 2);
                i--;
            }
            i2 = i3;
        }
    }

    /* access modifiers changed from: protected */
    public com.applovin.exoplayer2.g.a a(d dVar, ByteBuffer byteBuffer) {
        return a(byteBuffer.array(), byteBuffer.limit());
    }

    public com.applovin.exoplayer2.g.a a(byte[] bArr, int i) {
        ArrayList arrayList = new ArrayList();
        y yVar = new y(bArr, i);
        b a2 = a(yVar);
        if (a2 == null) {
            return null;
        }
        int c2 = yVar.c();
        int i2 = a2.f12640a == 2 ? 6 : 10;
        int b2 = a2.f12642c;
        if (a2.f12641b) {
            b2 = g(yVar, a2.f12642c);
        }
        yVar.c(c2 + b2);
        boolean z = false;
        if (!a(yVar, a2.f12640a, i2, false)) {
            if (a2.f12640a != 4 || !a(yVar, 4, i2, true)) {
                q.c("Id3Decoder", "Failed to validate ID3 tag with majorVersion=" + a2.f12640a);
                return null;
            }
            z = true;
        }
        while (yVar.a() >= i2) {
            h a3 = a(a2.f12640a, yVar, z, i2, this.f12639b);
            if (a3 != null) {
                arrayList.add(a3);
            }
        }
        return new com.applovin.exoplayer2.g.a((List<? extends a.C0122a>) arrayList);
    }
}
