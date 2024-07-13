package com.appodeal.ads.utils;

public final class v implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    public final String f17575a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17576b;

    public v(String str, String str2) {
        this.f17575a = str;
        this.f17576b = str2;
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x005f  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            java.net.URL r1 = new java.net.URL     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            java.lang.String r2 = r5.f17576b     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r1.<init>(r2)     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            java.net.URLConnection r1 = r1.openConnection()     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            java.net.HttpURLConnection r1 = (java.net.HttpURLConnection) r1     // Catch:{ Exception -> 0x004f, all -> 0x004a }
            r0 = 20000(0x4e20, float:2.8026E-41)
            r1.setConnectTimeout(r0)     // Catch:{ Exception -> 0x0048 }
            r1.setReadTimeout(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "Content-Type"
            java.lang.String r2 = "application/json; charset=UTF-8"
            r1.setRequestProperty(r0, r2)     // Catch:{ Exception -> 0x0048 }
            r0 = 1
            r1.setDoOutput(r0)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r0 = "POST"
            r1.setRequestMethod(r0)     // Catch:{ Exception -> 0x0048 }
            java.io.DataOutputStream r0 = new java.io.DataOutputStream     // Catch:{ Exception -> 0x0048 }
            java.io.OutputStream r2 = r1.getOutputStream()     // Catch:{ Exception -> 0x0048 }
            r0.<init>(r2)     // Catch:{ Exception -> 0x0048 }
            java.lang.String r2 = r5.f17575a     // Catch:{ Exception -> 0x0048 }
            java.nio.charset.Charset r3 = java.nio.charset.StandardCharsets.UTF_8     // Catch:{ Exception -> 0x0048 }
            byte[] r2 = r2.getBytes(r3)     // Catch:{ Exception -> 0x0048 }
            r0.write(r2)     // Catch:{ Exception -> 0x0048 }
            r0.flush()     // Catch:{ Exception -> 0x0048 }
            r0.close()     // Catch:{ Exception -> 0x0048 }
            java.io.InputStream r0 = r1.getInputStream()     // Catch:{ Exception -> 0x0048 }
            com.appodeal.ads.n5.a((java.io.InputStream) r0)     // Catch:{ Exception -> 0x0048 }
            goto L_0x0058
        L_0x0048:
            r0 = move-exception
            goto L_0x0053
        L_0x004a:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
            goto L_0x005d
        L_0x004f:
            r1 = move-exception
            r4 = r1
            r1 = r0
            r0 = r4
        L_0x0053:
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ all -> 0x005c }
            if (r1 == 0) goto L_0x005b
        L_0x0058:
            r1.disconnect()
        L_0x005b:
            return
        L_0x005c:
            r0 = move-exception
        L_0x005d:
            if (r1 == 0) goto L_0x0062
            r1.disconnect()
        L_0x0062:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.v.run():void");
    }
}
