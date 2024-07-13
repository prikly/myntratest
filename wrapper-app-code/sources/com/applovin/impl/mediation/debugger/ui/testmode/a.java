package com.applovin.impl.mediation.debugger.ui.testmode;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.AdRegistration;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.b.c.b;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.CollectionUtils;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.v;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.MaxReward;
import com.applovin.mediation.MaxRewardedAdListener;
import com.applovin.mediation.ads.MaxAdView;
import com.applovin.mediation.ads.MaxAppOpenAd;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.mediation.ads.MaxRewardedAd;
import com.applovin.mediation.ads.MaxRewardedInterstitialAd;
import com.applovin.mediation.nativeAds.MaxNativeAdListener;
import com.applovin.mediation.nativeAds.MaxNativeAdLoader;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.sdk.AppLovinSdkUtils;
import com.applovin.sdk.R;
import java.util.Map;

public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.C0145a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {

    /* renamed from: a  reason: collision with root package name */
    private b f14910a;

    /* renamed from: b  reason: collision with root package name */
    private n f14911b;

    /* renamed from: c  reason: collision with root package name */
    private MaxAdView f14912c;

    /* renamed from: d  reason: collision with root package name */
    private MaxAdView f14913d;

    /* renamed from: e  reason: collision with root package name */
    private MaxInterstitialAd f14914e;

    /* renamed from: f  reason: collision with root package name */
    private MaxAppOpenAd f14915f;

    /* renamed from: g  reason: collision with root package name */
    private MaxRewardedInterstitialAd f14916g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedAd f14917h;
    /* access modifiers changed from: private */
    public MaxAd i;
    /* access modifiers changed from: private */
    public MaxNativeAdLoader j;
    private String k;
    private AdControlButton l;
    private AdControlButton m;
    private AdControlButton n;
    private AdControlButton o;
    private AdControlButton p;
    private AdControlButton q;
    private AdControlButton r;
    /* access modifiers changed from: private */
    public Button s;
    /* access modifiers changed from: private */
    public Button t;
    /* access modifiers changed from: private */
    public FrameLayout u;
    /* access modifiers changed from: private */
    public FrameLayout v;
    private Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> w;

    private AdControlButton a(String str) {
        if (str.equals("test_mode_banner") || str.equals("test_mode_leader")) {
            return this.l;
        }
        if (str.equals("test_mode_mrec")) {
            return this.m;
        }
        if (str.equals("test_mode_interstitial")) {
            return this.n;
        }
        if (str.equals("test_mode_app_open")) {
            return this.o;
        }
        if (str.equals("test_mode_rewarded_interstitial")) {
            return this.p;
        }
        if (str.equals(this.k)) {
            return this.q;
        }
        if (str.equals("test_mode_native")) {
            return this.r;
        }
        throw new IllegalArgumentException("Invalid test mode ad unit identifier provided " + str);
    }

    private void a() {
        String str;
        MaxAdFormat maxAdFormat;
        boolean isTablet = AppLovinSdkUtils.isTablet(this);
        FrameLayout frameLayout = (FrameLayout) findViewById(R.id.banner_ad_view_container);
        if (isTablet) {
            maxAdFormat = MaxAdFormat.LEADER;
            ((TextView) findViewById(R.id.banner_label)).setText("Leader");
            str = "test_mode_leader";
        } else {
            maxAdFormat = MaxAdFormat.BANNER;
            str = "test_mode_banner";
        }
        if (this.f14910a.p().contains(maxAdFormat)) {
            MaxAdView maxAdView = new MaxAdView(str, maxAdFormat, this.f14911b.ab(), this);
            this.f14912c = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
            this.f14912c.setListener(this);
            frameLayout.addView(this.f14912c, new FrameLayout.LayoutParams(AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getWidth()), AppLovinSdkUtils.dpToPx(this, maxAdFormat.getSize().getHeight())));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.banner_control_button);
            this.l = adControlButton;
            adControlButton.setOnClickListener(this);
            this.l.setFormat(maxAdFormat);
            return;
        }
        findViewById(R.id.banner_control_view).setVisibility(8);
        frameLayout.setVisibility(8);
    }

    private void a(MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        this.f14911b.N().a(getTestModeNetwork(maxAdFormat));
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f14912c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f14913d;
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14914e.loadAd();
            return;
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14915f.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f14916g.loadAd();
            return;
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14917h.loadAd();
            return;
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.j.loadAd();
            return;
        } else {
            return;
        }
        maxAdView.loadAd();
    }

    private void b() {
        this.u = (FrameLayout) findViewById(R.id.mrec_ad_view_container);
        if (this.f14910a.p().contains(MaxAdFormat.MREC)) {
            MaxAdView maxAdView = new MaxAdView("test_mode_mrec", MaxAdFormat.MREC, this.f14911b.ab(), this);
            this.f14913d = maxAdView;
            maxAdView.setListener(this);
            this.u.addView(this.f14913d, new FrameLayout.LayoutParams(-1, -1));
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.mrec_control_button);
            this.m = adControlButton;
            adControlButton.setOnClickListener(this);
            this.m.setFormat(MaxAdFormat.MREC);
            return;
        }
        findViewById(R.id.mrec_control_view).setVisibility(8);
        this.u.setVisibility(8);
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14914e.showAd();
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14915f.showAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f14916g.showAd();
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.f14917h.showAd();
        }
    }

    private void c() {
        if (this.f14910a.p().contains(MaxAdFormat.INTERSTITIAL)) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd("test_mode_interstitial", this.f14911b.ab(), this);
            this.f14914e = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.interstitial_control_button);
            this.n = adControlButton;
            adControlButton.setOnClickListener(this);
            this.n.setFormat(MaxAdFormat.INTERSTITIAL);
            return;
        }
        findViewById(R.id.interstitial_control_view).setVisibility(8);
    }

    private void d() {
        if (this.f14910a.p().contains(MaxAdFormat.REWARDED)) {
            String str = "test_mode_rewarded_" + this.f14910a.h();
            this.k = str;
            MaxRewardedAd instance = MaxRewardedAd.getInstance(str, this.f14911b.ab(), this);
            this.f14917h = instance;
            instance.setListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.rewarded_control_button);
            this.q = adControlButton;
            adControlButton.setOnClickListener(this);
            this.q.setFormat(MaxAdFormat.REWARDED);
            return;
        }
        findViewById(R.id.rewarded_control_view).setVisibility(8);
    }

    private void e() {
        this.v = (FrameLayout) findViewById(R.id.native_ad_view_container);
        if (this.f14910a.q()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader("test_mode_native", this.f14911b.ab(), this);
            this.j = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (a.this.i != null) {
                        a.this.j.destroy(a.this.i);
                    }
                    MaxAd unused = a.this.i = maxAd;
                    a.this.v.removeAllViews();
                    a.this.v.addView(maxNativeAdView);
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.j.setRevenueListener(this);
            AdControlButton adControlButton = (AdControlButton) findViewById(R.id.native_control_button);
            this.r = adControlButton;
            adControlButton.setOnClickListener(this);
            this.r.setFormat(MaxAdFormat.NATIVE);
            return;
        }
        findViewById(R.id.native_control_view).setVisibility(8);
        this.v.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        return this.f14911b;
    }

    public String getTestModeNetwork(MaxAdFormat maxAdFormat) {
        return (this.f14910a.v() == null || !this.f14910a.v().containsKey(maxAdFormat)) ? this.f14910a.h() : this.f14910a.v().get(maxAdFormat);
    }

    public void initialize(b bVar) {
        this.f14910a = bVar;
        this.f14911b = bVar.y();
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        a(maxAd.getAdUnitId()).setControlState(AdControlButton.b.LOAD);
        Utils.showAlert("Failed to display " + maxAd.getFormat().getDisplayName(), "MAX Error\nCode: " + maxError.getCode() + "\nMessage: " + maxError.getMessage() + "\n\n" + maxAd.getNetworkName() + " Display Error\nCode: " + maxError.getMediatedNetworkErrorCode() + "\nMessage: " + maxError.getMediatedNetworkErrorMessage(), (Context) this);
    }

    public void onAdDisplayed(MaxAd maxAd) {
        Utils.showToast("onAdDisplayed", maxAd, this);
    }

    public void onAdExpanded(MaxAd maxAd) {
        Utils.showToast("onAdExpanded", maxAd, this);
    }

    public void onAdHidden(MaxAd maxAd) {
        Utils.showToast("onAdHidden", maxAd, this);
    }

    public void onAdLoadFailed(AdError adError, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f14912c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f14913d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f14914e.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f14915f.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f14916g.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f14917h.setLocalExtraParameter("amazon_ad_error", adError);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.j.setLocalExtraParameter("amazon_ad_error", adError);
            }
            a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_error", adError);
        a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        AdControlButton a2 = a(str);
        a2.setControlState(AdControlButton.b.LOAD);
        Utils.showAlert(maxError, a2.getFormat().getLabel(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        a(maxAd.getAdUnitId()).setControlState((maxAd.getFormat().isAdViewAd() || maxAd.getFormat().equals(MaxAdFormat.NATIVE)) ? AdControlButton.b.LOAD : AdControlButton.b.SHOW);
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        MaxAdView maxAdView;
        if (MaxAdFormat.BANNER == maxAdFormat || MaxAdFormat.LEADER == maxAdFormat) {
            maxAdView = this.f14912c;
        } else if (MaxAdFormat.MREC == maxAdFormat) {
            maxAdView = this.f14913d;
        } else {
            if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
                this.f14914e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
                this.f14915f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
                this.f14916g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.REWARDED == maxAdFormat) {
                this.f14917h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            } else if (MaxAdFormat.NATIVE == maxAdFormat) {
                this.j.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
            }
            a(maxAdFormat);
        }
        maxAdView.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        MaxAdFormat format = adControlButton.getFormat();
        if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = this.w;
            if (map == null || map.get(format) == null) {
                a(format);
            } else {
                this.w.get(format).a();
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOAD);
            b(format);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (this.f14910a == null) {
            v.i("MaxDebuggerMultiAdActivity", "Failed to initialize activity with a network model.");
            return;
        }
        setContentView(R.layout.mediation_debugger_multi_ad_activity);
        setTitle(this.f14910a.i() + " Test Ads");
        a();
        b();
        c();
        d();
        e();
        findViewById(R.id.rewarded_interstitial_control_view).setVisibility(8);
        findViewById(R.id.app_open_ad_control_view).setVisibility(8);
        this.s = (Button) findViewById(R.id.show_mrec_button);
        this.t = (Button) findViewById(R.id.show_native_button);
        if (!this.f14910a.q() || !this.f14910a.p().contains(MaxAdFormat.MREC)) {
            this.s.setVisibility(8);
            this.t.setVisibility(8);
        } else {
            this.v.setVisibility(8);
            this.s.setBackgroundColor(-1);
            this.t.setBackgroundColor(-3355444);
            this.s.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    a.this.u.setVisibility(0);
                    a.this.v.setVisibility(8);
                    a.this.s.setBackgroundColor(-1);
                    a.this.t.setBackgroundColor(-3355444);
                }
            });
            this.t.setOnClickListener(new View.OnClickListener() {
                public void onClick(View view) {
                    a.this.v.setVisibility(0);
                    a.this.u.setVisibility(8);
                    a.this.t.setBackgroundColor(-1);
                    a.this.s.setBackgroundColor(-3355444);
                }
            });
        }
        if (StringUtils.isValidString(this.f14910a.B()) && this.f14910a.C() != null && this.f14910a.C().size() > 0) {
            AdRegistration.getInstance(this.f14910a.B(), this);
            AdRegistration.enableTesting(true);
            AdRegistration.enableLogging(true);
            Map<MaxAdFormat, com.applovin.impl.mediation.debugger.a.a> map = CollectionUtils.map(this.f14910a.C().size());
            for (MaxAdFormat next : this.f14910a.C().keySet()) {
                map.put(next, new com.applovin.impl.mediation.debugger.a.a(this.f14910a.C().get(next), next, (a.C0145a) this));
            }
            this.w = map;
        }
        try {
            setRequestedOrientation(7);
        } catch (Throwable th) {
            v.c("AppLovinSdk", "Failed to set portrait orientation", th);
        }
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        MaxAd maxAd;
        super.onDestroy();
        this.f14911b.N().a((String) null);
        MaxAdView maxAdView = this.f14912c;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxAdView maxAdView2 = this.f14913d;
        if (maxAdView2 != null) {
            maxAdView2.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f14914e;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.f14917h;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
        }
        MaxNativeAdLoader maxNativeAdLoader = this.j;
        if (maxNativeAdLoader != null && (maxAd = this.i) != null) {
            maxNativeAdLoader.destroy(maxAd);
        }
    }

    public void onRewardedVideoCompleted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoCompleted", maxAd, this);
    }

    public void onRewardedVideoStarted(MaxAd maxAd) {
        Utils.showToast("onRewardedVideoStarted", maxAd, this);
    }

    public void onUserRewarded(MaxAd maxAd, MaxReward maxReward) {
        Utils.showToast("onUserRewarded", maxAd, this);
    }
}
