package io.bidmachine.ads.networks.vast;

import android.text.TextUtils;
import com.explorestack.iab.CacheControl;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;

class VastParams extends UnifiedParams {
    final CacheControl cacheControl;
    final int companionSkipOffset;
    final String creativeAdm;
    final boolean omsdkEnabled;
    final float placeholderTimeoutSec;
    final int skipOffset;
    final boolean useNativeClose;

    VastParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.creativeAdm = unifiedMediationParams.getString(IabUtils.KEY_CREATIVE_ADM);
        this.cacheControl = IabUtils.toCacheControl(unifiedMediationParams.getObject(IabUtils.KEY_CACHE_CONTROL));
        this.placeholderTimeoutSec = unifiedMediationParams.getFloat(IabUtils.KEY_PLACEHOLDER_TIMEOUT_SEC);
        this.skipOffset = unifiedMediationParams.getInt(IabUtils.KEY_SKIP_OFFSET);
        this.companionSkipOffset = unifiedMediationParams.getInt(IabUtils.KEY_COMPANION_SKIP_OFFSET);
        this.useNativeClose = unifiedMediationParams.getBool(IabUtils.KEY_USE_NATIVE_CLOSE);
        this.omsdkEnabled = unifiedMediationParams.getBool(IabUtils.KEY_OM_SDK_ENABLED, true);
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (!TextUtils.isEmpty(this.creativeAdm)) {
            return true;
        }
        unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_CREATIVE_ADM));
        return false;
    }
}
