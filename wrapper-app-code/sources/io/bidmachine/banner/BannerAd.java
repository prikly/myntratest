package io.bidmachine.banner;

import android.content.Context;
import io.bidmachine.AdListener;
import io.bidmachine.AdProcessCallback;
import io.bidmachine.AdsType;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdapter;
import io.bidmachine.ViewAd;
import io.bidmachine.ViewAdObject;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedBannerAd;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;

final class BannerAd extends ViewAd<BannerAd, BannerRequest, ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams>, UnifiedBannerAdRequestParams, AdListener<BannerAd>> {
    BannerAd(Context context) {
        super(context, AdsType.Banner);
    }

    /* access modifiers changed from: protected */
    public ViewAdObject<BannerRequest, UnifiedBannerAd, UnifiedBannerAdRequestParams> createAdObject(ContextProvider contextProvider, BannerRequest bannerRequest, NetworkAdapter networkAdapter, AdObjectParams adObjectParams, AdProcessCallback adProcessCallback) {
        UnifiedBannerAd createBanner = networkAdapter.createBanner();
        if (createBanner == null) {
            return null;
        }
        ViewAdObject viewAdObject = new ViewAdObject(contextProvider, adProcessCallback, bannerRequest, adObjectParams, createBanner);
        BannerSize size = bannerRequest.getSize();
        viewAdObject.setWidth(size.width);
        viewAdObject.setHeight(size.height);
        return viewAdObject;
    }
}
