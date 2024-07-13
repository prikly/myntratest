package com.appodeal.ads.utils.campaign_frequency;

import android.util.Pair;
import com.appnext.base.b.d;
import com.appodeal.ads.modules.common.internal.Constants;
import com.appodeal.ads.r0;
import com.appodeal.ads.storage.o;
import com.appodeal.ads.utils.Log;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b {
    public static final HashMap l = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public a f17494a;

    /* renamed from: b  reason: collision with root package name */
    public final String f17495b;

    /* renamed from: c  reason: collision with root package name */
    public final String f17496c;

    /* renamed from: d  reason: collision with root package name */
    public final String f17497d;

    /* renamed from: e  reason: collision with root package name */
    public final int f17498e;

    /* renamed from: f  reason: collision with root package name */
    public final int f17499f;

    /* renamed from: g  reason: collision with root package name */
    public final int f17500g;

    /* renamed from: h  reason: collision with root package name */
    public final int f17501h;
    public final int i;
    public final boolean j;
    public final boolean k;

    public b(String str, String str2, String str3, int i2, int i3, int i4, int i5, int i6, boolean z, boolean z2) {
        this.f17495b = str;
        this.f17496c = str2;
        this.f17497d = str3;
        this.f17498e = i2;
        this.f17499f = i3;
        this.f17500g = i4;
        this.f17501h = i5;
        this.i = i6;
        this.j = z;
        this.k = z2;
        this.f17494a = new a(str2);
    }

    public static b a(JSONObject jSONObject, String str) {
        try {
            String valueOf = String.valueOf(jSONObject.getInt("campaign_id"));
            String valueOf2 = String.valueOf(jSONObject.getInt("image_id"));
            int i2 = jSONObject.getInt("impressions");
            int i3 = jSONObject.getInt("period");
            int optInt = jSONObject.optInt(OutcomeEventsTable.COLUMN_NAME_SESSION, -1);
            int optInt2 = jSONObject.optInt(d.fn, 0);
            jSONObject.optBoolean("per_app", false);
            return new b(str, valueOf, valueOf2, jSONObject.getString("cap_type").equals("image") ? 2 : 1, i2, i3, optInt, optInt2, jSONObject.optBoolean("stop_after_install", false), jSONObject.optBoolean("stop_after_click", false));
        } catch (Throwable th) {
            Log.log(th);
            return null;
        }
    }

    public static JSONObject a(JSONObject jSONObject) {
        Iterator<String> keys = jSONObject.keys();
        while (keys.hasNext()) {
            try {
                String next = keys.next();
                JSONObject jSONObject2 = new JSONObject(jSONObject.getString(next));
                Iterator<String> keys2 = jSONObject2.keys();
                while (keys2.hasNext()) {
                    String next2 = keys2.next();
                    JSONArray jSONArray = jSONObject2.getJSONArray(next2);
                    ArrayList arrayList = new ArrayList();
                    for (int i2 = 0; i2 < jSONArray.length(); i2++) {
                        arrayList.add(Integer.valueOf(jSONArray.getInt(i2)));
                    }
                    Collections.sort(arrayList);
                    List subList = arrayList.subList(Math.max(arrayList.size() - 20, 0), arrayList.size());
                    long currentTimeMillis = ((System.currentTimeMillis() / 1000) / 60) - 43200;
                    Iterator it = subList.iterator();
                    while (it.hasNext()) {
                        if (((long) ((Integer) it.next()).intValue()) < currentTimeMillis) {
                            it.remove();
                        }
                    }
                    if (subList.size() > 0) {
                        jSONObject2.put(next2, new JSONArray(subList));
                    } else {
                        keys2.remove();
                    }
                }
                if (jSONObject2.length() > 0) {
                    jSONObject.put(next, jSONObject2);
                } else {
                    keys.remove();
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
        return jSONObject;
    }

    public static void a(ArrayList arrayList) {
        try {
            if (r0.f17091g) {
                HashMap hashMap = new HashMap();
                for (int i2 = 0; i2 < arrayList.size(); i2++) {
                    JSONObject jSONObject = (JSONObject) arrayList.get(i2);
                    if (jSONObject.has(Constants.CAMPAIGN_FREQUENCY)) {
                        double d2 = jSONObject.getDouble("ecpm");
                        List arrayList2 = hashMap.containsKey(Double.valueOf(d2)) ? (List) hashMap.get(Double.valueOf(d2)) : new ArrayList();
                        arrayList2.add(new Pair(Integer.valueOf(i2), Double.valueOf(jSONObject.getJSONObject(Constants.CAMPAIGN_FREQUENCY).optDouble("weight", 1.0d))));
                        hashMap.put(Double.valueOf(d2), arrayList2);
                    }
                }
                for (List<Pair> list : hashMap.values()) {
                    if (list.size() != 1) {
                        double d3 = 0.0d;
                        for (Pair pair : list) {
                            d3 += ((Double) pair.second).doubleValue();
                        }
                        ArrayList arrayList3 = new ArrayList();
                        for (Pair pair2 : list) {
                            arrayList3.addAll(Collections.nCopies((int) Math.round((((Double) pair2.second).doubleValue() / d3) * 100.0d), (Integer) pair2.first));
                        }
                        Collections.shuffle(arrayList3);
                        ArrayList arrayList4 = new ArrayList(new LinkedHashSet(arrayList3));
                        HashMap hashMap2 = new HashMap();
                        for (int i3 = 0; i3 < list.size(); i3++) {
                            hashMap2.put((Integer) arrayList4.get(i3), (JSONObject) arrayList.get(((Integer) ((Pair) list.get(i3)).first).intValue()));
                        }
                        for (Map.Entry entry : hashMap2.entrySet()) {
                            arrayList.set(((Integer) entry.getKey()).intValue(), (JSONObject) entry.getValue());
                        }
                    }
                }
            }
        } catch (Exception e2) {
            Log.log(e2);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:103:0x0190 A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:109:0x019c A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x008b A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x00e4 A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:88:0x0160 A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:93:0x0176 A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x0178 A[Catch:{ Exception -> 0x01dc }] */
    /* JADX WARNING: Removed duplicated region for block: B:97:0x017d A[Catch:{ Exception -> 0x01dc }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean a(android.content.Context r18) {
        /*
            r17 = this;
            r1 = r17
            r2 = 1
            java.lang.String r0 = r1.f17495b     // Catch:{ Exception -> 0x01dc }
            java.lang.String r3 = "Can Load Campaign"
            java.lang.String r4 = "CampaignFrequency"
            r5 = 0
            if (r0 == 0) goto L_0x0031
            boolean r6 = r1.j     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x0031
            android.content.pm.PackageManager r6 = r18.getPackageManager()     // Catch:{ NameNotFoundException -> 0x0019 }
            r6.getApplicationInfo(r0, r5)     // Catch:{ NameNotFoundException -> 0x0019 }
            r0 = 1
            goto L_0x001a
        L_0x0019:
            r0 = 0
        L_0x001a:
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = "%s skipped: %s is already installed"
            r6 = 2
            java.lang.Object[] r6 = new java.lang.Object[r6]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            r6[r5] = r7     // Catch:{ Exception -> 0x01dc }
            java.lang.String r7 = r1.f17495b     // Catch:{ Exception -> 0x01dc }
            r6[r2] = r7     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ Exception -> 0x01dc }
            com.appodeal.ads.utils.Log.log((java.lang.String) r4, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x01dc }
            return r5
        L_0x0031:
            boolean r0 = r1.k     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0056
            com.appodeal.ads.utils.campaign_frequency.a r0 = r1.f17494a     // Catch:{ Exception -> 0x01dc }
            com.appodeal.ads.storage.o r6 = com.appodeal.ads.utils.campaign_frequency.a.f17491b     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = r0.f17493a     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = r6.e(r0)     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0043
            r0 = 1
            goto L_0x0044
        L_0x0043:
            r0 = 0
        L_0x0044:
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "%s skipped: already clicked"
            java.lang.Object[] r6 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            r6[r5] = r7     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ Exception -> 0x01dc }
            com.appodeal.ads.utils.Log.log((java.lang.String) r4, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x01dc }
            return r5
        L_0x0056:
            java.util.ArrayList r6 = new java.util.ArrayList     // Catch:{ Exception -> 0x01dc }
            r6.<init>()     // Catch:{ Exception -> 0x01dc }
            com.appodeal.ads.utils.campaign_frequency.a r0 = r1.f17494a     // Catch:{ Exception -> 0x01dc }
            com.appodeal.ads.storage.o r7 = com.appodeal.ads.utils.campaign_frequency.a.f17491b     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = r0.f17493a     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = r7.e(r0)     // Catch:{ Exception -> 0x01dc }
            boolean r7 = android.text.TextUtils.isEmpty(r0)     // Catch:{ Exception -> 0x01dc }
            if (r7 != 0) goto L_0x0082
            boolean r7 = com.appodeal.ads.utils.campaign_frequency.a.f17492c     // Catch:{ Exception -> 0x007e }
            if (r7 != 0) goto L_0x0078
            if (r0 == 0) goto L_0x0072
            goto L_0x0078
        L_0x0072:
            java.lang.AssertionError r0 = new java.lang.AssertionError     // Catch:{ Exception -> 0x007e }
            r0.<init>()     // Catch:{ Exception -> 0x007e }
            throw r0     // Catch:{ Exception -> 0x007e }
        L_0x0078:
            org.json.JSONObject r7 = new org.json.JSONObject     // Catch:{ Exception -> 0x007e }
            r7.<init>(r0)     // Catch:{ Exception -> 0x007e }
            goto L_0x0083
        L_0x007e:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)     // Catch:{ Exception -> 0x01dc }
        L_0x0082:
            r7 = 0
        L_0x0083:
            int r0 = r1.f17498e     // Catch:{ Exception -> 0x01dc }
            int r0 = com.appodeal.ads.m.a(r0)     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x00e4
            if (r0 == r2) goto L_0x0091
            r0 = 0
            r8 = 0
            goto L_0x0146
        L_0x0091:
            if (r7 == 0) goto L_0x00ba
            java.lang.String r0 = r1.f17497d     // Catch:{ Exception -> 0x01dc }
            boolean r0 = r7.has(r0)     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x00ba
            java.lang.String r0 = r1.f17497d     // Catch:{ Exception -> 0x01dc }
            org.json.JSONArray r0 = r7.getJSONArray(r0)     // Catch:{ Exception -> 0x01dc }
            r7 = 0
            r8 = 0
        L_0x00a3:
            int r9 = r0.length()     // Catch:{ Exception -> 0x01dc }
            if (r7 >= r9) goto L_0x00bb
            int r9 = r0.getInt(r7)     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r10 = java.lang.Integer.valueOf(r9)     // Catch:{ Exception -> 0x01dc }
            r6.add(r10)     // Catch:{ Exception -> 0x01dc }
            if (r9 <= r8) goto L_0x00b7
            r8 = r9
        L_0x00b7:
            int r7 = r7 + 1
            goto L_0x00a3
        L_0x00ba:
            r8 = 0
        L_0x00bb:
            java.util.HashMap r0 = l     // Catch:{ Exception -> 0x01dc }
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            boolean r7 = r0.containsKey(r7)     // Catch:{ Exception -> 0x01dc }
            if (r7 == 0) goto L_0x0145
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x01dc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0145
            java.lang.String r7 = r1.f17497d     // Catch:{ Exception -> 0x01dc }
            boolean r7 = r0.containsKey(r7)     // Catch:{ Exception -> 0x01dc }
            if (r7 == 0) goto L_0x0145
            java.lang.String r7 = r1.f17497d     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r0 = (java.lang.Integer) r0     // Catch:{ Exception -> 0x01dc }
            int r0 = r0.intValue()     // Catch:{ Exception -> 0x01dc }
            goto L_0x0146
        L_0x00e4:
            if (r7 == 0) goto L_0x0113
            java.util.Iterator r0 = r7.keys()     // Catch:{ Exception -> 0x01dc }
            r8 = 0
        L_0x00eb:
            boolean r9 = r0.hasNext()     // Catch:{ Exception -> 0x01dc }
            if (r9 == 0) goto L_0x0114
            java.lang.Object r9 = r0.next()     // Catch:{ Exception -> 0x01dc }
            java.lang.String r9 = (java.lang.String) r9     // Catch:{ Exception -> 0x01dc }
            org.json.JSONArray r9 = r7.getJSONArray(r9)     // Catch:{ Exception -> 0x01dc }
            r10 = 0
        L_0x00fc:
            int r11 = r9.length()     // Catch:{ Exception -> 0x01dc }
            if (r10 >= r11) goto L_0x00eb
            int r11 = r9.getInt(r10)     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r12 = java.lang.Integer.valueOf(r11)     // Catch:{ Exception -> 0x01dc }
            r6.add(r12)     // Catch:{ Exception -> 0x01dc }
            if (r11 <= r8) goto L_0x0110
            r8 = r11
        L_0x0110:
            int r10 = r10 + 1
            goto L_0x00fc
        L_0x0113:
            r8 = 0
        L_0x0114:
            java.util.HashMap r0 = l     // Catch:{ Exception -> 0x01dc }
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            boolean r7 = r0.containsKey(r7)     // Catch:{ Exception -> 0x01dc }
            if (r7 == 0) goto L_0x0145
            java.lang.String r7 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            java.lang.Object r0 = r0.get(r7)     // Catch:{ Exception -> 0x01dc }
            java.util.Map r0 = (java.util.Map) r0     // Catch:{ Exception -> 0x01dc }
            if (r0 == 0) goto L_0x0145
            java.util.Collection r0 = r0.values()     // Catch:{ Exception -> 0x01dc }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ Exception -> 0x01dc }
            r7 = 0
        L_0x0131:
            boolean r9 = r0.hasNext()     // Catch:{ Exception -> 0x01dc }
            if (r9 == 0) goto L_0x0143
            java.lang.Object r9 = r0.next()     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r9 = (java.lang.Integer) r9     // Catch:{ Exception -> 0x01dc }
            int r9 = r9.intValue()     // Catch:{ Exception -> 0x01dc }
            int r7 = r7 + r9
            goto L_0x0131
        L_0x0143:
            r0 = r7
            goto L_0x0146
        L_0x0145:
            r0 = 0
        L_0x0146:
            long r9 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01dc }
            r11 = 1000(0x3e8, double:4.94E-321)
            long r9 = r9 / r11
            r13 = 60
            long r9 = r9 / r13
            int r7 = r1.f17500g     // Catch:{ Exception -> 0x01dc }
            r15 = r3
            long r2 = (long) r7     // Catch:{ Exception -> 0x01dc }
            long r9 = r9 - r2
            java.util.Iterator r2 = r6.iterator()     // Catch:{ Exception -> 0x01dc }
            r3 = 0
        L_0x015a:
            boolean r6 = r2.hasNext()     // Catch:{ Exception -> 0x01dc }
            if (r6 == 0) goto L_0x0172
            java.lang.Object r6 = r2.next()     // Catch:{ Exception -> 0x01dc }
            java.lang.Integer r6 = (java.lang.Integer) r6     // Catch:{ Exception -> 0x01dc }
            int r6 = r6.intValue()     // Catch:{ Exception -> 0x01dc }
            long r6 = (long) r6     // Catch:{ Exception -> 0x01dc }
            int r16 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r16 < 0) goto L_0x015a
            int r3 = r3 + 1
            goto L_0x015a
        L_0x0172:
            int r2 = r1.f17499f     // Catch:{ Exception -> 0x01dc }
            if (r3 >= r2) goto L_0x0178
            r2 = 1
            goto L_0x0179
        L_0x0178:
            r2 = 0
        L_0x0179:
            int r6 = r1.f17501h     // Catch:{ Exception -> 0x01dc }
            if (r6 <= 0) goto L_0x0184
            if (r2 == 0) goto L_0x0183
            if (r0 >= r6) goto L_0x0183
            r2 = 1
            goto L_0x0184
        L_0x0183:
            r2 = 0
        L_0x0184:
            long r6 = java.lang.System.currentTimeMillis()     // Catch:{ Exception -> 0x01dc }
            long r6 = r6 / r11
            long r6 = r6 / r13
            int r9 = r1.i     // Catch:{ Exception -> 0x01dc }
            long r10 = (long) r9     // Catch:{ Exception -> 0x01dc }
            long r6 = r6 - r10
            if (r9 <= 0) goto L_0x019a
            if (r2 == 0) goto L_0x0199
            long r10 = (long) r8     // Catch:{ Exception -> 0x01dc }
            int r2 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
            if (r2 >= 0) goto L_0x0199
            r2 = 1
            goto L_0x019a
        L_0x0199:
            r2 = 0
        L_0x019a:
            if (r2 != 0) goto L_0x01db
            if (r9 <= 0) goto L_0x01b2
            long r8 = (long) r8     // Catch:{ Exception -> 0x01dc }
            int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r10 < 0) goto L_0x01b2
            java.lang.String r0 = "%s skipped: impression limit per interval was reached"
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r3 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            r6[r5] = r3     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ Exception -> 0x01dc }
        L_0x01b0:
            r3 = r15
            goto L_0x01d8
        L_0x01b2:
            int r6 = r1.f17501h     // Catch:{ Exception -> 0x01dc }
            if (r6 <= 0) goto L_0x01c6
            if (r0 < r6) goto L_0x01c6
            java.lang.String r0 = "%s skipped: impression limit per session was reached"
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r3 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            r6[r5] = r3     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ Exception -> 0x01dc }
            goto L_0x01b0
        L_0x01c6:
            int r0 = r1.f17499f     // Catch:{ Exception -> 0x01dc }
            if (r3 < r0) goto L_0x01db
            java.lang.String r0 = "%s skipped: impression limit was reached"
            r3 = 1
            java.lang.Object[] r6 = new java.lang.Object[r3]     // Catch:{ Exception -> 0x01dc }
            java.lang.String r3 = r1.f17496c     // Catch:{ Exception -> 0x01dc }
            r6[r5] = r3     // Catch:{ Exception -> 0x01dc }
            java.lang.String r0 = java.lang.String.format(r0, r6)     // Catch:{ Exception -> 0x01dc }
            goto L_0x01b0
        L_0x01d8:
            com.appodeal.ads.utils.Log.log((java.lang.String) r4, (java.lang.String) r3, (java.lang.String) r0)     // Catch:{ Exception -> 0x01dc }
        L_0x01db:
            return r2
        L_0x01dc:
            r0 = move-exception
            com.appodeal.ads.utils.Log.log(r0)
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.utils.campaign_frequency.b.a(android.content.Context):boolean");
    }

    public static void a() {
        try {
            JSONObject a2 = a(a.a());
            o oVar = a.f17491b;
            oVar.a(a2);
            oVar.f17408a.a(System.currentTimeMillis());
        } catch (Exception e2) {
            Log.log(e2);
        }
    }
}
