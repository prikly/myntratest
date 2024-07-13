package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.g.c;
import java.lang.ref.WeakReference;
import java.util.List;
import org.json.JSONObject;

/* compiled from: DoGetAdsFromNetworkAsyncMethod */
public class a extends d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f1915a;

    /* access modifiers changed from: protected */
    public void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("getNetworkData", (d.b) new d.b() {
            public d a() {
                return new a(wVar);
            }
        });
    }

    public a(w wVar) {
        this.f1915a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        w wVar = (w) this.f1915a.get();
        if (wVar == null) {
            c();
        } else {
            wVar.a(jSONObject, (c) new c() {
                public void a(boolean z, List<n> list) {
                    try {
                        JSONObject jSONObject = new JSONObject();
                        if (z) {
                            jSONObject.put("creatives", w.b(list));
                            a.this.a(jSONObject);
                            return;
                        }
                        a.this.a(jSONObject);
                    } catch (Throwable unused) {
                    }
                }
            });
        }
    }
}
