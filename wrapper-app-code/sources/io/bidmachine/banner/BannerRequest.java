package io.bidmachine.banner;

import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.UnifiedAdRequestParamsImpl;
import io.bidmachine.models.DataRestrictions;
import io.bidmachine.models.IBannerRequestBuilder;
import io.bidmachine.models.RequestBuilder;
import io.bidmachine.unified.UnifiedBannerAdRequestParams;
import java.util.List;

public final class BannerRequest extends AdRequest<BannerRequest, BannerAdRequestParameters, UnifiedBannerAdRequestParams> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<BannerRequest> {
    }

    private BannerRequest(BannerAdRequestParameters bannerAdRequestParameters) {
        super(bannerAdRequestParameters);
    }

    public BannerSize getSize() {
        return ((BannerAdRequestParameters) getAdRequestParameters()).getBannerSize();
    }

    /* access modifiers changed from: protected */
    public UnifiedBannerAdRequestParams createUnifiedAdRequestParams(BannerAdRequestParameters bannerAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
        return new BannerUnifiedAdRequestParams(bannerAdRequestParameters, targetingParams, dataRestrictions);
    }

    public static final class Builder extends AdRequest.AdRequestBuilderImpl<Builder, BannerRequest, BannerAdRequestParameters> implements IBannerRequestBuilder<Builder> {
        private BannerSize bannerSize;

        public /* bridge */ /* synthetic */ AdRequest build() {
            return super.build();
        }

        public /* bridge */ /* synthetic */ RequestBuilder setBidPayload(String str) {
            return super.setBidPayload(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setCustomParams(CustomParams customParams) {
            return super.setCustomParams(customParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setListener(AdRequest.AdRequestListener adRequestListener) {
            return super.setListener(adRequestListener);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setLoadingTimeOut(Integer num) {
            return super.setLoadingTimeOut(num);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(String str) {
            return super.setNetworks(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setNetworks(List list) {
            return super.setNetworks((List<NetworkConfig>) list);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setPlacementId(String str) {
            return super.setPlacementId(str);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setPriceFloorParams(PriceFloorParams priceFloorParams) {
            return super.setPriceFloorParams(priceFloorParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setSessionAdParams(SessionAdParams sessionAdParams) {
            return super.setSessionAdParams(sessionAdParams);
        }

        public /* bridge */ /* synthetic */ RequestBuilder setTargetingParams(TargetingParams targetingParams) {
            return super.setTargetingParams(targetingParams);
        }

        public Builder setSize(BannerSize bannerSize2) {
            this.bannerSize = bannerSize2;
            return this;
        }

        /* access modifiers changed from: protected */
        public BannerAdRequestParameters createAdRequestParameters() {
            BannerSize bannerSize2 = this.bannerSize;
            if (bannerSize2 != null) {
                return new BannerAdRequestParameters(bannerSize2);
            }
            throw new IllegalArgumentException("BannerSize can't be null");
        }

        /* access modifiers changed from: protected */
        public BannerRequest build(BannerAdRequestParameters bannerAdRequestParameters) {
            return new BannerRequest(bannerAdRequestParameters);
        }
    }

    private static class BannerUnifiedAdRequestParams extends UnifiedAdRequestParamsImpl<BannerAdRequestParameters> implements UnifiedBannerAdRequestParams {
        public /* bridge */ /* synthetic */ BannerAdRequestParameters getAdRequestParameters() {
            return (BannerAdRequestParameters) super.getAdRequestParameters();
        }

        private BannerUnifiedAdRequestParams(BannerAdRequestParameters bannerAdRequestParameters, TargetingParams targetingParams, DataRestrictions dataRestrictions) {
            super(bannerAdRequestParameters, targetingParams, dataRestrictions);
        }
    }
}
