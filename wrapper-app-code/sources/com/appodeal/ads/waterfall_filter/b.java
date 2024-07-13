package com.appodeal.ads.waterfall_filter;

import android.text.TextUtils;
import com.appodeal.ads.r;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

public final class b extends e {

    /* renamed from: a  reason: collision with root package name */
    public final HashMap f17630a = new HashMap();

    /* renamed from: b  reason: collision with root package name */
    public final HashMap f17631b = new HashMap();

    /* renamed from: c  reason: collision with root package name */
    public final HashMap f17632c = new HashMap();

    /* renamed from: d  reason: collision with root package name */
    public final HashMap f17633d = new HashMap();

    public b(JSONArray jSONArray) {
        if (jSONArray != null && jSONArray.length() > 0) {
            for (int i = 0; i < jSONArray.length(); i++) {
                JSONObject optJSONObject = jSONArray.optJSONObject(i);
                if (optJSONObject != null && optJSONObject.has("name") && optJSONObject.has("max_requests") && optJSONObject.has("max_requests_pf") && optJSONObject.has("max_nofills")) {
                    String optString = optJSONObject.optString("name");
                    if (!TextUtils.isEmpty(optString)) {
                        this.f17630a.put(optString, Integer.valueOf(optJSONObject.optInt("max_requests", Integer.MAX_VALUE)));
                        this.f17631b.put(optString, Integer.valueOf(optJSONObject.optInt("max_requests_pf", Integer.MAX_VALUE)));
                        this.f17632c.put(optString, Integer.valueOf(optJSONObject.optInt("max_nofills", Integer.MAX_VALUE)));
                    }
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x005a, code lost:
        r6 = (java.lang.Integer) r8.f17633d.get(r4);
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void a(java.util.concurrent.CopyOnWriteArrayList r9) {
        /*
            r8 = this;
            org.json.JSONArray r0 = new org.json.JSONArray
            r0.<init>()
            r1 = 0
            r2 = 0
        L_0x0007:
            int r3 = r9.size()
            if (r2 >= r3) goto L_0x001f
            java.lang.Object r3 = r9.get(r2)
            com.appodeal.ads.l r3 = (com.appodeal.ads.l) r3
            com.appodeal.ads.f5 r3 = r3.f16570c
            java.lang.String r3 = r3.getId()
            r0.put(r3)
            int r2 = r2 + 1
            goto L_0x0007
        L_0x001f:
            int r2 = r0.length()
            r3 = 0
        L_0x0024:
            int r4 = r9.size()
            r5 = 1
            if (r3 >= r4) goto L_0x0040
            java.lang.Object r4 = r9.get(r3)
            com.appodeal.ads.l r4 = (com.appodeal.ads.l) r4
            com.appodeal.ads.f5 r4 = r4.f16570c
            com.appodeal.ads.e0 r4 = r4.getRequestResult()
            com.appodeal.ads.e0 r6 = com.appodeal.ads.e0.Successful
            if (r4 != r6) goto L_0x003d
            r9 = 1
            goto L_0x0041
        L_0x003d:
            int r3 = r3 + 1
            goto L_0x0024
        L_0x0040:
            r9 = 0
        L_0x0041:
            if (r9 == 0) goto L_0x0045
            int r2 = r2 + -1
        L_0x0045:
            r3 = 0
        L_0x0046:
            if (r3 >= r2) goto L_0x0077
            java.lang.String r4 = r0.optString(r3)
            boolean r6 = android.text.TextUtils.isEmpty(r4)
            if (r6 != 0) goto L_0x0074
            java.util.HashMap r6 = r8.f17633d
            boolean r6 = r6.containsKey(r4)
            if (r6 == 0) goto L_0x0069
            java.util.HashMap r6 = r8.f17633d
            java.lang.Object r6 = r6.get(r4)
            java.lang.Integer r6 = (java.lang.Integer) r6
            if (r6 == 0) goto L_0x0069
            int r6 = r6.intValue()
            goto L_0x006a
        L_0x0069:
            r6 = 0
        L_0x006a:
            int r6 = r6 + r5
            java.util.HashMap r7 = r8.f17633d
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            r7.put(r4, r6)
        L_0x0074:
            int r3 = r3 + 1
            goto L_0x0046
        L_0x0077:
            if (r9 == 0) goto L_0x008d
            int r9 = r0.length()
            int r9 = r9 - r5
            java.lang.String r9 = r0.optString(r9)
            boolean r0 = android.text.TextUtils.isEmpty(r9)
            if (r0 != 0) goto L_0x008d
            java.util.HashMap r0 = r8.f17633d
            r0.remove(r9)
        L_0x008d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.appodeal.ads.waterfall_filter.b.a(java.util.concurrent.CopyOnWriteArrayList):void");
    }

    public final void a(ArrayList arrayList, r rVar) {
        List list;
        if (rVar != null) {
            a(rVar.f17079c);
            a(rVar.f17080d);
        }
        com.appodeal.ads.utils.campaign_frequency.b.a(arrayList);
        if (!this.f17633d.isEmpty()) {
            HashMap hashMap = new HashMap();
            HashMap hashMap2 = new HashMap();
            HashMap hashMap3 = new HashMap();
            HashMap hashMap4 = new HashMap();
            for (Map.Entry entry : this.f17632c.entrySet()) {
                hashMap.put((String) entry.getKey(), 0);
                hashMap2.put((String) entry.getKey(), 0);
                hashMap3.put((String) entry.getKey(), new ArrayList());
                hashMap4.put((String) entry.getKey(), new ArrayList());
            }
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                JSONObject jSONObject = (JSONObject) it.next();
                String optString = jSONObject.optString("status");
                String optString2 = jSONObject.optString(OSOutcomeConstants.OUTCOME_ID);
                boolean optBoolean = jSONObject.optBoolean("cap", false);
                if (!TextUtils.isEmpty(optString) && !TextUtils.isEmpty(optString2) && this.f17632c.containsKey(optString)) {
                    Integer num = (Integer) this.f17632c.get(optString);
                    int intValue = num != null ? num.intValue() : 0;
                    Integer num2 = (Integer) this.f17633d.get(optString2);
                    if ((num2 != null ? num2.intValue() : 0) >= intValue) {
                        if (optBoolean) {
                            List list2 = (List) hashMap3.get(optString);
                            list2.add(optString2);
                            hashMap3.put(optString, list2);
                        } else {
                            List list3 = (List) hashMap4.get(optString);
                            list3.add(optString2);
                            hashMap4.put(optString, list3);
                        }
                    } else if (optBoolean) {
                        Integer num3 = (Integer) hashMap.get(optString);
                        hashMap.put(optString, Integer.valueOf((num3 != null ? num3.intValue() : 0) + 1));
                    } else {
                        Integer num4 = (Integer) hashMap2.get(optString);
                        hashMap2.put(optString, Integer.valueOf((num4 != null ? num4.intValue() : 0) + 1));
                    }
                }
            }
            for (Map.Entry entry2 : hashMap.entrySet()) {
                if (((Integer) entry2.getValue()).intValue() == 0 && (list = (List) hashMap3.get(entry2.getKey())) != null && !list.isEmpty()) {
                    this.f17633d.keySet().removeAll(list);
                }
            }
        }
        Iterator it2 = arrayList.iterator();
        HashMap hashMap5 = new HashMap(this.f17630a);
        HashMap hashMap6 = new HashMap(this.f17631b);
        while (it2.hasNext()) {
            JSONObject jSONObject2 = (JSONObject) it2.next();
            String optString3 = jSONObject2.optString("status");
            String optString4 = jSONObject2.optString(OSOutcomeConstants.OUTCOME_ID);
            boolean optBoolean2 = jSONObject2.optBoolean("cap", false);
            if (!TextUtils.isEmpty(optString3) && !TextUtils.isEmpty(optString4) && this.f17632c.containsKey(optString3)) {
                Integer num5 = (Integer) this.f17632c.get(optString3);
                int intValue2 = num5 != null ? num5.intValue() : 0;
                Integer num6 = (Integer) this.f17633d.get(optString4);
                int intValue3 = num6 != null ? num6.intValue() : 0;
                if (!optBoolean2 || intValue3 < intValue2) {
                    if (optBoolean2 && hashMap6.containsKey(optString3)) {
                        Integer num7 = (Integer) hashMap6.get(optString3);
                        int intValue4 = num7 != null ? num7.intValue() : 0;
                        if (intValue4 > 0) {
                            hashMap6.put(optString3, Integer.valueOf(intValue4 - 1));
                        }
                    } else if (!optBoolean2 && hashMap5.containsKey(optString3)) {
                        Integer num8 = (Integer) hashMap5.get(optString3);
                        int intValue5 = num8 != null ? num8.intValue() : 0;
                        if (intValue5 > 0) {
                            hashMap5.put(optString3, Integer.valueOf(intValue5 - 1));
                        }
                    }
                }
                it2.remove();
            }
        }
    }
}
