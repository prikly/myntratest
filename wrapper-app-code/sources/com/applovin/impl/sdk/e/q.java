package com.applovin.impl.sdk.e;

import android.net.Uri;
import android.webkit.WebView;
import com.applovin.impl.adview.b;
import com.applovin.impl.adview.d;
import com.applovin.impl.adview.e;
import com.applovin.impl.mediation.h;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinSdkUtils;
import org.json.JSONObject;

public class q extends a implements h.a {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final com.applovin.impl.sdk.ad.a f15492a;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public AppLovinAdLoadListener f15493e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public d f15494f;

    private class a extends e {
        private a(n nVar) {
            super((b) null, nVar);
        }

        private boolean a(String str, com.applovin.impl.sdk.c.b<String> bVar) {
            for (String equalsIgnoreCase : q.this.f15418b.b(bVar)) {
                if (equalsIgnoreCase.equalsIgnoreCase(str)) {
                    return true;
                }
            }
            return false;
        }

        /* access modifiers changed from: protected */
        public boolean a(WebView webView, String str) {
            v vVar = q.this.f15420d;
            if (v.a()) {
                v vVar2 = q.this.f15420d;
                String str2 = q.this.f15419c;
                vVar2.c(str2, "Processing click on ad URL \"" + str + "\"");
            }
            if (str == null || !(webView instanceof d)) {
                return true;
            }
            Uri parse = Uri.parse(str);
            String scheme = parse.getScheme();
            String host = parse.getHost();
            if (!a(scheme, com.applovin.impl.sdk.c.b.ci)) {
                return true;
            }
            if (a(host, com.applovin.impl.sdk.c.b.cj)) {
                v vVar3 = q.this.f15420d;
                if (v.a()) {
                    q.this.f15420d.b(q.this.f15419c, "Ad load succeeded");
                }
                if (q.this.f15493e == null) {
                    return true;
                }
                q.this.f15493e.adReceived(q.this.f15492a);
            } else if (a(host, com.applovin.impl.sdk.c.b.ck)) {
                v vVar4 = q.this.f15420d;
                if (v.a()) {
                    q.this.f15420d.b(q.this.f15419c, "Ad load failed");
                }
                if (q.this.f15493e == null) {
                    return true;
                }
                q.this.f15493e.failedToReceiveAd(204);
            } else {
                v vVar5 = q.this.f15420d;
                if (!v.a()) {
                    return true;
                }
                q.this.f15420d.e(q.this.f15419c, "Unrecognized webview event");
                return true;
            }
            AppLovinAdLoadListener unused = q.this.f15493e = null;
            return true;
        }
    }

    public q(JSONObject jSONObject, JSONObject jSONObject2, com.applovin.impl.sdk.ad.b bVar, AppLovinAdLoadListener appLovinAdLoadListener, n nVar) {
        super("TaskProcessJavaScriptTagAd", nVar);
        this.f15492a = new com.applovin.impl.sdk.ad.a(jSONObject, jSONObject2, bVar, nVar);
        this.f15493e = appLovinAdLoadListener;
        nVar.L().a((h.a) this);
    }

    public void a(com.applovin.impl.mediation.a.a aVar) {
        if (aVar.f().equalsIgnoreCase(this.f15492a.N())) {
            this.f15418b.L().b(this);
            AppLovinAdLoadListener appLovinAdLoadListener = this.f15493e;
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f15492a);
                this.f15493e = null;
            }
        }
    }

    public void run() {
        v vVar = this.f15420d;
        if (v.a()) {
            v vVar2 = this.f15420d;
            String str = this.f15419c;
            vVar2.b(str, "Rendering AppLovin ad #" + this.f15492a.getAdIdNumber());
        }
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                try {
                    d unused = q.this.f15494f = new d(new a(q.this.f15418b), q.this.f15418b, q.this.f());
                    q.this.f15494f.loadDataWithBaseURL(q.this.f15492a.aw(), q.this.f15492a.b(), "text/html", (String) null, "");
                } catch (Throwable th) {
                    q.this.f15418b.L().b(q.this);
                    v vVar = q.this.f15420d;
                    if (v.a()) {
                        q.this.f15420d.b(q.this.f15419c, "Failed to initialize WebView", th);
                    }
                    if (q.this.f15493e != null) {
                        q.this.f15493e.failedToReceiveAd(-1);
                        AppLovinAdLoadListener unused2 = q.this.f15493e = null;
                    }
                }
            }
        });
    }
}
