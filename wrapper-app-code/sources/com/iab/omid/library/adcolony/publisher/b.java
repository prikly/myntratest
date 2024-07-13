package com.iab.omid.library.adcolony.publisher;

import android.os.Handler;
import android.webkit.WebView;
import com.iab.omid.library.adcolony.adsession.AdSessionContext;
import com.iab.omid.library.adcolony.adsession.VerificationScriptResource;
import com.iab.omid.library.adcolony.adsession.a;
import com.iab.omid.library.adcolony.b.e;
import com.iab.omid.library.adcolony.d.d;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;

public class b extends AdSessionStatePublisher {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public WebView f7486a;

    /* renamed from: b  reason: collision with root package name */
    private Long f7487b = null;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, VerificationScriptResource> f7488c;

    /* renamed from: d  reason: collision with root package name */
    private final String f7489d;

    public b(Map<String, VerificationScriptResource> map, String str) {
        this.f7488c = map;
        this.f7489d = str;
    }

    public void a() {
        super.a();
        j();
    }

    public void a(a aVar, AdSessionContext adSessionContext) {
        JSONObject jSONObject = new JSONObject();
        Map<String, VerificationScriptResource> injectedResourcesMap = adSessionContext.getInjectedResourcesMap();
        for (String next : injectedResourcesMap.keySet()) {
            com.iab.omid.library.adcolony.d.b.a(jSONObject, next, injectedResourcesMap.get(next));
        }
        a(aVar, adSessionContext, jSONObject);
    }

    public void b() {
        super.b();
        new Handler().postDelayed(new Runnable() {

            /* renamed from: b  reason: collision with root package name */
            private final WebView f7491b;

            {
                this.f7491b = b.this.f7486a;
            }

            public void run() {
                this.f7491b.destroy();
            }
        }, Math.max(4000 - (this.f7487b == null ? 4000 : TimeUnit.MILLISECONDS.convert(d.a() - this.f7487b.longValue(), TimeUnit.NANOSECONDS)), 2000));
        this.f7486a = null;
    }

    /* access modifiers changed from: package-private */
    public void j() {
        WebView webView = new WebView(com.iab.omid.library.adcolony.b.d.a().b());
        this.f7486a = webView;
        webView.getSettings().setJavaScriptEnabled(true);
        a(this.f7486a);
        e.a().a(this.f7486a, this.f7489d);
        for (String next : this.f7488c.keySet()) {
            e.a().a(this.f7486a, this.f7488c.get(next).getResourceUrl().toExternalForm(), next);
        }
        this.f7487b = Long.valueOf(d.a());
    }
}
