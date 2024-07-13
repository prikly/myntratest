package com.applovin.impl.sdk.network;

import com.applovin.impl.sdk.e.u;
import com.applovin.impl.sdk.n;
import org.json.JSONObject;

public class a extends com.applovin.impl.sdk.e.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final String f15635a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final c<JSONObject> f15636e;

    public a(String str, c<JSONObject> cVar, n nVar) {
        super("CommunicatorRequestTask:" + str, nVar);
        this.f15635a = str;
        this.f15636e = cVar;
    }

    public void run() {
        this.f15418b.V().a((com.applovin.impl.sdk.e.a) new u<JSONObject>(this.f15636e, this.f15418b, g()) {
            public void a(int i, String str, JSONObject jSONObject) {
                this.f15418b.aj().a(a.this.f15635a, a.this.f15636e.a(), i, jSONObject, str, false);
            }

            public void a(JSONObject jSONObject, int i) {
                this.f15418b.aj().a(a.this.f15635a, a.this.f15636e.a(), i, jSONObject, (String) null, true);
            }
        });
    }
}
