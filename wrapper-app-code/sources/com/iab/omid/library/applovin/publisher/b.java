package com.iab.omid.library.applovin.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public WebView f7700f;

    /* renamed from: g  reason: collision with root package name */
    private Long f7701g = null;

    /* renamed from: h  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f7702h;
    private final String i;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        private final WebView f7703a;

        a() {
            this.f7703a = b.this.f7700f;
        }

        public void run() {
            this.f7703a.destroy();
        }
    }

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f7702h = map;
        this.i = str;
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            c.a(jSONObject, next, injectedResourcesMap.get(next).toJsonObject());
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new a(), Math.max(4000 - (this.f7701g == null ? 4000 : TimeUnit.MILLISECONDS.convert(f.b() - this.f7701g.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f7700f = null;
    }

    public void i() {
        super.i();
        j();
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.applovin.internal.f.b().a());
        this.f7700f = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        this.f7700f.getSettings().setAllowContentAccess(false);
        a(this.f7700f);
        g.a().c(this.f7700f, this.i);
        for (String next : this.f7702h.keySet()) {
            g.a().a(this.f7700f, this.f7702h.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f7701g = Long.valueOf(f.b());
    }
}
