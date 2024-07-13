package com.bytedance.sdk.openadsdk.b;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.text.TextUtils;
import android.webkit.JavascriptInterface;
import android.webkit.WebResourceRequest;
import android.webkit.WebView;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.widget.SSWebView;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.bytedance.sdk.openadsdk.core.m;
import com.bytedance.sdk.openadsdk.utils.v;
import java.util.Random;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: LandingPageLog */
public class n {

    /* renamed from: a  reason: collision with root package name */
    private static final int[] f330a = {10, 30, 50, 75, 100};

    /* renamed from: b  reason: collision with root package name */
    private int f331b = 0;

    /* renamed from: c  reason: collision with root package name */
    private long f332c = -1;

    /* renamed from: d  reason: collision with root package name */
    private int f333d = 1;

    /* renamed from: e  reason: collision with root package name */
    private AtomicBoolean f334e = new AtomicBoolean(false);

    /* renamed from: f  reason: collision with root package name */
    private AtomicBoolean f335f = new AtomicBoolean(false);

    /* renamed from: g  reason: collision with root package name */
    private int f336g = -1;

    /* renamed from: h  reason: collision with root package name */
    private String f337h;
    private String i;
    private final Context j = m.a();
    private final com.bytedance.sdk.openadsdk.core.e.n k;
    private String l = "landingpage";
    private long m = 0;
    private long n = 0;
    private long o = 0;
    private long p = 0;
    private long q = 0;
    private long r = 0;
    private boolean s = false;
    private boolean t = false;
    /* access modifiers changed from: private */
    public AtomicInteger u = new AtomicInteger(0);
    /* access modifiers changed from: private */
    public WebView v;
    private boolean w = false;
    /* access modifiers changed from: private */
    public String x = "";
    private u y;
    private boolean z = false;

    public com.bytedance.sdk.openadsdk.core.e.n a() {
        return this.k;
    }

    public n(Context context, com.bytedance.sdk.openadsdk.core.e.n nVar, WebView webView) {
        this.k = nVar;
        this.v = webView;
        if (webView != null) {
            if (Build.VERSION.SDK_INT >= 19) {
                this.v.addJavascriptInterface(new a(), "JS_LANDING_PAGE_LOG_OBJ");
            }
            if (nVar != null && nVar.aH() != null) {
                this.f332c = nVar.aH().optLong("page_id", -1);
            }
        }
    }

    public void a(long j2) {
        this.o = j2;
    }

    public void a(String str) {
        if (!TextUtils.isEmpty(str)) {
            this.l = str;
        }
    }

    public u b() {
        return this.y;
    }

    public void a(u uVar) {
        this.y = uVar;
    }

    public n a(boolean z2) {
        this.w = z2;
        return this;
    }

    public boolean c() {
        return this.z;
    }

    public void a(WebView webView, int i2) {
        if (webView != null) {
            l.b("LandingPageLog", "onWebProgress: " + i2);
            if (this.p == 0 && i2 > 0) {
                this.p = System.currentTimeMillis();
            } else if (this.q == 0 && i2 == 100) {
                this.q = System.currentTimeMillis();
            }
            if (this.f331b == f330a.length) {
                return;
            }
            if ("landingpage".equals(this.l) || "landingpage_endcard".equals(this.l) || "landingpage_split_screen".equals(this.l) || "landingpage_direct".equals(this.l)) {
                int i3 = this.f331b;
                while (true) {
                    int[] iArr = f330a;
                    if (i3 < iArr.length && i2 >= iArr[this.f331b]) {
                        int i4 = i3 + 1;
                        this.f331b = i4;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("url", webView.getUrl());
                            if (this.f332c != -1) {
                                jSONObject.put("page_id", this.f332c);
                            }
                            jSONObject.putOpt("render_type", "h5");
                            jSONObject.putOpt("render_type_2", 0);
                            jSONObject.put("pct", f330a[i3]);
                        } catch (Exception unused) {
                        }
                        a("progress_load_finish", jSONObject);
                        i3 = i4;
                    } else {
                        return;
                    }
                }
            }
        }
    }

    public void a(WebView webView, String str, Bitmap bitmap) {
        l.b("LandingPageLog", "onWebStarted: " + String.valueOf(str));
        u uVar = this.y;
        if (uVar != null) {
            uVar.e();
        }
        if (this.f334e.compareAndSet(false, true)) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.putOpt("render_type", "h5");
                jSONObject.putOpt("render_type_2", 0);
            } catch (Exception unused) {
            }
            a("load_start", jSONObject);
        }
    }

    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:24:0x0082 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(android.webkit.WebView r11, java.lang.String r12, boolean r13) {
        /*
            r10 = this;
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r1 = "onWebFinished: "
            r0.append(r1)
            java.lang.String r12 = java.lang.String.valueOf(r12)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            java.lang.String r0 = "LandingPageLog"
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r0, (java.lang.String) r12)
            com.bytedance.sdk.openadsdk.b.u r12 = r10.y
            if (r12 == 0) goto L_0x0021
            r12.f()
        L_0x0021:
            r12 = 1
            if (r11 == 0) goto L_0x0033
            boolean r0 = r10.s
            if (r0 != 0) goto L_0x0033
            boolean r0 = r10.w
            if (r0 == 0) goto L_0x0033
            r10.s = r12
            java.lang.String r0 = "javascript:\nfunction sendScroll(){\n   var totalH = document.body.scrollHeight || document.documentElement.scrollHeight;\n   var clientH = window.innerHeight || document.documentElement.clientHeight;\n   var scrollH = document.body.scrollTop || document.documentElement.scrollTop;\n   var validH = scrollH + clientH;\n   var result = (validH/totalH*100).toFixed(2);\n   console.log('LandingPageLogscroll status: (' + scrollH + '+' + clientH + ')/' + totalH + '=' + result);\n   window.JS_LANDING_PAGE_LOG_OBJ.readPercent(result);\n}\nsendScroll();\nwindow.addEventListener('scroll', function(e){\n    sendScroll();\n});"
            com.bytedance.sdk.component.utils.k.a(r11, r0)
        L_0x0033:
            java.util.concurrent.atomic.AtomicBoolean r11 = r10.f335f
            r0 = 0
            boolean r11 = r11.compareAndSet(r0, r12)
            if (r11 != 0) goto L_0x003d
            return
        L_0x003d:
            int r11 = r10.f333d
            r1 = 3
            r2 = 2
            if (r11 == r1) goto L_0x0045
            r10.f333d = r2
        L_0x0045:
            long r3 = java.lang.System.currentTimeMillis()
            r10.m = r3
            int r11 = r10.f333d
            if (r11 != r2) goto L_0x0050
            goto L_0x0051
        L_0x0050:
            r12 = 0
        L_0x0051:
            java.lang.String r11 = "render_type_2"
            java.lang.String r1 = "h5"
            java.lang.String r2 = "render_type"
            java.lang.String r3 = "error_url"
            java.lang.String r4 = "error_msg"
            java.lang.String r5 = "error_code"
            if (r12 == 0) goto L_0x00cd
            long r6 = r10.q
            long r8 = r10.p
            long r6 = r6 - r8
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r8 = r10.f336g     // Catch:{ Exception -> 0x0082 }
            r12.put(r5, r8)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r5 = r10.f337h     // Catch:{ Exception -> 0x0082 }
            r12.put(r4, r5)     // Catch:{ Exception -> 0x0082 }
            java.lang.String r4 = r10.i     // Catch:{ Exception -> 0x0082 }
            r12.put(r3, r4)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x0082 }
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x0082 }
            r12.putOpt(r11, r0)     // Catch:{ Exception -> 0x0082 }
        L_0x0082:
            com.bytedance.sdk.openadsdk.core.i.f r11 = com.bytedance.sdk.openadsdk.core.m.h()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.core.i.c r11 = r11.k()     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r13 = r11.f1240a     // Catch:{ all -> 0x00c0 }
            boolean r13 = android.text.TextUtils.isEmpty(r13)     // Catch:{ all -> 0x00c0 }
            if (r13 != 0) goto L_0x00c0
            boolean r13 = r11.f1241b     // Catch:{ all -> 0x00c0 }
            if (r13 == 0) goto L_0x00c0
            java.lang.String r11 = r11.f1240a     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.i.d r13 = com.bytedance.sdk.openadsdk.i.d.a()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.a r13 = r13.b()     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.component.e.b.b r13 = r13.c()     // Catch:{ all -> 0x00c0 }
            r13.a((java.lang.String) r11)     // Catch:{ all -> 0x00c0 }
            java.util.HashMap r11 = new java.util.HashMap     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            java.lang.String r0 = "content-type"
            java.lang.String r1 = "application/json; charset=utf-8"
            r11.put(r0, r1)     // Catch:{ all -> 0x00c0 }
            r13.d(r11)     // Catch:{ all -> 0x00c0 }
            com.bytedance.sdk.openadsdk.b.n$1 r11 = new com.bytedance.sdk.openadsdk.b.n$1     // Catch:{ all -> 0x00c0 }
            r11.<init>()     // Catch:{ all -> 0x00c0 }
            r13.a(r11)     // Catch:{ all -> 0x00c0 }
        L_0x00c0:
            r0 = 600000(0x927c0, double:2.964394E-318)
            long r0 = java.lang.Math.min(r6, r0)
            java.lang.String r11 = "load_finish"
            r10.a((java.lang.String) r11, (org.json.JSONObject) r12, (long) r0)
            goto L_0x00f0
        L_0x00cd:
            org.json.JSONObject r12 = new org.json.JSONObject
            r12.<init>()
            int r13 = r10.f336g     // Catch:{ Exception -> 0x00eb }
            r12.put(r5, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.f337h     // Catch:{ Exception -> 0x00eb }
            r12.put(r4, r13)     // Catch:{ Exception -> 0x00eb }
            java.lang.String r13 = r10.i     // Catch:{ Exception -> 0x00eb }
            r12.put(r3, r13)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r2, r1)     // Catch:{ Exception -> 0x00eb }
            java.lang.Integer r13 = java.lang.Integer.valueOf(r0)     // Catch:{ Exception -> 0x00eb }
            r12.putOpt(r11, r13)     // Catch:{ Exception -> 0x00eb }
        L_0x00eb:
            java.lang.String r11 = "load_fail"
            r10.a((java.lang.String) r11, (org.json.JSONObject) r12)
        L_0x00f0:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.n.a(android.webkit.WebView, java.lang.String, boolean):void");
    }

    /* access modifiers changed from: private */
    public String b(String str) {
        return "javascript:" + str;
    }

    public void a(WebView webView, int i2, String str, String str2, String str3) {
        l.b("LandingPageLog", "onWebError: " + i2 + ", " + String.valueOf(str) + ", " + String.valueOf(str2));
        u uVar = this.y;
        if (uVar != null) {
            uVar.g();
        }
        if (!(str3 != null && str3.startsWith("image")) && this.f333d != 2) {
            this.f333d = 3;
        }
        this.f336g = i2;
        this.f337h = str;
        this.i = str2;
    }

    public void d() {
        l.b("LandingPageLog", "onResume");
        if (this.r == 0) {
            this.r = System.currentTimeMillis();
        }
        this.m = System.currentTimeMillis();
    }

    public void e() {
        l.b("LandingPageLog", "onStop");
        if ("landingpage".equals(this.l) || "landingpage_endcard".equals(this.l) || "landingpage_split_screen".equals(this.l) || "landingpage_direct".equals(this.l)) {
            if (!(this.f333d == 2)) {
                return;
            }
            if (this.o > 0 || !c()) {
                long currentTimeMillis = System.currentTimeMillis();
                this.n = currentTimeMillis;
                long max = currentTimeMillis - Math.max(this.m, this.o);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("load_status", this.f333d);
                    jSONObject.put("max_scroll_percent", this.u.get());
                    jSONObject.putOpt("render_type", "h5");
                    jSONObject.putOpt("render_type_2", 0);
                } catch (JSONException unused) {
                }
                a("stay_page", jSONObject, Math.min(max, TTAdConstant.AD_MAX_EVENT_TIME));
            }
        }
    }

    public void a(SSWebView sSWebView) {
        int I;
        Bitmap a2;
        com.bytedance.sdk.openadsdk.core.e.n nVar;
        if (("landingpage".equals(this.l) || "landingpage_endcard".equals(this.l) || "landingpage_split_screen".equals(this.l) || "landingpage_direct".equals(this.l)) && (I = m.h().I()) != 0 && new Random().nextInt(100) + 1 <= I && sSWebView != null && sSWebView.getWebView() != null && sSWebView.getVisibility() == 0 && (a2 = v.a(sSWebView)) != null && (nVar = this.k) != null) {
            v.a(nVar, this.l, "landing_page_blank", a2, sSWebView.getUrl(), this.f332c);
        }
    }

    public void f() {
        l.b("LandingPageLog", "onDestroy");
        this.v = null;
        if (this.f335f.compareAndSet(false, true)) {
            e.a(this.j, this.k, this.l, System.currentTimeMillis() - this.r);
        }
    }

    public void a(WebView webView, WebResourceRequest webResourceRequest) {
        if (webResourceRequest == null || TextUtils.isEmpty(webResourceRequest.getUrl().toString())) {
        }
    }

    private void a(String str, JSONObject jSONObject) {
        a(str, jSONObject, -1);
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(12:9|10|11|(1:13)(1:14)|15|(1:17)(1:18)|19|20|21|22|(3:23|24|(1:26))|27) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:20:0x0039 */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x004d A[Catch:{ JSONException -> 0x0052 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void a(java.lang.String r7, org.json.JSONObject r8, long r9) {
        /*
            r6 = this;
            boolean r0 = r6.w
            if (r0 != 0) goto L_0x0005
            return
        L_0x0005:
            com.bytedance.sdk.openadsdk.core.e.n r0 = r6.k
            if (r0 == 0) goto L_0x0090
            boolean r0 = android.text.TextUtils.isEmpty(r7)
            if (r0 == 0) goto L_0x0011
            goto L_0x0090
        L_0x0011:
            r0 = 0
            if (r8 == 0) goto L_0x0053
            java.lang.String r1 = "is_playable"
            com.bytedance.sdk.openadsdk.core.e.n r2 = r6.k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = com.bytedance.sdk.openadsdk.core.e.p.a((com.bytedance.sdk.openadsdk.core.e.n) r2)     // Catch:{ JSONException -> 0x0039 }
            r3 = 1
            r4 = 0
            if (r2 == 0) goto L_0x0022
            r2 = 1
            goto L_0x0023
        L_0x0022:
            r2 = 0
        L_0x0023:
            r8.put(r1, r2)     // Catch:{ JSONException -> 0x0039 }
            java.lang.String r1 = "usecache"
            com.bytedance.sdk.openadsdk.core.video.b.a r2 = com.bytedance.sdk.openadsdk.core.video.b.a.a()     // Catch:{ JSONException -> 0x0039 }
            com.bytedance.sdk.openadsdk.core.e.n r5 = r6.k     // Catch:{ JSONException -> 0x0039 }
            boolean r2 = r2.a((com.bytedance.sdk.openadsdk.core.e.n) r5)     // Catch:{ JSONException -> 0x0039 }
            if (r2 == 0) goto L_0x0035
            goto L_0x0036
        L_0x0035:
            r3 = 0
        L_0x0036:
            r8.put(r1, r3)     // Catch:{ JSONException -> 0x0039 }
        L_0x0039:
            org.json.JSONObject r1 = new org.json.JSONObject     // Catch:{ JSONException -> 0x0053 }
            r1.<init>()     // Catch:{ JSONException -> 0x0053 }
            java.lang.String r0 = "ad_extra_data"
            java.lang.String r8 = r8.toString()     // Catch:{ JSONException -> 0x0052 }
            r1.put(r0, r8)     // Catch:{ JSONException -> 0x0052 }
            r2 = 0
            int r8 = (r9 > r2 ? 1 : (r9 == r2 ? 0 : -1))
            if (r8 <= 0) goto L_0x0052
            java.lang.String r8 = "duration"
            r1.put(r8, r9)     // Catch:{ JSONException -> 0x0052 }
        L_0x0052:
            r0 = r1
        L_0x0053:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            java.lang.String r9 = "sendEvent: "
            r8.append(r9)
            java.lang.String r9 = r6.l
            java.lang.String r9 = java.lang.String.valueOf(r9)
            r8.append(r9)
            java.lang.String r9 = ", "
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r7)
            r8.append(r9)
            java.lang.String r9 = ", ext="
            r8.append(r9)
            java.lang.String r9 = java.lang.String.valueOf(r0)
            r8.append(r9)
            java.lang.String r8 = r8.toString()
            java.lang.String r9 = "LandingPageLog"
            com.bytedance.sdk.component.utils.l.b((java.lang.String) r9, (java.lang.String) r8)
            android.content.Context r8 = r6.j
            com.bytedance.sdk.openadsdk.core.e.n r9 = r6.k
            java.lang.String r10 = r6.l
            com.bytedance.sdk.openadsdk.b.e.c((android.content.Context) r8, (com.bytedance.sdk.openadsdk.core.e.n) r9, (java.lang.String) r10, (java.lang.String) r7, (org.json.JSONObject) r0)
        L_0x0090:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.b.n.a(java.lang.String, org.json.JSONObject, long):void");
    }

    /* compiled from: LandingPageLog */
    private class a {
        private a() {
        }

        @JavascriptInterface
        public void readPercent(String str) {
            int i = 0;
            try {
                int intValue = Float.valueOf(str).intValue();
                if (intValue > 100) {
                    i = 100;
                } else if (intValue >= 0) {
                    i = intValue;
                }
            } catch (Throwable unused) {
            }
            n.this.u.set(i);
        }

        @JavascriptInterface
        public String getUrl() {
            return n.this.x;
        }
    }
}
