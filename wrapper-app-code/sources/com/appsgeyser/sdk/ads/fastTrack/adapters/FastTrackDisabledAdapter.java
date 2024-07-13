package com.appsgeyser.sdk.ads.fastTrack.adapters;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.appsgeyser.sdk.ads.fastTrack.FastTrackSdkModel;
import com.appsgeyser.sdk.ads.fastTrack.adapters.FastTrackBaseAdapter;

public class FastTrackDisabledAdapter extends FastTrackBaseAdapter {
    /* access modifiers changed from: protected */
    public void init() {
    }

    public void initBannerView(ViewGroup viewGroup, String str, Activity activity) {
    }

    public void sendNativeViewRequest() {
    }

    public FastTrackDisabledAdapter(FastTrackSdkModel fastTrackSdkModel, Context context) {
        super(fastTrackSdkModel, context);
    }

    public void showFullscreen(String str, String str2, boolean z, Context context) {
        if (this.fullscreenListener != null) {
            this.fullscreenListener.onRequest();
            this.fullscreenListener.onFailedToShow();
        }
    }

    public void showRewardedVideo(FastTrackBaseAdapter.RewardedVideoListener rewardedVideoListener, String str) {
        rewardedVideoListener.onVideoDeactivated();
    }
}
