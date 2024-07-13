package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoNewClickEventMethod */
public class c extends d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f1920a;

    /* access modifiers changed from: protected */
    public void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("newClickEvent", (d.b) new d.b() {
            public d a() {
                return new c(wVar);
            }
        });
    }

    public c(w wVar) {
        this.f1920a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        w wVar = (w) this.f1920a.get();
        if (wVar == null) {
            c();
        } else {
            wVar.d(jSONObject);
        }
    }
}
