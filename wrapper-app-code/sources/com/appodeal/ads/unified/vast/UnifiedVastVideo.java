package com.appodeal.ads.unified.vast;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedVideo;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.vast.UnifiedVastUtils;
import com.explorestack.iab.vast.VideoType;

public abstract class UnifiedVastVideo<NetworkRequestParams> extends UnifiedVideo<NetworkRequestParams> implements UnifiedVastUtils.UnifiedFullscreenVast<UnifiedVideoParams, UnifiedVideoCallback> {
    public UnifiedVastUtils.UnifiedVastFullscreenAd<UnifiedVideoParams, UnifiedVideoCallback, NetworkRequestParams> unifiedVast = new UnifiedVastUtils.UnifiedVastFullscreenAd<>(this);

    public UnifiedVastFullscreenListener<UnifiedVideoCallback> createListener(Context context, UnifiedVideoParams unifiedVideoParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedVideoCallback unifiedVideoCallback) {
        return new UnifiedVastVideoListener(unifiedVideoCallback, unifiedVastNetworkParams);
    }

    public VideoType getVideoType() {
        return VideoType.NonRewarded;
    }

    public void load(ContextProvider contextProvider, UnifiedVideoParams unifiedVideoParams, NetworkRequestParams networkrequestparams, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedVast.load(contextProvider, unifiedVideoParams, networkrequestparams, unifiedVideoCallback);
    }

    public void loadVast(Context context, UnifiedVideoParams unifiedVideoParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedVast.loadVast(context, unifiedVideoParams, unifiedVastNetworkParams, unifiedVideoCallback);
    }

    public void onDestroy() {
        this.unifiedVast.onDestroy();
    }

    public void onPrepareToShow(Activity activity, UnifiedVideoParams unifiedVideoParams) {
        super.onPrepareToShow(activity, unifiedVideoParams);
        this.unifiedVast.onPrepareToShow(activity, unifiedVideoParams);
    }

    public void show(Activity activity, UnifiedVideoCallback unifiedVideoCallback) {
        this.unifiedVast.show(activity, unifiedVideoCallback);
    }
}
