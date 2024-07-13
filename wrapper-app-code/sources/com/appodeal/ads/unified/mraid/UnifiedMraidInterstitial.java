package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedInterstitial;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidUtils;
import com.explorestack.iab.mraid.MraidType;

public abstract class UnifiedMraidInterstitial<NetworkRequestParams> extends UnifiedInterstitial<NetworkRequestParams> implements UnifiedMraidUtils.UnifiedFullscreenMraid<UnifiedInterstitialParams, UnifiedInterstitialCallback> {
    private final UnifiedMraidUtils.UnifiedMraidFullscreenAd<UnifiedInterstitialParams, UnifiedInterstitialCallback, NetworkRequestParams> unifiedAd = new UnifiedMraidUtils.UnifiedMraidFullscreenAd<>(this);

    public UnifiedMraidFullscreenListener<UnifiedInterstitialCallback> createListener(Context context, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        return new UnifiedMraidInterstitialListener(context, unifiedInterstitialCallback, unifiedMraidNetworkParams);
    }

    public MraidType getMraidType() {
        return MraidType.Static;
    }

    public void load(ContextProvider contextProvider, UnifiedInterstitialParams unifiedInterstitialParams, NetworkRequestParams networkrequestparams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAd.load(contextProvider, unifiedInterstitialParams, networkrequestparams, unifiedInterstitialCallback);
    }

    public void loadMraid(Context context, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAd.loadMraid(context, unifiedInterstitialParams, unifiedMraidNetworkParams, unifiedInterstitialCallback);
    }

    public void onClicked() {
        super.onClicked();
        this.unifiedAd.onClicked();
    }

    public void onDestroy() {
        this.unifiedAd.onDestroy();
    }

    public void onFinished() {
        super.onFinished();
        this.unifiedAd.onFinished();
    }

    public void onPrepareToShow(Activity activity, UnifiedInterstitialParams unifiedInterstitialParams) {
        super.onPrepareToShow(activity, unifiedInterstitialParams);
        this.unifiedAd.onPrepareToShow(activity, unifiedInterstitialParams);
    }

    public void show(Activity activity, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.unifiedAd.show(activity, unifiedInterstitialCallback);
    }
}
