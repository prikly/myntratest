package com.iab.omid.library.applovin.publisher;

import android.webkit.WebView;
import com.iab.omid.library.applovin.adsession.AdEvents;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.ErrorType;
import com.iab.omid.library.applovin.adsession.VerificationScriptResource;
import com.iab.omid.library.applovin.adsession.media.MediaEvents;
import com.iab.omid.library.applovin.internal.g;
import com.iab.omid.library.applovin.utils.c;
import com.iab.omid.library.applovin.utils.f;
import com.iab.omid.library.applovin.weakreference.b;
import java.util.Date;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private b f7691a = new b((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f7692b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f7693c;

    /* renamed from: d  reason: collision with root package name */
    private a f7694d;

    /* renamed from: e  reason: collision with root package name */
    private long f7695e;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        a();
    }

    public void a() {
        this.f7695e = f.b();
        this.f7694d = a.AD_STATE_IDLE;
    }

    public void a(float f2) {
        g.a().a(getWebView(), f2);
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView) {
        this.f7691a = new b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f7692b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        g.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        g.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public void a(com.iab.omid.library.applovin.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        c.a(jSONObject2, "environment", "app");
        c.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        c.a(jSONObject2, "deviceInfo", com.iab.omid.library.applovin.utils.b.d());
        c.a(jSONObject2, "deviceCategory", com.iab.omid.library.applovin.utils.a.a().toString());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        c.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        c.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        c.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        c.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        c.a(jSONObject4, "libraryVersion", "1.4.1-Applovin");
        c.a(jSONObject4, "appId", com.iab.omid.library.applovin.internal.f.b().a().getApplicationContext().getPackageName());
        c.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            c.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            c.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            c.a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        g.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f7693c = mediaEvents;
    }

    public void a(String str) {
        g.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j) {
        a aVar;
        if (j >= this.f7695e && this.f7694d != (aVar = a.AD_STATE_NOTVISIBLE)) {
            this.f7694d = aVar;
            g.a().a(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        g.a().a(getWebView(), str, jSONObject);
    }

    public void a(Date date) {
        if (date != null) {
            JSONObject jSONObject = new JSONObject();
            c.a(jSONObject, "timestamp", Long.valueOf(date.getTime()));
            g.a().c(getWebView(), jSONObject);
        }
    }

    public void a(JSONObject jSONObject) {
        g.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            g.a().b(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f7691a.clear();
    }

    public void b(String str, long j) {
        if (j >= this.f7695e) {
            this.f7694d = a.AD_STATE_VISIBLE;
            g.a().a(getWebView(), str);
        }
    }

    public AdEvents c() {
        return this.f7692b;
    }

    public MediaEvents d() {
        return this.f7693c;
    }

    public boolean e() {
        return this.f7691a.get() != null;
    }

    public void f() {
        g.a().a(getWebView());
    }

    public void g() {
        g.a().b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f7691a.get();
    }

    public void h() {
        g.a().c(getWebView());
    }

    public void i() {
    }
}
