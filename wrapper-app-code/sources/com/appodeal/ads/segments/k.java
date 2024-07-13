package com.appodeal.ads.segments;

import com.appnext.core.a.b;
import com.appodeal.ads.modules.common.internal.adtype.AdType;
import com.appodeal.ads.segments.k;
import com.appodeal.ads.utils.Log;
import com.onesignal.outcomes.OSOutcomeConstants;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONObject;

public final class k {

    /* renamed from: a  reason: collision with root package name */
    public final long f17272a;

    /* renamed from: b  reason: collision with root package name */
    public final a f17273b;

    /* renamed from: c  reason: collision with root package name */
    public final int f17274c;

    /* renamed from: d  reason: collision with root package name */
    public final i[] f17275d;

    /* renamed from: e  reason: collision with root package name */
    public final JSONArray f17276e;

    public k(JSONObject jSONObject) {
        this.f17272a = (long) jSONObject.optInt(OSOutcomeConstants.OUTCOME_ID, -1);
        this.f17273b = new a(jSONObject);
        this.f17275d = j.a(jSONObject);
        this.f17274c = a.a(jSONObject.optString("match_rule", ""));
        this.f17276e = jSONObject.optJSONArray("placements");
    }

    public final void a() {
        TreeMap<String, g> treeMap = h.f17256a;
        if (this.f17276e == null) {
            treeMap.clear();
            return;
        }
        TreeMap treeMap2 = new TreeMap();
        for (int i = 0; i < this.f17276e.length(); i++) {
            g a2 = g.a(this.f17276e.getJSONObject(i));
            if (a2 != null) {
                g gVar = h.f17256a.get(a2.f17249b);
                a2.f17253f = gVar != null ? gVar.f17253f : 0;
                treeMap2.put(a2.f17249b, a2);
            }
        }
        treeMap.clear();
        treeMap.putAll(treeMap2);
    }

    public final long b() {
        return this.f17272a;
    }

    public final a c() {
        return this.f17273b;
    }

    public static class a {

        /* renamed from: a  reason: collision with root package name */
        public final JSONObject f17277a;

        public a(JSONObject jSONObject) {
            JSONObject optJSONObject = jSONObject.optJSONObject(b.hW);
            this.f17277a = optJSONObject == null ? new JSONObject() : optJSONObject;
        }

        public static /* synthetic */ int a(Set set, JSONObject jSONObject, JSONObject jSONObject2) {
            if (!set.contains(jSONObject.optString("status")) && !set.contains(jSONObject2.optString("status"))) {
                return 0;
            }
            double optDouble = jSONObject2.optDouble("ecpm") - jSONObject.optDouble("ecpm");
            if (optDouble == 0.0d) {
                return 0;
            }
            return optDouble < 0.0d ? -1 : 1;
        }

        public static void a(ArrayList arrayList, HashSet hashSet) {
            if (!hashSet.isEmpty()) {
                Collections.sort(arrayList, new Comparator(hashSet) {
                    public final /* synthetic */ Set f$0;

                    {
                        this.f$0 = r1;
                    }

                    public final int compare(Object obj, Object obj2) {
                        return k.a.a(this.f$0, (JSONObject) obj, (JSONObject) obj2);
                    }
                });
            }
        }

        public static void a(ArrayList arrayList, HashSet hashSet, JSONObject jSONObject) {
            boolean z;
            if (!hashSet.isEmpty()) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    JSONObject jSONObject2 = (JSONObject) it.next();
                    String optString = jSONObject2.optString("status", (String) null);
                    String optString2 = jSONObject2.optString("name", (String) null);
                    if (optString2 != null && !optString2.isEmpty()) {
                        optString = optString2;
                    }
                    if (optString != null && !optString.isEmpty() && hashSet.contains(optString)) {
                        if (!jSONObject2.has("cap")) {
                            String optString3 = jSONObject2.optString(OSOutcomeConstants.OUTCOME_ID);
                            String optString4 = jSONObject2.optString("status");
                            String optString5 = jSONObject2.optString("name", (String) null);
                            if (optString5 != null && !optString5.isEmpty()) {
                                optString4 = optString5;
                            }
                            Iterator it2 = arrayList.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    z = false;
                                    break;
                                }
                                JSONObject jSONObject3 = (JSONObject) it2.next();
                                String optString6 = jSONObject3.optString(OSOutcomeConstants.OUTCOME_ID);
                                if (optString6 == null || !optString6.equals(optString3)) {
                                    String optString7 = jSONObject3.optString("status");
                                    String optString8 = jSONObject3.optString("name", (String) null);
                                    if (optString8 != null && !optString8.isEmpty()) {
                                        optString7 = optString8;
                                    }
                                    if (optString7 != null && optString7.equals(optString4)) {
                                        z = true;
                                        break;
                                    }
                                }
                            }
                            if (z) {
                            }
                        } else if (jSONObject2.getBoolean("cap")) {
                            it.remove();
                        }
                        jSONObject2.put("ecpm", jSONObject.getDouble(optString));
                    }
                }
            }
        }

        public final boolean a(AdType adType) {
            JSONArray optJSONArray = this.f17277a.optJSONArray("disable_type");
            if (optJSONArray == null) {
                return false;
            }
            return optJSONArray.toString().contains(String.format("\"%s\"", new Object[]{m.a(adType)}));
        }

        public final void a(ArrayList arrayList, AdType adType) {
            try {
                JSONObject optJSONObject = this.f17277a.optJSONObject("disable_networks");
                JSONArray optJSONArray = optJSONObject != null ? optJSONObject.optJSONArray(m.a(adType)) : null;
                if (optJSONArray == null) {
                    optJSONArray = new JSONArray();
                }
                if (optJSONArray.length() != 0) {
                    HashSet hashSet = new HashSet(optJSONArray.length());
                    for (int i = 0; i < optJSONArray.length(); i++) {
                        hashSet.add(optJSONArray.getString(i));
                    }
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        JSONObject jSONObject = (JSONObject) it.next();
                        String optString = jSONObject.optString("status", (String) null);
                        String optString2 = jSONObject.optString("name", (String) null);
                        if ((optString != null && !optString.isEmpty() && hashSet.contains(optString)) || (optString2 != null && !optString2.isEmpty() && hashSet.contains(optString2))) {
                            it.remove();
                        }
                    }
                }
            } catch (Exception e2) {
                Log.log(e2);
            }
        }
    }
}
