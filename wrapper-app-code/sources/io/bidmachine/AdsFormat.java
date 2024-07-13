package io.bidmachine;

import android.text.TextUtils;
import io.bidmachine.banner.BannerSize;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import io.bidmachine.unified.UnifiedFullscreenAdRequestParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;

public enum AdsFormat {
    Banner("banner", new AdsFormatMatcher<UnifiedBannerAdRequestParams>(AdsType.Banner) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, AdContentType adContentType) {
            return true;
        }
    }),
    Banner_320x50("banner_320x50", new AdsFormatMatcher<UnifiedBannerAdRequestParams>(AdsType.Banner) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, AdContentType adContentType) {
            return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_320x50;
        }
    }),
    Banner_300x250("banner_300x250", new AdsFormatMatcher<UnifiedBannerAdRequestParams>(AdsType.Banner) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, AdContentType adContentType) {
            return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_300x250;
        }
    }),
    Banner_728x90("banner_728x90", new AdsFormatMatcher<UnifiedBannerAdRequestParams>(AdsType.Banner) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedBannerAdRequestParams unifiedBannerAdRequestParams, AdContentType adContentType) {
            return unifiedBannerAdRequestParams.getAdRequestParameters().getBannerSize() == BannerSize.Size_728x90;
        }
    }),
    Interstitial("interstitial", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Interstitial) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return true;
        }
    }),
    InterstitialVideo("interstitial_video", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Interstitial) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return adContentType == AdContentType.Video;
        }
    }),
    InterstitialStatic("interstitial_static", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Interstitial) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return adContentType == AdContentType.Static;
        }
    }),
    Rewarded("rewarded", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Rewarded) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return true;
        }
    }),
    RewardedVideo("rewarded_video", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Rewarded) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return adContentType == AdContentType.Video;
        }
    }),
    RewardedStatic("rewarded_static", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.Rewarded) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return adContentType == AdContentType.Static;
        }
    }),
    Native("native", new AdsFormatMatcher<UnifiedNativeAdRequestParams>(AdsType.Native) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, AdContentType adContentType) {
            return true;
        }
    }),
    RichMedia("richmedia", new AdsFormatMatcher<UnifiedFullscreenAdRequestParams>(AdsType.RichMedia) {
        /* access modifiers changed from: package-private */
        public boolean isMatch(UnifiedFullscreenAdRequestParams unifiedFullscreenAdRequestParams, AdContentType adContentType) {
            return adContentType == AdContentType.Video;
        }
    });
    
    private final AdsFormatMatcher matcher;
    private final String remoteName;

    private AdsFormat(String str, AdsFormatMatcher adsFormatMatcher) {
        this.remoteName = str;
        this.matcher = adsFormatMatcher;
    }

    /* access modifiers changed from: package-private */
    public <T extends UnifiedAdRequestParams> boolean isMatch(AdsType adsType, T t, AdContentType adContentType) {
        return this.matcher.isMatch(adsType, t, adContentType);
    }

    static AdsFormat byRemoteName(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        for (AdsFormat adsFormat : values()) {
            if (adsFormat.remoteName.equals(str)) {
                return adsFormat;
            }
        }
        return null;
    }

    private static abstract class AdsFormatMatcher<T extends UnifiedAdRequestParams> {
        private final AdsType adsType;

        /* access modifiers changed from: package-private */
        public abstract boolean isMatch(T t, AdContentType adContentType);

        AdsFormatMatcher(AdsType adsType2) {
            this.adsType = adsType2;
        }

        /* access modifiers changed from: package-private */
        public final boolean isMatch(AdsType adsType2, T t, AdContentType adContentType) {
            return adsType2 == this.adsType && isMatch(t, adContentType);
        }
    }
}
