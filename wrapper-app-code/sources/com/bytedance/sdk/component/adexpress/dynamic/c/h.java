package com.bytedance.sdk.component.adexpress.dynamic.c;

import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.dynamic.d.b;
import com.bytedance.sdk.component.f.e;
import org.json.JSONObject;

/* compiled from: DynamicNativeParser */
public class h implements i {

    /* renamed from: a  reason: collision with root package name */
    private b f18573a;

    public void a(b bVar) {
        this.f18573a = bVar;
    }

    public void a(final l lVar) {
        if (lVar.m() == 1) {
            b(lVar);
        } else {
            e.a().execute(new Runnable() {
                public void run() {
                    h.this.b(lVar);
                }
            });
        }
    }

    /* access modifiers changed from: private */
    public void b(l lVar) {
        try {
            JSONObject a2 = lVar.a();
            JSONObject jSONObject = new JSONObject(a2.optString("template_Plugin"));
            JSONObject optJSONObject = a2.optJSONObject("creative");
            com.bytedance.sdk.component.adexpress.dynamic.b.h a3 = new g(jSONObject, optJSONObject, a2.optJSONObject("AdSize"), new JSONObject(a2.optString("diff_template_Plugin"))).a();
            a3.a(new JSONObject(optJSONObject.optString("dynamic_creative")).optString("color"));
            this.f18573a.a(a3);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }
}
