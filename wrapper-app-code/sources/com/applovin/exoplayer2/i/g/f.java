package com.applovin.exoplayer2.i.g;

import android.text.SpannableStringBuilder;
import java.util.ArrayDeque;
import java.util.Map;

final class f {
    private static d a(d dVar, Map<String, g> map) {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.push(dVar);
        while (!arrayDeque.isEmpty()) {
            d dVar2 = (d) arrayDeque.pop();
            g a2 = a(dVar2.f13122f, dVar2.c(), map);
            if (a2 != null && a2.k() == 3) {
                return dVar2;
            }
            for (int a3 = dVar2.a() - 1; a3 >= 0; a3--) {
                arrayDeque.push(dVar2.a(a3));
            }
        }
        return null;
    }

    public static g a(g gVar, String[] strArr, Map<String, g> map) {
        int i = 0;
        if (gVar == null) {
            if (strArr == null) {
                return null;
            }
            if (strArr.length == 1) {
                return map.get(strArr[0]);
            }
            if (strArr.length > 1) {
                g gVar2 = new g();
                int length = strArr.length;
                while (i < length) {
                    gVar2.a(map.get(strArr[i]));
                    i++;
                }
                return gVar2;
            }
        } else if (strArr != null && strArr.length == 1) {
            return gVar.a(map.get(strArr[0]));
        } else {
            if (strArr != null && strArr.length > 1) {
                int length2 = strArr.length;
                while (i < length2) {
                    gVar.a(map.get(strArr[i]));
                    i++;
                }
            }
        }
        return gVar;
    }

    static String a(String str) {
        return str.replaceAll("\r\n", "\n").replaceAll(" *\n *", "\n").replaceAll("\n", " ").replaceAll("[ \t\\x0B\f\r]+", " ");
    }

    /* JADX WARNING: Removed duplicated region for block: B:60:0x0112  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static void a(android.text.Spannable r9, int r10, int r11, com.applovin.exoplayer2.i.g.g r12, com.applovin.exoplayer2.i.g.d r13, java.util.Map<java.lang.String, com.applovin.exoplayer2.i.g.g> r14, int r15) {
        /*
            int r0 = r12.a()
            r1 = -1
            r2 = 33
            if (r0 == r1) goto L_0x0015
            android.text.style.StyleSpan r0 = new android.text.style.StyleSpan
            int r3 = r12.a()
            r0.<init>(r3)
            r9.setSpan(r0, r10, r11, r2)
        L_0x0015:
            boolean r0 = r12.b()
            if (r0 == 0) goto L_0x0023
            android.text.style.StrikethroughSpan r0 = new android.text.style.StrikethroughSpan
            r0.<init>()
            r9.setSpan(r0, r10, r11, r2)
        L_0x0023:
            boolean r0 = r12.c()
            if (r0 == 0) goto L_0x0031
            android.text.style.UnderlineSpan r0 = new android.text.style.UnderlineSpan
            r0.<init>()
            r9.setSpan(r0, r10, r11, r2)
        L_0x0031:
            boolean r0 = r12.f()
            if (r0 == 0) goto L_0x0043
            android.text.style.ForegroundColorSpan r0 = new android.text.style.ForegroundColorSpan
            int r3 = r12.e()
            r0.<init>(r3)
            com.applovin.exoplayer2.i.d.d.a(r9, r0, r10, r11, r2)
        L_0x0043:
            boolean r0 = r12.h()
            if (r0 == 0) goto L_0x0055
            android.text.style.BackgroundColorSpan r0 = new android.text.style.BackgroundColorSpan
            int r3 = r12.g()
            r0.<init>(r3)
            com.applovin.exoplayer2.i.d.d.a(r9, r0, r10, r11, r2)
        L_0x0055:
            java.lang.String r0 = r12.d()
            if (r0 == 0) goto L_0x0067
            android.text.style.TypefaceSpan r0 = new android.text.style.TypefaceSpan
            java.lang.String r3 = r12.d()
            r0.<init>(r3)
            com.applovin.exoplayer2.i.d.d.a(r9, r0, r10, r11, r2)
        L_0x0067:
            com.applovin.exoplayer2.i.g.b r0 = r12.p()
            r3 = 3
            r4 = 2
            r5 = 1
            if (r0 == 0) goto L_0x009d
            com.applovin.exoplayer2.i.g.b r0 = r12.p()
            java.lang.Object r0 = com.applovin.exoplayer2.l.a.b(r0)
            com.applovin.exoplayer2.i.g.b r0 = (com.applovin.exoplayer2.i.g.b) r0
            int r6 = r0.f13099a
            if (r6 != r1) goto L_0x0088
            if (r15 == r4) goto L_0x0085
            if (r15 != r5) goto L_0x0083
            goto L_0x0085
        L_0x0083:
            r15 = 1
            goto L_0x0086
        L_0x0085:
            r15 = 3
        L_0x0086:
            r6 = 1
            goto L_0x008c
        L_0x0088:
            int r15 = r0.f13099a
            int r6 = r0.f13100b
        L_0x008c:
            int r7 = r0.f13101c
            r8 = -2
            if (r7 != r8) goto L_0x0093
            r0 = 1
            goto L_0x0095
        L_0x0093:
            int r0 = r0.f13101c
        L_0x0095:
            com.applovin.exoplayer2.i.d.e r7 = new com.applovin.exoplayer2.i.d.e
            r7.<init>(r15, r6, r0)
            com.applovin.exoplayer2.i.d.d.a(r9, r7, r10, r11, r2)
        L_0x009d:
            int r15 = r12.k()
            if (r15 == r4) goto L_0x00b2
            if (r15 == r3) goto L_0x00a9
            r13 = 4
            if (r15 == r13) goto L_0x00a9
            goto L_0x010c
        L_0x00a9:
            com.applovin.exoplayer2.i.g.a r13 = new com.applovin.exoplayer2.i.g.a
            r13.<init>()
        L_0x00ae:
            r9.setSpan(r13, r10, r11, r2)
            goto L_0x010c
        L_0x00b2:
            com.applovin.exoplayer2.i.g.d r13 = b(r13, r14)
            if (r13 != 0) goto L_0x00b9
            goto L_0x010c
        L_0x00b9:
            com.applovin.exoplayer2.i.g.d r15 = a(r13, r14)
            if (r15 != 0) goto L_0x00c0
            goto L_0x010c
        L_0x00c0:
            int r0 = r15.a()
            if (r0 != r5) goto L_0x0105
            r0 = 0
            com.applovin.exoplayer2.i.g.d r6 = r15.a((int) r0)
            java.lang.String r6 = r6.f13118b
            if (r6 == 0) goto L_0x0105
            com.applovin.exoplayer2.i.g.d r0 = r15.a((int) r0)
            java.lang.String r0 = r0.f13118b
            java.lang.Object r0 = com.applovin.exoplayer2.l.ai.a(r0)
            java.lang.String r0 = (java.lang.String) r0
            com.applovin.exoplayer2.i.g.g r6 = r15.f13122f
            java.lang.String[] r15 = r15.c()
            com.applovin.exoplayer2.i.g.g r15 = a(r6, r15, r14)
            if (r15 == 0) goto L_0x00ec
            int r15 = r15.l()
            goto L_0x00ed
        L_0x00ec:
            r15 = -1
        L_0x00ed:
            if (r15 != r1) goto L_0x00ff
            com.applovin.exoplayer2.i.g.g r1 = r13.f13122f
            java.lang.String[] r13 = r13.c()
            com.applovin.exoplayer2.i.g.g r13 = a(r1, r13, r14)
            if (r13 == 0) goto L_0x00ff
            int r15 = r13.l()
        L_0x00ff:
            com.applovin.exoplayer2.i.d.c r13 = new com.applovin.exoplayer2.i.d.c
            r13.<init>(r0, r15)
            goto L_0x00ae
        L_0x0105:
            java.lang.String r13 = "TtmlRenderUtil"
            java.lang.String r14 = "Skipping rubyText node without exactly one text child."
            com.applovin.exoplayer2.l.q.b(r13, r14)
        L_0x010c:
            boolean r13 = r12.o()
            if (r13 == 0) goto L_0x011a
            com.applovin.exoplayer2.i.d.a r13 = new com.applovin.exoplayer2.i.d.a
            r13.<init>()
            com.applovin.exoplayer2.i.d.d.a(r9, r13, r10, r11, r2)
        L_0x011a:
            int r13 = r12.q()
            if (r13 == r5) goto L_0x013c
            if (r13 == r4) goto L_0x0132
            if (r13 == r3) goto L_0x0125
            goto L_0x0149
        L_0x0125:
            android.text.style.RelativeSizeSpan r13 = new android.text.style.RelativeSizeSpan
            float r12 = r12.r()
            r14 = 1120403456(0x42c80000, float:100.0)
            float r12 = r12 / r14
            r13.<init>(r12)
            goto L_0x0146
        L_0x0132:
            android.text.style.RelativeSizeSpan r13 = new android.text.style.RelativeSizeSpan
            float r12 = r12.r()
            r13.<init>(r12)
            goto L_0x0146
        L_0x013c:
            android.text.style.AbsoluteSizeSpan r13 = new android.text.style.AbsoluteSizeSpan
            float r12 = r12.r()
            int r12 = (int) r12
            r13.<init>(r12, r5)
        L_0x0146:
            com.applovin.exoplayer2.i.d.d.a(r9, r13, r10, r11, r2)
        L_0x0149:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.g.f.a(android.text.Spannable, int, int, com.applovin.exoplayer2.i.g.g, com.applovin.exoplayer2.i.g.d, java.util.Map, int):void");
    }

    static void a(SpannableStringBuilder spannableStringBuilder) {
        int length = spannableStringBuilder.length() - 1;
        while (length >= 0 && spannableStringBuilder.charAt(length) == ' ') {
            length--;
        }
        if (length >= 0 && spannableStringBuilder.charAt(length) != 10) {
            spannableStringBuilder.append(10);
        }
    }

    private static d b(d dVar, Map<String, g> map) {
        while (dVar != null) {
            g a2 = a(dVar.f13122f, dVar.c(), map);
            if (a2 != null && a2.k() == 1) {
                return dVar;
            }
            dVar = dVar.i;
        }
        return null;
    }
}
