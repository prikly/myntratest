package com.criteo.publisher.model;

import java.util.List;

/* compiled from: CdbResponse */
public class r {

    /* renamed from: a  reason: collision with root package name */
    private final List<s> f2834a;

    /* renamed from: b  reason: collision with root package name */
    private final int f2835b;

    /* renamed from: c  reason: collision with root package name */
    private final Boolean f2836c;

    public r(List<s> list, int i, Boolean bool) {
        this.f2834a = list;
        this.f2835b = i;
        this.f2836c = bool;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x0071 A[SYNTHETIC, Splitter:B:23:0x0071] */
    /* JADX WARNING: Removed duplicated region for block: B:9:0x003d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.criteo.publisher.model.r a(org.json.JSONObject r7) {
        /*
            java.lang.Class<com.criteo.publisher.model.r> r0 = com.criteo.publisher.model.r.class
            com.criteo.publisher.logging.g r0 = com.criteo.publisher.logging.h.b(r0)
            java.util.ArrayList r1 = new java.util.ArrayList
            r1.<init>()
            java.lang.String r2 = "timeToNextCall"
            boolean r3 = r7.has(r2)
            r4 = 0
            if (r3 == 0) goto L_0x0034
            int r2 = r7.getInt(r2)     // Catch:{ JSONException -> 0x0019 }
            goto L_0x0035
        L_0x0019:
            r2 = move-exception
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r5 = "Exception while reading cdb time to next call"
            r3.append(r5)
            java.lang.String r2 = r2.getMessage()
            r3.append(r2)
            java.lang.String r2 = r3.toString()
            java.lang.Object[] r3 = new java.lang.Object[r4]
            r0.a((java.lang.String) r2, (java.lang.Object[]) r3)
        L_0x0034:
            r2 = 0
        L_0x0035:
            java.lang.String r3 = "slots"
            boolean r5 = r7.has(r3)
            if (r5 == 0) goto L_0x0068
            org.json.JSONArray r5 = new org.json.JSONArray
            r5.<init>()
            org.json.JSONArray r5 = r7.getJSONArray(r3)     // Catch:{ JSONException -> 0x0047 }
            goto L_0x004d
        L_0x0047:
            r3 = move-exception
            java.lang.String r6 = "Exception while reading slots array"
            r0.a((java.lang.String) r6, (java.lang.Throwable) r3)
        L_0x004d:
            int r3 = r5.length()
            if (r4 >= r3) goto L_0x0068
            org.json.JSONObject r3 = r5.getJSONObject(r4)     // Catch:{ Exception -> 0x005f }
            com.criteo.publisher.model.s r3 = com.criteo.publisher.model.s.a((org.json.JSONObject) r3)     // Catch:{ Exception -> 0x005f }
            r1.add(r3)     // Catch:{ Exception -> 0x005f }
            goto L_0x0065
        L_0x005f:
            r3 = move-exception
            java.lang.String r6 = "Exception while reading slot from slots array"
            r0.a((java.lang.String) r6, (java.lang.Throwable) r3)
        L_0x0065:
            int r4 = r4 + 1
            goto L_0x004d
        L_0x0068:
            r3 = 0
            java.lang.String r4 = "consentGiven"
            boolean r5 = r7.has(r4)
            if (r5 == 0) goto L_0x0080
            boolean r7 = r7.getBoolean(r4)     // Catch:{ JSONException -> 0x007a }
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r7)     // Catch:{ JSONException -> 0x007a }
            goto L_0x0080
        L_0x007a:
            r7 = move-exception
            java.lang.String r4 = "Exception while reading consentGiven"
            r0.a((java.lang.String) r4, (java.lang.Throwable) r7)
        L_0x0080:
            com.criteo.publisher.model.r r7 = new com.criteo.publisher.model.r
            r7.<init>(r1, r2, r3)
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: com.criteo.publisher.model.r.a(org.json.JSONObject):com.criteo.publisher.model.r");
    }

    public List<s> b() {
        return this.f2834a;
    }

    public int c() {
        return this.f2835b;
    }

    public Boolean a() {
        return this.f2836c;
    }

    public s a(String str) {
        for (s next : this.f2834a) {
            if (str.equals(next.f())) {
                return next;
            }
        }
        return null;
    }

    public String toString() {
        return "CdbResponse{slots=" + this.f2834a + ", timeToNextCall=" + this.f2835b + ", consentGiven = " + this.f2836c + '}';
    }
}
