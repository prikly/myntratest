package com.appodeal.ads.adapters.admob;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.banner.AdmobBanner;
import com.appodeal.ads.adapters.admob.interstitial.AdmobInterstitial;
import com.appodeal.ads.adapters.admob.mrec.AdmobMrec;
import com.appodeal.ads.adapters.admob.native_ad.AdmobNative;
import com.appodeal.ads.adapters.admob.rewarded_video.AdmobRewarded;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.AdRequest;
import org.json.JSONObject;

public class AdmobNetwork extends UnifiedAdmobNetwork<AdRequest, AdRequest.Builder> {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public AdmobNetwork build() {
            return new AdmobNetwork(this);
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "admob";
        }
    }

    public AdmobNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public AdRequest createAdRequest(AdRequest.Builder builder2) {
        return builder2.build();
    }

    public AdRequest.Builder createAdRequestBuilder(JSONObject jSONObject) {
        return new AdRequest.Builder();
    }

    public UnifiedBanner<UnifiedAdmobRequestParams<AdRequest>> createBanner() {
        return new AdmobBanner();
    }

    public UnifiedInterstitial<UnifiedAdmobRequestParams<AdRequest>> createInterstitial() {
        return new AdmobInterstitial();
    }

    public UnifiedMrec<UnifiedAdmobRequestParams<AdRequest>> createMrec() {
        return new AdmobMrec();
    }

    public UnifiedNative<UnifiedAdmobRequestParams<AdRequest>> createNativeAd() {
        return new AdmobNative();
    }

    public UnifiedRewarded<UnifiedAdmobRequestParams<AdRequest>> createRewarded() {
        return new AdmobRewarded();
    }
}
