package com.explorestack.iab.vast.tags;

import android.util.Xml;
import java.io.InputStream;
import org.xmlpull.v1.XmlPullParser;

public class a {
    public static VastTag a(InputStream inputStream) {
        if (inputStream != null) {
            XmlPullParser newPullParser = Xml.newPullParser();
            newPullParser.setFeature("http://xmlpull.org/v1/doc/features.html#process-namespaces", false);
            newPullParser.setInput(inputStream, (String) null);
            int next = newPullParser.next();
            if (next != 1) {
                while (next != 3 && next != 1) {
                    if (newPullParser.getEventType() == 2 && VastXmlTag.a(newPullParser.getName(), "VAST")) {
                        return new VastTag(newPullParser);
                    }
                    next = newPullParser.next();
                }
                return null;
            }
            throw new Exception();
        }
        throw new Exception();
    }

    /* JADX WARNING: Removed duplicated region for block: B:22:0x0043 A[SYNTHETIC, Splitter:B:22:0x0043] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.explorestack.iab.vast.tags.VastTag a(java.lang.String r4) {
        /*
            java.lang.String r0 = "VastXmlParser"
            boolean r1 = android.text.TextUtils.isEmpty(r4)
            if (r1 != 0) goto L_0x0050
            r1 = 0
            java.io.ByteArrayInputStream r2 = new java.io.ByteArrayInputStream     // Catch:{ Exception -> 0x0032 }
            java.nio.charset.Charset r3 = java.nio.charset.Charset.defaultCharset()     // Catch:{ Exception -> 0x0032 }
            java.lang.String r3 = r3.name()     // Catch:{ Exception -> 0x0032 }
            byte[] r4 = r4.getBytes(r3)     // Catch:{ Exception -> 0x0032 }
            r2.<init>(r4)     // Catch:{ Exception -> 0x0032 }
            com.explorestack.iab.vast.tags.VastTag r4 = a((java.io.InputStream) r2)     // Catch:{ Exception -> 0x002d, all -> 0x002b }
            r2.close()     // Catch:{ Exception -> 0x0022 }
            goto L_0x002a
        L_0x0022:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.explorestack.iab.vast.VastLog.a(r0, r2, r1)
        L_0x002a:
            return r4
        L_0x002b:
            r4 = move-exception
            goto L_0x0041
        L_0x002d:
            r4 = move-exception
            r1 = r2
            goto L_0x0033
        L_0x0030:
            r4 = move-exception
            goto L_0x0040
        L_0x0032:
            r4 = move-exception
        L_0x0033:
            java.lang.String r2 = r4.getMessage()     // Catch:{ all -> 0x0030 }
            com.explorestack.iab.vast.VastLog.a(r0, r2, r4)     // Catch:{ all -> 0x0030 }
            java.lang.Exception r4 = new java.lang.Exception     // Catch:{ all -> 0x0030 }
            r4.<init>()     // Catch:{ all -> 0x0030 }
            throw r4     // Catch:{ all -> 0x0030 }
        L_0x0040:
            r2 = r1
        L_0x0041:
            if (r2 == 0) goto L_0x004f
            r2.close()     // Catch:{ Exception -> 0x0047 }
            goto L_0x004f
        L_0x0047:
            r1 = move-exception
            java.lang.String r2 = r1.getMessage()
            com.explorestack.iab.vast.VastLog.a(r0, r2, r1)
        L_0x004f:
            throw r4
        L_0x0050:
            java.lang.Exception r4 = new java.lang.Exception
            r4.<init>()
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.explorestack.iab.vast.tags.a.a(java.lang.String):com.explorestack.iab.vast.tags.VastTag");
    }
}
