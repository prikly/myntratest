package io.bidmachine;

import android.os.Build;
import io.bidmachine.unified.UnifiedAdRequestParams;
import io.bidmachine.utils.BMError;

public abstract class HeaderBiddingAdapter extends NetworkAdapter {
    /* access modifiers changed from: protected */
    public abstract void onCollectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable;

    protected HeaderBiddingAdapter(String str, String str2, String str3, int i, AdsType[] adsTypeArr) {
        super(str, str2, str3, i, adsTypeArr);
    }

    public final void collectHeaderBiddingParams(ContextProvider contextProvider, UnifiedAdRequestParams unifiedAdRequestParams, NetworkAdUnit networkAdUnit, HeaderBiddingAdRequestParams headerBiddingAdRequestParams, HeaderBiddingCollectParamsCallback headerBiddingCollectParamsCallback) throws Throwable {
        if (Build.VERSION.SDK_INT < this.adapterMinDeviceApiVersion) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapter(String.format("minSdkVersion is %s", new Object[]{Integer.valueOf(this.adapterMinDeviceApiVersion)})));
        } else if (!isInitialized(contextProvider)) {
            headerBiddingCollectParamsCallback.onCollectFail(BMError.adapterNotInitialized());
        } else {
            onCollectHeaderBiddingParams(contextProvider, unifiedAdRequestParams, networkAdUnit, headerBiddingAdRequestParams, headerBiddingCollectParamsCallback);
        }
    }
}
