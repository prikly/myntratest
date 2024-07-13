package com.applovin.exoplayer2.i.f;

import android.text.Html;
import android.text.Spanned;
import android.text.TextUtils;
import com.applovin.exoplayer2.i.d;
import com.applovin.exoplayer2.i.f;
import com.applovin.exoplayer2.l.q;
import com.applovin.exoplayer2.l.r;
import com.applovin.exoplayer2.l.y;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class a extends d {

    /* renamed from: a  reason: collision with root package name */
    private static final Pattern f13088a = Pattern.compile("\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*-->\\s*((?:(\\d+):)?(\\d+):(\\d+)(?:,(\\d+))?)\\s*");

    /* renamed from: b  reason: collision with root package name */
    private static final Pattern f13089b = Pattern.compile("\\{\\\\.*?\\}");

    /* renamed from: c  reason: collision with root package name */
    private final StringBuilder f13090c = new StringBuilder();

    /* renamed from: d  reason: collision with root package name */
    private final ArrayList<String> f13091d = new ArrayList<>();

    public a() {
        super("SubripDecoder");
    }

    private static long a(Matcher matcher, int i) {
        String group = matcher.group(i + 1);
        long parseLong = (group != null ? Long.parseLong(group) * 60 * 60 * 1000 : 0) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i + 2))) * 60 * 1000) + (Long.parseLong((String) com.applovin.exoplayer2.l.a.b(matcher.group(i + 3))) * 1000);
        String group2 = matcher.group(i + 4);
        if (group2 != null) {
            parseLong += Long.parseLong(group2);
        }
        return parseLong * 1000;
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.exoplayer2.i.a a(android.text.Spanned r17, java.lang.String r18) {
        /*
            r16 = this;
            r0 = r18
            com.applovin.exoplayer2.i.a$a r1 = new com.applovin.exoplayer2.i.a$a
            r1.<init>()
            r2 = r17
            com.applovin.exoplayer2.i.a$a r1 = r1.a((java.lang.CharSequence) r2)
            if (r0 != 0) goto L_0x0014
            com.applovin.exoplayer2.i.a r0 = r1.e()
            return r0
        L_0x0014:
            int r2 = r18.hashCode()
            java.lang.String r6 = "{\\an9}"
            java.lang.String r7 = "{\\an8}"
            java.lang.String r8 = "{\\an7}"
            java.lang.String r9 = "{\\an6}"
            java.lang.String r10 = "{\\an5}"
            java.lang.String r11 = "{\\an4}"
            java.lang.String r12 = "{\\an3}"
            java.lang.String r13 = "{\\an2}"
            java.lang.String r14 = "{\\an1}"
            r4 = 4
            r5 = 3
            r15 = 2
            r3 = 1
            switch(r2) {
                case -685620710: goto L_0x0073;
                case -685620679: goto L_0x006b;
                case -685620648: goto L_0x0063;
                case -685620617: goto L_0x005b;
                case -685620586: goto L_0x0053;
                case -685620555: goto L_0x004b;
                case -685620524: goto L_0x0043;
                case -685620493: goto L_0x003a;
                case -685620462: goto L_0x0032;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x007b
        L_0x0032:
            boolean r2 = r0.equals(r6)
            if (r2 == 0) goto L_0x007b
            r2 = 5
            goto L_0x007c
        L_0x003a:
            boolean r2 = r0.equals(r7)
            if (r2 == 0) goto L_0x007b
            r2 = 8
            goto L_0x007c
        L_0x0043:
            boolean r2 = r0.equals(r8)
            if (r2 == 0) goto L_0x007b
            r2 = 2
            goto L_0x007c
        L_0x004b:
            boolean r2 = r0.equals(r9)
            if (r2 == 0) goto L_0x007b
            r2 = 4
            goto L_0x007c
        L_0x0053:
            boolean r2 = r0.equals(r10)
            if (r2 == 0) goto L_0x007b
            r2 = 7
            goto L_0x007c
        L_0x005b:
            boolean r2 = r0.equals(r11)
            if (r2 == 0) goto L_0x007b
            r2 = 1
            goto L_0x007c
        L_0x0063:
            boolean r2 = r0.equals(r12)
            if (r2 == 0) goto L_0x007b
            r2 = 3
            goto L_0x007c
        L_0x006b:
            boolean r2 = r0.equals(r13)
            if (r2 == 0) goto L_0x007b
            r2 = 6
            goto L_0x007c
        L_0x0073:
            boolean r2 = r0.equals(r14)
            if (r2 == 0) goto L_0x007b
            r2 = 0
            goto L_0x007c
        L_0x007b:
            r2 = -1
        L_0x007c:
            if (r2 == 0) goto L_0x0091
            if (r2 == r3) goto L_0x0091
            if (r2 == r15) goto L_0x0091
            if (r2 == r5) goto L_0x008d
            if (r2 == r4) goto L_0x008d
            r4 = 5
            if (r2 == r4) goto L_0x008d
            r1.b((int) r3)
            goto L_0x0095
        L_0x008d:
            r1.b((int) r15)
            goto L_0x0095
        L_0x0091:
            r2 = 0
            r1.b((int) r2)
        L_0x0095:
            int r2 = r18.hashCode()
            switch(r2) {
                case -685620710: goto L_0x00de;
                case -685620679: goto L_0x00d6;
                case -685620648: goto L_0x00ce;
                case -685620617: goto L_0x00c6;
                case -685620586: goto L_0x00be;
                case -685620555: goto L_0x00b5;
                case -685620524: goto L_0x00ad;
                case -685620493: goto L_0x00a5;
                case -685620462: goto L_0x009d;
                default: goto L_0x009c;
            }
        L_0x009c:
            goto L_0x00e6
        L_0x009d:
            boolean r0 = r0.equals(r6)
            if (r0 == 0) goto L_0x00e6
            r0 = 5
            goto L_0x00e7
        L_0x00a5:
            boolean r0 = r0.equals(r7)
            if (r0 == 0) goto L_0x00e6
            r0 = 4
            goto L_0x00e7
        L_0x00ad:
            boolean r0 = r0.equals(r8)
            if (r0 == 0) goto L_0x00e6
            r0 = 3
            goto L_0x00e7
        L_0x00b5:
            boolean r0 = r0.equals(r9)
            if (r0 == 0) goto L_0x00e6
            r0 = 8
            goto L_0x00e7
        L_0x00be:
            boolean r0 = r0.equals(r10)
            if (r0 == 0) goto L_0x00e6
            r0 = 7
            goto L_0x00e7
        L_0x00c6:
            boolean r0 = r0.equals(r11)
            if (r0 == 0) goto L_0x00e6
            r0 = 6
            goto L_0x00e7
        L_0x00ce:
            boolean r0 = r0.equals(r12)
            if (r0 == 0) goto L_0x00e6
            r0 = 2
            goto L_0x00e7
        L_0x00d6:
            boolean r0 = r0.equals(r13)
            if (r0 == 0) goto L_0x00e6
            r0 = 1
            goto L_0x00e7
        L_0x00de:
            boolean r0 = r0.equals(r14)
            if (r0 == 0) goto L_0x00e6
            r0 = 0
            goto L_0x00e7
        L_0x00e6:
            r0 = -1
        L_0x00e7:
            if (r0 == 0) goto L_0x00fe
            if (r0 == r3) goto L_0x00fe
            if (r0 == r15) goto L_0x00fe
            if (r0 == r5) goto L_0x00f9
            r2 = 4
            if (r0 == r2) goto L_0x00f9
            r2 = 5
            if (r0 == r2) goto L_0x00f9
            r1.a((int) r3)
            goto L_0x0101
        L_0x00f9:
            r0 = 0
            r1.a((int) r0)
            goto L_0x0101
        L_0x00fe:
            r1.a((int) r15)
        L_0x0101:
            int r0 = r1.c()
            float r0 = b(r0)
            com.applovin.exoplayer2.i.a$a r0 = r1.a((float) r0)
            int r1 = r1.b()
            float r1 = b(r1)
            r2 = 0
            com.applovin.exoplayer2.i.a$a r0 = r0.a(r1, r2)
            com.applovin.exoplayer2.i.a r0 = r0.e()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.exoplayer2.i.f.a.a(android.text.Spanned, java.lang.String):com.applovin.exoplayer2.i.a");
    }

    private String a(String str, ArrayList<String> arrayList) {
        String trim = str.trim();
        StringBuilder sb = new StringBuilder(trim);
        Matcher matcher = f13089b.matcher(trim);
        int i = 0;
        while (matcher.find()) {
            String group = matcher.group();
            arrayList.add(group);
            int start = matcher.start() - i;
            int length = group.length();
            sb.replace(start, start + length, "");
            i += length;
        }
        return sb.toString();
    }

    static float b(int i) {
        if (i == 0) {
            return 0.08f;
        }
        if (i == 1) {
            return 0.5f;
        }
        if (i == 2) {
            return 0.92f;
        }
        throw new IllegalArgumentException();
    }

    /* access modifiers changed from: protected */
    public f a(byte[] bArr, int i, boolean z) {
        StringBuilder sb;
        String str;
        ArrayList arrayList = new ArrayList();
        r rVar = new r();
        y yVar = new y(bArr, i);
        while (true) {
            String C = yVar.C();
            int i2 = 0;
            if (C == null) {
                break;
            } else if (C.length() != 0) {
                try {
                    Integer.parseInt(C);
                    C = yVar.C();
                    if (C == null) {
                        q.c("SubripDecoder", "Unexpected end");
                        break;
                    }
                    Matcher matcher = f13088a.matcher(C);
                    if (matcher.matches()) {
                        rVar.a(a(matcher, 1));
                        rVar.a(a(matcher, 6));
                        this.f13090c.setLength(0);
                        this.f13091d.clear();
                        while (true) {
                            String C2 = yVar.C();
                            if (TextUtils.isEmpty(C2)) {
                                break;
                            }
                            if (this.f13090c.length() > 0) {
                                this.f13090c.append("<br>");
                            }
                            this.f13090c.append(a(C2, this.f13091d));
                        }
                        Spanned fromHtml = Html.fromHtml(this.f13090c.toString());
                        String str2 = null;
                        while (true) {
                            if (i2 >= this.f13091d.size()) {
                                break;
                            }
                            String str3 = this.f13091d.get(i2);
                            if (str3.matches("\\{\\\\an[1-9]\\}")) {
                                str2 = str3;
                                break;
                            }
                            i2++;
                        }
                        arrayList.add(a(fromHtml, str2));
                        arrayList.add(com.applovin.exoplayer2.i.a.f12907a);
                    } else {
                        sb = new StringBuilder();
                        str = "Skipping invalid timing: ";
                        sb.append(str);
                        sb.append(C);
                        q.c("SubripDecoder", sb.toString());
                    }
                } catch (NumberFormatException unused) {
                    sb = new StringBuilder();
                    str = "Skipping invalid index: ";
                }
            }
        }
        return new b((com.applovin.exoplayer2.i.a[]) arrayList.toArray(new com.applovin.exoplayer2.i.a[0]), rVar.b());
    }
}
