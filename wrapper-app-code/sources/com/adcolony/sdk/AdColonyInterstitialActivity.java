package com.adcolony.sdk;

import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

public class AdColonyInterstitialActivity extends b {
    AdColonyInterstitial j;
    private i k;

    public AdColonyInterstitialActivity() {
        AdColonyInterstitial adColonyInterstitial;
        if (!a.d()) {
            adColonyInterstitial = null;
        } else {
            adColonyInterstitial = a.b().j();
        }
        this.j = adColonyInterstitial;
    }

    /* access modifiers changed from: package-private */
    public void a(h0 h0Var) {
        String e2;
        super.a(h0Var);
        d c2 = a.b().c();
        f1 f2 = c0.f(h0Var.a(), "v4iap");
        e1 a2 = c0.a(f2, "product_ids");
        AdColonyInterstitial adColonyInterstitial = this.j;
        if (!(adColonyInterstitial == null || adColonyInterstitial.getListener() == null || (e2 = a2.e(0)) == null)) {
            this.j.getListener().onIAPEvent(this.j, e2, c0.d(f2, "engagement_type"));
        }
        c2.a(this.f9907a);
        if (this.j != null) {
            c2.f().remove(this.j.b());
            if (this.j.getListener() != null) {
                this.j.getListener().onClosed(this.j);
                this.j.a((c) null);
                this.j.setListener((AdColonyInterstitialListener) null);
            }
            this.j.o();
            this.j = null;
        }
        i iVar = this.k;
        if (iVar != null) {
            iVar.a();
            this.k = null;
        }
    }

    public /* bridge */ /* synthetic */ void onBackPressed() {
        super.onBackPressed();
    }

    public /* bridge */ /* synthetic */ void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
    }

    public void onCreate(Bundle bundle) {
        int i;
        AdColonyInterstitial adColonyInterstitial;
        AdColonyInterstitial adColonyInterstitial2 = this.j;
        if (adColonyInterstitial2 == null) {
            i = -1;
        } else {
            i = adColonyInterstitial2.f();
        }
        this.f9908b = i;
        super.onCreate(bundle);
        if (a.d() && (adColonyInterstitial = this.j) != null) {
            p0 e2 = adColonyInterstitial.e();
            if (e2 != null) {
                e2.a(this.f9907a);
            }
            this.k = new i(new Handler(Looper.getMainLooper()), this.j);
            if (this.j.getListener() != null) {
                this.j.getListener().onOpened(this.j);
            }
        }
    }

    public /* bridge */ /* synthetic */ void onDestroy() {
        super.onDestroy();
    }

    public /* bridge */ /* synthetic */ void onPause() {
        super.onPause();
    }

    public /* bridge */ /* synthetic */ void onResume() {
        super.onResume();
    }

    public /* bridge */ /* synthetic */ void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
    }
}
