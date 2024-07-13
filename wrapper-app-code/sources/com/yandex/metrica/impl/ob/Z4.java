package com.yandex.metrica.impl.ob;

import android.content.pm.FeatureInfo;
import android.content.pm.PackageInfo;
import com.yandex.metrica.impl.ob.C0675rb;
import java.util.ArrayList;

public class Z4 extends X4 {

    /* renamed from: b  reason: collision with root package name */
    private final C0565mn f5395b;

    public Z4(L3 l3) {
        this(l3, new C0565mn());
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:4|(5:6|7|(3:10|11|8)|24|12)|13|14|(1:16)(4:17|(2:20|18)|25|21)) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:13:0x004e */
    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058 A[Catch:{ all -> 0x009a }] */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x005c A[Catch:{ all -> 0x009a }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(com.yandex.metrica.impl.ob.C0293c0 r10) {
        /*
            r9 = this;
            com.yandex.metrica.impl.ob.L3 r0 = r9.a()
            com.yandex.metrica.impl.ob.b8 r1 = r0.x()
            boolean r1 = r1.k()
            r2 = 0
            if (r1 == 0) goto L_0x009a
            boolean r1 = r0.C()
            if (r1 == 0) goto L_0x009a
            com.yandex.metrica.impl.ob.c9 r1 = r0.f()
            com.yandex.metrica.impl.ob.L3 r3 = r9.a()
            com.yandex.metrica.impl.ob.c9 r3 = r3.f()
            java.lang.String r3 = r3.g()
            boolean r4 = android.text.TextUtils.isEmpty(r3)
            r5 = 0
            if (r4 == 0) goto L_0x002d
            goto L_0x004e
        L_0x002d:
            java.util.HashSet r4 = new java.util.HashSet     // Catch:{ all -> 0x004e }
            r4.<init>()     // Catch:{ all -> 0x004e }
            org.json.JSONArray r6 = new org.json.JSONArray     // Catch:{ all -> 0x004e }
            r6.<init>(r3)     // Catch:{ all -> 0x004e }
            r3 = 0
        L_0x0038:
            int r7 = r6.length()     // Catch:{ all -> 0x004e }
            if (r3 >= r7) goto L_0x004d
            com.yandex.metrica.impl.ob.sb r7 = new com.yandex.metrica.impl.ob.sb     // Catch:{ all -> 0x004e }
            org.json.JSONObject r8 = r6.getJSONObject(r3)     // Catch:{ all -> 0x004e }
            r7.<init>(r8)     // Catch:{ all -> 0x004e }
            r4.add(r7)     // Catch:{ all -> 0x004e }
            int r3 = r3 + 1
            goto L_0x0038
        L_0x004d:
            r5 = r4
        L_0x004e:
            java.util.ArrayList r3 = r9.b()     // Catch:{ all -> 0x009a }
            boolean r4 = com.yandex.metrica.impl.ob.C0267b.a((java.util.Collection<?>) r5, (java.util.Collection<?>) r3)     // Catch:{ all -> 0x009a }
            if (r4 == 0) goto L_0x005c
            r0.y()     // Catch:{ all -> 0x009a }
            goto L_0x009a
        L_0x005c:
            org.json.JSONArray r4 = new org.json.JSONArray     // Catch:{ all -> 0x009a }
            r4.<init>()     // Catch:{ all -> 0x009a }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x009a }
        L_0x0065:
            boolean r5 = r3.hasNext()     // Catch:{ all -> 0x009a }
            if (r5 == 0) goto L_0x0079
            java.lang.Object r5 = r3.next()     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.sb r5 = (com.yandex.metrica.impl.ob.C0699sb) r5     // Catch:{ all -> 0x009a }
            org.json.JSONObject r5 = r5.a()     // Catch:{ all -> 0x009a }
            r4.put(r5)     // Catch:{ all -> 0x009a }
            goto L_0x0065
        L_0x0079:
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x009a }
            r3.<init>()     // Catch:{ all -> 0x009a }
            java.lang.String r5 = "features"
            org.json.JSONObject r3 = r3.put(r5, r4)     // Catch:{ all -> 0x009a }
            java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.c0 r10 = com.yandex.metrica.impl.ob.C0293c0.a((com.yandex.metrica.impl.ob.C0293c0) r10, (java.lang.String) r3)     // Catch:{ all -> 0x009a }
            com.yandex.metrica.impl.ob.a4 r0 = r0.r()     // Catch:{ all -> 0x009a }
            r0.c(r10)     // Catch:{ all -> 0x009a }
            java.lang.String r10 = r4.toString()     // Catch:{ all -> 0x009a }
            r1.h(r10)     // Catch:{ all -> 0x009a }
        L_0x009a:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Z4.a(com.yandex.metrica.impl.ob.c0):boolean");
    }

    /* access modifiers changed from: package-private */
    public ArrayList<C0699sb> b() {
        C0675rb rbVar;
        FeatureInfo[] featureInfoArr;
        try {
            L3 a2 = a();
            PackageInfo b2 = this.f5395b.b(a2.g(), a2.g().getPackageName(), 16384);
            ArrayList<C0699sb> arrayList = new ArrayList<>();
            if (A2.a(24)) {
                rbVar = new C0675rb.a();
            } else {
                rbVar = new C0675rb.b();
            }
            if (!(b2 == null || (featureInfoArr = b2.reqFeatures) == null)) {
                for (FeatureInfo a3 : featureInfoArr) {
                    arrayList.add(rbVar.a(a3));
                }
            }
            return arrayList;
        } catch (Throwable unused) {
            return null;
        }
    }

    public Z4(L3 l3, C0565mn mnVar) {
        super(l3);
        this.f5395b = mnVar;
    }
}
