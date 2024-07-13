package com.iab.omid.library.amazon.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.a;
import com.iab.omid.library.amazon.b.e;
import com.iab.omid.library.amazon.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WebView f7593a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7594b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f7595c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7596d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f7595c = map;
        this.f7596d = str;
    }

    public void a() {
        super.a();
        j();
    }

    public void a(a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            com.iab.omid.library.amazon.d.b.a(jSONObject, next, injectedResourcesMap.get(next));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b  reason: collision with root package name */
            private final WebView f7598b = b.this.f7593a;

            public void run() {
                this.f7598b.destroy();
            }
        }, Math.max(4000 - (this.f7594b == null ? 4000 : TimeUnit.MILLISECONDS.convert(d.a() - this.f7594b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f7593a = null;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.amazon.b.d.a().b());
        this.f7593a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f7593a);
        e.a().a(this.f7593a, this.f7596d);
        for (String next : this.f7595c.keySet()) {
            e.a().a(this.f7593a, this.f7595c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f7594b = Long.valueOf(d.a());
    }
}
