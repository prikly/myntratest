package com.appodeal.ads.unified.vast;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import com.appodeal.ads.modules.common.internal.context.ContextProvider;
import com.appodeal.ads.unified.UnifiedFullscreenAd;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.explorestack.iab.CacheControl;
import com.explorestack.iab.vast.VastRequest;
import com.explorestack.iab.vast.VideoType;

class UnifiedVastUtils {

    public interface UnifiedFullscreenVast<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback> {
        UnifiedVastFullscreenListener<UnifiedAdCallbackType> createListener(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);

        VideoType getVideoType();

        void loadVast(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype);

        void performVastRequest(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype, String str);
    }

    public static class UnifiedVastFullscreenAd<UnifiedAdParamsType extends UnifiedFullscreenAdParams, UnifiedAdCallbackType extends UnifiedFullscreenAdCallback, NetworkRequestParams> extends UnifiedFullscreenAd<UnifiedAdParamsType, UnifiedAdCallbackType, NetworkRequestParams> {
        private final UnifiedFullscreenVast<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedVastAd;
        private UnifiedVastFullscreenListener<UnifiedAdCallbackType> vastListener;
        public VastRequest vastRequest;

        public UnifiedVastFullscreenAd(UnifiedFullscreenVast<UnifiedAdParamsType, UnifiedAdCallbackType> unifiedFullscreenVast) {
            this.unifiedVastAd = unifiedFullscreenVast;
        }

        public void load(ContextProvider contextProvider, UnifiedAdParamsType unifiedadparamstype, NetworkRequestParams networkrequestparams, UnifiedAdCallbackType unifiedadcallbacktype) {
            UnifiedVastNetworkParams unifiedVastNetworkParams = (UnifiedVastNetworkParams) networkrequestparams;
            Context applicationContext = contextProvider.getApplicationContext();
            if (UnifiedVastUtils.isValidAdm(unifiedVastNetworkParams.adm)) {
                loadVast(applicationContext, unifiedadparamstype, unifiedVastNetworkParams, unifiedadcallbacktype);
                return;
            }
            this.unifiedVastAd.performVastRequest(applicationContext, unifiedadparamstype, unifiedVastNetworkParams, unifiedadcallbacktype, unifiedVastNetworkParams.vastUrl);
        }

        public void loadVast(Context context, UnifiedAdParamsType unifiedadparamstype, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedAdCallbackType unifiedadcallbacktype) {
            this.vastListener = this.unifiedVastAd.createListener(context, unifiedadparamstype, unifiedVastNetworkParams, unifiedadcallbacktype);
            VastRequest access$100 = UnifiedVastUtils.createVastRequest(unifiedadparamstype, unifiedVastNetworkParams, unifiedVastNetworkParams.vastUrl);
            this.vastRequest = access$100;
            access$100.loadVideoWithData(context, unifiedVastNetworkParams.adm, this.vastListener);
        }

        public void onDestroy() {
            if (this.vastRequest != null) {
                this.vastRequest = null;
            }
        }

        public void show(Activity activity, UnifiedAdCallbackType unifiedadcallbacktype) {
            VastRequest vastRequest2 = this.vastRequest;
            if (vastRequest2 == null || !vastRequest2.checkFile()) {
                unifiedadcallbacktype.onAdShowFailed();
            } else {
                this.vastRequest.display(activity, this.unifiedVastAd.getVideoType(), this.vastListener);
            }
        }
    }

    /* access modifiers changed from: private */
    public static VastRequest createVastRequest(UnifiedFullscreenAdParams unifiedFullscreenAdParams, UnifiedVastNetworkParams unifiedVastNetworkParams, String str) {
        VastRequest.Builder addExtra = VastRequest.newBuilder().setCacheControl(CacheControl.FullLoad).setXmlUrl(str).setCompanionCloseTime(unifiedVastNetworkParams.closeTime).setAutoClose(unifiedVastNetworkParams.autoClose).addExtra("segment_id", unifiedFullscreenAdParams.obtainSegmentId()).addExtra("placement_id", unifiedFullscreenAdParams.obtainPlacementId());
        if (unifiedFullscreenAdParams instanceof UnifiedRewardedParams) {
            addExtra.setMaxDuration(((UnifiedRewardedParams) unifiedFullscreenAdParams).getMaxDuration());
        }
        return addExtra.build();
    }

    /* access modifiers changed from: private */
    public static boolean isValidAdm(String str) {
        return !TextUtils.isEmpty(str) && TextUtils.getTrimmedLength(str) > 0;
    }
}
