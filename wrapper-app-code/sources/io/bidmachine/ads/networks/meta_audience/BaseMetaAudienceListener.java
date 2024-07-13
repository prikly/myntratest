package io.bidmachine.ads.networks.meta_audience;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AdListener;
import io.bidmachine.unified.UnifiedAdCallback;
import io.bidmachine.utils.BMError;

abstract class BaseMetaAudienceListener<UnifiedAdCallbackType extends UnifiedAdCallback> implements AdListener {
    private final UnifiedAdCallbackType callback;

    BaseMetaAudienceListener(UnifiedAdCallbackType unifiedadcallbacktype) {
        this.callback = unifiedadcallbacktype;
    }

    /* access modifiers changed from: package-private */
    public UnifiedAdCallbackType getCallback() {
        return this.callback;
    }

    public void onError(Ad ad, AdError adError) {
        this.callback.onAdLoadFailed(mapError(adError));
        ad.destroy();
    }

    public void onAdClicked(Ad ad) {
        this.callback.onAdClicked();
    }

    private static BMError mapError(AdError adError) {
        if (adError != null) {
            int errorCode = adError.getErrorCode();
            if (errorCode == 2009) {
                return BMError.TimeoutError;
            }
            if (errorCode != 3001) {
                switch (errorCode) {
                    case 1000:
                        return BMError.NoConnection;
                    case 1001:
                    case 1002:
                        break;
                    default:
                        switch (errorCode) {
                            case 2000:
                            case 2001:
                            case 2002:
                                break;
                        }
                }
            }
            return BMError.noFill();
        }
        return BMError.internal("Unknown error");
    }
}
