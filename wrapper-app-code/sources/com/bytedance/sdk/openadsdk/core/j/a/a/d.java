package com.bytedance.sdk.openadsdk.core.j.a.a;

import android.content.Context;
import android.text.TextUtils;
import androidx.recyclerview.widget.RecyclerView;
import com.appodeal.ads.modules.common.internal.LogConstants;
import com.bytedance.sdk.openadsdk.core.j.a.b;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.xmlpull.v1.XmlPullParser;
import org.xmlpull.v1.XmlPullParserException;

/* compiled from: VastXmlPullParser */
public class d extends b {

    /* renamed from: f  reason: collision with root package name */
    public static final String f1281f = null;

    public d(Context context, int i, int i2) {
        super(context, i, i2);
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0040 A[SYNTHETIC, Splitter:B:24:0x0040] */
    /* JADX WARNING: Removed duplicated region for block: B:31:0x0048 A[SYNTHETIC, Splitter:B:31:0x0048] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public com.bytedance.sdk.openadsdk.core.j.a b(java.lang.String r6, java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c> r7) {
        /*
            r5 = this;
            java.lang.String r0 = "UTF-8"
            r1 = 0
            f1289e = r1
            android.content.Context r2 = r5.f1291b
            r3 = 0
            if (r2 != 0) goto L_0x000e
            r6 = -1
            f1289e = r6
            return r3
        L_0x000e:
            boolean r2 = android.text.TextUtils.isEmpty(r6)
            if (r2 == 0) goto L_0x0018
            r6 = -2
            f1289e = r6
            return r3
        L_0x0018:
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            byte[] r6 = r6.getBytes(r0)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            r2.<init>(r6)     // Catch:{ Exception -> 0x003a, all -> 0x0038 }
            org.xmlpull.v1.XmlPullParser r6 = android.util.Xml.newPullParser()     // Catch:{ Exception -> 0x003b }
            java.lang.String r4 = "http://xmlpull.org/v1/doc/features.html#process-namespaces"
            r6.setFeature(r4, r1)     // Catch:{ Exception -> 0x003b }
            r6.setInput(r2, r0)     // Catch:{ Exception -> 0x003b }
            r6.nextTag()     // Catch:{ Exception -> 0x003b }
            com.bytedance.sdk.openadsdk.core.j.a r6 = r5.a((org.xmlpull.v1.XmlPullParser) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c>) r7)     // Catch:{ Exception -> 0x003b }
            r2.close()     // Catch:{ IOException -> 0x0037 }
        L_0x0037:
            return r6
        L_0x0038:
            r6 = move-exception
            goto L_0x0046
        L_0x003a:
            r2 = r3
        L_0x003b:
            r6 = -3
            f1289e = r6     // Catch:{ all -> 0x0044 }
            if (r2 == 0) goto L_0x0043
            r2.close()     // Catch:{ IOException -> 0x0043 }
        L_0x0043:
            return r3
        L_0x0044:
            r6 = move-exception
            r3 = r2
        L_0x0046:
            if (r3 == 0) goto L_0x004b
            r3.close()     // Catch:{ IOException -> 0x004b }
        L_0x004b:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.a.a.d.b(java.lang.String, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    private com.bytedance.sdk.openadsdk.core.j.a a(XmlPullParser xmlPullParser, List<c> list) throws IOException, XmlPullParserException {
        xmlPullParser.require(2, f1281f, "VAST");
        boolean z = false;
        String str = null;
        while (xmlPullParser.next() != 1) {
            if (xmlPullParser.getEventType() == 2) {
                String name = xmlPullParser.getName();
                if (LogConstants.EVENT_ERROR.equals(name)) {
                    str = b(xmlPullParser, name);
                } else if ("Ad".equals(name)) {
                    if (a(xmlPullParser.getAttributeValue(f1281f, "sequence"))) {
                        while (true) {
                            if (xmlPullParser.next() == 3 && "Ad".equals(xmlPullParser.getName())) {
                                break;
                            } else if (xmlPullParser.getEventType() == 2) {
                                String name2 = xmlPullParser.getName();
                                if ("InLine".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.j.a a2 = b.a(this.f1291b, xmlPullParser, list, this.f1292c, this.f1293d);
                                    if (a2 != null) {
                                        if (!TextUtils.isEmpty(a2.g())) {
                                            return a2;
                                        }
                                        f1289e = -6;
                                        return null;
                                    }
                                } else if ("Wrapper".equals(name2)) {
                                    com.bytedance.sdk.openadsdk.core.j.a b2 = b(xmlPullParser, list);
                                    if (b2 != null) {
                                        return b2;
                                    }
                                } else {
                                    a(xmlPullParser);
                                }
                            }
                        }
                    } else {
                        a(xmlPullParser);
                    }
                    z = true;
                } else {
                    a(xmlPullParser);
                }
            }
        }
        if (!z) {
            f1289e = -4;
            c(str);
        }
        if (f1289e == 0) {
            f1289e = -5;
        }
        return null;
    }

    private void c(String str) {
        if (!TextUtils.isEmpty(str)) {
            c.a(c.a(Collections.singletonList(new c.a(str).a()), this.f1290a > 0 ? com.bytedance.sdk.openadsdk.core.j.a.a.NO_ADS_VAST_RESPONSE : com.bytedance.sdk.openadsdk.core.j.a.a.UNDEFINED_ERROR, -1, (String) null));
        }
    }

    /* compiled from: VastXmlPullParser */
    static class a {

        /* renamed from: a  reason: collision with root package name */
        String f1282a;

        /* renamed from: b  reason: collision with root package name */
        a.C0007a f1283b;

        /* renamed from: c  reason: collision with root package name */
        a.b f1284c;

        /* renamed from: d  reason: collision with root package name */
        String f1285d;

        /* renamed from: e  reason: collision with root package name */
        final List<c> f1286e = new ArrayList();

        /* renamed from: f  reason: collision with root package name */
        final List<c> f1287f = new ArrayList();

        /* renamed from: g  reason: collision with root package name */
        float f1288g = Float.MIN_VALUE;

        public a() {
        }

        public a(String str, a.C0007a aVar, a.b bVar) {
            a(str, aVar, bVar);
        }

        public void a(String str, a.C0007a aVar, a.b bVar) {
            this.f1282a = str;
            this.f1283b = aVar;
            this.f1284c = bVar;
        }

        public void a(String str) {
            this.f1286e.add(new c.a(str).a());
        }

        public void b(String str) {
            this.f1287f.add(new c.a(str).a());
        }
    }

    public static List<c> a(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        return d(b(xmlPullParser, str));
    }

    public static int b(String str) {
        if (TextUtils.isEmpty(str)) {
            return RecyclerView.UNDEFINED_DURATION;
        }
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException unused) {
            return RecyclerView.UNDEFINED_DURATION;
        }
    }

    public static String b(XmlPullParser xmlPullParser, String str) throws IOException, XmlPullParserException {
        String str2;
        xmlPullParser.require(2, f1281f, str);
        if (xmlPullParser.next() == 4) {
            str2 = xmlPullParser.getText().trim();
            xmlPullParser.nextTag();
        } else {
            str2 = "";
        }
        xmlPullParser.require(3, f1281f, str);
        return str2;
    }

    public static void a(XmlPullParser xmlPullParser) throws XmlPullParserException, IOException {
        if (xmlPullParser.getEventType() == 2) {
            int i = 1;
            while (i != 0) {
                int next = xmlPullParser.next();
                if (next == 2) {
                    i++;
                } else if (next == 3) {
                    i--;
                }
            }
            return;
        }
        throw new IllegalStateException();
    }

    public static void a(XmlPullParser xmlPullParser, String str, int i) throws XmlPullParserException, IOException {
        while (xmlPullParser.getEventType() != 1) {
            if (!str.equals(xmlPullParser.getName()) || xmlPullParser.getEventType() != i) {
                xmlPullParser.next();
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Can't fix incorrect switch cases order */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.bytedance.sdk.openadsdk.core.j.a b(org.xmlpull.v1.XmlPullParser r18, java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c> r19) throws org.xmlpull.v1.XmlPullParserException, java.io.IOException {
        /*
            r17 = this;
            r0 = r17
            r1 = r18
            r2 = r19
            int r3 = r0.f1290a
            r4 = 5
            r5 = 0
            if (r3 < r4) goto L_0x0010
            a(r18)
            return r5
        L_0x0010:
            com.bytedance.sdk.openadsdk.core.j.d r3 = new com.bytedance.sdk.openadsdk.core.j.d
            r3.<init>(r5)
            r6 = r5
            r7 = r6
        L_0x0017:
            int r8 = r18.getEventType()
            java.lang.String r9 = "Wrapper"
            r10 = 3
            if (r8 != r10) goto L_0x0042
            java.lang.String r8 = r18.getName()
            boolean r8 = r9.equals(r8)
            if (r8 != 0) goto L_0x002b
            goto L_0x0042
        L_0x002b:
            com.bytedance.sdk.openadsdk.core.j.a r1 = r0.b((java.lang.String) r6, (java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c>) r2)
            if (r1 == 0) goto L_0x0041
            com.bytedance.sdk.openadsdk.core.j.c r2 = r1.c()
            if (r2 != 0) goto L_0x003a
            r1.a((com.bytedance.sdk.openadsdk.core.j.c) r7)
        L_0x003a:
            com.bytedance.sdk.openadsdk.core.j.d r2 = r1.a()
            r2.a((com.bytedance.sdk.openadsdk.core.j.d) r3)
        L_0x0041:
            return r1
        L_0x0042:
            r18.next()
            int r8 = r18.getEventType()
            r11 = 2
            if (r8 == r11) goto L_0x004d
            goto L_0x0017
        L_0x004d:
            java.lang.String r8 = r18.getName()
            int r13 = r8.hashCode()
            java.lang.String r14 = "ClickTracking"
            java.lang.String r15 = "Error"
            java.lang.String r12 = "VASTAdTagURI"
            r5 = 4
            r4 = 1
            switch(r13) {
                case -587420703: goto L_0x008f;
                case 67232232: goto L_0x0087;
                case 611554000: goto L_0x007d;
                case 1150879268: goto L_0x0073;
                case 2107600959: goto L_0x006b;
                case 2114088489: goto L_0x0061;
                default: goto L_0x0060;
            }
        L_0x0060:
            goto L_0x0097
        L_0x0061:
            java.lang.String r13 = "Impression"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 2
            goto L_0x0098
        L_0x006b:
            boolean r13 = r8.equals(r14)
            if (r13 == 0) goto L_0x0097
            r13 = 4
            goto L_0x0098
        L_0x0073:
            java.lang.String r13 = "CompanionAds"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 5
            goto L_0x0098
        L_0x007d:
            java.lang.String r13 = "TrackingEvents"
            boolean r13 = r8.equals(r13)
            if (r13 == 0) goto L_0x0097
            r13 = 3
            goto L_0x0098
        L_0x0087:
            boolean r13 = r8.equals(r15)
            if (r13 == 0) goto L_0x0097
            r13 = 1
            goto L_0x0098
        L_0x008f:
            boolean r13 = r8.equals(r12)
            if (r13 == 0) goto L_0x0097
            r13 = 0
            goto L_0x0098
        L_0x0097:
            r13 = -1
        L_0x0098:
            if (r13 == 0) goto L_0x00d9
            if (r13 == r4) goto L_0x00c5
            if (r13 == r11) goto L_0x00bc
            if (r13 == r10) goto L_0x00b7
            if (r13 == r5) goto L_0x00ae
            r4 = 5
            if (r13 == r4) goto L_0x00a6
            goto L_0x00d6
        L_0x00a6:
            android.content.Context r5 = r0.f1291b
            com.bytedance.sdk.openadsdk.core.j.c r5 = com.bytedance.sdk.openadsdk.core.j.a.a.a.a(r5, r1)
            r7 = r5
            goto L_0x00d6
        L_0x00ae:
            r4 = 5
            java.util.List r5 = a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r14)
            r3.g((java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c>) r5)
            goto L_0x00d6
        L_0x00b7:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.j.a.a.c.a((org.xmlpull.v1.XmlPullParser) r1, (com.bytedance.sdk.openadsdk.core.j.d) r3)
            goto L_0x00d6
        L_0x00bc:
            r4 = 5
            java.util.List r5 = a((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r8)
            r3.a((java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c>) r5)
            goto L_0x00d6
        L_0x00c5:
            r4 = 5
            com.bytedance.sdk.openadsdk.core.j.b.c$a r5 = new com.bytedance.sdk.openadsdk.core.j.b.c$a
            java.lang.String r8 = b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r15)
            r5.<init>(r8)
            com.bytedance.sdk.openadsdk.core.j.b.c r5 = r5.a()
            r2.add(r5)
        L_0x00d6:
            r5 = r6
        L_0x00d7:
            r6 = 0
            goto L_0x00ed
        L_0x00d9:
            r4 = 5
            java.lang.String r5 = b((org.xmlpull.v1.XmlPullParser) r1, (java.lang.String) r12)
            java.lang.String r5 = r0.a((java.lang.String) r5, (java.util.List<com.bytedance.sdk.openadsdk.core.j.b.c>) r2)
            boolean r6 = android.text.TextUtils.isEmpty(r5)
            if (r6 == 0) goto L_0x00d7
            a(r1, r9, r10)
            r6 = 0
            return r6
        L_0x00ed:
            r16 = r6
            r6 = r5
            r5 = r16
            goto L_0x0017
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.j.a.a.d.b(org.xmlpull.v1.XmlPullParser, java.util.List):com.bytedance.sdk.openadsdk.core.j.a");
    }

    private static List<c> a(String str, boolean z) {
        if (TextUtils.isEmpty(str)) {
            return new ArrayList();
        }
        return Collections.singletonList(new c.a(str).a(z).a());
    }

    private static List<c> d(String str) {
        return a(str, false);
    }
}
