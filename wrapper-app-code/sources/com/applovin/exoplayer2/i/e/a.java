package com.applovin.exoplayer2.i.e;

import android.text.Layout;
import androidx.recyclerview.widget.RecyclerView;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.e.c;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.ai;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13053a = Pattern.compile("(?:(\\d+):)?(\\d+):(\\d+)[:.](\\d+)");

    /* renamed from: b  reason: collision with root package name */
    private final boolean f13054b;

    /* renamed from: c  reason: collision with root package name */
    private final b f13055c;

    /* renamed from: d  reason: collision with root package name */
    private Map<String, c> f13056d;

    /* renamed from: e  reason: collision with root package name */
    private float f13057e;

    /* renamed from: f  reason: collision with root package name */
    private float f13058f;

    public a() {
        this((List<byte[]>) null);
    }

    public a(List<byte[]> list) {
        super("SsaDecoder");
        this.f13057e = -3.4028235E38f;
        this.f13058f = -3.4028235E38f;
        if (list == null || list.isEmpty()) {
            this.f13054b = false;
            this.f13055c = null;
            return;
        }
        this.f13054b = true;
        String a2 = ai.a(list.get(0));
        com.applovin.exoplayer2.l.a.a(a2.startsWith("Format:"));
        this.f13055c = (b) com.applovin.exoplayer2.l.a.b(b.a(a2));
        a(new y(list.get(1)));
    }

    private static int a(long j, List<Long> list, List<List<com.applovin.exoplayer2.i.a>> list2) {
        int i;
        ArrayList arrayList;
        int size = list.size() - 1;
        while (true) {
            if (size < 0) {
                i = 0;
                break;
            } else if (list.get(size).longValue() == j) {
                return size;
            } else {
                if (list.get(size).longValue() < j) {
                    i = size + 1;
                    break;
                }
                size--;
            }
        }
        list.add(i, Long.valueOf(j));
        if (i != 0) {
            arrayList = new ArrayList(list2.get(i - 1));
        }
        list2.add(i, arrayList);
        return i;
    }

    private static long a(String str) {
        Matcher matcher = f13053a.matcher(str.trim());
        if (!matcher.matches()) {
            return -9223372036854775807L;
        }
        return (Long.parseLong((String) ai.a(matcher.group(1))) * 60 * 60 * 1000000) + (Long.parseLong((String) ai.a(matcher.group(2))) * 60 * 1000000) + (Long.parseLong((String) ai.a(matcher.group(3))) * 1000000) + (Long.parseLong((String) ai.a(matcher.group(4))) * 10000);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x006c  */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x007c  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static com.applovin.exoplayer2.i.a a(java.lang.String r6, com.applovin.exoplayer2.i.e.c r7, com.applovin.exoplayer2.i.e.c.b r8, float r9, float r10) {
        /*
            android.text.SpannableString r0 = new android.text.SpannableString
            r0.<init>(r6)
            com.applovin.exoplayer2.i.a$a r6 = new com.applovin.exoplayer2.i.a$a
            r6.<init>()
            com.applovin.exoplayer2.i.a$a r6 = r6.a((java.lang.CharSequence) r0)
            r1 = -8388609(0xffffffffff7fffff, float:-3.4028235E38)
            r2 = 0
            if (r7 == 0) goto L_0x0088
            java.lang.Integer r3 = r7.f13066c
            r4 = 33
            if (r3 == 0) goto L_0x002c
            android.text.style.ForegroundColorSpan r3 = new android.text.style.ForegroundColorSpan
            java.lang.Integer r5 = r7.f13066c
            int r5 = r5.intValue()
            r3.<init>(r5)
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x002c:
            float r3 = r7.f13067d
            r5 = 1
            int r3 = (r3 > r1 ? 1 : (r3 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003d
            int r3 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r3 == 0) goto L_0x003d
            float r3 = r7.f13067d
            float r3 = r3 / r10
            r6.b(r3, r5)
        L_0x003d:
            boolean r3 = r7.f13068e
            if (r3 == 0) goto L_0x004c
            boolean r3 = r7.f13069f
            if (r3 == 0) goto L_0x004c
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r5 = 3
            r3.<init>(r5)
            goto L_0x0055
        L_0x004c:
            boolean r3 = r7.f13068e
            if (r3 == 0) goto L_0x005d
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r3.<init>(r5)
        L_0x0055:
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
            goto L_0x0068
        L_0x005d:
            boolean r3 = r7.f13069f
            if (r3 == 0) goto L_0x0068
            android.text.style.StyleSpan r3 = new android.text.style.StyleSpan
            r5 = 2
            r3.<init>(r5)
            goto L_0x0055
        L_0x0068:
            boolean r3 = r7.f13070g
            if (r3 == 0) goto L_0x0078
            android.text.style.UnderlineSpan r3 = new android.text.style.UnderlineSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x0078:
            boolean r3 = r7.f13071h
            if (r3 == 0) goto L_0x0088
            android.text.style.StrikethroughSpan r3 = new android.text.style.StrikethroughSpan
            r3.<init>()
            int r5 = r0.length()
            r0.setSpan(r3, r2, r5, r4)
        L_0x0088:
            int r0 = r8.f13084a
            r3 = -1
            if (r0 == r3) goto L_0x0090
            int r3 = r8.f13084a
            goto L_0x0094
        L_0x0090:
            if (r7 == 0) goto L_0x0094
            int r3 = r7.f13065b
        L_0x0094:
            android.text.Layout$Alignment r7 = b((int) r3)
            com.applovin.exoplayer2.i.a$a r7 = r6.a((android.text.Layout.Alignment) r7)
            int r0 = d(r3)
            com.applovin.exoplayer2.i.a$a r7 = r7.b((int) r0)
            int r0 = c((int) r3)
            r7.a((int) r0)
            android.graphics.PointF r7 = r8.f13085b
            if (r7 == 0) goto L_0x00c5
            int r7 = (r10 > r1 ? 1 : (r10 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00c5
            int r7 = (r9 > r1 ? 1 : (r9 == r1 ? 0 : -1))
            if (r7 == 0) goto L_0x00c5
            android.graphics.PointF r7 = r8.f13085b
            float r7 = r7.x
            float r7 = r7 / r9
            r6.a((float) r7)
            android.graphics.PointF r7 = r8.f13085b
            float r7 = r7.y
            float r7 = r7 / r10
            goto L_0x00d8
        L_0x00c5:
            int r7 = r6.c()
            float r7 = e(r7)
            r6.a((float) r7)
            int r7 = r6.b()
            float r7 = e(r7)
        L_0x00d8:
            r6.a(r7, r2)
            com.applovin.exoplayer2.i.a r6 = r6.e()
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.a.a(java.lang.String, com.applovin.exoplayer2.i.e.c, com.applovin.exoplayer2.i.e.c$b, float, float):com.applovin.exoplayer2.i.a");
    }

    private void a(y yVar) {
        while (true) {
            String C = yVar.C();
            if (C == null) {
                return;
            }
            if ("[Script Info]".equalsIgnoreCase(C)) {
                b(yVar);
            } else if ("[V4+ Styles]".equalsIgnoreCase(C)) {
                this.f13056d = c(yVar);
            } else if ("[V4 Styles]".equalsIgnoreCase(C)) {
                q.b("SsaDecoder", "[V4 Styles] are not supported");
            } else if ("[Events]".equalsIgnoreCase(C)) {
                return;
            }
        }
    }

    private void a(y yVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        b bVar = this.f13054b ? this.f13055c : null;
        while (true) {
            String C = yVar.C();
            if (C == null) {
                return;
            }
            if (C.startsWith("Format:")) {
                bVar = b.a(C);
            } else if (C.startsWith("Dialogue:")) {
                if (bVar == null) {
                    q.c("SsaDecoder", "Skipping dialogue line before complete format: " + C);
                } else {
                    a(C, bVar, list, list2);
                }
            }
        }
    }

    private void a(String str, b bVar, List<List<com.applovin.exoplayer2.i.a>> list, List<Long> list2) {
        StringBuilder sb;
        com.applovin.exoplayer2.l.a.a(str.startsWith("Dialogue:"));
        String[] split = str.substring(9).split(",", bVar.f13063e);
        if (split.length != bVar.f13063e) {
            sb = new StringBuilder();
            sb.append("Skipping dialogue line with fewer columns than format: ");
        } else {
            long a2 = a(split[bVar.f13059a]);
            if (a2 == -9223372036854775807L) {
                sb = new StringBuilder();
            } else {
                long a3 = a(split[bVar.f13060b]);
                if (a3 == -9223372036854775807L) {
                    sb = new StringBuilder();
                } else {
                    c cVar = (this.f13056d == null || bVar.f13061c == -1) ? null : this.f13056d.get(split[bVar.f13061c].trim());
                    String str2 = split[bVar.f13062d];
                    com.applovin.exoplayer2.i.a a4 = a(c.b.b(str2).replace("\\N", "\n").replace("\\n", "\n").replace("\\h", " "), cVar, c.b.a(str2), this.f13057e, this.f13058f);
                    int a5 = a(a3, list2, list);
                    for (int a6 = a(a2, list2, list); a6 < a5; a6++) {
                        list.get(a6).add(a4);
                    }
                    return;
                }
            }
            sb.append("Skipping invalid timing: ");
        }
        sb.append(str);
        q.c("SsaDecoder", sb.toString());
    }

    private static Layout.Alignment b(int i) {
        switch (i) {
            case -1:
                return null;
            case 1:
            case 4:
            case 7:
                return Layout.Alignment.ALIGN_NORMAL;
            case 2:
            case 5:
            case 8:
                return Layout.Alignment.ALIGN_CENTER;
            case 3:
            case 6:
            case 9:
                return Layout.Alignment.ALIGN_OPPOSITE;
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                return null;
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0044, code lost:
        if (r2.equals("playresx") != false) goto L_0x0048;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void b(com.applovin.exoplayer2.l.y r7) {
        /*
            r6 = this;
        L_0x0000:
            java.lang.String r0 = r7.C()
            if (r0 == 0) goto L_0x0069
            int r1 = r7.a()
            if (r1 == 0) goto L_0x0014
            int r1 = r7.f()
            r2 = 91
            if (r1 == r2) goto L_0x0069
        L_0x0014:
            java.lang.String r1 = ":"
            java.lang.String[] r0 = r0.split(r1)
            int r1 = r0.length
            r2 = 2
            if (r1 == r2) goto L_0x001f
            goto L_0x0000
        L_0x001f:
            r1 = 0
            r2 = r0[r1]
            java.lang.String r2 = r2.trim()
            java.lang.String r2 = com.applovin.exoplayer2.common.base.Ascii.toLowerCase((java.lang.String) r2)
            r3 = -1
            int r4 = r2.hashCode()
            r5 = 1
            switch(r4) {
                case 1879649548: goto L_0x003e;
                case 1879649549: goto L_0x0034;
                default: goto L_0x0033;
            }
        L_0x0033:
            goto L_0x0047
        L_0x0034:
            java.lang.String r1 = "playresy"
            boolean r1 = r2.equals(r1)
            if (r1 == 0) goto L_0x0047
            r1 = 1
            goto L_0x0048
        L_0x003e:
            java.lang.String r4 = "playresx"
            boolean r2 = r2.equals(r4)
            if (r2 == 0) goto L_0x0047
            goto L_0x0048
        L_0x0047:
            r1 = -1
        L_0x0048:
            if (r1 == 0) goto L_0x005c
            if (r1 == r5) goto L_0x004d
            goto L_0x0000
        L_0x004d:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.f13058f = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x005a:
            goto L_0x0000
        L_0x005c:
            r0 = r0[r5]     // Catch:{ NumberFormatException -> 0x005a }
            java.lang.String r0 = r0.trim()     // Catch:{ NumberFormatException -> 0x005a }
            float r0 = java.lang.Float.parseFloat(r0)     // Catch:{ NumberFormatException -> 0x005a }
            r6.f13057e = r0     // Catch:{ NumberFormatException -> 0x005a }
            goto L_0x0000
        L_0x0069:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.e.a.b(com.applovin.exoplayer2.l.y):void");
    }

    private static int c(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 2:
            case 3:
                return 2;
            case 4:
            case 5:
            case 6:
                return 1;
            case 7:
            case 8:
            case 9:
                return 0;
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static Map<String, c> c(y yVar) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        c.a aVar = null;
        while (true) {
            String C = yVar.C();
            if (C == null || (yVar.a() != 0 && yVar.f() == 91)) {
                return linkedHashMap;
            }
            if (C.startsWith("Format:")) {
                aVar = c.a.a(C);
            } else if (C.startsWith("Style:")) {
                if (aVar == null) {
                    q.c("SsaDecoder", "Skipping 'Style:' line before 'Format:' line: " + C);
                } else {
                    c a2 = c.a(C, aVar);
                    if (a2 != null) {
                        linkedHashMap.put(a2.f13064a, a2);
                    }
                }
            }
        }
        return linkedHashMap;
    }

    private static int d(int i) {
        switch (i) {
            case -1:
                return RecyclerView.UNDEFINED_DURATION;
            case 1:
            case 4:
            case 7:
                return 0;
            case 2:
            case 5:
            case 8:
                return 1;
            case 3:
            case 6:
            case 9:
                return 2;
            default:
                q.c("SsaDecoder", "Unknown alignment: " + i);
                return RecyclerView.UNDEFINED_DURATION;
        }
    }

    private static float e(int i) {
        if (i == 0) {
            return 0.05f;
        }
        if (i != 1) {
            return i != 2 ? -3.4028235E38f : 0.95f;
        }
        return 0.5f;
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        y yVar = new y(bArr, i);
        if (!this.f13054b) {
            a(yVar);
        }
        a(yVar, (List<List<com.applovin.exoplayer2.i.a>>) arrayList, (List<Long>) arrayList2);
        return new d(arrayList, arrayList2);
    }
}
