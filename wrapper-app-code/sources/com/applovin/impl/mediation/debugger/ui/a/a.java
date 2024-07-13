package com.applovin.impl.mediation.debugger.ui.a;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RectShape;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.TextView;
import com.amazon.device.ads.AdError;
import com.amazon.device.ads.DTBAdResponse;
import com.applovin.impl.mediation.debugger.a.a;
import com.applovin.impl.mediation.debugger.b.a.b;
import com.applovin.impl.mediation.debugger.ui.a.b;
import com.applovin.impl.mediation.debugger.ui.d.c;
import com.applovin.impl.mediation.debugger.ui.d.d;
import com.applovin.impl.mediation.debugger.ui.testmode.AdControlButton;
import com.applovin.impl.sdk.n;
import com.applovin.impl.sdk.utils.AppLovinSdkExtraParameterKey;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.impl.sdk.utils.b;
import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.mediation.MaxDebuggerAdUnitDetailActivity;
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
import java.util.List;

public class a extends com.applovin.impl.mediation.debugger.ui.a implements a.C0145a, AdControlButton.a, MaxAdRevenueListener, MaxAdViewAdListener, MaxRewardedAdListener {
    /* access modifiers changed from: private */

    /* renamed from: a  reason: collision with root package name */
    public n f14741a;

    /* renamed from: b  reason: collision with root package name */
    private com.applovin.impl.mediation.debugger.b.a.a f14742b;

    /* renamed from: c  reason: collision with root package name */
    private b f14743c;

    /* renamed from: d  reason: collision with root package name */
    private b f14744d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public MaxAdView f14745e;

    /* renamed from: f  reason: collision with root package name */
    private MaxInterstitialAd f14746f;

    /* renamed from: g  reason: collision with root package name */
    private MaxAppOpenAd f14747g;

    /* renamed from: h  reason: collision with root package name */
    private MaxRewardedInterstitialAd f14748h;
    private MaxRewardedAd i;
    /* access modifiers changed from: private */
    public MaxNativeAdView j;
    /* access modifiers changed from: private */
    public MaxNativeAdLoader k;
    /* access modifiers changed from: private */
    public d l;
    private ListView m;
    private View n;
    private AdControlButton o;
    private TextView p;
    private com.applovin.impl.mediation.debugger.a.a q;

    private void a() {
        String a2 = this.f14742b.a();
        if (this.f14742b.d().isAdViewAd()) {
            MaxAdView maxAdView = new MaxAdView(a2, this.f14742b.d(), this.f14741a.ab(), this);
            this.f14745e = maxAdView;
            maxAdView.setExtraParameter(AppLovinSdkExtraParameterKey.IS_ADAPTIVE_BANNER, "false");
            this.f14745e.setListener(this);
        } else if (MaxAdFormat.INTERSTITIAL == this.f14742b.d()) {
            MaxInterstitialAd maxInterstitialAd = new MaxInterstitialAd(a2, this.f14741a.ab(), this);
            this.f14746f = maxInterstitialAd;
            maxInterstitialAd.setListener(this);
        } else if (MaxAdFormat.APP_OPEN == this.f14742b.d()) {
            MaxAppOpenAd maxAppOpenAd = new MaxAppOpenAd(a2, this.f14741a.ab());
            this.f14747g = maxAppOpenAd;
            maxAppOpenAd.setListener(this);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f14742b.d()) {
            MaxRewardedInterstitialAd maxRewardedInterstitialAd = new MaxRewardedInterstitialAd(a2, this.f14741a.ab(), this);
            this.f14748h = maxRewardedInterstitialAd;
            maxRewardedInterstitialAd.setListener(this);
        } else if (MaxAdFormat.REWARDED == this.f14742b.d()) {
            MaxRewardedAd instance = MaxRewardedAd.getInstance(a2, this.f14741a.ab(), this);
            this.i = instance;
            instance.setListener(this);
        } else if (MaxAdFormat.NATIVE == this.f14742b.d()) {
            MaxNativeAdLoader maxNativeAdLoader = new MaxNativeAdLoader(a2, this.f14741a.ab(), this);
            this.k = maxNativeAdLoader;
            maxNativeAdLoader.setNativeAdListener(new MaxNativeAdListener() {
                public void onNativeAdClicked(MaxAd maxAd) {
                    a.this.onAdClicked(maxAd);
                }

                public void onNativeAdLoadFailed(String str, MaxError maxError) {
                    a.this.onAdLoadFailed(str, maxError);
                }

                public void onNativeAdLoaded(MaxNativeAdView maxNativeAdView, MaxAd maxAd) {
                    if (maxNativeAdView != null) {
                        MaxNativeAdView unused = a.this.j = maxNativeAdView;
                    } else {
                        MaxNativeAdView unused2 = a.this.j = new MaxNativeAdView(MaxNativeAdView.MEDIUM_TEMPLATE_1, a.this.f14741a.P());
                        a.this.k.render(a.this.j, maxAd);
                    }
                    a.this.onAdLoaded(maxAd);
                }
            });
            this.k.setRevenueListener(this);
        }
    }

    private void a(final ViewGroup viewGroup, AppLovinSdkUtils.Size size, DialogInterface.OnShowListener onShowListener) {
        if (this.l == null) {
            d dVar = new d(viewGroup, size, this);
            this.l = dVar;
            dVar.setOnShowListener(onShowListener);
            this.l.setOnDismissListener(new DialogInterface.OnDismissListener() {
                public void onDismiss(DialogInterface dialogInterface) {
                    ViewGroup viewGroup = viewGroup;
                    if (viewGroup instanceof MaxAdView) {
                        ((MaxAdView) viewGroup).stopAutoRefresh();
                    }
                    d unused = a.this.l = null;
                }
            });
            this.l.show();
        }
    }

    private void a(MaxAdFormat maxAdFormat) {
        if (this.f14744d != null) {
            this.f14741a.N().a(this.f14744d.a().a());
            this.f14741a.N().a(true);
        }
        if (maxAdFormat.isAdViewAd()) {
            this.f14745e.setPlacement("[Mediation Debugger Live Ad]");
            this.f14745e.loadAd();
        } else if (MaxAdFormat.INTERSTITIAL == this.f14742b.d()) {
            this.f14746f.loadAd();
        } else if (MaxAdFormat.APP_OPEN == this.f14742b.d()) {
            this.f14747g.loadAd();
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f14742b.d()) {
            this.f14748h.loadAd();
        } else if (MaxAdFormat.REWARDED == this.f14742b.d()) {
            this.i.loadAd();
        } else if (MaxAdFormat.NATIVE == this.f14742b.d()) {
            this.k.setPlacement("[Mediation Debugger Live Ad]");
            this.k.loadAd();
        } else {
            Utils.showToast("Live ads currently unavailable for ad format", this);
        }
    }

    private void b(MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            a(this.f14745e, maxAdFormat.getSize(), new DialogInterface.OnShowListener() {
                public void onShow(DialogInterface dialogInterface) {
                    a.this.f14745e.startAutoRefresh();
                }
            });
        } else if (MaxAdFormat.INTERSTITIAL == this.f14742b.d()) {
            this.f14746f.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.APP_OPEN == this.f14742b.d()) {
            this.f14747g.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == this.f14742b.d()) {
            this.f14748h.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.REWARDED == this.f14742b.d()) {
            this.i.showAd("[Mediation Debugger Live Ad]");
        } else if (MaxAdFormat.NATIVE == this.f14742b.d()) {
            a(this.j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    /* access modifiers changed from: protected */
    public n getSdk() {
        return this.f14741a;
    }

    public void initialize(final com.applovin.impl.mediation.debugger.b.a.a aVar, b bVar, final n nVar) {
        List<?> a2;
        this.f14741a = nVar;
        this.f14742b = aVar;
        this.f14744d = bVar;
        b bVar2 = new b(aVar, bVar, this);
        this.f14743c = bVar2;
        bVar2.a((d.a) new d.a() {
            public void a(com.applovin.impl.mediation.debugger.ui.d.a aVar, final c cVar) {
                if (cVar instanceof b.a) {
                    com.applovin.impl.sdk.utils.b.a(a.this, MaxDebuggerAdUnitDetailActivity.class, nVar.ai(), new b.a<MaxDebuggerAdUnitDetailActivity>() {
                        public void a(MaxDebuggerAdUnitDetailActivity maxDebuggerAdUnitDetailActivity) {
                            maxDebuggerAdUnitDetailActivity.initialize(aVar, ((b.a) cVar).d(), nVar);
                        }
                    });
                }
            }
        });
        a();
        if (!aVar.e().d()) {
            return;
        }
        if ((bVar == null || bVar.a().c().A()) && (a2 = nVar.K().a(aVar.a())) != null && !a2.isEmpty()) {
            this.q = new com.applovin.impl.mediation.debugger.a.a(a2, aVar.d(), (a.C0145a) this);
        }
    }

    public void onAdClicked(MaxAd maxAd) {
        Utils.showToast("onAdClicked", maxAd, this);
    }

    public void onAdCollapsed(MaxAd maxAd) {
        Utils.showToast("onAdCollapsed", maxAd, this);
    }

    public void onAdDisplayFailed(MaxAd maxAd, MaxError maxError) {
        this.o.setControlState(AdControlButton.b.LOAD);
        this.p.setText("");
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
        if (maxAdFormat.isAdViewAd()) {
            this.f14745e.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14746f.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14747g.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f14748h.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_error", adError);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.setLocalExtraParameter("amazon_ad_error", adError);
        }
        a(maxAdFormat);
    }

    public void onAdLoadFailed(String str, MaxError maxError) {
        this.o.setControlState(AdControlButton.b.LOAD);
        this.p.setText("");
        if (204 == maxError.getCode()) {
            Utils.showAlert("No Fill", "No fills often happen in live environments. Please make sure to use the Mediation Debugger test mode before you go live.", (Context) this);
            return;
        }
        Utils.showAlert("", "Failed to load with error code: " + maxError.getCode(), (Context) this);
    }

    public void onAdLoaded(MaxAd maxAd) {
        TextView textView = this.p;
        textView.setText(maxAd.getNetworkName() + " ad loaded");
        this.o.setControlState(AdControlButton.b.SHOW);
        if (maxAd.getFormat().isAdViewAd()) {
            a(this.f14745e, maxAd.getFormat().getSize(), (DialogInterface.OnShowListener) null);
        } else if (MaxAdFormat.NATIVE == this.f14742b.d()) {
            a(this.j, MaxAdFormat.MREC.getSize(), (DialogInterface.OnShowListener) null);
        }
    }

    public void onAdResponseLoaded(DTBAdResponse dTBAdResponse, MaxAdFormat maxAdFormat) {
        if (maxAdFormat.isAdViewAd()) {
            this.f14745e.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.INTERSTITIAL == maxAdFormat) {
            this.f14746f.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.APP_OPEN == maxAdFormat) {
            this.f14747g.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED_INTERSTITIAL == maxAdFormat) {
            this.f14748h.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.REWARDED == maxAdFormat) {
            this.i.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        } else if (MaxAdFormat.NATIVE == maxAdFormat) {
            this.k.setLocalExtraParameter("amazon_ad_response", dTBAdResponse);
        }
        a(maxAdFormat);
    }

    public void onAdRevenuePaid(MaxAd maxAd) {
        Utils.showToast("onAdRevenuePaid", maxAd, this);
    }

    public void onClick(AdControlButton adControlButton) {
        if (this.f14741a.N().a()) {
            Utils.showAlert("Not Supported", "Ad loads are not supported while Test Mode is enabled. Please restart the app.", (Context) this);
            return;
        }
        MaxAdFormat d2 = this.f14742b.d();
        if (AdControlButton.b.LOAD == adControlButton.getControlState()) {
            adControlButton.setControlState(AdControlButton.b.LOADING);
            com.applovin.impl.mediation.debugger.a.a aVar = this.q;
            if (aVar != null) {
                aVar.a();
            } else {
                a(d2);
            }
        } else if (AdControlButton.b.SHOW == adControlButton.getControlState()) {
            if (!d2.isAdViewAd() && d2 != MaxAdFormat.NATIVE) {
                adControlButton.setControlState(AdControlButton.b.LOAD);
            }
            b(d2);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.mediation_debugger_ad_unit_detail_activity);
        setTitle(this.f14743c.a());
        this.m = (ListView) findViewById(R.id.listView);
        this.n = findViewById(R.id.ad_presenter_view);
        this.o = (AdControlButton) findViewById(R.id.ad_control_button);
        this.p = (TextView) findViewById(R.id.status_textview);
        this.m.setAdapter(this.f14743c);
        this.p.setText(this.f14741a.N().a() ? "Not Supported while Test Mode is enabled" : "Tap to load an ad");
        this.p.setTypeface(Typeface.DEFAULT_BOLD);
        this.o.setOnClickListener(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        shapeDrawable.setPadding(0, 10, 0, 0);
        shapeDrawable.getPaint().setColor(-1);
        shapeDrawable.getPaint().setShadowLayer((float) 10, 0.0f, (float) -10, 855638016);
        shapeDrawable.setShape(new RectShape());
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable});
        layerDrawable.setLayerInset(0, 0, 10, 0, 0);
        this.n.setBackground(layerDrawable);
    }

    /* access modifiers changed from: protected */
    public void onDestroy() {
        super.onDestroy();
        if (this.f14744d != null) {
            this.f14741a.N().a((String) null);
            this.f14741a.N().a(false);
        }
        MaxAdView maxAdView = this.f14745e;
        if (maxAdView != null) {
            maxAdView.destroy();
        }
        MaxInterstitialAd maxInterstitialAd = this.f14746f;
        if (maxInterstitialAd != null) {
            maxInterstitialAd.destroy();
        }
        MaxAppOpenAd maxAppOpenAd = this.f14747g;
        if (maxAppOpenAd != null) {
            maxAppOpenAd.destroy();
        }
        MaxRewardedInterstitialAd maxRewardedInterstitialAd = this.f14748h;
        if (maxRewardedInterstitialAd != null) {
            maxRewardedInterstitialAd.destroy();
        }
        MaxRewardedAd maxRewardedAd = this.i;
        if (maxRewardedAd != null) {
            maxRewardedAd.destroy();
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
