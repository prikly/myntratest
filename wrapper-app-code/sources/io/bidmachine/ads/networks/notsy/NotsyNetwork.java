package io.bidmachine.ads.networks.notsy;

import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import com.google.android.gms.ads.MobileAds;
import io.bidmachine.AdsFormat;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.utils.BMError;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

class NotsyNetwork {
    private static final AtomicBoolean isInitialized = new AtomicBoolean(false);

    NotsyNetwork() {
    }

    static void init(Context context, Map<AdsFormat, List<InternalNotsyAdUnit>> map) {
        if (!isInitialized.getAndSet(true)) {
            try {
                MobileAds.initialize(context);
            } catch (Throwable unused) {
            }
            NotsyLoader.setup(context, map);
            NotsyLoader.startLoading();
        }
    }

    static boolean isInitialized() {
        return isInitialized.get();
    }

    static boolean isGAMPresent(Context context) {
        return isGAMMetaDataPresent(context) && isGAMClassPresent();
    }

    static boolean reserveNotsyAd(NetworkAdUnit networkAdUnit, InternalNotsyData internalNotsyData) {
        return NotsyLoader.reserveNotsyAd(networkAdUnit, internalNotsyData);
    }

    static void unReserveNotsyAd(NetworkAdUnit networkAdUnit) {
        NotsyLoader.unReserveNotsyAd(networkAdUnit);
    }

    static void loadBanner(NetworkAdUnit networkAdUnit, InternalNotsyBannerAdListener internalNotsyBannerAdListener) {
        InternalNotsyAd notsyAd = NotsyLoader.getNotsyAd(networkAdUnit);
        if (notsyAd instanceof InternalNotsyBannerAd) {
            notsyAd.setAdPresentListener(internalNotsyBannerAdListener);
            internalNotsyBannerAdListener.onAdLoaded((InternalNotsyBannerAd) notsyAd);
            return;
        }
        onAdLoadFailed(internalNotsyBannerAdListener, notsyAd);
    }

    static void loadInterstitial(NetworkAdUnit networkAdUnit, InternalNotsyInterstitialAdListener internalNotsyInterstitialAdListener) {
        InternalNotsyAd notsyAd = NotsyLoader.getNotsyAd(networkAdUnit);
        if (notsyAd instanceof InternalNotsyInterstitialAd) {
            notsyAd.setAdPresentListener(internalNotsyInterstitialAdListener);
            internalNotsyInterstitialAdListener.onAdLoaded((InternalNotsyInterstitialAd) notsyAd);
            return;
        }
        onAdLoadFailed(internalNotsyInterstitialAdListener, notsyAd);
    }

    static void loadRewarded(NetworkAdUnit networkAdUnit, InternalNotsyRewardedAdListener internalNotsyRewardedAdListener) {
        InternalNotsyAd notsyAd = NotsyLoader.getNotsyAd(networkAdUnit);
        if (notsyAd instanceof InternalNotsyRewardedAd) {
            notsyAd.setAdPresentListener(internalNotsyRewardedAdListener);
            internalNotsyRewardedAdListener.onAdLoaded((InternalNotsyRewardedAd) notsyAd);
            return;
        }
        onAdLoadFailed(internalNotsyRewardedAdListener, notsyAd);
    }

    private static void onAdLoadFailed(InternalNotsyAdLoadListener<?> internalNotsyAdLoadListener, InternalNotsyAd internalNotsyAd) {
        if (internalNotsyAd != null) {
            try {
                internalNotsyAd.destroy();
            } catch (Throwable unused) {
            }
        }
        internalNotsyAdLoadListener.onAdLoadFailed(BMError.noFill());
    }

    private static boolean isGAMMetaDataPresent(Context context) {
        try {
            Bundle bundle = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData;
            if (bundle == null) {
                return false;
            }
            return !TextUtils.isEmpty(bundle.getString("com.google.android.gms.ads.APPLICATION_ID"));
        } catch (Exception unused) {
            return false;
        }
    }

    private static boolean isGAMClassPresent() {
        try {
            Class.forName("com.google.android.gms.ads.MobileAds");
            Class.forName("com.google.android.gms.ads.admanager.AdManagerAdRequest$Builder");
            Class.forName("com.google.android.gms.ads.admanager.AdManagerAdView");
            Class.forName("com.google.android.gms.ads.admanager.AdManagerInterstitialAd");
            Class.forName("com.google.android.gms.ads.rewarded.RewardedAd");
            return true;
        } catch (Exception unused) {
            return false;
        }
    }
}
