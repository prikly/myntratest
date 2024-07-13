package com.yandex.metrica.networktasks.api;

import javax.net.ssl.SSLSocketFactory;

public class CacheControlHttpsConnectionPerformer {

    /* renamed from: a  reason: collision with root package name */
    private final a f7291a;

    /* renamed from: b  reason: collision with root package name */
    private final SSLSocketFactory f7292b;

    public interface Client {
        String getOldETag();

        void onError();

        void onNotModified();

        void onResponse(String str, byte[] bArr);
    }

    CacheControlHttpsConnectionPerformer(a aVar, SSLSocketFactory sSLSocketFactory) {
        this.f7291a = aVar;
        this.f7292b = sSLSocketFactory;
    }

    public CacheControlHttpsConnectionPerformer(SSLSocketFactory sSLSocketFactory) {
        this(new a(), sSLSocketFactory);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0048  */
    /* JADX WARNING: Removed duplicated region for block: B:22:? A[RETURN, SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void performConnection(java.lang.String r5, com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.Client r6) {
        /*
            r4 = this;
            r0 = 0
            com.yandex.metrica.networktasks.api.a r1 = r4.f7291a     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = r6.getOldETag()     // Catch:{ all -> 0x0045 }
            javax.net.ssl.SSLSocketFactory r3 = r4.f7292b     // Catch:{ all -> 0x0045 }
            com.yandex.metrica.network.Response r5 = r1.a(r2, r5, r3)     // Catch:{ all -> 0x0045 }
            int r1 = r5.getCode()     // Catch:{ all -> 0x0045 }
            r2 = 200(0xc8, float:2.8E-43)
            if (r1 == r2) goto L_0x001e
            r5 = 304(0x130, float:4.26E-43)
            if (r1 == r5) goto L_0x001a
            goto L_0x0046
        L_0x001a:
            r6.onNotModified()     // Catch:{ all -> 0x0045 }
            goto L_0x0043
        L_0x001e:
            java.util.Map r1 = r5.getHeaders()     // Catch:{ all -> 0x0045 }
            java.lang.String r2 = "ETag"
            java.lang.Object r1 = r1.get(r2)     // Catch:{ all -> 0x0045 }
            java.util.List r1 = (java.util.List) r1     // Catch:{ all -> 0x0045 }
            if (r1 == 0) goto L_0x003a
            int r2 = r1.size()     // Catch:{ all -> 0x0045 }
            if (r2 <= 0) goto L_0x003a
            java.lang.Object r1 = r1.get(r0)     // Catch:{ all -> 0x0045 }
            java.lang.String r1 = (java.lang.String) r1     // Catch:{ all -> 0x0045 }
            if (r1 != 0) goto L_0x003c
        L_0x003a:
            java.lang.String r1 = ""
        L_0x003c:
            byte[] r5 = r5.getResponseData()     // Catch:{ all -> 0x0045 }
            r6.onResponse(r1, r5)     // Catch:{ all -> 0x0045 }
        L_0x0043:
            r0 = 1
            goto L_0x0046
        L_0x0045:
        L_0x0046:
            if (r0 != 0) goto L_0x004b
            r6.onError()
        L_0x004b:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer.performConnection(java.lang.String, com.yandex.metrica.networktasks.api.CacheControlHttpsConnectionPerformer$Client):void");
    }
}
