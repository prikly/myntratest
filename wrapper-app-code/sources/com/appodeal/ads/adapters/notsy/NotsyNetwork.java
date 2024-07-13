package com.appodeal.ads.adapters.notsy;

import com.appodeal.ads.AdNetworkBuilder;
import com.appodeal.ads.adapters.admob.BuildConfig;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobNetwork;
import com.appodeal.ads.adapters.admob.unified.UnifiedAdmobRequestParams;
import com.appodeal.ads.adapters.notsy.banner.a;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import java.util.Iterator;
import org.json.JSONObject;

public class NotsyNetwork extends UnifiedAdmobNetwork<AdManagerAdRequest, AdManagerAdRequest.Builder> {

    public static class builder extends UnifiedAdmobNetwork.builder {
        public NotsyNetwork build() {
            return new NotsyNetwork(this);
        }

        public String getAdapterVersion() {
            return BuildConfig.ADAPTER_VERSION;
        }

        public String getName() {
            return "notsy";
        }
    }

    public NotsyNetwork(AdNetworkBuilder adNetworkBuilder) {
        super(adNetworkBuilder);
    }

    public AdManagerAdRequest createAdRequest(AdManagerAdRequest.Builder builder2) {
        return builder2.build();
    }

    public AdManagerAdRequest.Builder createAdRequestBuilder(JSONObject jSONObject) {
        AdManagerAdRequest.Builder builder2 = new AdManagerAdRequest.Builder();
        JSONObject optJSONObject = jSONObject.optJSONObject("targeting");
        if (optJSONObject != null) {
            Iterator<String> keys = optJSONObject.keys();
            while (keys.hasNext()) {
                String next = keys.next();
                builder2.addCustomTargeting(next, optJSONObject.optString(next));
            }
        }
        return builder2;
    }

    public UnifiedBanner<UnifiedAdmobRequestParams<AdManagerAdRequest>> createBanner() {
        return new a();
    }

    public UnifiedInterstitial<UnifiedAdmobRequestParams<AdManagerAdRequest>> createInterstitial() {
        return new com.appodeal.ads.adapters.notsy.interstitial.a();
    }

    public UnifiedMrec<UnifiedAdmobRequestParams<AdManagerAdRequest>> createMrec() {
        return new com.appodeal.ads.adapters.notsy.mrec.a();
    }

    public UnifiedNative<UnifiedAdmobRequestParams<AdManagerAdRequest>> createNativeAd() {
        return new com.appodeal.ads.adapters.notsy.native_ad.a();
    }

    public UnifiedRewarded<UnifiedAdmobRequestParams<AdManagerAdRequest>> createRewarded() {
        return new com.appodeal.ads.adapters.notsy.rewarded_video.a();
    }
}
