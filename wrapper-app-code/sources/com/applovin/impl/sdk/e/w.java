package com.applovin.impl.sdk.e;

import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.sdk.b.c;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.b;
import com.applovin.impl.sdk.utils.JsonUtils;
import com.applovin.impl.sdk.v;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import com.onesignal.outcomes.data.OutcomeEventsTable;
import java.util.Map;
import org.json.JSONObject;

public abstract class w extends y {
    protected w(String str, n nVar) {
        super(str, nVar);
    }

    private JSONObject a(c cVar) {
        JSONObject i = i();
        JsonUtils.putString(i, IronSourceConstants.EVENTS_RESULT, cVar.b());
        Map<String, String> a2 = cVar.a();
        if (a2 != null) {
            JsonUtils.putJSONObject(i, OutcomeEventsTable.COLUMN_NAME_PARAMS, new JSONObject(a2));
        }
        return i;
    }

    /* access modifiers changed from: protected */
    public abstract c b();

    /* access modifiers changed from: protected */
    public abstract void b(JSONObject jSONObject);

    /* access modifiers changed from: protected */
    public abstract void c();

    /* access modifiers changed from: protected */
    public int h() {
        return ((Integer) this.f15418b.a(b.bC)).intValue();
    }

    public void run() {
        c b2 = b();
        if (b2 != null) {
            v vVar = this.f15420d;
            if (v.a()) {
                v vVar2 = this.f15420d;
                String str = this.f15419c;
                vVar2.b(str, "Reporting pending reward: " + b2 + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(a(b2), new b.c<JSONObject>() {
                public void a(int i, String str, JSONObject jSONObject) {
                    w.this.a(i);
                }

                public void a(JSONObject jSONObject, int i) {
                    w.this.b(jSONObject);
                }
            });
            return;
        }
        v vVar3 = this.f15420d;
        if (v.a()) {
            this.f15420d.e(this.f15419c, "Pending reward not found");
        }
        c();
    }
}
