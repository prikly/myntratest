package com.applovin.impl.adview;

import android.webkit.WebView;
import android.webkit.WebViewRenderProcess;
import android.webkit.WebViewRenderProcessClient;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.d.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;

class f {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final n f14160a;

    /* renamed from: b  reason: collision with root package name */
    private final WebViewRenderProcessClient f14161b = new WebViewRenderProcessClient() {
        public void onRenderProcessResponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
        }

        public void onRenderProcessUnresponsive(WebView webView, WebViewRenderProcess webViewRenderProcess) {
            if (webView instanceof d) {
                e currentAd = ((d) webView).getCurrentAd();
                f.this.f14160a.af().a(currentAd).a(b.C).a();
                f.this.f14160a.D();
                if (v.a()) {
                    v D = f.this.f14160a.D();
                    D.e("AdWebViewRenderProcessClient", "WebView render process unresponsive for ad: " + currentAd);
                }
            }
        }
    };

    f(n nVar) {
        this.f14160a = nVar;
    }

    /* access modifiers changed from: package-private */
    public WebViewRenderProcessClient a() {
        return this.f14161b;
    }
}
