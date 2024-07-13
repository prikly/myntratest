package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.b.c;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.v;
import org.json.JSONObject;

public abstract class ab extends y {
    protected ab(String str, n nVar) {
        super(str, nVar);
    }

    /* access modifiers changed from: private */
    public void b(JSONObject jSONObject) {
        c c2 = c(jSONObject);
        if (c2 != null) {
            a(c2);
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Pending reward handled: " + c2);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:?, code lost:
        r4 = java.util.Collections.emptyMap();
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x0020 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.applovin.impl.sdk.b.c c(org.json.JSONObject r4) {
        /*
            r3 = this;
            org.json.JSONObject r0 = com.applovin.impl.sdk.utils.i.a((org.json.JSONObject) r4)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f15418b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.i.d(r0, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f15418b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.i.c(r4, r1)     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.n r1 = r3.f15418b     // Catch:{ JSONException -> 0x0032 }
            com.applovin.impl.sdk.utils.i.e(r4, r1)     // Catch:{ JSONException -> 0x0032 }
            java.lang.String r4 = "params"
            java.lang.Object r4 = r0.get(r4)     // Catch:{ all -> 0x0020 }
            org.json.JSONObject r4 = (org.json.JSONObject) r4     // Catch:{ all -> 0x0020 }
            java.util.Map r4 = com.applovin.impl.sdk.utils.JsonUtils.toStringMap(r4)     // Catch:{ all -> 0x0020 }
            goto L_0x0024
        L_0x0020:
            java.util.Map r4 = java.util.Collections.emptyMap()     // Catch:{ JSONException -> 0x0032 }
        L_0x0024:
            java.lang.String r1 = "result"
            java.lang.String r0 = r0.getString(r1)     // Catch:{ all -> 0x002b }
            goto L_0x002d
        L_0x002b:
            java.lang.String r0 = "network_timeout"
        L_0x002d:
            com.applovin.impl.sdk.b.c r4 = com.applovin.impl.sdk.b.c.a(r0, r4)     // Catch:{ JSONException -> 0x0032 }
            return r4
        L_0x0032:
            r4 = move-exception
            com.applovin.impl.sdk.v r0 = r3.f15420d
            boolean r0 = com.applovin.impl.sdk.v.a()
            if (r0 == 0) goto L_0x0044
            com.applovin.impl.sdk.v r0 = r3.f15420d
            java.lang.String r1 = r3.f15419c
            java.lang.String r2 = "Unable to parse API response"
            r0.b(r1, r2, r4)
        L_0x0044:
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.sdk.e.ab.c(org.json.JSONObject):com.applovin.impl.sdk.b.c");
    }

    /* access modifiers changed from: protected */
    public abstract void a(c cVar);

    /* access modifiers changed from: protected */
    public abstract boolean b();

    /* access modifiers changed from: protected */
    public int h() {
        return ((Integer) this.f15418b.a(b.bB)).intValue();
    }

    public void run() {
        a(i(), new b.c<JSONObject>() {
            public void a(int i, String str, JSONObject jSONObject) {
                if (ab.this.b()) {
                    v vVar = ab.this.f15420d;
                    if (v.a()) {
                        v vVar2 = ab.this.f15420d;
                        String str2 = ab.this.f15419c;
                        vVar2.e(str2, "Reward validation failed with error code " + i + " but task was cancelled already");
                        return;
                    }
                    return;
                }
                v vVar3 = ab.this.f15420d;
                if (v.a()) {
                    v vVar4 = ab.this.f15420d;
                    String str3 = ab.this.f15419c;
                    vVar4.e(str3, "Reward validation failed with code " + i + " and error: " + str);
                }
                ab.this.a(i);
            }

            public void a(JSONObject jSONObject, int i) {
                if (ab.this.b()) {
                    v vVar = ab.this.f15420d;
                    if (v.a()) {
                        v vVar2 = ab.this.f15420d;
                        String str = ab.this.f15419c;
                        vVar2.e(str, "Reward validation succeeded with code " + i + " but task was cancelled already");
                    }
                    v vVar3 = ab.this.f15420d;
                    if (v.a()) {
                        v vVar4 = ab.this.f15420d;
                        String str2 = ab.this.f15419c;
                        vVar4.e(str2, "Response: " + jSONObject);
                        return;
                    }
                    return;
                }
                v vVar5 = ab.this.f15420d;
                if (v.a()) {
                    v vVar6 = ab.this.f15420d;
                    String str3 = ab.this.f15419c;
                    vVar6.b(str3, "Reward validation succeeded with code " + i + " and response: " + jSONObject);
                }
                ab.this.b(jSONObject);
            }
        });
    }
}
