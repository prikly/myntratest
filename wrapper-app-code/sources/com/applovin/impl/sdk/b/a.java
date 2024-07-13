package com.applovin.impl.sdk.b;

import android.content.Context;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.sdk.AppLovinAdServiceImpl;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.ad.e;
import com.applovin.impl.sdk.ad.f;
import com.applovin.impl.sdk.ad.g;
import com.applovin.impl.sdk.e.aa;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.k;
import com.applovin.impl.sdk.v;
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdClickListener;
import com.applovin.sdk.AppLovinAdDisplayListener;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdRewardListener;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinAdVideoPlaybackListener;
import com.applovin.sdk.AppLovinErrorCodes;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkUtils;
import java.lang.ref.SoftReference;
import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    protected final n f15296a;

    /* renamed from: b  reason: collision with root package name */
    protected final AppLovinAdServiceImpl f15297b;
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public AppLovinAd f15298c;

    /* renamed from: d  reason: collision with root package name */
    private String f15299d;

    /* renamed from: e  reason: collision with root package name */
    private SoftReference<AppLovinAdLoadListener> f15300e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f15301f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private volatile String f15302g;
    /* access modifiers changed from: private */

    /* renamed from: h  reason: collision with root package name */
    public volatile boolean f15303h = false;

    /* renamed from: com.applovin.impl.sdk.b.a$a  reason: collision with other inner class name */
    private class C0151a implements AppLovinAdLoadListener {
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public final AppLovinAdLoadListener f15306b;

        C0151a(AppLovinAdLoadListener appLovinAdLoadListener) {
            this.f15306b = appLovinAdLoadListener;
        }

        public void adReceived(final AppLovinAd appLovinAd) {
            AppLovinAd unused = a.this.f15298c = appLovinAd;
            if (this.f15306b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C0151a.this.f15306b.adReceived(appLovinAd);
                        } catch (Throwable th) {
                            v.c("AppLovinIncentivizedInterstitial", "Unable to notify ad listener about a newly loaded ad", th);
                        }
                    }
                });
            }
        }

        public void failedToReceiveAd(final int i) {
            if (this.f15306b != null) {
                AppLovinSdkUtils.runOnUiThread(new Runnable() {
                    public void run() {
                        try {
                            C0151a.this.f15306b.failedToReceiveAd(i);
                        } catch (Throwable th) {
                            v.c("AppLovinIncentivizedInterstitial", "Unable to notify listener about ad load failure", th);
                        }
                    }
                });
            }
        }
    }

    private class b implements g, AppLovinAdClickListener, AppLovinAdRewardListener, AppLovinAdVideoPlaybackListener {

        /* renamed from: b  reason: collision with root package name */
        private final AppLovinAdDisplayListener f15312b;

        /* renamed from: c  reason: collision with root package name */
        private final AppLovinAdClickListener f15313c;

        /* renamed from: d  reason: collision with root package name */
        private final AppLovinAdVideoPlaybackListener f15314d;

        /* renamed from: e  reason: collision with root package name */
        private final AppLovinAdRewardListener f15315e;

        private b(AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
            this.f15312b = appLovinAdDisplayListener;
            this.f15313c = appLovinAdClickListener;
            this.f15314d = appLovinAdVideoPlaybackListener;
            this.f15315e = appLovinAdRewardListener;
        }

        private void a(e eVar) {
            String str;
            int i;
            String a2 = a.this.d();
            if (!StringUtils.isValidString(a2) || !a.this.f15303h) {
                a.this.f15296a.D();
                if (v.a()) {
                    v D = a.this.f15296a.D();
                    D.e("IncentivizedAdController", "Invalid reward state - result: " + a2 + " and wasFullyEngaged: " + a.this.f15303h);
                }
                a.this.f15296a.D();
                if (v.a()) {
                    a.this.f15296a.D().b("IncentivizedAdController", "Cancelling any incoming reward requests for this ad");
                }
                eVar.aF();
                if (a.this.f15303h) {
                    a.this.f15296a.D();
                    if (v.a()) {
                        a.this.f15296a.D().e("IncentivizedAdController", "User close the ad after fully watching but reward validation task did not return on time");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_SERVER_TIMEOUT;
                    str = "network_timeout";
                } else {
                    a.this.f15296a.D();
                    if (v.a()) {
                        a.this.f15296a.D().e("IncentivizedAdController", "User close the ad prematurely");
                    }
                    i = AppLovinErrorCodes.INCENTIVIZED_USER_CLOSED_VIDEO;
                    str = "user_closed_video";
                }
                eVar.a(c.a(str));
                a.this.f15296a.D();
                if (v.a()) {
                    a.this.f15296a.D().b("IncentivizedAdController", "Notifying listener of reward validation failure");
                }
                k.a(this.f15315e, (AppLovinAd) eVar, i);
            }
            a.this.a((AppLovinAd) eVar);
            a.this.f15296a.D();
            if (v.a()) {
                a.this.f15296a.D().b("IncentivizedAdController", "Notifying listener of rewarded ad dismissal");
            }
            k.b(this.f15312b, (AppLovinAd) eVar);
            if (!eVar.ag().getAndSet(true)) {
                a.this.f15296a.D();
                if (v.a()) {
                    a.this.f15296a.D().b("IncentivizedAdController", "Scheduling report rewarded ad...");
                }
                a.this.f15296a.V().a((com.applovin.impl.sdk.e.a) new com.applovin.impl.sdk.e.v(eVar, a.this.f15296a), o.a.REWARD);
            }
        }

        public void adClicked(AppLovinAd appLovinAd) {
            k.a(this.f15313c, appLovinAd);
        }

        public void adDisplayed(AppLovinAd appLovinAd) {
            k.a(this.f15312b, appLovinAd);
        }

        public void adHidden(AppLovinAd appLovinAd) {
            if (appLovinAd instanceof f) {
                appLovinAd = ((f) appLovinAd).a();
            }
            if (appLovinAd instanceof e) {
                a((e) appLovinAd);
                return;
            }
            a.this.f15296a.D();
            if (v.a()) {
                v D = a.this.f15296a.D();
                D.e("IncentivizedAdController", "Something is terribly wrong. Received `adHidden` callback for invalid ad of type: " + appLovinAd);
            }
        }

        public void onAdDisplayFailed(String str) {
            k.a(this.f15312b, str);
        }

        public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("quota_exceeded");
            k.b(this.f15315e, appLovinAd, map);
        }

        public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("rejected");
            k.c(this.f15315e, appLovinAd, map);
        }

        public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
            a.this.a("accepted");
            k.a(this.f15315e, appLovinAd, map);
        }

        public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
            a.this.a("network_timeout");
            k.a(this.f15315e, appLovinAd, i);
        }

        public void videoPlaybackBegan(AppLovinAd appLovinAd) {
            k.a(this.f15314d, appLovinAd);
        }

        public void videoPlaybackEnded(AppLovinAd appLovinAd, double d2, boolean z) {
            k.a(this.f15314d, appLovinAd, d2, z);
            boolean unused = a.this.f15303h = z;
        }
    }

    public a(String str, AppLovinSdk appLovinSdk) {
        this.f15296a = appLovinSdk.coreSdk;
        this.f15297b = (AppLovinAdServiceImpl) appLovinSdk.getAdService();
        this.f15299d = str;
    }

    private void a(AppLovinAdImpl appLovinAdImpl, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f15296a);
            if (maybeRetrieveNonDummyAd == null) {
                a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
                return;
            }
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f15296a.ab(), context);
            b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            create.showAndRender(maybeRetrieveNonDummyAd);
            if (maybeRetrieveNonDummyAd instanceof e) {
                a((e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        this.f15296a.D();
        if (v.a()) {
            v D = this.f15296a.D();
            D.e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        a(appLovinAdImpl, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener);
    }

    private void a(AppLovinAdImpl appLovinAdImpl, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl2 = appLovinAdImpl;
        AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener2 = appLovinAdVideoPlaybackListener;
        AppLovinAdDisplayListener appLovinAdDisplayListener2 = appLovinAdDisplayListener;
        if (appLovinAdImpl.getType() == AppLovinAdType.INCENTIVIZED || appLovinAdImpl.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            AppLovinAd maybeRetrieveNonDummyAd = Utils.maybeRetrieveNonDummyAd(appLovinAdImpl, this.f15296a);
            if (maybeRetrieveNonDummyAd == null) {
                a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
                return;
            }
            Context context2 = context;
            AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(this.f15296a.ab(), context);
            b bVar = new b(appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            create.setAdDisplayListener(bVar);
            create.setAdVideoPlaybackListener(bVar);
            create.setAdClickListener(bVar);
            ViewGroup viewGroup2 = viewGroup;
            Lifecycle lifecycle2 = lifecycle;
            create.showAndRender(maybeRetrieveNonDummyAd, viewGroup, lifecycle);
            if (maybeRetrieveNonDummyAd instanceof e) {
                a((e) maybeRetrieveNonDummyAd, (AppLovinAdRewardListener) bVar);
                return;
            }
            return;
        }
        this.f15296a.D();
        if (v.a()) {
            v D = this.f15296a.D();
            D.e("IncentivizedAdController", "Failed to render an ad of type " + appLovinAdImpl.getType() + " in an Incentivized Ad interstitial.");
        }
        a(appLovinAdImpl, appLovinAdVideoPlaybackListener2, appLovinAdDisplayListener2);
    }

    private void a(e eVar, AppLovinAdRewardListener appLovinAdRewardListener) {
        this.f15296a.V().a((com.applovin.impl.sdk.e.a) new aa(eVar, appLovinAdRewardListener, this.f15296a), o.a.REWARD);
    }

    /* access modifiers changed from: private */
    public void a(AppLovinAd appLovinAd) {
        AppLovinAd appLovinAd2 = this.f15298c;
        if (appLovinAd2 != null) {
            if (appLovinAd2 instanceof f) {
                if (appLovinAd != ((f) appLovinAd2).a()) {
                    return;
                }
            } else if (appLovinAd != appLovinAd2) {
                return;
            }
            this.f15298c = null;
        }
    }

    private void a(AppLovinAd appLovinAd, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAd == null) {
            appLovinAd = this.f15298c;
        }
        AppLovinAdImpl appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        c();
    }

    private void a(AppLovinAd appLovinAd, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener) {
        this.f15296a.W().a(com.applovin.impl.sdk.d.f.l);
        k.a(appLovinAdVideoPlaybackListener, appLovinAd, 0.0d, false);
        k.b(appLovinAdDisplayListener, appLovinAd);
    }

    /* access modifiers changed from: private */
    public void a(String str) {
        synchronized (this.f15301f) {
            this.f15302g = str;
        }
    }

    private void b(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        AppLovinAdImpl appLovinAdImpl;
        if (appLovinAd != null) {
            appLovinAdImpl = (AppLovinAdImpl) appLovinAd;
        } else {
            appLovinAdImpl = (AppLovinAdImpl) this.f15298c;
        }
        if (appLovinAdImpl != null) {
            a(appLovinAdImpl, viewGroup, lifecycle, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
            return;
        }
        v.i("IncentivizedAdController", "Skipping incentivized video playback: user attempted to play an incentivized video before one was preloaded.");
        c();
    }

    private void b(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f15297b.loadNextIncentivizedAd(this.f15299d, appLovinAdLoadListener);
    }

    private void c() {
        AppLovinAdLoadListener appLovinAdLoadListener;
        SoftReference<AppLovinAdLoadListener> softReference = this.f15300e;
        if (softReference != null && (appLovinAdLoadListener = softReference.get()) != null) {
            appLovinAdLoadListener.failedToReceiveAd(AppLovinErrorCodes.INCENTIVIZED_NO_AD_PRELOADED);
        }
    }

    /* access modifiers changed from: private */
    public String d() {
        String str;
        synchronized (this.f15301f) {
            str = this.f15302g;
        }
        return str;
    }

    private AppLovinAdRewardListener e() {
        return new AppLovinAdRewardListener() {
            public void userOverQuota(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f15296a.D();
                if (v.a()) {
                    v D = a.this.f15296a.D();
                    D.e("IncentivizedAdController", "User over quota: " + map);
                }
            }

            public void userRewardRejected(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f15296a.D();
                if (v.a()) {
                    v D = a.this.f15296a.D();
                    D.e("IncentivizedAdController", "Reward rejected: " + map);
                }
            }

            public void userRewardVerified(AppLovinAd appLovinAd, Map<String, String> map) {
                a.this.f15296a.D();
                if (v.a()) {
                    v D = a.this.f15296a.D();
                    D.b("IncentivizedAdController", "Reward validated: " + map);
                }
            }

            public void validationRequestFailed(AppLovinAd appLovinAd, int i) {
                a.this.f15296a.D();
                if (v.a()) {
                    v D = a.this.f15296a.D();
                    D.e("IncentivizedAdController", "Reward validation failed: " + i);
                }
            }
        };
    }

    public void a(AppLovinAd appLovinAd, Context context, String str, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        if (appLovinAdRewardListener == null) {
            appLovinAdRewardListener = e();
        }
        a(appLovinAd, context, appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAd appLovinAd, ViewGroup viewGroup, Lifecycle lifecycle, Context context, AppLovinAdRewardListener appLovinAdRewardListener, AppLovinAdVideoPlaybackListener appLovinAdVideoPlaybackListener, AppLovinAdDisplayListener appLovinAdDisplayListener, AppLovinAdClickListener appLovinAdClickListener) {
        b(appLovinAd, viewGroup, lifecycle, context, appLovinAdRewardListener == null ? e() : appLovinAdRewardListener, appLovinAdVideoPlaybackListener, appLovinAdDisplayListener, appLovinAdClickListener);
    }

    public void a(AppLovinAdLoadListener appLovinAdLoadListener) {
        this.f15296a.D();
        if (v.a()) {
            this.f15296a.D().b("IncentivizedAdController", "User requested preload of incentivized ad...");
        }
        this.f15300e = new SoftReference<>(appLovinAdLoadListener);
        if (a()) {
            v.i("IncentivizedAdController", "Attempted to call preloadAndNotify: while an ad was already loaded or currently being played. Do not call preloadAndNotify: again until the last ad has been closed (adHidden).");
            if (appLovinAdLoadListener != null) {
                appLovinAdLoadListener.adReceived(this.f15298c);
                return;
            }
            return;
        }
        b((AppLovinAdLoadListener) new C0151a(appLovinAdLoadListener));
    }

    public boolean a() {
        return this.f15298c != null;
    }

    public String b() {
        return this.f15299d;
    }
}
