package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBanner;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidUtils;

public abstract class UnifiedMraidBanner<NetworkRequestParams> extends UnifiedBanner<NetworkRequestParams> implements UnifiedMraidUtils.UnifiedViewMraid<UnifiedBannerParams, UnifiedBannerCallback> {
    private final UnifiedMraidUtils.UnifiedMraidViewAd<UnifiedBannerParams, UnifiedBannerCallback, NetworkRequestParams> unifiedMraid = new UnifiedMraidUtils.UnifiedMraidViewAd<UnifiedBannerParams, UnifiedBannerCallback, NetworkRequestParams>(this) {
        public void loadMraid(Context context, UnifiedBannerParams unifiedBannerParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedBannerCallback unifiedBannerCallback) {
            int i = unifiedMraidNetworkParams.width;
            int i2 = unifiedMraidNetworkParams.height;
            if (i > unifiedBannerParams.getMaxWidth(context) || i2 > unifiedBannerParams.getMaxHeight(context)) {
                int i3 = (i * 50) / i2;
                if (i3 > unifiedBannerParams.getMaxWidth(context) || 50 > unifiedBannerParams.getMaxHeight(context)) {
                    unifiedBannerCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
                    return;
                }
                unifiedMraidNetworkParams = new UnifiedMraidNetworkParams.Builder(unifiedMraidNetworkParams).setWidth(i3).setHeight(50).build();
            }
            super.loadMraid(context, unifiedBannerParams, unifiedMraidNetworkParams, unifiedBannerCallback);
        }

        public void performMraidRequest(Context context, UnifiedBannerParams unifiedBannerParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedBannerCallback unifiedBannerCallback, String str) {
            int i = unifiedMraidNetworkParams.width;
            int i2 = unifiedMraidNetworkParams.height;
            if ((i > unifiedBannerParams.getMaxWidth(context) || i2 > unifiedBannerParams.getMaxHeight(context)) && ((i * 50) / i2 > unifiedBannerParams.getMaxWidth(context) || 50 > unifiedBannerParams.getMaxHeight(context))) {
                unifiedBannerCallback.onAdLoadFailed(LoadingError.IncorrectAdunit);
            } else {
                super.performMraidRequest(context, unifiedBannerParams, unifiedMraidNetworkParams, unifiedBannerCallback, str);
            }
        }
    };

    public UnifiedMraidViewListener<UnifiedBannerCallback> createListener(Context context, UnifiedBannerParams unifiedBannerParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedBannerCallback unifiedBannerCallback) {
        return new UnifiedMraidBannerListener(unifiedBannerCallback, unifiedMraidNetworkParams, unifiedMraidNetworkParams.width, unifiedMraidNetworkParams.height);
    }

    public void load(ContextProvider contextProvider, UnifiedBannerParams unifiedBannerParams, NetworkRequestParams networkrequestparams, UnifiedBannerCallback unifiedBannerCallback) {
        this.unifiedMraid.load(contextProvider, unifiedBannerParams, networkrequestparams, unifiedBannerCallback);
    }

    public void loadMraid(Context context, UnifiedBannerParams unifiedBannerParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedBannerCallback unifiedBannerCallback) {
        this.unifiedMraid.loadMraid(context, unifiedBannerParams, unifiedMraidNetworkParams, unifiedBannerCallback);
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

    public void onPrepareToShow(Activity activity, UnifiedBannerParams unifiedBannerParams) {
        super.onPrepareToShow(activity, unifiedBannerParams);
        this.unifiedMraid.onPrepareToShow(activity, unifiedBannerParams);
    }
}
