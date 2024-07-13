package com.applovin.exoplayer2.i.a;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.common.base.Ascii;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.i.h;
import com.applovin.exoplayer2.i.j;
import com.applovin.exoplayer2.i.k;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import com.explorestack.protobuf.openrtb.LossReason;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public final class a extends c {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f12923a = {11, 1, 3, 12, 14, 5, 7, 9};

    /* renamed from: b  reason: collision with root package name */
    private static final int[] f12924b = {0, 4, 8, 12, 16, 20, 24, 28};
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static final int[] f12925c = {-1, -16711936, -16776961, -16711681, -65536, -256, -65281};

    /* renamed from: d  reason: collision with root package name */
    private static final int[] f12926d = {32, 33, 34, 35, 36, 37, 38, 39, 40, 41, 225, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 233, 93, 237, 243, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 231, 247, LossReason.LOSS_REASON_CREATIVE_FILTERED_CREATIVE_ATTRIBUTE_EXCLUSIONS_VALUE, 241, 9632};

    /* renamed from: e  reason: collision with root package name */
    private static final int[] f12927e = {174, 176, 189, 191, 8482, 162, 163, 9834, 224, 32, 232, 226, 234, 238, 244, 251};

    /* renamed from: f  reason: collision with root package name */
    private static final int[] f12928f = {193, 201, LossReason.LOSS_REASON_CREATIVE_FILTERED_ANIMATION_TOO_LONG_VALUE, 218, 220, 252, 8216, 161, 42, 39, 8212, 169, 8480, 8226, 8220, 8221, 192, 194, 199, 200, LossReason.LOSS_REASON_CREATIVE_FILTERED_DISAPPROVED_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_SIZE_NOT_ALLOWED_VALUE, 235, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_SECURE_VALUE, LossReason.LOSS_REASON_CREATIVE_FILTERED_LANGUAGE_EXCLUSIONS_VALUE, 239, LossReason.LOSS_REASON_CREATIVE_FILTERED_NOT_ALLOWED_IN_DEAL_VALUE, 217, 249, 219, 171, 187};

    /* renamed from: g  reason: collision with root package name */
    private static final int[] f12929g = {195, 227, LossReason.LOSS_REASON_CREATIVE_FILTERED_ADVERTISER_EXCLUSIONS_VALUE, 204, 236, LossReason.LOSS_REASON_CREATIVE_FILTERED_AD_TYPE_EXCLUSIONS_VALUE, 242, 213, 245, 123, 125, 92, 94, 95, 124, 126, 196, 228, 214, 246, 223, 165, 164, 9474, 197, 229, 216, 248, 9484, 9488, 9492, 9496};

    /* renamed from: h  reason: collision with root package name */
    private static final boolean[] f12930h = {false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false, false, true, true, false, true, false, false, true, false, true, true, false, true, false, false, true, true, false, false, true, false, true, true, false};
    private final y i = new y();
    private final int j;
    private final int k;
    private final int l;
    private final long m;
    private final ArrayList<C0126a> n = new ArrayList<>();
    private C0126a o = new C0126a(0, 4);
    private List<com.applovin.exoplayer2.i.a> p;
    private List<com.applovin.exoplayer2.i.a> q;
    private int r;
    private int s;
    private boolean t;
    private boolean u;
    private byte v;
    private byte w;
    private int x = 0;
    private boolean y;
    private long z;

    /* renamed from: com.applovin.exoplayer2.i.a.a$a  reason: collision with other inner class name */
    private static final class C0126a {

        /* renamed from: a  reason: collision with root package name */
        private final List<C0127a> f12931a = new ArrayList();

        /* renamed from: b  reason: collision with root package name */
        private final List<SpannableString> f12932b = new ArrayList();

        /* renamed from: c  reason: collision with root package name */
        private final StringBuilder f12933c = new StringBuilder();
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public int f12934d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public int f12935e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public int f12936f;

        /* renamed from: g  reason: collision with root package name */
        private int f12937g;

        /* renamed from: h  reason: collision with root package name */
        private int f12938h;

        /* renamed from: com.applovin.exoplayer2.i.a.a$a$a  reason: collision with other inner class name */
        private static class C0127a {

            /* renamed from: a  reason: collision with root package name */
            public final int f12939a;

            /* renamed from: b  reason: collision with root package name */
            public final boolean f12940b;

            /* renamed from: c  reason: collision with root package name */
            public int f12941c;

            public C0127a(int i, boolean z, int i2) {
                this.f12939a = i;
                this.f12940b = z;
                this.f12941c = i2;
            }
        }

        public C0126a(int i, int i2) {
            a(i);
            this.f12938h = i2;
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i, i2, 33);
        }

        private static void a(SpannableStringBuilder spannableStringBuilder, int i, int i2, int i3) {
            if (i3 != -1) {
                spannableStringBuilder.setSpan(new ForegroundColorSpan(i3), i, i2, 33);
            }
        }

        private static void b(SpannableStringBuilder spannableStringBuilder, int i, int i2) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i, i2, 33);
        }

        private SpannableString d() {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f12933c);
            int length = spannableStringBuilder.length();
            int i = 0;
            int i2 = -1;
            int i3 = -1;
            int i4 = 0;
            int i5 = -1;
            int i6 = -1;
            boolean z = false;
            while (i < this.f12931a.size()) {
                C0127a aVar = this.f12931a.get(i);
                boolean z2 = aVar.f12940b;
                int i7 = aVar.f12939a;
                if (i7 != 8) {
                    boolean z3 = i7 == 7;
                    if (i7 != 7) {
                        i6 = a.f12925c[i7];
                    }
                    z = z3;
                }
                int i8 = aVar.f12941c;
                i++;
                if (i8 != (i < this.f12931a.size() ? this.f12931a.get(i).f12941c : length)) {
                    if (i2 != -1 && !z2) {
                        a(spannableStringBuilder, i2, i8);
                        i2 = -1;
                    } else if (i2 == -1 && z2) {
                        i2 = i8;
                    }
                    if (i3 != -1 && !z) {
                        b(spannableStringBuilder, i3, i8);
                        i3 = -1;
                    } else if (i3 == -1 && z) {
                        i3 = i8;
                    }
                    if (i6 != i5) {
                        a(spannableStringBuilder, i4, i8, i5);
                        i5 = i6;
                        i4 = i8;
                    }
                }
            }
            if (!(i2 == -1 || i2 == length)) {
                a(spannableStringBuilder, i2, length);
            }
            if (!(i3 == -1 || i3 == length)) {
                b(spannableStringBuilder, i3, length);
            }
            if (i4 != length) {
                a(spannableStringBuilder, i4, length, i5);
            }
            return new SpannableString(spannableStringBuilder);
        }

        public void a(char c2) {
            if (this.f12933c.length() < 32) {
                this.f12933c.append(c2);
            }
        }

        public void a(int i) {
            this.f12937g = i;
            this.f12931a.clear();
            this.f12932b.clear();
            this.f12933c.setLength(0);
            this.f12934d = 15;
            this.f12935e = 0;
            this.f12936f = 0;
        }

        public void a(int i, boolean z) {
            this.f12931a.add(new C0127a(i, z, this.f12933c.length()));
        }

        public boolean a() {
            return this.f12931a.isEmpty() && this.f12932b.isEmpty() && this.f12933c.length() == 0;
        }

        public void b() {
            int length = this.f12933c.length();
            if (length > 0) {
                this.f12933c.delete(length - 1, length);
                int size = this.f12931a.size() - 1;
                while (size >= 0) {
                    C0127a aVar = this.f12931a.get(size);
                    if (aVar.f12941c == length) {
                        aVar.f12941c--;
                        size--;
                    } else {
                        return;
                    }
                }
            }
        }

        public void b(int i) {
            this.f12937g = i;
        }

        public void c() {
            this.f12932b.add(d());
            this.f12933c.setLength(0);
            this.f12931a.clear();
            int min = Math.min(this.f12938h, this.f12934d);
            while (this.f12932b.size() >= min) {
                this.f12932b.remove(0);
            }
        }

        public void c(int i) {
            this.f12938h = i;
        }

        public com.applovin.exoplayer2.i.a d(int i) {
            float f2;
            int i2 = this.f12935e + this.f12936f;
            int i3 = 32 - i2;
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            for (int i4 = 0; i4 < this.f12932b.size(); i4++) {
                spannableStringBuilder.append(ai.a((CharSequence) this.f12932b.get(i4), i3));
                spannableStringBuilder.append(10);
            }
            spannableStringBuilder.append(ai.a((CharSequence) d(), i3));
            if (spannableStringBuilder.length() == 0) {
                return null;
            }
            int length = i3 - spannableStringBuilder.length();
            int i5 = i2 - length;
            if (i == Integer.MIN_VALUE) {
                i = (this.f12937g != 2 || (Math.abs(i5) >= 3 && length >= 0)) ? (this.f12937g != 2 || i5 <= 0) ? 0 : 2 : 1;
            }
            if (i != 1) {
                if (i == 2) {
                    i2 = 32 - length;
                }
                f2 = ((((float) i2) / 32.0f) * 0.8f) + 0.1f;
            } else {
                f2 = 0.5f;
            }
            int i6 = this.f12934d;
            if (i6 > 7) {
                i6 = (i6 - 15) - 2;
            } else if (this.f12937g == 1) {
                i6 -= this.f12938h - 1;
            }
            return new a.C0125a().a((CharSequence) spannableStringBuilder).a(Layout.Alignment.ALIGN_NORMAL).a((float) i6, 1).a(f2).b(i).e();
        }
    }

    public a(String str, int i2, long j2) {
        this.m = j2 > 0 ? j2 * 1000 : -9223372036854775807L;
        this.j = "application/x-mp4-cea-608".equals(str) ? 2 : 3;
        if (i2 != 1) {
            if (i2 != 2) {
                if (i2 == 3) {
                    this.l = 0;
                } else if (i2 != 4) {
                    q.c("Cea608Decoder", "Invalid channel. Defaulting to CC1.");
                } else {
                    this.l = 1;
                }
                this.k = 1;
                a(0);
                m();
                this.y = true;
                this.z = -9223372036854775807L;
            }
            this.l = 1;
            this.k = 0;
            a(0);
            m();
            this.y = true;
            this.z = -9223372036854775807L;
        }
        this.l = 0;
        this.k = 0;
        a(0);
        m();
        this.y = true;
        this.z = -9223372036854775807L;
    }

    private void a(byte b2, byte b3) {
        int i2 = f12923a[b2 & 7];
        boolean z2 = false;
        if ((b3 & 32) != 0) {
            i2++;
        }
        if (i2 != this.o.f12934d) {
            if (this.r != 1 && !this.o.a()) {
                C0126a aVar = new C0126a(this.r, this.s);
                this.o = aVar;
                this.n.add(aVar);
            }
            int unused = this.o.f12934d = i2;
        }
        boolean z3 = (b3 & Ascii.DLE) == 16;
        if ((b3 & 1) == 1) {
            z2 = true;
        }
        int i3 = (b3 >> 1) & 7;
        this.o.a(z3 ? 8 : i3, z2);
        if (z3) {
            int unused2 = this.o.f12935e = f12924b[i3];
        }
    }

    private void a(int i2) {
        int i3 = this.r;
        if (i3 != i2) {
            this.r = i2;
            if (i2 == 3) {
                for (int i4 = 0; i4 < this.n.size(); i4++) {
                    this.n.get(i4).b(i2);
                }
                return;
            }
            m();
            if (i3 == 3 || i2 == 1 || i2 == 0) {
                this.p = Collections.emptyList();
            }
        }
    }

    private boolean a(byte b2) {
        if (h(b2)) {
            this.x = i(b2);
        }
        return this.x == this.l;
    }

    private boolean a(boolean z2, byte b2, byte b3) {
        if (!z2 || !j(b2)) {
            this.u = false;
        } else if (this.u && this.v == b2 && this.w == b3) {
            this.u = false;
            return true;
        } else {
            this.u = true;
            this.v = b2;
            this.w = b3;
        }
        return false;
    }

    private void b(byte b2) {
        this.o.a(' ');
        this.o.a((b2 >> 1) & 7, (b2 & 1) == 1);
    }

    private void b(byte b2, byte b3) {
        if (!k(b2)) {
            if (l(b2)) {
                if (!(b3 == 32 || b3 == 47)) {
                    switch (b3) {
                        case 37:
                        case 38:
                        case 39:
                            break;
                        default:
                            switch (b3) {
                                case 41:
                                    break;
                                case 42:
                                case 43:
                                    break;
                                default:
                                    return;
                            }
                    }
                }
                this.y = true;
                return;
            }
            return;
        }
        this.y = false;
    }

    private void b(int i2) {
        this.s = i2;
        this.o.c(i2);
    }

    private void c(byte b2) {
        if (b2 == 32) {
            a(2);
        } else if (b2 != 41) {
            switch (b2) {
                case 37:
                    a(1);
                    b(2);
                    return;
                case 38:
                    a(1);
                    b(3);
                    return;
                case 39:
                    a(1);
                    b(4);
                    return;
                default:
                    int i2 = this.r;
                    if (i2 != 0) {
                        if (b2 != 33) {
                            switch (b2) {
                                case 44:
                                    this.p = Collections.emptyList();
                                    int i3 = this.r;
                                    if (!(i3 == 1 || i3 == 3)) {
                                        return;
                                    }
                                case 45:
                                    if (i2 == 1 && !this.o.a()) {
                                        this.o.c();
                                        return;
                                    }
                                    return;
                                case 46:
                                    break;
                                case 47:
                                    this.p = l();
                                    break;
                                default:
                                    return;
                            }
                            m();
                            return;
                        }
                        this.o.b();
                        return;
                    }
                    return;
            }
        } else {
            a(3);
        }
    }

    private static boolean c(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 48;
    }

    private static char d(byte b2) {
        return (char) f12926d[(b2 & Ascii.DEL) - 32];
    }

    private static boolean d(byte b2, byte b3) {
        return (b2 & 246) == 18 && (b3 & 224) == 32;
    }

    private static char e(byte b2) {
        return (char) f12927e[b2 & Ascii.SI];
    }

    private static char e(byte b2, byte b3) {
        return (b2 & 1) == 0 ? f(b3) : g(b3);
    }

    private static char f(byte b2) {
        return (char) f12928f[b2 & Ascii.US];
    }

    private static boolean f(byte b2, byte b3) {
        return (b2 & 247) == 17 && (b3 & 240) == 32;
    }

    private static char g(byte b2) {
        return (char) f12929g[b2 & Ascii.US];
    }

    private static boolean g(byte b2, byte b3) {
        return (b2 & 240) == 16 && (b3 & 192) == 64;
    }

    private static boolean h(byte b2) {
        return (b2 & 224) == 0;
    }

    private static boolean h(byte b2, byte b3) {
        return (b2 & 247) == 23 && b3 >= 33 && b3 <= 35;
    }

    private static int i(byte b2) {
        return (b2 >> 3) & 1;
    }

    private static boolean i(byte b2, byte b3) {
        return (b2 & 246) == 20 && (b3 & 240) == 32;
    }

    private static boolean j(byte b2) {
        return (b2 & 240) == 16;
    }

    private static boolean k(byte b2) {
        return 1 <= b2 && b2 <= 15;
    }

    private List<com.applovin.exoplayer2.i.a> l() {
        int size = this.n.size();
        ArrayList arrayList = new ArrayList(size);
        int i2 = 2;
        for (int i3 = 0; i3 < size; i3++) {
            com.applovin.exoplayer2.i.a d2 = this.n.get(i3).d(RecyclerView.UNDEFINED_DURATION);
            arrayList.add(d2);
            if (d2 != null) {
                i2 = Math.min(i2, d2.j);
            }
        }
        ArrayList arrayList2 = new ArrayList(size);
        for (int i4 = 0; i4 < size; i4++) {
            com.applovin.exoplayer2.i.a aVar = (com.applovin.exoplayer2.i.a) arrayList.get(i4);
            if (aVar != null) {
                if (aVar.j != i2) {
                    aVar = (com.applovin.exoplayer2.i.a) com.applovin.exoplayer2.l.a.b(this.n.get(i4).d(i2));
                }
                arrayList2.add(aVar);
            }
        }
        return arrayList2;
    }

    private static boolean l(byte b2) {
        return (b2 & 247) == 20;
    }

    private void m() {
        this.o.a(this.r);
        this.n.clear();
        this.n.add(this.o);
    }

    private boolean n() {
        return (this.m == -9223372036854775807L || this.z == -9223372036854775807L || k() - this.z < this.m) ? false : true;
    }

    public /* bridge */ /* synthetic */ void a(long j2) {
        super.a(j2);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x006e  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x0018 A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.applovin.exoplayer2.i.j r10) {
        /*
            r9 = this;
            java.nio.ByteBuffer r10 = r10.f11419b
            java.lang.Object r10 = com.applovin.exoplayer2.l.a.b(r10)
            java.nio.ByteBuffer r10 = (java.nio.ByteBuffer) r10
            com.applovin.exoplayer2.l.y r0 = r9.i
            byte[] r1 = r10.array()
            int r10 = r10.limit()
            r0.a((byte[]) r1, (int) r10)
            r10 = 0
            r0 = 1
            r1 = 0
        L_0x0018:
            com.applovin.exoplayer2.l.y r2 = r9.i
            int r2 = r2.a()
            int r3 = r9.j
            if (r2 < r3) goto L_0x00f0
            r2 = 2
            if (r3 != r2) goto L_0x0027
            r2 = -4
            goto L_0x002e
        L_0x0027:
            com.applovin.exoplayer2.l.y r2 = r9.i
            int r2 = r2.h()
            byte r2 = (byte) r2
        L_0x002e:
            com.applovin.exoplayer2.l.y r3 = r9.i
            int r3 = r3.h()
            com.applovin.exoplayer2.l.y r4 = r9.i
            int r4 = r4.h()
            r5 = r2 & 2
            if (r5 == 0) goto L_0x003f
            goto L_0x0018
        L_0x003f:
            r5 = r2 & 1
            int r6 = r9.k
            if (r5 == r6) goto L_0x0046
            goto L_0x0018
        L_0x0046:
            r5 = r3 & 127(0x7f, float:1.78E-43)
            byte r5 = (byte) r5
            r6 = r4 & 127(0x7f, float:1.78E-43)
            byte r6 = (byte) r6
            if (r5 != 0) goto L_0x0051
            if (r6 != 0) goto L_0x0051
            goto L_0x0018
        L_0x0051:
            boolean r7 = r9.t
            r2 = r2 & 4
            r8 = 4
            if (r2 != r8) goto L_0x0064
            boolean[] r2 = f12930h
            boolean r3 = r2[r3]
            if (r3 == 0) goto L_0x0064
            boolean r2 = r2[r4]
            if (r2 == 0) goto L_0x0064
            r2 = 1
            goto L_0x0065
        L_0x0064:
            r2 = 0
        L_0x0065:
            r9.t = r2
            boolean r2 = r9.a(r2, r5, r6)
            if (r2 == 0) goto L_0x006e
            goto L_0x0018
        L_0x006e:
            boolean r2 = r9.t
            if (r2 != 0) goto L_0x0079
            if (r7 == 0) goto L_0x0018
            r9.m()
        L_0x0077:
            r1 = 1
            goto L_0x0018
        L_0x0079:
            r9.b(r5, r6)
            boolean r2 = r9.y
            if (r2 != 0) goto L_0x0081
            goto L_0x0018
        L_0x0081:
            boolean r2 = r9.a((byte) r5)
            if (r2 != 0) goto L_0x0088
            goto L_0x0018
        L_0x0088:
            boolean r1 = h(r5)
            if (r1 == 0) goto L_0x00d9
            boolean r1 = c(r5, r6)
            if (r1 == 0) goto L_0x009b
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            char r2 = e(r6)
            goto L_0x00ec
        L_0x009b:
            boolean r1 = d(r5, r6)
            if (r1 == 0) goto L_0x00ad
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            r1.b()
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            char r2 = e(r5, r6)
            goto L_0x00ec
        L_0x00ad:
            boolean r1 = f(r5, r6)
            if (r1 == 0) goto L_0x00b7
            r9.b((byte) r6)
            goto L_0x0077
        L_0x00b7:
            boolean r1 = g(r5, r6)
            if (r1 == 0) goto L_0x00c1
            r9.a(r5, r6)
            goto L_0x0077
        L_0x00c1:
            boolean r1 = h(r5, r6)
            if (r1 == 0) goto L_0x00cf
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            int r6 = r6 + -32
            int unused = r1.f12936f = r6
            goto L_0x0077
        L_0x00cf:
            boolean r1 = i(r5, r6)
            if (r1 == 0) goto L_0x0077
            r9.c(r6)
            goto L_0x0077
        L_0x00d9:
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            char r2 = d(r5)
            r1.a((char) r2)
            r1 = r6 & 224(0xe0, float:3.14E-43)
            if (r1 == 0) goto L_0x0077
            com.applovin.exoplayer2.i.a.a$a r1 = r9.o
            char r2 = d(r6)
        L_0x00ec:
            r1.a((char) r2)
            goto L_0x0077
        L_0x00f0:
            if (r1 == 0) goto L_0x0105
            int r10 = r9.r
            if (r10 == r0) goto L_0x00f9
            r0 = 3
            if (r10 != r0) goto L_0x0105
        L_0x00f9:
            java.util.List r10 = r9.l()
            r9.p = r10
            long r0 = r9.k()
            r9.z = r0
        L_0x0105:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.a.a.a(com.applovin.exoplayer2.i.j):void");
    }

    public /* bridge */ /* synthetic */ void b(j jVar) throws h {
        super.a(jVar);
    }

    public void c() {
        super.c();
        this.p = null;
        this.q = null;
        a(0);
        b(4);
        m();
        this.t = false;
        this.u = false;
        this.v = 0;
        this.w = 0;
        this.x = 0;
        this.y = true;
        this.z = -9223372036854775807L;
    }

    public void d() {
    }

    /* renamed from: e */
    public k b() throws h {
        k j2;
        k e2 = super.b();
        if (e2 != null) {
            return e2;
        }
        if (!n() || (j2 = j()) == null) {
            return null;
        }
        this.p = Collections.emptyList();
        this.z = -9223372036854775807L;
        k kVar = j2;
        kVar.a(k(), g(), Long.MAX_VALUE);
        return j2;
    }

    /* access modifiers changed from: protected */
    public boolean f() {
        return this.p != this.q;
    }

    /* access modifiers changed from: protected */
    public f g() {
        List<com.applovin.exoplayer2.i.a> list = this.p;
        this.q = list;
        return new d((List) com.applovin.exoplayer2.l.a.b(list));
    }

    public /* bridge */ /* synthetic */ j h() throws h {
        return super.a();
    }
}
