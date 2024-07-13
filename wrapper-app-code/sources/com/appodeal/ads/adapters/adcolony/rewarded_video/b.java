package com.appodeal.ads.adapters.adcolony.rewarded_video;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyReward;
import com.adcolony.sdk.AdColonyRewardListener;
import com.adcolony.sdk.AdColonyZone;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;

public final class b extends AdColonyInterstitialListener implements AdColonyRewardListener {

    /* renamed from: a  reason: collision with root package name */
    public final UnifiedRewardedCallback f16181a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16182b;

    public b(UnifiedRewardedCallback unifiedRewardedCallback, a aVar) {
        this.f16181a = unifiedRewardedCallback;
        this.f16182b = aVar;
    }

    public final void onClicked(AdColonyInterstitial adColonyInterstitial) {
        this.f16181a.onAdClicked();
    }

    public final void onClosed(AdColonyInterstitial adColonyInterstitial) {
        this.f16181a.onAdClosed();
    }

    public final void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        this.f16181a.onAdExpired();
    }

    public final void onOpened(AdColonyInterstitial adColonyInterstitial) {
        this.f16181a.onAdShown();
    }

    public final void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this.f16182b.f16179a = adColonyInterstitial;
        this.f16181a.onAdLoaded();
    }

    public final void onRequestNotFilled(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            UnifiedRewardedCallback unifiedRewardedCallback = this.f16181a;
            unifiedRewardedCallback.printError("request not filled for zoneId: " + adColonyZone.getZoneID() + ", isValid zone: " + adColonyZone.isValid(), (Object) null);
        }
        this.f16181a.onAdLoadFailed(LoadingError.NoFill);
    }

    public final void onReward(AdColonyReward adColonyReward) {
        if (adColonyReward == null || adColonyReward.success()) {
            this.f16181a.onAdFinished();
        }
    }
}
