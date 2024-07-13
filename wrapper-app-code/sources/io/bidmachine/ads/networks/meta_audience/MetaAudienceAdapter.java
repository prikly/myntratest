package io.bidmachine.ads.networks.meta_audience;

import android.text.TextUtils;
import com.facebook.ads.AdSettings;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.BidderTokenProvider;
import com.onesignal.outcomes.OSOutcomeConstants;
import io.bidmachine.AdsType;
import io.bidmachine.BidMachine;
import io.bidmachine.ContextProvider;
import io.bidmachine.HeaderBiddingAdRequestParams;
import io.bidmachine.HeaderBiddingAdapter;
import io.bidmachine.HeaderBiddingCollectParamsCallback;
import io.bidmachine.InitializationParams;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfigParams;
import io.bidmachine.NetworkInitializationCallback;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedFullscreenAd;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.utils.BMError;
import java.util.HashMap;

class MetaAudienceAdapter extends HeaderBiddingAdapter {
    static final /* synthetic */ boolean $assertionsDisabled = false;

    MetaAudienceAdapter() {
        super(BuildConfig.ADAPTER_NAME, BuildConfig.ADAPTER_SDK_VERSION_NAME, BuildConfig.ADAPTER_VERSION_NAME, 1, new AdsType[]{AdsType.Banner, AdsType.Interstitial, AdsType.Rewarded, AdsType.Native});
    }

    public UnifiedBannerAd createBanner() {
        return new MetaAudienceBanner();
    }

    public UnifiedFullscreenAd createInterstitial() {
        return new MetaAudienceInterstitial();
    }

    public UnifiedFullscreenAd createRewarded() {
        return new MetaAudienceRewarded();
    }

    public UnifiedNativeAd createNativeAd() {
        return new MetaAudienceNative();
    }

    /* access modifiers changed from: protected */
    public boolean isNetworkInitialized(ContextProvider contextProvider) throws Throwable {
        return AudienceNetworkAds.isInitialized(contextProvider.getApplicationContext());
    }

    /* access modifiers changed from: protected */
    public void onNetworkInitialize(ContextProvider contextProvider, InitializationParams initializationParams, NetworkConfigParams networkConfigParams, NetworkInitializationCallback networkInitializationCallback) throws Throwable {
        configure(initializationParams.isTestMode(), initializationParams.getDataRestrictions());
        AudienceNetworkAds.initialize(contextProvider.getApplicationContext());
        networkInitializationCallback.onSuccess();
    }

    /* access modifiers changed from: protected */
    public void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        String mediationParameter = networkAdUnit.getMediationParameter(OSOutcomeConstants.APP_ID);
        if (TextUtils.isEmpty(mediationParameter)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter(OSOutcomeConstants.APP_ID));
            return;
        }
        String mediationParameter2 = networkAdUnit.getMediationParameter("meta_key");
        if (TextUtils.isEmpty(mediationParameter2)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("meta_key"));
            return;
        }
        String bidderToken = BidderTokenProvider.getBidderToken(contextProvider.getApplicationContext());
        if (TextUtils.isEmpty(bidderToken)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterGetsParameter("token"));
            return;
        }
        HashMap hashMap = new HashMap();
        hashMap.put(OSOutcomeConstants.APP_ID, mediationParameter);
        hashMap.put("meta_key", mediationParameter2);
        hashMap.put("token", bidderToken);
        headerBiddingCollectParamsCallback.onCollectFinished(hashMap);
    }

    private void configure(boolean z, DataRestrictions dataRestrictions) {
        if (z) {
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        AdSettings.setMediationService(String.format("%s_%s:%s", new Object[]{BidMachine.NAME.toLowerCase(), "2.1.5", getAdapterVersion()}));
        AdSettings.setMixedAudience(dataRestrictions.isUserAgeRestricted());
        if (!dataRestrictions.isUserInCcpaScope()) {
            return;
        }
        if (dataRestrictions.isUserHasCcpaConsent()) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        }
    }
}
