package com.appodeal.ads.adapters.bidmachine.native_ad;

import android.widget.RelativeLayout;
import com.appodeal.ads.Native;
import com.appodeal.ads.NativeAdView;
import com.appodeal.ads.adapters.bidmachine.BidMachineNetwork;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedNative;
import com.appodeal.ads.unified.UnifiedNativeAd;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.UnifiedNativeParams;
import io.bidmachine.MediaAssetType;
import io.bidmachine.nativead.NativeAd;
import io.bidmachine.nativead.NativeListener;
import io.bidmachine.nativead.NativeRequest;
import io.bidmachine.nativead.view.NativeAdContentLayout;
import io.bidmachine.nativead.view.NativeMediaView;
import io.bidmachine.utils.BMError;
import java.util.ArrayList;

/* compiled from: BidMachineNative */
public final class a extends UnifiedNative<BidMachineNetwork.RequestParams> {

    /* renamed from: a  reason: collision with root package name */
    public NativeRequest f16239a;

    /* renamed from: b  reason: collision with root package name */
    public NativeAd f16240b;

    /* renamed from: com.appodeal.ads.adapters.bidmachine.native_ad.a$a  reason: collision with other inner class name */
    /* compiled from: BidMachineNative */
    public static class C0170a extends UnifiedNativeAd {

        /* renamed from: a  reason: collision with root package name */
        public final NativeAd f16241a;

        /* renamed from: b  reason: collision with root package name */
        public NativeAdContentLayout f16242b;

        /* renamed from: c  reason: collision with root package name */
        public NativeMediaView f16243c;

        /* JADX INFO: super call moved to the top of the method (can break code semantics) */
        public C0170a(NativeAd nativeAd) {
            super(nativeAd.getTitle(), nativeAd.getDescription(), nativeAd.getCallToAction(), nativeAd.getMainImage() != null ? nativeAd.getMainImage().getRemoteUrl() : null, nativeAd.getIcon() != null ? nativeAd.getIcon().getRemoteUrl() : null, nativeAd.getRating() != 0.0f ? Float.valueOf(nativeAd.getRating()) : null);
            this.f16241a = nativeAd;
        }

        public final boolean containsVideo() {
            return this.f16241a.hasVideo();
        }

        public final boolean hasVideo() {
            return this.f16241a.hasVideo();
        }

        public final void onConfigure(NativeAdView nativeAdView) {
            super.onConfigure(nativeAdView);
            NativeAdContentLayout nativeAdContentLayout = new NativeAdContentLayout(nativeAdView.getContext());
            this.f16242b = nativeAdContentLayout;
            nativeAdContentLayout.setTitleView(nativeAdView.getTitleView());
            this.f16242b.setDescriptionView(nativeAdView.getDescriptionView());
            this.f16242b.setIconView(nativeAdView.getNativeIconView());
            this.f16242b.setCallToActionView(nativeAdView.getCallToActionView());
            this.f16242b.setRatingView(nativeAdView.getRatingView());
            this.f16242b.setProviderView(nativeAdView.getProviderView());
            this.f16242b.setMediaView(this.f16243c);
            nativeAdView.configureContainer(this.f16242b);
        }

        public final boolean onConfigureMediaView(com.appodeal.ads.NativeMediaView nativeMediaView) {
            this.f16243c = new NativeMediaView(nativeMediaView.getContext());
            RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
            layoutParams.addRule(13, -1);
            nativeMediaView.removeAllViews();
            nativeMediaView.addView(this.f16243c, layoutParams);
            return true;
        }

        public final void onDestroy() {
            super.onDestroy();
            this.f16241a.destroy();
            NativeAdContentLayout nativeAdContentLayout = this.f16242b;
            if (nativeAdContentLayout != null) {
                nativeAdContentLayout.destroy();
            }
        }

        public final void onRegisterForInteraction(NativeAdView nativeAdView) {
            super.onRegisterForInteraction(nativeAdView);
            NativeAdContentLayout nativeAdContentLayout = this.f16242b;
            if (nativeAdContentLayout != null) {
                nativeAdContentLayout.bind(this.f16241a);
                this.f16242b.registerViewForInteraction(this.f16241a);
            }
        }
    }

    /* compiled from: BidMachineNative */
    public static class b implements NativeListener {

        /* renamed from: a  reason: collision with root package name */
        public final UnifiedNativeCallback f16244a;

        public b(UnifiedNativeCallback unifiedNativeCallback) {
            this.f16244a = unifiedNativeCallback;
        }

        public final void onAdClicked(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f16244a.onAdClicked();
        }

        public final void onAdExpired(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f16244a.onAdExpired();
        }

        public final /* bridge */ /* synthetic */ void onAdImpression(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
        }

        public final void onAdLoadFailed(IAd iAd, BMError bMError) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f16244a.onAdLoadFailed(BidMachineNetwork.mapBidMachineError(bMError));
        }

        public final void onAdLoaded(IAd iAd) {
            NativeAd nativeAd = (NativeAd) iAd;
            this.f16244a.onAdInfoRequested(BidMachineNetwork.getRequestedAdInfo(nativeAd.getAuctionResult()));
            this.f16244a.onAdLoaded(new C0170a(nativeAd));
        }
    }

    public final void load(ContextProvider contextProvider, UnifiedAdParams unifiedAdParams, Object obj, UnifiedAdCallback unifiedAdCallback) throws Exception {
        UnifiedNativeParams unifiedNativeParams = (UnifiedNativeParams) unifiedAdParams;
        BidMachineNetwork.RequestParams requestParams = (BidMachineNetwork.RequestParams) obj;
        UnifiedNativeCallback unifiedNativeCallback = (UnifiedNativeCallback) unifiedAdCallback;
        ArrayList arrayList = new ArrayList();
        if (Native.NativeAdType.Video == unifiedNativeParams.getNativeAdType()) {
            arrayList.add(MediaAssetType.Video);
        }
        if (unifiedNativeParams.getMediaAssetType() == Native.MediaAssetType.ICON) {
            arrayList.add(MediaAssetType.Icon);
        } else if (unifiedNativeParams.getMediaAssetType() == Native.MediaAssetType.IMAGE) {
            arrayList.add(MediaAssetType.Image);
        } else {
            arrayList.add(MediaAssetType.Icon);
            arrayList.add(MediaAssetType.Image);
        }
        this.f16239a = (NativeRequest) ((NativeRequest.Builder) requestParams.prepareRequest(new NativeRequest.Builder())).setMediaAssetTypes((MediaAssetType[]) arrayList.toArray(new MediaAssetType[0])).build();
        this.f16240b = (NativeAd) ((NativeAd) new NativeAd(contextProvider.getApplicationContext()).setListener(new b(unifiedNativeCallback))).load(this.f16239a);
    }

    public final void onDestroy() {
        NativeRequest nativeRequest = this.f16239a;
        if (nativeRequest != null) {
            nativeRequest.destroy();
            this.f16239a = null;
        }
        NativeAd nativeAd = this.f16240b;
        if (nativeAd != null) {
            nativeAd.destroy();
            this.f16240b = null;
        }
    }

    public final void onMediationLoss(String str, double d2) {
        super.onMediationLoss(str, d2);
        NativeRequest nativeRequest = this.f16239a;
        if (nativeRequest != null) {
            nativeRequest.notifyMediationLoss(str, Double.valueOf(d2));
        }
    }

    public final void onMediationWin() {
        super.onMediationWin();
        NativeRequest nativeRequest = this.f16239a;
        if (nativeRequest != null) {
            nativeRequest.notifyMediationWin();
        }
    }
}
