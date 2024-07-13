package com.yandex.metrica.impl.ob;

import android.text.TextUtils;
import com.yandex.metrica.PreloadInfo;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.ie  reason: case insensitive filesystem */
public class C0457ie {

    /* renamed from: a  reason: collision with root package name */
    private C0357ee f5989a;

    public C0457ie(PreloadInfo preloadInfo, C0315cm cmVar, boolean z) {
        if (preloadInfo == null) {
            return;
        }
        if (!TextUtils.isEmpty(preloadInfo.getTrackingId())) {
            this.f5989a = new C0357ee(preloadInfo.getTrackingId(), new JSONObject(preloadInfo.getAdditionalParams()), true, z, C0736u0.APP);
        } else if (cmVar.isEnabled()) {
            cmVar.e("Required field \"PreloadInfo.trackingId\" is empty!\nThis preload info will be skipped.");
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(20:2|3|4|5|6|7|8|9|10|11|12|13|14|15|16|17|18|19|20|21) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0032 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public org.json.JSONObject a(org.json.JSONObject r6) {
        /*
            r5 = this;
            com.yandex.metrica.impl.ob.ee r0 = r5.f5989a
            if (r0 == 0) goto L_0x0035
            java.lang.String r1 = "preloadInfo"
            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0035 }
            r2.<init>()     // Catch:{ all -> 0x0035 }
            java.lang.String r3 = "trackingId"
            java.lang.String r4 = r0.f5743a     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "additionalParams"
            org.json.JSONObject r4 = r0.f5744b     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "wasSet"
            boolean r4 = r0.f5745c     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "autoTracking"
            boolean r4 = r0.f5746d     // Catch:{ all -> 0x0032 }
            r2.put(r3, r4)     // Catch:{ all -> 0x0032 }
            java.lang.String r3 = "source"
            com.yandex.metrica.impl.ob.u0 r0 = r0.f5747e     // Catch:{ all -> 0x0032 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0032 }
            r2.put(r3, r0)     // Catch:{ all -> 0x0032 }
        L_0x0032:
            r6.put(r1, r2)     // Catch:{ all -> 0x0035 }
        L_0x0035:
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0457ie.a(org.json.JSONObject):org.json.JSONObject");
    }
}
