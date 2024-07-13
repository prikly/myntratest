package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedMrec;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidUtils;

public abstract class UnifiedMraidMrec<NetworkRequestParams> extends UnifiedMrec<NetworkRequestParams> implements UnifiedMraidUtils.UnifiedViewMraid<UnifiedMrecParams, UnifiedMrecCallback> {
    private final UnifiedMraidUtils.UnifiedMraidViewAd<UnifiedMrecParams, UnifiedMrecCallback, NetworkRequestParams> unifiedMraid = new UnifiedMraidUtils.UnifiedMraidViewAd<>(this);

    public UnifiedMraidViewListener<UnifiedMrecCallback> createListener(Context context, UnifiedMrecParams unifiedMrecParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedMrecCallback unifiedMrecCallback) {
        return new UnifiedMraidMrecListener(unifiedMrecCallback, unifiedMraidNetworkParams);
    }

    public void load(ContextProvider contextProvider, UnifiedMrecParams unifiedMrecParams, NetworkRequestParams networkrequestparams, UnifiedMrecCallback unifiedMrecCallback) {
        this.unifiedMraid.load(contextProvider, unifiedMrecParams, networkrequestparams, unifiedMrecCallback);
    }

    public void loadMraid(Context context, UnifiedMrecParams unifiedMrecParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedMrecCallback unifiedMrecCallback) {
        this.unifiedMraid.loadMraid(context, unifiedMrecParams, unifiedMraidNetworkParams, unifiedMrecCallback);
    }

    public void onClicked() {
        super.onClicked();
        this.unifiedMraid.onClicked();
    }

    public void onDestroy() {
        this.unifiedMraid.onDestroy();
    }

    public void onFinished() {
        super.onFinished();
        this.unifiedMraid.onFinished();
    }

    public void onPrepareToShow(Activity activity, UnifiedMrecParams unifiedMrecParams) {
        super.onPrepareToShow(activity, unifiedMrecParams);
        this.unifiedMraid.onPrepareToShow(activity, unifiedMrecParams);
    }
}
