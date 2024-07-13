package com.appodeal.ads.unified.vast;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.utils.q;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.vast.VastActivityListener;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VastRequestListener;
import com.explorestack.iab.vast.activity.VastActivity;

abstract class UnifiedVastFullscreenListener<UnifiedCallbackType extends UnifiedFullscreenAdCallback> implements VastActivityListener, VastRequestListener {
    public final UnifiedCallbackType callback;
    private final q clickHandler = new q();
    public final UnifiedVastNetworkParams vastParams;

    public UnifiedVastFullscreenListener(UnifiedCallbackType unifiedcallbacktype, UnifiedVastNetworkParams unifiedVastNetworkParams) {
        this.callback = unifiedcallbacktype;
        this.vastParams = unifiedVastNetworkParams;
    }

    public void onVastClick(VastActivity vastActivity, VastRequest vastRequest, final IabClickCallback iabClickCallback, String str) {
        q qVar = this.clickHandler;
        UnifiedVastNetworkParams unifiedVastNetworkParams = this.vastParams;
        qVar.a(vastActivity, str, unifiedVastNetworkParams.packageName, unifiedVastNetworkParams.expiryTime, new q.b() {
            public void onHandleError() {
                iabClickCallback.clickHandleError();
            }

            public void onHandled() {
                iabClickCallback.clickHandled();
            }

            public void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
                UnifiedVastFullscreenListener.this.callback.onAdClicked(unifiedAdCallbackClickTrackListener);
            }
        });
    }

    public void onVastComplete(VastActivity vastActivity, VastRequest vastRequest) {
    }

    public void onVastDismiss(VastActivity vastActivity, VastRequest vastRequest, boolean z) {
        if (z) {
            this.callback.onAdFinished();
        }
        this.callback.onAdClosed();
    }

    public void onVastError(Context context, VastRequest vastRequest, int i) {
        this.callback.printError((String) null, Integer.valueOf(i));
        this.callback.onAdLoadFailed((LoadingError) null);
    }

    public void onVastLoaded(VastRequest vastRequest) {
        this.callback.onAdLoaded();
    }

    public void onVastShown(VastActivity vastActivity, VastRequest vastRequest) {
        this.callback.onAdShown();
    }
}
