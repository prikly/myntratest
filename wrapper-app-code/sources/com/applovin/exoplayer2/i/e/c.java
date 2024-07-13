package com.applovin.exoplayer2.i.e;

import android.graphics.Color;
import android.graphics.PointF;
import android.text.TextUtils;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

final class c {

    /* renamed from: a  reason: collision with root package name */
    public final String f13064a;

    /* renamed from: b  reason: collision with root package name */
    public final int f13065b;

    /* renamed from: c  reason: collision with root package name */
    public final Integer f13066c;

    /* renamed from: d  reason: collision with root package name */
    public final float f13067d;

    /* renamed from: e  reason: collision with root package name */
    public final boolean f13068e;

    /* renamed from: f  reason: collision with root package name */
    public final boolean f13069f;

    /* renamed from: g  reason: collision with root package name */
    public final boolean f13070g;

    /* renamed from: h  reason: collision with root package name */
    public final boolean f13071h;

    static final class a {

        /* renamed from: a  reason: collision with root package name */
        public final int f13072a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13073b;

        /* renamed from: c  reason: collision with root package name */
        public final int f13074c;

        /* renamed from: d  reason: collision with root package name */
        public final int f13075d;

        /* renamed from: e  reason: collision with root package name */
        public final int f13076e;

        /* renamed from: f  reason: collision with root package name */
        public final int f13077f;

        /* renamed from: g  reason: collision with root package name */
        public final int f13078g;

        /* renamed from: h  reason: collision with root package name */
        public final int f13079h;
        public final int i;

        private a(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
            this.f13072a = i2;
            this.f13073b = i3;
            this.f13074c = i4;
            this.f13075d = i5;
            this.f13076e = i6;
            this.f13077f = i7;
            this.f13078g = i8;
            this.f13079h = i9;
            this.i = i10;
        }

        /* JADX WARNING: Can't fix incorrect switch cases order */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.exoplayer2.i.e.c.a a(java.lang.String r14) {
            /*
                r0 = 7
                java.lang.String r14 = r14.substring(r0)
                java.lang.String r1 = ","
                java.lang.String[] r14 = android.text.TextUtils.split(r14, r1)
                r1 = 0
                r2 = -1
                r3 = 0
                r5 = -1
                r6 = -1
                r7 = -1
                r8 = -1
                r9 = -1
                r10 = -1
                r11 = -1
                r12 = -1
            L_0x0016:
                int r4 = r14.length
                if (r3 >= r4) goto L_0x0092
                r4 = r14[r3]
                java.lang.String r4 = r4.trim()
                java.lang.String r4 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r4)
                int r13 = r4.hashCode()
                switch(r13) {
                    case -1178781136: goto L_0x0071;
                    case -1026963764: goto L_0x0067;
                    case -192095652: goto L_0x005d;
                    case -70925746: goto L_0x0053;
                    case 3029637: goto L_0x0049;
                    case 3373707: goto L_0x003f;
                    case 366554320: goto L_0x0035;
                    case 1767875043: goto L_0x002b;
                    default: goto L_0x002a;
                }
            L_0x002a:
                goto L_0x007b
            L_0x002b:
                java.lang.String r13 = "alignment"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 1
                goto L_0x007c
            L_0x0035:
                java.lang.String r13 = "fontsize"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 3
                goto L_0x007c
            L_0x003f:
                java.lang.String r13 = "name"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 0
                goto L_0x007c
            L_0x0049:
                java.lang.String r13 = "bold"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 4
                goto L_0x007c
            L_0x0053:
                java.lang.String r13 = "primarycolour"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 2
                goto L_0x007c
            L_0x005d:
                java.lang.String r13 = "strikeout"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 7
                goto L_0x007c
            L_0x0067:
                java.lang.String r13 = "underline"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 6
                goto L_0x007c
            L_0x0071:
                java.lang.String r13 = "italic"
                boolean r4 = r4.equals(r13)
                if (r4 == 0) goto L_0x007b
                r4 = 5
                goto L_0x007c
            L_0x007b:
                r4 = -1
            L_0x007c:
                switch(r4) {
                    case 0: goto L_0x008e;
                    case 1: goto L_0x008c;
                    case 2: goto L_0x008a;
                    case 3: goto L_0x0088;
                    case 4: goto L_0x0086;
                    case 5: goto L_0x0084;
                    case 6: goto L_0x0082;
                    case 7: goto L_0x0080;
                    default: goto L_0x007f;
                }
            L_0x007f:
                goto L_0x008f
            L_0x0080:
                r12 = r3
                goto L_0x008f
            L_0x0082:
                r11 = r3
                goto L_0x008f
            L_0x0084:
                r10 = r3
                goto L_0x008f
            L_0x0086:
                r9 = r3
                goto L_0x008f
            L_0x0088:
                r8 = r3
                goto L_0x008f
            L_0x008a:
                r7 = r3
                goto L_0x008f
            L_0x008c:
                r6 = r3
                goto L_0x008f
            L_0x008e:
                r5 = r3
            L_0x008f:
                int r3 = r3 + 1
                goto L_0x0016
            L_0x0092:
                if (r5 == r2) goto L_0x009c
                com.applovin.exoplayer2.i.e.c$a r0 = new com.applovin.exoplayer2.i.e.c$a
                int r13 = r14.length
                r4 = r0
                r4.<init>(r5, r6, r7, r8, r9, r10, r11, r12, r13)
                goto L_0x009d
            L_0x009c:
                r0 = 0
            L_0x009d:
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.c.a.a(java.lang.String):com.applovin.exoplayer2.i.e.c$a");
        }
    }

    static final class b {

        /* renamed from: c  reason: collision with root package name */
        private static final Pattern f13080c = Pattern.compile("\\{([^}]*)\\}");

        /* renamed from: d  reason: collision with root package name */
        private static final Pattern f13081d = Pattern.compile(ai.a("\\\\pos\\((%1$s),(%1$s)\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: e  reason: collision with root package name */
        private static final Pattern f13082e = Pattern.compile(ai.a("\\\\move\\(%1$s,%1$s,(%1$s),(%1$s)(?:,%1$s,%1$s)?\\)", "\\s*\\d+(?:\\.\\d+)?\\s*"));

        /* renamed from: f  reason: collision with root package name */
        private static final Pattern f13083f = Pattern.compile("\\\\an(\\d+)");

        /* renamed from: a  reason: collision with root package name */
        public final int f13084a;

        /* renamed from: b  reason: collision with root package name */
        public final PointF f13085b;

        private b(int i, PointF pointF) {
            this.f13084a = i;
            this.f13085b = pointF;
        }

        /* JADX WARNING: Can't wrap try/catch for region: R(9:3|4|5|(1:7)|8|9|(2:11|18)(1:17)|15|1) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0021 */
        /* JADX WARNING: Removed duplicated region for block: B:11:0x0027  */
        /* JADX WARNING: Removed duplicated region for block: B:17:0x0009 A[SYNTHETIC] */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public static com.applovin.exoplayer2.i.e.c.b a(java.lang.String r5) {
            /*
                java.util.regex.Pattern r0 = f13080c
                java.util.regex.Matcher r5 = r0.matcher(r5)
                r0 = -1
                r1 = 0
                r2 = -1
            L_0x0009:
                boolean r3 = r5.find()
                if (r3 == 0) goto L_0x002b
                r3 = 1
                java.lang.String r3 = r5.group(r3)
                java.lang.Object r3 = com.applovin.exoplayer2.l.a.b(r3)
                java.lang.String r3 = (java.lang.String) r3
                android.graphics.PointF r4 = c(r3)     // Catch:{ RuntimeException -> 0x0021 }
                if (r4 == 0) goto L_0x0021
                r1 = r4
            L_0x0021:
                int r3 = d(r3)     // Catch:{ RuntimeException -> 0x0029 }
                if (r3 == r0) goto L_0x0009
                r2 = r3
                goto L_0x0009
            L_0x0029:
                goto L_0x0009
            L_0x002b:
                com.applovin.exoplayer2.i.e.c$b r5 = new com.applovin.exoplayer2.i.e.c$b
                r5.<init>(r2, r1)
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.c.b.a(java.lang.String):com.applovin.exoplayer2.i.e.c$b");
        }

        public static String b(String str) {
            return f13080c.matcher(str).replaceAll("");
        }

        private static PointF c(String str) {
            String str2;
            String str3;
            Matcher matcher = f13081d.matcher(str);
            Matcher matcher2 = f13082e.matcher(str);
            boolean find = matcher.find();
            boolean find2 = matcher2.find();
            if (find) {
                if (find2) {
                    q.b("SsaStyle.Overrides", "Override has both \\pos(x,y) and \\move(x1,y1,x2,y2); using \\pos values. override='" + str + "'");
                }
                str2 = matcher.group(1);
                str3 = matcher.group(2);
            } else if (!find2) {
                return null;
            } else {
                str2 = matcher2.group(1);
                str3 = matcher2.group(2);
            }
            return new PointF(Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(str2)).trim()), Float.parseFloat(((String) com.applovin.exoplayer2.l.a.b(str3)).trim()));
        }

        private static int d(String str) {
            Matcher matcher = f13083f.matcher(str);
            if (matcher.find()) {
                return c.c((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            }
            return -1;
        }
    }

    private c(String str, int i, Integer num, float f2, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f13064a = str;
        this.f13065b = i;
        this.f13066c = num;
        this.f13067d = f2;
        this.f13068e = z;
        this.f13069f = z2;
        this.f13070g = z3;
        this.f13071h = z4;
    }

    public static c a(String str, a aVar) {
        String str2 = str;
        a aVar2 = aVar;
        com.applovin.exoplayer2.l.a.a(str2.startsWith("Style:"));
        String[] split = TextUtils.split(str2.substring(6), ",");
        if (split.length != aVar2.i) {
            q.c("SsaStyle", ai.a("Skipping malformed 'Style:' line (expected %s values, found %s): '%s'", Integer.valueOf(aVar2.i), Integer.valueOf(split.length), str2));
            return null;
        }
        try {
            return new c(split[aVar2.f13072a].trim(), aVar2.f13073b != -1 ? c(split[aVar2.f13073b].trim()) : -1, aVar2.f13074c != -1 ? a(split[aVar2.f13074c].trim()) : null, aVar2.f13075d != -1 ? d(split[aVar2.f13075d].trim()) : -3.4028235E38f, aVar2.f13076e != -1 && e(split[aVar2.f13076e].trim()), aVar2.f13077f != -1 && e(split[aVar2.f13077f].trim()), aVar2.f13078g != -1 && e(split[aVar2.f13078g].trim()), aVar2.f13079h != -1 && e(split[aVar2.f13079h].trim()));
        } catch (RuntimeException e2) {
            q.b("SsaStyle", "Skipping malformed 'Style:' line: '" + str2 + "'", e2);
            return null;
        }
    }

    public static Integer a(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            com.applovin.exoplayer2.l.a.a(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(com.applovin.exoplayer2.common.b.c.a(((parseLong >> 24) & 255) ^ 255), com.applovin.exoplayer2.common.b.c.a(parseLong & 255), com.applovin.exoplayer2.common.b.c.a((parseLong >> 8) & 255), com.applovin.exoplayer2.common.b.c.a((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e2) {
            q.b("SsaStyle", "Failed to parse color expression: '" + str + "'", e2);
            return null;
        }
    }

    private static boolean a(int i) {
        switch (i) {
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
                return true;
            default:
                return false;
        }
    }

    /* access modifiers changed from: private */
    public static int c(String str) {
        try {
            int parseInt = Integer.parseInt(str.trim());
            if (a(parseInt)) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        q.c("SsaStyle", "Ignoring unknown alignment: " + str);
        return -1;
    }

    private static float d(String str) {
        try {
            return Float.parseFloat(str);
        } catch (NumberFormatException e2) {
            q.b("SsaStyle", "Failed to parse font size: '" + str + "'", e2);
            return -3.4028235E38f;
        }
    }

    private static boolean e(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e2) {
            q.b("SsaStyle", "Failed to parse boolean value: '" + str + "'", e2);
            return false;
        }
    }
}
