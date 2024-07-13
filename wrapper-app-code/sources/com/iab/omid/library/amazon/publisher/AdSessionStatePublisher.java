package com.iab.omid.library.amazon.publisher;

import android.webkit.WebView;
import com.iab.omid.library.amazon.adsession.AdEvents;
import com.iab.omid.library.amazon.adsession.AdSessionConfiguration;
import com.iab.omid.library.amazon.adsession.AdSessionContext;
import com.iab.omid.library.amazon.adsession.ErrorType;
import com.iab.omid.library.amazon.adsession.VerificationScriptResource;
import com.iab.omid.library.amazon.adsession.media.MediaEvents;
import com.iab.omid.library.amazon.b.d;
import com.iab.omid.library.amazon.b.e;
import com.iab.omid.library.amazon.e.b;
import org.json.JSONArray;
import org.json.JSONObject;

public abstract class AdSessionStatePublisher {

    /* renamed from: a  reason: collision with root package name */
    private b f7584a = new b((WebView) null);

    /* renamed from: b  reason: collision with root package name */
    private AdEvents f7585b;

    /* renamed from: c  reason: collision with root package name */
    private MediaEvents f7586c;

    /* renamed from: d  reason: collision with root package name */
    private a f7587d;

    /* renamed from: e  reason: collision with root package name */
    private long f7588e;

    enum a {
        AD_STATE_IDLE,
        AD_STATE_VISIBLE,
        AD_STATE_NOTVISIBLE
    }

    public AdSessionStatePublisher() {
        i();
    }

    public void a() {
    }

    public void a(float f2) {
        e.a().a(getWebView(), f2);
    }

    /* access modifiers changed from: package-private */
    public void a(WebView webView) {
        this.f7584a = new b(webView);
    }

    public void a(AdEvents adEvents) {
        this.f7585b = adEvents;
    }

    public void a(AdSessionConfiguration adSessionConfiguration) {
        e.a().a(getWebView(), adSessionConfiguration.toJsonObject());
    }

    public void a(ErrorType errorType, String str) {
        e.a().a(getWebView(), errorType, str);
    }

    public void a(com.iab.omid.library.amazon.adsession.a aVar, AdSessionContext adSessionContext) {
        a(aVar, adSessionContext, (JSONObject) null);
    }

    /* access modifiers changed from: protected */
    public void a(com.iab.omid.library.amazon.adsession.a aVar, AdSessionContext adSessionContext, JSONObject jSONObject) {
        String adSessionId = aVar.getAdSessionId();
        JSONObject jSONObject2 = new JSONObject();
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "environment", "app");
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "adSessionType", adSessionContext.getAdSessionContextType());
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "deviceInfo", com.iab.omid.library.amazon.d.a.d());
        JSONArray jSONArray = new JSONArray();
        jSONArray.put("clid");
        jSONArray.put("vlid");
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "supports", jSONArray);
        JSONObject jSONObject3 = new JSONObject();
        com.iab.omid.library.amazon.d.b.a(jSONObject3, "partnerName", adSessionContext.getPartner().getName());
        com.iab.omid.library.amazon.d.b.a(jSONObject3, "partnerVersion", adSessionContext.getPartner().getVersion());
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "omidNativeInfo", jSONObject3);
        JSONObject jSONObject4 = new JSONObject();
        com.iab.omid.library.amazon.d.b.a(jSONObject4, "libraryVersion", "1.3.28-Amazon");
        com.iab.omid.library.amazon.d.b.a(jSONObject4, "appId", d.a().b().getApplicationContext().getPackageName());
        com.iab.omid.library.amazon.d.b.a(jSONObject2, "app", jSONObject4);
        if (adSessionContext.getContentUrl() != null) {
            com.iab.omid.library.amazon.d.b.a(jSONObject2, "contentUrl", adSessionContext.getContentUrl());
        }
        if (adSessionContext.getCustomReferenceData() != null) {
            com.iab.omid.library.amazon.d.b.a(jSONObject2, "customReferenceData", adSessionContext.getCustomReferenceData());
        }
        JSONObject jSONObject5 = new JSONObject();
        for (VerificationScriptResource next : adSessionContext.getVerificationScriptResources()) {
            com.iab.omid.library.amazon.d.b.a(jSONObject5, next.getVendorKey(), next.getVerificationParameters());
        }
        e.a().a(getWebView(), adSessionId, jSONObject2, jSONObject5, jSONObject);
    }

    public void a(MediaEvents mediaEvents) {
        this.f7586c = mediaEvents;
    }

    public void a(String str) {
        e.a().a(getWebView(), str, (JSONObject) null);
    }

    public void a(String str, long j) {
        if (j >= this.f7588e) {
            this.f7587d = a.AD_STATE_VISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public void a(String str, JSONObject jSONObject) {
        e.a().a(getWebView(), str, jSONObject);
    }

    public void a(JSONObject jSONObject) {
        e.a().b(getWebView(), jSONObject);
    }

    public void a(boolean z) {
        if (e()) {
            e.a().c(getWebView(), z ? "foregrounded" : "backgrounded");
        }
    }

    public void b() {
        this.f7584a.clear();
    }

    public void b(String str, long j) {
        if (j >= this.f7588e && this.f7587d != a.AD_STATE_NOTVISIBLE) {
            this.f7587d = a.AD_STATE_NOTVISIBLE;
            e.a().b(getWebView(), str);
        }
    }

    public AdEvents c() {
        return this.f7585b;
    }

    public MediaEvents d() {
        return this.f7586c;
    }

    public boolean e() {
        return this.f7584a.get() != null;
    }

    public void f() {
        e.a().a(getWebView());
    }

    public void g() {
        e.a().b(getWebView());
    }

    public WebView getWebView() {
        return (WebView) this.f7584a.get();
    }

    public void h() {
        e.a().c(getWebView());
    }

    public void i() {
        this.f7588e = com.iab.omid.library.amazon.d.d.a();
        this.f7587d = a.AD_STATE_IDLE;
    }
}
