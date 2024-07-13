package io.bidmachine.ads.networks.adcolony;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import io.bidmachine.unified.UnifiedFullscreenAdCallback;
import io.bidmachine.utils.BMError;

final class AdColonyFullscreenAdListener extends AdColonyInterstitialListener implements AdColonyRewardListener {
    private final AdColonyFullscreenAd adColonyFullscreenAd;
    private final UnifiedFullscreenAdCallback callback;
    private boolean isLoaded;
    private boolean isShown;
    private final String zoneId;

    AdColonyFullscreenAdListener(String str, AdColonyFullscreenAd adColonyFullscreenAd2, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
        this.zoneId = str;
        this.adColonyFullscreenAd = adColonyFullscreenAd2;
        this.callback = unifiedFullscreenAdCallback;
    }

    public void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this.isLoaded = true;
        this.adColonyFullscreenAd.setAdColonyInterstitial(adColonyInterstitial);
        this.callback.onAdLoaded();
    }

    public void onRequestNotFilled(AdColonyZone adColonyZone) {
        this.callback.onAdLoadFailed(BMError.noFill());
    }

    public void onOpened(AdColonyInterstitial adColonyInterstitial) {
        this.isShown = true;
        this.callback.onAdShown();
    }

    public void onClicked(AdColonyInterstitial adColonyInterstitial) {
        this.callback.onAdClicked();
    }

    public void onClosed(AdColonyInterstitial adColonyInterstitial) {
        this.callback.onAdClosed();
    }

    public void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        this.callback.onAdExpired();
    }

    public void onReward(AdColonyReward adColonyReward) {
        if (!adColonyReward.success()) {
            return;
        }
        if (this.isShown) {
            this.callback.onAdFinished();
        } else if (this.isLoaded) {
            this.callback.onAdExpired();
        }
    }

    /* access modifiers changed from: package-private */
    public String getZoneId() {
        return this.zoneId;
    }
}
