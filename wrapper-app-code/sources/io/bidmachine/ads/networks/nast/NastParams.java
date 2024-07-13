package io.bidmachine.ads.networks.nast;

import android.text.TextUtils;
import io.bidmachine.MediaAssetType;
import io.bidmachine.nativead.NativeAdRequestParameters;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.unified.UnifiedMediationParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import io.bidmachine.unified.UnifiedParams;
import io.bidmachine.utils.BMError;
import io.bidmachine.utils.IabUtils;

public class NastParams extends UnifiedParams {
    final String callToAction;
    final String clickUrl;
    final String description;
    final String iconUrl;
    final String imageUrl;
    final float rating;
    final String title;
    final String videoAdm;
    final String videoUrl;

    NastParams(UnifiedMediationParams unifiedMediationParams) {
        super(unifiedMediationParams);
        this.title = unifiedMediationParams.getString("title");
        this.description = unifiedMediationParams.getString("description");
        this.callToAction = unifiedMediationParams.getString(IabUtils.KEY_CTA);
        this.rating = unifiedMediationParams.getFloat(IabUtils.KEY_RATING);
        this.iconUrl = unifiedMediationParams.getString(IabUtils.KEY_ICON_URL);
        this.imageUrl = unifiedMediationParams.getString(IabUtils.KEY_IMAGE_URL);
        this.videoUrl = unifiedMediationParams.getString(IabUtils.KEY_VIDEO_URL);
        this.videoAdm = unifiedMediationParams.getString(IabUtils.KEY_VIDEO_ADM);
        this.clickUrl = unifiedMediationParams.getString(IabUtils.KEY_CLICK_URL);
    }

    public boolean isValid(UnifiedAdCallback unifiedAdCallback) {
        if (TextUtils.isEmpty(this.title)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound("title"));
            return false;
        } else if (!TextUtils.isEmpty(this.callToAction)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_CTA));
            return false;
        }
    }

    /* access modifiers changed from: package-private */
    public boolean isValid(UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, UnifiedAdCallback unifiedAdCallback) {
        if (!isValid(unifiedAdCallback)) {
            return false;
        }
        NativeAdRequestParameters adRequestParameters = unifiedNativeAdRequestParams.getAdRequestParameters();
        if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Icon) && TextUtils.isEmpty(this.iconUrl)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_ICON_URL));
            return false;
        } else if (adRequestParameters.isValidateAssets() && adRequestParameters.containsAssetType(MediaAssetType.Image) && TextUtils.isEmpty(this.imageUrl)) {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(IabUtils.KEY_IMAGE_URL));
            return false;
        } else if (!adRequestParameters.isValidateAssets() || !adRequestParameters.containsAssetType(MediaAssetType.Video) || !TextUtils.isEmpty(this.videoAdm) || !TextUtils.isEmpty(this.videoUrl)) {
            return true;
        } else {
            unifiedAdCallback.onAdLoadFailed(BMError.notFound(String.format("%s or %s", new Object[]{IabUtils.KEY_VIDEO_ADM, IabUtils.KEY_VIDEO_URL})));
            return false;
        }
    }
}
