package com.bytedance.sdk.openadsdk.core.j;

import com.bytedance.sdk.openadsdk.core.j.b.c;
import com.bytedance.sdk.openadsdk.core.j.c.a;
import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastIcon */
public class b extends c {
    private long i;
    private long j;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public b(int i2, int i3, long j2, long j3, a.C0007a aVar, a.b bVar, String str, List<c> list, List<c> list2, String str2) {
        super(i2, i3, aVar, bVar, str, list, list2, str2);
        this.i = j2;
        this.j = j3;
    }

    public JSONObject a() throws JSONException {
        JSONObject a2 = super.a();
        if (a2 != null) {
            a2.put("offset", this.i);
            a2.put(IronSourceConstants.EVENTS_DURATION, this.j);
        }
        return a2;
    }

    public static b a(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        c b2 = c.b(jSONObject);
        if (b2 == null) {
            return null;
        }
        long optLong = jSONObject2.optLong("offset", -1);
        long optLong2 = jSONObject2.optLong(IronSourceConstants.EVENTS_DURATION, -1);
        return new b(b2.f1314a, b2.f1315b, optLong, optLong2, b2.f1316c, b2.f1317d, b2.f1318e, b2.f1319f, b2.f1320g, b2.f1321h);
    }
}
