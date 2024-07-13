package com.applovin.impl.sdk;

import android.app.Activity;
import android.content.Intent;
import android.webkit.WebView;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.l;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.a;
import com.applovin.impl.sdk.utils.i;
import com.applovin.sdk.AppLovinPrivacySettings;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.AppLovinUserService;
import com.applovin.sdk.AppLovinWebViewActivity;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.concurrent.atomic.AtomicBoolean;

public class m implements l.a, AppLovinWebViewActivity.EventListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public static final AtomicBoolean f15578a = new AtomicBoolean();
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public static WeakReference<AppLovinWebViewActivity> f15579b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final n f15580c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final v f15581d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public AppLovinUserService.OnConsentDialogDismissListener f15582e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public l f15583f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public WeakReference<Activity> f15584g = new WeakReference<>((Object) null);
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public a f15585h;
    private AtomicBoolean i = new AtomicBoolean();

    m(n nVar) {
        this.f15580c = nVar;
        this.f15581d = nVar.D();
        if (nVar.R() != null) {
            this.f15584g = new WeakReference<>(nVar.R());
        }
        n.a(n.Q()).a(new a() {
            public void onActivityStarted(Activity activity) {
                WeakReference unused = m.this.f15584g = new WeakReference(activity);
            }
        });
        this.f15583f = new l(this, nVar);
    }

    private void a(boolean z, long j) {
        g();
        if (z) {
            a(j);
        }
    }

    /* access modifiers changed from: private */
    public boolean a(n nVar) {
        String str;
        if (d()) {
            str = "Consent dialog already showing";
        } else if (!i.a(nVar.P())) {
            str = "No internet available, skip showing of consent dialog";
        } else if (!((Boolean) nVar.a(b.aB)).booleanValue()) {
            if (v.a()) {
                this.f15581d.e("ConsentDialogManager", "Blocked publisher from showing consent dialog");
            }
            return false;
        } else if (StringUtils.isValidString((String) nVar.a(b.aC))) {
            return true;
        } else {
            if (v.a()) {
                this.f15581d.e("ConsentDialogManager", "AdServer returned empty consent dialog URL");
            }
            return false;
        }
        v.i("AppLovinSdk", str);
        return false;
    }

    private void g() {
        this.f15580c.ai().b(this.f15585h);
        if (d()) {
            AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) f15579b.get();
            f15579b = null;
            if (appLovinWebViewActivity != null) {
                appLovinWebViewActivity.finish();
                AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = this.f15582e;
                if (onConsentDialogDismissListener != null) {
                    onConsentDialogDismissListener.onDismiss();
                    this.f15582e = null;
                }
            }
        }
    }

    public void a() {
        final Activity activity = (Activity) this.f15584g.get();
        if (activity != null) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    m.this.a(activity, (AppLovinUserService.OnConsentDialogDismissListener) null);
                }
            }, ((Long) this.f15580c.a(b.aE)).longValue());
        }
    }

    public void a(final long j) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                v unused = m.this.f15581d;
                if (v.a()) {
                    m.this.f15581d.b("ConsentDialogManager", "Scheduling repeating consent alert");
                }
                m.this.f15583f.a(j, m.this.f15580c, m.this);
            }
        });
    }

    public void a(final Activity activity, final AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener) {
        activity.runOnUiThread(new Runnable() {
            public void run() {
                m mVar = m.this;
                if (!mVar.a(mVar.f15580c) || m.f15578a.getAndSet(true)) {
                    AppLovinUserService.OnConsentDialogDismissListener onConsentDialogDismissListener = onConsentDialogDismissListener;
                    if (onConsentDialogDismissListener != null) {
                        onConsentDialogDismissListener.onDismiss();
                        return;
                    }
                    return;
                }
                WeakReference unused = m.this.f15584g = new WeakReference(activity);
                AppLovinUserService.OnConsentDialogDismissListener unused2 = m.this.f15582e = onConsentDialogDismissListener;
                a unused3 = m.this.f15585h = new a() {
                    public void onActivityStarted(Activity activity) {
                        if (activity instanceof AppLovinWebViewActivity) {
                            if (!m.this.d() || m.f15579b.get() != activity) {
                                AppLovinWebViewActivity appLovinWebViewActivity = (AppLovinWebViewActivity) activity;
                                WeakReference unused = m.f15579b = new WeakReference(appLovinWebViewActivity);
                                appLovinWebViewActivity.loadUrl((String) m.this.f15580c.a(b.aC), m.this);
                            }
                            m.f15578a.set(false);
                        }
                    }
                };
                m.this.f15580c.ai().a(m.this.f15585h);
                Intent intent = new Intent(activity, AppLovinWebViewActivity.class);
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_SDK_KEY, m.this.f15580c.C());
                intent.putExtra(AppLovinWebViewActivity.INTENT_EXTRA_KEY_IMMERSIVE_MODE_ON, (Serializable) m.this.f15580c.a(b.aD));
                activity.startActivity(intent);
            }
        });
    }

    public void b() {
    }

    public void c() {
        if (!this.i.getAndSet(true)) {
            final String str = (String) this.f15580c.a(b.aC);
            AppLovinSdkUtils.runOnUiThread(new Runnable() {
                public void run() {
                    WebView tryToCreateWebView = Utils.tryToCreateWebView(m.this.f15580c.P(), "preloading consent dialog");
                    if (tryToCreateWebView != null) {
                        tryToCreateWebView.loadUrl(str);
                    }
                }
            });
        }
    }

    /* access modifiers changed from: package-private */
    public boolean d() {
        WeakReference<AppLovinWebViewActivity> weakReference = f15579b;
        return (weakReference == null || weakReference.get() == null) ? false : true;
    }

    public void onReceivedEvent(String str) {
        boolean booleanValue;
        n nVar;
        b bVar;
        if ("accepted".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(true, this.f15580c.P());
            g();
            return;
        }
        if ("rejected".equalsIgnoreCase(str)) {
            AppLovinPrivacySettings.setHasUserConsent(false, this.f15580c.P());
            booleanValue = ((Boolean) this.f15580c.a(b.aF)).booleanValue();
            nVar = this.f15580c;
            bVar = b.aK;
        } else if ("closed".equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f15580c.a(b.aG)).booleanValue();
            nVar = this.f15580c;
            bVar = b.aL;
        } else if (AppLovinWebViewActivity.EVENT_DISMISSED_VIA_BACK_BUTTON.equalsIgnoreCase(str)) {
            booleanValue = ((Boolean) this.f15580c.a(b.aH)).booleanValue();
            nVar = this.f15580c;
            bVar = b.aM;
        } else {
            return;
        }
        a(booleanValue, ((Long) nVar.a(bVar)).longValue());
    }
}
