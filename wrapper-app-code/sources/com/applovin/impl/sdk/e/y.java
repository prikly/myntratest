package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.i;
import org.json.JSONObject;

public abstract class y extends a {
    protected y(String str, n nVar) {
        super(str, nVar);
    }

    /* access modifiers changed from: protected */
    public abstract String a();

    /* access modifiers changed from: protected */
    public void a(int i) {
        i.a(i, this.f15418b);
    }

    /* access modifiers changed from: protected */
    public abstract void a(JSONObject jSONObject);

    /* access modifiers changed from: package-private */
    public void a(JSONObject jSONObject, final b.c<JSONObject> cVar) {
        AnonymousClass1 r0 = new u<JSONObject>(c.a(this.f15418b).a(i.a(a(), this.f15418b)).c(i.b(a(), this.f15418b)).a(i.e(this.f15418b)).b("POST").a(jSONObject).d(((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.eL)).booleanValue()).a(new JSONObject()).a(h()).a(), this.f15418b) {
            public void a(int i, String str, JSONObject jSONObject) {
                cVar.a(i, str, jSONObject);
            }

            public void a(JSONObject jSONObject, int i) {
                cVar.a(jSONObject, i);
            }
        };
        r0.a(com.applovin.impl.sdk.c.b.bc);
        r0.b(com.applovin.impl.sdk.c.b.bd);
        this.f15418b.V().a((a) r0);
    }

    /* access modifiers changed from: protected */
    public abstract int h();

    /* access modifiers changed from: protected */
    public JSONObject i() {
        JSONObject jSONObject = new JSONObject();
        String n = this.f15418b.n();
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.dz)).booleanValue() && StringUtils.isValidString(n)) {
            JsonUtils.putString(jSONObject, "cuid", n);
        }
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.dB)).booleanValue()) {
            JsonUtils.putString(jSONObject, "compass_random_token", this.f15418b.o());
        }
        if (((Boolean) this.f15418b.a(com.applovin.impl.sdk.c.b.dD)).booleanValue()) {
            JsonUtils.putString(jSONObject, "applovin_random_token", this.f15418b.p());
        }
        a(jSONObject);
        return jSONObject;
    }
}
