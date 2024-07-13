package com.applovin.impl.adview;

import android.net.Uri;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.appodeal.ads.AppodealNetworks;
import java.lang.ref.WeakReference;

public class u extends WebViewClient {

    /* renamed from: a  reason: collision with root package name */
    private final v f14237a;

    /* renamed from: b  reason: collision with root package name */
    private WeakReference<a> f14238b;

    public interface a {
        void a(t tVar);

        void b(t tVar);

        void c(t tVar);
    }

    public u(n nVar) {
        this.f14237a = nVar.D();
    }

    private void a(WebView webView, String str) {
        if (v.a()) {
            v vVar = this.f14237a;
            vVar.c("WebViewButtonClient", "Processing click on ad URL \"" + str + "\"");
        }
        if (str != null && (webView instanceof t)) {
            t tVar = (t) webView;
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            String path = parse.getPath();
            a aVar = (a) this.f14238b.get();
            if (AppodealNetworks.APPLOVIN.equalsIgnoreCase(scheme) && "com.applovin.sdk".equalsIgnoreCase(host) && aVar != null) {
                if ("/track_click".equals(path)) {
                    aVar.a(tVar);
                } else if ("/close_ad".equals(path)) {
                    aVar.b(tVar);
                } else if ("/skip_ad".equals(path)) {
                    aVar.c(tVar);
                } else {
                    if (v.a()) {
                        v vVar2 = this.f14237a;
                        vVar2.d("WebViewButtonClient", "Unknown URL: " + str);
                    }
                    if (v.a()) {
                        v vVar3 = this.f14237a;
                        vVar3.d("WebViewButtonClient", "Path: " + path);
                    }
                }
            }
        }
    }

    public void a(WeakReference<a> weakReference) {
        this.f14238b = weakReference;
    }

    public boolean onRenderProcessGone(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
        return true;
    }

    public boolean shouldOverrideUrlLoading(WebView webView, String str) {
        a(webView, str);
        return true;
    }
}
