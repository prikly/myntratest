package com.applovin.impl.sdk.e;

import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.c;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.v;
import java.util.Map;
import org.json.JSONObject;

public class m extends a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final a f15457a;

    public interface a {
        void a();
    }

    public m(n nVar, a aVar) {
        super("TaskFetchVariables", nVar);
        this.f15457a = aVar;
    }

    private Map<String, String> a() {
        return Utils.stringifyObjectMap(this.f15418b.Y().a((Map<String, String>) null, false, false));
    }

    public void run() {
        AnonymousClass1 r1 = new u<JSONObject>(c.a(this.f15418b).a(i.k(this.f15418b)).c(i.l(this.f15418b)).a(a()).b("GET").a(new JSONObject()).b(((Integer) this.f15418b.a(b.dj)).intValue()).a(), this.f15418b) {
            public void a(int i, String str, JSONObject jSONObject) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str2 = this.f15419c;
                    vVar2.e(str2, "Unable to fetch variables: server returned " + i);
                }
                v.i("AppLovinVariableService", "Failed to load variables.");
                m.this.f15457a.a();
            }

            public void a(JSONObject jSONObject, int i) {
                i.d(jSONObject, this.f15418b);
                i.c(jSONObject, this.f15418b);
                i.f(jSONObject, this.f15418b);
                i.e(jSONObject, this.f15418b);
                m.this.f15457a.a();
            }
        };
        r1.a(b.bg);
        r1.b(b.bh);
        this.f15418b.V().a((a) r1);
    }
}
