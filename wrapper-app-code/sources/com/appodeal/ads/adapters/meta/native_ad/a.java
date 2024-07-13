package com.appodeal.ads.adapters.meta.native_ad;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.NativeAdView;
import com.appodeal.ads.NativeMediaView;
import com.appodeal.ads.adapters.meta.MetaNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedAdUtils;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdOptionsView;
import com.facebook.ads.MediaView;
import com.facebook.ads.NativeAd;
import com.facebook.ads.NativeAdBase;
import com.facebook.ads.NativeAdLayout;
import com.facebook.ads.NativeAdListener;
import com.facebook.ads.NativeBannerAd;

public final class a extends UnifiedNative<MetaNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public d f16265a;

    /* renamed from: com.appodeal.ads.adapters.meta.native_ad.a$a  reason: collision with other inner class name */
    public final class C0177a implements NativeAdListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedNativeCallback f16266a;

        public C0177a(UnifiedNativeCallback unifiedNativeCallback) {
            this.f16266a = unifiedNativeCallback;
        }

        public final void onAdClicked(Ad ad) {
            this.f16266a.onAdClicked();
        }

        public final void onAdLoaded(Ad ad) {
            a aVar;
            d bVar;
            try {
                NativeAdBase nativeAdBase = (NativeAdBase) ad;
                String a2 = a.a(a.this, nativeAdBase.getAdIcon());
                String a3 = a.a(a.this, nativeAdBase.getAdCoverImage());
                if (nativeAdBase instanceof NativeBannerAd) {
                    aVar = a.this;
                    bVar = new c((NativeBannerAd) nativeAdBase, a3, a2);
                } else if (nativeAdBase instanceof NativeAd) {
                    aVar = a.this;
                    bVar = new b((NativeAd) nativeAdBase, a3, a2);
                } else {
                    this.f16266a.onAdLoadFailed(LoadingError.NoFill);
                    return;
                }
                aVar.f16265a = bVar;
                this.f16266a.onAdLoaded(a.this.f16265a);
            } catch (Exception unused) {
                this.f16266a.onAdLoadFailed(LoadingError.InternalError);
            }
        }

        public final void onError(Ad ad, AdError adError) {
            if (ad != null) {
                ad.destroy();
            }
            if (adError != null) {
                this.f16266a.printError(adError.getErrorMessage(), Integer.valueOf(adError.getErrorCode()));
            }
            this.f16266a.onAdLoadFailed(MetaNetwork.mapError(adError));
        }

        public final void onLoggingImpression(Ad ad) {
        }

        public final void onMediaDownloaded(Ad ad) {
        }
    }

    public static class b extends d<NativeAd> {

        /* renamed from: d  reason: collision with root package name */
        public MediaView f16268d;

        public b(NativeAd nativeAd, String str, String str2) {
            super(nativeAd, str, str2);
        }

        public final boolean containsVideo() {
            return hasVideo();
        }

        public final boolean hasVideo() {
            return ((NativeAd) this.f16269a).getAdCreativeType() == NativeAd.AdCreativeType.VIDEO;
        }

        public final boolean onConfigureMediaView(NativeMediaView nativeMediaView) {
            this.f16268d = new MediaView(nativeMediaView.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f16268d, layoutParams);
            return true;
        }

        public final void onDestroy() {
            super.onDestroy();
            MediaView mediaView = this.f16268d;
            if (mediaView != null) {
                mediaView.destroy();
                this.f16268d = null;
            }
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            ((NativeAd) this.f16269a).registerViewForInteraction((View) nativeAdView, this.f16268d, this.f16270b, nativeAdView.getClickableViews());
        }
    }

    public static class c extends d<NativeBannerAd> {
        public c(NativeBannerAd nativeBannerAd, String str, String str2) {
            super(nativeBannerAd, str, str2);
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            ((NativeBannerAd) this.f16269a).registerViewForInteraction((View) nativeAdView, this.f16270b, nativeAdView.getClickableViews());
        }
    }

    public static class d<T extends NativeAdBase> extends UnifiedNativeAd {

        /* renamed from: a  reason: collision with root package name */
        public final T f16269a;

        /* renamed from: b  reason: collision with root package name */
        public MediaView f16270b;

        /* renamed from: c  reason: collision with root package name */
        public NativeAdLayout f16271c;

        public d(T t, String str, String str2) {
            super(t.getAdvertiserName(), t.getAdBodyText(), t.getAdCallToAction(), str, str2);
            this.f16269a = t;
        }

        public final Float getRating() {
            NativeAdBase.Rating adStarRating = this.f16269a.getAdStarRating();
            return (adStarRating == null || adStarRating.getValue() == 0.0d) ? super.getRating() : Float.valueOf((float) adStarRating.getValue());
        }

        public final View obtainIconView(Context context) {
            if (this.f16270b == null) {
                this.f16270b = new MediaView(context);
            }
            return this.f16270b;
        }

        public final View obtainProviderView(Context context) {
            AdOptionsView adOptionsView = new AdOptionsView(context, this.f16269a, (NativeAdLayout) null);
            RelativeLayout relativeLayout = new RelativeLayout(context);
            relativeLayout.addView(adOptionsView, new RelativeLayout.LayoutParams(Math.round(UnifiedAdUtils.getScreenDensity(context) * 20.0f), Math.round(UnifiedAdUtils.getScreenDensity(context) * 20.0f)));
            return relativeLayout;
        }

        public final void onConfigure(NativeAdView nativeAdView) {
            super.onConfigure(nativeAdView);
            NativeAdLayout nativeAdLayout = new NativeAdLayout(nativeAdView.getContext());
            this.f16271c = nativeAdLayout;
            nativeAdView.configureContainer(nativeAdLayout);
        }

        public void onDestroy() {
            super.onDestroy();
            T t = this.f16269a;
            if (t != null) {
                t.destroy();
            }
            MediaView mediaView = this.f16270b;
            if (mediaView != null) {
                mediaView.destroy();
                this.f16270b = null;
            }
            if (this.f16271c != null) {
                this.f16271c = null;
            }
        }

        public void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
        }

        public final void onUnregisterForInteraction() {
            super.onUnregisterForInteraction();
            this.f16269a.unregisterView();
        }
    }

    public static String a(a aVar, NativeAdBase.Image image) {
        aVar.getClass();
        if (image == null) {
            return null;
        }
        return image.getUrl();
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) {
        NativeAdBase nativeAdBase;
        MetaNetwork.RequestParams requestParams = (MetaNetwork.RequestParams) obj;
        UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) unifiedAdCallback;
        Context applicationContext = contextProvider.getApplicationContext();
        if (((UnifiedNativeParams) unifiedAdParams).getMediaAssetType() == Native.MediaAssetType.ICON) {
            nativeAdBase = new NativeBannerAd(applicationContext, requestParams.metaKey);
        } else {
            nativeAdBase = new NativeAd(applicationContext, requestParams.metaKey);
        }
        nativeAdBase.loadAd(nativeAdBase.buildLoadAdConfig().withAdListener(new C0177a(unifiedNativeCallback)).withMediaCacheFlag(NativeAdBase.MediaCacheFlag.ALL).build());
    }

    public final void onDestroy() {
        d dVar = this.f16265a;
        if (dVar != null) {
            dVar.onDestroy();
            this.f16265a = null;
        }
    }
}
