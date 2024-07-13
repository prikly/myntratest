package com.bytedance.sdk.openadsdk.f.a;

import com.bytedance.sdk.component.a.d;
import com.bytedance.sdk.component.a.f;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.w;
import java.lang.ref.WeakReference;
import org.json.JSONObject;

/* compiled from: DoInterstitialWebViewCloseMethod */
public class b extends d<JSONObject, JSONObject> {

    /* renamed from: a  reason: collision with root package name */
    private WeakReference<w> f1918a;

    /* access modifiers changed from: protected */
    public void d() {
    }

    public static void a(r rVar, final w wVar) {
        rVar.a("interstitial_webview_close", (d.b) new d.b() {
            public d a() {
                return new b(wVar);
            }
        });
    }

    public b(w wVar) {
        this.f1918a = new WeakReference<>(wVar);
    }

    /* access modifiers changed from: protected */
    public void a(JSONObject jSONObject, f fVar) throws Exception {
        if (h.d().s()) {
            StringBuilder sb = new StringBuilder();
            sb.append("[JSB-REQ] version: 3 data=");
            sb.append(jSONObject != null ? jSONObject.toString() : "");
            l.b("DoInterstitialWebViewCloseMethod", sb.toString());
        }
        l.e("DoInterstitialWebViewCloseMethod", "DoInterstitialWebViewCloseMethod invoke ");
        w wVar = (w) this.f1918a.get();
        if (wVar == null) {
            l.e("DoInterstitialWebViewCloseMethod", "invoke error");
            c();
            return;
        }
        wVar.g();
    }
}
