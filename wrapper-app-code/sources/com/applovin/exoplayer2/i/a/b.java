package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.e;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.x;
import com.applovin.exoplayer2.l.y;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import kotlin.KotlinVersion;

public final class b extends c {

    /* renamed from: a  reason: collision with root package name */
    private final y f12942a = new y();

    /* renamed from: b  reason: collision with root package name */
    private final x f12943b = new x();

    /* renamed from: c  reason: collision with root package name */
    private int f12944c = -1;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f12945d;

    /* renamed from: e  reason: collision with root package name */
    private final int f12946e;

    /* renamed from: f  reason: collision with root package name */
    private final C0128b[] f12947f;

    /* renamed from: g  reason: collision with root package name */
    private C0128b f12948g;

    /* renamed from: h  reason: collision with root package name */
    private List<com.applovin.exoplayer2.i.a> f12949h;
    private List<com.applovin.exoplayer2.i.a> i;
    private c j;
    private int k;

    private static final class a {
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public static final Comparator<a> f12950c = $$Lambda$b$a$gnxM_pIkMwf_cmWaRwOGTXSQPU.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final com.applovin.exoplayer2.i.a f12951a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12952b;

        public a(CharSequence charSequence, Layout.Alignment alignment, float f2, int i, int i2, float f3, int i3, float f4, boolean z, int i4, int i5) {
            a.C0125a b2 = new a.C0125a().a(charSequence).a(alignment).a(f2, i).a(i2).a(f3).b(i3).b(f4);
            if (z) {
                b2.c(i4);
            }
            this.f12951a = b2.e();
            this.f12952b = i5;
        }
    }

    /* renamed from: com.applovin.exoplayer2.i.a.b$b  reason: collision with other inner class name */
    private static final class C0128b {

        /* renamed from: a  reason: collision with root package name */
        public static final int f12953a = a(2, 2, 2, 0);

        /* renamed from: b  reason: collision with root package name */
        public static final int f12954b = a(0, 0, 0, 0);

        /* renamed from: c  reason: collision with root package name */
        public static final int f12955c;

        /* renamed from: d  reason: collision with root package name */
        private static final int[] f12956d = {0, 0, 0, 0, 0, 2, 0};

        /* renamed from: e  reason: collision with root package name */
        private static final int[] f12957e = {0, 0, 0, 0, 0, 0, 2};

        /* renamed from: f  reason: collision with root package name */
        private static final int[] f12958f = {3, 3, 3, 3, 3, 3, 1};

        /* renamed from: g  reason: collision with root package name */
        private static final boolean[] f12959g = {false, false, false, true, true, true, false};

        /* renamed from: h  reason: collision with root package name */
        private static final int[] f12960h;
        private static final int[] i = {0, 1, 2, 3, 4, 3, 4};
        private static final int[] j = {0, 0, 0, 0, 0, 3, 3};
        private static final int[] k;
        private int A;
        private int B;
        private int C;
        private int D;
        private int E;
        private int F;
        private int G;
        private final List<SpannableString> l = new ArrayList();
        private final SpannableStringBuilder m = new SpannableStringBuilder();
        private boolean n;
        private boolean o;
        private int p;
        private boolean q;
        private int r;
        private int s;
        private int t;
        private int u;
        private boolean v;
        private int w;
        private int x;
        private int y;
        private int z;

        static {
            int a2 = a(0, 0, 0, 3);
            f12955c = a2;
            int i2 = f12954b;
            f12960h = new int[]{i2, a2, i2, i2, a2, i2, i2};
            k = new int[]{i2, i2, i2, i2, i2, a2, a2};
        }

        public C0128b() {
            b();
        }

        /* JADX WARNING: Removed duplicated region for block: B:11:0x0025  */
        /* JADX WARNING: Removed duplicated region for block: B:12:0x0028  */
        /* JADX WARNING: Removed duplicated region for block: B:14:0x002b  */
        /* JADX WARNING: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0031  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static int a(int r4, int r5, int r6, int r7) {
            /*
                r0 = 0
                r1 = 4
                com.applovin.exoplayer2.l.a.a(r4, r0, r1)
                com.applovin.exoplayer2.l.a.a(r5, r0, r1)
                com.applovin.exoplayer2.l.a.a(r6, r0, r1)
                com.applovin.exoplayer2.l.a.a(r7, r0, r1)
                r1 = 1
                r2 = 255(0xff, float:3.57E-43)
                if (r7 == 0) goto L_0x0021
                if (r7 == r1) goto L_0x0021
                r3 = 2
                if (r7 == r3) goto L_0x001e
                r3 = 3
                if (r7 == r3) goto L_0x001c
                goto L_0x0021
            L_0x001c:
                r7 = 0
                goto L_0x0023
            L_0x001e:
                r7 = 127(0x7f, float:1.78E-43)
                goto L_0x0023
            L_0x0021:
                r7 = 255(0xff, float:3.57E-43)
            L_0x0023:
                if (r4 <= r1) goto L_0x0028
                r4 = 255(0xff, float:3.57E-43)
                goto L_0x0029
            L_0x0028:
                r4 = 0
            L_0x0029:
                if (r5 <= r1) goto L_0x002e
                r5 = 255(0xff, float:3.57E-43)
                goto L_0x002f
            L_0x002e:
                r5 = 0
            L_0x002f:
                if (r6 <= r1) goto L_0x0033
                r0 = 255(0xff, float:3.57E-43)
            L_0x0033:
                int r4 = android.graphics.Color.argb(r7, r4, r5, r0)
                return r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.C0128b.a(int, int, int, int):int");
        }

        public static int b(int i2, int i3, int i4) {
            return a(i2, i3, i4, 0);
        }

        public void a(char c2) {
            if (c2 == 10) {
                this.l.add(g());
                this.m.clear();
                if (this.A != -1) {
                    this.A = 0;
                }
                if (this.B != -1) {
                    this.B = 0;
                }
                if (this.C != -1) {
                    this.C = 0;
                }
                if (this.E != -1) {
                    this.E = 0;
                }
                while (true) {
                    if ((this.v && this.l.size() >= this.u) || this.l.size() >= 15) {
                        this.l.remove(0);
                    } else {
                        return;
                    }
                }
            } else {
                this.m.append(c2);
            }
        }

        public void a(int i2, int i3) {
            if (this.G != i2) {
                a(10);
            }
            this.G = i2;
        }

        public void a(int i2, int i3, int i4) {
            if (!(this.C == -1 || this.D == i2)) {
                this.m.setSpan(new ForegroundColorSpan(this.D), this.C, this.m.length(), 33);
            }
            if (i2 != f12953a) {
                this.C = this.m.length();
                this.D = i2;
            }
            if (!(this.E == -1 || this.F == i3)) {
                this.m.setSpan(new BackgroundColorSpan(this.F), this.E, this.m.length(), 33);
            }
            if (i3 != f12954b) {
                this.E = this.m.length();
                this.F = i3;
            }
        }

        public void a(int i2, int i3, int i4, boolean z2, boolean z3, int i5, int i6) {
            if (this.A != -1) {
                if (!z2) {
                    this.m.setSpan(new StyleSpan(2), this.A, this.m.length(), 33);
                    this.A = -1;
                }
            } else if (z2) {
                this.A = this.m.length();
            }
            if (this.B != -1) {
                if (!z3) {
                    this.m.setSpan(new UnderlineSpan(), this.B, this.m.length(), 33);
                    this.B = -1;
                }
            } else if (z3) {
                this.B = this.m.length();
            }
        }

        public void a(int i2, int i3, boolean z2, int i4, int i5, int i6, int i7) {
            this.z = i2;
            this.w = i7;
        }

        public void a(boolean z2) {
            this.o = z2;
        }

        public void a(boolean z2, boolean z3, boolean z4, int i2, boolean z5, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
            boolean z6 = z3;
            int i10 = i8;
            int i11 = i9;
            this.n = true;
            this.o = z2;
            this.v = z6;
            this.p = i2;
            this.q = z5;
            this.r = i3;
            this.s = i4;
            this.t = i7;
            int i12 = i5 + 1;
            if (this.u != i12) {
                this.u = i12;
                while (true) {
                    if ((!z6 || this.l.size() < this.u) && this.l.size() < 15) {
                        break;
                    }
                    this.l.remove(0);
                }
            }
            if (!(i10 == 0 || this.x == i10)) {
                this.x = i10;
                int i13 = i10 - 1;
                a(f12960h[i13], f12955c, f12959g[i13], 0, f12957e[i13], f12958f[i13], f12956d[i13]);
            }
            if (i11 != 0 && this.y != i11) {
                this.y = i11;
                int i14 = i11 - 1;
                a(0, 1, 1, false, false, j[i14], i[i14]);
                a(f12953a, k[i14], f12954b);
            }
        }

        public boolean a() {
            return !d() || (this.l.isEmpty() && this.m.length() == 0);
        }

        public void b() {
            c();
            this.n = false;
            this.o = false;
            this.p = 4;
            this.q = false;
            this.r = 0;
            this.s = 0;
            this.t = 0;
            this.u = 15;
            this.v = true;
            this.w = 0;
            this.x = 0;
            this.y = 0;
            int i2 = f12954b;
            this.z = i2;
            this.D = f12953a;
            this.F = i2;
        }

        public void c() {
            this.l.clear();
            this.m.clear();
            this.A = -1;
            this.B = -1;
            this.C = -1;
            this.E = -1;
            this.G = 0;
        }

        public boolean d() {
            return this.n;
        }

        public boolean e() {
            return this.o;
        }

        public void f() {
            int length = this.m.length();
            if (length > 0) {
                this.m.delete(length - 1, length);
            }
        }

        public SpannableString g() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.m);
            int length = spannableStringBuilder.length();
            if (length > 0) {
                if (this.A != -1) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), this.A, length, 33);
                }
                if (this.B != -1) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), this.B, length, 33);
                }
                if (this.C != -1) {
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(this.D), this.C, length, 33);
                }
                if (this.E != -1) {
                    spannableStringBuilder.setSpan(new BackgroundColorSpan(this.F), this.E, length, 33);
                }
            }
            return new SpannableString(spannableStringBuilder);
        }

        /* JADX WARNING: Removed duplicated region for block: B:19:0x0065  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0070  */
        /* JADX WARNING: Removed duplicated region for block: B:23:0x0091  */
        /* JADX WARNING: Removed duplicated region for block: B:24:0x0093  */
        /* JADX WARNING: Removed duplicated region for block: B:30:0x009f  */
        /* JADX WARNING: Removed duplicated region for block: B:31:0x00a1  */
        /* JADX WARNING: Removed duplicated region for block: B:37:0x00ad  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public com.applovin.exoplayer2.i.a.b.a h() {
            /*
                r15 = this;
                boolean r0 = r15.a()
                if (r0 == 0) goto L_0x0008
                r0 = 0
                return r0
            L_0x0008:
                android.text.SpannableStringBuilder r2 = new android.text.SpannableStringBuilder
                r2.<init>()
                r0 = 0
                r1 = 0
            L_0x000f:
                java.util.List<android.text.SpannableString> r3 = r15.l
                int r3 = r3.size()
                if (r1 >= r3) goto L_0x002a
                java.util.List<android.text.SpannableString> r3 = r15.l
                java.lang.Object r3 = r3.get(r1)
                java.lang.CharSequence r3 = (java.lang.CharSequence) r3
                r2.append(r3)
                r3 = 10
                r2.append(r3)
                int r1 = r1 + 1
                goto L_0x000f
            L_0x002a:
                android.text.SpannableString r1 = r15.g()
                r2.append(r1)
                int r1 = r15.w
                r3 = 2
                r4 = 3
                r5 = 1
                if (r1 == 0) goto L_0x005e
                if (r1 == r5) goto L_0x005b
                if (r1 == r3) goto L_0x0058
                if (r1 != r4) goto L_0x003f
                goto L_0x005e
            L_0x003f:
                java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
                java.lang.StringBuilder r1 = new java.lang.StringBuilder
                r1.<init>()
                java.lang.String r2 = "Unexpected justification value: "
                r1.append(r2)
                int r2 = r15.w
                r1.append(r2)
                java.lang.String r1 = r1.toString()
                r0.<init>(r1)
                throw r0
            L_0x0058:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_CENTER
                goto L_0x0060
            L_0x005b:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_OPPOSITE
                goto L_0x0060
            L_0x005e:
                android.text.Layout$Alignment r1 = android.text.Layout.Alignment.ALIGN_NORMAL
            L_0x0060:
                r6 = r1
                boolean r1 = r15.q
                if (r1 == 0) goto L_0x0070
                int r1 = r15.s
                float r1 = (float) r1
                r7 = 1120272384(0x42c60000, float:99.0)
                float r1 = r1 / r7
                int r8 = r15.r
                float r8 = (float) r8
                float r8 = r8 / r7
                goto L_0x007d
            L_0x0070:
                int r1 = r15.s
                float r1 = (float) r1
                r7 = 1129381888(0x43510000, float:209.0)
                float r1 = r1 / r7
                int r7 = r15.r
                float r7 = (float) r7
                r8 = 1116995584(0x42940000, float:74.0)
                float r8 = r7 / r8
            L_0x007d:
                r7 = 1063675494(0x3f666666, float:0.9)
                float r1 = r1 * r7
                r9 = 1028443341(0x3d4ccccd, float:0.05)
                float r10 = r1 + r9
                float r8 = r8 * r7
                float r7 = r8 + r9
                int r1 = r15.t
                int r8 = r1 / 3
                if (r8 != 0) goto L_0x0093
                r8 = 0
                goto L_0x0099
            L_0x0093:
                int r1 = r1 / r4
                if (r1 != r5) goto L_0x0098
                r8 = 1
                goto L_0x0099
            L_0x0098:
                r8 = 2
            L_0x0099:
                int r1 = r15.t
                int r9 = r1 % 3
                if (r9 != 0) goto L_0x00a1
                r9 = 0
                goto L_0x00a7
            L_0x00a1:
                int r1 = r1 % r4
                if (r1 != r5) goto L_0x00a6
                r9 = 1
                goto L_0x00a7
            L_0x00a6:
                r9 = 2
            L_0x00a7:
                int r1 = r15.z
                int r3 = f12954b
                if (r1 == r3) goto L_0x00ae
                r0 = 1
            L_0x00ae:
                com.applovin.exoplayer2.i.a.b$a r13 = new com.applovin.exoplayer2.i.a.b$a
                r5 = 0
                r11 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
                int r12 = r15.z
                int r14 = r15.p
                r1 = r13
                r3 = r6
                r4 = r7
                r6 = r8
                r7 = r10
                r8 = r9
                r9 = r11
                r10 = r0
                r11 = r12
                r12 = r14
                r1.<init>(r2, r3, r4, r5, r6, r7, r8, r9, r10, r11, r12)
                return r13
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.C0128b.h():com.applovin.exoplayer2.i.a.b$a");
        }
    }

    private static final class c {

        /* renamed from: a  reason: collision with root package name */
        public final int f12961a;

        /* renamed from: b  reason: collision with root package name */
        public final int f12962b;

        /* renamed from: c  reason: collision with root package name */
        public final byte[] f12963c;

        /* renamed from: d  reason: collision with root package name */
        int f12964d = 0;

        public c(int i, int i2) {
            this.f12961a = i;
            this.f12962b = i2;
            this.f12963c = new byte[((i2 * 2) - 1)];
        }
    }

    public b(int i2, List<byte[]> list) {
        boolean z = true;
        this.f12946e = i2 == -1 ? 1 : i2;
        this.f12945d = (list == null || !e.a(list)) ? false : z;
        this.f12947f = new C0128b[8];
        for (int i3 = 0; i3 < 8; i3++) {
            this.f12947f[i3] = new C0128b();
        }
        this.f12948g = this.f12947f[0];
    }

    private void a(int i2) {
        x xVar;
        if (i2 == 0) {
            return;
        }
        if (i2 != 3) {
            int i3 = 8;
            if (i2 != 8) {
                switch (i2) {
                    case 12:
                        r();
                        return;
                    case 13:
                        this.f12948g.a(10);
                        return;
                    case 14:
                        return;
                    default:
                        if (i2 >= 17 && i2 <= 23) {
                            q.c("Cea708Decoder", "Currently unsupported COMMAND_EXT1 Command: " + i2);
                            xVar = this.f12943b;
                        } else if (i2 < 24 || i2 > 31) {
                            q.c("Cea708Decoder", "Invalid C0 command: " + i2);
                            return;
                        } else {
                            q.c("Cea708Decoder", "Currently unsupported COMMAND_P16 Command: " + i2);
                            xVar = this.f12943b;
                            i3 = 16;
                        }
                        xVar.b(i3);
                        return;
                }
            } else {
                this.f12948g.f();
            }
        } else {
            this.f12949h = q();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:19:0x006b, code lost:
        r5 = r4.f12943b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x006d, code lost:
        r5.b(r0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0083, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x008b, code lost:
        if (r4.f12943b.e() == false) goto L_0x0096;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x008d, code lost:
        r4.f12947f[8 - r2].b();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:28:0x0096, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x00b5, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:37:0x00bd, code lost:
        if (r4.f12943b.e() == false) goto L_0x00c9;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:38:0x00bf, code lost:
        r4.f12947f[8 - r2].a(false);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:39:0x00c9, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00e3, code lost:
        if (r2 > 8) goto L_0x0107;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00eb, code lost:
        if (r4.f12943b.e() == false) goto L_0x00f6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ed, code lost:
        r4.f12947f[8 - r2].c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        r2 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:54:0x0105, code lost:
        r4.f12948g = r5;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:84:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:86:?, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(int r5) {
        /*
            r4 = this;
            r0 = 16
            r1 = 8
            r2 = 1
            switch(r5) {
                case 128: goto L_0x00f9;
                case 129: goto L_0x00f9;
                case 130: goto L_0x00f9;
                case 131: goto L_0x00f9;
                case 132: goto L_0x00f9;
                case 133: goto L_0x00f9;
                case 134: goto L_0x00f9;
                case 135: goto L_0x00f9;
                case 136: goto L_0x00e3;
                case 137: goto L_0x00cc;
                case 138: goto L_0x00b5;
                case 139: goto L_0x0099;
                case 140: goto L_0x0083;
                case 141: goto L_0x007c;
                case 142: goto L_0x0107;
                case 143: goto L_0x0077;
                case 144: goto L_0x0063;
                case 145: goto L_0x0051;
                case 146: goto L_0x0043;
                case 147: goto L_0x0008;
                case 148: goto L_0x0008;
                case 149: goto L_0x0008;
                case 150: goto L_0x0008;
                case 151: goto L_0x0031;
                case 152: goto L_0x0020;
                case 153: goto L_0x0020;
                case 154: goto L_0x0020;
                case 155: goto L_0x0020;
                case 156: goto L_0x0020;
                case 157: goto L_0x0020;
                case 158: goto L_0x0020;
                case 159: goto L_0x0020;
                default: goto L_0x0008;
            }
        L_0x0008:
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid C1 command: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "Cea708Decoder"
            com.applovin.exoplayer2.l.q.c(r0, r5)
            goto L_0x0107
        L_0x0020:
            int r5 = r5 + -152
            r4.i(r5)
            int r0 = r4.k
            if (r0 == r5) goto L_0x0107
            r4.k = r5
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f12947f
            r5 = r0[r5]
            goto L_0x0105
        L_0x0031:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f12948g
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x003e
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            r0 = 32
            goto L_0x006d
        L_0x003e:
            r4.p()
            goto L_0x0107
        L_0x0043:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f12948g
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x004c
            goto L_0x006b
        L_0x004c:
            r4.o()
            goto L_0x0107
        L_0x0051:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f12948g
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x005e
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            r0 = 24
            goto L_0x006d
        L_0x005e:
            r4.n()
            goto L_0x0107
        L_0x0063:
            com.applovin.exoplayer2.i.a.b$b r5 = r4.f12948g
            boolean r5 = r5.d()
            if (r5 != 0) goto L_0x0072
        L_0x006b:
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
        L_0x006d:
            r5.b(r0)
            goto L_0x0107
        L_0x0072:
            r4.m()
            goto L_0x0107
        L_0x0077:
            r4.r()
            goto L_0x0107
        L_0x007c:
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            r5.b(r1)
            goto L_0x0107
        L_0x0083:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x0096
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f12947f
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.b()
        L_0x0096:
            int r2 = r2 + 1
            goto L_0x0083
        L_0x0099:
            r5 = 1
        L_0x009a:
            if (r5 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r0 = r4.f12943b
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00b2
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f12947f
            int r3 = 8 - r5
            r0 = r0[r3]
            boolean r3 = r0.e()
            r3 = r3 ^ r2
            r0.a((boolean) r3)
        L_0x00b2:
            int r5 = r5 + 1
            goto L_0x009a
        L_0x00b5:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x00c9
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f12947f
            int r0 = 8 - r2
            r5 = r5[r0]
            r0 = 0
            r5.a((boolean) r0)
        L_0x00c9:
            int r2 = r2 + 1
            goto L_0x00b5
        L_0x00cc:
            r5 = 1
        L_0x00cd:
            if (r5 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r0 = r4.f12943b
            boolean r0 = r0.e()
            if (r0 == 0) goto L_0x00e0
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f12947f
            int r3 = 8 - r5
            r0 = r0[r3]
            r0.a((boolean) r2)
        L_0x00e0:
            int r5 = r5 + 1
            goto L_0x00cd
        L_0x00e3:
            if (r2 > r1) goto L_0x0107
            com.applovin.exoplayer2.l.x r5 = r4.f12943b
            boolean r5 = r5.e()
            if (r5 == 0) goto L_0x00f6
            com.applovin.exoplayer2.i.a.b$b[] r5 = r4.f12947f
            int r0 = 8 - r2
            r5 = r5[r0]
            r5.c()
        L_0x00f6:
            int r2 = r2 + 1
            goto L_0x00e3
        L_0x00f9:
            int r5 = r5 + -128
            int r0 = r4.k
            if (r0 == r5) goto L_0x0107
            r4.k = r5
            com.applovin.exoplayer2.i.a.b$b[] r0 = r4.f12947f
            r5 = r0[r5]
        L_0x0105:
            r4.f12948g = r5
        L_0x0107:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.b.b(int):void");
    }

    private void c(int i2) {
        x xVar;
        int i3;
        if (i2 > 7) {
            if (i2 <= 15) {
                xVar = this.f12943b;
                i3 = 8;
            } else if (i2 <= 23) {
                xVar = this.f12943b;
                i3 = 16;
            } else if (i2 <= 31) {
                xVar = this.f12943b;
                i3 = 24;
            } else {
                return;
            }
            xVar.b(i3);
        }
    }

    private void d(int i2) {
        x xVar;
        int i3;
        if (i2 <= 135) {
            xVar = this.f12943b;
            i3 = 32;
        } else if (i2 <= 143) {
            xVar = this.f12943b;
            i3 = 40;
        } else if (i2 <= 159) {
            this.f12943b.b(2);
            this.f12943b.b(this.f12943b.c(6) * 8);
            return;
        } else {
            return;
        }
        xVar.b(i3);
    }

    private void e(int i2) {
        if (i2 == 127) {
            this.f12948g.a(9835);
        } else {
            this.f12948g.a((char) (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
        }
    }

    private void f(int i2) {
        this.f12948g.a((char) (i2 & KotlinVersion.MAX_COMPONENT_VALUE));
    }

    private void g(int i2) {
        C0128b bVar;
        char c2 = ' ';
        if (i2 == 32) {
            bVar = this.f12948g;
        } else if (i2 == 33) {
            bVar = this.f12948g;
            c2 = 160;
        } else if (i2 == 37) {
            bVar = this.f12948g;
            c2 = 8230;
        } else if (i2 == 42) {
            bVar = this.f12948g;
            c2 = 352;
        } else if (i2 == 44) {
            bVar = this.f12948g;
            c2 = 338;
        } else if (i2 == 63) {
            bVar = this.f12948g;
            c2 = 376;
        } else if (i2 == 57) {
            bVar = this.f12948g;
            c2 = 8482;
        } else if (i2 == 58) {
            bVar = this.f12948g;
            c2 = 353;
        } else if (i2 == 60) {
            bVar = this.f12948g;
            c2 = 339;
        } else if (i2 != 61) {
            switch (i2) {
                case 48:
                    bVar = this.f12948g;
                    c2 = 9608;
                    break;
                case 49:
                    bVar = this.f12948g;
                    c2 = 8216;
                    break;
                case 50:
                    bVar = this.f12948g;
                    c2 = 8217;
                    break;
                case 51:
                    bVar = this.f12948g;
                    c2 = 8220;
                    break;
                case 52:
                    bVar = this.f12948g;
                    c2 = 8221;
                    break;
                case 53:
                    bVar = this.f12948g;
                    c2 = 8226;
                    break;
                default:
                    switch (i2) {
                        case 118:
                            bVar = this.f12948g;
                            c2 = 8539;
                            break;
                        case 119:
                            bVar = this.f12948g;
                            c2 = 8540;
                            break;
                        case 120:
                            bVar = this.f12948g;
                            c2 = 8541;
                            break;
                        case 121:
                            bVar = this.f12948g;
                            c2 = 8542;
                            break;
                        case 122:
                            bVar = this.f12948g;
                            c2 = 9474;
                            break;
                        case 123:
                            bVar = this.f12948g;
                            c2 = 9488;
                            break;
                        case 124:
                            bVar = this.f12948g;
                            c2 = 9492;
                            break;
                        case 125:
                            bVar = this.f12948g;
                            c2 = 9472;
                            break;
                        case 126:
                            bVar = this.f12948g;
                            c2 = 9496;
                            break;
                        case 127:
                            bVar = this.f12948g;
                            c2 = 9484;
                            break;
                        default:
                            q.c("Cea708Decoder", "Invalid G2 character: " + i2);
                            return;
                    }
            }
        } else {
            bVar = this.f12948g;
            c2 = 8480;
        }
        bVar.a(c2);
    }

    private void h(int i2) {
        C0128b bVar;
        char c2;
        if (i2 == 160) {
            bVar = this.f12948g;
            c2 = 13252;
        } else {
            q.c("Cea708Decoder", "Invalid G3 character: " + i2);
            bVar = this.f12948g;
            c2 = '_';
        }
        bVar.a(c2);
    }

    private void i() {
        if (this.j != null) {
            l();
            this.j = null;
        }
    }

    private void i(int i2) {
        C0128b bVar = this.f12947f[i2];
        this.f12943b.b(2);
        boolean e2 = this.f12943b.e();
        boolean e3 = this.f12943b.e();
        boolean e4 = this.f12943b.e();
        int c2 = this.f12943b.c(3);
        boolean e5 = this.f12943b.e();
        int c3 = this.f12943b.c(7);
        int c4 = this.f12943b.c(8);
        int c5 = this.f12943b.c(4);
        int c6 = this.f12943b.c(4);
        this.f12943b.b(2);
        int c7 = this.f12943b.c(6);
        this.f12943b.b(2);
        bVar.a(e2, e3, e4, c2, e5, c3, c4, c6, c7, c5, this.f12943b.c(3), this.f12943b.c(3));
    }

    private void l() {
        String str;
        StringBuilder sb;
        if (this.j.f12964d != (this.j.f12962b * 2) - 1) {
            q.a("Cea708Decoder", "DtvCcPacket ended prematurely; size is " + ((this.j.f12962b * 2) - 1) + ", but current index is " + this.j.f12964d + " (sequence number " + this.j.f12961a + ");");
        }
        this.f12943b.a(this.j.f12963c, this.j.f12964d);
        int c2 = this.f12943b.c(3);
        int c3 = this.f12943b.c(5);
        if (c2 == 7) {
            this.f12943b.b(2);
            c2 = this.f12943b.c(6);
            if (c2 < 7) {
                q.c("Cea708Decoder", "Invalid extended service number: " + c2);
            }
        }
        if (c3 == 0) {
            if (c2 != 0) {
                q.c("Cea708Decoder", "serviceNumber is non-zero (" + c2 + ") when blockSize is 0");
            }
        } else if (c2 == this.f12946e) {
            boolean z = false;
            while (this.f12943b.a() > 0) {
                int c4 = this.f12943b.c(8);
                if (c4 == 16) {
                    c4 = this.f12943b.c(8);
                    if (c4 <= 31) {
                        c(c4);
                    } else if (c4 <= 127) {
                        g(c4);
                    } else if (c4 <= 159) {
                        d(c4);
                    } else if (c4 <= 255) {
                        h(c4);
                    } else {
                        sb = new StringBuilder();
                        str = "Invalid extended command: ";
                        sb.append(str);
                        sb.append(c4);
                        q.c("Cea708Decoder", sb.toString());
                    }
                } else if (c4 <= 31) {
                    a(c4);
                } else if (c4 <= 127) {
                    e(c4);
                } else if (c4 <= 159) {
                    b(c4);
                } else if (c4 <= 255) {
                    f(c4);
                } else {
                    sb = new StringBuilder();
                    str = "Invalid base command: ";
                    sb.append(str);
                    sb.append(c4);
                    q.c("Cea708Decoder", sb.toString());
                }
                z = true;
            }
            if (z) {
                this.f12949h = q();
            }
        }
    }

    private void m() {
        this.f12948g.a(this.f12943b.c(4), this.f12943b.c(2), this.f12943b.c(2), this.f12943b.e(), this.f12943b.e(), this.f12943b.c(3), this.f12943b.c(3));
    }

    private void n() {
        int a2 = C0128b.a(this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2));
        int a3 = C0128b.a(this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2));
        this.f12943b.b(2);
        this.f12948g.a(a2, a3, C0128b.b(this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2)));
    }

    private void o() {
        this.f12943b.b(4);
        int c2 = this.f12943b.c(4);
        this.f12943b.b(2);
        this.f12948g.a(c2, this.f12943b.c(6));
    }

    private void p() {
        int a2 = C0128b.a(this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2));
        int c2 = this.f12943b.c(2);
        int b2 = C0128b.b(this.f12943b.c(2), this.f12943b.c(2), this.f12943b.c(2));
        if (this.f12943b.e()) {
            c2 |= 4;
        }
        boolean e2 = this.f12943b.e();
        int c3 = this.f12943b.c(2);
        int c4 = this.f12943b.c(2);
        int c5 = this.f12943b.c(2);
        this.f12943b.b(8);
        this.f12948g.a(a2, b2, e2, c2, c3, c4, c5);
    }

    private List<com.applovin.exoplayer2.i.a> q() {
        a h2;
        ArrayList arrayList = new ArrayList();
        for (int i2 = 0; i2 < 8; i2++) {
            if (!this.f12947f[i2].a() && this.f12947f[i2].e() && (h2 = this.f12947f[i2].h()) != null) {
                arrayList.add(h2);
            }
        }
        Collections.sort(arrayList, a.f12950c);
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            arrayList2.add(((a) arrayList.get(i3)).f12951a);
        }
        return Collections.unmodifiableList(arrayList2);
    }

    private void r() {
        for (int i2 = 0; i2 < 8; i2++) {
            this.f12947f[i2].b();
        }
    }

    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    /* access modifiers changed from: protected */
    public void a(j jVar) {
        ByteBuffer byteBuffer = (ByteBuffer) com.applovin.exoplayer2.l.a.b(jVar.f11419b);
        this.f12942a.a(byteBuffer.array(), byteBuffer.limit());
        while (this.f12942a.a() >= 3) {
            int h2 = this.f12942a.h() & 7;
            int i2 = h2 & 3;
            boolean z = false;
            boolean z2 = (h2 & 4) == 4;
            byte h3 = (byte) this.f12942a.h();
            byte h4 = (byte) this.f12942a.h();
            if ((i2 == 2 || i2 == 3) && z2) {
                if (i2 == 3) {
                    i();
                    int i3 = (h3 & 192) >> 6;
                    int i4 = this.f12944c;
                    if (!(i4 == -1 || i3 == (i4 + 1) % 4)) {
                        r();
                        q.c("Cea708Decoder", "Sequence number discontinuity. previous=" + this.f12944c + " current=" + i3);
                    }
                    this.f12944c = i3;
                    byte b2 = h3 & 63;
                    if (b2 == 0) {
                        b2 = 64;
                    }
                    c cVar = new c(i3, b2);
                    this.j = cVar;
                    byte[] bArr = cVar.f12963c;
                    c cVar2 = this.j;
                    int i5 = cVar2.f12964d;
                    cVar2.f12964d = i5 + 1;
                    bArr[i5] = h4;
                } else {
                    if (i2 == 2) {
                        z = true;
                    }
                    com.applovin.exoplayer2.l.a.a(z);
                    c cVar3 = this.j;
                    if (cVar3 == null) {
                        q.d("Cea708Decoder", "Encountered DTVCC_PACKET_DATA before DTVCC_PACKET_START");
                    } else {
                        byte[] bArr2 = cVar3.f12963c;
                        c cVar4 = this.j;
                        int i6 = cVar4.f12964d;
                        cVar4.f12964d = i6 + 1;
                        bArr2[i6] = h3;
                        byte[] bArr3 = this.j.f12963c;
                        c cVar5 = this.j;
                        int i7 = cVar5.f12964d;
                        cVar5.f12964d = i7 + 1;
                        bArr3[i7] = h4;
                    }
                }
                if (this.j.f12964d == (this.j.f12962b * 2) - 1) {
                    i();
                }
            }
        }
    }

    public /* bridge */ /* synthetic */ void b(j jVar) throws h {
        super.a(jVar);
    }

    public void c() {
        super.c();
        this.f12949h = null;
        this.i = null;
        this.k = 0;
        this.f12948g = this.f12947f[0];
        r();
        this.j = null;
    }

    public /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    public /* bridge */ /* synthetic */ k e() throws h {
        return super.b();
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return this.f12949h != this.i;
    }

    /* access modifiers changed from: protected */
    public f g() {
        List<com.applovin.exoplayer2.i.a> list = this.f12949h;
        this.i = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    public /* bridge */ /* synthetic */ j h() throws h {
        return super.a();
    }
}
