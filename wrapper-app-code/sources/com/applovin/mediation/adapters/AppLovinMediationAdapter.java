package com.applovin.mediation.adapters;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.ViewGroup;
import androidx.lifecycle.Lifecycle;
import com.amazon.aps.shared.util.APSSharedUtil;
import com.applovin.adview.AppLovinAdView;
import com.applovin.adview.AppLovinIncentivizedInterstitial;
import com.applovin.adview.AppLovinInterstitialAd;
import com.applovin.adview.AppLovinInterstitialAdDialog;
import com.applovin.impl.adview.AppLovinAppOpenAd;
import com.applovin.impl.adview.AppLovinRewardedInterstitialAd;
import com.applovin.impl.sdk.ad.AppLovinAdImpl;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAd;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.Utils;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.adapter.MaxAdViewAdapter;
import com.applovin.mediation.adapter.MaxAdapter;
import com.applovin.mediation.adapter.MaxAdapterError;
import com.applovin.mediation.adapter.MaxAppOpenAdapter;
import com.applovin.mediation.adapter.MaxInterstitialAdapter;
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
import com.applovin.sdk.AppLovinAd;
import com.applovin.sdk.AppLovinAdLoadListener;
import com.applovin.sdk.AppLovinAdSize;
import com.applovin.sdk.AppLovinAdType;
import com.applovin.sdk.AppLovinSdk;

public class AppLovinMediationAdapter extends MediationAdapterBase implements MaxAdViewAdapter, MaxAppOpenAdapter, MaxInterstitialAdapter, MaxRewardedAdapter, MaxRewardedInterstitialAdapter, MaxSignalProvider {
    protected AppLovinAdView loadedAdView;
    protected AppLovinAd loadedAppOpenAd;
    protected AppLovinAd loadedInterstitialAd;
    protected AppLovinNativeAd loadedNativeAd;
    protected AppLovinAd loadedRewardedAd;
    protected AppLovinAd loadedRewardedInterstitialAd;

    public AppLovinMediationAdapter(AppLovinSdk appLovinSdk) {
        super(appLovinSdk);
    }

    protected static Bundle getExtraInfo(AppLovinAd appLovinAd) {
        Bundle bundle = new Bundle(1);
        bundle.putBundle(Utils.KEY_AD_VALUES, ((AppLovinAdImpl) appLovinAd).getMAXAdValues());
        return bundle;
    }

    private void loadFullscreenAd(String str, MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Object obj) {
        StringBuilder sb;
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), (AppLovinAdLoadListener) obj);
            return;
        }
        if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            str = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            sb = new StringBuilder();
            sb.append("Loading mediated ");
            sb.append(maxAdFormat.getLabel());
            sb.append(" ad: ");
            sb.append(str);
            sb.append(APSSharedUtil.TRUNCATE_SEPARATOR);
        } else {
            sb = new StringBuilder();
            sb.append("Loading mediated ");
            sb.append(maxAdFormat.getLabel());
            sb.append(" ad...");
        }
        log(sb.toString());
        getWrappingSdk().getAdService().loadNextAdForZoneId(str, (AppLovinAdLoadListener) obj);
    }

    protected static MaxAdapterError toMaxError(int i) {
        MaxAdapterError maxAdapterError = i == -1009 ? MaxAdapterError.NO_CONNECTION : i == 204 ? MaxAdapterError.NO_FILL : i == -1 ? MaxAdapterError.INTERNAL_ERROR : i >= 500 ? MaxAdapterError.SERVER_ERROR : MaxAdapterError.UNSPECIFIED;
        return new MaxAdapterError(maxAdapterError.getCode(), maxAdapterError.getErrorMessage(), i, "");
    }

    public void collectSignal(MaxAdapterSignalCollectionParameters maxAdapterSignalCollectionParameters, Activity activity, MaxSignalCollectionListener maxSignalCollectionListener) {
        log("Collecting signal...");
        maxSignalCollectionListener.onSignalCollected(getWrappingSdk().getAdService().getBidToken());
    }

    public String getAdapterVersion() {
        return getSdkVersion();
    }

    public String getSdkVersion() {
        return AppLovinSdk.VERSION;
    }

    public void initialize(MaxAdapterInitializationParameters maxAdapterInitializationParameters, Activity activity, MaxAdapter.OnCompletionListener onCompletionListener) {
        onCompletionListener.onCompletion(MaxAdapter.InitializationStatus.DOES_NOT_APPLY, (String) null);
    }

    public void loadAdViewAd(MaxAdapterResponseParameters maxAdapterResponseParameters, MaxAdFormat maxAdFormat, Activity activity, MaxAdViewAdapterListener maxAdViewAdapterListener) {
        AppLovinAdapterAdViewListener appLovinAdapterAdViewListener = new AppLovinAdapterAdViewListener(this, maxAdFormat, maxAdViewAdapterListener);
        if (StringUtils.isValidString(maxAdapterResponseParameters.getBidResponse())) {
            log("Loading bidding " + maxAdFormat.getLabel() + " ad...");
            getWrappingSdk().getAdService().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), appLovinAdapterAdViewListener);
        } else if (StringUtils.isValidString(maxAdapterResponseParameters.getThirdPartyAdPlacementId())) {
            String thirdPartyAdPlacementId = maxAdapterResponseParameters.getThirdPartyAdPlacementId();
            log("Loading mediated " + maxAdFormat.getLabel() + " ad: " + thirdPartyAdPlacementId + APSSharedUtil.TRUNCATE_SEPARATOR);
            getWrappingSdk().getAdService().loadNextAdForZoneId(thirdPartyAdPlacementId, appLovinAdapterAdViewListener);
        } else {
            AppLovinAdSize appLovinAdSize = null;
            if (maxAdFormat == MaxAdFormat.BANNER) {
                appLovinAdSize = AppLovinAdSize.BANNER;
            } else if (maxAdFormat == MaxAdFormat.MREC) {
                appLovinAdSize = AppLovinAdSize.MREC;
            } else if (maxAdFormat == MaxAdFormat.LEADER) {
                appLovinAdSize = AppLovinAdSize.LEADER;
            }
            if (appLovinAdSize != null) {
                log("Loading regular " + maxAdFormat.getLabel() + " ad...");
                getWrappingSdk().getAdService().loadNextAd(appLovinAdSize, appLovinAdapterAdViewListener);
                return;
            }
            log("Failed to load ad for format: " + maxAdFormat);
            maxAdViewAdapterListener.onAdViewAdLoadFailed(MaxAdapterError.INTERNAL_ERROR);
        }
    }

    public void loadAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        loadFullscreenAd("inter_appopen", maxAdapterResponseParameters, MaxAdFormat.APP_OPEN, new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener));
    }

    public void loadInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        loadFullscreenAd("inter_regular", maxAdapterResponseParameters, MaxAdFormat.INTERSTITIAL, new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener));
    }

    public void loadNativeAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxNativeAdAdapterListener maxNativeAdAdapterListener) {
        if (TextUtils.isEmpty(maxAdapterResponseParameters.getBidResponse())) {
            maxNativeAdAdapterListener.onNativeAdLoadFailed(MaxAdapterError.INVALID_CONFIGURATION);
            return;
        }
        d("Loading bidding native ad...");
        getWrappingSdk().coreSdk.w().loadNextAdForAdToken(maxAdapterResponseParameters.getBidResponse(), new AppLovinAdapterNativeListener(maxAdapterResponseParameters, this, maxNativeAdAdapterListener));
    }

    public void loadRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        loadFullscreenAd("inter_videoa", maxAdapterResponseParameters, MaxAdFormat.REWARDED, new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener));
    }

    public void loadRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        loadFullscreenAd("inter_autorew", maxAdapterResponseParameters, MaxAdFormat.REWARDED_INTERSTITIAL, new AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener));
    }

    public void onDestroy() {
        this.loadedInterstitialAd = null;
        this.loadedAppOpenAd = null;
        this.loadedRewardedAd = null;
        this.loadedRewardedInterstitialAd = null;
        AppLovinAdView appLovinAdView = this.loadedAdView;
        if (appLovinAdView != null) {
            appLovinAdView.destroy();
            this.loadedAdView = null;
        }
        AppLovinNativeAd appLovinNativeAd = this.loadedNativeAd;
        if (appLovinNativeAd instanceof AppLovinNativeAdImpl) {
            ((AppLovinNativeAdImpl) appLovinNativeAd).destroy();
            this.loadedNativeAd = null;
        }
    }

    public void showAppOpenAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxAppOpenAdapterListener maxAppOpenAdapterListener) {
        log("Showing app open ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        AppLovinAppOpenAd appLovinAppOpenAd = new AppLovinAppOpenAd(getWrappingSdk());
        AppLovinAdapterAppOpenListener appLovinAdapterAppOpenListener = new AppLovinAdapterAppOpenListener(this, maxAppOpenAdapterListener);
        appLovinAppOpenAd.setAdDisplayListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.setAdClickListener(appLovinAdapterAppOpenListener);
        appLovinAppOpenAd.show(this.loadedAppOpenAd);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd);
    }

    public void showInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxInterstitialAdapterListener maxInterstitialAdapterListener) {
        log("Showing interstitial ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        AppLovinAdapterInterstitialListener appLovinAdapterInterstitialListener = new AppLovinAdapterInterstitialListener(this, maxInterstitialAdapterListener);
        create.setAdDisplayListener(appLovinAdapterInterstitialListener);
        create.setAdClickListener(appLovinAdapterInterstitialListener);
        create.showAndRender(this.loadedInterstitialAd, viewGroup, lifecycle);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        create.show(this.loadedRewardedAd, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showRewardedAd(MaxAdapterResponseParameters maxAdapterResponseParameters, ViewGroup viewGroup, Lifecycle lifecycle, Activity activity, MaxRewardedAdapterListener maxRewardedAdapterListener) {
        log("Showing rewarded ad view: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        configureReward(maxAdapterResponseParameters);
        AppLovinIncentivizedInterstitial create = AppLovinIncentivizedInterstitial.create(getWrappingSdk());
        AppLovinAdapterRewardedListener appLovinAdapterRewardedListener = new AppLovinAdapterRewardedListener(this, maxRewardedAdapterListener);
        create.show(this.loadedRewardedAd, viewGroup, lifecycle, activity, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener, appLovinAdapterRewardedListener);
    }

    public void showRewardedInterstitialAd(MaxAdapterResponseParameters maxAdapterResponseParameters, Activity activity, MaxRewardedInterstitialAdapterListener maxRewardedInterstitialAdapterListener) {
        log("Showing rewarded interstitial ad: " + maxAdapterResponseParameters.getThirdPartyAdPlacementId() + APSSharedUtil.TRUNCATE_SEPARATOR);
        AppLovinAdapterRewardedInterstitialListener appLovinAdapterRewardedInterstitialListener = new AppLovinAdapterRewardedInterstitialListener(this, maxRewardedInterstitialAdapterListener);
        if (this.loadedRewardedInterstitialAd.getType() == AppLovinAdType.AUTO_INCENTIVIZED) {
            configureReward(maxAdapterResponseParameters);
            AppLovinRewardedInterstitialAd appLovinRewardedInterstitialAd = new AppLovinRewardedInterstitialAd(getWrappingSdk());
            appLovinRewardedInterstitialAd.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
            appLovinRewardedInterstitialAd.show(this.loadedRewardedInterstitialAd, activity, appLovinAdapterRewardedInterstitialListener);
            return;
        }
        log("Rewarded interstitial is regular interstitial");
        AppLovinInterstitialAdDialog create = AppLovinInterstitialAd.create(getWrappingSdk(), activity);
        create.setAdDisplayListener(appLovinAdapterRewardedInterstitialListener);
        create.setAdClickListener(appLovinAdapterRewardedInterstitialListener);
        create.setAdVideoPlaybackListener(appLovinAdapterRewardedInterstitialListener);
        create.showAndRender(this.loadedRewardedInterstitialAd);
    }
}
