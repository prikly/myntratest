package io.bidmachine;

import android.content.Context;
import android.view.ViewGroup;
import io.bidmachine.AdListener;
import io.bidmachine.AdRequest;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdRequestParams;

public abstract class ViewAd<AdType extends ViewAd<AdType, AdRequestType, AdObjectType, UnifiedAdRequestParamsType, AdListenerType>, AdRequestType extends AdRequest<AdRequestType, ?, UnifiedAdRequestParamsType>, AdObjectType extends ViewAdObject<AdRequestType, ?, UnifiedAdRequestParamsType>, UnifiedAdRequestParamsType extends UnifiedAdRequestParams, AdListenerType extends AdListener<AdType>> extends BidMachineAd<AdType, AdRequestType, AdObjectType, AdObjectParams, UnifiedAdRequestParamsType, AdListenerType> {
    protected ViewAd(Context context, AdsType adsType) {
        super(context, adsType);
    }

    /* access modifiers changed from: package-private */
    public void show(ViewGroup viewGroup) {
        ViewAdObject viewAdObject = (ViewAdObject) prepareShow();
        if (viewAdObject != null) {
            viewAdObject.show(viewGroup);
        }
    }
}
