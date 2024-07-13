package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidUtils;
import com.explorestack.iab.mraid.MraidType;

public abstract class UnifiedMraidVideo<NetworkRequestParams> extends UnifiedVideo<NetworkRequestParams> implements UnifiedMraidUtils.UnifiedFullscreenMraid<UnifiedVideoParams, UnifiedVideoCallback> {
    private final UnifiedMraidUtils.UnifiedMraidFullscreenAd<UnifiedVideoParams, UnifiedVideoCallback, NetworkRequestParams> unifiedAd = new UnifiedMraidUtils.UnifiedMraidFullscreenAd<>(this);

    public UnifiedMraidFullscreenListener<UnifiedVideoCallback> createListener(Context context, UnifiedVideoParams unifiedVideoParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedVideoCallback unifiedVideoCallback) {
        return new UnifiedMraidVideoListener(context, unifiedVideoCallback, unifiedMraidNetworkParams);
    }

    public MraidType getMraidType() {
        return MraidType.Video;
    }

    public void load(ContextProvider contextProvider, UnifiedVideoParams unifiedVideoParams, NetworkRequestParams networkrequestparams, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedAd.load(contextProvider, unifiedVideoParams, networkrequestparams, unifiedVideoCallback);
    }

    public void loadMraid(Context context, UnifiedVideoParams unifiedVideoParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedAd.loadMraid(context, unifiedVideoParams, unifiedMraidNetworkParams, unifiedVideoCallback);
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

    public void onPrepareToShow(Activity activity, UnifiedVideoParams unifiedVideoParams) {
        super.onPrepareToShow(activity, unifiedVideoParams);
        this.unifiedAd.onPrepareToShow(activity, unifiedVideoParams);
    }

    public void show(Activity activity, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedAd.show(activity, unifiedVideoCallback);
    }
}
