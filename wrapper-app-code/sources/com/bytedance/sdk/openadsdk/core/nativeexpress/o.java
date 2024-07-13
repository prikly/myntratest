package com.bytedance.sdk.openadsdk.core.nativeexpress;

import android.content.Context;
import android.os.Build;
import android.webkit.WebSettings;
import com.bytedance.sdk.component.adexpress.a.c.b;
import com.bytedance.sdk.component.adexpress.b.f;
import com.bytedance.sdk.component.adexpress.b.j;
import com.bytedance.sdk.component.adexpress.b.l;
import com.bytedance.sdk.component.adexpress.d.a;
import com.bytedance.sdk.component.adexpress.d.e;
import com.bytedance.sdk.component.adexpress.theme.ThemeStatusBroadcastReceiver;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.e.n;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.k;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.s;
import com.com.bytedance.overseas.sdk.a.c;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: WebViewRender */
public class o extends a {

    /* renamed from: e  reason: collision with root package name */
    com.bytedance.sdk.openadsdk.utils.a f1480e;

    /* renamed from: f  reason: collision with root package name */
    private Context f1481f;

    /* renamed from: g  reason: collision with root package name */
    private String f1482g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public n f1483h;
    private JSONObject i;
    private u j;
    private String k;
    private com.bytedance.sdk.openadsdk.b.n l;
    private final Map<String, c> m = Collections.synchronizedMap(new HashMap());
    private w n;
    /* access modifiers changed from: private */
    public f o;
    private n.a p;
    private final Runnable q = new Runnable() {
        public void run() {
            if (!o.this.f18419d.get()) {
                if (!(o.this.f1483h == null || o.this.f1483h.G() == null)) {
                    o oVar = o.this;
                    b unused = oVar.f18418c = com.bytedance.sdk.component.adexpress.a.b.a.c(oVar.f1483h.G().b());
                }
                k.d().post(o.this.r);
            }
        }
    };
    /* access modifiers changed from: private */
    public final Runnable r = new Runnable() {
        public void run() {
            if (!o.this.f18419d.get() && o.this.o != null) {
                o oVar = o.this;
                o.super.a(oVar.o);
            }
        }
    };
    private int s = 8;

    public o(Context context, l lVar, ThemeStatusBroadcastReceiver themeStatusBroadcastReceiver, u uVar, n nVar) {
        super(context, lVar, themeStatusBroadcastReceiver);
        if (this.f18416a != null && this.f18416a.getWebView() != null) {
            this.f1481f = context;
            this.f1482g = lVar.b();
            this.f1483h = nVar;
            this.j = uVar;
            this.i = lVar.a();
            String e2 = com.bytedance.sdk.component.adexpress.a.b.a.e();
            this.k = e2;
            a(s.b(e2));
            themeStatusBroadcastReceiver.a(this);
            n();
            m();
            o();
        }
    }

    public void m() {
        if (this.f18416a != null && this.f18416a.getWebView() != null) {
            w wVar = new w(this.f1481f);
            this.n = wVar;
            wVar.b(this.f18416a).a(this.f1483h).d(this.f1483h.Y()).e(this.f1483h.ac()).b(com.bytedance.sdk.openadsdk.utils.u.a(this.f1482g)).f(com.bytedance.sdk.openadsdk.utils.u.i(this.f1483h)).a((j) this).a(this.i).a(this.f18416a).a(this.j);
        }
    }

    public void n() {
        n nVar = this.f1483h;
        if (nVar != null && nVar.G() != null) {
            this.p = this.f1483h.G();
        }
    }

    public void o() {
        if (this.f18416a != null && this.f18416a.getWebView() != null) {
            this.f18416a.setBackgroundColor(0);
            this.f18416a.setBackgroundResource(17170445);
            a(this.f18416a);
            if (a() != null) {
                this.l = new com.bytedance.sdk.openadsdk.b.n(this.f1481f, this.f1483h, a().getWebView()).a(false);
            }
            this.l.a(this.j);
            this.f18416a.setWebViewClient(new g(this.f1481f, this.n, this.f1483h, this.l));
            this.f18416a.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.n, this.l));
            if (Build.VERSION.SDK_INT >= 17) {
                e.a().a(this.f18416a, (com.bytedance.sdk.component.adexpress.d.b) this.n);
            }
        }
    }

    public void a(f fVar) {
        this.o = fVar;
        com.bytedance.sdk.component.f.e.a().execute(this.q);
    }

    private void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            try {
                com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.f1481f).a(false).a(sSWebView.getWebView());
                sSWebView.setVerticalScrollBarEnabled(false);
                sSWebView.setHorizontalScrollBarEnabled(false);
                sSWebView.a(true);
                sSWebView.j();
                sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
                if (Build.VERSION.SDK_INT >= 21) {
                    sSWebView.setMixedContentMode(0);
                }
                sSWebView.setJavaScriptEnabled(true);
                sSWebView.setJavaScriptCanOpenWindowsAutomatically(true);
                sSWebView.setDomStorageEnabled(true);
                sSWebView.setDatabaseEnabled(true);
                sSWebView.setAppCacheEnabled(true);
                sSWebView.setAllowFileAccess(false);
                sSWebView.setSupportZoom(true);
                sSWebView.setBuiltInZoomControls(true);
                sSWebView.setLayoutAlgorithm(WebSettings.LayoutAlgorithm.NARROW_COLUMNS);
                sSWebView.setUseWideViewPort(true);
            } catch (Exception e2) {
                com.bytedance.sdk.component.utils.l.e("WebViewRender", e2.toString());
            }
        }
    }

    public SSWebView a() {
        return this.f18416a;
    }

    public void d() {
        if (!this.f18419d.get()) {
            w wVar = this.n;
            if (wVar != null) {
                wVar.b();
                this.n = null;
            }
            super.d();
            k.d().removeCallbacks(this.r);
            this.m.clear();
        }
    }

    public void f() {
        if (a() != null) {
            try {
                a().getWebView().resumeTimers();
            } catch (Exception unused) {
            }
        }
    }

    public void j() {
        super.j();
        if (this.n != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("expressShow", true);
                this.n.a("expressShow", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    /* access modifiers changed from: protected */
    public void k() {
        com.bytedance.sdk.openadsdk.utils.a c2 = h.d().c();
        this.f1480e = c2;
        if (c2 != null) {
            c2.a((com.bytedance.sdk.component.adexpress.a) this);
        }
    }

    /* access modifiers changed from: protected */
    public void l() {
        super.l();
        com.bytedance.sdk.openadsdk.utils.a aVar = this.f1480e;
        if (aVar != null) {
            aVar.b((com.bytedance.sdk.component.adexpress.a) this);
        }
    }

    public void g() {
        w wVar = this.n;
        if (wVar != null) {
            wVar.a("expressWebviewRecycle", (JSONObject) null);
        }
    }

    public void a(int i2) {
        if (i2 != this.s) {
            this.s = i2;
            b(i2 == 0);
        }
    }

    private void b(boolean z) {
        if (this.n != null && this.f18416a != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("adVisible", z);
                this.n.a("expressAdShow", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public w p() {
        return this.n;
    }

    public void b(int i2) {
        if (this.n != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("status", i2);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
            this.n.a("themeChange", jSONObject);
        }
    }

    public static boolean b(String str) {
        return "banner_call".equals(str) || "banner_ad".equals(str) || "slide_banner_ad".equals(str) || "banner_ad_landingpage".equals(str);
    }
}
