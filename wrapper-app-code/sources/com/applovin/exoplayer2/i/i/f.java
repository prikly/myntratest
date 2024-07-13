package com.applovin.exoplayer2.i.i;

import android.graphics.Color;
import android.text.Layout;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.text.TextUtils;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.i.a;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import kotlin.KotlinVersion;

public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final Pattern f13173a = Pattern.compile("^(\\S+)\\s+-->\\s+(\\S+)(.*)?$");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13174b = Pattern.compile("(\\S+?):(\\S+)");

    /* renamed from: c  reason: collision with root package name */
    private static final Map<String, Integer> f13175c;

    /* renamed from: d  reason: collision with root package name */
    private static final Map<String, Integer> f13176d;

    private static class a {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public static final Comparator<a> f13177a = $$Lambda$f$a$TCH4XBECFUwanThpebF9rnMO9g.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final b f13178b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final int f13179c;

        private a(b bVar, int i) {
            this.f13178b = bVar;
            this.f13179c = i;
        }
    }

    private static final class b {

        /* renamed from: a  reason: collision with root package name */
        public final String f13180a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13181b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13182c;

        /* renamed from: d  reason: collision with root package name */
        public final Set<String> f13183d;

        private b(String str, int i, String str2, Set<String> set) {
            this.f13181b = i;
            this.f13180a = str;
            this.f13182c = str2;
            this.f13183d = set;
        }

        public static b a() {
            return new b("", 0, "", Collections.emptySet());
        }

        public static b a(String str, int i) {
            String str2;
            String trim = str.trim();
            com.applovin.exoplayer2.l.a.a(!trim.isEmpty());
            int indexOf = trim.indexOf(" ");
            if (indexOf == -1) {
                str2 = "";
            } else {
                String trim2 = trim.substring(indexOf).trim();
                trim = trim.substring(0, indexOf);
                str2 = trim2;
            }
            String[] a2 = ai.a(trim, "\\.");
            String str3 = a2[0];
            HashSet hashSet = new HashSet();
            for (int i2 = 1; i2 < a2.length; i2++) {
                hashSet.add(a2[i2]);
            }
            return new b(str3, i, str2, hashSet);
        }
    }

    private static final class c implements Comparable<c> {

        /* renamed from: a  reason: collision with root package name */
        public final int f13184a;

        /* renamed from: b  reason: collision with root package name */
        public final d f13185b;

        public c(int i, d dVar) {
            this.f13184a = i;
            this.f13185b = dVar;
        }

        /* renamed from: a */
        public int compareTo(c cVar) {
            return Integer.compare(this.f13184a, cVar.f13184a);
        }
    }

    private static final class d {

        /* renamed from: a  reason: collision with root package name */
        public long f13186a = 0;

        /* renamed from: b  reason: collision with root package name */
        public long f13187b = 0;

        /* renamed from: c  reason: collision with root package name */
        public CharSequence f13188c;

        /* renamed from: d  reason: collision with root package name */
        public int f13189d = 2;

        /* renamed from: e  reason: collision with root package name */
        public float f13190e = -3.4028235E38f;

        /* renamed from: f  reason: collision with root package name */
        public int f13191f = 1;

        /* renamed from: g  reason: collision with root package name */
        public int f13192g = 0;

        /* renamed from: h  reason: collision with root package name */
        public float f13193h = -3.4028235E38f;
        public int i = RecyclerView.UNDEFINED_DURATION;
        public float j = 1.0f;
        public int k = RecyclerView.UNDEFINED_DURATION;

        private static float a(float f2, int i2) {
            int i3 = (f2 > -3.4028235E38f ? 1 : (f2 == -3.4028235E38f ? 0 : -1));
            if (i3 == 0 || i2 != 0 || (f2 >= 0.0f && f2 <= 1.0f)) {
                return i3 != 0 ? f2 : i2 == 0 ? 1.0f : -3.4028235E38f;
            }
            return 1.0f;
        }

        private static float a(int i2) {
            if (i2 != 4) {
                return i2 != 5 ? 0.5f : 1.0f;
            }
            return 0.0f;
        }

        private static float a(int i2, float f2) {
            if (i2 == 0) {
                return 1.0f - f2;
            }
            if (i2 == 1) {
                return f2 <= 0.5f ? f2 * 2.0f : (1.0f - f2) * 2.0f;
            }
            if (i2 == 2) {
                return f2;
            }
            throw new IllegalStateException(String.valueOf(i2));
        }

        private static int b(int i2) {
            if (i2 == 1) {
                return 0;
            }
            if (i2 == 3) {
                return 2;
            }
            if (i2 != 4) {
                return i2 != 5 ? 1 : 2;
            }
            return 0;
        }

        private static Layout.Alignment c(int i2) {
            if (i2 != 1) {
                if (i2 == 2) {
                    return Layout.Alignment.ALIGN_CENTER;
                }
                if (i2 != 3) {
                    if (i2 != 4) {
                        if (i2 != 5) {
                            q.c("WebvttCueParser", "Unknown textAlignment: " + i2);
                            return null;
                        }
                    }
                }
                return Layout.Alignment.ALIGN_OPPOSITE;
            }
            return Layout.Alignment.ALIGN_NORMAL;
        }

        public e a() {
            return new e(b().e(), this.f13186a, this.f13187b);
        }

        public a.C0125a b() {
            float f2 = this.f13193h;
            if (f2 == -3.4028235E38f) {
                f2 = a(this.f13189d);
            }
            int i2 = this.i;
            if (i2 == Integer.MIN_VALUE) {
                i2 = b(this.f13189d);
            }
            a.C0125a d2 = new a.C0125a().a(c(this.f13189d)).a(a(this.f13190e, this.f13191f), this.f13191f).a(this.f13192g).a(f2).b(i2).b(Math.min(this.j, a(i2, f2))).d(this.k);
            CharSequence charSequence = this.f13188c;
            if (charSequence != null) {
                d2.a(charSequence);
            }
            return d2;
        }
    }

    static {
        HashMap hashMap = new HashMap();
        hashMap.put("white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap.put("yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap.put("magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap.put("black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13175c = Collections.unmodifiableMap(hashMap);
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_white", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_lime", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_cyan", Integer.valueOf(Color.rgb(0, KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_red", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, 0)));
        hashMap2.put("bg_yellow", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, KotlinVersion.MAX_COMPONENT_VALUE, 0)));
        hashMap2.put("bg_magenta", Integer.valueOf(Color.rgb(KotlinVersion.MAX_COMPONENT_VALUE, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_blue", Integer.valueOf(Color.rgb(0, 0, KotlinVersion.MAX_COMPONENT_VALUE)));
        hashMap2.put("bg_black", Integer.valueOf(Color.rgb(0, 0, 0)));
        f13176d = Collections.unmodifiableMap(hashMap2);
    }

    private static int a(int i, int i2, int i3) {
        if (i != -1) {
            return i;
        }
        if (i2 != -1) {
            return i2;
        }
        if (i3 != -1) {
            return i3;
        }
        throw new IllegalArgumentException();
    }

    private static int a(String str, int i) {
        int indexOf = str.indexOf(62, i);
        return indexOf == -1 ? str.length() : indexOf + 1;
    }

    private static int a(List<d> list, String str, b bVar) {
        List<c> b2 = b(list, str, bVar);
        for (int i = 0; i < b2.size(); i++) {
            d dVar = b2.get(i).f13185b;
            if (dVar.k() != -1) {
                return dVar.k();
            }
        }
        return -1;
    }

    static SpannedString a(String str, String str2, List<d> list) {
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        ArrayDeque arrayDeque = new ArrayDeque();
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (i < str2.length()) {
            char charAt = str2.charAt(i);
            if (charAt == '&') {
                i++;
                int indexOf = str2.indexOf(59, i);
                int indexOf2 = str2.indexOf(32, i);
                if (indexOf == -1) {
                    indexOf = indexOf2;
                } else if (indexOf2 != -1) {
                    indexOf = Math.min(indexOf, indexOf2);
                }
                if (indexOf != -1) {
                    a(str2.substring(i, indexOf), spannableStringBuilder);
                    if (indexOf == indexOf2) {
                        spannableStringBuilder.append(" ");
                    }
                    i = indexOf + 1;
                } else {
                    spannableStringBuilder.append(charAt);
                }
            } else if (charAt != '<') {
                spannableStringBuilder.append(charAt);
                i++;
            } else {
                int i2 = i + 1;
                if (i2 < str2.length()) {
                    int i3 = 1;
                    boolean z = str2.charAt(i2) == '/';
                    i2 = a(str2, i2);
                    int i4 = i2 - 2;
                    boolean z2 = str2.charAt(i4) == '/';
                    if (z) {
                        i3 = 2;
                    }
                    int i5 = i + i3;
                    if (!z2) {
                        i4 = i2 - 1;
                    }
                    String substring = str2.substring(i5, i4);
                    if (!substring.trim().isEmpty()) {
                        String g2 = g(substring);
                        if (f(g2)) {
                            if (z) {
                                while (!arrayDeque.isEmpty()) {
                                    b bVar = (b) arrayDeque.pop();
                                    a(str, bVar, (List<a>) arrayList, spannableStringBuilder, list);
                                    if (!arrayDeque.isEmpty()) {
                                        arrayList.add(new a(bVar, spannableStringBuilder.length()));
                                    } else {
                                        arrayList.clear();
                                    }
                                    if (bVar.f13180a.equals(g2)) {
                                        break;
                                    }
                                }
                            } else if (!z2) {
                                arrayDeque.push(b.a(substring, spannableStringBuilder.length()));
                            }
                        }
                    }
                }
                i = i2;
            }
        }
        while (!arrayDeque.isEmpty()) {
            a(str, (b) arrayDeque.pop(), (List<a>) arrayList, spannableStringBuilder, list);
        }
        a(str, b.a(), (List<a>) Collections.emptyList(), spannableStringBuilder, list);
        return SpannedString.valueOf(spannableStringBuilder);
    }

    static a.C0125a a(String str) {
        d dVar = new d();
        a(str, dVar);
        return dVar.b();
    }

    static com.applovin.exoplayer2.i.a a(CharSequence charSequence) {
        d dVar = new d();
        dVar.f13188c = charSequence;
        return dVar.b().e();
    }

    public static e a(y yVar, List<d> list) {
        String C = yVar.C();
        if (C == null) {
            return null;
        }
        Matcher matcher = f13173a.matcher(C);
        if (matcher.matches()) {
            return a((String) null, matcher, yVar, list);
        }
        String C2 = yVar.C();
        if (C2 == null) {
            return null;
        }
        Matcher matcher2 = f13173a.matcher(C2);
        if (matcher2.matches()) {
            return a(C.trim(), matcher2, yVar, list);
        }
        return null;
    }

    private static e a(String str, Matcher matcher, y yVar, List<d> list) {
        d dVar = new d();
        try {
            dVar.f13186a = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(1)));
            dVar.f13187b = h.a((String) com.applovin.exoplayer2.l.a.b(matcher.group(2)));
            a((String) com.applovin.exoplayer2.l.a.b(matcher.group(3)), dVar);
            StringBuilder sb = new StringBuilder();
            while (true) {
                String C = yVar.C();
                if (!TextUtils.isEmpty(C)) {
                    if (sb.length() > 0) {
                        sb.append("\n");
                    }
                    sb.append(C.trim());
                } else {
                    dVar.f13188c = a(str, sb.toString(), list);
                    return dVar.a();
                }
            }
        } catch (NumberFormatException unused) {
            q.c("WebvttCueParser", "Skipping cue with bad header: " + matcher.group());
            return null;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:32:0x00a2  */
    /* JADX WARNING: Removed duplicated region for block: B:34:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(android.text.SpannableStringBuilder r4, com.applovin.exoplayer2.i.i.d r5, int r6, int r7) {
        /*
            if (r5 != 0) goto L_0x0003
            return
        L_0x0003:
            int r0 = r5.a()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L_0x0018
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r1 = r5.a()
            r0.<init>(r1)
            com.applovin.exoplayer2.i.d.d.a(r4, r0, r6, r7, r2)
        L_0x0018:
            boolean r0 = r5.b()
            if (r0 == 0) goto L_0x0026
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L_0x0026:
            boolean r0 = r5.c()
            if (r0 == 0) goto L_0x0034
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r4.setSpan(r0, r6, r7, r2)
        L_0x0034:
            boolean r0 = r5.f()
            if (r0 == 0) goto L_0x0046
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r1 = r5.e()
            r0.<init>(r1)
            com.applovin.exoplayer2.i.d.d.a(r4, r0, r6, r7, r2)
        L_0x0046:
            boolean r0 = r5.h()
            if (r0 == 0) goto L_0x0058
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r1 = r5.g()
            r0.<init>(r1)
            com.applovin.exoplayer2.i.d.d.a(r4, r0, r6, r7, r2)
        L_0x0058:
            java.lang.String r0 = r5.d()
            if (r0 == 0) goto L_0x006a
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r1 = r5.d()
            r0.<init>(r1)
            com.applovin.exoplayer2.i.d.d.a(r4, r0, r6, r7, r2)
        L_0x006a:
            int r0 = r5.i()
            r1 = 1
            if (r0 == r1) goto L_0x008f
            r1 = 2
            if (r0 == r1) goto L_0x0085
            r1 = 3
            if (r0 == r1) goto L_0x0078
            goto L_0x009c
        L_0x0078:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.j()
            r3 = 1120403456(0x42c80000, float:100.0)
            float r1 = r1 / r3
            r0.<init>(r1)
            goto L_0x0099
        L_0x0085:
            android.text.style.RelativeSizeSpan r0 = new android.text.style.RelativeSizeSpan
            float r1 = r5.j()
            r0.<init>(r1)
            goto L_0x0099
        L_0x008f:
            android.text.style.AbsoluteSizeSpan r0 = new android.text.style.AbsoluteSizeSpan
            float r3 = r5.j()
            int r3 = (int) r3
            r0.<init>(r3, r1)
        L_0x0099:
            com.applovin.exoplayer2.i.d.d.a(r4, r0, r6, r7, r2)
        L_0x009c:
            boolean r5 = r5.l()
            if (r5 == 0) goto L_0x00aa
            com.applovin.exoplayer2.i.d.a r5 = new com.applovin.exoplayer2.i.d.a
            r5.<init>()
            r4.setSpan(r5, r6, r7, r2)
        L_0x00aa:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.a(android.text.SpannableStringBuilder, com.applovin.exoplayer2.i.i.d, int, int):void");
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, String str, b bVar, List<a> list, List<d> list2) {
        int a2 = a(list2, str, bVar);
        ArrayList arrayList = new ArrayList(list.size());
        arrayList.addAll(list);
        Collections.sort(arrayList, a.f13177a);
        int i = bVar.f13181b;
        int i2 = 0;
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if ("rt".equals(((a) arrayList.get(i3)).f13178b.f13180a)) {
                a aVar = (a) arrayList.get(i3);
                int a3 = a(a(list2, str, aVar.f13178b), a2, 1);
                int i4 = aVar.f13178b.f13181b - i2;
                int b2 = aVar.f13179c - i2;
                CharSequence subSequence = spannableStringBuilder.subSequence(i4, b2);
                spannableStringBuilder.delete(i4, b2);
                spannableStringBuilder.setSpan(new com.applovin.exoplayer2.i.d.c(subSequence.toString(), a3), i, i4, 33);
                i2 += subSequence.length();
                i = i4;
            }
        }
    }

    private static void a(SpannableStringBuilder spannableStringBuilder, Set<String> set, int i, int i2) {
        Object backgroundColorSpan;
        for (String next : set) {
            if (f13175c.containsKey(next)) {
                backgroundColorSpan = new ForegroundColorSpan(f13175c.get(next).intValue());
            } else if (f13176d.containsKey(next)) {
                backgroundColorSpan = new BackgroundColorSpan(f13176d.get(next).intValue());
            }
            spannableStringBuilder.setSpan(backgroundColorSpan, i, i2, 33);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0045  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0070  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r5, android.text.SpannableStringBuilder r6) {
        /*
            int r0 = r5.hashCode()
            r1 = 3309(0xced, float:4.637E-42)
            r2 = 3
            r3 = 2
            r4 = 1
            if (r0 == r1) goto L_0x0038
            r1 = 3464(0xd88, float:4.854E-42)
            if (r0 == r1) goto L_0x002e
            r1 = 96708(0x179c4, float:1.35517E-40)
            if (r0 == r1) goto L_0x0024
            r1 = 3374865(0x337f11, float:4.729193E-39)
            if (r0 == r1) goto L_0x001a
            goto L_0x0042
        L_0x001a:
            java.lang.String r0 = "nbsp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 2
            goto L_0x0043
        L_0x0024:
            java.lang.String r0 = "amp"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 3
            goto L_0x0043
        L_0x002e:
            java.lang.String r0 = "lt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 0
            goto L_0x0043
        L_0x0038:
            java.lang.String r0 = "gt"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0042
            r0 = 1
            goto L_0x0043
        L_0x0042:
            r0 = -1
        L_0x0043:
            if (r0 == 0) goto L_0x0070
            if (r0 == r4) goto L_0x006d
            if (r0 == r3) goto L_0x006a
            if (r0 == r2) goto L_0x0067
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            r6.<init>()
            java.lang.String r0 = "ignoring unsupported entity: '&"
            r6.append(r0)
            r6.append(r5)
            java.lang.String r5 = ";'"
            r6.append(r5)
            java.lang.String r5 = r6.toString()
            java.lang.String r6 = "WebvttCueParser"
            com.applovin.exoplayer2.l.q.c(r6, r5)
            goto L_0x0075
        L_0x0067:
            r5 = 38
            goto L_0x0072
        L_0x006a:
            r5 = 32
            goto L_0x0072
        L_0x006d:
            r5 = 62
            goto L_0x0072
        L_0x0070:
            r5 = 60
        L_0x0072:
            r6.append(r5)
        L_0x0075:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.a(java.lang.String, android.text.SpannableStringBuilder):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:43:0x0086 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0087  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x008d  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARNING: Removed duplicated region for block: B:47:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x009d  */
    /* JADX WARNING: Removed duplicated region for block: B:53:0x00af A[LOOP:0: B:51:0x00a9->B:53:0x00af, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static void a(java.lang.String r8, com.applovin.exoplayer2.i.i.f.b r9, java.util.List<com.applovin.exoplayer2.i.i.f.a> r10, android.text.SpannableStringBuilder r11, java.util.List<com.applovin.exoplayer2.i.i.d> r12) {
        /*
            int r0 = r9.f13181b
            int r1 = r11.length()
            java.lang.String r2 = r9.f13180a
            int r3 = r2.hashCode()
            r4 = 0
            r5 = 2
            r6 = 1
            if (r3 == 0) goto L_0x0076
            r7 = 105(0x69, float:1.47E-43)
            if (r3 == r7) goto L_0x006c
            r7 = 3314158(0x3291ee, float:4.644125E-39)
            if (r3 == r7) goto L_0x0062
            r7 = 3511770(0x3595da, float:4.921038E-39)
            if (r3 == r7) goto L_0x0058
            r7 = 98
            if (r3 == r7) goto L_0x004e
            r7 = 99
            if (r3 == r7) goto L_0x0044
            r7 = 117(0x75, float:1.64E-43)
            if (r3 == r7) goto L_0x003a
            r7 = 118(0x76, float:1.65E-43)
            if (r3 == r7) goto L_0x0030
            goto L_0x0080
        L_0x0030:
            java.lang.String r3 = "v"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 6
            goto L_0x0081
        L_0x003a:
            java.lang.String r3 = "u"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 3
            goto L_0x0081
        L_0x0044:
            java.lang.String r3 = "c"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 4
            goto L_0x0081
        L_0x004e:
            java.lang.String r3 = "b"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 0
            goto L_0x0081
        L_0x0058:
            java.lang.String r3 = "ruby"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 2
            goto L_0x0081
        L_0x0062:
            java.lang.String r3 = "lang"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 5
            goto L_0x0081
        L_0x006c:
            java.lang.String r3 = "i"
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 1
            goto L_0x0081
        L_0x0076:
            java.lang.String r3 = ""
            boolean r2 = r2.equals(r3)
            if (r2 == 0) goto L_0x0080
            r2 = 7
            goto L_0x0081
        L_0x0080:
            r2 = -1
        L_0x0081:
            r3 = 33
            switch(r2) {
                case 0: goto L_0x009d;
                case 1: goto L_0x0097;
                case 2: goto L_0x0093;
                case 3: goto L_0x008d;
                case 4: goto L_0x0087;
                case 5: goto L_0x00a5;
                case 6: goto L_0x00a5;
                case 7: goto L_0x00a5;
                default: goto L_0x0086;
            }
        L_0x0086:
            return
        L_0x0087:
            java.util.Set<java.lang.String> r10 = r9.f13183d
            a((android.text.SpannableStringBuilder) r11, (java.util.Set<java.lang.String>) r10, (int) r0, (int) r1)
            goto L_0x00a5
        L_0x008d:
            android.text.style.UnderlineSpan r10 = new android.text.style.UnderlineSpan
            r10.<init>()
            goto L_0x00a2
        L_0x0093:
            a((android.text.SpannableStringBuilder) r11, (java.lang.String) r8, (com.applovin.exoplayer2.i.i.f.b) r9, (java.util.List<com.applovin.exoplayer2.i.i.f.a>) r10, (java.util.List<com.applovin.exoplayer2.i.i.d>) r12)
            goto L_0x00a5
        L_0x0097:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r5)
            goto L_0x00a2
        L_0x009d:
            android.text.style.StyleSpan r10 = new android.text.style.StyleSpan
            r10.<init>(r6)
        L_0x00a2:
            r11.setSpan(r10, r0, r1, r3)
        L_0x00a5:
            java.util.List r8 = b(r12, r8, r9)
        L_0x00a9:
            int r9 = r8.size()
            if (r4 >= r9) goto L_0x00bd
            java.lang.Object r9 = r8.get(r4)
            com.applovin.exoplayer2.i.i.f$c r9 = (com.applovin.exoplayer2.i.i.f.c) r9
            com.applovin.exoplayer2.i.i.d r9 = r9.f13185b
            a((android.text.SpannableStringBuilder) r11, (com.applovin.exoplayer2.i.i.d) r9, (int) r0, (int) r1)
            int r4 = r4 + 1
            goto L_0x00a9
        L_0x00bd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.a(java.lang.String, com.applovin.exoplayer2.i.i.f$b, java.util.List, android.text.SpannableStringBuilder, java.util.List):void");
    }

    private static void a(String str, d dVar) {
        Matcher matcher = f13174b.matcher(str);
        while (matcher.find()) {
            String str2 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(1));
            String str3 = (String) com.applovin.exoplayer2.l.a.b(matcher.group(2));
            try {
                if ("line".equals(str2)) {
                    b(str3, dVar);
                } else if ("align".equals(str2)) {
                    dVar.f13189d = e(str3);
                } else if ("position".equals(str2)) {
                    c(str3, dVar);
                } else if ("size".equals(str2)) {
                    dVar.j = h.b(str3);
                } else if ("vertical".equals(str2)) {
                    dVar.k = d(str3);
                } else {
                    q.c("WebvttCueParser", "Unknown cue setting " + str2 + ":" + str3);
                }
            } catch (NumberFormatException unused) {
                q.c("WebvttCueParser", "Skipping bad cue setting: " + matcher.group());
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int b(java.lang.String r5) {
        /*
            int r0 = r5.hashCode()
            r1 = 0
            r2 = 3
            r3 = 2
            r4 = 1
            switch(r0) {
                case -1364013995: goto L_0x002a;
                case -1074341483: goto L_0x0020;
                case 100571: goto L_0x0016;
                case 109757538: goto L_0x000c;
                default: goto L_0x000b;
            }
        L_0x000b:
            goto L_0x0034
        L_0x000c:
            java.lang.String r0 = "start"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 0
            goto L_0x0035
        L_0x0016:
            java.lang.String r0 = "end"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 3
            goto L_0x0035
        L_0x0020:
            java.lang.String r0 = "middle"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 2
            goto L_0x0035
        L_0x002a:
            java.lang.String r0 = "center"
            boolean r0 = r5.equals(r0)
            if (r0 == 0) goto L_0x0034
            r0 = 1
            goto L_0x0035
        L_0x0034:
            r0 = -1
        L_0x0035:
            if (r0 == 0) goto L_0x0058
            if (r0 == r4) goto L_0x0057
            if (r0 == r3) goto L_0x0057
            if (r0 == r2) goto L_0x0056
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r5)
            java.lang.String r5 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.l.q.c(r0, r5)
            r5 = -2147483648(0xffffffff80000000, float:-0.0)
            return r5
        L_0x0056:
            return r3
        L_0x0057:
            return r4
        L_0x0058:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.b(java.lang.String):int");
    }

    private static List<c> b(List<d> list, String str, b bVar) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < list.size(); i++) {
            d dVar = list.get(i);
            int a2 = dVar.a(str, bVar.f13180a, bVar.f13183d, bVar.f13182c);
            if (a2 > 0) {
                arrayList.add(new c(a2, dVar));
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    private static void b(String str, d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.f13192g = b(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        if (str.endsWith("%")) {
            dVar.f13190e = h.b(str);
            dVar.f13191f = 0;
            return;
        }
        dVar.f13190e = (float) Integer.parseInt(str);
        dVar.f13191f = 1;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int c(java.lang.String r7) {
        /*
            int r0 = r7.hashCode()
            r1 = 0
            r2 = 5
            r3 = 4
            r4 = 3
            r5 = 2
            r6 = 1
            switch(r0) {
                case -1842484672: goto L_0x0040;
                case -1364013995: goto L_0x0036;
                case -1276788989: goto L_0x002c;
                case -1074341483: goto L_0x0022;
                case 100571: goto L_0x0018;
                case 109757538: goto L_0x000e;
                default: goto L_0x000d;
            }
        L_0x000d:
            goto L_0x004a
        L_0x000e:
            java.lang.String r0 = "start"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 1
            goto L_0x004b
        L_0x0018:
            java.lang.String r0 = "end"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 5
            goto L_0x004b
        L_0x0022:
            java.lang.String r0 = "middle"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 3
            goto L_0x004b
        L_0x002c:
            java.lang.String r0 = "line-right"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 4
            goto L_0x004b
        L_0x0036:
            java.lang.String r0 = "center"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 2
            goto L_0x004b
        L_0x0040:
            java.lang.String r0 = "line-left"
            boolean r0 = r7.equals(r0)
            if (r0 == 0) goto L_0x004a
            r0 = 0
            goto L_0x004b
        L_0x004a:
            r0 = -1
        L_0x004b:
            if (r0 == 0) goto L_0x0072
            if (r0 == r6) goto L_0x0072
            if (r0 == r5) goto L_0x0071
            if (r0 == r4) goto L_0x0071
            if (r0 == r3) goto L_0x0070
            if (r0 == r2) goto L_0x0070
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid anchor value: "
            r0.append(r1)
            r0.append(r7)
            java.lang.String r7 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.l.q.c(r0, r7)
            r7 = -2147483648(0xffffffff80000000, float:-0.0)
            return r7
        L_0x0070:
            return r5
        L_0x0071:
            return r6
        L_0x0072:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.c(java.lang.String):int");
    }

    private static void c(String str, d dVar) {
        int indexOf = str.indexOf(44);
        if (indexOf != -1) {
            dVar.i = c(str.substring(indexOf + 1));
            str = str.substring(0, indexOf);
        }
        dVar.f13193h = h.b(str);
    }

    /* JADX WARNING: Removed duplicated region for block: B:12:0x0025  */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0042 A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int d(java.lang.String r3) {
        /*
            int r0 = r3.hashCode()
            r1 = 3462(0xd86, float:4.851E-42)
            r2 = 1
            if (r0 == r1) goto L_0x0018
            r1 = 3642(0xe3a, float:5.104E-42)
            if (r0 == r1) goto L_0x000e
            goto L_0x0022
        L_0x000e:
            java.lang.String r0 = "rl"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 0
            goto L_0x0023
        L_0x0018:
            java.lang.String r0 = "lr"
            boolean r0 = r3.equals(r0)
            if (r0 == 0) goto L_0x0022
            r0 = 1
            goto L_0x0023
        L_0x0022:
            r0 = -1
        L_0x0023:
            if (r0 == 0) goto L_0x0042
            if (r0 == r2) goto L_0x0040
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid 'vertical' value: "
            r0.append(r1)
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.l.q.c(r0, r3)
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            return r3
        L_0x0040:
            r3 = 2
            return r3
        L_0x0042:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.d(java.lang.String):int");
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static int e(java.lang.String r6) {
        /*
            int r0 = r6.hashCode()
            r1 = 5
            r2 = 4
            r3 = 3
            r4 = 1
            r5 = 2
            switch(r0) {
                case -1364013995: goto L_0x003f;
                case -1074341483: goto L_0x0035;
                case 100571: goto L_0x002b;
                case 3317767: goto L_0x0021;
                case 108511772: goto L_0x0017;
                case 109757538: goto L_0x000d;
                default: goto L_0x000c;
            }
        L_0x000c:
            goto L_0x0049
        L_0x000d:
            java.lang.String r0 = "start"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 0
            goto L_0x004a
        L_0x0017:
            java.lang.String r0 = "right"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 5
            goto L_0x004a
        L_0x0021:
            java.lang.String r0 = "left"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 1
            goto L_0x004a
        L_0x002b:
            java.lang.String r0 = "end"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 4
            goto L_0x004a
        L_0x0035:
            java.lang.String r0 = "middle"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 3
            goto L_0x004a
        L_0x003f:
            java.lang.String r0 = "center"
            boolean r0 = r6.equals(r0)
            if (r0 == 0) goto L_0x0049
            r0 = 2
            goto L_0x004a
        L_0x0049:
            r0 = -1
        L_0x004a:
            if (r0 == 0) goto L_0x0071
            if (r0 == r4) goto L_0x0070
            if (r0 == r5) goto L_0x006f
            if (r0 == r3) goto L_0x006f
            if (r0 == r2) goto L_0x006e
            if (r0 == r1) goto L_0x006d
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "Invalid alignment value: "
            r0.append(r1)
            r0.append(r6)
            java.lang.String r6 = r0.toString()
            java.lang.String r0 = "WebvttCueParser"
            com.applovin.exoplayer2.l.q.c(r0, r6)
            return r5
        L_0x006d:
            return r1
        L_0x006e:
            return r3
        L_0x006f:
            return r5
        L_0x0070:
            return r2
        L_0x0071:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.e(java.lang.String):int");
    }

    /* JADX WARNING: Removed duplicated region for block: B:42:0x007d A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x007e A[RETURN] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static boolean f(java.lang.String r4) {
        /*
            int r0 = r4.hashCode()
            r1 = 98
            r2 = 0
            r3 = 1
            if (r0 == r1) goto L_0x006f
            r1 = 99
            if (r0 == r1) goto L_0x0065
            r1 = 105(0x69, float:1.47E-43)
            if (r0 == r1) goto L_0x005b
            r1 = 3650(0xe42, float:5.115E-42)
            if (r0 == r1) goto L_0x0051
            r1 = 3314158(0x3291ee, float:4.644125E-39)
            if (r0 == r1) goto L_0x0047
            r1 = 3511770(0x3595da, float:4.921038E-39)
            if (r0 == r1) goto L_0x003d
            r1 = 117(0x75, float:1.64E-43)
            if (r0 == r1) goto L_0x0033
            r1 = 118(0x76, float:1.65E-43)
            if (r0 == r1) goto L_0x0029
            goto L_0x0079
        L_0x0029:
            java.lang.String r0 = "v"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 7
            goto L_0x007a
        L_0x0033:
            java.lang.String r0 = "u"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 6
            goto L_0x007a
        L_0x003d:
            java.lang.String r0 = "ruby"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 4
            goto L_0x007a
        L_0x0047:
            java.lang.String r0 = "lang"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 3
            goto L_0x007a
        L_0x0051:
            java.lang.String r0 = "rt"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 5
            goto L_0x007a
        L_0x005b:
            java.lang.String r0 = "i"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 2
            goto L_0x007a
        L_0x0065:
            java.lang.String r0 = "c"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 1
            goto L_0x007a
        L_0x006f:
            java.lang.String r0 = "b"
            boolean r4 = r4.equals(r0)
            if (r4 == 0) goto L_0x0079
            r4 = 0
            goto L_0x007a
        L_0x0079:
            r4 = -1
        L_0x007a:
            switch(r4) {
                case 0: goto L_0x007e;
                case 1: goto L_0x007e;
                case 2: goto L_0x007e;
                case 3: goto L_0x007e;
                case 4: goto L_0x007e;
                case 5: goto L_0x007e;
                case 6: goto L_0x007e;
                case 7: goto L_0x007e;
                default: goto L_0x007d;
            }
        L_0x007d:
            return r2
        L_0x007e:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.i.f.f(java.lang.String):boolean");
    }

    private static String g(String str) {
        String trim = str.trim();
        com.applovin.exoplayer2.l.a.a(!trim.isEmpty());
        return ai.b(trim, "[ \\.]")[0];
    }
}
