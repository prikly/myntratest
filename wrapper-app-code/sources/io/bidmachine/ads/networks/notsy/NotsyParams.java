package io.bidmachine.ads.networks.notsy;

import android.text.TextUtils;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;

class NotsyParams extends UnifiedParams {
    final String adUnitId;
    final String price;
    final String score;

    NotsyParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.adUnitId = unifiedMediationParams.getString("ad_unit_id");
        this.score = unifiedMediationParams.getString("score");
        this.price = unifiedMediationParams.getString(InAppPurchaseMetaData.KEY_PRICE);
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.adUnitId)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("ad_unit_id"));
            return false;
        } else if (TextUtils.isEmpty(this.score)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("score"));
            return false;
        } else if (!TextUtils.isEmpty(this.price)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(InAppPurchaseMetaData.KEY_PRICE));
            return false;
        }
    }
}
