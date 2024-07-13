package com.applovin.exoplayer2.ui;

import android.text.Html;
import android.text.Spanned;
import android.text.style.AbsoluteSizeSpan;
import android.text.style.BackgroundColorSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.RelativeSizeSpan;
import android.text.style.StrikethroughSpan;
import android.text.style.StyleSpan;
import android.text.style.TypefaceSpan;
import android.text.style.UnderlineSpan;
import android.util.SparseArray;
import com.applovin.exoplayer2.common.a.u;
import com.applovin.exoplayer2.i.d.e;
import com.applovin.exoplayer2.l.ai;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;

final class h {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13894a = Pattern.compile("(&#13;)?&#10;");

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final String f13895a;

        /* renamed from: b  reason: collision with root package name */
        public final Map<String, String> f13896b;

        private a(String str, Map<String, String> map) {
            this.f13895a = str;
            this.f13896b = map;
        }
    }

    private static final class b {
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public static final Comparator<b> f13897e = $$Lambda$h$b$5bdUpXq4pNI6toR2uujrLFzamZI.INSTANCE;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public static final Comparator<b> f13898f = $$Lambda$h$b$gApkYc4yd0eZadMMNalVbgTXI.INSTANCE;

        /* renamed from: a  reason: collision with root package name */
        public final int f13899a;

        /* renamed from: b  reason: collision with root package name */
        public final int f13900b;

        /* renamed from: c  reason: collision with root package name */
        public final String f13901c;

        /* renamed from: d  reason: collision with root package name */
        public final String f13902d;

        private b(int i, int i2, String str, String str2) {
            this.f13899a = i;
            this.f13900b = i2;
            this.f13901c = str;
            this.f13902d = str2;
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int a(b bVar, b bVar2) {
            int compare = Integer.compare(bVar2.f13899a, bVar.f13899a);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar2.f13901c.compareTo(bVar.f13901c);
            return compareTo != 0 ? compareTo : bVar2.f13902d.compareTo(bVar.f13902d);
        }

        /* access modifiers changed from: private */
        public static /* synthetic */ int b(b bVar, b bVar2) {
            int compare = Integer.compare(bVar2.f13900b, bVar.f13900b);
            if (compare != 0) {
                return compare;
            }
            int compareTo = bVar.f13901c.compareTo(bVar2.f13901c);
            return compareTo != 0 ? compareTo : bVar.f13902d.compareTo(bVar2.f13902d);
        }
    }

    private static final class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final List<b> f13903a = new ArrayList();
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final List<b> f13904b = new ArrayList();
    }

    private static SparseArray<c> a(Spanned spanned, float f2) {
        SparseArray<c> sparseArray = new SparseArray<>();
        for (Object obj : spanned.getSpans(0, spanned.length(), Object.class)) {
            String a2 = a(obj, f2);
            String a3 = a(obj);
            int spanStart = spanned.getSpanStart(obj);
            int spanEnd = spanned.getSpanEnd(obj);
            if (a2 != null) {
                com.applovin.exoplayer2.l.a.b(a3);
                b bVar = new b(spanStart, spanEnd, a2, a3);
                a(sparseArray, spanStart).f13903a.add(bVar);
                a(sparseArray, spanEnd).f13904b.add(bVar);
            }
        }
        return sparseArray;
    }

    public static a a(CharSequence charSequence, float f2) {
        if (charSequence == null) {
            return new a("", u.a());
        }
        if (!(charSequence instanceof Spanned)) {
            return new a(a(charSequence), u.a());
        }
        Spanned spanned = (Spanned) charSequence;
        HashSet<Integer> hashSet = new HashSet<>();
        int i = 0;
        for (BackgroundColorSpan backgroundColor : (BackgroundColorSpan[]) spanned.getSpans(0, spanned.length(), BackgroundColorSpan.class)) {
            hashSet.add(Integer.valueOf(backgroundColor.getBackgroundColor()));
        }
        HashMap hashMap = new HashMap();
        for (Integer intValue : hashSet) {
            int intValue2 = intValue.intValue();
            hashMap.put(e.a("bg_" + intValue2), ai.a("background-color:%s;", e.a(intValue2)));
        }
        SparseArray<c> a2 = a(spanned, f2);
        StringBuilder sb = new StringBuilder(spanned.length());
        int i2 = 0;
        while (i < a2.size()) {
            int keyAt = a2.keyAt(i);
            sb.append(a(spanned.subSequence(i2, keyAt)));
            c cVar = a2.get(keyAt);
            Collections.sort(cVar.f13904b, b.f13898f);
            for (b bVar : cVar.f13904b) {
                sb.append(bVar.f13902d);
            }
            Collections.sort(cVar.f13903a, b.f13897e);
            for (b bVar2 : cVar.f13903a) {
                sb.append(bVar2.f13901c);
            }
            i++;
            i2 = keyAt;
        }
        sb.append(a(spanned.subSequence(i2, spanned.length())));
        return new a(sb.toString(), hashMap);
    }

    private static c a(SparseArray<c> sparseArray, int i) {
        c cVar = sparseArray.get(i);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c();
        sparseArray.put(i, cVar2);
        return cVar2;
    }

    private static String a(int i) {
        return i != 2 ? "over right" : "under left";
    }

    /* JADX WARNING: Removed duplicated region for block: B:15:0x0029  */
    /* JADX WARNING: Removed duplicated region for block: B:7:0x0016  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.lang.String a(int r3, int r4) {
        /*
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r1 = 2
            r2 = 1
            if (r4 == r2) goto L_0x000f
            if (r4 == r1) goto L_0x000c
            goto L_0x0014
        L_0x000c:
            java.lang.String r4 = "open "
            goto L_0x0011
        L_0x000f:
            java.lang.String r4 = "filled "
        L_0x0011:
            r0.append(r4)
        L_0x0014:
            if (r3 == 0) goto L_0x0029
            if (r3 == r2) goto L_0x0026
            if (r3 == r1) goto L_0x0023
            r4 = 3
            if (r3 == r4) goto L_0x0020
            java.lang.String r3 = "unset"
            goto L_0x002b
        L_0x0020:
            java.lang.String r3 = "sesame"
            goto L_0x002b
        L_0x0023:
            java.lang.String r3 = "dot"
            goto L_0x002b
        L_0x0026:
            java.lang.String r3 = "circle"
            goto L_0x002b
        L_0x0029:
            java.lang.String r3 = "none"
        L_0x002b:
            r0.append(r3)
            java.lang.String r3 = r0.toString()
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.ui.h.a(int, int):java.lang.String");
    }

    private static String a(CharSequence charSequence) {
        return f13894a.matcher(Html.escapeHtml(charSequence)).replaceAll("<br>");
    }

    private static String a(Object obj) {
        if ((obj instanceof StrikethroughSpan) || (obj instanceof ForegroundColorSpan) || (obj instanceof BackgroundColorSpan) || (obj instanceof com.applovin.exoplayer2.i.d.a) || (obj instanceof AbsoluteSizeSpan) || (obj instanceof RelativeSizeSpan) || (obj instanceof e)) {
            return "</span>";
        }
        if (!(obj instanceof TypefaceSpan)) {
            if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "</b>";
                }
                if (style == 2) {
                    return "</i>";
                }
                if (style != 3) {
                    return null;
                }
                return "</i></b>";
            } else if (obj instanceof com.applovin.exoplayer2.i.d.c) {
                return "<rt>" + a((CharSequence) ((com.applovin.exoplayer2.i.d.c) obj).f13047a) + "</rt></ruby>";
            } else if (obj instanceof UnderlineSpan) {
                return "</u>";
            }
            return null;
        } else if (((TypefaceSpan) obj).getFamily() != null) {
            return "</span>";
        } else {
            return null;
        }
    }

    private static String a(Object obj, float f2) {
        if (obj instanceof StrikethroughSpan) {
            return "<span style='text-decoration:line-through;'>";
        }
        if (obj instanceof ForegroundColorSpan) {
            return ai.a("<span style='color:%s;'>", e.a(((ForegroundColorSpan) obj).getForegroundColor()));
        } else if (obj instanceof BackgroundColorSpan) {
            return ai.a("<span class='bg_%s'>", Integer.valueOf(((BackgroundColorSpan) obj).getBackgroundColor()));
        } else if (obj instanceof com.applovin.exoplayer2.i.d.a) {
            return "<span style='text-combine-upright:all;'>";
        } else {
            if (obj instanceof AbsoluteSizeSpan) {
                AbsoluteSizeSpan absoluteSizeSpan = (AbsoluteSizeSpan) obj;
                boolean dip = absoluteSizeSpan.getDip();
                float size = (float) absoluteSizeSpan.getSize();
                if (!dip) {
                    size /= f2;
                }
                return ai.a("<span style='font-size:%.2fpx;'>", Float.valueOf(size));
            } else if (obj instanceof RelativeSizeSpan) {
                return ai.a("<span style='font-size:%.2f%%;'>", Float.valueOf(((RelativeSizeSpan) obj).getSizeChange() * 100.0f));
            } else if (obj instanceof TypefaceSpan) {
                String family = ((TypefaceSpan) obj).getFamily();
                if (family == null) {
                    return null;
                }
                return ai.a("<span style='font-family:\"%s\";'>", family);
            } else if (obj instanceof StyleSpan) {
                int style = ((StyleSpan) obj).getStyle();
                if (style == 1) {
                    return "<b>";
                }
                if (style == 2) {
                    return "<i>";
                }
                if (style != 3) {
                    return null;
                }
                return "<b><i>";
            } else if (obj instanceof com.applovin.exoplayer2.i.d.c) {
                int i = ((com.applovin.exoplayer2.i.d.c) obj).f13048b;
                if (i == -1) {
                    return "<ruby style='ruby-position:unset;'>";
                }
                if (i == 1) {
                    return "<ruby style='ruby-position:over;'>";
                }
                if (i != 2) {
                    return null;
                }
                return "<ruby style='ruby-position:under;'>";
            } else if (obj instanceof UnderlineSpan) {
                return "<u>";
            } else {
                if (!(obj instanceof e)) {
                    return null;
                }
                e eVar = (e) obj;
                return ai.a("<span style='-webkit-text-emphasis-style:%1$s;text-emphasis-style:%1$s;-webkit-text-emphasis-position:%2$s;text-emphasis-position:%2$s;display:inline-block;'>", a(eVar.f13049a, eVar.f13050b), a(eVar.f13051c));
            }
        }
    }
}
