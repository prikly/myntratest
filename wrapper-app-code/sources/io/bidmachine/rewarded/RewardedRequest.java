package io.bidmachine.rewarded;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdRequest;
import io.bidmachine.CustomParams;
import io.bidmachine.FullScreenAdRequest;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.NetworkConfig;
import io.bidmachine.PriceFloorParams;
import io.bidmachine.SessionAdParams;
import io.bidmachine.TargetingParams;
import io.bidmachine.models.RequestBuilder;
import java.util.List;

public final class RewardedRequest extends FullScreenAdRequest<RewardedRequest> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<RewardedRequest> {
    }

    private RewardedRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    /* access modifiers changed from: protected */
    public void onBuildPlacement(Placement.Builder builder) {
        super.onBuildPlacement(builder);
        builder.setReward(true);
    }

    public static final class Builder extends FullScreenAdRequest.FullScreenRequestBuilder<Builder, RewardedRequest> {
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

        /* access modifiers changed from: protected */
        public FullScreenAdRequestParameters createAdRequestParameters() {
            return new RewardedAdRequestParameters(this.adContentType);
        }

        /* access modifiers changed from: protected */
        public RewardedRequest build(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
            return new RewardedRequest(fullScreenAdRequestParameters);
        }
    }
}
