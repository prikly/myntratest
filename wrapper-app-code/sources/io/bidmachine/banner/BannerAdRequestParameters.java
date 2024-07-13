package io.bidmachine.banner;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsType;
import io.bidmachine.utils.ProtoUtils;

public class BannerAdRequestParameters extends AdRequestParameters {
    private final BannerSize bannerSize;

    public BannerAdRequestParameters(BannerSize bannerSize2) {
        super(AdsType.Banner);
        this.bannerSize = bannerSize2;
    }

    public BannerSize getBannerSize() {
        return this.bannerSize;
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isBannerPlacement(placement, this.bannerSize);
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof BannerAdRequestParameters) && isParametersMatchedInternal((BannerAdRequestParameters) adRequestParameters);
    }

    private boolean isParametersMatchedInternal(BannerAdRequestParameters bannerAdRequestParameters) {
        return this.bannerSize == bannerAdRequestParameters.bannerSize;
    }
}
