package com.applovin.impl.adview;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.PointF;
import android.net.Uri;
import android.net.http.SslError;
import android.os.Bundle;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.SslErrorHandler;
import android.webkit.URLUtil;
import android.webkit.WebResourceError;
import android.webkit.WebResourceRequest;
import android.webkit.WebResourceResponse;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.b.m;
import com.applovin.impl.sdk.AppLovinBroadcastManager;
import com.applovin.impl.sdk.d.b;
import com.applovin.impl.sdk.d.d;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.network.h;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.a;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.util.Map;

public class e extends WebViewClient {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f14155a;

    /* renamed from: b  reason: collision with root package name */
    private final v f14156b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final b f14157c;

    public e(b bVar, n nVar) {
        this.f14155a = nVar;
        this.f14156b = nVar.D();
        this.f14157c = bVar;
    }

    private void a(PointF pointF) {
        this.f14157c.a(pointF);
    }

    private void a(Uri uri, d dVar) {
        String str;
        v vVar;
        final String queryParameter = uri.getQueryParameter(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT);
        if (StringUtils.isValidString(queryParameter)) {
            String queryParameter2 = uri.getQueryParameter("load_type");
            if ("external".equalsIgnoreCase(queryParameter2)) {
                if (v.a()) {
                    v vVar2 = this.f14156b;
                    vVar2.b("AdWebView", "Loading new page externally: " + queryParameter);
                }
                Utils.openUri(dVar.getContext(), Uri.parse(queryParameter), this.f14155a);
                k.c(this.f14157c.g(), (AppLovinAd) this.f14157c.p(), this.f14157c.r());
                return;
            } else if ("internal".equalsIgnoreCase(queryParameter2)) {
                if (v.a()) {
                    v vVar3 = this.f14156b;
                    vVar3.b("AdWebView", "Loading new page in WebView: " + queryParameter);
                }
                dVar.loadUrl(queryParameter);
                String queryParameter3 = uri.getQueryParameter("bg_color");
                if (StringUtils.isValidString(queryParameter3)) {
                    dVar.setBackgroundColor(Color.parseColor(queryParameter3));
                    return;
                }
                return;
            } else if ("in_app".equalsIgnoreCase(queryParameter2)) {
                if (v.a()) {
                    v vVar4 = this.f14156b;
                    vVar4.b("AdWebView", "Loading new page in slide-up webview: " + queryParameter);
                }
                this.f14155a.ai().a(new a() {
                    public void onActivityCreated(Activity activity, Bundle bundle) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            ((AppLovinWebViewActivity) activity).loadUrl(queryParameter, (AppLovinWebViewActivity.EventListener) null);
                            k.a(e.this.f14157c.g(), (AppLovinAd) e.this.f14157c.p(), e.this.f14157c.r());
                        }
                    }

                    public void onActivityDestroyed(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            k.b(e.this.f14157c.g(), (AppLovinAd) e.this.f14157c.p(), e.this.f14157c.r());
                            e.this.f14155a.ai().b(this);
                        }
                    }
                });
                Intent intent = new Intent(this.f14155a.P(), AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, this.f14155a.C());
                intent.setFlags(268435456);
                this.f14155a.P().startActivity(intent);
                return;
            } else if (v.a()) {
                vVar = this.f14156b;
                str = "Could not find load type in original uri";
            } else {
                return;
            }
        } else if (v.a()) {
            vVar = this.f14156b;
            str = "Could not find url to load from query in original uri";
        } else {
            return;
        }
        vVar.e("AdWebView", str);
    }

    private void a(Uri uri, com.applovin.impl.sdk.ad.e eVar) {
        String queryParameter = uri.getQueryParameter(NotificationBundleProcessor.PUSH_MINIFIED_BUTTON_TEXT);
        if (URLUtil.isValidUrl(queryParameter)) {
            String appendQueryParameter = StringUtils.appendQueryParameter(queryParameter, "clcode", eVar.getClCode());
            this.f14155a.X().a(h.o().c(appendQueryParameter).a(false).c(Boolean.parseBoolean(uri.getQueryParameter("fire_from_webview"))).a());
        } else if (v.a()) {
            v vVar = this.f14156b;
            vVar.e("AdWebView", "Could not find postback url to fire from query in original uri: " + uri);
        }
    }

    private void a(d dVar, Uri uri) {
        com.applovin.impl.sdk.ad.e currentAd = dVar.getCurrentAd();
        AppLovinAdView r = this.f14157c.r();
        if (r != null && currentAd != null) {
            d statsManagerHelper = dVar.getStatsManagerHelper();
            if (statsManagerHelper != null) {
                statsManagerHelper.b();
            }
            if (currentAd instanceof com.applovin.impl.b.a) {
                ((com.applovin.impl.b.a) currentAd).o().o();
            }
            this.f14157c.a(currentAd, r, uri, dVar.getAndClearLastClickLocation());
        } else if (v.a()) {
            v vVar = this.f14156b;
            vVar.e("AdWebView", "Attempting to track click that is null or not an ApplovinAdView instance for clickedUri = " + uri);
        }
    }

    private void a(com.applovin.impl.b.a aVar, d dVar) {
        com.applovin.impl.b.d aO = aVar.aO();
        if (aO != null) {
            m.a(aO.c(), this.f14157c.q());
            a(dVar, aO.a());
        }
    }

    private void b() {
        this.f14157c.l();
    }

    private void c() {
        this.f14157c.k();
    }

    /* access modifiers changed from: protected */
    public b a() {
        return this.f14157c;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:125:0x0269, code lost:
        if (r6.aR() != false) goto L_0x026b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0167, code lost:
        if (r6.aR() != false) goto L_0x026b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public boolean a(android.webkit.WebView r11, java.lang.String r12) {
        /*
            r10 = this;
            com.applovin.impl.adview.b r0 = r10.f14157c
            r1 = 1
            if (r0 != 0) goto L_0x0006
            return r1
        L_0x0006:
            boolean r0 = com.applovin.impl.sdk.v.a()
            java.lang.String r2 = "AdWebView"
            if (r0 == 0) goto L_0x0029
            com.applovin.impl.sdk.v r0 = r10.f14156b
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r4 = "Processing click on ad URL \""
            r3.append(r4)
            r3.append(r12)
            java.lang.String r4 = "\""
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r0.c(r2, r3)
        L_0x0029:
            if (r12 == 0) goto L_0x0272
            boolean r0 = r11 instanceof com.applovin.impl.adview.d
            if (r0 == 0) goto L_0x0272
            android.net.Uri r0 = android.net.Uri.parse(r12)
            com.applovin.impl.adview.d r11 = (com.applovin.impl.adview.d) r11
            java.lang.String r3 = r0.getScheme()
            java.lang.String r4 = r0.getHost()
            java.lang.String r5 = r0.getPath()
            com.applovin.impl.adview.b r6 = r10.f14157c
            com.applovin.impl.sdk.ad.e r6 = r6.p()
            if (r6 != 0) goto L_0x0057
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x0056
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "Unable to process click, ad not found!"
            r11.e(r2, r12)
        L_0x0056:
            return r1
        L_0x0057:
            android.graphics.PointF r7 = r11.getLastClickLocation()
            android.graphics.PointF r8 = new android.graphics.PointF
            r8.<init>()
            boolean r7 = r7.equals(r8)
            r7 = r7 ^ r1
            boolean r8 = r6.K()
            if (r8 == 0) goto L_0x006f
            if (r7 != 0) goto L_0x006f
            r8 = 0
            goto L_0x0070
        L_0x006f:
            r8 = 1
        L_0x0070:
            java.lang.String r9 = "applovin"
            boolean r9 = r9.equals(r3)
            if (r9 == 0) goto L_0x022e
            java.lang.String r9 = "com.applovin.sdk"
            boolean r9 = r9.equals(r4)
            if (r9 == 0) goto L_0x022e
            java.lang.String r3 = "/adservice/close_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00b0
            com.applovin.impl.sdk.n r11 = r10.f14155a
            com.applovin.sdk.AppLovinSdkSettings r11 = r11.q()
            java.util.Map r11 = r11.getExtraParameters()
            java.lang.String r0 = "enable_close_URL_ad_value"
            java.lang.Object r11 = r11.get(r0)
            java.lang.String r11 = (java.lang.String) r11
            boolean r0 = com.applovin.impl.sdk.utils.StringUtils.isValidString(r11)
            if (r0 == 0) goto L_0x00ab
            boolean r11 = java.lang.Boolean.parseBoolean(r11)
            if (r11 == 0) goto L_0x00ab
            java.lang.String r11 = "close_url"
            r6.setMaxAdValue(r11, r12)
        L_0x00ab:
            r10.b()
            goto L_0x0272
        L_0x00b0:
            java.lang.String r3 = "/adservice/expand_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00d7
            boolean r12 = r6.J()
            if (r12 == 0) goto L_0x00ce
            if (r7 != 0) goto L_0x00ce
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x00cd
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "Skipping expand command without user interaction"
            r11.e(r2, r12)
        L_0x00cd:
            return r1
        L_0x00ce:
            android.graphics.PointF r11 = r11.getAndClearLastClickLocation()
            r10.a((android.graphics.PointF) r11)
            goto L_0x0272
        L_0x00d7:
            java.lang.String r3 = "/adservice/contract_ad"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00e4
            r10.c()
            goto L_0x0272
        L_0x00e4:
            java.lang.String r3 = "/adservice/no_op"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x00ed
            return r1
        L_0x00ed:
            java.lang.String r3 = "/adservice/load_url"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x0110
            boolean r12 = r6.J()
            if (r12 == 0) goto L_0x010b
            if (r7 != 0) goto L_0x010b
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x010a
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "Skipping URL load command without user interaction"
            r11.e(r2, r12)
        L_0x010a:
            return r1
        L_0x010b:
            r10.a((android.net.Uri) r0, (com.applovin.impl.adview.d) r11)
            goto L_0x0272
        L_0x0110:
            java.lang.String r3 = "/adservice/track_click_now"
            boolean r4 = r3.equals(r5)
            if (r4 == 0) goto L_0x013f
            boolean r12 = r6.J()
            if (r12 == 0) goto L_0x012e
            if (r7 != 0) goto L_0x012e
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x012d
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "Skipping click tracking command without user interaction"
            r11.e(r2, r12)
        L_0x012d:
            return r1
        L_0x012e:
            boolean r12 = r6 instanceof com.applovin.impl.b.a
            if (r12 == 0) goto L_0x0136
            com.applovin.impl.b.a r6 = (com.applovin.impl.b.a) r6
            goto L_0x026b
        L_0x0136:
            android.net.Uri r12 = android.net.Uri.parse(r3)
            r10.a((com.applovin.impl.adview.d) r11, (android.net.Uri) r12)
            goto L_0x0272
        L_0x013f:
            java.lang.String r3 = "/adservice/deeplink"
            boolean r3 = r3.equals(r5)
            if (r3 == 0) goto L_0x016b
            boolean r12 = r6.J()
            if (r12 == 0) goto L_0x015d
            if (r7 != 0) goto L_0x015d
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x015c
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "Skipping deep link plus command without user interaction"
            r11.e(r2, r12)
        L_0x015c:
            return r1
        L_0x015d:
            boolean r12 = r6 instanceof com.applovin.impl.b.a
            if (r12 == 0) goto L_0x026f
            com.applovin.impl.b.a r6 = (com.applovin.impl.b.a) r6
            boolean r12 = r6.aR()
            if (r12 == 0) goto L_0x026f
            goto L_0x026b
        L_0x016b:
            java.lang.String r11 = "/adservice/postback"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0178
            r10.a((android.net.Uri) r0, (com.applovin.impl.sdk.ad.e) r6)
            goto L_0x0272
        L_0x0178:
            com.applovin.impl.adview.b r11 = r10.f14157c
            com.applovin.impl.adview.g r11 = r11.h()
            if (r11 == 0) goto L_0x01f5
            java.lang.String r11 = "/video_began"
            boolean r11 = r11.equals(r5)
            r2 = 0
            if (r11 == 0) goto L_0x019f
            java.lang.String r11 = "duration"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r2)
            com.applovin.impl.adview.b r0 = r10.f14157c
            com.applovin.impl.adview.g r0 = r0.h()
            r0.a(r11)
            goto L_0x0272
        L_0x019f:
            java.lang.String r11 = "/video_completed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01b2
            com.applovin.impl.adview.b r11 = r10.f14157c
            com.applovin.impl.adview.g r11 = r11.h()
            r11.g_()
            goto L_0x0272
        L_0x01b2:
            java.lang.String r11 = "/video_progress"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01cf
            java.lang.String r11 = "percent_viewed"
            java.lang.String r11 = r0.getQueryParameter(r11)
            double r11 = com.applovin.impl.sdk.utils.Utils.tryParseDouble(r11, r2)
            com.applovin.impl.adview.b r0 = r10.f14157c
            com.applovin.impl.adview.g r0 = r0.h()
            r0.b(r11)
            goto L_0x0272
        L_0x01cf:
            java.lang.String r11 = "/video_waiting"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x01e2
            com.applovin.impl.adview.b r11 = r10.f14157c
            com.applovin.impl.adview.g r11 = r11.h()
            r11.h_()
            goto L_0x0272
        L_0x01e2:
            java.lang.String r11 = "/video_resumed"
            boolean r11 = r11.equals(r5)
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.adview.b r11 = r10.f14157c
            com.applovin.impl.adview.g r11 = r11.h()
            r11.c()
            goto L_0x0272
        L_0x01f5:
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x0211
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            java.lang.String r3 = "Unknown URL: "
            r0.append(r3)
            r0.append(r12)
            java.lang.String r12 = r0.toString()
            r11.d(r2, r12)
        L_0x0211:
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.StringBuilder r12 = new java.lang.StringBuilder
            r12.<init>()
            java.lang.String r0 = "Path: "
            r12.append(r0)
            r12.append(r5)
            java.lang.String r12 = r12.toString()
            r11.d(r2, r12)
            goto L_0x0272
        L_0x022e:
            if (r8 == 0) goto L_0x0272
            java.util.List r12 = r6.aA()
            java.util.List r5 = r6.aB()
            boolean r7 = r12.isEmpty()
            if (r7 != 0) goto L_0x0244
            boolean r12 = r12.contains(r3)
            if (r12 == 0) goto L_0x0251
        L_0x0244:
            boolean r12 = r5.isEmpty()
            if (r12 != 0) goto L_0x025f
            boolean r12 = r5.contains(r4)
            if (r12 == 0) goto L_0x0251
            goto L_0x025f
        L_0x0251:
            boolean r11 = com.applovin.impl.sdk.v.a()
            if (r11 == 0) goto L_0x0272
            com.applovin.impl.sdk.v r11 = r10.f14156b
            java.lang.String r12 = "URL is not whitelisted - bypassing click"
            r11.e(r2, r12)
            goto L_0x0272
        L_0x025f:
            boolean r12 = r6 instanceof com.applovin.impl.b.a
            if (r12 == 0) goto L_0x026f
            com.applovin.impl.b.a r6 = (com.applovin.impl.b.a) r6
            boolean r12 = r6.aR()
            if (r12 == 0) goto L_0x026f
        L_0x026b:
            r10.a((com.applovin.impl.b.a) r6, (com.applovin.impl.adview.d) r11)
            goto L_0x0272
        L_0x026f:
            r10.a((com.applovin.impl.adview.d) r11, (android.net.Uri) r0)
        L_0x0272:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.applovin.impl.adview.e.a(android.webkit.WebView, java.lang.String):boolean");
    }

    public void onLoadResource(WebView webView, String str) {
        super.onLoadResource(webView, str);
        if (v.a()) {
            v vVar = this.f14156b;
            vVar.c("AdWebView", "Loaded resource: " + str);
        }
    }

    public void onPageFinished(WebView webView, String str) {
        super.onPageFinished(webView, str);
        b bVar = this.f14157c;
        if (bVar != null) {
            bVar.a(webView);
        }
    }

    public void onReceivedError(WebView webView, int i, String str, String str2) {
        super.onReceivedError(webView, i, str, str2);
        b bVar = this.f14157c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            String str3 = "Received error with error code: " + i + " with description \\'" + str + "\\' for URL: " + str2;
            if (p != null) {
                this.f14155a.af().a(p).a(b.y, str3).a();
            }
            if (v.a()) {
                this.f14156b.e("AdWebView", str3 + " for ad: " + p);
            }
        }
    }

    public void onReceivedError(WebView webView, WebResourceRequest webResourceRequest, WebResourceError webResourceError) {
        super.onReceivedError(webView, webResourceRequest, webResourceError);
        onReceivedError(webView, webResourceError.getErrorCode(), webResourceError.getDescription().toString(), webResourceRequest.getUrl().toString());
    }

    public void onReceivedHttpError(WebView webView, WebResourceRequest webResourceRequest, WebResourceResponse webResourceResponse) {
        super.onReceivedHttpError(webView, webResourceRequest, webResourceResponse);
        b bVar = this.f14157c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            this.f14155a.af().a(p).a(b.z).a();
            if (v.a()) {
                v vVar = this.f14156b;
                vVar.e("AdWebView", "Received HTTP error: " + webResourceResponse + "for url: " + webResourceRequest.getUrl() + " and ad: " + p);
            }
        }
    }

    public void onReceivedSslError(WebView webView, SslErrorHandler sslErrorHandler, SslError sslError) {
        super.onReceivedSslError(webView, sslErrorHandler, sslError);
        b bVar = this.f14157c;
        if (bVar != null) {
            com.applovin.impl.sdk.ad.e p = bVar.p();
            String str = "Received SSL error: " + sslError;
            this.f14155a.af().a(p).a(b.B, str).a();
            if (v.a()) {
                this.f14156b.e("AdWebView", str + " for ad: " + p);
            }
        }
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        AppLovinBroadcastManager.getInstance(webView.getContext()).sendBroadcast(new Intent("com.applovin.render_process_gone"), (Map<String, Object>) null);
        if (this.f14157c == null) {
            return true;
        }
        v.i("AdWebView", "Render process gone for ad: " + this.f14157c.p() + ". Process did crash: " + renderProcessGoneDetail.didCrash());
        com.applovin.impl.sdk.ad.e p = this.f14157c.p();
        if (p != null) {
            this.f14155a.af().a(p).a(b.A).a();
        }
        if (((Boolean) this.f14155a.a(com.applovin.impl.sdk.c.b.eQ)).booleanValue()) {
            if (renderProcessGoneDetail.didCrash() && ((Boolean) this.f14155a.a(com.applovin.impl.sdk.c.b.eS)).booleanValue()) {
                String valueOf = p != null ? String.valueOf(p.getAdIdNumber()) : "null";
                throw new RuntimeException("Render process crashed. This is likely caused by a crash in an AppLovin ad with ID: " + valueOf);
            } else if (webView != null && webView.equals(this.f14157c.s())) {
                this.f14157c.f();
                AppLovinAdSize b2 = this.f14157c.b();
                if (Utils.isBML(b2)) {
                    this.f14157c.a(b2);
                    this.f14157c.e();
                }
            }
        }
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, WebResourceRequest webResourceRequest) {
        Uri url = webResourceRequest.getUrl();
        if (url != null) {
            return a(webView, url.toString());
        }
        if (!v.a()) {
            return false;
        }
        this.f14156b.e("AdWebView", "No url found for request");
        return false;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        return a(webView, str);
    }
}
