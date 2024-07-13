package com.appodeal.ads.adapters.adcolony.video;

import android.app.Activity;
import com.adcolony.sdk.AdColony;
import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.appodeal.ads.adapters.adcolony.AdcolonyNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;

public final class a extends UnifiedVideo<AdcolonyNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public AdColonyInterstitial f16183a;

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        UnifiedVideoParams unifiedVideoParams = (UnifiedVideoParams) unifiedAdParams;
        AdcolonyNetwork.RequestParams requestParams = (AdcolonyNetwork.RequestParams) obj;
        AdColony.requestInterstitial(requestParams.zoneId, new b((UnifiedVideoCallback) unifiedAdCallback, this), requestParams.adOptions);
    }

    public final void onDestroy() {
        AdColonyInterstitial adColonyInterstitial = this.f16183a;
        if (adColonyInterstitial != null) {
            adColonyInterstitial.setListener((AdColonyInterstitialListener) null);
            this.f16183a.destroy();
            this.f16183a = null;
        }
    }

    public final void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        AdColonyInterstitial adColonyInterstitial = this.f16183a;
        if (adColonyInterstitial == null || adColonyInterstitial.isExpired()) {
            unifiedVideoCallback.onAdShowFailed();
        } else {
            this.f16183a.show();
        }
    }
}
