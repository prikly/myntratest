package com.appodeal.ads.adapters.adcolony.rewarded_video;

import android.app.Activity;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.appodeal.ads.adapters.adcolony.AdcolonyNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedRewarded;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;

public final class a extends UnifiedRewarded<AdcolonyNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AdColonyInterstitial f16179a;

    /* renamed from: b  reason: collision with root package name */
    public b f16180b;

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedRewardedParams unifiedRewardedParams = (UnifiedRewardedParams) unifiedAdParams;
        AdcolonyNetwork.RequestParams requestParams = (AdcolonyNetwork.RequestParams) obj;
        b bVar = new b((UnifiedRewardedCallback) unifiedAdCallback, this);
        this.f16180b = bVar;
        AdColony.setRewardListener(bVar);
        AdColony.requestInterstitial(requestParams.zoneId, this.f16180b, requestParams.adOptions);
    }

    public final void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.f16179a;
        if (adColonyInterstitial != null) {
            if (this.f16180b == adColonyInterstitial.getListener()) {
                this.f16179a.setListener((AdColonyInterstitialListener) null);
            }
            this.f16179a.destroy();
            this.f16179a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedRewardedCallback unifiedRewardedCallback = (UnifiedRewardedCallback) unifiedFullscreenAdCallback;
        AdColonyInterstitial adColonyInterstitial = this.f16179a;
        if (adColonyInterstitial == null || adColonyInterstitial.isExpired()) {
            unifiedRewardedCallback.onAdShowFailed();
        } else {
            this.f16179a.show();
        }
    }
}
