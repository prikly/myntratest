package com.amazon.device.ads;

import android.view.View;
import com.amazon.device.ads.DTBAdVideoListener;

@Deprecated
public class DTBAdBaseInterstitialListener implements DTBAdInterstitialListener {
    public void onAdClicked(View view) {
    }

    public void onAdClosed(View view) {
    }

    public void onAdFailed(View view) {
    }

    public void onAdLeftApplication(View view) {
    }

    public void onAdLoaded(View view) {
    }

    public void onAdOpen(View view) {
    }

    public void onImpressionFired(View view) {
    }

    public /* synthetic */ void onVideoCompleted(View view) {
        DTBAdVideoListener.CC.$default$onVideoCompleted(this, view);
    }
}
