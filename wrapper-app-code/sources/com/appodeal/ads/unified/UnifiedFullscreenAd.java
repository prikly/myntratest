package com.appodeal.ads.unified;

import android.app.Activity;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;

public abstract class UnifiedFullscreenAd<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback, NetworkRequestParams> extends UnifiedAd<UnifiedAdParamsType, UnifiedAdCallbackType, NetworkRequestParams> {
    public abstract void show(Activity activity, UnifiedAdCallbackType unifiedadcallbacktype);
}
