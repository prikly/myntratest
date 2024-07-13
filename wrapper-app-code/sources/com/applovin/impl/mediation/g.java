package com.applovin.impl.mediation;

import android.app.Activity;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.view.View;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.impl.mediation.MediationServiceImpl;
import com.applovin.impl.mediation.a.f;
import com.applovin.impl.mediation.a.h;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdViewAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdViewAdapter;
import com.applovin.mediation.adapter.MaxRewardedAdapter;
import com.applovin.mediation.adapter.MaxRewardedInterstitialAdapter;
import com.applovin.mediation.adapter.MaxSignalProvider;
import com.applovin.mediation.adapter.listeners.MaxAdViewAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxAppOpenAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxNativeAdAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxRewardedInterstitialAdapterListener;
import com.applovin.mediation.adapter.listeners.MaxSignalCollectionListener;
import com.applovin.mediation.adapter.parameters.MaxAdapterInitializationParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterResponseParameters;
import com.applovin.mediation.adapter.parameters.MaxAdapterSignalCollectionParameters;
import com.applovin.mediation.adapters.MediationAdapterBase;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import java.util.concurrent.atomic.AtomicBoolean;

public class g {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public final Handler f14955a = new Handler(Looper.getMainLooper());
    /* access modifiers changed from: private */

    /* renamed from: b  reason: collision with root package name */
    public final n f14956b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public final v f14957c;
    /* access modifiers changed from: private */

    /* renamed from: d  reason: collision with root package name */
    public final String f14958d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final f f14959e;
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public final String f14960f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public MaxAdapter f14961g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public String f14962h;
    /* access modifiers changed from: private */
    public com.applovin.impl.mediation.a.a i;
    /* access modifiers changed from: private */
    public View j;
    /* access modifiers changed from: private */
    public MaxNativeAd k;
    /* access modifiers changed from: private */
    public MaxNativeAdView l;
    /* access modifiers changed from: private */
    public final a m = new a();
    /* access modifiers changed from: private */
    public MaxAdapterResponseParameters n;
    private final AtomicBoolean o = new AtomicBoolean(true);
    /* access modifiers changed from: private */
    public final AtomicBoolean p = new AtomicBoolean(false);
    /* access modifiers changed from: private */
    public final AtomicBoolean q = new AtomicBoolean(false);
    private final boolean r;

    private class a implements MaxAdViewAdapterListener, MaxAppOpenAdapterListener, MaxInterstitialAdapterListener, MaxNativeAdAdapterListener, MaxRewardedAdapterListener, MaxRewardedInterstitialAdapterListener {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public MediationServiceImpl.a f15022b;

        private a() {
        }

        /* access modifiers changed from: private */
        public void a(MediationServiceImpl.a aVar) {
            if (aVar != null) {
                this.f15022b = aVar;
                return;
            }
            throw new IllegalArgumentException("No listener specified");
        }

        private void a(String str, final Bundle bundle) {
            if (g.this.i.x().get()) {
                v unused = g.this.f14957c;
                if (v.a()) {
                    v a2 = g.this.f14957c;
                    a2.e("MediationAdapterWrapper", g.this.f14960f + ": blocking ad loaded callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.f14956b.aj().b(g.this.i, str);
                return;
            }
            g.this.q.set(true);
            a(str, (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.f15022b.a(g.this.i, bundle);
                    }
                }
            });
        }

        private void a(final String str, final MaxAdListener maxAdListener, final Runnable runnable) {
            g.this.f14955a.post(new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Exception e2) {
                        MaxAdListener maxAdListener = maxAdListener;
                        String name = maxAdListener != null ? maxAdListener.getClass().getName() : null;
                        v.c("MediationAdapterWrapper", "Failed to forward call (" + str + ") to " + name, e2);
                    }
                }
            });
        }

        /* access modifiers changed from: private */
        public void a(String str, final MaxError maxError) {
            if (g.this.i.x().get()) {
                v unused = g.this.f14957c;
                if (v.a()) {
                    v a2 = g.this.f14957c;
                    a2.e("MediationAdapterWrapper", g.this.f14960f + ": blocking ad load failed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.f14956b.aj().b(g.this.i, str);
                return;
            }
            a(str, (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    if (g.this.p.compareAndSet(false, true)) {
                        a.this.f15022b.onAdLoadFailed(g.this.f14962h, maxError);
                    }
                }
            });
        }

        private void b(String str, final Bundle bundle) {
            if (g.this.i.x().get()) {
                v unused = g.this.f14957c;
                if (v.a()) {
                    v a2 = g.this.f14957c;
                    a2.e("MediationAdapterWrapper", g.this.f14960f + ": blocking ad displayed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.f14956b.aj().b(g.this.i, str);
            } else if (g.this.i.w().compareAndSet(false, true)) {
                a(str, (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                    public void run() {
                        a.this.f15022b.b(g.this.i, bundle);
                    }
                });
            }
        }

        /* access modifiers changed from: private */
        public void b(String str, final MaxError maxError) {
            if (g.this.i.x().get()) {
                v unused = g.this.f14957c;
                if (v.a()) {
                    v a2 = g.this.f14957c;
                    a2.e("MediationAdapterWrapper", g.this.f14960f + ": blocking ad display failed callback for " + g.this.i + " since onAdHidden() has been called");
                }
                g.this.f14956b.aj().b(g.this.i, str);
                return;
            }
            a(str, (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onAdDisplayFailed(g.this.i, maxError);
                }
            });
        }

        private void c(String str, final Bundle bundle) {
            if (g.this.i.x().compareAndSet(false, true)) {
                a(str, (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                    public void run() {
                        a.this.f15022b.c(g.this.i, bundle);
                    }
                });
            }
        }

        public void onAdViewAdClicked() {
            onAdViewAdClicked((Bundle) null);
        }

        public void onAdViewAdClicked(final Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad clicked with extra info: " + bundle);
            }
            a("onAdViewAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.d(g.this.i, bundle);
                }
            });
        }

        public void onAdViewAdCollapsed() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad collapsed");
            }
            a("onAdViewAdCollapsed", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onAdCollapsed(g.this.i);
                }
            });
        }

        public void onAdViewAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": adview ad failed to display with error: " + maxAdapterError);
            }
            b("onAdViewAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdDisplayed() {
            onAdViewAdDisplayed((Bundle) null);
        }

        public void onAdViewAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad displayed with extra info: " + bundle);
            }
            b("onAdViewAdDisplayed", bundle);
        }

        public void onAdViewAdExpanded() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad expanded");
            }
            a("onAdViewAdExpanded", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onAdExpanded(g.this.i);
                }
            });
        }

        public void onAdViewAdHidden() {
            onAdViewAdHidden((Bundle) null);
        }

        public void onAdViewAdHidden(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad hidden with extra info: " + bundle);
            }
            c("onAdViewAdHidden", bundle);
        }

        public void onAdViewAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": adview ad ad failed to load with error: " + maxAdapterError);
            }
            a("onAdViewAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAdViewAdLoaded(View view) {
            onAdViewAdLoaded(view, (Bundle) null);
        }

        public void onAdViewAdLoaded(View view, Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": adview ad loaded with extra info: " + bundle);
            }
            View unused2 = g.this.j = view;
            a("onAdViewAdLoaded", bundle);
        }

        public void onAppOpenAdClicked() {
            onAppOpenAdClicked((Bundle) null);
        }

        public void onAppOpenAdClicked(final Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": app open ad clicked with extra info: " + bundle);
            }
            a("onAppOpenAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.d(g.this.i, bundle);
                }
            });
        }

        public void onAppOpenAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": app open ad display failed with error: " + maxAdapterError);
            }
            b("onAppOpenAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onAppOpenAdDisplayed() {
            onAppOpenAdDisplayed((Bundle) null);
        }

        public void onAppOpenAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": app open ad displayed with extra info: " + bundle);
            }
            b("onAppOpenAdDisplayed", bundle);
        }

        public void onAppOpenAdHidden() {
            onAppOpenAdHidden((Bundle) null);
        }

        public void onAppOpenAdHidden(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": app open ad hidden with extra info: " + bundle);
            }
            c("onAppOpenAdHidden", bundle);
        }

        public void onAppOpenAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": app open ad failed to load with error: " + maxAdapterError);
            }
            a("onAppOpenAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onAppOpenAdLoaded() {
            onAppOpenAdLoaded((Bundle) null);
        }

        public void onAppOpenAdLoaded(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": app open ad loaded with extra info: " + bundle);
            }
            a("onAppOpenAdLoaded", bundle);
        }

        public void onInterstitialAdClicked() {
            onInterstitialAdClicked((Bundle) null);
        }

        public void onInterstitialAdClicked(final Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad clicked with extra info: " + bundle);
            }
            a("onInterstitialAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.d(g.this.i, bundle);
                }
            });
        }

        public void onInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad failed to display with error " + maxAdapterError);
            }
            b("onInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdDisplayed() {
            onInterstitialAdDisplayed((Bundle) null);
        }

        public void onInterstitialAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad displayed with extra info: " + bundle);
            }
            b("onInterstitialAdDisplayed", bundle);
        }

        public void onInterstitialAdHidden() {
            onInterstitialAdHidden((Bundle) null);
        }

        public void onInterstitialAdHidden(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad hidden with extra info " + bundle);
            }
            c("onInterstitialAdHidden", bundle);
        }

        public void onInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad failed to load with error " + maxAdapterError);
            }
            a("onInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onInterstitialAdLoaded() {
            onInterstitialAdLoaded((Bundle) null);
        }

        public void onInterstitialAdLoaded(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": interstitial ad loaded with extra info: " + bundle);
            }
            a("onInterstitialAdLoaded", bundle);
        }

        public void onNativeAdClicked() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": native ad clicked");
            }
            a("onNativeAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onAdClicked(g.this.i);
                }
            });
        }

        public void onNativeAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": native ad displayed with extra info: " + bundle);
            }
            b("onNativeAdDisplayed", bundle);
        }

        public void onNativeAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": native ad ad failed to load with error: " + maxAdapterError);
            }
            a("onNativeAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onNativeAdLoaded(MaxNativeAd maxNativeAd, Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": native ad loaded with extra info: " + bundle);
            }
            MaxNativeAd unused2 = g.this.k = maxNativeAd;
            a("onNativeAdLoaded", bundle);
        }

        public void onRewardedAdClicked() {
            onRewardedAdClicked((Bundle) null);
        }

        public void onRewardedAdClicked(final Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad clicked with extra info: " + bundle);
            }
            a("onRewardedAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.d(g.this.i, bundle);
                }
            });
        }

        public void onRewardedAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad display failed with error: " + maxAdapterError);
            }
            b("onRewardedAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdDisplayed() {
            onRewardedAdDisplayed((Bundle) null);
        }

        public void onRewardedAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad displayed with extra info: " + bundle);
            }
            b("onRewardedAdDisplayed", bundle);
        }

        public void onRewardedAdHidden() {
            onRewardedAdHidden((Bundle) null);
        }

        public void onRewardedAdHidden(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad hidden with extra info: " + bundle);
            }
            c("onRewardedAdHidden", bundle);
        }

        public void onRewardedAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedAdLoaded() {
            onRewardedAdLoaded((Bundle) null);
        }

        public void onRewardedAdLoaded(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad loaded with extra info: " + bundle);
            }
            a("onRewardedAdLoaded", bundle);
        }

        public void onRewardedAdVideoCompleted() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded video completed");
            }
            a("onRewardedAdVideoCompleted", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onRewardedVideoCompleted(g.this.i);
                }
            });
        }

        public void onRewardedAdVideoStarted() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded video started");
            }
            a("onRewardedAdVideoStarted", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onRewardedVideoStarted(g.this.i);
                }
            });
        }

        public void onRewardedInterstitialAdClicked() {
            onRewardedInterstitialAdClicked((Bundle) null);
        }

        public void onRewardedInterstitialAdClicked(final Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial ad clicked with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdClicked", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.d(g.this.i, bundle);
                }
            });
        }

        public void onRewardedInterstitialAdDisplayFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial ad display failed with error: " + maxAdapterError);
            }
            b("onRewardedInterstitialAdDisplayFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdDisplayed() {
            onRewardedInterstitialAdDisplayed((Bundle) null);
        }

        public void onRewardedInterstitialAdDisplayed(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial ad displayed with extra info: " + bundle);
            }
            b("onRewardedInterstitialAdDisplayed", bundle);
        }

        public void onRewardedInterstitialAdHidden() {
            onRewardedInterstitialAdHidden((Bundle) null);
        }

        public void onRewardedInterstitialAdHidden(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial ad hidden with extra info: " + bundle);
            }
            c("onRewardedInterstitialAdHidden", bundle);
        }

        public void onRewardedInterstitialAdLoadFailed(MaxAdapterError maxAdapterError) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.d("MediationAdapterWrapper", g.this.f14960f + ": rewarded ad failed to load with error: " + maxAdapterError);
            }
            a("onRewardedInterstitialAdLoadFailed", (MaxError) maxAdapterError);
        }

        public void onRewardedInterstitialAdLoaded() {
            onRewardedInterstitialAdLoaded((Bundle) null);
        }

        public void onRewardedInterstitialAdLoaded(Bundle bundle) {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial ad loaded with extra info: " + bundle);
            }
            a("onRewardedInterstitialAdLoaded", bundle);
        }

        public void onRewardedInterstitialAdVideoCompleted() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial completed");
            }
            a("onRewardedInterstitialAdVideoCompleted", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onRewardedVideoCompleted(g.this.i);
                }
            });
        }

        public void onRewardedInterstitialAdVideoStarted() {
            v unused = g.this.f14957c;
            if (v.a()) {
                v a2 = g.this.f14957c;
                a2.c("MediationAdapterWrapper", g.this.f14960f + ": rewarded interstitial started");
            }
            a("onRewardedInterstitialAdVideoStarted", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                public void run() {
                    a.this.f15022b.onRewardedVideoStarted(g.this.i);
                }
            });
        }

        public void onUserRewarded(final MaxReward maxReward) {
            if (g.this.i instanceof com.applovin.impl.mediation.a.c) {
                final com.applovin.impl.mediation.a.c cVar = (com.applovin.impl.mediation.a.c) g.this.i;
                if (cVar.M().compareAndSet(false, true)) {
                    v unused = g.this.f14957c;
                    if (v.a()) {
                        v a2 = g.this.f14957c;
                        a2.c("MediationAdapterWrapper", g.this.f14960f + ": user was rewarded: " + maxReward);
                    }
                    a("onUserRewarded", (MaxAdListener) this.f15022b, (Runnable) new Runnable() {
                        public void run() {
                            a.this.f15022b.onUserRewarded(cVar, maxReward);
                        }
                    });
                }
            }
        }
    }

    private static class b implements MaxAdapter.OnCompletionListener {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final n f15057a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final f f15058b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final long f15059c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public final Runnable f15060d;

        public b(n nVar, f fVar, long j, Runnable runnable) {
            this.f15057a = nVar;
            this.f15058b = fVar;
            this.f15059c = j;
            this.f15060d = runnable;
        }

        public void onCompletion(final MaxAdapter.InitializationStatus initializationStatus, final String str) {
            AppLovinSdkUtils.runOnUiThreadDelayed(new Runnable() {
                public void run() {
                    b.this.f15057a.G().a(b.this.f15058b, SystemClock.elapsedRealtime() - b.this.f15059c, initializationStatus, str);
                    if (b.this.f15060d != null) {
                        b.this.f15060d.run();
                    }
                }
            }, this.f15058b.ae());
        }
    }

    private static class c {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public final h f15064a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final MaxSignalCollectionListener f15065b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public final AtomicBoolean f15066c = new AtomicBoolean();

        c(h hVar, MaxSignalCollectionListener maxSignalCollectionListener) {
            this.f15064a = hVar;
            this.f15065b = maxSignalCollectionListener;
        }
    }

    private class d extends com.applovin.impl.sdk.e.a {
        private d() {
            super("TaskTimeoutMediatedAd", g.this.f14956b);
        }

        private void a(com.applovin.impl.mediation.a.a aVar) {
            if (aVar != null) {
                this.f15418b.L().a(aVar);
            }
        }

        public void run() {
            if (g.this.p.get()) {
                return;
            }
            if (g.this.i.l()) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str = this.f15419c;
                    vVar2.b(str, g.this.f14960f + " is timing out, considering JS Tag ad loaded: " + g.this.i);
                }
                a(g.this.i);
                return;
            }
            v vVar3 = this.f15420d;
            if (v.a()) {
                v vVar4 = this.f15420d;
                String str2 = this.f15419c;
                vVar4.e(str2, g.this.f14960f + " is timing out " + g.this.i + APSSharedUtil.TRUNCATE_SEPARATOR);
            }
            a(g.this.i);
            g.this.m.a(this.f15419c, (MaxError) new MaxErrorImpl(-5101, "Adapter timed out"));
        }
    }

    private class e extends com.applovin.impl.sdk.e.a {

        /* renamed from: e  reason: collision with root package name */
        private final c f15069e;

        private e(c cVar) {
            super("TaskTimeoutSignalCollection", g.this.f14956b);
            this.f15069e = cVar;
        }

        public void run() {
            if (!this.f15069e.f15066c.get()) {
                v vVar = this.f15420d;
                if (v.a()) {
                    v vVar2 = this.f15420d;
                    String str = this.f15419c;
                    vVar2.e(str, g.this.f14960f + " is timing out " + this.f15069e.f15064a + APSSharedUtil.TRUNCATE_SEPARATOR);
                }
                g gVar = g.this;
                gVar.b("The adapter (" + g.this.f14960f + ") timed out", this.f15069e);
            }
        }
    }

    g(f fVar, MaxAdapter maxAdapter, boolean z, n nVar) {
        if (fVar == null) {
            throw new IllegalArgumentException("No adapter name specified");
        } else if (maxAdapter == null) {
            throw new IllegalArgumentException("No adapter specified");
        } else if (nVar != null) {
            this.f14958d = fVar.S();
            this.f14961g = maxAdapter;
            this.f14956b = nVar;
            this.f14957c = nVar.D();
            this.f14959e = fVar;
            this.f14960f = maxAdapter.getClass().getSimpleName();
            this.r = z;
        } else {
            throw new IllegalArgumentException("No sdk specified");
        }
    }

    private void a(final Runnable runnable, com.applovin.impl.mediation.a.a aVar) {
        a("show_ad", (Runnable) new Runnable() {
            public void run() {
                try {
                    runnable.run();
                } catch (Throwable th) {
                    String str = "Failed to start displaying ad for " + g.this.f14958d + " due to: " + th;
                    v.i("MediationAdapterWrapper", str);
                    g.this.m.b("show_ad", (MaxError) new MaxErrorImpl(-1, str));
                    g.this.a("show_ad");
                    g.this.f14956b.F().a(g.this.f14959e.R(), "show_ad", g.this.i);
                }
            }
        });
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        if (v.a()) {
            v vVar = this.f14957c;
            vVar.c("MediationAdapterWrapper", "Marking " + this.f14960f + " as disabled due to: " + str);
        }
        this.o.set(false);
    }

    /* access modifiers changed from: private */
    public void a(String str, c cVar) {
        if (cVar.f15066c.compareAndSet(false, true) && cVar.f15065b != null) {
            cVar.f15065b.onSignalCollected(str);
        }
    }

    private void a(final String str, final Runnable runnable) {
        AnonymousClass11 r0 = new Runnable() {
            public void run() {
                try {
                    v unused = g.this.f14957c;
                    if (v.a()) {
                        v a2 = g.this.f14957c;
                        a2.b("MediationAdapterWrapper", g.this.f14960f + ": running " + str + APSSharedUtil.TRUNCATE_SEPARATOR);
                    }
                    runnable.run();
                    v unused2 = g.this.f14957c;
                    if (v.a()) {
                        v a3 = g.this.f14957c;
                        a3.b("MediationAdapterWrapper", g.this.f14960f + ": finished " + str + "");
                    }
                } catch (Throwable th) {
                    v.c("MediationAdapterWrapper", "Failed operation " + str + " for " + g.this.f14958d, th);
                    g gVar = g.this;
                    StringBuilder sb = new StringBuilder();
                    sb.append("fail_");
                    sb.append(str);
                    gVar.a(sb.toString());
                    if (!str.equals("destroy")) {
                        g.this.f14956b.F().a(g.this.f14959e.R(), str, g.this.i);
                    }
                }
            }
        };
        if (this.f14959e.Z()) {
            this.f14955a.post(r0);
        } else {
            r0.run();
        }
    }

    /* access modifiers changed from: private */
    public void b(String str, c cVar) {
        if (cVar.f15066c.compareAndSet(false, true) && cVar.f15065b != null) {
            cVar.f15065b.onSignalCollectionFailed(str);
        }
    }

    private boolean b(com.applovin.impl.mediation.a.a aVar, Activity activity) {
        MaxErrorImpl maxErrorImpl;
        if (aVar != null) {
            if (aVar.g() == null) {
                v.i("MediationAdapterWrapper", "Adapter has been garbage collected");
                maxErrorImpl = new MaxErrorImpl(-1, "Adapter has been garbage collected");
            } else if (aVar.g() != this) {
                throw new IllegalArgumentException("Mediated ad belongs to a different adapter");
            } else if (activity == null && MaxAdFormat.APP_OPEN != aVar.getFormat()) {
                throw new IllegalArgumentException("No activity specified");
            } else if (!this.o.get()) {
                String str = "Mediation adapter '" + this.f14960f + "' is disabled. Showing ads with this adapter is disabled.";
                v.i("MediationAdapterWrapper", str);
                maxErrorImpl = new MaxErrorImpl(-1, str);
            } else if (g()) {
                return true;
            } else {
                throw new IllegalStateException("Mediation adapter '" + this.f14960f + "' does not have an ad loaded. Please load an ad first");
            }
            this.m.b("ad_show", (MaxError) maxErrorImpl);
            return false;
        }
        throw new IllegalArgumentException("No mediated ad specified");
    }

    public View a() {
        return this.j;
    }

    public void a(final com.applovin.impl.mediation.a.a aVar, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.m() != null) {
                runnable = new Runnable() {
                    public void run() {
                        g.this.f14956b.I().a((com.applovin.impl.mediation.a.c) aVar, activity, g.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f14961g).showInterstitialAd(g.this.n, activity, g.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAppOpenAdapter) g.this.f14961g).showAppOpenAd(g.this.n, activity, g.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f14961g).showRewardedAd(g.this.n, activity, g.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f14961g).showRewardedInterstitialAd(g.this.n, activity, g.this.m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, aVar);
        }
    }

    public void a(com.applovin.impl.mediation.a.a aVar, final ViewGroup viewGroup, final Lifecycle lifecycle, final Activity activity) {
        Runnable runnable;
        if (b(aVar, activity)) {
            if (aVar.getFormat() == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdViewAdapter) g.this.f14961g).showInterstitialAd(g.this.n, viewGroup, lifecycle, activity, g.this.m);
                    }
                };
            } else if (aVar.getFormat() == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdViewAdapter) g.this.f14961g).showRewardedAd(g.this.n, viewGroup, lifecycle, activity, g.this.m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to show " + aVar + ": " + aVar.getFormat() + " is not a supported ad format");
            }
            a(runnable, aVar);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(final MaxAdapterInitializationParameters maxAdapterInitializationParameters, final Activity activity, final Runnable runnable) {
        a(MobileAdsBridgeBase.initializeMethodName, (Runnable) new Runnable() {
            public void run() {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                v unused = g.this.f14957c;
                if (v.a()) {
                    v a2 = g.this.f14957c;
                    a2.b("MediationAdapterWrapper", "Initializing " + g.this.f14960f + " on thread: " + Thread.currentThread() + " with 'run_on_ui_thread' value: " + g.this.f14959e.Z());
                }
                g.this.f14961g.initialize(maxAdapterInitializationParameters, activity, new b(g.this.f14956b, g.this.f14959e, elapsedRealtime, runnable));
            }
        });
    }

    /* access modifiers changed from: package-private */
    public void a(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, h hVar, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        if (maxSignalCollectionListener == null) {
            throw new IllegalArgumentException("No callback specified");
        } else if (!this.o.get()) {
            v.i("MediationAdapterWrapper", "Mediation adapter '" + this.f14960f + "' is disabled. Signal collection ads with this adapter is disabled.");
            maxSignalCollectionListener.onSignalCollectionFailed("The adapter (" + this.f14960f + ") is disabled");
        } else {
            final c cVar = new c(hVar, maxSignalCollectionListener);
            MaxAdapter maxAdapter = this.f14961g;
            if (maxAdapter instanceof MaxSignalProvider) {
                final MaxSignalProvider maxSignalProvider = (MaxSignalProvider) maxAdapter;
                final MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters2 = maxAdapterSignalCollectionParameters;
                final Activity activity2 = activity;
                final h hVar2 = hVar;
                a("collect_signal", (Runnable) new Runnable() {
                    public void run() {
                        try {
                            maxSignalProvider.collectSignal(maxAdapterSignalCollectionParameters2, activity2, new MaxSignalCollectionListener() {
                                public void onSignalCollected(String str) {
                                    g.this.a(str, cVar);
                                }

                                public void onSignalCollectionFailed(String str) {
                                    g.this.b(str, cVar);
                                }
                            });
                        } catch (Throwable th) {
                            String str = "Failed signal collection for " + g.this.f14958d + " due to: " + th;
                            v.i("MediationAdapterWrapper", str);
                            g.this.b(str, cVar);
                            g.this.a("collect_signal");
                            g.this.f14956b.F().a(g.this.f14959e.R(), "collect_signal", g.this.i);
                        }
                        if (cVar.f15066c.get()) {
                            return;
                        }
                        if (hVar2.ad() == 0) {
                            v unused = g.this.f14957c;
                            if (v.a()) {
                                g.this.f14957c.b("MediationAdapterWrapper", "Failing signal collection " + hVar2 + " since it has 0 timeout");
                            }
                            g.this.b("The adapter (" + g.this.f14960f + ") has 0 timeout", cVar);
                            return;
                        }
                        int i = (hVar2.ad() > 0 ? 1 : (hVar2.ad() == 0 ? 0 : -1));
                        v unused2 = g.this.f14957c;
                        boolean a2 = v.a();
                        if (i > 0) {
                            if (a2) {
                                g.this.f14957c.b("MediationAdapterWrapper", "Setting timeout " + hVar2.ad() + "ms. for " + hVar2);
                            }
                            g.this.f14956b.V().a((com.applovin.impl.sdk.e.a) new e(cVar), o.a.MEDIATION_TIMEOUT, hVar2.ad());
                        } else if (a2) {
                            g.this.f14957c.b("MediationAdapterWrapper", "Negative timeout set for " + hVar2 + ", not scheduling a timeout");
                        }
                    }
                });
                return;
            }
            b("The adapter (" + this.f14960f + ") does not support signal collection", cVar);
        }
    }

    public void a(MaxNativeAdView maxNativeAdView) {
        this.l = maxNativeAdView;
    }

    /* access modifiers changed from: package-private */
    public void a(String str, com.applovin.impl.mediation.a.a aVar) {
        this.f14962h = str;
        this.i = aVar;
    }

    public void a(String str, final MaxAdapterResponseParameters maxAdapterResponseParameters, final com.applovin.impl.mediation.a.a aVar, final Activity activity, MediationServiceImpl.a aVar2) {
        final Runnable runnable;
        if (aVar == null) {
            throw new IllegalArgumentException("No mediated ad specified");
        } else if (!this.o.get()) {
            String str2 = "Mediation adapter '" + this.f14960f + "' was disabled due to earlier failures. Loading ads with this adapter is disabled.";
            v.i("MediationAdapterWrapper", str2);
            aVar2.onAdLoadFailed(str, new MaxErrorImpl(-1, str2));
        } else {
            this.n = maxAdapterResponseParameters;
            this.m.a(aVar2);
            final MaxAdFormat m2 = aVar.m() != null ? aVar.m() : aVar.getFormat();
            if (m2 == MaxAdFormat.INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxInterstitialAdapter) g.this.f14961g).loadInterstitialAd(maxAdapterResponseParameters, activity, g.this.m);
                    }
                };
            } else if (m2 == MaxAdFormat.APP_OPEN) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAppOpenAdapter) g.this.f14961g).loadAppOpenAd(maxAdapterResponseParameters, activity, g.this.m);
                    }
                };
            } else if (m2 == MaxAdFormat.REWARDED) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedAdapter) g.this.f14961g).loadRewardedAd(maxAdapterResponseParameters, activity, g.this.m);
                    }
                };
            } else if (m2 == MaxAdFormat.REWARDED_INTERSTITIAL) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxRewardedInterstitialAdapter) g.this.f14961g).loadRewardedInterstitialAd(maxAdapterResponseParameters, activity, g.this.m);
                    }
                };
            } else if (m2 == MaxAdFormat.NATIVE) {
                runnable = new Runnable() {
                    public void run() {
                        ((MediationAdapterBase) g.this.f14961g).loadNativeAd(maxAdapterResponseParameters, activity, g.this.m);
                    }
                };
            } else if (m2.isAdViewAd()) {
                runnable = new Runnable() {
                    public void run() {
                        ((MaxAdViewAdapter) g.this.f14961g).loadAdViewAd(maxAdapterResponseParameters, m2, activity, g.this.m);
                    }
                };
            } else {
                throw new IllegalStateException("Failed to load " + aVar + ": " + aVar.getFormat() + " (" + aVar.m() + ") is not a supported ad format");
            }
            a("load_ad", (Runnable) new Runnable() {
                public void run() {
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        String str = "Failed to start loading ad for " + g.this.f14958d + " due to: " + th;
                        v.i("MediationAdapterWrapper", str);
                        g.this.m.a("load_ad", (MaxError) new MaxErrorImpl(-1, str));
                        g.this.a("load_ad");
                        g.this.f14956b.F().a(g.this.f14959e.R(), "load_ad", g.this.i);
                    }
                    if (!g.this.p.get()) {
                        long ad = g.this.f14959e.ad();
                        if (ad > 0) {
                            v unused = g.this.f14957c;
                            if (v.a()) {
                                g.this.f14957c.b("MediationAdapterWrapper", "Setting timeout " + ad + "ms. for " + aVar);
                            }
                            g.this.f14956b.V().a((com.applovin.impl.sdk.e.a) new d(), o.a.MEDIATION_TIMEOUT, ad);
                            return;
                        }
                        v unused2 = g.this.f14957c;
                        if (v.a()) {
                            g.this.f14957c.b("MediationAdapterWrapper", "Negative timeout set for " + aVar + ", not scheduling a timeout");
                        }
                    }
                }
            });
        }
    }

    public MaxNativeAd b() {
        return this.k;
    }

    public MaxNativeAdView c() {
        return this.l;
    }

    public String d() {
        return this.f14958d;
    }

    public MediationServiceImpl.a e() {
        return this.m.f15022b;
    }

    public boolean f() {
        return this.o.get();
    }

    public boolean g() {
        return this.p.get() && this.q.get();
    }

    public String h() {
        MaxAdapter maxAdapter = this.f14961g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getSdkVersion();
        } catch (Throwable th) {
            v.c("MediationAdapterWrapper", "Failed to get adapter's SDK version for " + this.f14958d, th);
            a("sdk_version");
            this.f14956b.F().a(this.f14959e.R(), "sdk_version", this.i);
            return null;
        }
    }

    public String i() {
        MaxAdapter maxAdapter = this.f14961g;
        if (maxAdapter == null) {
            return null;
        }
        try {
            return maxAdapter.getAdapterVersion();
        } catch (Throwable th) {
            v.c("MediationAdapterWrapper", "Failed to get adapter version for " + this.f14958d, th);
            a("adapter_version");
            this.f14956b.F().a(this.f14959e.R(), "adapter_version", this.i);
            return null;
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        if (!this.r) {
            a("destroy", (Runnable) new Runnable() {
                public void run() {
                    g.this.a("destroy");
                    g.this.f14961g.onDestroy();
                    MaxAdapter unused = g.this.f14961g = null;
                    View unused2 = g.this.j = null;
                    MaxNativeAd unused3 = g.this.k = null;
                    MaxNativeAdView unused4 = g.this.l = null;
                }
            });
        }
    }

    public String toString() {
        return "MediationAdapterWrapper{adapterTag='" + this.f14960f + "'" + '}';
    }
}
