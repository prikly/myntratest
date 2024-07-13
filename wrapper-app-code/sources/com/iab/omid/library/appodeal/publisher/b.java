package com.iab.omid.library.appodeal.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.appodeal.adsession.AdSessionContext;
import com.iab.omid.library.appodeal.adsession.VerificationScriptResource;
import com.iab.omid.library.appodeal.adsession.a;
import com.iab.omid.library.appodeal.b.e;
import com.iab.omid.library.appodeal.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WebView f7814a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7815b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f7816c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7817d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f7816c = map;
        this.f7817d = str;
    }

    public void a() {
        super.a();
        j();
    }

    public void a(a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            com.iab.omid.library.appodeal.d.b.a(jSONObject, next, injectedResourcesMap.get(next));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b  reason: collision with root package name */
            private final WebView f7819b = b.this.f7814a;

            public void run() {
                this.f7819b.destroy();
            }
        }, Math.max(4000 - (this.f7815b == null ? 4000 : TimeUnit.MILLISECONDS.convert(d.a() - this.f7815b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f7814a = null;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.appodeal.b.d.a().b());
        this.f7814a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f7814a);
        e.a().a(this.f7814a, this.f7817d);
        for (String next : this.f7816c.keySet()) {
            e.a().a(this.f7814a, this.f7816c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f7815b = Long.valueOf(d.a());
    }
}
