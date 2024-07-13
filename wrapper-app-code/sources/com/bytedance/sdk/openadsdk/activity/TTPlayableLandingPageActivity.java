package com.bytedance.sdk.openadsdk.activity;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.Toast;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.utils.x;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.TTAdDislike;
import com.bytedance.sdk.openadsdk.TTAdSdk;
import com.bytedance.sdk.openadsdk.b.e;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.b.d;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.h;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.PlayableLoadingView;
import com.bytedance.sdk.openadsdk.core.z;
import com.bytedance.sdk.openadsdk.g.f;
import com.bytedance.sdk.openadsdk.j.a;
import com.bytedance.sdk.openadsdk.j.f;
import com.bytedance.sdk.openadsdk.j.g;
import com.bytedance.sdk.openadsdk.multipro.b;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.v;
import com.com.bytedance.overseas.sdk.a.c;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;

public class TTPlayableLandingPageActivity extends Activity implements x.a, d, f {
    private static final f.a J = new f.a() {
        public void a(String str, String str2) {
            l.b(str, str2);
        }

        public void a(String str, String str2, Throwable th) {
            l.c(str, str2, th);
        }
    };
    private c A;
    private AtomicBoolean B = new AtomicBoolean(false);
    private String C;
    private int D = 0;
    private int E = 0;
    /* access modifiers changed from: private */
    public g F;
    /* access modifiers changed from: private */
    public boolean G = false;
    /* access modifiers changed from: private */
    public u H;
    private n I;

    /* renamed from: a  reason: collision with root package name */
    TTAdDislike f103a;

    /* renamed from: b  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.g.g f104b;

    /* renamed from: c  reason: collision with root package name */
    protected com.bytedance.sdk.openadsdk.g.d f105c = new com.bytedance.sdk.openadsdk.g.d() {
        public void a() {
            if (!TTPlayableLandingPageActivity.this.isFinishing() && p.e(TTPlayableLandingPageActivity.this.w) && p.g(TTPlayableLandingPageActivity.this.w)) {
                TTPlayableLandingPageActivity.this.x.removeMessages(2);
                TTPlayableLandingPageActivity.this.x.sendMessage(TTPlayableLandingPageActivity.this.a(1));
            }
        }

        public void b() {
            if (p.e(TTPlayableLandingPageActivity.this.w) && p.f(TTPlayableLandingPageActivity.this.w)) {
                TTPlayableLandingPageActivity.this.x.sendMessageDelayed(TTPlayableLandingPageActivity.this.a(0), 1000);
            }
        }

        public void a(int i) {
            if (p.e(TTPlayableLandingPageActivity.this.w) && TTPlayableLandingPageActivity.this.n != null) {
                TTPlayableLandingPageActivity.this.n.setProgress(i);
            }
        }
    };

    /* renamed from: d  reason: collision with root package name */
    private SSWebView f106d;

    /* renamed from: e  reason: collision with root package name */
    private SSWebView f107e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f108f = true;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public boolean f109g = true;

    /* renamed from: h  reason: collision with root package name */
    private RelativeLayout f110h;
    private View i;
    private ImageView j;
    private Context k;
    private int l;
    /* access modifiers changed from: private */
    public ProgressBar m;
    /* access modifiers changed from: private */
    public PlayableLoadingView n;
    private String o;
    private String p;
    /* access modifiers changed from: private */
    public w q;
    private w r;
    private int s;
    /* access modifiers changed from: private */
    public String t;
    private String u;
    private final String v = "embeded_ad";
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.core.e.n w;
    /* access modifiers changed from: private */
    public x x = new x(Looper.getMainLooper(), this);
    /* access modifiers changed from: private */
    public boolean y;
    /* access modifiers changed from: private */
    public boolean z;

    /* access modifiers changed from: private */
    public Message a(int i2) {
        Message obtain = Message.obtain();
        obtain.what = 2;
        obtain.arg1 = i2;
        return obtain;
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (!TTAdSdk.isInitSuccess()) {
            finish();
        }
        try {
            requestWindowFeature(1);
            getWindow().addFlags(1024);
            getWindow().addFlags(16777216);
            m.a(this);
        } catch (Throwable unused) {
        }
        a(bundle);
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.w;
        if (nVar != null) {
            int h2 = p.h(nVar);
            if (h2 != 0) {
                if (h2 == 1) {
                    setRequestedOrientation(1);
                } else if (h2 == 2) {
                    setRequestedOrientation(0);
                }
            } else if (Build.VERSION.SDK_INT >= 18) {
                setRequestedOrientation(14);
            } else {
                setRequestedOrientation(1);
            }
            this.k = this;
            setContentView(t.f(this, "tt_activity_ttlandingpage_playable"));
            h();
            e();
            a();
            l();
            f();
            g();
            u uVar = this.H;
            if (uVar != null) {
                uVar.h();
            }
            com.bytedance.sdk.openadsdk.g.g gVar = new com.bytedance.sdk.openadsdk.g.g(getApplicationContext());
            this.f104b = gVar;
            gVar.a((com.bytedance.sdk.openadsdk.g.f) this);
        }
    }

    private void d() {
        if (this.F == null) {
            if (h.d().s()) {
                com.bytedance.sdk.openadsdk.j.f.a(J);
            }
            AnonymousClass6 r0 = new a() {
                public void a(JSONObject jSONObject) {
                }

                public void b() {
                }

                public void b(JSONObject jSONObject) {
                }

                /* JADX WARNING: Removed duplicated region for block: B:27:0x0057  */
                /* JADX WARNING: Removed duplicated region for block: B:41:0x006e  */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public com.bytedance.sdk.openadsdk.j.d a() {
                    /*
                        r7 = this;
                        java.lang.String r0 = com.bytedance.sdk.openadsdk.common.a.f()
                        int r1 = r0.hashCode()
                        r2 = 1653(0x675, float:2.316E-42)
                        r3 = 4
                        r4 = 3
                        r5 = 2
                        r6 = 1
                        if (r1 == r2) goto L_0x004a
                        r2 = 1684(0x694, float:2.36E-42)
                        if (r1 == r2) goto L_0x0040
                        r2 = 1715(0x6b3, float:2.403E-42)
                        if (r1 == r2) goto L_0x0036
                        r2 = 1746(0x6d2, float:2.447E-42)
                        if (r1 == r2) goto L_0x002c
                        r2 = 3649301(0x37af15, float:5.11376E-39)
                        if (r1 == r2) goto L_0x0022
                        goto L_0x0054
                    L_0x0022:
                        java.lang.String r1 = "wifi"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 4
                        goto L_0x0055
                    L_0x002c:
                        java.lang.String r1 = "5g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 3
                        goto L_0x0055
                    L_0x0036:
                        java.lang.String r1 = "4g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 2
                        goto L_0x0055
                    L_0x0040:
                        java.lang.String r1 = "3g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 1
                        goto L_0x0055
                    L_0x004a:
                        java.lang.String r1 = "2g"
                        boolean r0 = r0.equals(r1)
                        if (r0 == 0) goto L_0x0054
                        r0 = 0
                        goto L_0x0055
                    L_0x0054:
                        r0 = -1
                    L_0x0055:
                        if (r0 == 0) goto L_0x006e
                        if (r0 == r6) goto L_0x006b
                        if (r0 == r5) goto L_0x0068
                        if (r0 == r4) goto L_0x0065
                        if (r0 == r3) goto L_0x0062
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_UNKNOWN
                        return r0
                    L_0x0062:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_WIFI
                        return r0
                    L_0x0065:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_5G
                        return r0
                    L_0x0068:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_4G
                        return r0
                    L_0x006b:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_3G
                        return r0
                    L_0x006e:
                        com.bytedance.sdk.openadsdk.j.d r0 = com.bytedance.sdk.openadsdk.j.d.TYPE_2G
                        return r0
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.AnonymousClass6.a():com.bytedance.sdk.openadsdk.j.d");
                }

                public void c(JSONObject jSONObject) {
                    e.b(TTPlayableLandingPageActivity.this.getApplicationContext(), TTPlayableLandingPageActivity.this.w, "embeded_ad", "playable_track", jSONObject);
                }
            };
            AnonymousClass7 r1 = new com.bytedance.sdk.openadsdk.j.c() {
                public void a(String str, JSONObject jSONObject) {
                    TTPlayableLandingPageActivity.this.q.a(str, jSONObject);
                }
            };
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("cid", this.o);
                jSONObject.put("log_extra", this.p);
                this.F = g.a(getApplicationContext(), this.f106d.getWebView(), r1, r0).f(this.t).e(com.bytedance.sdk.openadsdk.common.a.a(m.a())).a(com.bytedance.sdk.openadsdk.common.a.a()).a(jSONObject).b(com.bytedance.sdk.openadsdk.common.a.e()).a("sdkEdition", com.bytedance.sdk.openadsdk.common.a.c()).d(com.bytedance.sdk.openadsdk.common.a.d()).c(false).a(this.G).b(true);
            } catch (Throwable unused) {
            }
            if (!TextUtils.isEmpty(p.b(this.w))) {
                this.F.c(p.b(this.w));
            }
            Set<String> j2 = this.F.j();
            final WeakReference weakReference = new WeakReference(this.F);
            for (String next : j2) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next)) {
                    this.q.a().a(next, (com.bytedance.sdk.component.a.e<?, ?>) new com.bytedance.sdk.component.a.e<JSONObject, JSONObject>() {
                        public JSONObject a(JSONObject jSONObject, com.bytedance.sdk.component.a.f fVar) throws Exception {
                            try {
                                g gVar = (g) weakReference.get();
                                if (gVar == null) {
                                    return null;
                                }
                                return gVar.c(a(), jSONObject);
                            } catch (Throwable unused) {
                                return null;
                            }
                        }
                    });
                }
            }
        }
    }

    private void e() {
        if (this.w.L() == 4) {
            this.A = com.com.bytedance.overseas.sdk.a.d.a(this.k, this.w, "interaction");
        }
    }

    private void f() {
        int i2 = m.h().n(String.valueOf(com.bytedance.sdk.openadsdk.utils.u.f(this.w))).p;
        if (i2 >= 0) {
            this.x.sendEmptyMessageDelayed(1, (long) (i2 * 1000));
        } else {
            v.a((View) this.f110h, 0);
        }
    }

    private void a(Bundle bundle) {
        Intent intent = getIntent();
        if (intent != null) {
            this.l = intent.getIntExtra("sdk_version", 1);
            this.o = intent.getStringExtra("adid");
            this.p = intent.getStringExtra("log_extra");
            this.s = intent.getIntExtra("source", -1);
            this.y = intent.getBooleanExtra("ad_pending_download", false);
            this.t = intent.getStringExtra("url");
            this.C = intent.getStringExtra("gecko_id");
            this.u = intent.getStringExtra("web_title");
            if (b.c()) {
                String stringExtra = intent.getStringExtra(TTAdConstant.MULTI_PROCESS_MATERIALMETA);
                if (stringExtra != null) {
                    try {
                        this.w = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(stringExtra));
                    } catch (Exception e2) {
                        l.c("TTPWPActivity", "TTPlayableLandingPageActivity - onCreate MultiGlobalInfo : ", e2);
                    }
                }
            } else {
                this.w = com.bytedance.sdk.openadsdk.core.t.a().c();
                com.bytedance.sdk.openadsdk.core.t.a().h();
            }
        }
        if (bundle != null) {
            try {
                this.l = bundle.getInt("sdk_version", 1);
                this.o = bundle.getString("adid");
                this.p = bundle.getString("log_extra");
                this.s = bundle.getInt("source", -1);
                this.y = bundle.getBoolean("ad_pending_download", false);
                this.t = bundle.getString("url");
                this.u = bundle.getString("web_title");
                String string = bundle.getString("material_meta", (String) null);
                if (!TextUtils.isEmpty(string)) {
                    this.w = com.bytedance.sdk.openadsdk.core.b.a(new JSONObject(string));
                }
            } catch (Throwable unused) {
            }
        }
        if (this.w == null) {
            l.e("TTPWPActivity", "material is null, no data to display");
            finish();
            return;
        }
        try {
            this.G = m.h().b(Integer.parseInt(this.w.x().getCodeId()));
        } catch (Throwable th) {
            th.printStackTrace();
        }
    }

    private void g() {
        SSWebView sSWebView = this.f106d;
        if (sSWebView != null) {
            sSWebView.setLandingPage(true);
            this.f106d.setTag("landingpage");
            this.f106d.setMaterialMeta(this.w.aC());
            n a2 = new n(this, this.w, this.f106d.getWebView()).a(true);
            this.I = a2;
            a2.a("embeded_ad");
            this.I.a(this.H);
            this.f106d.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.k, this.q, this.o, this.I, true) {
                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (TTPlayableLandingPageActivity.this.F != null) {
                        TTPlayableLandingPageActivity.this.F.g(str);
                    }
                }

                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0024 */
                /* JADX WARNING: Removed duplicated region for block: B:11:0x002c A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:14:0x003f A[Catch:{ all -> 0x0055 }] */
                /* JADX WARNING: Removed duplicated region for block: B:20:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public void onPageFinished(android.webkit.WebView r1, java.lang.String r2) {
                    /*
                        r0 = this;
                        super.onPageFinished(r1, r2)
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        boolean r1 = r1.isFinishing()
                        if (r1 == 0) goto L_0x000c
                        return
                    L_0x000c:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.F
                        if (r1 == 0) goto L_0x001d
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this
                        com.bytedance.sdk.openadsdk.j.g r1 = r1.F
                        r1.h((java.lang.String) r2)
                    L_0x001d:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0024 }
                        com.bytedance.sdk.openadsdk.g.d r1 = r1.f105c     // Catch:{ all -> 0x0024 }
                        r1.b()     // Catch:{ all -> 0x0024 }
                    L_0x0024:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.m     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0037
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        android.widget.ProgressBar r1 = r1.m     // Catch:{ all -> 0x0055 }
                        r2 = 8
                        r1.setVisibility(r2)     // Catch:{ all -> 0x0055 }
                    L_0x0037:
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        boolean r1 = r1.f108f     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        r1.i()     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity r1 = com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.this     // Catch:{ all -> 0x0055 }
                        java.lang.String r2 = "py_loading_success"
                        r1.a((java.lang.String) r2)     // Catch:{ all -> 0x0055 }
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f1799c     // Catch:{ all -> 0x0055 }
                        if (r1 == 0) goto L_0x0055
                        com.bytedance.sdk.openadsdk.core.w r1 = r0.f1799c     // Catch:{ all -> 0x0055 }
                        r2 = 1
                        r1.b((boolean) r2)     // Catch:{ all -> 0x0055 }
                    L_0x0055:
                        return
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.activity.TTPlayableLandingPageActivity.AnonymousClass9.onPageFinished(android.webkit.WebView, java.lang.String):void");
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    if (!(TTPlayableLandingPageActivity.this.t == null || webResourceRequest == null || webResourceRequest.getUrl() == null || !TTPlayableLandingPageActivity.this.t.equals(webResourceRequest.getUrl().toString()))) {
                        boolean unused = TTPlayableLandingPageActivity.this.f108f = false;
                    }
                    if (!(TTPlayableLandingPageActivity.this.F == null || webResourceRequest == null)) {
                        try {
                            TTPlayableLandingPageActivity.this.F.a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        } catch (Throwable unused2) {
                        }
                    }
                    super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    super.onReceivedError(webView, webResourceRequest, webResourceError);
                    boolean unused = TTPlayableLandingPageActivity.this.f108f = false;
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    super.onReceivedError(webView, i, str, str2);
                    boolean unused = TTPlayableLandingPageActivity.this.f108f = false;
                    if (TTPlayableLandingPageActivity.this.F != null) {
                        TTPlayableLandingPageActivity.this.F.a(i, str, str2);
                    }
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    try {
                        if (TTPlayableLandingPageActivity.this.F != null) {
                            TTPlayableLandingPageActivity.this.F.i(str);
                        }
                    } catch (Exception unused) {
                    }
                    return super.shouldInterceptRequest(webView, str);
                }
            });
            a(this.f106d);
            a(this.f107e);
            j();
            j.a(this.f106d, this.t);
            this.f106d.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.q, this.I) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    if (!TTPlayableLandingPageActivity.this.isFinishing()) {
                        try {
                            TTPlayableLandingPageActivity.this.f105c.a(i);
                        } catch (Throwable unused) {
                        }
                        if (TTPlayableLandingPageActivity.this.m == null) {
                            return;
                        }
                        if (i != 100 || !TTPlayableLandingPageActivity.this.m.isShown()) {
                            TTPlayableLandingPageActivity.this.m.setProgress(i);
                            return;
                        }
                        TTPlayableLandingPageActivity.this.m.setVisibility(8);
                        TTPlayableLandingPageActivity.this.i();
                    }
                }
            });
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        if (bundle == null) {
            bundle = new Bundle();
        }
        try {
            bundle.putString("material_meta", this.w != null ? this.w.ar().toString() : null);
            bundle.putInt("sdk_version", this.l);
            bundle.putString("adid", this.o);
            bundle.putString("log_extra", this.p);
            bundle.putInt("source", this.s);
            bundle.putBoolean("ad_pending_download", this.y);
            bundle.putString("url", this.t);
            bundle.putString("web_title", this.u);
            bundle.putString("event_tag", "embeded_ad");
        } catch (Throwable unused) {
        }
        super.onSaveInstanceState(bundle);
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    private void h() {
        this.n = (PlayableLoadingView) findViewById(t.e(this, "tt_playable_loading"));
        this.f106d = (SSWebView) findViewById(t.e(this, "tt_browser_webview"));
        this.f107e = (SSWebView) findViewById(t.e(this, "tt_browser_webview_loading"));
        RelativeLayout relativeLayout = (RelativeLayout) findViewById(t.e(this, "tt_playable_ad_close_layout"));
        this.f110h = relativeLayout;
        if (relativeLayout != null) {
            relativeLayout.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    if (TTPlayableLandingPageActivity.this.H != null) {
                        TTPlayableLandingPageActivity.this.H.i();
                    }
                    TTPlayableLandingPageActivity.this.a("playable_close");
                    TTPlayableLandingPageActivity.this.finish();
                }
            });
        }
        this.m = (ProgressBar) findViewById(t.e(this, "tt_browser_progress"));
        View findViewById = findViewById(t.e(this, "tt_playable_ad_dislike"));
        this.i = findViewById;
        findViewById.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity.this.b();
            }
        });
        ImageView imageView = (ImageView) findViewById(t.e(this, "tt_playable_ad_mute"));
        this.j = imageView;
        imageView.setOnClickListener(new View.OnClickListener() {
            public void onClick(View view) {
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                boolean unused = tTPlayableLandingPageActivity.G = !tTPlayableLandingPageActivity.G;
                TTPlayableLandingPageActivity tTPlayableLandingPageActivity2 = TTPlayableLandingPageActivity.this;
                tTPlayableLandingPageActivity2.b(tTPlayableLandingPageActivity2.G);
                if (TTPlayableLandingPageActivity.this.F != null) {
                    TTPlayableLandingPageActivity.this.F.a(TTPlayableLandingPageActivity.this.G);
                }
            }
        });
        this.f106d.setBackgroundColor(-16777216);
        this.f107e.setBackgroundColor(-16777216);
        v.a((View) this.f106d, 4);
        v.a((View) this.f107e, 0);
    }

    /* access modifiers changed from: protected */
    public void a() {
        if (this.n != null) {
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.w;
            if (nVar == null || p.e(nVar)) {
                this.n.b();
                if (this.n.getPlayView() != null) {
                    AnonymousClass3 r1 = new com.bytedance.sdk.openadsdk.core.b.a(this, this.w, "embeded_ad", this.s) {
                        public void a(View view, float f2, float f3, float f4, float f5, SparseArray<c.a> sparseArray, boolean z) {
                            if (this.f941d == null || this.f941d.i() != 1 || z) {
                                super.a(view, f2, f3, f4, f5, sparseArray, z);
                                boolean unused = TTPlayableLandingPageActivity.this.y = true;
                                boolean unused2 = TTPlayableLandingPageActivity.this.z = true;
                                HashMap hashMap = new HashMap();
                                hashMap.put("playable_url", TTPlayableLandingPageActivity.this.t);
                                TTPlayableLandingPageActivity tTPlayableLandingPageActivity = TTPlayableLandingPageActivity.this;
                                e.e((Context) tTPlayableLandingPageActivity, tTPlayableLandingPageActivity.w, this.f942e, "click_playable_download_button_loading", (Map<String, Object>) hashMap);
                            }
                        }
                    };
                    r1.a(this.A);
                    this.n.getPlayView().setOnClickListener(r1);
                }
                if (p.g(this.w)) {
                    this.x.sendMessageDelayed(a(2), 10000);
                    return;
                }
                return;
            }
            this.n.a();
        }
    }

    /* access modifiers changed from: private */
    public void i() {
        SSWebView sSWebView;
        if (!this.B.getAndSet(true) && (sSWebView = this.f106d) != null && this.f107e != null) {
            v.a((View) sSWebView, 0);
            v.a((View) this.f107e, 8);
        }
    }

    private void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a(this.k).a(false).b(false).a(sSWebView.getWebView());
            sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), this.l));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        e.c((Context) this, this.w, "embeded_ad", str, (JSONObject) null);
    }

    private void j() {
        if (this.f107e != null) {
            String k2 = k();
            if (!TextUtils.isEmpty(k2)) {
                this.f107e.setWebViewClient(new com.bytedance.sdk.openadsdk.core.widget.a.d(this.k, this.r, this.o, (n) null, false) {
                    public void onPageFinished(WebView webView, String str) {
                        super.onPageFinished(webView, str);
                        if (TTPlayableLandingPageActivity.this.f109g) {
                            TTPlayableLandingPageActivity.this.a("loading_h5_success");
                        }
                    }

                    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                        boolean unused = TTPlayableLandingPageActivity.this.f109g = false;
                    }

                    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                        super.onReceivedError(webView, webResourceRequest, webResourceError);
                        boolean unused = TTPlayableLandingPageActivity.this.f109g = false;
                    }

                    public void onReceivedError(WebView webView, int i, String str, String str2) {
                        super.onReceivedError(webView, i, str, str2);
                        boolean unused = TTPlayableLandingPageActivity.this.f109g = false;
                    }
                });
                this.f107e.a(k2);
            }
        }
    }

    private String k() {
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        String j2 = m.h().j();
        if (TextUtils.isEmpty(j2) || (nVar = this.w) == null || nVar.aa() == null) {
            return j2;
        }
        String b2 = this.w.aa().b();
        double d2 = this.w.aa().d();
        int e2 = this.w.aa().e();
        String a2 = (this.w.M() == null || TextUtils.isEmpty(this.w.M().a())) ? "" : this.w.M().a();
        String Y = this.w.Y();
        String c2 = this.w.aa().c();
        String a3 = this.w.aa().a();
        String b3 = this.w.aa().b();
        StringBuffer stringBuffer = new StringBuffer(j2);
        stringBuffer.append("?appname=");
        stringBuffer.append(b2);
        stringBuffer.append("&stars=");
        stringBuffer.append(d2);
        stringBuffer.append("&comments=");
        stringBuffer.append(e2);
        stringBuffer.append("&icon=");
        stringBuffer.append(a2);
        stringBuffer.append("&downloading=");
        stringBuffer.append(false);
        stringBuffer.append("&id=");
        stringBuffer.append(Y);
        stringBuffer.append("&pkg_name=");
        stringBuffer.append(c2);
        stringBuffer.append("&download_url=");
        stringBuffer.append(a3);
        stringBuffer.append("&name=");
        stringBuffer.append(b3);
        return stringBuffer.toString();
    }

    private void l() {
        ArrayList arrayList = new ArrayList();
        arrayList.add(this.w);
        this.H = new u(3, "embeded_ad", this.w);
        w wVar = new w(this);
        this.q = wVar;
        wVar.b(this.f106d).a(this.w).a((List<com.bytedance.sdk.openadsdk.core.e.n>) arrayList).d(this.o).e(this.p).c("embeded_ad").b(this.s).a((d) this).a(this.H).a(this.f105c).a(this.f106d).f(com.bytedance.sdk.openadsdk.utils.u.i(this.w));
        w wVar2 = new w(this);
        this.r = wVar2;
        wVar2.b(this.f107e).a(this.w).d(this.o).e(this.p).a((d) this).b(this.s).c(false).a(this.H).a(this.f107e).f(com.bytedance.sdk.openadsdk.utils.u.i(this.w));
        d();
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        u uVar = this.H;
        if (uVar != null) {
            uVar.k();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        super.onResume();
        w wVar = this.q;
        if (wVar != null) {
            wVar.l();
            SSWebView sSWebView = this.f106d;
            if (sSWebView != null) {
                this.q.b(sSWebView.getVisibility() == 0);
            }
        }
        w wVar2 = this.r;
        if (wVar2 != null) {
            wVar2.l();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.r();
            this.F.b(true);
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.d();
        }
        com.bytedance.sdk.openadsdk.g.g gVar2 = this.f104b;
        if (gVar2 != null) {
            gVar2.a((com.bytedance.sdk.openadsdk.g.f) this);
            this.f104b.e();
            if (this.f104b.g() == 0) {
                this.G = true;
            }
            b(this.G);
        }
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        com.bytedance.sdk.openadsdk.core.t.a().b(true);
        w wVar = this.q;
        if (wVar != null) {
            wVar.m();
            this.q.b(false);
        }
        w wVar2 = this.r;
        if (wVar2 != null) {
            wVar2.m();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.a(true);
            this.F.q();
            this.F.b(false);
        }
        com.bytedance.sdk.openadsdk.g.g gVar2 = this.f104b;
        if (gVar2 != null) {
            gVar2.f();
            this.f104b.a((com.bytedance.sdk.openadsdk.g.f) null);
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        u uVar = this.H;
        if (uVar != null) {
            uVar.j();
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void onBackPressed() {
        super.onBackPressed();
        u uVar = this.H;
        if (uVar != null) {
            uVar.i();
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        ViewGroup viewGroup;
        super.onDestroy();
        u uVar = this.H;
        if (uVar != null) {
            uVar.a(true);
            this.H.m();
        }
        x xVar = this.x;
        if (xVar != null) {
            xVar.removeCallbacksAndMessages((Object) null);
        }
        try {
            if (!(getWindow() == null || (viewGroup = (ViewGroup) getWindow().getDecorView()) == null)) {
                viewGroup.removeAllViews();
            }
        } catch (Throwable unused) {
        }
        SSWebView sSWebView = this.f106d;
        if (sSWebView != null) {
            z.a(this.k, sSWebView.getWebView());
            z.a(this.f106d.getWebView());
            this.f106d.l();
        }
        this.f106d = null;
        w wVar = this.q;
        if (wVar != null) {
            wVar.n();
        }
        w wVar2 = this.r;
        if (wVar2 != null) {
            wVar2.n();
        }
        g gVar = this.F;
        if (gVar != null) {
            gVar.v();
        }
        n nVar = this.I;
        if (nVar != null) {
            nVar.f();
        }
        this.f104b = null;
    }

    public void a(Message message) {
        int i2 = message.what;
        if (i2 == 1) {
            v.a((View) this.f110h, 0);
        } else if (i2 == 2) {
            l.a("playable hidden loading , type:" + message.arg1);
            HashMap hashMap = new HashMap();
            hashMap.put("remove_loading_page_type", Integer.valueOf(message.arg1));
            hashMap.put("playable_url", this.t);
            e.e((Context) this, this.w, "embeded_ad", "remove_loading_page", (Map<String, Object>) hashMap);
            this.x.removeMessages(2);
            PlayableLoadingView playableLoadingView = this.n;
            if (playableLoadingView != null) {
                playableLoadingView.a();
            }
        }
    }

    public void a(boolean z2) {
        com.com.bytedance.overseas.sdk.a.c cVar;
        this.y = true;
        this.z = z2;
        if (!z2) {
            try {
                Toast.makeText(this.k, t.a(m.a(), "tt_toast_later_download"), 0).show();
            } catch (Throwable unused) {
            }
        }
        if (this.z && (cVar = this.A) != null) {
            cVar.d();
        }
    }

    /* access modifiers changed from: protected */
    public void b() {
        if (this.w != null && !isFinishing()) {
            if (this.f103a == null) {
                c();
            }
            this.f103a.showDislikeDialog();
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
        this.f103a = new com.bytedance.sdk.openadsdk.dislike.b(this, this.w);
    }

    /* access modifiers changed from: protected */
    public void b(boolean z2) {
        int i2;
        try {
            this.G = z2;
            if (z2) {
                i2 = t.d(this.k, "tt_mute");
            } else {
                i2 = t.d(this.k, "tt_unmute");
            }
            this.j.setImageResource(i2);
            if (this.F != null) {
                this.F.a(z2);
            }
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void b(int i2) {
        b(i2 <= 0);
    }
}
