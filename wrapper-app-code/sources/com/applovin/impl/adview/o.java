package com.applovin.impl.adview;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Handler;
import android.os.StrictMode;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinFullscreenActivity;
import com.applovin.adview.AppLovinFullscreenAdViewObserver;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.activity.b.a;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.d.f;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.i;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.WeakReference;

public class o implements AppLovinInterstitialAdDialog {

    /* renamed from: a  reason: collision with root package name */
    protected final n f14198a;

    /* renamed from: b  reason: collision with root package name */
    private final WeakReference<Context> f14199b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public volatile AppLovinAdLoadListener f14200c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public volatile AppLovinAdDisplayListener f14201d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public volatile AppLovinAdVideoPlaybackListener f14202e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public volatile AppLovinAdClickListener f14203f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public volatile e f14204g;

    public o(AppLovinSdk appLovinSdk, Context context) {
        if (appLovinSdk == null) {
            throw new IllegalArgumentException("No sdk specified");
        } else if (context != null) {
            this.f14198a = appLovinSdk.coreSdk;
            this.f14199b = new WeakReference<>(context);
        } else {
            throw new IllegalArgumentException("No context specified");
        }
    }

    /* access modifiers changed from: private */
    public void a(final int i) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (o.this.f14200c != null) {
                    o.this.f14200c.failedToReceiveAd(i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(Context context) {
        Intent intent = new Intent(context, AppLovinFullscreenActivity.class);
        intent.putExtra("com.applovin.interstitial.sdk_key", this.f14198a.C());
        AppLovinFullscreenActivity.parentInterstitialWrapper = this;
        StrictMode.ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        if (context instanceof Activity) {
            context.startActivity(intent);
            ((Activity) context).overridePendingTransition(0, 0);
        } else {
            intent.setFlags(268435456);
            context.startActivity(intent);
        }
        StrictMode.setThreadPolicy(allowThreadDiskReads);
    }

    private void a(e eVar, final Context context) {
        f();
        this.f14204g = eVar;
        final long max = Math.max(0, ((Long) this.f14198a.a(b.ct)).longValue());
        this.f14198a.D();
        if (v.a()) {
            v D = this.f14198a.D();
            D.b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        a(eVar, context, (Runnable) new Runnable() {
            public void run() {
                new Handler(context.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        o.this.f14198a.D();
                        if (v.a()) {
                            o.this.f14198a.D().b("InterstitialAdDialogWrapper", "Presenting ad in a fullscreen activity");
                        }
                        o.this.a(context);
                    }
                }, max);
            }
        });
    }

    private void a(e eVar, Context context, final Runnable runnable) {
        if (!TextUtils.isEmpty(eVar.N()) || !eVar.ah() || i.a(context) || !(context instanceof Activity)) {
            runnable.run();
            return;
        }
        AlertDialog create = new AlertDialog.Builder(context).setTitle(eVar.ai()).setMessage(eVar.aj()).setPositiveButton(eVar.ak(), (DialogInterface.OnClickListener) null).create();
        create.setOnDismissListener(new DialogInterface.OnDismissListener() {
            public void onDismiss(DialogInterface dialogInterface) {
                runnable.run();
            }
        });
        create.show();
    }

    private void a(e eVar, ViewGroup viewGroup, AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver, Context context) {
        f();
        this.f14204g = eVar;
        final long max = Math.max(0, ((Long) this.f14198a.a(b.ct)).longValue());
        this.f14198a.D();
        if (v.a()) {
            v D = this.f14198a.D();
            D.b("InterstitialAdDialogWrapper", "Presenting ad with delay of " + max);
        }
        final Context context2 = context;
        final ViewGroup viewGroup2 = viewGroup;
        final AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver2 = appLovinFullscreenAdViewObserver;
        a(eVar, context, (Runnable) new Runnable() {
            public void run() {
                new Handler(context2.getMainLooper()).postDelayed(new Runnable() {
                    public void run() {
                        o.this.f14198a.D();
                        if (v.a()) {
                            v D = o.this.f14198a.D();
                            D.b("InterstitialAdDialogWrapper", "Presenting ad in a containerView(" + viewGroup2 + ")");
                        }
                        viewGroup2.setBackgroundColor(-16777216);
                        a.a(o.this.f14204g, o.this.f14203f, o.this.f14201d, o.this.f14202e, o.this.f14198a, (Activity) context2, new a.C0137a() {
                            public void a(a aVar) {
                                if (com.applovin.impl.sdk.utils.b.a((Activity) context2)) {
                                    v.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad when parent activity is finishing");
                                    o.a(o.this.f14204g, o.this.f14201d, "Failed to show interstitial: attempting to show ad when parent activity is finishing", (Throwable) null, (AppLovinFullscreenActivity) null);
                                    return;
                                }
                                appLovinFullscreenAdViewObserver2.setPresenter(aVar);
                                try {
                                    aVar.a(viewGroup2);
                                } catch (Throwable th) {
                                    String str = "Failed to show interstitial: presenter threw exception " + th;
                                    v.i("InterstitialAdDialogWrapper", str);
                                    o.a(o.this.f14204g, o.this.f14201d, str, (Throwable) null, (AppLovinFullscreenActivity) null);
                                }
                            }

                            public void a(String str, Throwable th) {
                                o.a(o.this.f14204g, o.this.f14201d, str, th, (AppLovinFullscreenActivity) null);
                            }
                        });
                    }
                }, max);
            }
        });
    }

    public static void a(e eVar, AppLovinAdDisplayListener appLovinAdDisplayListener, String str, Throwable th, AppLovinFullscreenActivity appLovinFullscreenActivity) {
        v.c("InterstitialAdDialogWrapper", str, th);
        if (appLovinAdDisplayListener instanceof g) {
            k.a(appLovinAdDisplayListener, str);
        } else {
            k.b(appLovinAdDisplayListener, (AppLovinAd) eVar);
        }
        if (appLovinFullscreenActivity != null) {
            appLovinFullscreenActivity.dismiss();
        }
    }

    private void a(AppLovinAd appLovinAd) {
        if (this.f14201d != null) {
            this.f14201d.adHidden(appLovinAd);
        }
    }

    private void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14198a.v().loadNextAd(AppLovinAdSize.INTERSTITIAL, appLovinAdLoadListener);
    }

    private boolean a(AppLovinAd appLovinAd, AppLovinAd appLovinAd2, Context context) {
        String str;
        if (context == null) {
            str = "Failed to show interstitial: stale activity reference provided";
        } else if (appLovinAd == null) {
            str = "Failed to show ad: " + appLovinAd2;
        } else if (((AppLovinAdImpl) appLovinAd).hasShown() && ((Boolean) this.f14198a.a(b.ch)).booleanValue()) {
            throw new IllegalStateException("Failed to display ad - ad can only be displayed once. Load the next ad.");
        } else if (appLovinAd instanceof e) {
            return true;
        } else {
            this.f14198a.D();
            if (v.a()) {
                this.f14198a.D().e("InterstitialAdDialogWrapper", "Failed to show interstitial: unknown ad type provided: '" + appLovinAd + "'");
            }
            return false;
        }
        v.i("InterstitialAdDialogWrapper", str);
        return false;
    }

    /* access modifiers changed from: private */
    public void b(final AppLovinAd appLovinAd) {
        AppLovinSdkUtils.runOnUiThread(new Runnable() {
            public void run() {
                if (o.this.f14200c != null) {
                    o.this.f14200c.adReceived(appLovinAd);
                }
            }
        });
    }

    private void f() {
        if (this.f14198a.ai().b() == null) {
            this.f14198a.W().a(f.o);
        }
    }

    private Context g() {
        return (Context) this.f14199b.get();
    }

    public void a() {
        this.f14203f = null;
        this.f14200c = null;
        this.f14202e = null;
        this.f14201d = null;
    }

    public AppLovinAdDisplayListener b() {
        return this.f14201d;
    }

    public AppLovinAdVideoPlaybackListener c() {
        return this.f14202e;
    }

    public AppLovinAdClickListener d() {
        return this.f14203f;
    }

    public e e() {
        return this.f14204g;
    }

    public void setAdClickListener(AppLovinAdClickListener appLovinAdClickListener) {
        this.f14203f = appLovinAdClickListener;
    }

    public void setAdDisplayListener(AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f14201d = appLovinAdDisplayListener;
    }

    public void setAdLoadListener(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f14200c = appLovinAdLoadListener;
    }

    public void setAdVideoPlaybackListener(AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener) {
        this.f14202e = appLovinAdVideoPlaybackListener;
    }

    public void show() {
        a((AppLovinAdLoadListener) new AppLovinAdLoadListener() {
            public void adReceived(AppLovinAd appLovinAd) {
                o.this.b(appLovinAd);
                o.this.showAndRender(appLovinAd);
            }

            public void failedToReceiveAd(int i) {
                o.this.a(i);
            }
        });
    }

    public void showAndRender(AppLovinAd appLovinAd) {
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f14198a);
        Context g2 = g();
        if (!a(maybeRetrieveNonDummyAd, appLovinAd, g2)) {
            a(appLovinAd);
        } else {
            a((e) maybeRetrieveNonDummyAd, g2);
        }
    }

    public void showAndRender(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle) {
        if (viewGroup == null || lifecycle == null) {
            v.i("InterstitialAdDialogWrapper", "Failed to show interstitial: attempting to show ad with null container view or lifecycle object");
            a(appLovinAd);
            return;
        }
        AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAd, this.f14198a);
        Context g2 = g();
        if (!a(maybeRetrieveNonDummyAd, appLovinAd, g2)) {
            a(appLovinAd);
            return;
        }
        AppLovinFullscreenAdViewObserver appLovinFullscreenAdViewObserver = new AppLovinFullscreenAdViewObserver(lifecycle, this, this.f14198a);
        lifecycle.addObserver(appLovinFullscreenAdViewObserver);
        a((e) maybeRetrieveNonDummyAd, viewGroup, appLovinFullscreenAdViewObserver, g2);
    }

    public String toString() {
        return "AppLovinInterstitialAdDialog{}";
    }
}
