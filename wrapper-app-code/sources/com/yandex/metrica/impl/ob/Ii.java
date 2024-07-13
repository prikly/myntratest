package com.yandex.metrica.impl.ob;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONObject;

public class Ii {

    /* renamed from: a  reason: collision with root package name */
    private static final Set<String> f4273a;

    static {
        HashSet hashSet = new HashSet();
        f4273a = hashSet;
        hashSet.add("get_ad");
        hashSet.add("report");
        hashSet.add("report_ad");
        hashSet.add("location");
        hashSet.add("startup");
        hashSet.add("diagnostic");
        hashSet.add("mediascope");
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(8:0|1|2|3|4|5|6|(27:8|9|10|13|14|(1:16)|17|(1:19)|20|21|22|23|24|(1:26)|27|(1:29)|30|(1:32)|33|(1:35)|36|(1:38)|39|(4:42|(2:46|53)|49|40)|50|47|54)(1:56)) */
    /* JADX WARNING: Code restructure failed: missing block: B:55:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:23:0x0050 */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x000f */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0056 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0065 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0074 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0083 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x0092 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00a4 A[Catch:{ all -> 0x00bf }] */
    /* JADX WARNING: Removed duplicated region for block: B:56:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0019  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(com.yandex.metrica.impl.ob.Ui r6, com.yandex.metrica.impl.ob.Tl.a r7) {
        /*
            r5 = this;
            java.lang.String r0 = ""
            java.lang.String r1 = "urls"
            java.lang.String r2 = "query_hosts"
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ all -> 0x00bf }
            r3.<init>()     // Catch:{ all -> 0x00bf }
            java.lang.Object r3 = r7.get(r2)     // Catch:{ all -> 0x000f }
        L_0x000f:
            org.json.JSONObject r3 = (org.json.JSONObject) r3     // Catch:{ all -> 0x00bf }
            java.lang.String r7 = "list"
            org.json.JSONObject r7 = r3.optJSONObject(r7)     // Catch:{ all -> 0x00bf }
            if (r7 == 0) goto L_0x00bf
            java.lang.String r2 = "get_ad"
            r3 = 0
            org.json.JSONObject r2 = r7.getJSONObject(r2)     // Catch:{ all -> 0x0029 }
            org.json.JSONArray r2 = r2.getJSONArray(r1)     // Catch:{ all -> 0x0029 }
            java.lang.String r2 = r2.getString(r3)     // Catch:{ all -> 0x0029 }
            goto L_0x002a
        L_0x0029:
            r2 = r0
        L_0x002a:
            boolean r4 = android.text.TextUtils.isEmpty(r2)     // Catch:{ all -> 0x00bf }
            if (r4 != 0) goto L_0x0033
            r6.f((java.lang.String) r2)     // Catch:{ all -> 0x00bf }
        L_0x0033:
            java.lang.String r2 = "report"
            java.util.List r2 = r5.a((org.json.JSONObject) r7, (java.lang.String) r2)     // Catch:{ all -> 0x00bf }
            boolean r4 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r2)     // Catch:{ all -> 0x00bf }
            if (r4 != 0) goto L_0x0042
            r6.f((java.util.List<java.lang.String>) r2)     // Catch:{ all -> 0x00bf }
        L_0x0042:
            java.lang.String r2 = "report_ad"
            org.json.JSONObject r2 = r7.getJSONObject(r2)     // Catch:{ all -> 0x0050 }
            org.json.JSONArray r1 = r2.getJSONArray(r1)     // Catch:{ all -> 0x0050 }
            java.lang.String r0 = r1.getString(r3)     // Catch:{ all -> 0x0050 }
        L_0x0050:
            boolean r1 = android.text.TextUtils.isEmpty(r0)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0059
            r6.g((java.lang.String) r0)     // Catch:{ all -> 0x00bf }
        L_0x0059:
            java.lang.String r0 = "location"
            java.util.List r0 = r5.a((org.json.JSONObject) r7, (java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            boolean r1 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0068
            r6.c((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x00bf }
        L_0x0068:
            java.lang.String r0 = "startup"
            java.util.List r0 = r5.a((org.json.JSONObject) r7, (java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            boolean r1 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0077
            r6.h((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x00bf }
        L_0x0077:
            java.lang.String r0 = "diagnostic"
            java.util.List r0 = r5.a((org.json.JSONObject) r7, (java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            boolean r1 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0086
            r6.a((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x00bf }
        L_0x0086:
            java.lang.String r0 = "mediascope"
            java.util.List r0 = r5.a((org.json.JSONObject) r7, (java.lang.String) r0)     // Catch:{ all -> 0x00bf }
            boolean r1 = com.yandex.metrica.impl.ob.A2.b((java.util.Collection) r0)     // Catch:{ all -> 0x00bf }
            if (r1 != 0) goto L_0x0095
            r6.e((java.util.List<java.lang.String>) r0)     // Catch:{ all -> 0x00bf }
        L_0x0095:
            java.util.HashMap r0 = new java.util.HashMap     // Catch:{ all -> 0x00bf }
            r0.<init>()     // Catch:{ all -> 0x00bf }
            java.util.Iterator r1 = r7.keys()     // Catch:{ all -> 0x00bf }
        L_0x009e:
            boolean r2 = r1.hasNext()     // Catch:{ all -> 0x00bf }
            if (r2 == 0) goto L_0x00bc
            java.lang.Object r2 = r1.next()     // Catch:{ all -> 0x00bf }
            java.lang.String r2 = (java.lang.String) r2     // Catch:{ all -> 0x00bf }
            java.util.Set<java.lang.String> r3 = f4273a     // Catch:{ all -> 0x00bf }
            boolean r3 = r3.contains(r2)     // Catch:{ all -> 0x00bf }
            if (r3 != 0) goto L_0x009e
            java.util.List r3 = r5.a((org.json.JSONObject) r7, (java.lang.String) r2)     // Catch:{ all -> 0x00bf }
            if (r3 == 0) goto L_0x009e
            r0.put(r2, r3)     // Catch:{ all -> 0x00bf }
            goto L_0x009e
        L_0x00bc:
            r6.a((java.util.Map<java.lang.String, java.util.List<java.lang.String>>) r0)     // Catch:{ all -> 0x00bf }
        L_0x00bf:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.Ii.a(com.yandex.metrica.impl.ob.Ui, com.yandex.metrica.impl.ob.Tl$a):void");
    }

    private List<String> a(JSONObject jSONObject, String str) {
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(str);
            if (optJSONObject != null) {
                return Tl.b(optJSONObject.getJSONArray("urls"));
            }
        } catch (Throwable unused) {
        }
        return null;
    }
}
