package com.appodeal.ads.unified;

import android.app.Activity;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;

public abstract class UnifiedAd<UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback, NetworkRequestParamsType> {
    public abstract void load(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, NetworkRequestParamsType networkrequestparamstype, UnifiedAdCallbackType unifiedadcallbacktype);

    public void onClicked() {
    }

    public abstract void onDestroy();

    public void onError(LoadingError loadingError) {
    }

    public void onFinished() {
    }

    public void onHide() {
    }

    public void onImpression() {
    }

    public void onLoaded() {
    }

    public void onMediationLoss(String str, double d2) {
    }

    public void onMediationWin() {
    }

    public void onPrepareToShow(Activity activity, UnifiedAdParamsType unifiedadparamstype) {
    }

    public void onShow() {
    }
}
