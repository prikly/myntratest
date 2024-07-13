package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.yh  reason: case insensitive filesystem */
class C0849yh {

    /* renamed from: a  reason: collision with root package name */
    private final C0819xb f7166a;

    /* renamed from: b  reason: collision with root package name */
    private final Context f7167b;

    /* renamed from: c  reason: collision with root package name */
    private String f7168c;

    /* renamed from: d  reason: collision with root package name */
    private String f7169d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f7170e;

    /* renamed from: f  reason: collision with root package name */
    private C0635pi f7171f;

    C0849yh(Context context, C0635pi piVar) {
        this(context, piVar, F0.g().r());
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:4:0x001c, code lost:
        r2 = r2.f6881a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String a() {
        /*
            r5 = this;
            org.json.JSONObject r0 = new org.json.JSONObject
            r0.<init>()
            boolean r1 = r5.f7170e
            if (r1 != 0) goto L_0x003b
            com.yandex.metrica.impl.ob.xb r1 = r5.f7166a
            android.content.Context r2 = r5.f7167b
            com.yandex.metrica.impl.ob.zb r1 = r1.a((android.content.Context) r2)
            com.yandex.metrica.impl.ob.ub r2 = r1.a()
            boolean r3 = r2.a()
            r4 = 0
            if (r3 == 0) goto L_0x0023
            com.yandex.metrica.impl.ob.tb r2 = r2.f6881a
            if (r2 == 0) goto L_0x0023
            java.lang.String r2 = r2.f6825b
            goto L_0x0024
        L_0x0023:
            r2 = r4
        L_0x0024:
            r5.f7168c = r2
            com.yandex.metrica.impl.ob.ub r1 = r1.b()
            boolean r2 = r1.a()
            if (r2 == 0) goto L_0x0036
            com.yandex.metrica.impl.ob.tb r1 = r1.f6881a
            if (r1 == 0) goto L_0x0036
            java.lang.String r4 = r1.f6825b
        L_0x0036:
            r5.f7169d = r4
            r1 = 1
            r5.f7170e = r1
        L_0x003b:
            java.lang.String r1 = "uuid"
            com.yandex.metrica.impl.ob.pi r2 = r5.f7171f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.V()     // Catch:{ all -> 0x005f }
            r5.a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "device_id"
            com.yandex.metrica.impl.ob.pi r2 = r5.f7171f     // Catch:{ all -> 0x005f }
            java.lang.String r2 = r2.i()     // Catch:{ all -> 0x005f }
            r5.a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "google_aid"
            java.lang.String r2 = r5.f7168c     // Catch:{ all -> 0x005f }
            r5.a(r0, r1, r2)     // Catch:{ all -> 0x005f }
            java.lang.String r1 = "huawei_aid"
            java.lang.String r2 = r5.f7169d     // Catch:{ all -> 0x005f }
            r5.a(r0, r1, r2)     // Catch:{ all -> 0x005f }
        L_0x005f:
            java.lang.String r0 = r0.toString()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0849yh.a():java.lang.String");
    }

    C0849yh(Context context, C0635pi piVar, C0819xb xbVar) {
        this.f7170e = false;
        this.f7167b = context;
        this.f7171f = piVar;
        this.f7166a = xbVar;
    }

    public void a(C0635pi piVar) {
        this.f7171f = piVar;
    }

    private void a(JSONObject jSONObject, String str, String str2) throws JSONException {
        if (!TextUtils.isEmpty(str2)) {
            jSONObject.put(str, str2);
        }
    }
}
