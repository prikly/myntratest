package com.appodeal.ads.unified.mraid;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedViewAd;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.mraid.MraidActivity;
import com.explorestack.iab.mraid.MraidInterstitial;
import com.explorestack.iab.mraid.MraidType;
import com.explorestack.iab.mraid.MraidView;

class UnifiedMraidUtils {

    public interface UnifiedFullscreenMraid<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback> extends UnifiedMraid<UnifiedAdParamsType, UnifiedAdCallbackType> {
        UnifiedMraidFullscreenListener<UnifiedAdCallbackType> createListener(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);

        MraidType getMraidType();
    }

    public interface UnifiedMraid<UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback> {
        void loadMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);

        void requestMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, String str);
    }

    public interface UnifiedMraidAd<UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback> {
        void loadMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);

        void performMraidRequest(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, String str);
    }

    public static class UnifiedMraidFullscreenAd<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback, NetworkRequestParams> extends UnifiedFullscreenAd<UnifiedAdParamsType, UnifiedAdCallbackType, NetworkRequestParams> implements UnifiedMraidAd<UnifiedAdParamsType, UnifiedAdCallbackType> {
        private MraidInterstitial mraidInterstitial;
        private final UnifiedFullscreenMraid<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedMraidViewAd;

        public UnifiedMraidFullscreenAd(UnifiedFullscreenMraid<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedFullscreenMraid) {
            this.unifiedMraidViewAd = unifiedFullscreenMraid;
        }

        public void load(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, NetworkRequestParams networkrequestparams, UnifiedAdCallbackType unifiedadcallbacktype) {
            UnifiedMraidUtils.performLoadMraid(contextProvider.getApplicationContext(), unifiedadparamstype, (UnifiedMraidNetworkParams) networkrequestparams, unifiedadcallbacktype, this);
        }

        public void loadMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype) {
            if (!UnifiedMraidUtils.isValidAdm(unifiedMraidNetworkParams.adm)) {
                unifiedadcallbacktype.onAdLoadFailed(LoadingError.IncorrectAdunit);
                return;
            }
            MraidInterstitial createMraidInterstitial = UnifiedMraidUtils.createMraidInterstitial(context, unifiedMraidNetworkParams, this.unifiedMraidViewAd.createListener(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype));
            this.mraidInterstitial = createMraidInterstitial;
            createMraidInterstitial.load(unifiedMraidNetworkParams.adm);
        }

        public void onDestroy() {
            MraidInterstitial mraidInterstitial2 = this.mraidInterstitial;
            if (mraidInterstitial2 != null) {
                mraidInterstitial2.destroy();
            }
        }

        public void performMraidRequest(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, String str) {
            this.unifiedMraidViewAd.requestMraid(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype, str);
        }

        public void show(Activity activity, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback) {
            MraidActivity.show(activity, this.mraidInterstitial, this.unifiedMraidViewAd.getMraidType());
        }
    }

    public static class UnifiedMraidViewAd<UnifiedAdParamsType extends UnifiedViewAdParams, UnifiedAdCallbackType extends UnifiedViewAdCallback, NetworkRequestParams> extends UnifiedViewAd<UnifiedAdParamsType, UnifiedAdCallbackType, NetworkRequestParams> implements UnifiedMraidAd<UnifiedAdParamsType, UnifiedAdCallbackType> {
        private MraidView mraidView;
        private final UnifiedViewMraid<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedMraidViewAd;

        public UnifiedMraidViewAd(UnifiedViewMraid<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedViewMraid) {
            this.unifiedMraidViewAd = unifiedViewMraid;
        }

        public void load(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, NetworkRequestParams networkrequestparams, UnifiedAdCallbackType unifiedadcallbacktype) {
            UnifiedMraidUtils.performLoadMraid(contextProvider.getApplicationContext(), unifiedadparamstype, (UnifiedMraidNetworkParams) networkrequestparams, unifiedadcallbacktype, this);
        }

        public void loadMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype) {
            if (!UnifiedMraidUtils.isValidAdm(unifiedMraidNetworkParams.adm)) {
                unifiedadcallbacktype.onAdLoadFailed(LoadingError.IncorrectAdunit);
                return;
            }
            MraidView createMraid = UnifiedMraidUtils.createMraid(context, unifiedMraidNetworkParams, this.unifiedMraidViewAd.createListener(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype));
            this.mraidView = createMraid;
            createMraid.load(unifiedMraidNetworkParams.adm);
        }

        public void onDestroy() {
            MraidView mraidView2 = this.mraidView;
            if (mraidView2 != null) {
                mraidView2.destroy();
                this.mraidView = null;
            }
        }

        public void onPrepareToShow(Activity activity, UnifiedAdParamsType unifiedadparamstype) {
            super.onPrepareToShow(activity, unifiedadparamstype);
            MraidView mraidView2 = this.mraidView;
            if (mraidView2 != null) {
                mraidView2.show(activity);
            }
        }

        public void performMraidRequest(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, String str) {
            this.unifiedMraidViewAd.requestMraid(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype, str);
        }
    }

    public interface UnifiedViewMraid<UnifiedAdParamsType extends UnifiedViewAdParams, UnifiedAdCallbackType extends UnifiedViewAdCallback> extends UnifiedMraid<UnifiedAdParamsType, UnifiedAdCallbackType> {
        UnifiedMraidViewListener<UnifiedAdCallbackType> createListener(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);
    }

    public static MraidView createMraid(Context context, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedMraidViewListener<?> unifiedMraidViewListener) {
        return new MraidView.Builder().setBaseUrl(unifiedMraidNetworkParams.baseUrl).setCacheControl(getCacheControlByPreload(unifiedMraidNetworkParams.preload)).setIsTag(unifiedMraidNetworkParams.isTag).setListener(unifiedMraidViewListener).setPageFinishedScript(unifiedMraidNetworkParams.pageFinishedScript).build(context);
    }

    public static MraidInterstitial createMraidInterstitial(Context context, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedMraidFullscreenListener<?> unifiedMraidFullscreenListener) {
        return MraidInterstitial.newBuilder().setBaseUrl(unifiedMraidNetworkParams.baseUrl).setCacheControl(getCacheControlByPreload(unifiedMraidNetworkParams.preload)).setIsTag(unifiedMraidNetworkParams.isTag).setListener(unifiedMraidFullscreenListener).setCloseTime((float) unifiedMraidNetworkParams.closeTime).setPageFinishedScript(unifiedMraidNetworkParams.pageFinishedScript).build(context);
    }

    private static CacheControl getCacheControlByPreload(boolean z) {
        return z ? CacheControl.FullLoad : CacheControl.Stream;
    }

    public static boolean isValidAdm(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0;
    }

    /* access modifiers changed from: private */
    public static <UnifiedAdParamsType extends UnifiedAdParams, UnifiedAdCallbackType extends UnifiedAdCallback> void performLoadMraid(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, UnifiedMraidAd<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedMraidAd) {
        if (unifiedMraidNetworkParams != null) {
            if (isValidAdm(unifiedMraidNetworkParams.adm)) {
                unifiedMraidAd.loadMraid(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype);
                return;
            } else if (!TextUtils.isEmpty(unifiedMraidNetworkParams.adUrl) && TextUtils.getTrimmedLength(unifiedMraidNetworkParams.adUrl) > 0) {
                unifiedMraidAd.performMraidRequest(context, unifiedadparamstype, unifiedMraidNetworkParams, unifiedadcallbacktype, unifiedMraidNetworkParams.adUrl);
                return;
            }
        }
        unifiedadcallbacktype.onAdLoadFailed(LoadingError.IncorrectAdunit);
    }
}
