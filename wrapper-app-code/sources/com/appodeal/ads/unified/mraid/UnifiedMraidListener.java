package com.appodeal.ads.unified.mraid;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdCallbackClickTrackListener;
import com.appodeal.ads.utils.q;
import com.explorestack.iab.utils.IabClickCallback;

abstract class UnifiedMraidListener<UnifiedCallbackType extends UnifiedAdCallback> {
    public final UnifiedCallbackType callback;
    public q clickHandler = new q();
    public final UnifiedMraidNetworkParams mraidParams;

    public UnifiedMraidListener(UnifiedCallbackType unifiedcallbacktype, UnifiedMraidNetworkParams unifiedMraidNetworkParams) {
        this.callback = unifiedcallbacktype;
        this.mraidParams = unifiedMraidNetworkParams;
    }

    public void handleBrowserOpen(Context context, String str, final IabClickCallback iabClickCallback) {
        q qVar = this.clickHandler;
        UnifiedMraidNetworkParams unifiedMraidNetworkParams = this.mraidParams;
        qVar.a(context, str, unifiedMraidNetworkParams.packageName, unifiedMraidNetworkParams.expiryTime, new q.b() {
            public void onHandleError() {
                iabClickCallback.clickHandleError();
            }

            public void onHandled() {
                iabClickCallback.clickHandled();
            }

            public void processClick(UnifiedAdCallbackClickTrackListener unifiedAdCallbackClickTrackListener) {
                UnifiedMraidListener.this.callback.onAdClicked(unifiedAdCallbackClickTrackListener);
            }
        });
    }
}
