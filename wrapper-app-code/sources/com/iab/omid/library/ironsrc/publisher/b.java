package com.iab.omid.library.ironsrc.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.ironsrc.adsession.AdSessionContext;
import com.iab.omid.library.ironsrc.adsession.VerificationScriptResource;
import com.iab.omid.library.ironsrc.adsession.a;
import com.iab.omid.library.ironsrc.b.e;
import com.iab.omid.library.ironsrc.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WebView f7922a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7923b = null;

    /* renamed from: c  reason: collision with root package name */
    private Map<String, VerificationScriptResource> f7924c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7925d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f7924c = map;
        this.f7925d = str;
    }

    public void a() {
        super.a();
        j();
    }

    public void a(a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            com.iab.omid.library.ironsrc.d.b.a(jSONObject, next, injectedResourcesMap.get(next));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b  reason: collision with root package name */
            private WebView f7927b = b.this.f7922a;

            public void run() {
                this.f7927b.destroy();
            }
        }, Math.max(4000 - (this.f7923b == null ? 4000 : TimeUnit.MILLISECONDS.convert(d.a() - this.f7923b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f7922a = null;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.ironsrc.b.d.a().b());
        this.f7922a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f7922a);
        e.a().a(this.f7922a, this.f7925d);
        for (String next : this.f7924c.keySet()) {
            e.a().a(this.f7922a, this.f7924c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f7923b = Long.valueOf(d.a());
    }
}
