package com.appodeal.ads.adapters.meta;

import com.appodeal.ads.AdNetwork;
import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.AdNetworkMediationParams;
import com.appodeal.ads.AdUnit;
import com.appodeal.ads.AppodealNetworks;
import com.appodeal.ads.NetworkInitializationListener;
import com.appodeal.ads.RestrictedData;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.meta.a;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.utils.ActivityRule;
import com.facebook.ads.AdError;
import com.facebook.ads.AdSettings;

public class MetaNetwork extends AdNetwork<RequestParams> {
    private static final a initializer = new a();

    public static final class RequestParams {
        public final String metaKey;

        public RequestParams(String str) {
            this.metaKey = str;
        }
    }

    public class a implements a.C0173a {

        /* renamed from: a  reason: collision with root package name */
        public final /* synthetic */ NetworkInitializationListener f16251a;

        /* renamed from: b  reason: collision with root package name */
        public final /* synthetic */ RequestParams f16252b;

        public a(NetworkInitializationListener networkInitializationListener, RequestParams requestParams) {
            this.f16251a = networkInitializationListener;
            this.f16252b = requestParams;
        }

        public final void a() {
            this.f16251a.onInitializationFailed(LoadingError.InternalError);
        }

        public final void b() {
            try {
                this.f16251a.onInitializationFinished(this.f16252b);
            } catch (Exception unused) {
                this.f16251a.onInitializationFailed(LoadingError.InternalError);
            }
        }
    }

    public static class builder extends AdNetworkBuilder {
        public MetaNetwork build() {
            return new MetaNetwork(this, (a) null);
        }

        public ActivityRule[] getAdActivityRules() {
            return new ActivityRule[]{new ActivityRule.Builder("com.facebook.ads.AudienceNetworkActivity").build()};
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return AppodealNetworks.FACEBOOK;
        }
    }

    private MetaNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public /* synthetic */ MetaNetwork(AdNetworkBuilder adNetworkBuilder, a aVar) {
        this(adNetworkBuilder);
    }

    public static LoadingError mapError(AdError adError) {
        if (adError == null) {
            return null;
        }
        int errorCode = adError.getErrorCode();
        if (errorCode == 2009) {
            return LoadingError.TimeoutError;
        }
        if (errorCode != 2100) {
            if (errorCode != 3001) {
                if (!(errorCode == 6002 || errorCode == 6003)) {
                    if (!(errorCode == 7001 || errorCode == 7002)) {
                        switch (errorCode) {
                            case 1000:
                                return LoadingError.ConnectionError;
                            case 1001:
                            case 1002:
                                break;
                            default:
                                switch (errorCode) {
                                    case 2000:
                                    case 2001:
                                    case 2002:
                                        break;
                                    default:
                                        switch (errorCode) {
                                            case AdError.MISSING_DEPENDENCIES_ERROR:
                                            case AdError.API_NOT_SUPPORTED:
                                                break;
                                            case AdError.NATIVE_AD_IS_NOT_LOADED:
                                                return LoadingError.IncorrectAdunit;
                                            default:
                                                return null;
                                        }
                                }
                        }
                    }
                    return LoadingError.InternalError;
                }
            }
            return LoadingError.NoFill;
        }
        return LoadingError.InvalidAssets;
    }

    private void updateConsent(RestrictedData restrictedData) {
        if (!restrictedData.isUserInCcpaScope()) {
            return;
        }
        if (restrictedData.isUserHasConsent()) {
            AdSettings.setDataProcessingOptions(new String[0]);
        } else {
            AdSettings.setDataProcessingOptions(new String[]{"LDU"}, 0, 0);
        }
    }

    public UnifiedBanner<RequestParams> createBanner() {
        return new com.appodeal.ads.adapters.meta.banner.a();
    }

    public UnifiedInterstitial<RequestParams> createInterstitial() {
        return new com.appodeal.ads.adapters.meta.interstitial.a();
    }

    public UnifiedMrec<RequestParams> createMrec() {
        return new com.appodeal.ads.adapters.meta.mrec.a();
    }

    public UnifiedNative<RequestParams> createNativeAd() {
        return new com.appodeal.ads.adapters.meta.native_ad.a();
    }

    public UnifiedRewarded<RequestParams> createRewarded() {
        return new com.appodeal.ads.adapters.meta.rewarded_video.a();
    }

    public String getRecommendedVersion() {
        return io.bidmachine.ads.networks.meta_audience.BuildConfig.ADAPTER_SDK_VERSION_NAME;
    }

    public String getVersion() {
        return io.bidmachine.ads.networks.meta_audience.BuildConfig.ADAPTER_SDK_VERSION_NAME;
    }

    public void initialize(ContextProvider contextProvider, AdUnit adUnit, AdNetworkMediationParams adNetworkMediationParams, NetworkInitializationListener<RequestParams> networkInitializationListener) {
        RequestParams requestParams = new RequestParams(adUnit.getJsonData().getString("facebook_key"));
        AdSettings.setMixedAudience(adNetworkMediationParams.getRestrictedData().isUserAgeRestricted());
        AdSettings.setTestMode(adNetworkMediationParams.isTestMode());
        if (adNetworkMediationParams.isTestMode()) {
            AdSettings.turnOnSDKDebugger(contextProvider.getApplicationContextOrNull());
            AdSettings.setTestAdType(AdSettings.TestAdType.DEFAULT);
        }
        updateConsent(adNetworkMediationParams.getRestrictedData());
        a aVar = initializer;
        if (!aVar.a()) {
            aVar.a(contextProvider.getApplicationContext(), adUnit.getMediatorName(), new a(networkInitializationListener, requestParams));
        } else {
            networkInitializationListener.onInitializationFinished(requestParams);
        }
    }

    public boolean isSupportSmartBanners() {
        return true;
    }
}
