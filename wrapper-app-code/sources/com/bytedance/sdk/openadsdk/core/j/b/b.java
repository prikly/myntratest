package com.bytedance.sdk.openadsdk.core.j.b;

import com.applovin.sdk.AppLovinEventTypes;
import com.bytedance.sdk.openadsdk.core.j.b.c;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: VastFractionalProgressTracker */
public class b extends c implements Comparable<b> {

    /* renamed from: a  reason: collision with root package name */
    private float f1299a;

    private b(float f2, String str, c.b bVar, Boolean bool) {
        super(str, bVar, bool);
        this.f1299a = f2;
    }

    public boolean a(float f2) {
        return this.f1299a <= f2 && !e();
    }

    /* renamed from: a */
    public int compareTo(b bVar) {
        if (bVar == null) {
            return 1;
        }
        float f2 = this.f1299a;
        float f3 = bVar.f1299a;
        if (f2 > f3) {
            return 1;
        }
        return f2 < f3 ? -1 : 0;
    }

    public void f_() {
        super.f_();
        float f2 = this.f1299a;
        if (f2 != 0.25f) {
            int i = (f2 > 0.5f ? 1 : (f2 == 0.5f ? 0 : -1));
        }
    }

    /* compiled from: VastFractionalProgressTracker */
    public static class a {

        /* renamed from: a  reason: collision with root package name */
        private String f1300a;

        /* renamed from: b  reason: collision with root package name */
        private float f1301b;

        /* renamed from: c  reason: collision with root package name */
        private c.b f1302c = c.b.TRACKING_URL;

        /* renamed from: d  reason: collision with root package name */
        private boolean f1303d = false;

        public a(String str, float f2) {
            this.f1300a = str;
            this.f1301b = f2;
        }

        public b a() {
            return new b(this.f1301b, this.f1300a, this.f1302c, Boolean.valueOf(this.f1303d));
        }
    }

    public JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put(AppLovinEventTypes.USER_VIEWED_CONTENT, c());
        jSONObject.put("trackingFraction", (double) this.f1299a);
        return jSONObject;
    }
}
