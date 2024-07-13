package com.bytedance.sdk.component.e.c;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.sdk.component.e.d.b;
import com.bytedance.sdk.component.e.d.c;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: TNCConfigHandler */
public class d {

    /* renamed from: d  reason: collision with root package name */
    private static final Object f19166d = new Object();

    /* renamed from: a  reason: collision with root package name */
    private Context f19167a;

    /* renamed from: b  reason: collision with root package name */
    private c f19168b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f19169c = true;

    /* renamed from: e  reason: collision with root package name */
    private int f19170e;

    public d(Context context, boolean z, int i) {
        this.f19167a = context;
        this.f19169c = z;
        this.f19170e = i;
        this.f19168b = new c();
    }

    private c b(JSONObject jSONObject) {
        try {
            c cVar = new c();
            boolean z = true;
            if (jSONObject.has("local_enable")) {
                cVar.f19158a = jSONObject.getInt("local_enable") != 0;
            }
            if (jSONObject.has("probe_enable")) {
                if (jSONObject.getInt("probe_enable") == 0) {
                    z = false;
                }
                cVar.f19159b = z;
            }
            if (jSONObject.has("local_host_filter")) {
                JSONArray jSONArray = jSONObject.getJSONArray("local_host_filter");
                HashMap hashMap = new HashMap();
                if (jSONArray.length() > 0) {
                    for (int i = 0; i < jSONArray.length(); i++) {
                        String string = jSONArray.getString(i);
                        if (!TextUtils.isEmpty(string)) {
                            hashMap.put(string, 0);
                        }
                    }
                }
                cVar.f19160c = hashMap;
            } else {
                cVar.f19160c = null;
            }
            if (jSONObject.has("host_replace_map")) {
                JSONObject jSONObject2 = jSONObject.getJSONObject("host_replace_map");
                HashMap hashMap2 = new HashMap();
                if (jSONObject2.length() > 0) {
                    Iterator<String> keys = jSONObject2.keys();
                    while (keys.hasNext()) {
                        String next = keys.next();
                        String string2 = jSONObject2.getString(next);
                        if (!TextUtils.isEmpty(next)) {
                            if (!TextUtils.isEmpty(string2)) {
                                hashMap2.put(next, string2);
                            }
                        }
                    }
                }
                cVar.f19161d = hashMap2;
            } else {
                cVar.f19161d = null;
            }
            cVar.f19162e = jSONObject.optInt("req_to_cnt", cVar.f19162e);
            cVar.f19163f = jSONObject.optInt("req_to_api_cnt", cVar.f19163f);
            cVar.f19164g = jSONObject.optInt("req_to_ip_cnt", cVar.f19164g);
            cVar.f19165h = jSONObject.optInt("req_err_cnt", cVar.f19165h);
            cVar.i = jSONObject.optInt("req_err_api_cnt", cVar.i);
            cVar.j = jSONObject.optInt("req_err_ip_cnt", cVar.j);
            cVar.k = jSONObject.optInt("update_interval", cVar.k);
            cVar.l = jSONObject.optInt("update_random_range", cVar.l);
            cVar.m = jSONObject.optString("http_code_black", cVar.m);
            return cVar;
        } catch (Throwable th) {
            th.printStackTrace();
            return null;
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0026, code lost:
        r0 = 'I';
        r1 = '`';
     */
    /* JADX WARNING: Code restructure failed: missing block: B:3:0x000b, code lost:
        switch(r1) {
            case 55: goto L_0x0026;
            case 56: goto L_0x0026;
            case 57: goto L_0x000f;
            default: goto L_0x000e;
        };
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static java.lang.String d1657027613220dc(java.lang.String r2) {
        /*
        L_0x0000:
            r0 = 74
            r1 = 55
        L_0x0004:
            switch(r0) {
                case 72: goto L_0x0000;
                case 73: goto L_0x0008;
                case 74: goto L_0x000b;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x002b
        L_0x0008:
            switch(r1) {
                case 94: goto L_0x0026;
                case 95: goto L_0x000f;
                case 96: goto L_0x000f;
                default: goto L_0x000b;
            }
        L_0x000b:
            switch(r1) {
                case 55: goto L_0x0026;
                case 56: goto L_0x0026;
                case 57: goto L_0x000f;
                default: goto L_0x000e;
            }
        L_0x000e:
            goto L_0x0026
        L_0x000f:
            char[] r2 = r2.toCharArray()
            r0 = 0
        L_0x0014:
            int r1 = r2.length
            if (r0 >= r1) goto L_0x0020
            char r1 = r2[r0]
            r1 = r1 ^ r0
            char r1 = (char) r1
            r2[r0] = r1
            int r0 = r0 + 1
            goto L_0x0014
        L_0x0020:
            java.lang.String r0 = new java.lang.String
            r0.<init>(r2)
            return r0
        L_0x0026:
            r0 = 73
            r1 = 96
            goto L_0x0004
        L_0x002b:
            r0 = 72
            goto L_0x0004
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.d.d1657027613220dc(java.lang.String):java.lang.String");
    }

    public void a() {
        if (this.f19169c) {
            String string = this.f19167a.getSharedPreferences(g.a().a(this.f19170e).a(), 0).getString("tnc_config_str", (String) null);
            if (TextUtils.isEmpty(string)) {
                b.b("TNCConfigHandler", "loadLocalConfig: no existed");
                return;
            }
            try {
                c b2 = b(new JSONObject(string));
                if (b2 != null) {
                    this.f19168b = b2;
                }
                StringBuilder sb = new StringBuilder();
                sb.append("loadLocalConfig: ");
                sb.append(b2 == null ? "null" : b2.toString());
                b.b("TNCConfigHandler", sb.toString());
            } catch (Throwable th) {
                th.printStackTrace();
                b.b("TNCConfigHandler", "loadLocalConfig: except: " + th.getMessage());
            }
        }
    }

    /* JADX WARNING: No exception handlers in catch block: Catch:{  } */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(org.json.JSONObject r11) {
        /*
            r10 = this;
            boolean r0 = r10.f19169c
            if (r0 != 0) goto L_0x000c
            java.lang.String r11 = "TNCConfigHandler"
            java.lang.String r0 = "handleConfigChanged: no mainProc"
            com.bytedance.sdk.component.e.d.b.b(r11, r0)
            return
        L_0x000c:
            com.bytedance.sdk.component.e.c.g r0 = com.bytedance.sdk.component.e.c.g.a()
            int r1 = r10.f19170e
            com.bytedance.sdk.component.e.c.e r0 = r0.a(r1)
            r0.e()
            java.lang.String r0 = ""
            r1 = 1
            r2 = 0
            java.lang.String r3 = "ttnet_url_dispatcher_enabled"
            int r3 = r11.optInt(r3, r2)     // Catch:{ all -> 0x015d }
            if (r3 <= 0) goto L_0x0027
            r3 = 1
            goto L_0x0028
        L_0x0027:
            r3 = 0
        L_0x0028:
            java.lang.String r4 = "ttnet_dispatch_actions"
            org.json.JSONArray r4 = r11.optJSONArray(r4)     // Catch:{ all -> 0x015d }
            r5 = 0
            com.bytedance.sdk.component.e.c.g r6 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ all -> 0x015d }
            int r7 = r10.f19170e     // Catch:{ all -> 0x015d }
            com.bytedance.sdk.component.e.c.e r6 = r6.a(r7)     // Catch:{ all -> 0x015d }
            boolean r6 = r6.c()     // Catch:{ all -> 0x015d }
            if (r6 == 0) goto L_0x00aa
            if (r3 == 0) goto L_0x00aa
            if (r4 == 0) goto L_0x00aa
            java.util.ArrayList r3 = new java.util.ArrayList     // Catch:{ all -> 0x015d }
            r3.<init>()     // Catch:{ all -> 0x015d }
            r6 = 0
        L_0x0049:
            int r7 = r4.length()     // Catch:{ all -> 0x015d }
            if (r6 >= r7) goto L_0x0077
            java.lang.Object r7 = r4.get(r6)     // Catch:{ all -> 0x015d }
            org.json.JSONObject r7 = (org.json.JSONObject) r7     // Catch:{ all -> 0x015d }
            java.lang.String r8 = "param"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ all -> 0x015d }
            java.lang.String r8 = "service_name"
            java.lang.String r9 = ""
            java.lang.String r8 = r7.optString(r8, r9)     // Catch:{ all -> 0x015d }
            java.lang.String r9 = "idc_selection"
            boolean r8 = r8.equals(r9)     // Catch:{ all -> 0x015d }
            if (r8 == 0) goto L_0x0074
            java.lang.String r8 = "strategy_info"
            org.json.JSONObject r7 = r7.getJSONObject(r8)     // Catch:{ all -> 0x015d }
            r3.add(r7)     // Catch:{ all -> 0x015d }
        L_0x0074:
            int r6 = r6 + 1
            goto L_0x0049
        L_0x0077:
            boolean r4 = r3.isEmpty()     // Catch:{ all -> 0x015d }
            if (r4 != 0) goto L_0x00aa
            org.json.JSONObject r5 = new org.json.JSONObject     // Catch:{ all -> 0x015d }
            r5.<init>()     // Catch:{ all -> 0x015d }
            java.util.Iterator r3 = r3.iterator()     // Catch:{ all -> 0x015d }
        L_0x0086:
            boolean r4 = r3.hasNext()     // Catch:{ all -> 0x015d }
            if (r4 == 0) goto L_0x00aa
            java.lang.Object r4 = r3.next()     // Catch:{ all -> 0x015d }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ all -> 0x015d }
            java.util.Iterator r6 = r4.keys()     // Catch:{ all -> 0x015d }
        L_0x0096:
            boolean r7 = r6.hasNext()     // Catch:{ all -> 0x015d }
            if (r7 == 0) goto L_0x0086
            java.lang.Object r7 = r6.next()     // Catch:{ all -> 0x015d }
            java.lang.String r7 = (java.lang.String) r7     // Catch:{ all -> 0x015d }
            java.lang.String r8 = r4.getString(r7)     // Catch:{ all -> 0x015d }
            r5.put(r7, r8)     // Catch:{ all -> 0x015d }
            goto L_0x0096
        L_0x00aa:
            java.lang.String r3 = "tnc_config"
            org.json.JSONObject r11 = r11.optJSONObject(r3)     // Catch:{ all -> 0x015d }
            if (r11 != 0) goto L_0x00bc
            if (r5 != 0) goto L_0x00bc
            java.lang.String r3 = "TNCConfigHandler"
            java.lang.String r4 = " tnc host_replace_map config is null"
            com.bytedance.sdk.component.e.d.b.a(r3, r4)     // Catch:{ all -> 0x015d }
            goto L_0x00ce
        L_0x00bc:
            if (r11 != 0) goto L_0x00c9
            org.json.JSONObject r11 = new org.json.JSONObject     // Catch:{ all -> 0x015d }
            r11.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r3 = "host_replace_map"
        L_0x00c5:
            r11.put(r3, r5)     // Catch:{ all -> 0x015d }
            goto L_0x00ce
        L_0x00c9:
            if (r5 == 0) goto L_0x00ce
            java.lang.String r3 = "host_replace_map"
            goto L_0x00c5
        L_0x00ce:
            com.bytedance.sdk.component.e.c.c r3 = r10.b(r11)     // Catch:{ all -> 0x015d }
            java.lang.StringBuilder r4 = new java.lang.StringBuilder     // Catch:{ all -> 0x015d }
            r4.<init>()     // Catch:{ all -> 0x015d }
            java.lang.String r5 = "handleConfigChanged, newConfig: "
            r4.append(r5)     // Catch:{ all -> 0x015d }
            if (r3 != 0) goto L_0x00e1
            java.lang.String r5 = "null"
            goto L_0x00e5
        L_0x00e1:
            java.lang.String r5 = r3.toString()     // Catch:{ all -> 0x015d }
        L_0x00e5:
            java.lang.String r6 = "TNCConfigHandler"
            r4.append(r5)     // Catch:{ all -> 0x015d }
            java.lang.String r4 = r4.toString()     // Catch:{ all -> 0x015d }
            com.bytedance.sdk.component.e.d.b.b(r6, r4)     // Catch:{ all -> 0x015d }
            if (r3 != 0) goto L_0x0127
            java.lang.Object r4 = f19166d
            monitor-enter(r4)
            android.content.Context r11 = r10.f19167a     // Catch:{ all -> 0x0124 }
            com.bytedance.sdk.component.e.c.g r0 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ all -> 0x0124 }
            int r3 = r10.f19170e     // Catch:{ all -> 0x0124 }
            com.bytedance.sdk.component.e.c.e r0 = r0.a(r3)     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = r0.a()     // Catch:{ all -> 0x0124 }
            android.content.SharedPreferences r11 = r11.getSharedPreferences(r0, r2)     // Catch:{ all -> 0x0124 }
            android.content.SharedPreferences$Editor r11 = r11.edit()     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = "tnc_config_str"
            java.lang.String r2 = ""
            android.content.SharedPreferences$Editor r11 = r11.putString(r0, r2)     // Catch:{ all -> 0x0124 }
            r11.apply()     // Catch:{ all -> 0x0124 }
            android.content.Context r11 = r10.f19167a     // Catch:{ all -> 0x0124 }
            java.lang.String r0 = ""
            int r2 = r10.f19170e     // Catch:{ all -> 0x0124 }
            com.bytedance.sdk.component.e.d.c.a(r11, r1, r0, r2)     // Catch:{ all -> 0x0124 }
            monitor-exit(r4)     // Catch:{ all -> 0x0124 }
            return
        L_0x0124:
            r11 = move-exception
            monitor-exit(r4)     // Catch:{ all -> 0x0124 }
            throw r11
        L_0x0127:
            r10.f19168b = r3     // Catch:{ all -> 0x015d }
            java.lang.String r11 = r11.toString()     // Catch:{ all -> 0x015d }
            java.lang.Object r3 = f19166d
            monitor-enter(r3)
            android.content.Context r0 = r10.f19167a     // Catch:{ all -> 0x015a }
            com.bytedance.sdk.component.e.c.g r4 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ all -> 0x015a }
            int r5 = r10.f19170e     // Catch:{ all -> 0x015a }
            com.bytedance.sdk.component.e.c.e r4 = r4.a(r5)     // Catch:{ all -> 0x015a }
            java.lang.String r4 = r4.a()     // Catch:{ all -> 0x015a }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r4, r2)     // Catch:{ all -> 0x015a }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x015a }
            java.lang.String r2 = "tnc_config_str"
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r11)     // Catch:{ all -> 0x015a }
            r0.apply()     // Catch:{ all -> 0x015a }
            android.content.Context r0 = r10.f19167a     // Catch:{ all -> 0x015a }
            int r2 = r10.f19170e     // Catch:{ all -> 0x015a }
            com.bytedance.sdk.component.e.d.c.a(r0, r1, r11, r2)     // Catch:{ all -> 0x015a }
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            goto L_0x0198
        L_0x015a:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x015a }
            throw r11
        L_0x015d:
            r11 = move-exception
            r11.printStackTrace()     // Catch:{ all -> 0x019c }
            com.bytedance.sdk.component.e.c.c r11 = new com.bytedance.sdk.component.e.c.c     // Catch:{ all -> 0x019c }
            r11.<init>()     // Catch:{ all -> 0x019c }
            r10.f19168b = r11     // Catch:{ all -> 0x019c }
            java.lang.Object r11 = f19166d
            monitor-enter(r11)
            android.content.Context r0 = r10.f19167a     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.e.c.g r3 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ all -> 0x0199 }
            int r4 = r10.f19170e     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.e.c.e r3 = r3.a(r4)     // Catch:{ all -> 0x0199 }
            java.lang.String r3 = r3.a()     // Catch:{ all -> 0x0199 }
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r3, r2)     // Catch:{ all -> 0x0199 }
            android.content.SharedPreferences$Editor r0 = r0.edit()     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = "tnc_config_str"
            java.lang.String r3 = ""
            android.content.SharedPreferences$Editor r0 = r0.putString(r2, r3)     // Catch:{ all -> 0x0199 }
            r0.apply()     // Catch:{ all -> 0x0199 }
            android.content.Context r0 = r10.f19167a     // Catch:{ all -> 0x0199 }
            java.lang.String r2 = ""
            int r3 = r10.f19170e     // Catch:{ all -> 0x0199 }
            com.bytedance.sdk.component.e.d.c.a(r0, r1, r2, r3)     // Catch:{ all -> 0x0199 }
            monitor-exit(r11)     // Catch:{ all -> 0x0199 }
        L_0x0198:
            return
        L_0x0199:
            r0 = move-exception
            monitor-exit(r11)     // Catch:{ all -> 0x0199 }
            throw r0
        L_0x019c:
            r11 = move-exception
            java.lang.Object r3 = f19166d
            monitor-enter(r3)
            android.content.Context r4 = r10.f19167a     // Catch:{ all -> 0x01ca }
            com.bytedance.sdk.component.e.c.g r5 = com.bytedance.sdk.component.e.c.g.a()     // Catch:{ all -> 0x01ca }
            int r6 = r10.f19170e     // Catch:{ all -> 0x01ca }
            com.bytedance.sdk.component.e.c.e r5 = r5.a(r6)     // Catch:{ all -> 0x01ca }
            java.lang.String r5 = r5.a()     // Catch:{ all -> 0x01ca }
            android.content.SharedPreferences r2 = r4.getSharedPreferences(r5, r2)     // Catch:{ all -> 0x01ca }
            android.content.SharedPreferences$Editor r2 = r2.edit()     // Catch:{ all -> 0x01ca }
            java.lang.String r4 = "tnc_config_str"
            android.content.SharedPreferences$Editor r2 = r2.putString(r4, r0)     // Catch:{ all -> 0x01ca }
            r2.apply()     // Catch:{ all -> 0x01ca }
            android.content.Context r2 = r10.f19167a     // Catch:{ all -> 0x01ca }
            int r4 = r10.f19170e     // Catch:{ all -> 0x01ca }
            com.bytedance.sdk.component.e.d.c.a(r2, r1, r0, r4)     // Catch:{ all -> 0x01ca }
            monitor-exit(r3)     // Catch:{ all -> 0x01ca }
            throw r11
        L_0x01ca:
            r11 = move-exception
            monitor-exit(r3)     // Catch:{ all -> 0x01ca }
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.component.e.c.d.a(org.json.JSONObject):void");
    }

    public void b() {
        try {
            String a2 = c.a(this.f19167a, 1, this.f19170e);
            if (TextUtils.isEmpty(a2)) {
                b.b("TNCConfigHandler", "loadLocalConfigForOtherProcess, data empty");
                return;
            }
            c b2 = b(new JSONObject(a2));
            StringBuilder sb = new StringBuilder();
            sb.append("loadLocalConfigForOtherProcess, config: ");
            sb.append(b2 == null ? "null" : b2.toString());
            b.b("TNCConfigHandler", sb.toString());
            if (b2 != null) {
                this.f19168b = b2;
            }
        } catch (Throwable th) {
            b.b("TNCConfigHandler", "loadLocalConfigForOtherProcess, except: " + th.getMessage());
        }
    }

    public c c() {
        return this.f19168b;
    }
}
