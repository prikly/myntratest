package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.webkit.DownloadListener;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.AdSlot;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.common.f;
import com.bytedance.sdk.openadsdk.core.b.a;
import com.bytedance.sdk.openadsdk.core.e.o;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.n;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.e.d;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.u;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONArray;
import org.json.JSONObject;

public class TTLandingPageActivity extends Activity implements d {

    /* renamed from: b  reason: collision with root package name */
    private static final String f84b = TTLandingPageActivity.class.getSimpleName();
    /* access modifiers changed from: private */
    public boolean A;
    /* access modifiers changed from: private */
    public f B;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.common.d C;
    private String D = "ダウンロード";

    /* renamed from: a  reason: collision with root package name */
    n f85a;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public SSWebView f86c;

    /* renamed from: d  reason: collision with root package name */
    private ImageView f87d;

    /* renamed from: e  reason: collision with root package name */
    private ImageView f88e;

    /* renamed from: f  reason: collision with root package name */
    private TextView f89f;

    /* renamed from: g  reason: collision with root package name */
    private Context f90g;

    /* renamed from: h  reason: collision with root package name */
    private int f91h;
    private ViewStub i;
    private ViewStub j;
    private ViewStub k;
    /* access modifiers changed from: private */
    public Button l;
    /* access modifiers changed from: private */
    public ProgressBar m;
    private String n;
    private String o;
    /* access modifiers changed from: private */
    public w p;
    private int q;
    private String r;
    private com.bytedance.sdk.openadsdk.core.e.n s;
    /* access modifiers changed from: private */
    public c t;
    private String u;
    /* access modifiers changed from: private */
    public AtomicBoolean v = new AtomicBoolean(true);
    private JSONArray w = null;
    private String x;
    private int y = 0;
    private int z = 0;

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            m.a(this);
        } catch (Throwable unused) {
        }
        setContentView(t.f(this, "tt_activity_ttlandingpage"));
        Intent intent = getIntent();
        this.f91h = intent.getIntExtra("sdk_version", 1);
        this.n = intent.getStringExtra("adid");
        this.o = intent.getStringExtra("log_extra");
        this.q = intent.getIntExtra("source", -1);
        String stringExtra = intent.getStringExtra("url");
        this.u = stringExtra;
        a(4);
        String stringExtra2 = intent.getStringExtra("web_title");
        intent.getStringExtra("icon_url");
        this.r = intent.getStringExtra("event_tag");
        this.x = intent.getStringExtra("gecko_id");
        if (b.c()) {
            String stringExtra3 = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
            if (stringExtra3 != null) {
                try {
                    this.s = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra3));
                } catch (Exception e2) {
                    l.c(f84b, "TTLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                }
            }
        } else {
            this.s = com.bytedance.sdk.openadsdk.core.t.a().c();
            com.bytedance.sdk.openadsdk.core.t.a().h();
        }
        if (this.s == null) {
            finish();
            return;
        }
        this.A = m.h().g();
        c();
        this.f90g = this;
        if (this.f86c != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a((Context) this).a(false).b(false).a(this.f86c.getWebView());
        }
        SSWebView sSWebView = this.f86c;
        if (!(sSWebView == null || sSWebView.getWebView() == null)) {
            this.f85a = new n(this, this.s, this.f86c.getWebView()).a(true);
        }
        d();
        this.f86c.setLandingPage(true);
        this.f86c.setTag("landingpage");
        this.f86c.setMaterialMeta(this.s.aC());
        this.f86c.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.f90g, this.p, this.n, this.f85a, true) {
            public void onPageFinished(WebView webView, String str) {
                super.onPageFinished(webView, str);
                try {
                    if (TTLandingPageActivity.this.m != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.m.setVisibility(8);
                    }
                } catch (Throwable unused) {
                }
            }

            public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                return super.shouldInterceptRequest(webView, str);
            }
        });
        SSWebView sSWebView2 = this.f86c;
        if (sSWebView2 != null) {
            sSWebView2.setUserAgentString(i.a(sSWebView2.getWebView(), this.f91h));
        }
        if (Build.VERSION.SDK_INT >= 21) {
            this.f86c.setMixedContentMode(0);
        }
        e.a(this.f90g, this.s);
        j.a(this.f86c, stringExtra);
        this.f86c.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.p, this.f85a) {
            public void onProgressChanged(WebView webView, int i) {
                super.onProgressChanged(webView, i);
                if (TTLandingPageActivity.this.A) {
                    if (TTLandingPageActivity.this.B != null) {
                        TTLandingPageActivity.this.B.a(webView, i);
                    }
                    if (TTLandingPageActivity.this.C != null && i == 100) {
                        TTLandingPageActivity.this.C.a(webView);
                    }
                } else if (TTLandingPageActivity.this.m != null && !TTLandingPageActivity.this.isFinishing()) {
                    if (i != 100 || !TTLandingPageActivity.this.m.isShown()) {
                        TTLandingPageActivity.this.m.setProgress(i);
                    } else {
                        TTLandingPageActivity.this.m.setVisibility(8);
                    }
                }
            }
        });
        if (this.A) {
            this.f86c.getWebView().setOnTouchListener(new View.OnTouchListener() {

                /* renamed from: a  reason: collision with root package name */
                float f94a = 0.0f;

                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (motionEvent.getAction() == 0) {
                        this.f94a = motionEvent.getY();
                    }
                    if (motionEvent.getAction() == 2) {
                        float y = motionEvent.getY();
                        float f2 = this.f94a;
                        if (y - f2 > 8.0f) {
                            if (TTLandingPageActivity.this.B != null) {
                                TTLandingPageActivity.this.B.a();
                            }
                            if (TTLandingPageActivity.this.C != null) {
                                TTLandingPageActivity.this.C.a();
                            }
                            return false;
                        } else if (y - f2 < -8.0f) {
                            if (TTLandingPageActivity.this.B != null) {
                                TTLandingPageActivity.this.B.b();
                            }
                            if (TTLandingPageActivity.this.C != null) {
                                TTLandingPageActivity.this.C.b();
                            }
                        }
                    }
                    return false;
                }
            });
        }
        this.f86c.setDownloadListener(new DownloadListener() {
            public void onDownloadStart(String str, String str2, String str3, String str4, long j) {
                if (TTLandingPageActivity.this.t != null) {
                    TTLandingPageActivity.this.t.d();
                }
            }
        });
        TextView textView = this.f89f;
        if (textView != null) {
            if (TextUtils.isEmpty(stringExtra2)) {
                stringExtra2 = t.a(this, "tt_web_title_default");
            }
            textView.setText(stringExtra2);
        }
        a();
    }

    private void a() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.s;
        if (nVar != null && nVar.L() == 4) {
            ViewStub viewStub = this.k;
            if (viewStub != null) {
                viewStub.setVisibility(0);
            }
            Button button = (Button) findViewById(t.e(this, "tt_browser_download_btn"));
            this.l = button;
            if (button != null) {
                a(b());
                if (this.t == null) {
                    this.t = com.com.bytedance.overseas.sdk.a.d.a(this, this.s, TextUtils.isEmpty(this.r) ? u.a(this.q) : this.r);
                }
                a aVar = new a(this, this.s, this.r, this.q);
                aVar.a(false);
                this.l.setOnClickListener(aVar);
                this.l.setOnTouchListener(aVar);
                aVar.c(true);
                aVar.a(this.t);
            }
        }
    }

    private String b() {
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.s;
        if (nVar != null && !TextUtils.isEmpty(nVar.W())) {
            this.D = this.s.W();
        }
        return this.D;
    }

    private void a(final String str) {
        Button button;
        if (!TextUtils.isEmpty(str) && (button = this.l) != null) {
            button.post(new Runnable() {
                public void run() {
                    if (TTLandingPageActivity.this.l != null && !TTLandingPageActivity.this.isFinishing()) {
                        TTLandingPageActivity.this.l.setText(str);
                    }
                }
            });
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        a();
    }

    private void c() {
        ViewStub viewStub;
        this.f86c = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        this.k = (ViewStub) findViewById(t.e(this, "tt_browser_download_btn_stub"));
        this.i = (ViewStub) findViewById(t.e(this, "tt_browser_titlebar_view_stub"));
        this.j = (ViewStub) findViewById(t.e(this, "tt_browser_titlebar_dark_view_stub"));
        if (this.A) {
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_title_bar_view_stub"))).setVisibility(0);
            ((ViewStub) findViewById(t.e(this, "tt_browser_new_bottom_bar_view_stub"))).setVisibility(0);
            f fVar = new f(this, (RelativeLayout) findViewById(t.e(this, "tt_title_bar")), this.s);
            this.B = fVar;
            ImageView c2 = fVar.c();
            this.f88e = c2;
            c2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
            this.C = new com.bytedance.sdk.openadsdk.common.d(this, (LinearLayout) findViewById(t.e(this, "tt_bottom_bar")), this.f86c, this.s, "landingpage");
            return;
        }
        int o2 = h.d().o();
        if (o2 == 0) {
            ViewStub viewStub2 = this.i;
            if (viewStub2 != null) {
                viewStub2.setVisibility(0);
            }
        } else if (o2 == 1 && (viewStub = this.j) != null) {
            viewStub.setVisibility(0);
        }
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_titlebar_back"));
        this.f87d = imageView;
        if (imageView != null) {
            imageView.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTLandingPageActivity.this.f86c == null) {
                        return;
                    }
                    if (TTLandingPageActivity.this.f86c.e()) {
                        TTLandingPageActivity.this.f86c.f();
                    } else if (TTLandingPageActivity.this.e()) {
                        TTLandingPageActivity.this.onBackPressed();
                    } else {
                        TTLandingPageActivity.this.finish();
                    }
                }
            });
        }
        ImageView imageView2 = (ImageView) findViewById(t.e(this, "tt_titlebar_close"));
        this.f88e = imageView2;
        if (imageView2 != null) {
            imageView2.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    TTLandingPageActivity.this.finish();
                }
            });
        }
        this.f89f = (TextView) findViewById(t.e(this, "tt_titlebar_title"));
        ProgressBar progressBar = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        this.m = progressBar;
        progressBar.setVisibility(0);
    }

    private void d() {
        w wVar = new w(this);
        this.p = wVar;
        wVar.b(this.f86c).d(this.n).e(this.o).a(this.s).b(this.q).a(this.s.F()).f(u.i(this.s)).a(this.f86c).c("landingpage").a((d) this);
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        w wVar = this.p;
        if (wVar != null) {
            wVar.l();
        }
        n nVar = this.f85a;
        if (nVar != null) {
            nVar.d();
        }
        f();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        n nVar = this.f85a;
        if (nVar != null) {
            nVar.e();
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.p;
        if (wVar != null) {
            wVar.m();
        }
    }

    public void onBackPressed() {
        if (!e() || this.v.getAndSet(true)) {
            super.onBackPressed();
            return;
        }
        a(true);
        a(0);
    }

    /* access modifiers changed from: private */
    public boolean e() {
        return !TextUtils.isEmpty(this.u) && this.u.contains("__luban_sdk");
    }

    /* access modifiers changed from: private */
    public void a(int i2) {
        if (this.f88e != null && e()) {
            v.a((View) this.f88e, i2);
        }
    }

    private void a(boolean z2) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("isBackIntercept", z2);
            this.p.a("temai_back_event", jSONObject);
        } catch (Exception unused) {
        }
    }

    private void f() {
        if (this.s != null) {
            JSONArray b2 = b(this.u);
            int f2 = u.f(this.s);
            int e2 = u.e(this.s);
            com.bytedance.sdk.openadsdk.core.n<com.bytedance.sdk.openadsdk.b.a> f3 = m.f();
            if (b2 != null && f3 != null && f2 > 0 && e2 > 0) {
                o oVar = new o();
                oVar.f1145e = b2;
                AdSlot x2 = this.s.x();
                if (x2 != null) {
                    x2.setAdCount(6);
                    f3.a(x2, oVar, e2, new n.a() {
                        public void a(int i, String str) {
                            TTLandingPageActivity.this.a(0);
                        }

                        public void a(com.bytedance.sdk.openadsdk.core.e.a aVar, com.bytedance.sdk.openadsdk.core.e.b bVar) {
                            if (aVar != null) {
                                try {
                                    TTLandingPageActivity.this.v.set(false);
                                    TTLandingPageActivity.this.p.b(new JSONObject(aVar.c()));
                                } catch (Exception unused) {
                                    TTLandingPageActivity.this.a(0);
                                }
                            }
                        }
                    });
                }
            }
        }
    }

    private JSONArray b(String str) {
        int i2;
        JSONArray jSONArray = this.w;
        if (jSONArray != null && jSONArray.length() > 0) {
            return this.w;
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        int indexOf = str.indexOf("?id=");
        int indexOf2 = str.indexOf("&");
        if (indexOf == -1 || indexOf2 == -1 || (i2 = indexOf + 4) >= indexOf2) {
            return null;
        }
        String substring = str.substring(i2, indexOf2);
        if (TextUtils.isEmpty(substring)) {
            return null;
        }
        JSONArray jSONArray2 = new JSONArray();
        jSONArray2.put(substring);
        return jSONArray2;
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        SSWebView sSWebView;
        super.onDestroy();
        com.bytedance.sdk.openadsdk.b.n nVar = this.f85a;
        if (!(nVar == null || (sSWebView = this.f86c) == null)) {
            nVar.a(sSWebView);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView2 = this.f86c;
        if (sSWebView2 != null) {
            z.a(this.f90g, sSWebView2.getWebView());
            z.a(this.f86c.getWebView());
        }
        this.f86c = null;
        w wVar = this.p;
        if (wVar != null) {
            wVar.n();
        }
        com.bytedance.sdk.openadsdk.b.n nVar2 = this.f85a;
        if (nVar2 != null) {
            nVar2.f();
        }
    }

    public void a(boolean z2, JSONArray jSONArray) {
        if (z2 && jSONArray != null && jSONArray.length() > 0) {
            this.w = jSONArray;
            f();
        }
    }
}
