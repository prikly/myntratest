package io.bidmachine.ads.networks.meta_audience;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;
import io.bidmachine.ContextProvider;
import io.bidmachine.ImageDataImpl;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.nativead.NativeNetworkAdapter;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAd;
import io.bidmachine.unified.UnifiedNativeAdCallback;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.utils.ViewHelper;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

class MetaAudienceNative extends UnifiedNativeAd {
    private Listener listener;
    private NativeAdBase nativeAdBase;

    MetaAudienceNative() {
    }

    public void load(ContextProvider contextProvider, UnifiedNativeAdCallback unifiedNativeAdCallback, UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, UnifiedMediationParams unifiedMediationParams, NetworkAdUnit networkAdUnit) throws Throwable {
        MetaAudienceParams metaAudienceParams = new MetaAudienceParams(unifiedMediationParams);
        if (metaAudienceParams.isValid(unifiedNativeAdCallback)) {
            NativeAdRequestParameters adRequestParameters = unifiedNativeAdRequestParams.getAdRequestParameters();
            boolean containsAssetType = adRequestParameters.containsAssetType(MediaAssetType.Video);
            Context applicationContext = contextProvider.getApplicationContext();
            if (adRequestParameters.containsAssetType(MediaAssetType.All) || adRequestParameters.containsAssetType(MediaAssetType.Image) || containsAssetType) {
                this.nativeAdBase = new NativeAd(applicationContext, metaAudienceParams.placementId);
            } else {
                this.nativeAdBase = new NativeBannerAd(applicationContext, metaAudienceParams.placementId);
            }
            this.listener = new Listener(unifiedNativeAdCallback, this.nativeAdBase);
            NativeAdBase nativeAdBase2 = this.nativeAdBase;
            nativeAdBase2.loadAd(nativeAdBase2.buildLoadAdConfig().withAdListener(this.listener).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).withBid(metaAudienceParams.bidPayload).build());
        }
    }

    public void onDestroy() {
        Listener listener2 = this.listener;
        if (listener2 != null) {
            listener2.destroy();
            this.listener = null;
        }
        NativeAdBase nativeAdBase2 = this.nativeAdBase;
        if (nativeAdBase2 != null) {
            nativeAdBase2.destroy();
            this.nativeAdBase = null;
        }
    }

    private static final class Listener extends BaseMetaAudienceListener<UnifiedNativeAdCallback> implements NativeAdListener {
        private NativeAdBase nativeAdBase;

        public void onLoggingImpression(Ad ad) {
        }

        public void onMediaDownloaded(Ad ad) {
        }

        Listener(UnifiedNativeAdCallback unifiedNativeAdCallback, NativeAdBase nativeAdBase2) {
            super(unifiedNativeAdCallback);
            this.nativeAdBase = nativeAdBase2;
        }

        public void onAdLoaded(Ad ad) {
            BaseAdapter baseAdapter;
            NativeAdBase nativeAdBase2 = this.nativeAdBase;
            if (nativeAdBase2 != null && nativeAdBase2 == ad) {
                if (nativeAdBase2 instanceof NativeBannerAd) {
                    baseAdapter = new BannerAdapter((NativeBannerAd) nativeAdBase2);
                } else {
                    baseAdapter = nativeAdBase2 instanceof NativeAd ? new MediaViewAdapter((NativeAd) nativeAdBase2) : null;
                }
                if (baseAdapter == null || !baseAdapter.isValid()) {
                    super.onError(ad, AdError.NO_FILL);
                } else {
                    ((UnifiedNativeAdCallback) getCallback()).onAdLoaded(baseAdapter);
                }
            }
        }

        public void onError(Ad ad, AdError adError) {
            NativeAdBase nativeAdBase2 = this.nativeAdBase;
            if (nativeAdBase2 != null && nativeAdBase2 == ad) {
                super.onError(ad, adError);
            }
        }

        public void destroy() {
            this.nativeAdBase = null;
        }
    }

    private static abstract class BaseAdapter<T extends NativeAdBase> extends NativeNetworkAdapter {
        T nativeAdBase;

        public BaseAdapter(T t) {
            this.nativeAdBase = t;
            setTitle(t.getAdvertiserName());
            setDescription(t.getAdBodyText());
            setCallToAction(t.getAdCallToAction());
            ImageDataImpl imageDataImpl = new ImageDataImpl(t.getPreloadedIconViewDrawable());
            NativeAdBase.Image adIcon = t.getAdIcon();
            if (adIcon != null) {
                imageDataImpl.setRemoteUrl(adIcon.getUrl());
            }
            setIcon(imageDataImpl);
            ImageDataImpl imageDataImpl2 = new ImageDataImpl();
            NativeAdBase.Image adCoverImage = t.getAdCoverImage();
            if (adCoverImage != null) {
                imageDataImpl2.setRemoteUrl(adCoverImage.getUrl());
            }
            setMainImage(imageDataImpl2);
        }

        public View createProviderView(Context context) {
            if (this.nativeAdBase == null) {
                return null;
            }
            AdOptionsView adOptionsView = new AdOptionsView(context, this.nativeAdBase, (NativeAdLayout) null);
            adOptionsView.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            return adOptionsView;
        }

        public void unregisterNative() {
            T t = this.nativeAdBase;
            if (t != null) {
                t.unregisterView();
            }
        }

        public void destroy() {
            T t = this.nativeAdBase;
            if (t != null) {
                t.destroy();
                this.nativeAdBase = null;
            }
        }
    }

    private static final class BannerAdapter extends BaseAdapter<NativeBannerAd> {
        public BannerAdapter(NativeBannerAd nativeBannerAd) {
            super(nativeBannerAd);
        }

        public void registerNative(ViewGroup viewGroup, ImageView imageView, NativeMediaView nativeMediaView, Set<View> set) {
            super.registerNative(viewGroup, imageView, nativeMediaView, set);
            if (this.nativeAdBase != null) {
                ((NativeBannerAd) this.nativeAdBase).registerViewForInteraction((View) viewGroup, imageView, (List<View>) set != null ? new ArrayList(set) : null);
            }
        }
    }

    private static final class MediaViewAdapter extends BaseAdapter<NativeAd> {
        private MediaView mediaView;

        public MediaViewAdapter(NativeAd nativeAd) {
            super(nativeAd);
        }

        public boolean configureMediaView(NativeMediaView nativeMediaView) {
            if (this.mediaView == null) {
                MediaView mediaView2 = new MediaView(nativeMediaView.getContext());
                this.mediaView = mediaView2;
                mediaView2.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
            }
            ViewHelper.removeViewFromParent(this.mediaView);
            nativeMediaView.addView(this.mediaView);
            return true;
        }

        public void registerNative(ViewGroup viewGroup, ImageView imageView, NativeMediaView nativeMediaView, Set<View> set) {
            super.registerNative(viewGroup, imageView, nativeMediaView, set);
            if (this.nativeAdBase != null) {
                ((NativeAd) this.nativeAdBase).registerViewForInteraction((View) viewGroup, this.mediaView, imageView, (List<View>) set != null ? new ArrayList(set) : null);
            }
        }

        public boolean hasVideo() {
            if (this.nativeAdBase != null && ((NativeAd) this.nativeAdBase).getAdCreativeType() == NativeAd.AdCreativeType.VIDEO) {
                return true;
            }
            return false;
        }

        public void destroy() {
            super.destroy();
            MediaView mediaView2 = this.mediaView;
            if (mediaView2 != null) {
                mediaView2.destroy();
                this.mediaView = null;
            }
        }
    }
}
