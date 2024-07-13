package com.applovin.exoplayer2.e.e;

import android.util.Pair;
import android.util.SparseArray;
import com.applovin.exoplayer2.d.e;
import com.applovin.exoplayer2.e.h;
import com.applovin.exoplayer2.e.i;
import com.applovin.exoplayer2.e.j;
import com.applovin.exoplayer2.e.l;
import com.applovin.exoplayer2.e.u;
import com.applovin.exoplayer2.e.v;
import com.applovin.exoplayer2.e.x;
import com.applovin.exoplayer2.k.g;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.v;
import com.applovin.exoplayer2.l.y;
import com.unity3d.services.core.device.MimeTypes;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.UUID;
import kotlin.KotlinVersion;

public class d implements h {

    /* renamed from: a  reason: collision with root package name */
    public static final l f11918a = $$Lambda$d$b5Tl46ouRapk5XizpDUp4gtjbIU.INSTANCE;

    /* renamed from: b  reason: collision with root package name */
    private static final byte[] f11919b = {49, 10, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 32, 45, 45, 62, 32, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 48, 48, 10};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final byte[] f11920c = ai.c("Format: Start, End, ReadOrder, Layer, Style, Name, MarginL, MarginR, MarginV, Effect, Text");

    /* renamed from: d  reason: collision with root package name */
    private static final byte[] f11921d = {68, 105, 97, 108, 111, 103, 117, 101, 58, 32, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44, 48, 58, 48, 48, 58, 48, 48, 58, 48, 48, 44};
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public static final UUID f11922e = new UUID(72057594037932032L, -9223371306706625679L);
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public static final Map<String, Integer> f11923f;
    private b A;
    private boolean B;
    private int C;
    private long D;
    private boolean E;
    private long F;
    private long G;
    private long H;
    private r I;
    private r J;
    private boolean K;
    private boolean L;
    private int M;
    private long N;
    private long O;
    private int P;
    private int Q;
    private int[] R;
    private int S;
    private int T;
    private int U;
    private int V;
    private boolean W;
    private int X;
    private int Y;
    private int Z;
    private boolean aa;
    private boolean ab;
    private boolean ac;
    private int ad;
    private byte ae;
    private boolean af;
    private j ag;

    /* renamed from: g  reason: collision with root package name */
    private final c f11924g;

    /* renamed from: h  reason: collision with root package name */
    private final f f11925h;
    private final SparseArray<b> i;
    private final boolean j;
    private final y k;
    private final y l;
    private final y m;
    private final y n;
    private final y o;
    private final y p;
    private final y q;
    private final y r;
    private final y s;
    private final y t;
    private ByteBuffer u;
    private long v;
    private long w;
    private long x;
    private long y;
    private long z;

    private final class a implements b {
        private a() {
        }

        public int a(int i) {
            return d.this.a(i);
        }

        public void a(int i, double d2) throws com.applovin.exoplayer2.ai {
            d.this.a(i, d2);
        }

        public void a(int i, int i2, i iVar) throws IOException {
            d.this.a(i, i2, iVar);
        }

        public void a(int i, long j) throws com.applovin.exoplayer2.ai {
            d.this.a(i, j);
        }

        public void a(int i, long j, long j2) throws com.applovin.exoplayer2.ai {
            d.this.a(i, j, j2);
        }

        public void a(int i, String str) throws com.applovin.exoplayer2.ai {
            d.this.a(i, str);
        }

        public boolean b(int i) {
            return d.this.b(i);
        }

        public void c(int i) throws com.applovin.exoplayer2.ai {
            d.this.c(i);
        }
    }

    private static final class b {
        public int A;
        public int B;
        public float C;
        public float D;
        public float E;
        public float F;
        public float G;
        public float H;
        public float I;
        public float J;
        public float K;
        public float L;
        public byte[] M;
        public int N;
        public int O;
        public int P;
        public long Q;
        public long R;
        public c S;
        public boolean T;
        public boolean U;
        public x V;
        public int W;
        /* access modifiers changed from: private */
        public int X;
        /* access modifiers changed from: private */
        public String Y;

        /* renamed from: a  reason: collision with root package name */
        public String f11927a;

        /* renamed from: b  reason: collision with root package name */
        public String f11928b;

        /* renamed from: c  reason: collision with root package name */
        public int f11929c;

        /* renamed from: d  reason: collision with root package name */
        public int f11930d;

        /* renamed from: e  reason: collision with root package name */
        public int f11931e;

        /* renamed from: f  reason: collision with root package name */
        public int f11932f;

        /* renamed from: g  reason: collision with root package name */
        public boolean f11933g;

        /* renamed from: h  reason: collision with root package name */
        public byte[] f11934h;
        public x.a i;
        public byte[] j;
        public e k;
        public int l;
        public int m;
        public int n;
        public int o;
        public int p;
        public int q;
        public float r;
        public float s;
        public float t;
        public byte[] u;
        public int v;
        public boolean w;
        public int x;
        public int y;
        public int z;

        private b() {
            this.l = -1;
            this.m = -1;
            this.n = -1;
            this.o = -1;
            this.p = 0;
            this.q = -1;
            this.r = 0.0f;
            this.s = 0.0f;
            this.t = 0.0f;
            this.u = null;
            this.v = -1;
            this.w = false;
            this.x = -1;
            this.y = -1;
            this.z = -1;
            this.A = 1000;
            this.B = 200;
            this.C = -1.0f;
            this.D = -1.0f;
            this.E = -1.0f;
            this.F = -1.0f;
            this.G = -1.0f;
            this.H = -1.0f;
            this.I = -1.0f;
            this.J = -1.0f;
            this.K = -1.0f;
            this.L = -1.0f;
            this.N = 1;
            this.O = -1;
            this.P = 8000;
            this.Q = 0;
            this.R = 0;
            this.U = true;
            this.Y = "eng";
        }

        private static Pair<String, List<byte[]>> a(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                yVar.e(16);
                long p2 = yVar.p();
                if (p2 == 1482049860) {
                    return new Pair<>("video/divx", (Object) null);
                }
                if (p2 == 859189832) {
                    return new Pair<>("video/3gpp", (Object) null);
                }
                if (p2 == 826496599) {
                    byte[] d2 = yVar.d();
                    for (int c2 = yVar.c() + 20; c2 < d2.length - 4; c2++) {
                        if (d2[c2] == 0 && d2[c2 + 1] == 0 && d2[c2 + 2] == 1 && d2[c2 + 3] == 15) {
                            return new Pair<>("video/wvc1", Collections.singletonList(Arrays.copyOfRange(d2, c2, d2.length)));
                        }
                    }
                    throw com.applovin.exoplayer2.ai.b("Failed to find FourCC VC1 initialization data", (Throwable) null);
                }
                q.c("MatroskaExtractor", "Unknown FourCC. Setting mimeType to video/x-unknown");
                return new Pair<>("video/x-unknown", (Object) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing FourCC private data", (Throwable) null);
            }
        }

        private static List<byte[]> a(byte[] bArr) throws com.applovin.exoplayer2.ai {
            try {
                if (bArr[0] == 2) {
                    int i2 = 1;
                    int i3 = 0;
                    while ((bArr[i2] & 255) == 255) {
                        i3 += KotlinVersion.MAX_COMPONENT_VALUE;
                        i2++;
                    }
                    int i4 = i2 + 1;
                    int i5 = i3 + (bArr[i2] & 255);
                    int i6 = 0;
                    while ((bArr[i4] & 255) == 255) {
                        i6 += KotlinVersion.MAX_COMPONENT_VALUE;
                        i4++;
                    }
                    int i7 = i4 + 1;
                    int i8 = i6 + (bArr[i4] & 255);
                    if (bArr[i7] == 1) {
                        byte[] bArr2 = new byte[i5];
                        System.arraycopy(bArr, i7, bArr2, 0, i5);
                        int i9 = i7 + i5;
                        if (bArr[i9] == 3) {
                            int i10 = i9 + i8;
                            if (bArr[i10] == 5) {
                                byte[] bArr3 = new byte[(bArr.length - i10)];
                                System.arraycopy(bArr, i10, bArr3, 0, bArr.length - i10);
                                ArrayList arrayList = new ArrayList(2);
                                arrayList.add(bArr2);
                                arrayList.add(bArr3);
                                return arrayList;
                            }
                            throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", (Throwable) null);
                        }
                        throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", (Throwable) null);
                    }
                    throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", (Throwable) null);
                }
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", (Throwable) null);
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing vorbis codec private", (Throwable) null);
            }
        }

        private byte[] a(String str) throws com.applovin.exoplayer2.ai {
            byte[] bArr = this.j;
            if (bArr != null) {
                return bArr;
            }
            throw com.applovin.exoplayer2.ai.b("Missing CodecPrivate for codec " + str, (Throwable) null);
        }

        private static boolean b(y yVar) throws com.applovin.exoplayer2.ai {
            try {
                int j2 = yVar.j();
                if (j2 == 1) {
                    return true;
                }
                if (j2 != 65534) {
                    return false;
                }
                yVar.d(24);
                return yVar.s() == d.f11922e.getMostSignificantBits() && yVar.s() == d.f11922e.getLeastSignificantBits();
            } catch (ArrayIndexOutOfBoundsException unused) {
                throw com.applovin.exoplayer2.ai.b("Error parsing MS/ACM codec private", (Throwable) null);
            }
        }

        private byte[] c() {
            if (this.C == -1.0f || this.D == -1.0f || this.E == -1.0f || this.F == -1.0f || this.G == -1.0f || this.H == -1.0f || this.I == -1.0f || this.J == -1.0f || this.K == -1.0f || this.L == -1.0f) {
                return null;
            }
            byte[] bArr = new byte[25];
            ByteBuffer order = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN);
            order.put((byte) 0);
            order.putShort((short) ((int) ((this.C * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.D * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.E * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.F * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.G * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.H * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.I * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) ((this.J * 50000.0f) + 0.5f)));
            order.putShort((short) ((int) (this.K + 0.5f)));
            order.putShort((short) ((int) (this.L + 0.5f)));
            order.putShort((short) this.A);
            order.putShort((short) this.B);
            return bArr;
        }

        /* access modifiers changed from: private */
        public void d() {
            com.applovin.exoplayer2.l.a.b(this.V);
        }

        public void a() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a(this);
            }
        }

        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v19, resolved type: java.lang.Object} */
        /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r16v17, resolved type: java.lang.String} */
        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* JADX WARNING: Code restructure failed: missing block: B:120:0x0216, code lost:
            r1.append(r4);
            r1.append(r0.O);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:121:0x021f, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:128:0x024b, code lost:
            r1.append(r3);
            r1.append("audio/x-unknown");
            com.applovin.exoplayer2.l.q.c("MatroskaExtractor", r1.toString());
            r1 = null;
            r3 = null;
            r16 = "audio/x-unknown";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:137:0x028c, code lost:
            r1 = null;
            r3 = null;
            r6 = -1;
            r15 = 4096;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:141:0x0300, code lost:
            r3 = null;
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:144:0x0321, code lost:
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:147:0x0356, code lost:
            r6 = -1;
            r15 = -1;
            r17 = r3;
            r3 = r1;
            r1 = r17;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:157:0x0376, code lost:
            r1 = null;
            r3 = null;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:158:0x0378, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:159:0x0379, code lost:
            r15 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:160:0x037a, code lost:
            r4 = r0.M;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:161:0x037c, code lost:
            if (r4 == null) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:162:0x037e, code lost:
            r4 = com.applovin.exoplayer2.m.c.a(new com.applovin.exoplayer2.l.y(r4));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:163:0x0387, code lost:
            if (r4 == null) goto L_0x038d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:164:0x0389, code lost:
            r3 = r4.f13680c;
            r16 = "video/dolby-vision";
         */
        /* JADX WARNING: Code restructure failed: missing block: B:165:0x038d, code lost:
            r4 = r16;
            r5 = r0.U | 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:166:0x0394, code lost:
            if (r0.T == false) goto L_0x0398;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:167:0x0396, code lost:
            r7 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:168:0x0398, code lost:
            r7 = 0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:169:0x0399, code lost:
            r5 = r5 | r7;
            r7 = new com.applovin.exoplayer2.v.a();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:170:0x03a3, code lost:
            if (com.applovin.exoplayer2.l.u.a(r4) == false) goto L_0x03b7;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:171:0x03a5, code lost:
            r7.k(r0.N).l(r0.P).m(r6);
            r8 = 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:173:0x03bb, code lost:
            if (com.applovin.exoplayer2.l.u.b(r4) == false) goto L_0x0492;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:175:0x03bf, code lost:
            if (r0.p != 0) goto L_0x03d3;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:176:0x03c1, code lost:
            r2 = r0.n;
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:177:0x03c4, code lost:
            if (r2 != -1) goto L_0x03c8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:178:0x03c6, code lost:
            r2 = r0.l;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:179:0x03c8, code lost:
            r0.n = r2;
            r2 = r0.o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:180:0x03cc, code lost:
            if (r2 != -1) goto L_0x03d0;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:181:0x03ce, code lost:
            r2 = r0.m;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:182:0x03d0, code lost:
            r0.o = r2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:183:0x03d3, code lost:
            r6 = -1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:184:0x03d4, code lost:
            r2 = -1.0f;
            r8 = r0.n;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:185:0x03d8, code lost:
            if (r8 == r6) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:186:0x03da, code lost:
            r11 = r0.o;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:187:0x03dc, code lost:
            if (r11 == r6) goto L_0x03e9;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:188:0x03de, code lost:
            r2 = ((float) (r0.m * r8)) / ((float) (r0.l * r11));
         */
        /* JADX WARNING: Code restructure failed: missing block: B:190:0x03eb, code lost:
            if (r0.w == false) goto L_0x03fc;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:191:0x03ed, code lost:
            r10 = new com.applovin.exoplayer2.m.b(r0.x, r0.z, r0.y, c());
         */
        /* JADX WARNING: Code restructure failed: missing block: B:193:0x03fe, code lost:
            if (r0.f11927a == null) goto L_0x041c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:195:0x040a, code lost:
            if (com.applovin.exoplayer2.e.e.d.b().containsKey(r0.f11927a) == false) goto L_0x041c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:196:0x040c, code lost:
            r6 = ((java.lang.Integer) com.applovin.exoplayer2.e.e.d.b().get(r0.f11927a)).intValue();
         */
        /* JADX WARNING: Code restructure failed: missing block: B:198:0x041e, code lost:
            if (r0.q != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:200:0x0427, code lost:
            if (java.lang.Float.compare(r0.r, 0.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:202:0x042f, code lost:
            if (java.lang.Float.compare(r0.s, 0.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:204:0x0437, code lost:
            if (java.lang.Float.compare(r0.t, 0.0f) != 0) goto L_0x043a;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:206:0x0442, code lost:
            if (java.lang.Float.compare(r0.s, 90.0f) != 0) goto L_0x0447;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:207:0x0444, code lost:
            r9 = 90;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:209:0x044f, code lost:
            if (java.lang.Float.compare(r0.s, -180.0f) == 0) goto L_0x0469;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:211:0x0459, code lost:
            if (java.lang.Float.compare(r0.s, 180.0f) != 0) goto L_0x045c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:213:0x0464, code lost:
            if (java.lang.Float.compare(r0.s, -90.0f) != 0) goto L_0x046c;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:214:0x0466, code lost:
            r9 = 270;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:215:0x0469, code lost:
            r9 = 180;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:216:0x046c, code lost:
            r9 = r6;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:217:0x046d, code lost:
            r7.g(r0.l).h(r0.m).b(r2).i(r9).a(r0.u).j(r0.v).a(r10);
            r8 = 2;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:219:0x0496, code lost:
            if ("application/x-subrip".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:221:0x049c, code lost:
            if ("text/x-ssa".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:223:0x04a2, code lost:
            if ("application/vobsub".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:225:0x04a8, code lost:
            if ("application/pgs".equals(r4) != false) goto L_0x04b8;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:227:0x04ae, code lost:
            if ("application/dvbsubs".equals(r4) == false) goto L_0x04b1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:229:0x04b7, code lost:
            throw com.applovin.exoplayer2.ai.b("Unexpected MIME type.", (java.lang.Throwable) null);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:231:0x04ba, code lost:
            if (r0.f11927a == null) goto L_0x04cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:233:0x04c6, code lost:
            if (com.applovin.exoplayer2.e.e.d.b().containsKey(r0.f11927a) != false) goto L_0x04cd;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:234:0x04c8, code lost:
            r7.b(r0.f11927a);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:235:0x04cd, code lost:
            r1 = r7.a(r20).f(r4).f(r15).c(r0.Y).b((int) r5).a((java.util.List<byte[]>) r1).d(r3).a(r0.k).a();
            r2 = r19.a(r0.f11929c, r8);
            r0.V = r2;
            r2.a(r1);
         */
        /* JADX WARNING: Code restructure failed: missing block: B:236:0x0504, code lost:
            return;
         */
        /* JADX WARNING: Multi-variable type inference failed */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public void a(com.applovin.exoplayer2.e.j r19, int r20) throws com.applovin.exoplayer2.ai {
            /*
                r18 = this;
                r0 = r18
                java.lang.String r1 = r0.f11928b
                int r2 = r1.hashCode()
                r4 = 16
                r6 = 4
                r7 = 8
                r8 = 3
                r9 = 0
                switch(r2) {
                    case -2095576542: goto L_0x0179;
                    case -2095575984: goto L_0x016f;
                    case -1985379776: goto L_0x0164;
                    case -1784763192: goto L_0x0159;
                    case -1730367663: goto L_0x014e;
                    case -1482641358: goto L_0x0143;
                    case -1482641357: goto L_0x0138;
                    case -1373388978: goto L_0x012d;
                    case -933872740: goto L_0x0122;
                    case -538363189: goto L_0x0117;
                    case -538363109: goto L_0x010c;
                    case -425012669: goto L_0x0100;
                    case -356037306: goto L_0x00f4;
                    case 62923557: goto L_0x00e8;
                    case 62923603: goto L_0x00dc;
                    case 62927045: goto L_0x00d0;
                    case 82318131: goto L_0x00c5;
                    case 82338133: goto L_0x00ba;
                    case 82338134: goto L_0x00af;
                    case 99146302: goto L_0x00a3;
                    case 444813526: goto L_0x0097;
                    case 542569478: goto L_0x008b;
                    case 635596514: goto L_0x007f;
                    case 725948237: goto L_0x0073;
                    case 725957860: goto L_0x0067;
                    case 738597099: goto L_0x005b;
                    case 855502857: goto L_0x004f;
                    case 1422270023: goto L_0x0043;
                    case 1809237540: goto L_0x0038;
                    case 1950749482: goto L_0x002c;
                    case 1950789798: goto L_0x0020;
                    case 1951062397: goto L_0x0014;
                    default: goto L_0x0012;
                }
            L_0x0012:
                goto L_0x0183
            L_0x0014:
                java.lang.String r2 = "A_OPUS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 12
                goto L_0x0184
            L_0x0020:
                java.lang.String r2 = "A_FLAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 22
                goto L_0x0184
            L_0x002c:
                java.lang.String r2 = "A_EAC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 17
                goto L_0x0184
            L_0x0038:
                java.lang.String r2 = "V_MPEG2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 3
                goto L_0x0184
            L_0x0043:
                java.lang.String r2 = "S_TEXT/UTF8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 27
                goto L_0x0184
            L_0x004f:
                java.lang.String r2 = "V_MPEGH/ISO/HEVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 8
                goto L_0x0184
            L_0x005b:
                java.lang.String r2 = "S_TEXT/ASS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 28
                goto L_0x0184
            L_0x0067:
                java.lang.String r2 = "A_PCM/INT/LIT"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 24
                goto L_0x0184
            L_0x0073:
                java.lang.String r2 = "A_PCM/INT/BIG"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 25
                goto L_0x0184
            L_0x007f:
                java.lang.String r2 = "A_PCM/FLOAT/IEEE"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 26
                goto L_0x0184
            L_0x008b:
                java.lang.String r2 = "A_DTS/EXPRESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 20
                goto L_0x0184
            L_0x0097:
                java.lang.String r2 = "V_THEORA"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 10
                goto L_0x0184
            L_0x00a3:
                java.lang.String r2 = "S_HDMV/PGS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 30
                goto L_0x0184
            L_0x00af:
                java.lang.String r2 = "V_VP9"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 1
                goto L_0x0184
            L_0x00ba:
                java.lang.String r2 = "V_VP8"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 0
                goto L_0x0184
            L_0x00c5:
                java.lang.String r2 = "V_AV1"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 2
                goto L_0x0184
            L_0x00d0:
                java.lang.String r2 = "A_DTS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 19
                goto L_0x0184
            L_0x00dc:
                java.lang.String r2 = "A_AC3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 16
                goto L_0x0184
            L_0x00e8:
                java.lang.String r2 = "A_AAC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 13
                goto L_0x0184
            L_0x00f4:
                java.lang.String r2 = "A_DTS/LOSSLESS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 21
                goto L_0x0184
            L_0x0100:
                java.lang.String r2 = "S_VOBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 29
                goto L_0x0184
            L_0x010c:
                java.lang.String r2 = "V_MPEG4/ISO/AVC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 7
                goto L_0x0184
            L_0x0117:
                java.lang.String r2 = "V_MPEG4/ISO/ASP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 5
                goto L_0x0184
            L_0x0122:
                java.lang.String r2 = "S_DVBSUB"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 31
                goto L_0x0184
            L_0x012d:
                java.lang.String r2 = "V_MS/VFW/FOURCC"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 9
                goto L_0x0184
            L_0x0138:
                java.lang.String r2 = "A_MPEG/L3"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 15
                goto L_0x0184
            L_0x0143:
                java.lang.String r2 = "A_MPEG/L2"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 14
                goto L_0x0184
            L_0x014e:
                java.lang.String r2 = "A_VORBIS"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 11
                goto L_0x0184
            L_0x0159:
                java.lang.String r2 = "A_TRUEHD"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 18
                goto L_0x0184
            L_0x0164:
                java.lang.String r2 = "A_MS/ACM"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 23
                goto L_0x0184
            L_0x016f:
                java.lang.String r2 = "V_MPEG4/ISO/SP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 4
                goto L_0x0184
            L_0x0179:
                java.lang.String r2 = "V_MPEG4/ISO/AP"
                boolean r1 = r1.equals(r2)
                if (r1 == 0) goto L_0x0183
                r1 = 6
                goto L_0x0184
            L_0x0183:
                r1 = -1
            L_0x0184:
                java.lang.String r2 = "application/dvbsubs"
                java.lang.String r11 = "application/pgs"
                java.lang.String r12 = "application/vobsub"
                java.lang.String r13 = "text/x-ssa"
                java.lang.String r14 = "application/x-subrip"
                java.lang.String r3 = ". Setting mimeType to "
                java.lang.String r16 = "audio/raw"
                java.lang.String r5 = "MatroskaExtractor"
                java.lang.String r15 = "audio/x-unknown"
                r10 = 0
                switch(r1) {
                    case 0: goto L_0x0374;
                    case 1: goto L_0x0371;
                    case 2: goto L_0x036e;
                    case 3: goto L_0x036b;
                    case 4: goto L_0x035e;
                    case 5: goto L_0x035e;
                    case 6: goto L_0x035e;
                    case 7: goto L_0x033d;
                    case 8: goto L_0x0323;
                    case 9: goto L_0x0308;
                    case 10: goto L_0x0304;
                    case 11: goto L_0x02f2;
                    case 12: goto L_0x02b1;
                    case 13: goto L_0x0293;
                    case 14: goto L_0x028a;
                    case 15: goto L_0x0287;
                    case 16: goto L_0x0283;
                    case 17: goto L_0x027f;
                    case 18: goto L_0x0274;
                    case 19: goto L_0x0270;
                    case 20: goto L_0x0270;
                    case 21: goto L_0x026c;
                    case 22: goto L_0x025e;
                    case 23: goto L_0x0223;
                    case 24: goto L_0x0207;
                    case 25: goto L_0x01f1;
                    case 26: goto L_0x01e2;
                    case 27: goto L_0x01dc;
                    case 28: goto L_0x01c9;
                    case 29: goto L_0x01ba;
                    case 30: goto L_0x01b4;
                    case 31: goto L_0x01a1;
                    default: goto L_0x019a;
                }
            L_0x019a:
                java.lang.String r1 = "Unrecognized codec identifier."
                com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.ai.b(r1, r10)
                throw r1
            L_0x01a1:
                byte[] r1 = new byte[r6]
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                java.lang.System.arraycopy(r3, r9, r1, r9, r6)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.a.s.a(r1)
                r16 = r2
                goto L_0x0321
            L_0x01b4:
                r1 = r10
                r3 = r1
                r16 = r11
                goto L_0x0378
            L_0x01ba:
                java.lang.String r1 = r0.f11928b
                byte[] r1 = r0.a((java.lang.String) r1)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.a.s.a(r1)
                r3 = r10
                r16 = r12
                goto L_0x0378
            L_0x01c9:
                byte[] r1 = com.applovin.exoplayer2.e.e.d.f11920c
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                com.applovin.exoplayer2.common.a.s r1 = com.applovin.exoplayer2.common.a.s.a(r1, r3)
                r3 = r10
                r16 = r13
                goto L_0x0378
            L_0x01dc:
                r1 = r10
                r3 = r1
                r16 = r14
                goto L_0x0378
            L_0x01e2:
                int r1 = r0.O
                r4 = 32
                if (r1 != r4) goto L_0x01e9
                goto L_0x021f
            L_0x01e9:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported floating point PCM bit depth: "
                goto L_0x0216
            L_0x01f1:
                int r1 = r0.O
                if (r1 != r7) goto L_0x01fa
                r1 = r10
                r3 = r1
                r6 = 3
                goto L_0x0379
            L_0x01fa:
                if (r1 != r4) goto L_0x01ff
                r6 = 268435456(0x10000000, float:2.5243549E-29)
                goto L_0x021f
            L_0x01ff:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported big endian PCM bit depth: "
                goto L_0x0216
            L_0x0207:
                int r1 = r0.O
                int r6 = com.applovin.exoplayer2.l.ai.c((int) r1)
                if (r6 != 0) goto L_0x021f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported little endian PCM bit depth: "
            L_0x0216:
                r1.append(r4)
                int r4 = r0.O
                r1.append(r4)
                goto L_0x024b
            L_0x021f:
                r1 = r10
                r3 = r1
                goto L_0x0379
            L_0x0223:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r4 = r0.f11928b
                byte[] r4 = r0.a((java.lang.String) r4)
                r1.<init>((byte[]) r4)
                boolean r1 = b((com.applovin.exoplayer2.l.y) r1)
                if (r1 == 0) goto L_0x0244
                int r1 = r0.O
                int r6 = com.applovin.exoplayer2.l.ai.c((int) r1)
                if (r6 != 0) goto L_0x021f
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r4 = "Unsupported PCM bit depth: "
                goto L_0x0216
            L_0x0244:
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r3 = "Non-PCM MS/ACM is unsupported. Setting mimeType to "
            L_0x024b:
                r1.append(r3)
                r1.append(r15)
                java.lang.String r1 = r1.toString()
                com.applovin.exoplayer2.l.q.c(r5, r1)
                r1 = r10
                r3 = r1
                r16 = r15
                goto L_0x0378
            L_0x025e:
                java.lang.String r1 = r0.f11928b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                java.lang.String r16 = "audio/flac"
                goto L_0x0321
            L_0x026c:
                java.lang.String r16 = "audio/vnd.dts.hd"
                goto L_0x0376
            L_0x0270:
                java.lang.String r16 = "audio/vnd.dts"
                goto L_0x0376
            L_0x0274:
                com.applovin.exoplayer2.e.e.d$c r1 = new com.applovin.exoplayer2.e.e.d$c
                r1.<init>()
                r0.S = r1
                java.lang.String r16 = "audio/true-hd"
                goto L_0x0376
            L_0x027f:
                java.lang.String r16 = "audio/eac3"
                goto L_0x0376
            L_0x0283:
                java.lang.String r16 = "audio/ac3"
                goto L_0x0376
            L_0x0287:
                java.lang.String r16 = "audio/mpeg"
                goto L_0x028c
            L_0x028a:
                java.lang.String r16 = "audio/mpeg-L2"
            L_0x028c:
                r1 = r10
                r3 = r1
                r6 = -1
                r15 = 4096(0x1000, float:5.74E-42)
                goto L_0x037a
            L_0x0293:
                java.lang.String r1 = r0.f11928b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = java.util.Collections.singletonList(r1)
                byte[] r3 = r0.j
                com.applovin.exoplayer2.b.a$a r3 = com.applovin.exoplayer2.b.a.a((byte[]) r3)
                int r4 = r3.f11190a
                r0.P = r4
                int r4 = r3.f11191b
                r0.N = r4
                java.lang.String r3 = r3.f11192c
                java.lang.String r16 = "audio/mp4a-latm"
                goto L_0x0378
            L_0x02b1:
                r15 = 5760(0x1680, float:8.071E-42)
                java.util.ArrayList r1 = new java.util.ArrayList
                r1.<init>(r8)
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.Q
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.nio.ByteBuffer r3 = java.nio.ByteBuffer.allocate(r7)
                java.nio.ByteOrder r4 = java.nio.ByteOrder.LITTLE_ENDIAN
                java.nio.ByteBuffer r3 = r3.order(r4)
                long r4 = r0.R
                java.nio.ByteBuffer r3 = r3.putLong(r4)
                byte[] r3 = r3.array()
                r1.add(r3)
                java.lang.String r16 = "audio/opus"
                goto L_0x0300
            L_0x02f2:
                r15 = 8192(0x2000, float:1.14794E-41)
                java.lang.String r1 = r0.f11928b
                byte[] r1 = r0.a((java.lang.String) r1)
                java.util.List r1 = a((byte[]) r1)
                java.lang.String r16 = "audio/vorbis"
            L_0x0300:
                r3 = r10
                r6 = -1
                goto L_0x037a
            L_0x0304:
                java.lang.String r16 = "video/x-unknown"
                goto L_0x0376
            L_0x0308:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                android.util.Pair r1 = a((com.applovin.exoplayer2.l.y) r1)
                java.lang.Object r3 = r1.first
                r16 = r3
                java.lang.String r16 = (java.lang.String) r16
                java.lang.Object r1 = r1.second
                java.util.List r1 = (java.util.List) r1
            L_0x0321:
                r3 = r10
                goto L_0x0378
            L_0x0323:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.exoplayer2.m.f r1 = com.applovin.exoplayer2.m.f.a(r1)
                java.util.List<byte[]> r3 = r1.f13705a
                int r4 = r1.f13706b
                r0.W = r4
                java.lang.String r1 = r1.f13707c
                java.lang.String r16 = "video/hevc"
                goto L_0x0356
            L_0x033d:
                com.applovin.exoplayer2.l.y r1 = new com.applovin.exoplayer2.l.y
                java.lang.String r3 = r0.f11928b
                byte[] r3 = r0.a((java.lang.String) r3)
                r1.<init>((byte[]) r3)
                com.applovin.exoplayer2.m.a r1 = com.applovin.exoplayer2.m.a.a(r1)
                java.util.List<byte[]> r3 = r1.f13621a
                int r4 = r1.f13622b
                r0.W = r4
                java.lang.String r1 = r1.f13626f
                java.lang.String r16 = "video/avc"
            L_0x0356:
                r6 = -1
                r15 = -1
                r17 = r3
                r3 = r1
                r1 = r17
                goto L_0x037a
            L_0x035e:
                byte[] r1 = r0.j
                if (r1 != 0) goto L_0x0364
                r1 = r10
                goto L_0x0368
            L_0x0364:
                java.util.List r1 = java.util.Collections.singletonList(r1)
            L_0x0368:
                java.lang.String r16 = "video/mp4v-es"
                goto L_0x0321
            L_0x036b:
                java.lang.String r16 = "video/mpeg2"
                goto L_0x0376
            L_0x036e:
                java.lang.String r16 = "video/av01"
                goto L_0x0376
            L_0x0371:
                java.lang.String r16 = "video/x-vnd.on2.vp9"
                goto L_0x0376
            L_0x0374:
                java.lang.String r16 = "video/x-vnd.on2.vp8"
            L_0x0376:
                r1 = r10
                r3 = r1
            L_0x0378:
                r6 = -1
            L_0x0379:
                r15 = -1
            L_0x037a:
                byte[] r4 = r0.M
                if (r4 == 0) goto L_0x038d
                com.applovin.exoplayer2.l.y r5 = new com.applovin.exoplayer2.l.y
                r5.<init>((byte[]) r4)
                com.applovin.exoplayer2.m.c r4 = com.applovin.exoplayer2.m.c.a(r5)
                if (r4 == 0) goto L_0x038d
                java.lang.String r3 = r4.f13680c
                java.lang.String r16 = "video/dolby-vision"
            L_0x038d:
                r4 = r16
                boolean r5 = r0.U
                r5 = r5 | r9
                boolean r7 = r0.T
                if (r7 == 0) goto L_0x0398
                r7 = 2
                goto L_0x0399
            L_0x0398:
                r7 = 0
            L_0x0399:
                r5 = r5 | r7
                com.applovin.exoplayer2.v$a r7 = new com.applovin.exoplayer2.v$a
                r7.<init>()
                boolean r16 = com.applovin.exoplayer2.l.u.a((java.lang.String) r4)
                if (r16 == 0) goto L_0x03b7
                int r2 = r0.N
                com.applovin.exoplayer2.v$a r2 = r7.k((int) r2)
                int r8 = r0.P
                com.applovin.exoplayer2.v$a r2 = r2.l((int) r8)
                r2.m((int) r6)
                r8 = 1
                goto L_0x04b8
            L_0x03b7:
                boolean r6 = com.applovin.exoplayer2.l.u.b(r4)
                if (r6 == 0) goto L_0x0492
                int r2 = r0.p
                if (r2 != 0) goto L_0x03d3
                int r2 = r0.n
                r6 = -1
                if (r2 != r6) goto L_0x03c8
                int r2 = r0.l
            L_0x03c8:
                r0.n = r2
                int r2 = r0.o
                if (r2 != r6) goto L_0x03d0
                int r2 = r0.m
            L_0x03d0:
                r0.o = r2
                goto L_0x03d4
            L_0x03d3:
                r6 = -1
            L_0x03d4:
                r2 = -1082130432(0xffffffffbf800000, float:-1.0)
                int r8 = r0.n
                if (r8 == r6) goto L_0x03e9
                int r11 = r0.o
                if (r11 == r6) goto L_0x03e9
                int r2 = r0.m
                int r2 = r2 * r8
                float r2 = (float) r2
                int r8 = r0.l
                int r8 = r8 * r11
                float r8 = (float) r8
                float r2 = r2 / r8
            L_0x03e9:
                boolean r8 = r0.w
                if (r8 == 0) goto L_0x03fc
                byte[] r8 = r18.c()
                com.applovin.exoplayer2.m.b r10 = new com.applovin.exoplayer2.m.b
                int r11 = r0.x
                int r12 = r0.z
                int r13 = r0.y
                r10.<init>(r11, r12, r13, r8)
            L_0x03fc:
                java.lang.String r8 = r0.f11927a
                if (r8 == 0) goto L_0x041c
                java.util.Map r8 = com.applovin.exoplayer2.e.e.d.f11923f
                java.lang.String r11 = r0.f11927a
                boolean r8 = r8.containsKey(r11)
                if (r8 == 0) goto L_0x041c
                java.util.Map r6 = com.applovin.exoplayer2.e.e.d.f11923f
                java.lang.String r8 = r0.f11927a
                java.lang.Object r6 = r6.get(r8)
                java.lang.Integer r6 = (java.lang.Integer) r6
                int r6 = r6.intValue()
            L_0x041c:
                int r8 = r0.q
                if (r8 != 0) goto L_0x046c
                float r8 = r0.r
                r11 = 0
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x046c
                float r8 = r0.s
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x046c
                float r8 = r0.t
                int r8 = java.lang.Float.compare(r8, r11)
                if (r8 != 0) goto L_0x043a
                goto L_0x046d
            L_0x043a:
                float r8 = r0.s
                r9 = 1119092736(0x42b40000, float:90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x0447
                r9 = 90
                goto L_0x046d
            L_0x0447:
                float r8 = r0.s
                r9 = -1020002304(0xffffffffc3340000, float:-180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 == 0) goto L_0x0469
                float r8 = r0.s
                r9 = 1127481344(0x43340000, float:180.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x045c
                goto L_0x0469
            L_0x045c:
                float r8 = r0.s
                r9 = -1028390912(0xffffffffc2b40000, float:-90.0)
                int r8 = java.lang.Float.compare(r8, r9)
                if (r8 != 0) goto L_0x046c
                r9 = 270(0x10e, float:3.78E-43)
                goto L_0x046d
            L_0x0469:
                r9 = 180(0xb4, float:2.52E-43)
                goto L_0x046d
            L_0x046c:
                r9 = r6
            L_0x046d:
                int r6 = r0.l
                com.applovin.exoplayer2.v$a r6 = r7.g((int) r6)
                int r8 = r0.m
                com.applovin.exoplayer2.v$a r6 = r6.h((int) r8)
                com.applovin.exoplayer2.v$a r2 = r6.b((float) r2)
                com.applovin.exoplayer2.v$a r2 = r2.i((int) r9)
                byte[] r6 = r0.u
                com.applovin.exoplayer2.v$a r2 = r2.a((byte[]) r6)
                int r6 = r0.v
                com.applovin.exoplayer2.v$a r2 = r2.j((int) r6)
                r2.a((com.applovin.exoplayer2.m.b) r10)
                r8 = 2
                goto L_0x04b8
            L_0x0492:
                boolean r6 = r14.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r13.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r12.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r6 = r11.equals(r4)
                if (r6 != 0) goto L_0x04b8
                boolean r2 = r2.equals(r4)
                if (r2 == 0) goto L_0x04b1
                goto L_0x04b8
            L_0x04b1:
                java.lang.String r1 = "Unexpected MIME type."
                com.applovin.exoplayer2.ai r1 = com.applovin.exoplayer2.ai.b(r1, r10)
                throw r1
            L_0x04b8:
                java.lang.String r2 = r0.f11927a
                if (r2 == 0) goto L_0x04cd
                java.util.Map r2 = com.applovin.exoplayer2.e.e.d.f11923f
                java.lang.String r6 = r0.f11927a
                boolean r2 = r2.containsKey(r6)
                if (r2 != 0) goto L_0x04cd
                java.lang.String r2 = r0.f11927a
                r7.b((java.lang.String) r2)
            L_0x04cd:
                r2 = r20
                com.applovin.exoplayer2.v$a r2 = r7.a((int) r2)
                com.applovin.exoplayer2.v$a r2 = r2.f((java.lang.String) r4)
                com.applovin.exoplayer2.v$a r2 = r2.f((int) r15)
                java.lang.String r4 = r0.Y
                com.applovin.exoplayer2.v$a r2 = r2.c((java.lang.String) r4)
                com.applovin.exoplayer2.v$a r2 = r2.b((int) r5)
                com.applovin.exoplayer2.v$a r1 = r2.a((java.util.List<byte[]>) r1)
                com.applovin.exoplayer2.v$a r1 = r1.d((java.lang.String) r3)
                com.applovin.exoplayer2.d.e r2 = r0.k
                com.applovin.exoplayer2.v$a r1 = r1.a((com.applovin.exoplayer2.d.e) r2)
                com.applovin.exoplayer2.v r1 = r1.a()
                int r2 = r0.f11929c
                r3 = r19
                com.applovin.exoplayer2.e.x r2 = r3.a(r2, r8)
                r0.V = r2
                r2.a(r1)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.b.a(com.applovin.exoplayer2.e.j, int):void");
        }

        public void b() {
            c cVar = this.S;
            if (cVar != null) {
                cVar.a();
            }
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        private final byte[] f11935a = new byte[10];

        /* renamed from: b  reason: collision with root package name */
        private boolean f11936b;

        /* renamed from: c  reason: collision with root package name */
        private int f11937c;

        /* renamed from: d  reason: collision with root package name */
        private long f11938d;

        /* renamed from: e  reason: collision with root package name */
        private int f11939e;

        /* renamed from: f  reason: collision with root package name */
        private int f11940f;

        /* renamed from: g  reason: collision with root package name */
        private int f11941g;

        public void a() {
            this.f11936b = false;
            this.f11937c = 0;
        }

        public void a(b bVar) {
            if (this.f11937c > 0) {
                bVar.V.a(this.f11938d, this.f11939e, this.f11940f, this.f11941g, bVar.i);
                this.f11937c = 0;
            }
        }

        public void a(b bVar, long j, int i, int i2, int i3) {
            if (this.f11936b) {
                int i4 = this.f11937c;
                this.f11937c = i4 + 1;
                if (i4 == 0) {
                    this.f11938d = j;
                    this.f11939e = i;
                    this.f11940f = 0;
                }
                this.f11940f += i2;
                this.f11941g = i3;
                if (this.f11937c >= 16) {
                    a(bVar);
                }
            }
        }

        public void a(i iVar) throws IOException {
            if (!this.f11936b) {
                iVar.d(this.f11935a, 0, 10);
                iVar.a();
                if (com.applovin.exoplayer2.b.b.b(this.f11935a) != 0) {
                    this.f11936b = true;
                }
            }
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("htc_video_rotA-000", 0);
        hashMap.put("htc_video_rotA-090", 90);
        hashMap.put("htc_video_rotA-180", 180);
        hashMap.put("htc_video_rotA-270", 270);
        f11923f = Collections.unmodifiableMap(hashMap);
    }

    public d() {
        this(0);
    }

    public d(int i2) {
        this(new a(), i2);
    }

    d(c cVar, int i2) {
        this.w = -1;
        this.x = -9223372036854775807L;
        this.y = -9223372036854775807L;
        this.z = -9223372036854775807L;
        this.F = -1;
        this.G = -1;
        this.H = -9223372036854775807L;
        this.f11924g = cVar;
        cVar.a((b) new a());
        this.j = (i2 & 1) == 0;
        this.f11925h = new f();
        this.i = new SparseArray<>();
        this.m = new y(4);
        this.n = new y(ByteBuffer.allocate(4).putInt(-1).array());
        this.o = new y(4);
        this.k = new y(v.f13581a);
        this.l = new y(4);
        this.p = new y();
        this.q = new y();
        this.r = new y(8);
        this.s = new y();
        this.t = new y();
        this.R = new int[1];
    }

    private int a(i iVar, b bVar, int i2) throws IOException {
        int i3;
        if ("S_TEXT/UTF8".equals(bVar.f11928b)) {
            a(iVar, f11919b, i2);
        } else if ("S_TEXT/ASS".equals(bVar.f11928b)) {
            a(iVar, f11921d, i2);
        } else {
            x xVar = bVar.V;
            boolean z2 = true;
            if (!this.aa) {
                if (bVar.f11933g) {
                    this.U &= -1073741825;
                    int i4 = 128;
                    if (!this.ab) {
                        iVar.b(this.m.d(), 0, 1);
                        this.X++;
                        if ((this.m.d()[0] & 128) != 128) {
                            this.ae = this.m.d()[0];
                            this.ab = true;
                        } else {
                            throw com.applovin.exoplayer2.ai.b("Extension bit is set in signal byte", (Throwable) null);
                        }
                    }
                    if ((this.ae & 1) == 1) {
                        boolean z3 = (this.ae & 2) == 2;
                        this.U |= 1073741824;
                        if (!this.af) {
                            iVar.b(this.r.d(), 0, 8);
                            this.X += 8;
                            this.af = true;
                            byte[] d2 = this.m.d();
                            if (!z3) {
                                i4 = 0;
                            }
                            d2[0] = (byte) (i4 | 8);
                            this.m.d(0);
                            xVar.a(this.m, 1, 1);
                            this.Y++;
                            this.r.d(0);
                            xVar.a(this.r, 8, 1);
                            this.Y += 8;
                        }
                        if (z3) {
                            if (!this.ac) {
                                iVar.b(this.m.d(), 0, 1);
                                this.X++;
                                this.m.d(0);
                                this.ad = this.m.h();
                                this.ac = true;
                            }
                            int i5 = this.ad * 4;
                            this.m.a(i5);
                            iVar.b(this.m.d(), 0, i5);
                            this.X += i5;
                            short s2 = (short) ((this.ad / 2) + 1);
                            int i6 = (s2 * 6) + 2;
                            ByteBuffer byteBuffer = this.u;
                            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                                this.u = ByteBuffer.allocate(i6);
                            }
                            this.u.position(0);
                            this.u.putShort(s2);
                            int i7 = 0;
                            int i8 = 0;
                            while (true) {
                                i3 = this.ad;
                                if (i7 >= i3) {
                                    break;
                                }
                                int w2 = this.m.w();
                                if (i7 % 2 == 0) {
                                    this.u.putShort((short) (w2 - i8));
                                } else {
                                    this.u.putInt(w2 - i8);
                                }
                                i7++;
                                i8 = w2;
                            }
                            int i9 = (i2 - this.X) - i8;
                            int i10 = i3 % 2;
                            ByteBuffer byteBuffer2 = this.u;
                            if (i10 == 1) {
                                byteBuffer2.putInt(i9);
                            } else {
                                byteBuffer2.putShort((short) i9);
                                this.u.putInt(0);
                            }
                            this.s.a(this.u.array(), i6);
                            xVar.a(this.s, i6, 1);
                            this.Y += i6;
                        }
                    }
                } else if (bVar.f11934h != null) {
                    this.p.a(bVar.f11934h, bVar.f11934h.length);
                }
                if (bVar.f11932f > 0) {
                    this.U |= 268435456;
                    this.t.a(0);
                    this.m.a(4);
                    this.m.d()[0] = (byte) ((i2 >> 24) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.m.d()[1] = (byte) ((i2 >> 16) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.m.d()[2] = (byte) ((i2 >> 8) & KotlinVersion.MAX_COMPONENT_VALUE);
                    this.m.d()[3] = (byte) (i2 & KotlinVersion.MAX_COMPONENT_VALUE);
                    xVar.a(this.m, 4, 2);
                    this.Y += 4;
                }
                this.aa = true;
            }
            int b2 = i2 + this.p.b();
            if (!"V_MPEG4/ISO/AVC".equals(bVar.f11928b) && !"V_MPEGH/ISO/HEVC".equals(bVar.f11928b)) {
                if (bVar.S != null) {
                    if (this.p.b() != 0) {
                        z2 = false;
                    }
                    com.applovin.exoplayer2.l.a.b(z2);
                    bVar.S.a(iVar);
                }
                while (true) {
                    int i11 = this.X;
                    if (i11 >= b2) {
                        break;
                    }
                    int a2 = a(iVar, xVar, b2 - i11);
                    this.X += a2;
                    this.Y += a2;
                }
            } else {
                byte[] d3 = this.l.d();
                d3[0] = 0;
                d3[1] = 0;
                d3[2] = 0;
                int i12 = bVar.W;
                int i13 = 4 - bVar.W;
                while (this.X < b2) {
                    int i14 = this.Z;
                    if (i14 == 0) {
                        a(iVar, d3, i13, i12);
                        this.X += i12;
                        this.l.d(0);
                        this.Z = this.l.w();
                        this.k.d(0);
                        xVar.a(this.k, 4);
                        this.Y += 4;
                    } else {
                        int a3 = a(iVar, xVar, i14);
                        this.X += a3;
                        this.Y += a3;
                        this.Z -= a3;
                    }
                }
            }
            if ("A_VORBIS".equals(bVar.f11928b)) {
                this.n.d(0);
                xVar.a(this.n, 4);
                this.Y += 4;
            }
            return e();
        }
        return e();
    }

    private int a(i iVar, x xVar, int i2) throws IOException {
        int a2 = this.p.a();
        if (a2 <= 0) {
            return xVar.a((g) iVar, i2, false);
        }
        int min = Math.min(i2, a2);
        xVar.a(this.p, min);
        return min;
    }

    private long a(long j2) throws com.applovin.exoplayer2.ai {
        long j3 = this.x;
        if (j3 != -9223372036854775807L) {
            return ai.d(j2, j3, 1000);
        }
        throw com.applovin.exoplayer2.ai.b("Can't scale timecode prior to timecodeScale being set.", (Throwable) null);
    }

    private com.applovin.exoplayer2.e.v a(r rVar, r rVar2) {
        int i2;
        if (this.w == -1 || this.z == -9223372036854775807L || rVar == null || rVar.a() == 0 || rVar2 == null || rVar2.a() != rVar.a()) {
            return new v.b(this.z);
        }
        int a2 = rVar.a();
        int[] iArr = new int[a2];
        long[] jArr = new long[a2];
        long[] jArr2 = new long[a2];
        long[] jArr3 = new long[a2];
        int i3 = 0;
        for (int i4 = 0; i4 < a2; i4++) {
            jArr3[i4] = rVar.a(i4);
            jArr[i4] = this.w + rVar2.a(i4);
        }
        while (true) {
            i2 = a2 - 1;
            if (i3 >= i2) {
                break;
            }
            int i5 = i3 + 1;
            iArr[i3] = (int) (jArr[i5] - jArr[i3]);
            jArr2[i3] = jArr3[i5] - jArr3[i3];
            i3 = i5;
        }
        iArr[i2] = (int) ((this.w + this.v) - jArr[i2]);
        jArr2[i2] = this.z - jArr3[i2];
        long j2 = jArr2[i2];
        if (j2 <= 0) {
            q.c("MatroskaExtractor", "Discarding last cue point with unexpected duration: " + j2);
            iArr = Arrays.copyOf(iArr, i2);
            jArr = Arrays.copyOf(jArr, i2);
            jArr2 = Arrays.copyOf(jArr2, i2);
            jArr3 = Arrays.copyOf(jArr3, i2);
        }
        return new com.applovin.exoplayer2.e.c(iArr, jArr, jArr2, jArr3);
    }

    private void a(b bVar, long j2, int i2, int i3, int i4) {
        String str;
        if (bVar.S != null) {
            bVar.S.a(bVar, j2, i2, i3, i4);
        } else {
            if ("S_TEXT/UTF8".equals(bVar.f11928b) || "S_TEXT/ASS".equals(bVar.f11928b)) {
                if (this.Q > 1) {
                    str = "Skipping subtitle sample in laced block.";
                } else if (this.O == -9223372036854775807L) {
                    str = "Skipping subtitle sample with no duration.";
                } else {
                    a(bVar.f11928b, this.O, this.q.d());
                    int c2 = this.q.c();
                    while (true) {
                        if (c2 >= this.q.b()) {
                            break;
                        } else if (this.q.d()[c2] == 0) {
                            this.q.c(c2);
                            break;
                        } else {
                            c2++;
                        }
                    }
                    x xVar = bVar.V;
                    y yVar = this.q;
                    xVar.a(yVar, yVar.b());
                    i3 += this.q.b();
                }
                q.c("MatroskaExtractor", str);
            }
            if ((268435456 & i2) != 0) {
                if (this.Q > 1) {
                    i2 &= -268435457;
                } else {
                    int b2 = this.t.b();
                    bVar.V.a(this.t, b2, 2);
                    i3 += b2;
                }
            }
            bVar.V.a(j2, i2, i3, i4, bVar.i);
        }
        this.L = true;
    }

    private void a(i iVar, int i2) throws IOException {
        if (this.m.b() < i2) {
            if (this.m.e() < i2) {
                y yVar = this.m;
                yVar.b(Math.max(yVar.e() * 2, i2));
            }
            iVar.b(this.m.d(), this.m.b(), i2 - this.m.b());
            this.m.c(i2);
        }
    }

    private void a(i iVar, byte[] bArr, int i2) throws IOException {
        int length = bArr.length + i2;
        if (this.q.e() < length) {
            this.q.a(Arrays.copyOf(bArr, length + i2));
        } else {
            System.arraycopy(bArr, 0, this.q.d(), 0, bArr.length);
        }
        iVar.b(this.q.d(), bArr.length, i2);
        this.q.d(0);
        this.q.c(length);
    }

    private void a(i iVar, byte[] bArr, int i2, int i3) throws IOException {
        int min = Math.min(i3, this.p.a());
        iVar.b(bArr, i2 + min, i3 - min);
        if (min > 0) {
            this.p.a(bArr, i2, min);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x003b  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r4, long r5, byte[] r7) {
        /*
            int r0 = r4.hashCode()
            r1 = 738597099(0x2c0618eb, float:1.9056378E-12)
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x001b
            r1 = 1422270023(0x54c61e47, float:6.807292E12)
            if (r0 == r1) goto L_0x0011
            goto L_0x0025
        L_0x0011:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 0
            goto L_0x0026
        L_0x001b:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0025
            r4 = 1
            goto L_0x0026
        L_0x0025:
            r4 = -1
        L_0x0026:
            if (r4 == 0) goto L_0x003b
            if (r4 != r3) goto L_0x0035
            r0 = 10000(0x2710, double:4.9407E-320)
            java.lang.String r4 = "%01d:%02d:%02d:%02d"
            byte[] r4 = a((long) r5, (java.lang.String) r4, (long) r0)
            r5 = 21
            goto L_0x0045
        L_0x0035:
            java.lang.IllegalArgumentException r4 = new java.lang.IllegalArgumentException
            r4.<init>()
            throw r4
        L_0x003b:
            r0 = 1000(0x3e8, double:4.94E-321)
            java.lang.String r4 = "%02d:%02d:%02d,%03d"
            byte[] r4 = a((long) r5, (java.lang.String) r4, (long) r0)
            r5 = 19
        L_0x0045:
            int r6 = r4.length
            java.lang.System.arraycopy(r4, r2, r7, r5, r6)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.a(java.lang.String, long, byte[]):void");
    }

    private boolean a(u uVar, long j2) {
        if (this.E) {
            this.G = j2;
            uVar.f12451a = this.F;
            this.E = false;
            return true;
        }
        if (this.B) {
            long j3 = this.G;
            if (j3 != -1) {
                uVar.f12451a = j3;
                this.G = -1;
                return true;
            }
        }
        return false;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean a(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 0
            r2 = 1
            switch(r0) {
                case -2095576542: goto L_0x0170;
                case -2095575984: goto L_0x0166;
                case -1985379776: goto L_0x015b;
                case -1784763192: goto L_0x0150;
                case -1730367663: goto L_0x0145;
                case -1482641358: goto L_0x013a;
                case -1482641357: goto L_0x012f;
                case -1373388978: goto L_0x0124;
                case -933872740: goto L_0x0119;
                case -538363189: goto L_0x010e;
                case -538363109: goto L_0x0103;
                case -425012669: goto L_0x00f7;
                case -356037306: goto L_0x00eb;
                case 62923557: goto L_0x00df;
                case 62923603: goto L_0x00d3;
                case 62927045: goto L_0x00c7;
                case 82318131: goto L_0x00bc;
                case 82338133: goto L_0x00b1;
                case 82338134: goto L_0x00a6;
                case 99146302: goto L_0x009a;
                case 444813526: goto L_0x008e;
                case 542569478: goto L_0x0082;
                case 635596514: goto L_0x0076;
                case 725948237: goto L_0x006a;
                case 725957860: goto L_0x005e;
                case 738597099: goto L_0x0052;
                case 855502857: goto L_0x0046;
                case 1422270023: goto L_0x003a;
                case 1809237540: goto L_0x002f;
                case 1950749482: goto L_0x0023;
                case 1950789798: goto L_0x0017;
                case 1951062397: goto L_0x000b;
                default: goto L_0x0009;
            }
        L_0x0009:
            goto L_0x017a
        L_0x000b:
            java.lang.String r0 = "A_OPUS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 11
            goto L_0x017b
        L_0x0017:
            java.lang.String r0 = "A_FLAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 22
            goto L_0x017b
        L_0x0023:
            java.lang.String r0 = "A_EAC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 17
            goto L_0x017b
        L_0x002f:
            java.lang.String r0 = "V_MPEG2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 3
            goto L_0x017b
        L_0x003a:
            java.lang.String r0 = "S_TEXT/UTF8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 27
            goto L_0x017b
        L_0x0046:
            java.lang.String r0 = "V_MPEGH/ISO/HEVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 8
            goto L_0x017b
        L_0x0052:
            java.lang.String r0 = "S_TEXT/ASS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 28
            goto L_0x017b
        L_0x005e:
            java.lang.String r0 = "A_PCM/INT/LIT"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 24
            goto L_0x017b
        L_0x006a:
            java.lang.String r0 = "A_PCM/INT/BIG"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 25
            goto L_0x017b
        L_0x0076:
            java.lang.String r0 = "A_PCM/FLOAT/IEEE"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 26
            goto L_0x017b
        L_0x0082:
            java.lang.String r0 = "A_DTS/EXPRESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 20
            goto L_0x017b
        L_0x008e:
            java.lang.String r0 = "V_THEORA"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 10
            goto L_0x017b
        L_0x009a:
            java.lang.String r0 = "S_HDMV/PGS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 30
            goto L_0x017b
        L_0x00a6:
            java.lang.String r0 = "V_VP9"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 1
            goto L_0x017b
        L_0x00b1:
            java.lang.String r0 = "V_VP8"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 0
            goto L_0x017b
        L_0x00bc:
            java.lang.String r0 = "V_AV1"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 2
            goto L_0x017b
        L_0x00c7:
            java.lang.String r0 = "A_DTS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 19
            goto L_0x017b
        L_0x00d3:
            java.lang.String r0 = "A_AC3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 16
            goto L_0x017b
        L_0x00df:
            java.lang.String r0 = "A_AAC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 13
            goto L_0x017b
        L_0x00eb:
            java.lang.String r0 = "A_DTS/LOSSLESS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 21
            goto L_0x017b
        L_0x00f7:
            java.lang.String r0 = "S_VOBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 29
            goto L_0x017b
        L_0x0103:
            java.lang.String r0 = "V_MPEG4/ISO/AVC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 7
            goto L_0x017b
        L_0x010e:
            java.lang.String r0 = "V_MPEG4/ISO/ASP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 5
            goto L_0x017b
        L_0x0119:
            java.lang.String r0 = "S_DVBSUB"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 31
            goto L_0x017b
        L_0x0124:
            java.lang.String r0 = "V_MS/VFW/FOURCC"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 9
            goto L_0x017b
        L_0x012f:
            java.lang.String r0 = "A_MPEG/L3"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 15
            goto L_0x017b
        L_0x013a:
            java.lang.String r0 = "A_MPEG/L2"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 14
            goto L_0x017b
        L_0x0145:
            java.lang.String r0 = "A_VORBIS"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 12
            goto L_0x017b
        L_0x0150:
            java.lang.String r0 = "A_TRUEHD"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 18
            goto L_0x017b
        L_0x015b:
            java.lang.String r0 = "A_MS/ACM"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 23
            goto L_0x017b
        L_0x0166:
            java.lang.String r0 = "V_MPEG4/ISO/SP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 4
            goto L_0x017b
        L_0x0170:
            java.lang.String r0 = "V_MPEG4/ISO/AP"
            boolean r3 = r3.equals(r0)
            if (r3 == 0) goto L_0x017a
            r3 = 6
            goto L_0x017b
        L_0x017a:
            r3 = -1
        L_0x017b:
            switch(r3) {
                case 0: goto L_0x017f;
                case 1: goto L_0x017f;
                case 2: goto L_0x017f;
                case 3: goto L_0x017f;
                case 4: goto L_0x017f;
                case 5: goto L_0x017f;
                case 6: goto L_0x017f;
                case 7: goto L_0x017f;
                case 8: goto L_0x017f;
                case 9: goto L_0x017f;
                case 10: goto L_0x017f;
                case 11: goto L_0x017f;
                case 12: goto L_0x017f;
                case 13: goto L_0x017f;
                case 14: goto L_0x017f;
                case 15: goto L_0x017f;
                case 16: goto L_0x017f;
                case 17: goto L_0x017f;
                case 18: goto L_0x017f;
                case 19: goto L_0x017f;
                case 20: goto L_0x017f;
                case 21: goto L_0x017f;
                case 22: goto L_0x017f;
                case 23: goto L_0x017f;
                case 24: goto L_0x017f;
                case 25: goto L_0x017f;
                case 26: goto L_0x017f;
                case 27: goto L_0x017f;
                case 28: goto L_0x017f;
                case 29: goto L_0x017f;
                case 30: goto L_0x017f;
                case 31: goto L_0x017f;
                default: goto L_0x017e;
            }
        L_0x017e:
            return r1
        L_0x017f:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.e.e.d.a(java.lang.String):boolean");
    }

    private static byte[] a(long j2, String str, long j3) {
        com.applovin.exoplayer2.l.a.a(j2 != -9223372036854775807L);
        int i2 = (int) (j2 / 3600000000L);
        long j4 = j2 - (((long) (i2 * 3600)) * 1000000);
        int i3 = (int) (j4 / 60000000);
        long j5 = j4 - (((long) (i3 * 60)) * 1000000);
        int i4 = (int) (j5 / 1000000);
        return ai.c(String.format(Locale.US, str, new Object[]{Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4), Integer.valueOf((int) ((j5 - (((long) i4) * 1000000)) / j3))}));
    }

    private static int[] a(int[] iArr, int i2) {
        return iArr == null ? new int[i2] : iArr.length >= i2 ? iArr : new int[Math.max(iArr.length * 2, i2)];
    }

    private void d(int i2) throws com.applovin.exoplayer2.ai {
        if (this.A == null) {
            throw com.applovin.exoplayer2.ai.b("Element " + i2 + " must be in a TrackEntry", (Throwable) null);
        }
    }

    private int e() {
        int i2 = this.Y;
        f();
        return i2;
    }

    private void e(int i2) throws com.applovin.exoplayer2.ai {
        if (this.I == null || this.J == null) {
            throw com.applovin.exoplayer2.ai.b("Element " + i2 + " must be in a Cues", (Throwable) null);
        }
    }

    private b f(int i2) throws com.applovin.exoplayer2.ai {
        d(i2);
        return this.A;
    }

    private void f() {
        this.X = 0;
        this.Y = 0;
        this.Z = 0;
        this.aa = false;
        this.ab = false;
        this.ac = false;
        this.ad = 0;
        this.ae = 0;
        this.af = false;
        this.p.a(0);
    }

    private void g() {
        com.applovin.exoplayer2.l.a.a(this.ag);
    }

    /* access modifiers changed from: private */
    public static /* synthetic */ h[] h() {
        return new h[]{new d()};
    }

    /* access modifiers changed from: protected */
    public int a(int i2) {
        switch (i2) {
            case 131:
            case 136:
            case 155:
            case 159:
            case 176:
            case 179:
            case 186:
            case 215:
            case 231:
            case 238:
            case 241:
            case 251:
            case 16871:
            case 16980:
            case 17029:
            case 17143:
            case 18401:
            case 18408:
            case 20529:
            case 20530:
            case 21420:
            case 21432:
            case 21680:
            case 21682:
            case 21690:
            case 21930:
            case 21945:
            case 21946:
            case 21947:
            case 21948:
            case 21949:
            case 21998:
            case 22186:
            case 22203:
            case 25188:
            case 30321:
            case 2352003:
            case 2807729:
                return 2;
            case 134:
            case 17026:
            case 21358:
            case 2274716:
                return 3;
            case 160:
            case 166:
            case 174:
            case 183:
            case 187:
            case 224:
            case 225:
            case 16868:
            case 18407:
            case 19899:
            case 20532:
            case 20533:
            case 21936:
            case 21968:
            case 25152:
            case 28032:
            case 30113:
            case 30320:
            case 290298740:
            case 357149030:
            case 374648427:
            case 408125543:
            case 440786851:
            case 475249515:
            case 524531317:
                return 1;
            case 161:
            case 163:
            case 165:
            case 16877:
            case 16981:
            case 18402:
            case 21419:
            case 25506:
            case 30322:
                return 4;
            case 181:
            case 17545:
            case 21969:
            case 21970:
            case 21971:
            case 21972:
            case 21973:
            case 21974:
            case 21975:
            case 21976:
            case 21977:
            case 21978:
            case 30323:
            case 30324:
            case 30325:
                return 5;
            default:
                return 0;
        }
    }

    public final int a(i iVar, u uVar) throws IOException {
        this.L = false;
        boolean z2 = true;
        while (z2 && !this.L) {
            z2 = this.f11924g.a(iVar);
            if (z2 && a(uVar, iVar.c())) {
                return 1;
            }
        }
        if (z2) {
            return 0;
        }
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            b valueAt = this.i.valueAt(i2);
            valueAt.d();
            valueAt.a();
        }
        return -1;
    }

    /* access modifiers changed from: protected */
    public void a(int i2, double d2) throws com.applovin.exoplayer2.ai {
        if (i2 == 181) {
            f(i2).P = (int) d2;
        } else if (i2 != 17545) {
            switch (i2) {
                case 21969:
                    f(i2).C = (float) d2;
                    return;
                case 21970:
                    f(i2).D = (float) d2;
                    return;
                case 21971:
                    f(i2).E = (float) d2;
                    return;
                case 21972:
                    f(i2).F = (float) d2;
                    return;
                case 21973:
                    f(i2).G = (float) d2;
                    return;
                case 21974:
                    f(i2).H = (float) d2;
                    return;
                case 21975:
                    f(i2).I = (float) d2;
                    return;
                case 21976:
                    f(i2).J = (float) d2;
                    return;
                case 21977:
                    f(i2).K = (float) d2;
                    return;
                case 21978:
                    f(i2).L = (float) d2;
                    return;
                default:
                    switch (i2) {
                        case 30323:
                            f(i2).r = (float) d2;
                            return;
                        case 30324:
                            f(i2).s = (float) d2;
                            return;
                        case 30325:
                            f(i2).t = (float) d2;
                            return;
                        default:
                            return;
                    }
            }
        } else {
            this.y = (long) d2;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, int i3, i iVar) throws IOException {
        b bVar;
        b bVar2;
        b bVar3;
        long j2;
        long j3;
        int i4;
        byte b2;
        int[] iArr;
        int i5 = i2;
        int i6 = i3;
        i iVar2 = iVar;
        int i7 = 0;
        int i8 = 1;
        if (i5 == 161 || i5 == 163) {
            if (this.M == 0) {
                this.S = (int) this.f11925h.a(iVar2, false, true, 8);
                this.T = this.f11925h.b();
                this.O = -9223372036854775807L;
                this.M = 1;
                this.m.a(0);
            }
            b bVar4 = this.i.get(this.S);
            if (bVar4 == null) {
                iVar2.b(i6 - this.T);
                this.M = 0;
                return;
            }
            bVar4.d();
            if (this.M == 1) {
                a(iVar2, 3);
                int i9 = (this.m.d()[2] & 6) >> 1;
                byte b3 = 255;
                if (i9 == 0) {
                    this.Q = 1;
                    int[] a2 = a(this.R, 1);
                    this.R = a2;
                    a2[0] = (i6 - this.T) - 3;
                } else {
                    int i10 = 4;
                    a(iVar2, 4);
                    int i11 = (this.m.d()[3] & 255) + 1;
                    this.Q = i11;
                    int[] a3 = a(this.R, i11);
                    this.R = a3;
                    if (i9 == 2) {
                        int i12 = this.Q;
                        Arrays.fill(a3, 0, i12, ((i6 - this.T) - 4) / i12);
                    } else if (i9 == 1) {
                        int i13 = 0;
                        int i14 = 0;
                        while (true) {
                            i4 = this.Q;
                            if (i13 >= i4 - 1) {
                                break;
                            }
                            this.R[i13] = 0;
                            do {
                                i10++;
                                a(iVar2, i10);
                                b2 = this.m.d()[i10 - 1] & 255;
                                iArr = this.R;
                                iArr[i13] = iArr[i13] + b2;
                            } while (b2 == 255);
                            i14 += iArr[i13];
                            i13++;
                        }
                        this.R[i4 - 1] = ((i6 - this.T) - i10) - i14;
                    } else if (i9 == 3) {
                        int i15 = 0;
                        int i16 = 0;
                        while (true) {
                            int i17 = this.Q;
                            if (i15 >= i17 - 1) {
                                bVar2 = bVar4;
                                this.R[i17 - 1] = ((i6 - this.T) - i10) - i16;
                                break;
                            }
                            this.R[i15] = i7;
                            i10++;
                            a(iVar2, i10);
                            int i18 = i10 - 1;
                            if (this.m.d()[i18] != 0) {
                                int i19 = 0;
                                while (true) {
                                    if (i19 >= 8) {
                                        bVar3 = bVar4;
                                        j2 = 0;
                                        break;
                                    }
                                    int i20 = i8 << (7 - i19);
                                    if ((this.m.d()[i18] & i20) != 0) {
                                        int i21 = i10 + i19;
                                        a(iVar2, i21);
                                        bVar3 = bVar4;
                                        long j4 = (long) ((~i20) & this.m.d()[i18] & b3);
                                        int i22 = i18 + 1;
                                        while (true) {
                                            j3 = j4;
                                            if (i22 >= i21) {
                                                break;
                                            }
                                            j4 = (j3 << 8) | ((long) (this.m.d()[i22] & b3));
                                            i22++;
                                            i21 = i21;
                                            b3 = 255;
                                        }
                                        int i23 = i21;
                                        if (i15 > 0) {
                                            j3 -= (1 << ((i19 * 7) + 6)) - 1;
                                        }
                                        j2 = j3;
                                        i10 = i23;
                                    } else {
                                        b bVar5 = bVar4;
                                        i19++;
                                        i8 = 1;
                                        b3 = 255;
                                    }
                                }
                                if (j2 >= -2147483648L && j2 <= 2147483647L) {
                                    int i24 = (int) j2;
                                    int[] iArr2 = this.R;
                                    if (i15 != 0) {
                                        i24 += iArr2[i15 - 1];
                                    }
                                    iArr2[i15] = i24;
                                    i16 += this.R[i15];
                                    i15++;
                                    bVar4 = bVar3;
                                    i7 = 0;
                                    i8 = 1;
                                    b3 = 255;
                                }
                            } else {
                                throw com.applovin.exoplayer2.ai.b("No valid varint length mask found", (Throwable) null);
                            }
                        }
                        throw com.applovin.exoplayer2.ai.b("EBML lacing sample size out of range.", (Throwable) null);
                    } else {
                        throw com.applovin.exoplayer2.ai.b("Unexpected lacing value: " + i9, (Throwable) null);
                    }
                }
                bVar2 = bVar4;
                this.N = this.H + a((long) ((this.m.d()[0] << 8) | (this.m.d()[1] & 255)));
                bVar = bVar2;
                this.U = (bVar.f11930d == 2 || (i5 == 163 && (this.m.d()[2] & 128) == 128)) ? 1 : 0;
                this.M = 2;
                this.P = 0;
            } else {
                bVar = bVar4;
            }
            if (i5 == 163) {
                while (true) {
                    int i25 = this.P;
                    if (i25 < this.Q) {
                        a(bVar, ((long) ((this.P * bVar.f11931e) / 1000)) + this.N, this.U, a(iVar2, bVar, this.R[i25]), 0);
                        this.P++;
                    } else {
                        this.M = 0;
                        return;
                    }
                }
            } else {
                while (true) {
                    int i26 = this.P;
                    if (i26 < this.Q) {
                        int[] iArr3 = this.R;
                        iArr3[i26] = a(iVar2, bVar, iArr3[i26]);
                        this.P++;
                    } else {
                        return;
                    }
                }
            }
        } else if (i5 != 165) {
            if (i5 == 16877) {
                a(f(i2), iVar2, i6);
            } else if (i5 == 16981) {
                d(i2);
                this.A.f11934h = new byte[i6];
                iVar2.b(this.A.f11934h, 0, i6);
            } else if (i5 == 18402) {
                byte[] bArr = new byte[i6];
                iVar2.b(bArr, 0, i6);
                f(i2).i = new x.a(1, bArr, 0, 0);
            } else if (i5 == 21419) {
                Arrays.fill(this.o.d(), (byte) 0);
                iVar2.b(this.o.d(), 4 - i6, i6);
                this.o.d(0);
                this.C = (int) this.o.o();
            } else if (i5 == 25506) {
                d(i2);
                this.A.j = new byte[i6];
                iVar2.b(this.A.j, 0, i6);
            } else if (i5 == 30322) {
                d(i2);
                this.A.u = new byte[i6];
                iVar2.b(this.A.u, 0, i6);
            } else {
                throw com.applovin.exoplayer2.ai.b("Unexpected id: " + i5, (Throwable) null);
            }
        } else if (this.M == 2) {
            a(this.i.get(this.S), this.V, iVar2, i6);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, long j2) throws com.applovin.exoplayer2.ai {
        if (i2 != 20529) {
            if (i2 != 20530) {
                boolean z2 = false;
                switch (i2) {
                    case 131:
                        f(i2).f11930d = (int) j2;
                        return;
                    case 136:
                        b f2 = f(i2);
                        if (j2 == 1) {
                            z2 = true;
                        }
                        f2.U = z2;
                        return;
                    case 155:
                        this.O = a(j2);
                        return;
                    case 159:
                        f(i2).N = (int) j2;
                        return;
                    case 176:
                        f(i2).l = (int) j2;
                        return;
                    case 179:
                        e(i2);
                        this.I.a(a(j2));
                        return;
                    case 186:
                        f(i2).m = (int) j2;
                        return;
                    case 215:
                        f(i2).f11929c = (int) j2;
                        return;
                    case 231:
                        this.H = a(j2);
                        return;
                    case 238:
                        this.V = (int) j2;
                        return;
                    case 241:
                        if (!this.K) {
                            e(i2);
                            this.J.a(j2);
                            this.K = true;
                            return;
                        }
                        return;
                    case 251:
                        this.W = true;
                        return;
                    case 16871:
                        int unused = f(i2).X = (int) j2;
                        return;
                    case 16980:
                        if (j2 != 3) {
                            throw com.applovin.exoplayer2.ai.b("ContentCompAlgo " + j2 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17029:
                        if (j2 < 1 || j2 > 2) {
                            throw com.applovin.exoplayer2.ai.b("DocTypeReadVersion " + j2 + " not supported", (Throwable) null);
                        }
                        return;
                    case 17143:
                        if (j2 != 1) {
                            throw com.applovin.exoplayer2.ai.b("EBMLReadVersion " + j2 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18401:
                        if (j2 != 5) {
                            throw com.applovin.exoplayer2.ai.b("ContentEncAlgo " + j2 + " not supported", (Throwable) null);
                        }
                        return;
                    case 18408:
                        if (j2 != 1) {
                            throw com.applovin.exoplayer2.ai.b("AESSettingsCipherMode " + j2 + " not supported", (Throwable) null);
                        }
                        return;
                    case 21420:
                        this.D = j2 + this.w;
                        return;
                    case 21432:
                        int i3 = (int) j2;
                        d(i2);
                        if (i3 == 0) {
                            this.A.v = 0;
                            return;
                        } else if (i3 == 1) {
                            this.A.v = 2;
                            return;
                        } else if (i3 == 3) {
                            this.A.v = 1;
                            return;
                        } else if (i3 == 15) {
                            this.A.v = 3;
                            return;
                        } else {
                            return;
                        }
                    case 21680:
                        f(i2).n = (int) j2;
                        return;
                    case 21682:
                        f(i2).p = (int) j2;
                        return;
                    case 21690:
                        f(i2).o = (int) j2;
                        return;
                    case 21930:
                        b f3 = f(i2);
                        if (j2 == 1) {
                            z2 = true;
                        }
                        f3.T = z2;
                        return;
                    case 21998:
                        f(i2).f11932f = (int) j2;
                        return;
                    case 22186:
                        f(i2).Q = j2;
                        return;
                    case 22203:
                        f(i2).R = j2;
                        return;
                    case 25188:
                        f(i2).O = (int) j2;
                        return;
                    case 30321:
                        d(i2);
                        int i4 = (int) j2;
                        if (i4 == 0) {
                            this.A.q = 0;
                            return;
                        } else if (i4 == 1) {
                            this.A.q = 1;
                            return;
                        } else if (i4 == 2) {
                            this.A.q = 2;
                            return;
                        } else if (i4 == 3) {
                            this.A.q = 3;
                            return;
                        } else {
                            return;
                        }
                    case 2352003:
                        f(i2).f11931e = (int) j2;
                        return;
                    case 2807729:
                        this.x = j2;
                        return;
                    default:
                        switch (i2) {
                            case 21945:
                                d(i2);
                                int i5 = (int) j2;
                                if (i5 == 1) {
                                    this.A.z = 2;
                                    return;
                                } else if (i5 == 2) {
                                    this.A.z = 1;
                                    return;
                                } else {
                                    return;
                                }
                            case 21946:
                                d(i2);
                                int b2 = com.applovin.exoplayer2.m.b.b((int) j2);
                                if (b2 != -1) {
                                    this.A.y = b2;
                                    return;
                                }
                                return;
                            case 21947:
                                d(i2);
                                this.A.w = true;
                                int a2 = com.applovin.exoplayer2.m.b.a((int) j2);
                                if (a2 != -1) {
                                    this.A.x = a2;
                                    return;
                                }
                                return;
                            case 21948:
                                f(i2).A = (int) j2;
                                return;
                            case 21949:
                                f(i2).B = (int) j2;
                                return;
                            default:
                                return;
                        }
                }
            } else if (j2 != 1) {
                throw com.applovin.exoplayer2.ai.b("ContentEncodingScope " + j2 + " not supported", (Throwable) null);
            }
        } else if (j2 != 0) {
            throw com.applovin.exoplayer2.ai.b("ContentEncodingOrder " + j2 + " not supported", (Throwable) null);
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, long j2, long j3) throws com.applovin.exoplayer2.ai {
        g();
        if (i2 == 160) {
            this.W = false;
        } else if (i2 == 174) {
            this.A = new b();
        } else if (i2 == 187) {
            this.K = false;
        } else if (i2 == 19899) {
            this.C = -1;
            this.D = -1;
        } else if (i2 == 20533) {
            f(i2).f11933g = true;
        } else if (i2 == 21968) {
            f(i2).w = true;
        } else if (i2 == 408125543) {
            long j4 = this.w;
            if (j4 == -1 || j4 == j2) {
                this.w = j2;
                this.v = j3;
                return;
            }
            throw com.applovin.exoplayer2.ai.b("Multiple Segment elements not supported", (Throwable) null);
        } else if (i2 == 475249515) {
            this.I = new r();
            this.J = new r();
        } else if (i2 != 524531317 || this.B) {
        } else {
            if (!this.j || this.F == -1) {
                this.ag.a(new v.b(this.z));
                this.B = true;
                return;
            }
            this.E = true;
        }
    }

    /* access modifiers changed from: protected */
    public void a(int i2, String str) throws com.applovin.exoplayer2.ai {
        if (i2 == 134) {
            f(i2).f11928b = str;
        } else if (i2 != 17026) {
            if (i2 == 21358) {
                f(i2).f11927a = str;
            } else if (i2 == 2274716) {
                String unused = f(i2).Y = str;
            }
        } else if (!"webm".equals(str) && !"matroska".equals(str)) {
            throw com.applovin.exoplayer2.ai.b("DocType " + str + " not supported", (Throwable) null);
        }
    }

    public void a(long j2, long j3) {
        this.H = -9223372036854775807L;
        this.M = 0;
        this.f11924g.a();
        this.f11925h.a();
        f();
        for (int i2 = 0; i2 < this.i.size(); i2++) {
            this.i.valueAt(i2).b();
        }
    }

    /* access modifiers changed from: protected */
    public void a(b bVar, int i2, i iVar, int i3) throws IOException {
        if (i2 != 4 || !"V_VP9".equals(bVar.f11928b)) {
            iVar.b(i3);
            return;
        }
        this.t.a(i3);
        iVar.b(this.t.d(), 0, i3);
    }

    /* access modifiers changed from: protected */
    public void a(b bVar, i iVar, int i2) throws IOException {
        if (bVar.X == 1685485123 || bVar.X == 1685480259) {
            bVar.M = new byte[i2];
            iVar.b(bVar.M, 0, i2);
            return;
        }
        iVar.b(i2);
    }

    public final void a(j jVar) {
        this.ag = jVar;
    }

    public final boolean a(i iVar) throws IOException {
        return new e().a(iVar);
    }

    /* access modifiers changed from: protected */
    public boolean b(int i2) {
        return i2 == 357149030 || i2 == 524531317 || i2 == 475249515 || i2 == 374648427;
    }

    public final void c() {
    }

    /* access modifiers changed from: protected */
    public void c(int i2) throws com.applovin.exoplayer2.ai {
        g();
        if (i2 != 160) {
            if (i2 == 174) {
                b bVar = (b) com.applovin.exoplayer2.l.a.a(this.A);
                if (bVar.f11928b != null) {
                    if (a(bVar.f11928b)) {
                        bVar.a(this.ag, bVar.f11929c);
                        this.i.put(bVar.f11929c, bVar);
                    }
                    this.A = null;
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("CodecId is missing in TrackEntry element", (Throwable) null);
            } else if (i2 == 19899) {
                int i3 = this.C;
                if (i3 != -1) {
                    long j2 = this.D;
                    if (j2 != -1) {
                        if (i3 == 475249515) {
                            this.F = j2;
                            return;
                        }
                        return;
                    }
                }
                throw com.applovin.exoplayer2.ai.b("Mandatory element SeekID or SeekPosition not found", (Throwable) null);
            } else if (i2 == 25152) {
                d(i2);
                if (!this.A.f11933g) {
                    return;
                }
                if (this.A.i != null) {
                    this.A.k = new e(new e.a(com.applovin.exoplayer2.h.f12712a, MimeTypes.VIDEO_WEBM, this.A.i.f12460b));
                    return;
                }
                throw com.applovin.exoplayer2.ai.b("Encrypted Track found but ContentEncKeyID was not found", (Throwable) null);
            } else if (i2 == 28032) {
                d(i2);
                if (this.A.f11933g && this.A.f11934h != null) {
                    throw com.applovin.exoplayer2.ai.b("Combining encryption and compression is not supported", (Throwable) null);
                }
            } else if (i2 == 357149030) {
                if (this.x == -9223372036854775807L) {
                    this.x = 1000000;
                }
                long j3 = this.y;
                if (j3 != -9223372036854775807L) {
                    this.z = a(j3);
                }
            } else if (i2 != 374648427) {
                if (i2 == 475249515) {
                    if (!this.B) {
                        this.ag.a(a(this.I, this.J));
                        this.B = true;
                    }
                    this.I = null;
                    this.J = null;
                }
            } else if (this.i.size() != 0) {
                this.ag.a();
            } else {
                throw com.applovin.exoplayer2.ai.b("No valid tracks were found", (Throwable) null);
            }
        } else if (this.M == 2) {
            int i4 = 0;
            for (int i5 = 0; i5 < this.Q; i5++) {
                i4 += this.R[i5];
            }
            b bVar2 = this.i.get(this.S);
            bVar2.d();
            for (int i6 = 0; i6 < this.Q; i6++) {
                long j4 = ((long) ((bVar2.f11931e * i6) / 1000)) + this.N;
                int i7 = this.U;
                if (i6 == 0 && !this.W) {
                    i7 |= 1;
                }
                int i8 = this.R[i6];
                i4 -= i8;
                a(bVar2, j4, i7, i8, i4);
            }
            this.M = 0;
        }
    }
}
