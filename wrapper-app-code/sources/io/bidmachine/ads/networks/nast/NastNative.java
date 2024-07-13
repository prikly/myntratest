package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.nativead.NativeNetworkAdapter;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;

class NastNative extends UnifiedNativeAd {
    NastNative() {
    }

    public void load(ContextProvider contextProvider, UnifiedNativeAdCallback unifiedNativeAdCallback, UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        NastParams nastParams = new NastParams(unifiedMediationParams);
        if (nastParams.isValid(unifiedNativeAdRequestParams, unifiedNativeAdCallback)) {
            unifiedNativeAdCallback.onAdLoaded(new NastAdapter().setTitle(nastParams.title).setDescription(nastParams.description).setCallToAction(nastParams.callToAction).setRating(nastParams.rating).setIcon(new ImageDataImpl(nastParams.iconUrl)).setMainImage(new ImageDataImpl(nastParams.imageUrl)).setVideoUrl(nastParams.videoUrl).setVideoAdm(nastParams.videoAdm).setClickUrl(nastParams.clickUrl).setNetworkControlLoadingAssets(false));
        }
    }

    private static final class NastAdapter extends NativeNetworkAdapter {
        private NastAdapter() {
        }

        public boolean hasVideo() {
            return !TextUtils.isEmpty(getVideoAdm()) || !TextUtils.isEmpty(getVideoUrl());
        }
    }
}
