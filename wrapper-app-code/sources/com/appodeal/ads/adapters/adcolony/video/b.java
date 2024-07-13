package com.appodeal.ads.adapters.adcolony.video;

import com.adcolony.sdk.AdColonyInterstitial;
import com.adcolony.sdk.AdColonyInterstitialListener;
import com.adcolony.sdk.AdColonyZone;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;

public final class b extends AdColonyInterstitialListener {

    /* renamed from: a  reason: collision with root package name */
    public final UnifiedVideoCallback f16184a;

    /* renamed from: b  reason: collision with root package name */
    public final a f16185b;

    public b(UnifiedVideoCallback unifiedVideoCallback, a aVar) {
        this.f16184a = unifiedVideoCallback;
        this.f16185b = aVar;
    }

    public final void onClicked(AdColonyInterstitial adColonyInterstitial) {
        this.f16184a.onAdClicked();
    }

    public final void onClosed(AdColonyInterstitial adColonyInterstitial) {
        this.f16184a.onAdClosed();
    }

    public final void onExpiring(AdColonyInterstitial adColonyInterstitial) {
        this.f16184a.onAdExpired();
    }

    public final void onOpened(AdColonyInterstitial adColonyInterstitial) {
        this.f16184a.onAdShown();
    }

    public final void onRequestFilled(AdColonyInterstitial adColonyInterstitial) {
        this.f16185b.f16183a = adColonyInterstitial;
        this.f16184a.onAdLoaded();
    }

    public final void onRequestNotFilled(AdColonyZone adColonyZone) {
        if (adColonyZone != null) {
            UnifiedVideoCallback unifiedVideoCallback = this.f16184a;
            unifiedVideoCallback.printError("request not filled for zoneId: " + adColonyZone.getZoneID() + ", isValid zone: " + adColonyZone.isValid(), (Object) null);
        }
        this.f16184a.onAdLoadFailed(LoadingError.NoFill);
    }
}
