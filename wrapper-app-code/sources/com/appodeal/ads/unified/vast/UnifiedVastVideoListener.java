package com.appodeal.ads.unified.vast;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.explorestack.iab.utils.IabClickCallback;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.activity.VastActivity;

public class UnifiedVastVideoListener extends UnifiedVastFullscreenListener<UnifiedVideoCallback> {
    public UnifiedVastVideoListener(UnifiedVideoCallback unifiedVideoCallback, UnifiedVastNetworkParams unifiedVastNetworkParams) {
        super(unifiedVideoCallback, unifiedVastNetworkParams);
    }

    public /* bridge */ /* synthetic */ void onVastClick(VastActivity vastActivity, VastRequest vastRequest, IabClickCallback iabClickCallback, String str) {
        super.onVastClick(vastActivity, vastRequest, iabClickCallback, str);
    }

    public /* bridge */ /* synthetic */ void onVastComplete(VastActivity vastActivity, VastRequest vastRequest) {
        super.onVastComplete(vastActivity, vastRequest);
    }

    public /* bridge */ /* synthetic */ void onVastDismiss(VastActivity vastActivity, VastRequest vastRequest, boolean z) {
        super.onVastDismiss(vastActivity, vastRequest, z);
    }

    public /* bridge */ /* synthetic */ void onVastError(Context context, VastRequest vastRequest, int i) {
        super.onVastError(context, vastRequest, i);
    }

    public /* bridge */ /* synthetic */ void onVastLoaded(VastRequest vastRequest) {
        super.onVastLoaded(vastRequest);
    }

    public /* bridge */ /* synthetic */ void onVastShown(VastActivity vastActivity, VastRequest vastRequest) {
        super.onVastShown(vastActivity, vastRequest);
    }
}
