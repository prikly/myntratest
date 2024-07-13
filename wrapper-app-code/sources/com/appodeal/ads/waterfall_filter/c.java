package com.appodeal.ads.waterfall_filter;

import com.appodeal.ads.modules.common.internal.adtype.AdType;

public final class c extends e {

    /* renamed from: a  reason: collision with root package name */
    public final AdType f17634a;

    public c(AdType adType) {
        this.f17634a = adType;
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0053 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:23:0x0062 A[Catch:{ Exception -> 0x00a4 }] */
    /* JADX WARNING: Removed duplicated region for block: B:32:0x0086 A[Catch:{ Exception -> 0x009c }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.ArrayList r9, com.appodeal.ads.r r10) {
        /*
            r8 = this;
            com.appodeal.ads.segments.k r10 = com.appodeal.ads.segments.n.c()
            com.appodeal.ads.segments.k$a r10 = r10.f17273b
            com.appodeal.ads.modules.common.internal.adtype.AdType r0 = r8.f17634a
            r10.getClass()
            java.lang.String r1 = com.appodeal.ads.segments.m.a(r0)     // Catch:{ Exception -> 0x00a4 }
            org.json.JSONObject r2 = r10.f17277a     // Catch:{ Exception -> 0x0042 }
            java.lang.String r3 = "overridden_ecpm"
            org.json.JSONObject r2 = r2.optJSONObject(r3)     // Catch:{ Exception -> 0x0042 }
            if (r2 == 0) goto L_0x0046
            org.json.JSONObject r3 = new org.json.JSONObject     // Catch:{ Exception -> 0x0042 }
            r3.<init>()     // Catch:{ Exception -> 0x0042 }
            java.util.Iterator r4 = r2.keys()     // Catch:{ Exception -> 0x0042 }
        L_0x0022:
            boolean r5 = r4.hasNext()     // Catch:{ Exception -> 0x0042 }
            if (r5 == 0) goto L_0x0047
            java.lang.Object r5 = r4.next()     // Catch:{ Exception -> 0x0042 }
            java.lang.String r5 = (java.lang.String) r5     // Catch:{ Exception -> 0x0042 }
            org.json.JSONObject r6 = r2.optJSONObject(r5)     // Catch:{ Exception -> 0x0042 }
            if (r6 == 0) goto L_0x0022
            boolean r7 = r6.has(r1)     // Catch:{ Exception -> 0x0042 }
            if (r7 == 0) goto L_0x0022
            double r6 = r6.optDouble(r1)     // Catch:{ Exception -> 0x0042 }
            r3.put(r5, r6)     // Catch:{ Exception -> 0x0042 }
            goto L_0x0022
        L_0x0042:
            r1 = move-exception
            com.appodeal.ads.utils.Log.log(r1)     // Catch:{ Exception -> 0x00a4 }
        L_0x0046:
            r3 = 0
        L_0x0047:
            org.json.JSONObject r1 = r10.f17277a     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r2 = "price_floor"
            org.json.JSONObject r1 = r1.optJSONObject(r2)     // Catch:{ Exception -> 0x00a4 }
            r4 = -4616189618054758400(0xbff0000000000000, double:-1.0)
            if (r1 == 0) goto L_0x005b
            java.lang.String r2 = com.appodeal.ads.segments.m.a(r0)     // Catch:{ Exception -> 0x00a4 }
            double r4 = r1.optDouble(r2, r4)     // Catch:{ Exception -> 0x00a4 }
        L_0x005b:
            java.util.HashSet r1 = new java.util.HashSet     // Catch:{ Exception -> 0x00a4 }
            r1.<init>()     // Catch:{ Exception -> 0x00a4 }
            if (r3 == 0) goto L_0x0076
            java.util.Iterator r2 = r3.keys()     // Catch:{ Exception -> 0x00a4 }
        L_0x0066:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x00a4 }
            if (r6 == 0) goto L_0x0076
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x00a4 }
            java.lang.String r6 = (java.lang.String) r6     // Catch:{ Exception -> 0x00a4 }
            r1.add(r6)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x0066
        L_0x0076:
            r10.a((java.util.ArrayList) r9, (com.appodeal.ads.modules.common.internal.adtype.AdType) r0)     // Catch:{ Exception -> 0x00a4 }
            com.appodeal.ads.segments.k.a.a((java.util.ArrayList) r9, (java.util.HashSet) r1, (org.json.JSONObject) r3)     // Catch:{ Exception -> 0x00a4 }
            java.util.Iterator r10 = r9.iterator()     // Catch:{ Exception -> 0x009c }
        L_0x0080:
            boolean r0 = r10.hasNext()     // Catch:{ Exception -> 0x009c }
            if (r0 == 0) goto L_0x00a0
            java.lang.Object r0 = r10.next()     // Catch:{ Exception -> 0x009c }
            org.json.JSONObject r0 = (org.json.JSONObject) r0     // Catch:{ Exception -> 0x009c }
            java.lang.String r2 = "ecpm"
            r6 = 0
            double r2 = r0.optDouble(r2, r6)     // Catch:{ Exception -> 0x009c }
            int r0 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r0 >= 0) goto L_0x0080
            r10.remove()     // Catch:{ Exception -> 0x009c }
            goto L_0x0080
        L_0x009c:
            r10 = move-exception
            com.appodeal.ads.utils.Log.log(r10)     // Catch:{ Exception -> 0x00a4 }
        L_0x00a0:
            com.appodeal.ads.segments.k.a.a((java.util.ArrayList) r9, (java.util.HashSet) r1)     // Catch:{ Exception -> 0x00a4 }
            goto L_0x00a8
        L_0x00a4:
            r9 = move-exception
            com.appodeal.ads.utils.Log.log(r9)
        L_0x00a8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.waterfall_filter.c.a(java.util.ArrayList, com.appodeal.ads.r):void");
    }
}
