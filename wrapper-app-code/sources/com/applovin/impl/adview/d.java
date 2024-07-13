package com.applovin.impl.adview;

import android.content.Context;
import android.graphics.Paint;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.ValueCallback;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.b.a;
import com.applovin.impl.b.i;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.i;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinPostbackListener;
import com.applovin.sdk.AppLovinSdkUtils;

public class d extends h {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public static WebView f14143c;
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final v f14144a;

    /* renamed from: b  reason: collision with root package name */
    private final n f14145b;

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.sdk.d.d f14146d;

    /* renamed from: e  reason: collision with root package name */
    private e f14147e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f14148f;

    public d(e eVar, n nVar, Context context) {
        this(eVar, nVar, context, false);
    }

    d(e eVar, n nVar, Context context, boolean z) {
        super(context);
        if (nVar != null) {
            this.f14145b = nVar;
            this.f14144a = nVar.D();
            setBackgroundColor(0);
            WebSettings settings = getSettings();
            settings.setSupportMultipleWindows(false);
            settings.setJavaScriptEnabled(true);
            setWebViewClient(eVar);
            setWebChromeClient(new c(eVar != null ? eVar.a() : null, nVar));
            setVerticalScrollBarEnabled(false);
            setHorizontalScrollBarEnabled(false);
            setScrollBarStyle(33554432);
            if (h.i() && ((Boolean) nVar.a(b.eV)).booleanValue()) {
                setWebViewRenderProcessClient(new f(nVar).a());
            }
            setOnTouchListener(new View.OnTouchListener() {
                public boolean onTouch(View view, MotionEvent motionEvent) {
                    if (view.hasFocus()) {
                        return false;
                    }
                    view.requestFocus();
                    return false;
                }
            });
            setOnLongClickListener(new View.OnLongClickListener() {
                public boolean onLongClick(View view) {
                    v unused = d.this.f14144a;
                    if (!v.a()) {
                        return true;
                    }
                    d.this.f14144a.b("AdWebView", "Received a LongClick event.");
                    return true;
                }
            });
            return;
        }
        throw new IllegalArgumentException("No sdk specified.");
    }

    private String a(String str, String str2) {
        if (StringUtils.isValidString(str)) {
            return str.replace("{SOURCE}", str2);
        }
        return null;
    }

    public static void a(final i iVar, final n nVar, final AppLovinPostbackListener appLovinPostbackListener) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                String a2 = i.this.a();
                d.c();
                if (d.f14143c == null) {
                    appLovinPostbackListener.onPostbackFailure(a2, -1);
                    return;
                }
                if (i.this.c() != null) {
                    a2 = StringUtils.appendQueryParameters(a2, i.this.c(), ((Boolean) nVar.a(b.dm)).booleanValue());
                }
                String str = "al_firePostback('" + a2 + "');";
                if (h.c()) {
                    d.f14143c.evaluateJavascript(str, (ValueCallback) null);
                } else {
                    d.f14143c.loadUrl("javascript:" + str);
                }
                appLovinPostbackListener.onPostbackSuccess(a2);
            }
        });
    }

    private void a(String str, String str2, String str3, n nVar, a aVar) {
        String str4;
        v vVar;
        StringBuilder sb;
        String a2 = a(str3, str);
        if (StringUtils.isValidString(a2)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled() && !aVar.q()) {
                a2 = nVar.ao().a(a2);
            }
            str4 = a2;
            if (v.a()) {
                vVar = this.f14144a;
                sb = new StringBuilder();
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
        }
        String a3 = a((String) nVar.a(b.ep), str);
        if (StringUtils.isValidString(a3)) {
            if (aVar.c() && aVar.isOpenMeasurementEnabled()) {
                a3 = nVar.ao().a(a3);
            }
            str4 = a3;
            if (v.a()) {
                vVar = this.f14144a;
                sb = new StringBuilder();
            }
            loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
        }
        if (v.a()) {
            v vVar2 = this.f14144a;
            vVar2.b("AdWebView", "Rendering webview for VAST ad with resourceURL : " + str);
        }
        loadUrl(str);
        return;
        sb.append("Rendering webview for VAST ad with resourceContents : ");
        sb.append(str4);
        vVar.b("AdWebView", sb.toString());
        loadDataWithBaseURL(str2, str4, "text/html", (String) null, "");
    }

    private void b(e eVar) {
        Boolean n;
        Integer a2;
        loadUrl("about:blank");
        int az = this.f14147e.az();
        if (az >= 0) {
            setLayerType(az, (Paint) null);
        }
        if (h.b()) {
            getSettings().setMediaPlaybackRequiresUserGesture(eVar.av());
        }
        if (h.c() && eVar.ax()) {
            setWebContentsDebuggingEnabled(true);
        }
        v ay = eVar.ay();
        if (ay != null) {
            WebSettings settings = getSettings();
            WebSettings.PluginState b2 = ay.b();
            if (b2 != null) {
                settings.setPluginState(b2);
            }
            Boolean c2 = ay.c();
            if (c2 != null) {
                settings.setAllowFileAccess(c2.booleanValue());
            }
            Boolean d2 = ay.d();
            if (d2 != null) {
                settings.setLoadWithOverviewMode(d2.booleanValue());
            }
            Boolean e2 = ay.e();
            if (e2 != null) {
                settings.setUseWideViewPort(e2.booleanValue());
            }
            Boolean f2 = ay.f();
            if (f2 != null) {
                settings.setAllowContentAccess(f2.booleanValue());
            }
            Boolean g2 = ay.g();
            if (g2 != null) {
                settings.setBuiltInZoomControls(g2.booleanValue());
            }
            Boolean h2 = ay.h();
            if (h2 != null) {
                settings.setDisplayZoomControls(h2.booleanValue());
            }
            Boolean i = ay.i();
            if (i != null) {
                settings.setSaveFormData(i.booleanValue());
            }
            Boolean j = ay.j();
            if (j != null) {
                settings.setGeolocationEnabled(j.booleanValue());
            }
            Boolean k = ay.k();
            if (k != null) {
                settings.setNeedInitialFocus(k.booleanValue());
            }
            Boolean l = ay.l();
            if (l != null) {
                settings.setAllowFileAccessFromFileURLs(l.booleanValue());
            }
            Boolean m = ay.m();
            if (m != null) {
                settings.setAllowUniversalAccessFromFileURLs(m.booleanValue());
            }
            if (h.d() && (a2 = ay.a()) != null) {
                settings.setMixedContentMode(a2.intValue());
            }
            if (h.e() && (n = ay.n()) != null) {
                settings.setOffscreenPreRaster(n.booleanValue());
            }
        }
    }

    /* access modifiers changed from: private */
    public static void c() {
        if (f14143c == null) {
            WebView tryToCreateWebView = Utils.tryToCreateWebView(n.Q(), "postbacks");
            f14143c = tryToCreateWebView;
            if (tryToCreateWebView != null) {
                tryToCreateWebView.getSettings().setJavaScriptEnabled(true);
                f14143c.loadData("<html><head>\n<script type=\"text/javascript\">\n    window.al_firePostback = function(postback) {\n    setTimeout(function() {\n        var img = new Image();\n        img.src = postback;\n    }, 100);\n};\n</script></head>\n<body></body></html>", "text/html", "UTF-8");
                f14143c.setWebViewClient(new WebViewClient() {
                    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                        if (webView != d.f14143c) {
                            return true;
                        }
                        d.f14143c.destroy();
                        WebView unused = d.f14143c = null;
                        AppLovinSdkUtils.runOnUiThread(new Runnable() {
                            public void run() {
                                d.c();
                            }
                        });
                        return true;
                    }
                });
            }
        }
    }

    public void a(e eVar) {
        v vVar;
        String str;
        v vVar2;
        String str2;
        String str3;
        String aw;
        String str4;
        String str5;
        String str6;
        String aw2;
        n nVar;
        if (!this.f14148f) {
            this.f14147e = eVar;
            try {
                b(eVar);
                if (Utils.isBML(eVar.getSize())) {
                    setVisibility(0);
                }
                if (eVar instanceof com.applovin.impl.sdk.ad.a) {
                    com.applovin.impl.sdk.ad.a aVar = (com.applovin.impl.sdk.ad.a) eVar;
                    String b2 = aVar.b();
                    if (!aVar.q() && aVar.isOpenMeasurementEnabled()) {
                        b2 = this.f14145b.ao().a(b2);
                    }
                    loadDataWithBaseURL(eVar.aw(), b2, "text/html", (String) null, "");
                    if (v.a()) {
                        vVar = this.f14144a;
                        str = "AppLovinAd rendered";
                    } else {
                        return;
                    }
                } else if (eVar instanceof a) {
                    a aVar2 = (a) eVar;
                    com.applovin.impl.b.d aO = aVar2.aO();
                    if (aO != null) {
                        com.applovin.impl.b.i b3 = aO.b();
                        Uri b4 = b3.b();
                        String uri = b4 != null ? b4.toString() : "";
                        String c2 = b3.c();
                        String aS = aVar2.aS();
                        if (!StringUtils.isValidString(uri)) {
                            if (!StringUtils.isValidString(c2)) {
                                if (v.a()) {
                                    vVar2 = this.f14144a;
                                    str2 = "Unable to load companion ad. No resources provided.";
                                    vVar2.e("AdWebView", str2);
                                    return;
                                }
                                return;
                            }
                        }
                        if (b3.a() == i.a.STATIC) {
                            if (v.a()) {
                                this.f14144a.b("AdWebView", "Rendering WebView for static VAST ad");
                            }
                            String a2 = a((String) this.f14145b.a(b.eo), uri);
                            if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && aVar2.e()) {
                                a2 = this.f14145b.ao().a(a2);
                            }
                            str3 = a2;
                            aw = eVar.aw();
                            str4 = "text/html";
                            str5 = null;
                            str6 = "";
                        } else {
                            if (b3.a() == i.a.HTML) {
                                if (StringUtils.isValidString(c2)) {
                                    String a3 = a(aS, c2);
                                    if (StringUtils.isValidString(a3)) {
                                        c2 = a3;
                                    }
                                    if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                        c2 = this.f14145b.ao().a(c2);
                                    }
                                    str3 = c2;
                                    if (v.a()) {
                                        v vVar3 = this.f14144a;
                                        vVar3.b("AdWebView", "Rendering WebView for HTML VAST ad with resourceContents: " + str3);
                                    }
                                    aw = eVar.aw();
                                    str4 = "text/html";
                                    str5 = null;
                                    str6 = "";
                                } else if (StringUtils.isValidString(uri)) {
                                    if (v.a()) {
                                        this.f14144a.b("AdWebView", "Preparing to load HTML VAST ad resourceUri");
                                    }
                                    aw2 = eVar.aw();
                                    nVar = this.f14145b;
                                } else {
                                    return;
                                }
                            } else if (b3.a() == i.a.IFRAME) {
                                if (StringUtils.isValidString(uri)) {
                                    if (v.a()) {
                                        this.f14144a.b("AdWebView", "Preparing to load iFrame VAST ad resourceUri");
                                    }
                                    aw2 = eVar.aw();
                                    nVar = this.f14145b;
                                } else if (StringUtils.isValidString(c2)) {
                                    String a4 = a(aS, c2);
                                    if (StringUtils.isValidString(a4)) {
                                        c2 = a4;
                                    }
                                    if (aVar2.c() && aVar2.isOpenMeasurementEnabled() && !aVar2.q()) {
                                        c2 = this.f14145b.ao().a(c2);
                                    }
                                    str3 = c2;
                                    if (v.a()) {
                                        v vVar4 = this.f14144a;
                                        vVar4.b("AdWebView", "Rendering WebView for iFrame VAST ad with resourceContents: " + str3);
                                    }
                                    aw = eVar.aw();
                                    str4 = "text/html";
                                    str5 = null;
                                    str6 = "";
                                } else {
                                    return;
                                }
                            } else if (v.a()) {
                                vVar2 = this.f14144a;
                                str2 = "Failed to render VAST companion ad of invalid type";
                                vVar2.e("AdWebView", str2);
                                return;
                            } else {
                                return;
                            }
                            a(uri, aw2, aS, nVar, aVar2);
                            return;
                        }
                        loadDataWithBaseURL(aw, str3, str4, str5, str6);
                        return;
                    } else if (v.a()) {
                        vVar = this.f14144a;
                        str = "No companion ad provided.";
                    } else {
                        return;
                    }
                } else {
                    return;
                }
                vVar.b("AdWebView", str);
            } catch (Throwable th) {
                String valueOf = eVar != null ? String.valueOf(eVar.getAdIdNumber()) : "null";
                throw new RuntimeException("Unable to render AppLovin ad (" + valueOf + ") - " + th);
            }
        } else {
            v.i("AdWebView", "Ad can not be loaded in a destroyed webview");
        }
    }

    public void a(String str) {
        a(str, (Runnable) null);
    }

    public void a(String str, Runnable runnable) {
        try {
            if (v.a()) {
                v vVar = this.f14144a;
                vVar.b("AdWebView", "Forwarding \"" + str + "\" to ad template");
            }
            loadUrl(str);
        } catch (Throwable th) {
            if (v.a()) {
                this.f14144a.b("AdWebView", "Unable to forward to template", th);
            }
            if (runnable != null) {
                runnable.run();
            }
        }
    }

    public void computeScroll() {
    }

    public void destroy() {
        this.f14148f = true;
        super.destroy();
    }

    /* access modifiers changed from: package-private */
    public e getCurrentAd() {
        return this.f14147e;
    }

    public com.applovin.impl.sdk.d.d getStatsManagerHelper() {
        return this.f14146d;
    }

    /* access modifiers changed from: protected */
    public void onScrollChanged(int i, int i2, int i3, int i4) {
    }

    public void scrollTo(int i, int i2) {
    }

    public void setStatsManagerHelper(com.applovin.impl.sdk.d.d dVar) {
        this.f14146d = dVar;
    }
}
