package com.bytedance.sdk.openadsdk.component.reward.a;

import android.app.Activity;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.text.TextUtils;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.DownloadListener;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import com.bytedance.sdk.component.a.r;
import com.bytedance.sdk.component.adexpress.c.c;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.t;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.BuildConfig;
import com.bytedance.sdk.openadsdk.b.n;
import com.bytedance.sdk.openadsdk.b.u;
import com.bytedance.sdk.openadsdk.core.b.c;
import com.bytedance.sdk.openadsdk.core.e.p;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.core.w;
import com.bytedance.sdk.openadsdk.core.widget.a.d;
import com.bytedance.sdk.openadsdk.g.e;
import com.bytedance.sdk.openadsdk.g.h;
import com.bytedance.sdk.openadsdk.h.b;
import com.bytedance.sdk.openadsdk.j.f;
import com.bytedance.sdk.openadsdk.j.g;
import com.bytedance.sdk.openadsdk.utils.i;
import com.bytedance.sdk.openadsdk.utils.j;
import com.bytedance.sdk.openadsdk.utils.v;
import io.bidmachine.utils.IabUtils;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: RewardFullWebViewManager */
public class f {
    private static final f.a I = new f.a() {
        public void a(String str, String str2) {
            l.b(str, str2);
        }

        public void a(String str, String str2, Throwable th) {
            l.c(str, str2, th);
        }
    };
    /* access modifiers changed from: private */
    public float A;
    /* access modifiers changed from: private */
    public long B;
    /* access modifiers changed from: private */
    public SparseArray<c.a> C = new SparseArray<>();
    /* access modifiers changed from: private */
    public boolean D = true;
    /* access modifiers changed from: private */
    public float E = -1.0f;
    /* access modifiers changed from: private */
    public float F = -1.0f;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.common.c G;
    /* access modifiers changed from: private */
    public boolean H;

    /* renamed from: a  reason: collision with root package name */
    w f629a;

    /* renamed from: b  reason: collision with root package name */
    w f630b;

    /* renamed from: c  reason: collision with root package name */
    protected boolean f631c = true;

    /* renamed from: d  reason: collision with root package name */
    protected String f632d;

    /* renamed from: e  reason: collision with root package name */
    n f633e;

    /* renamed from: f  reason: collision with root package name */
    AtomicBoolean f634f = new AtomicBoolean(true);

    /* renamed from: g  reason: collision with root package name */
    int f635g = 0;

    /* renamed from: h  reason: collision with root package name */
    String f636h = "";
    protected u i;
    boolean j = false;
    protected com.bytedance.sdk.openadsdk.g.a k = new com.bytedance.sdk.openadsdk.g.a() {
        public int a() {
            int measuredHeight = f.this.s != null ? f.this.s.getMeasuredHeight() : -1;
            l.c("TTAndroidObject", "mWebView>>>>height=" + measuredHeight);
            return measuredHeight <= 0 ? v.d(m.a()) : measuredHeight;
        }

        public int b() {
            int measuredWidth = f.this.s != null ? f.this.s.getMeasuredWidth() : -1;
            l.c("TTAndroidObject", "mWebView>>>>width=" + measuredWidth);
            return measuredWidth <= 0 ? v.c(m.a()) : measuredWidth;
        }
    };
    /* access modifiers changed from: private */
    public Activity l;
    /* access modifiers changed from: private */
    public com.bytedance.sdk.openadsdk.core.e.n m;
    /* access modifiers changed from: private */
    public String n;
    private int o;
    /* access modifiers changed from: private */
    public boolean p;
    private int q;
    private int r;
    /* access modifiers changed from: private */
    public SSWebView s;
    private SSWebView t;
    /* access modifiers changed from: private */
    public boolean u = false;
    private boolean v = false;
    /* access modifiers changed from: private */
    public g w;
    /* access modifiers changed from: private */
    public View x;
    /* access modifiers changed from: private */
    public View y;
    /* access modifiers changed from: private */
    public float z;

    /* compiled from: RewardFullWebViewManager */
    public interface a {
        void a(WebView webView, int i);

        void a(WebView webView, String str);

        void a(WebView webView, String str, Bitmap bitmap);
    }

    public void q() {
    }

    public f(Activity activity) {
        this.l = activity;
    }

    public void a(com.bytedance.sdk.openadsdk.core.e.n nVar, String str, int i2, boolean z2) {
        if (!this.v) {
            this.v = true;
            this.m = nVar;
            this.n = str;
            this.o = i2;
            this.p = z2;
            a();
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        com.bytedance.sdk.openadsdk.common.c cVar;
        this.x = this.l.findViewById(16908290);
        boolean d2 = com.bytedance.sdk.openadsdk.core.e.l.d(this.m);
        this.H = d2;
        if (!d2 || (cVar = this.G) == null) {
            Activity activity = this.l;
            SSWebView sSWebView = (SSWebView) activity.findViewById(t.e(activity, "tt_reward_browser_webview"));
            this.s = sSWebView;
            if (sSWebView == null || com.bytedance.sdk.openadsdk.core.e.n.a(this.m)) {
                v.a((View) this.s, 8);
            } else {
                this.s.a();
            }
        } else {
            this.s = cVar.d();
        }
        Activity activity2 = this.l;
        SSWebView sSWebView2 = (SSWebView) activity2.findViewById(t.e(activity2, "tt_browser_webview_loading"));
        this.t = sSWebView2;
        if (sSWebView2 == null || com.bytedance.sdk.openadsdk.core.e.n.a(this.m)) {
            v.a((View) this.t, 8);
        } else {
            this.t.a();
        }
        SSWebView sSWebView3 = this.s;
        if (sSWebView3 != null) {
            sSWebView3.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener() {
                public void onGlobalLayout() {
                    if (f.this.s != null && f.this.s.getViewTreeObserver() != null) {
                        if (Build.VERSION.SDK_INT >= 16) {
                            f.this.s.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                        } else {
                            f.this.s.getViewTreeObserver().removeGlobalOnLayoutListener(this);
                        }
                        int measuredWidth = f.this.s.getMeasuredWidth();
                        int measuredHeight = f.this.s.getMeasuredHeight();
                        if (f.this.s.getVisibility() == 0) {
                            f.this.a(measuredWidth, measuredHeight);
                        }
                    }
                }
            });
        }
        SSWebView sSWebView4 = this.t;
        if (sSWebView4 != null) {
            sSWebView4.setLandingPage(true);
            this.t.setTag(p.a(this.m) ? this.n : "landingpage_endcard");
            this.t.setWebViewClient(new SSWebView.a());
            com.bytedance.sdk.openadsdk.core.e.n nVar = this.m;
            if (nVar != null) {
                this.t.setMaterialMeta(nVar.aC());
            }
        }
    }

    public void a(Boolean bool, String str, boolean z2, e eVar, String str2) {
        HashMap hashMap = new HashMap();
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("rit_scene", str);
        }
        if (p.a(this.m)) {
            hashMap.put("click_scence", 3);
        } else {
            hashMap.put("click_scence", 2);
        }
        this.i = A();
        w wVar = new w(this.l);
        this.f629a = wVar;
        int i2 = 7;
        w a2 = wVar.b(this.s).a(this.m).d(this.m.Y()).e(this.m.ac()).b(bool.booleanValue() ? 7 : 5).a(this.k).f(com.bytedance.sdk.openadsdk.utils.u.i(this.m)).a(this.s);
        if (z()) {
            str2 = "landingpage_endcard";
        }
        a2.c(str2).a((Map<String, Object>) hashMap).a(this.i);
        w wVar2 = new w(this.l);
        this.f630b = wVar2;
        w e2 = wVar2.b(this.t).a(this.m).d(this.m.Y()).e(this.m.ac());
        if (!bool.booleanValue()) {
            i2 = 5;
        }
        e2.b(i2).a(this.t).f(com.bytedance.sdk.openadsdk.utils.u.i(this.m)).a(this.i);
        if (p.a(this.m)) {
            a(eVar, z2);
        }
        this.f629a.a((h) new h() {
            public void a() {
                SSWebView a2 = f.this.s;
                if (a2 == null) {
                    l.b("RewardFullWebViewManage", "webView has destroy when onPauseWebView");
                    return;
                }
                a2.k();
                l.b("RewardFullWebViewManage", "js make webView onPause OK");
            }

            public void b() {
                SSWebView a2 = f.this.s;
                if (a2 == null) {
                    l.b("RewardFullWebViewManage", "webView has destroy when onPauseWebViewTimers");
                    return;
                }
                a2.n();
                l.b("RewardFullWebViewManage", "js make webView pauseTimers OK");
            }
        });
    }

    public void a(final e eVar, boolean z2) {
        r a2;
        AnonymousClass9 r7;
        if (com.bytedance.sdk.openadsdk.core.h.d().s()) {
            com.bytedance.sdk.openadsdk.j.f.a(I);
        }
        AnonymousClass7 r1 = new com.bytedance.sdk.openadsdk.j.a() {
            public void a(JSONObject jSONObject) {
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
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.a.f.AnonymousClass7.a():com.bytedance.sdk.openadsdk.j.d");
            }

            public void b() {
                f.this.f629a.d(true);
                e eVar = eVar;
                if (eVar != null) {
                    eVar.a();
                }
            }

            public void c(JSONObject jSONObject) {
                com.bytedance.sdk.openadsdk.b.e.b(m.a(), f.this.m, f.this.n, "playable_track", jSONObject);
            }
        };
        AnonymousClass8 r72 = new com.bytedance.sdk.openadsdk.j.c() {
            public void a(String str, JSONObject jSONObject) {
                f.this.f629a.a(str, jSONObject);
            }
        };
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("cid", this.m.Y());
            jSONObject.put("log_extra", this.m.ac());
            g a3 = g.a(m.a(), this.s.getWebView(), r72, r1).f(this.f632d).e(com.bytedance.sdk.openadsdk.common.a.a(m.a())).a(com.bytedance.sdk.openadsdk.common.a.a()).a(jSONObject).a("sdkEdition", com.bytedance.sdk.openadsdk.common.a.c()).b(com.bytedance.sdk.openadsdk.common.a.e()).d(com.bytedance.sdk.openadsdk.common.a.d()).c(false).a(z2);
            this.w = a3;
            if (a3 == null) {
                r7 = new com.bytedance.sdk.component.f.g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            b.a().a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
                com.bytedance.sdk.component.f.e.a(r7, 5);
            }
        } catch (Throwable unused) {
            if (this.w == null) {
                r7 = new com.bytedance.sdk.component.f.g("PlayablePlugin_init") {
                    public void run() {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            jSONObject.put("PlayablePlugin_is_null", true);
                            b.a().a("PlayablePlugin_init", jSONObject);
                        } catch (Exception unused) {
                        }
                    }
                };
            }
        }
        if (this.w != null && !TextUtils.isEmpty(p.b(this.m))) {
            this.w.c(p.b(this.m));
        }
        g gVar = this.w;
        if (gVar != null) {
            Set<String> j2 = gVar.j();
            final WeakReference weakReference = new WeakReference(this.w);
            for (String next : j2) {
                if (!"subscribe_app_ad".equals(next) && !"adInfo".equals(next) && !"webview_time_track".equals(next) && !"download_app_ad".equals(next) && (a2 = this.f629a.a()) != null) {
                    a2.a(next, (com.bytedance.sdk.component.a.e<?, ?>) new com.bytedance.sdk.component.a.e<JSONObject, JSONObject>() {
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

    public void a(int i2, int i3) {
        Activity activity;
        if (this.f629a != null && (activity = this.l) != null && !activity.isFinishing()) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put(IabUtils.KEY_WIDTH, i2);
                jSONObject.put(IabUtils.KEY_HEIGHT, i3);
                this.f629a.a("resize", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(boolean z2) {
        this.f631c = z2;
    }

    public void b() {
        if (TextUtils.isEmpty(this.f632d) || !this.f632d.contains("play.google.com/store")) {
            SSWebView sSWebView = this.s;
            if (sSWebView != null && this.f631c) {
                j.a(sSWebView, this.f632d + "&is_pre_render=1");
                return;
            }
            return;
        }
        this.j = true;
    }

    public void b(int i2, int i3) {
        this.q = i2;
        this.r = i3;
    }

    public SSWebView c() {
        return this.s;
    }

    public SSWebView d() {
        return this.t;
    }

    public w e() {
        return this.f629a;
    }

    public w f() {
        return this.f630b;
    }

    public n g() {
        return this.f633e;
    }

    public void h() {
        this.f632d = p.d(this.m);
        float an = this.m.an();
        if (!TextUtils.isEmpty(this.f632d)) {
            if (this.o == 1) {
                if (this.f632d.contains("?")) {
                    this.f632d += "&orientation=portrait";
                } else {
                    this.f632d += "?orientation=portrait";
                }
            }
            if (this.f632d.contains("?")) {
                this.f632d += "&height=" + this.r + "&width=" + this.q + "&aspect_ratio=" + an;
            } else {
                this.f632d += "?height=" + this.r + "&width=" + this.q + "&aspect_ratio=" + an;
            }
        }
        if (!p.a(this.m)) {
            this.f632d = com.bytedance.sdk.openadsdk.utils.b.a(this.f632d);
        }
    }

    public void i() {
        SSWebView sSWebView;
        n nVar = this.f633e;
        if (!(nVar == null || (sSWebView = this.s) == null)) {
            nVar.a(sSWebView);
        }
        this.s = null;
        u uVar = this.i;
        if (uVar != null) {
            uVar.a(true);
            this.i.m();
        }
        w wVar = this.f629a;
        if (wVar != null) {
            wVar.n();
        }
        n nVar2 = this.f633e;
        if (nVar2 != null) {
            nVar2.f();
        }
        g gVar = this.w;
        if (gVar != null) {
            gVar.v();
        }
        this.l = null;
    }

    public void a(int i2) {
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        v.a((View) this.s, i2);
        SSWebView sSWebView = this.s;
        if (sSWebView != null) {
            v.a((View) sSWebView.getWebView(), i2);
        }
        if (this.s != null && (nVar = this.m) != null) {
            if (nVar.E() || p.a(this.m)) {
                this.s.setLandingPage(true);
                this.s.setTag(p.a(this.m) ? this.n : "landingpage_endcard");
                com.bytedance.sdk.openadsdk.core.e.n nVar2 = this.m;
                if (nVar2 != null) {
                    this.s.setMaterialMeta(nVar2.aC());
                }
            }
        }
    }

    public void a(com.bytedance.sdk.openadsdk.common.c cVar) {
        this.G = cVar;
    }

    public void a(float f2) {
        v.a((View) this.s, f2);
    }

    public void b(boolean z2) {
        Activity activity;
        if (this.f629a != null && (activity = this.l) != null && !activity.isFinishing()) {
            try {
                this.f629a.b(z2);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void a(String str, final a aVar) {
        SSWebView sSWebView;
        SSWebView sSWebView2 = this.s;
        if (!(sSWebView2 == null || sSWebView2.getWebView() == null)) {
            n a2 = new n(this.l, this.m, this.s.getWebView()).a(true);
            this.f633e = a2;
            a2.a(true);
            n nVar = this.f633e;
            if (z()) {
                str = "landingpage_endcard";
            }
            nVar.a(str);
            final a aVar2 = aVar;
            this.s.setWebViewClient(new d(m.a(), this.f629a, this.m.Y(), this.f633e, this.m.E() || p.a(this.m)) {
                public WebResourceResponse shouldInterceptRequest(WebView webView, String str) {
                    if (!p.a(f.this.m)) {
                        return super.shouldInterceptRequest(webView, str);
                    }
                    long currentTimeMillis = System.currentTimeMillis();
                    WebResourceResponse a2 = com.bytedance.sdk.openadsdk.core.video.b.a.a().a(f.this.m.J().k(), f.this.m.J().j(), str);
                    long currentTimeMillis2 = System.currentTimeMillis();
                    if (f.this.i != null) {
                        c.a a3 = com.bytedance.sdk.component.adexpress.c.c.a(str);
                        int i = a2 != null ? 1 : 2;
                        if (a3 == c.a.HTML) {
                            f.this.i.a(str, currentTimeMillis, currentTimeMillis2, i);
                        } else if (a3 == c.a.JS) {
                            f.this.i.b(str, currentTimeMillis, currentTimeMillis2, i);
                        }
                    }
                    return a2;
                }

                public WebResourceResponse shouldInterceptRequest(WebView webView, WebResourceRequest webResourceRequest) {
                    try {
                        return shouldInterceptRequest(webView, webResourceRequest.getUrl().toString());
                    } catch (Throwable th) {
                        l.c("RewardFullWebViewManage", "shouldInterceptRequest error1", th);
                        return super.shouldInterceptRequest(webView, webResourceRequest);
                    }
                }

                public void onReceivedError(WebView webView, int i, String str, String str2) {
                    Log.i("RewardFullWebViewManage", "onReceivedError: description=" + str + "  url =" + str2);
                    if (!f.this.a(str2)) {
                        f.this.f634f.set(false);
                        f.this.f635g = i;
                        f.this.f636h = str;
                        try {
                            if (f.this.w != null) {
                                f.this.w.a(i, str, str2);
                            }
                        } catch (Throwable unused) {
                        }
                        if (f.this.i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23) {
                                    jSONObject.put("code", i);
                                    jSONObject.put("msg", str);
                                }
                                f.this.i.a(jSONObject);
                            } catch (JSONException unused2) {
                            }
                        }
                        super.onReceivedError(webView, i, str, str2);
                    }
                }

                public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
                    if (!(webResourceError == null || webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedError WebResourceError : description=" + webResourceError.getDescription() + "  url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest == null || webResourceRequest.getUrl() == null || !f.this.a(webResourceRequest.getUrl().toString())) {
                        f.this.f634f.set(false);
                        if (f.this.i != null) {
                            try {
                                JSONObject jSONObject = new JSONObject();
                                if (Build.VERSION.SDK_INT >= 23 && webResourceError != null) {
                                    jSONObject.put("code", webResourceError.getErrorCode());
                                    jSONObject.put("msg", webResourceError.getDescription());
                                }
                                f.this.i.a(jSONObject);
                            } catch (JSONException unused) {
                            }
                        }
                        if (webResourceError != null) {
                            f.this.f635g = webResourceError.getErrorCode();
                            f.this.f636h = String.valueOf(webResourceError.getDescription());
                        }
                        if (webResourceRequest != null) {
                            super.onReceivedError(webView, webResourceRequest, webResourceError);
                        }
                    }
                }

                public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
                    try {
                        if (f.this.w != null) {
                            f.this.w.a(webResourceRequest.isForMainFrame(), webResourceRequest.getUrl().toString(), webResourceResponse.getStatusCode());
                        }
                    } catch (Throwable unused) {
                    }
                    if (!(webResourceRequest == null || webResourceRequest.getUrl() == null)) {
                        Log.i("RewardFullWebViewManage", "onReceivedHttpError:url =" + webResourceRequest.getUrl().toString());
                    }
                    if (webResourceRequest != null && !TextUtils.isEmpty(f.this.f632d) && f.this.f632d.equals(String.valueOf(webResourceRequest.getUrl()))) {
                        f.this.f634f.set(false);
                        if (webResourceResponse != null) {
                            f.this.f635g = webResourceResponse.getStatusCode();
                            f.this.f636h = "onReceivedHttpError";
                        }
                    }
                    if (f.this.i != null) {
                        try {
                            JSONObject jSONObject = new JSONObject();
                            if (Build.VERSION.SDK_INT >= 21 && webResourceResponse != null) {
                                jSONObject.put("code", webResourceResponse.getStatusCode());
                                jSONObject.put("msg", webResourceResponse.getReasonPhrase());
                            }
                            f.this.i.a(jSONObject);
                        } catch (JSONException unused2) {
                        }
                    }
                    if (webResourceRequest != null) {
                        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
                    }
                }

                public void onPageFinished(WebView webView, String str) {
                    super.onPageFinished(webView, str);
                    if (f.this.i != null) {
                        f.this.i.f();
                    }
                    if (f.this.w != null) {
                        f.this.w.h(str);
                    }
                    a aVar = aVar2;
                    if (aVar != null) {
                        aVar.a(webView, str);
                    }
                }

                public void onPageStarted(WebView webView, String str, Bitmap bitmap) {
                    super.onPageStarted(webView, str, bitmap);
                    if (f.this.i != null) {
                        f.this.i.e();
                    }
                    if (f.this.w != null) {
                        f.this.w.g(str);
                    }
                    a aVar = aVar2;
                    if (aVar != null) {
                        aVar.a(webView, str, bitmap);
                    }
                }
            });
            if (!(!this.m.E() || (sSWebView = this.s) == null || sSWebView.getWebView() == null)) {
                this.s.getWebView().setOnTouchListener(new View.OnTouchListener() {
                    /* JADX WARNING: Can't wrap try/catch for region: R(6:32|33|34|(1:38)|39|40) */
                    /* JADX WARNING: Missing exception handler attribute for start block: B:39:0x0152 */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public boolean onTouch(android.view.View r20, android.view.MotionEvent r21) {
                        /*
                            r19 = this;
                            r1 = r19
                            java.lang.String r0 = "tt_id_click_end"
                            java.lang.String r2 = "tt_id_click_begin"
                            r3 = 0
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            r5 = 0
                            r7 = 3
                            r8 = -1
                            r9 = 2
                            r10 = 1
                            if (r4 == 0) goto L_0x00e9
                            if (r4 == r10) goto L_0x00e7
                            if (r4 == r9) goto L_0x0020
                            if (r4 == r7) goto L_0x001c
                            r12 = -1
                            goto L_0x015f
                        L_0x001c:
                            r7 = 4
                            r12 = 4
                            goto L_0x015f
                        L_0x0020:
                            float r2 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float r4 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.z     // Catch:{ all -> 0x0360 }
                            float r2 = r2 - r7
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.m.f1375a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 >= 0) goto L_0x004d
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.A     // Catch:{ all -> 0x0360 }
                            float r2 = r4 - r2
                            float r2 = java.lang.Math.abs(r2)     // Catch:{ all -> 0x0360 }
                            int r7 = com.bytedance.sdk.openadsdk.core.m.f1375a     // Catch:{ all -> 0x0360 }
                            float r7 = (float) r7     // Catch:{ all -> 0x0360 }
                            int r2 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
                            if (r2 < 0) goto L_0x0052
                        L_0x004d:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r2.D = r3     // Catch:{ all -> 0x0360 }
                        L_0x0052:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.E     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getX()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.z     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.E = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.F     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getY()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r12 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r12 = r12.A     // Catch:{ all -> 0x0360 }
                            float r11 = r11 - r12
                            float r11 = java.lang.Math.abs(r11)     // Catch:{ all -> 0x0360 }
                            float r7 = r7 + r11
                            float unused = r2.F = r7     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            long r13 = r2.B     // Catch:{ all -> 0x0360 }
                            long r11 = r11 - r13
                            r13 = 200(0xc8, double:9.9E-322)
                            r2 = 1090519040(0x41000000, float:8.0)
                            int r7 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00b1
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.E     // Catch:{ all -> 0x0360 }
                            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                            if (r7 > 0) goto L_0x00af
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.F     // Catch:{ all -> 0x0360 }
                            int r7 = (r7 > r2 ? 1 : (r7 == r2 ? 0 : -1))
                            if (r7 <= 0) goto L_0x00b1
                        L_0x00af:
                            r7 = 1
                            goto L_0x00b2
                        L_0x00b1:
                            r7 = 2
                        L_0x00b2:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean r11 = r11.H     // Catch:{ all -> 0x0360 }
                            if (r11 == 0) goto L_0x00e5
                            com.bytedance.sdk.openadsdk.component.reward.a.f r11 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r11 = r11.A     // Catch:{ all -> 0x0360 }
                            float r11 = r4 - r11
                            int r2 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
                            if (r2 <= 0) goto L_0x00cf
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r2 = r2.G     // Catch:{ all -> 0x0360 }
                            r2.a()     // Catch:{ all -> 0x0360 }
                        L_0x00cf:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r2 = r2.A     // Catch:{ all -> 0x0360 }
                            float r4 = r4 - r2
                            r2 = -1056964608(0xffffffffc1000000, float:-8.0)
                            int r2 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
                            if (r2 >= 0) goto L_0x00e5
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.common.c r2 = r2.G     // Catch:{ all -> 0x0360 }
                            r2.b()     // Catch:{ all -> 0x0360 }
                        L_0x00e5:
                            r12 = r7
                            goto L_0x015f
                        L_0x00e7:
                            r12 = 3
                            goto L_0x015f
                        L_0x00e9:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r7 = new android.util.SparseArray     // Catch:{ all -> 0x0360 }
                            r7.<init>()     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray unused = r4.C = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            float unused = r4.z = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            float unused = r4.A = r7     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            long r11 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            long unused = r4.B = r11     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.s     // Catch:{ Exception -> 0x0152 }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ Exception -> 0x0152 }
                            int r7 = com.bytedance.sdk.component.utils.t.e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Object r4 = r4.getTag(r7)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x0152 }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x0152 }
                            long r13 = r4.B     // Catch:{ Exception -> 0x0152 }
                            int r4 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
                            if (r4 >= 0) goto L_0x0152
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x0152 }
                            long unused = r4.B = r11     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x0152 }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.s     // Catch:{ Exception -> 0x0152 }
                            android.content.Context r7 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ Exception -> 0x0152 }
                            int r2 = com.bytedance.sdk.component.utils.t.e(r7, r2)     // Catch:{ Exception -> 0x0152 }
                            java.lang.Integer r7 = java.lang.Integer.valueOf(r8)     // Catch:{ Exception -> 0x0152 }
                            r4.setTag(r2, r7)     // Catch:{ Exception -> 0x0152 }
                        L_0x0152:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            r4 = -1082130432(0xffffffffbf800000, float:-1.0)
                            float unused = r2.E = r4     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float unused = r2.F = r4     // Catch:{ all -> 0x0360 }
                            r12 = 0
                        L_0x015f:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r2 = r2.C     // Catch:{ all -> 0x0360 }
                            int r4 = r21.getActionMasked()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.b.c$a r7 = new com.bytedance.sdk.openadsdk.core.b.c$a     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getSize()     // Catch:{ all -> 0x0360 }
                            double r13 = (double) r11     // Catch:{ all -> 0x0360 }
                            float r11 = r21.getPressure()     // Catch:{ all -> 0x0360 }
                            double r8 = (double) r11     // Catch:{ all -> 0x0360 }
                            long r17 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            r11 = r7
                            r15 = r8
                            r11.<init>(r12, r13, r15, r17)     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            int r2 = r21.getAction()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            int r2 = r20.getVisibility()     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            float r2 = r20.getAlpha()     // Catch:{ all -> 0x0360 }
                            java.lang.Float r2 = java.lang.Float.valueOf(r2)     // Catch:{ all -> 0x0360 }
                            int r2 = r2.intValue()     // Catch:{ all -> 0x0360 }
                            if (r2 != r10) goto L_0x0368
                            com.bytedance.sdk.openadsdk.component.reward.a.f r2 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean r2 = r2.u     // Catch:{ all -> 0x0360 }
                            if (r2 != 0) goto L_0x0368
                            org.json.JSONObject r2 = new org.json.JSONObject     // Catch:{ all -> 0x0360 }
                            r2.<init>()     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_x"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.z     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_y"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            float r7 = r7.A     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "down_time"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r7 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            long r7 = r7.B     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_x"
                            float r7 = r21.getRawX()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "up_y"
                            float r7 = r21.getRawY()     // Catch:{ all -> 0x0360 }
                            double r7 = (double) r7     // Catch:{ all -> 0x0360 }
                            r2.put(r4, r7)     // Catch:{ all -> 0x0360 }
                            long r7 = java.lang.System.currentTimeMillis()     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x021e }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.s     // Catch:{ Exception -> 0x021e }
                            android.webkit.WebView r4 = r4.getWebView()     // Catch:{ Exception -> 0x021e }
                            android.content.Context r9 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ Exception -> 0x021e }
                            int r9 = com.bytedance.sdk.component.utils.t.e(r9, r0)     // Catch:{ Exception -> 0x021e }
                            java.lang.Object r4 = r4.getTag(r9)     // Catch:{ Exception -> 0x021e }
                            java.lang.Long r4 = (java.lang.Long) r4     // Catch:{ Exception -> 0x021e }
                            long r11 = r4.longValue()     // Catch:{ Exception -> 0x021e }
                            int r4 = (r11 > r5 ? 1 : (r11 == r5 ? 0 : -1))
                            if (r4 <= 0) goto L_0x021e
                            int r4 = (r11 > r7 ? 1 : (r11 == r7 ? 0 : -1))
                            if (r4 >= 0) goto L_0x021e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ Exception -> 0x021d }
                            com.bytedance.sdk.component.widget.SSWebView r4 = r4.s     // Catch:{ Exception -> 0x021d }
                            android.content.Context r5 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ Exception -> 0x021d }
                            int r0 = com.bytedance.sdk.component.utils.t.e(r5, r0)     // Catch:{ Exception -> 0x021d }
                            r5 = -1
                            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)     // Catch:{ Exception -> 0x021d }
                            r4.setTag(r0, r5)     // Catch:{ Exception -> 0x021d }
                        L_0x021d:
                            r7 = r11
                        L_0x021e:
                            java.lang.String r0 = "up_time"
                            r2.put(r0, r7)     // Catch:{ all -> 0x0360 }
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.H     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x0248
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_title_bar_feedback"
                            int r6 = com.bytedance.sdk.component.utils.t.e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.y = r5     // Catch:{ all -> 0x0360 }
                            goto L_0x0261
                        L_0x0248:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r5 = r5.l     // Catch:{ all -> 0x0360 }
                            android.content.Context r6 = com.bytedance.sdk.openadsdk.core.m.a()     // Catch:{ all -> 0x0360 }
                            java.lang.String r7 = "tt_top_dislike"
                            int r6 = com.bytedance.sdk.component.utils.t.e(r6, r7)     // Catch:{ all -> 0x0360 }
                            android.view.View r5 = r5.findViewById(r6)     // Catch:{ all -> 0x0360 }
                            android.view.View unused = r0.y = r5     // Catch:{ all -> 0x0360 }
                        L_0x0261:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.y     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x029e
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.y     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "button_height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.y     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x029e:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.x     // Catch:{ all -> 0x0360 }
                            if (r0 == 0) goto L_0x02de
                            r0 = 2
                            int[] r4 = new int[r0]     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r0 = r0.x     // Catch:{ all -> 0x0360 }
                            r0.getLocationOnScreen(r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_x"
                            r5 = r4[r3]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ad_y"
                            r4 = r4[r10]     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "width"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getWidth()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "height"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.view.View r4 = r4.x     // Catch:{ all -> 0x0360 }
                            int r4 = r4.getHeight()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                        L_0x02de:
                            java.lang.String r0 = "toolType"
                            r4 = r21
                            int r5 = r4.getToolType(r3)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "deviceId"
                            int r5 = r21.getDeviceId()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r5)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "source"
                            int r4 = r21.getSource()     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "ft"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.util.SparseArray r4 = r4.C     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.h r5 = com.bytedance.sdk.openadsdk.core.h.d()     // Catch:{ all -> 0x0360 }
                            boolean r5 = r5.b()     // Catch:{ all -> 0x0360 }
                            if (r5 == 0) goto L_0x030f
                            r5 = 1
                            goto L_0x0310
                        L_0x030f:
                            r5 = 2
                        L_0x0310:
                            org.json.JSONObject r4 = com.bytedance.sdk.openadsdk.core.e.g.a(r4, r5)     // Catch:{ all -> 0x0360 }
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "user_behavior_type"
                            com.bytedance.sdk.openadsdk.component.reward.a.f r4 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean r4 = r4.D     // Catch:{ all -> 0x0360 }
                            if (r4 == 0) goto L_0x0323
                            r4 = 1
                            goto L_0x0324
                        L_0x0323:
                            r4 = 2
                        L_0x0324:
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            java.lang.String r0 = "click_scence"
                            r4 = 2
                            r2.put(r0, r4)     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean r0 = r0.p     // Catch:{ all -> 0x0360 }
                            java.lang.String r4 = "click"
                            if (r0 == 0) goto L_0x0349
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "rewarded_video"
                            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.e.n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                            goto L_0x035a
                        L_0x0349:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            android.app.Activity r0 = r0.l     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.component.reward.a.f r5 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            com.bytedance.sdk.openadsdk.core.e.n r5 = r5.m     // Catch:{ all -> 0x0360 }
                            java.lang.String r6 = "fullscreen_interstitial_ad"
                            com.bytedance.sdk.openadsdk.b.e.a((android.content.Context) r0, (com.bytedance.sdk.openadsdk.core.e.n) r5, (java.lang.String) r6, (java.lang.String) r4, (org.json.JSONObject) r2)     // Catch:{ all -> 0x0360 }
                        L_0x035a:
                            com.bytedance.sdk.openadsdk.component.reward.a.f r0 = com.bytedance.sdk.openadsdk.component.reward.a.f.this     // Catch:{ all -> 0x0360 }
                            boolean unused = r0.u = r10     // Catch:{ all -> 0x0360 }
                            goto L_0x0368
                        L_0x0360:
                            r0 = move-exception
                            java.lang.String r2 = "RewardFullWebViewManage"
                            java.lang.String r4 = "TouchRecordTool onTouch error"
                            android.util.Log.e(r2, r4, r0)
                        L_0x0368:
                            return r3
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.component.reward.a.f.AnonymousClass2.onTouch(android.view.View, android.view.MotionEvent):boolean");
                    }
                });
            }
            this.s.setWebChromeClient(new com.bytedance.sdk.openadsdk.core.widget.a.c(this.f629a, this.f633e) {
                public void onProgressChanged(WebView webView, int i) {
                    super.onProgressChanged(webView, i);
                    a aVar = aVar;
                    if (aVar != null) {
                        aVar.a(webView, i);
                    }
                }
            });
            a(this.s);
            if (Build.VERSION.SDK_INT >= 24) {
                this.s.setLayerType(1, (Paint) null);
            }
            this.s.setBackgroundColor(-1);
            this.s.setDisplayZoomControls(false);
        }
        b();
    }

    /* access modifiers changed from: private */
    public boolean a(String str) {
        if (TextUtils.isEmpty(str)) {
            return true;
        }
        com.bytedance.sdk.openadsdk.core.e.n nVar = this.m;
        if (nVar == null || !nVar.E() || !str.endsWith(".mp4")) {
            return false;
        }
        return true;
    }

    private boolean z() {
        String str = this.f632d;
        if (str == null) {
            return false;
        }
        try {
            return Uri.parse(str).getQueryParameterNames().contains("show_landingpage");
        } catch (Exception unused) {
            return false;
        }
    }

    public void a(DownloadListener downloadListener) {
        SSWebView sSWebView = this.s;
        if (sSWebView != null && downloadListener != null) {
            sSWebView.setDownloadListener(downloadListener);
        }
    }

    public boolean j() {
        return this.f634f.get();
    }

    public void a(SSWebView sSWebView) {
        if (sSWebView != null) {
            com.bytedance.sdk.openadsdk.core.widget.a.b.a((Context) this.l).a(false).b(false).a(sSWebView.getWebView());
            sSWebView.setUserAgentString(i.a(sSWebView.getWebView(), (int) BuildConfig.VERSION_CODE));
            if (Build.VERSION.SDK_INT >= 21) {
                sSWebView.setMixedContentMode(0);
            }
        }
    }

    public void k() {
        u uVar = this.i;
        if (uVar != null) {
            uVar.j();
        }
        n nVar = this.f633e;
        if (nVar != null) {
            nVar.e();
        }
    }

    public void l() {
        SSWebView sSWebView = this.s;
        if (sSWebView != null) {
            sSWebView.k();
        }
        w wVar = this.f629a;
        if (wVar != null) {
            wVar.m();
            this.f629a.b(false);
            c(false);
            a(true, false);
        }
        g gVar = this.w;
        if (gVar != null) {
            gVar.q();
            this.w.b(false);
        }
    }

    public void c(boolean z2) {
        try {
            if (this.w != null) {
                this.w.b(z2);
            }
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("viewStatus", z2 ? 1 : 0);
            this.f629a.a("viewableChange", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void a(boolean z2, boolean z3) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("endcard_mute", z2);
            jSONObject.put("endcard_show", z3);
            this.f629a.a("endcard_control_event", jSONObject);
        } catch (Exception e2) {
            e2.printStackTrace();
        }
    }

    public void d(boolean z2) {
        Activity activity;
        if (this.f629a != null && (activity = this.l) != null && !activity.isFinishing()) {
            g gVar = this.w;
            if (gVar != null) {
                gVar.a(z2);
            }
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("endcard_mute", z2);
                this.f629a.a("volumeChange", jSONObject);
            } catch (Exception e2) {
                e2.printStackTrace();
            }
        }
    }

    public void m() {
        SSWebView sSWebView = this.s;
        if (sSWebView != null) {
            sSWebView.i();
        }
        w wVar = this.f629a;
        if (wVar != null) {
            wVar.l();
            SSWebView sSWebView2 = this.s;
            if (sSWebView2 != null) {
                if (sSWebView2.getVisibility() == 0) {
                    this.f629a.b(true);
                    c(true);
                    a(false, true);
                } else {
                    this.f629a.b(false);
                    c(false);
                    a(true, false);
                }
            }
        }
        n nVar = this.f633e;
        if (nVar != null) {
            nVar.d();
        }
        g gVar = this.w;
        if (gVar != null) {
            gVar.r();
            if (v.d((View) this.s)) {
                this.w.b(true);
            }
        }
    }

    public int n() {
        return this.f635g;
    }

    public String o() {
        return this.f636h;
    }

    public String p() {
        return this.f632d;
    }

    public void r() {
        u uVar = this.i;
        if (uVar != null) {
            uVar.i();
        }
    }

    public void a(boolean z2, int i2, String str) {
        u uVar = this.i;
        if (uVar != null) {
            if (z2) {
                uVar.b();
            } else {
                uVar.a(i2, str);
            }
        }
    }

    public void s() {
        u uVar = this.i;
        if (uVar != null) {
            uVar.h();
        }
    }

    public void t() {
        n nVar = this.f633e;
        if (nVar != null) {
            nVar.a(System.currentTimeMillis());
        }
    }

    public boolean u() {
        return this.j;
    }

    public void v() {
        u uVar = this.i;
        if (uVar != null) {
            uVar.c();
            this.i.d();
        }
    }

    public void w() {
        u uVar = this.i;
        if (uVar != null) {
            uVar.k();
        }
    }

    private u A() {
        return new u(p.a(this.m) ? 3 : 2, this.p ? "rewarded_video" : "fullscreen_interstitial_ad", this.m);
    }

    public boolean x() {
        w wVar = this.f629a;
        if (wVar == null) {
            return false;
        }
        return wVar.j();
    }

    public boolean y() {
        SSWebView sSWebView = this.s;
        if (sSWebView == null || sSWebView.getWebView() == null) {
            return true;
        }
        return false;
    }
}
