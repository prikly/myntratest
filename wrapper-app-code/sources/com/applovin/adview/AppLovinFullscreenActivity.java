package com.applovin.adview;

import android.app.Activity;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.webkit.WebView;
import android.window.OnBackInvokedCallback;
import com.applovin.impl.adview.activity.FullscreenAdService;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.adview.activity.b.e;
import com.applovin.impl.adview.k;
import com.applovin.impl.adview.o;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.h;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkSettings;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinFullscreenActivity extends Activity implements k {
    public static o parentInterstitialWrapper;

    /* renamed from: a  reason: collision with root package name */
    private n f10926a;
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public com.applovin.impl.adview.activity.b.a f10927b;

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f10928c = new AtomicBoolean(true);

    /* renamed from: d  reason: collision with root package name */
    private com.applovin.impl.adview.activity.a f10929d;

    /* renamed from: e  reason: collision with root package name */
    private a f10930e;

    /* renamed from: f  reason: collision with root package name */
    private boolean f10931f;

    private static class a implements OnBackInvokedCallback {

        /* renamed from: a  reason: collision with root package name */
        private final Runnable f10934a;

        protected a(Runnable runnable) {
            this.f10934a = runnable;
        }

        public void onBackInvoked() {
            this.f10934a.run();
        }
    }

    /* access modifiers changed from: private */
    public void a() {
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.l();
        }
        if (Utils.isAppLovinTestEnvironment(getApplicationContext())) {
            super.onBackPressed();
        }
    }

    public void dismiss() {
        if (h.k() && this.f10930e != null) {
            getOnBackInvokedDispatcher().unregisterOnBackInvokedCallback(this.f10930e);
            this.f10930e = null;
        }
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.h();
        } else {
            finish();
        }
    }

    public void onBackPressed() {
        a();
    }

    public void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.a(configuration);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle != null && parentInterstitialWrapper == null) {
            if (bundle.getBoolean("com.applovin.dismiss_on_restore", false)) {
                v.h("AppLovinFullscreenActivity", "Dismissing ad. Activity was destroyed while in background.");
                dismiss();
                return;
            }
            v.f("AppLovinFullscreenActivity", "Activity was destroyed while in background.");
        }
        try {
            requestWindowFeature(1);
        } catch (Throwable th) {
            v.c("AppLovinFullscreenActivity", "Failed to request window feature", th);
        }
        getWindow().setFlags(1024, 1024);
        getWindow().addFlags(16777216);
        getWindow().addFlags(128);
        View findViewById = findViewById(16908290);
        findViewById.setBackgroundColor(-16777216);
        String stringExtra = getIntent().getStringExtra("com.applovin.interstitial.sdk_key");
        if (TextUtils.isEmpty(stringExtra)) {
            o oVar = parentInterstitialWrapper;
            if (!(oVar == null || oVar.e() == null)) {
                o.a(parentInterstitialWrapper.e(), parentInterstitialWrapper.b(), "Empty SDK key", (Throwable) null, this);
            }
            finish();
            return;
        }
        n nVar = AppLovinSdk.getInstance(stringExtra, new AppLovinSdkSettings(this), this).coreSdk;
        this.f10926a = nVar;
        this.f10931f = ((Boolean) nVar.a(b.cL)).booleanValue();
        if (((Boolean) this.f10926a.a(b.cM)).booleanValue()) {
            findViewById.setFitsSystemWindows(true);
        }
        com.applovin.impl.sdk.utils.b.a(this.f10931f, this);
        if (h.k() && ((Boolean) this.f10926a.a(b.fg)).booleanValue()) {
            this.f10930e = new a(new Runnable() {
                public void run() {
                    AppLovinFullscreenActivity.this.a();
                }
            });
            getOnBackInvokedDispatcher().registerOnBackInvokedCallback(0, this.f10930e);
        }
        o oVar2 = parentInterstitialWrapper;
        if (oVar2 != null) {
            com.applovin.impl.adview.activity.b.a.a(oVar2.e(), parentInterstitialWrapper.d(), parentInterstitialWrapper.b(), parentInterstitialWrapper.c(), this.f10926a, this, new a.C0137a() {
                public void a(com.applovin.impl.adview.activity.b.a aVar) {
                    com.applovin.impl.adview.activity.b.a unused = AppLovinFullscreenActivity.this.f10927b = aVar;
                    aVar.d();
                }

                public void a(String str, Throwable th) {
                    o.a(AppLovinFullscreenActivity.parentInterstitialWrapper.e(), AppLovinFullscreenActivity.parentInterstitialWrapper.b(), str, th, AppLovinFullscreenActivity.this);
                }
            });
            return;
        }
        Intent intent = new Intent(this, FullscreenAdService.class);
        com.applovin.impl.adview.activity.a aVar = new com.applovin.impl.adview.activity.a(this, this.f10926a);
        this.f10929d = aVar;
        bindService(intent, aVar, 1);
        if (h.h()) {
            String str = this.f10926a.q().getExtraParameters().get(AppLovinSdkExtraParameterKey.DISABLE_SET_DATA_DIRECTORY_SUFFIX);
            if (!StringUtils.isValidString(str) || !Boolean.parseBoolean(str)) {
                try {
                    WebView.setDataDirectorySuffix(String.valueOf(Process.myPid()));
                } catch (Throwable unused) {
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        parentInterstitialWrapper = null;
        com.applovin.impl.adview.activity.a aVar = this.f10929d;
        if (aVar != null) {
            try {
                unbindService(aVar);
            } catch (Throwable unused) {
            }
        }
        com.applovin.impl.adview.activity.b.a aVar2 = this.f10927b;
        if (aVar2 != null) {
            if (!aVar2.i()) {
                this.f10927b.h();
            }
            this.f10927b.k();
        }
        super.onDestroy();
    }

    public boolean onKeyDown(int i, KeyEvent keyEvent) {
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.a(i, keyEvent);
        }
        return super.onKeyDown(i, keyEvent);
    }

    /* access modifiers changed from: protected */
    public void onPause() {
        super.onPause();
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.g();
        }
    }

    /* access modifiers changed from: protected */
    public void onResume() {
        com.applovin.impl.adview.activity.b.a aVar;
        try {
            super.onResume();
            if (!this.f10928c.get() && (aVar = this.f10927b) != null) {
                aVar.f();
            }
        } catch (IllegalArgumentException e2) {
            this.f10926a.D();
            if (v.a()) {
                this.f10926a.D().b("AppLovinFullscreenActivity", "Error was encountered in onResume().", e2);
            }
            dismiss();
        }
    }

    /* access modifiers changed from: protected */
    public void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        n nVar = this.f10926a;
        if (nVar != null) {
            bundle.putBoolean("com.applovin.dismiss_on_restore", ((Boolean) nVar.a(b.eY)).booleanValue());
        }
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        super.onStop();
        com.applovin.impl.adview.activity.b.a aVar = this.f10927b;
        if (aVar != null) {
            aVar.j();
        }
    }

    public void onWindowFocusChanged(boolean z) {
        if (this.f10927b != null) {
            if (!this.f10928c.getAndSet(false) || (this.f10927b instanceof e)) {
                this.f10927b.c(z);
            }
            if (z) {
                com.applovin.impl.sdk.utils.b.a(this.f10931f, this);
            }
        }
        super.onWindowFocusChanged(z);
    }

    public void setPresenter(com.applovin.impl.adview.activity.b.a aVar) {
        this.f10927b = aVar;
    }
}
