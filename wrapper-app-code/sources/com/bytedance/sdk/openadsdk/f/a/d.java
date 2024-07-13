package com.bytedance.sdk.openadsdk.f.a;

import com.appodeal.ads.modules.common.internal.Constants;
import com.bytedance.sdk.component.a.e;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: InteractiveFinishMethod */
public class d extends e<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f1922a;

    public static void a(r rVar, w wVar) {
        rVar.a("interactiveFinish", (e<?, ?>) new d(wVar));
    }

    public JSONObject a(JSONObject jSONObject, f fVar) throws Exception {
        JSONObject jSONObject2 = new JSONObject();
        WeakReference<w> weakReference = this.f1922a;
        if (!(weakReference == null || weakReference.get() == null)) {
            w wVar = (w) this.f1922a.get();
            n c2 = wVar.c();
            boolean z = true;
            try {
                int i = 0;
                if (jSONObject.optInt(Constants.FINISH, 1) != 1) {
                    z = false;
                }
                int optInt = jSONObject.optInt("reduce_duration", -1);
                int aA = c2 != null ? c2.aA() : 0;
                if (optInt >= 0 && aA >= 0) {
                    optInt = Math.min(optInt, aA);
                } else if (optInt < 0) {
                    optInt = aA >= 0 ? aA : 0;
                }
                if (z) {
                    wVar.c(optInt);
                } else {
                    i = -1;
                }
                jSONObject2.put("code", i);
                jSONObject2.put("reduce_duration", optInt);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
        return jSONObject2;
    }

    public d(w wVar) {
        this.f1922a = new WeakReference<>(wVar);
    }
}
