package io.bidmachine.interstitial;

import io.bidmachine.AdContentType;
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

public final class InterstitialRequest extends FullScreenAdRequest<InterstitialRequest> {

    public interface AdRequestListener extends AdRequest.AdRequestListener<InterstitialRequest> {
    }

    private InterstitialRequest(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
        super(fullScreenAdRequestParameters);
    }

    public static final class Builder extends FullScreenAdRequest.FullScreenRequestBuilder<Builder, InterstitialRequest> {
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

        public Builder setAdContentType(AdContentType adContentType) {
            return (Builder) super.setAdContentType(adContentType);
        }

        /* access modifiers changed from: protected */
        public FullScreenAdRequestParameters createAdRequestParameters() {
            return new InterstitialAdRequestParameters(this.adContentType);
        }

        /* access modifiers changed from: protected */
        public InterstitialRequest build(FullScreenAdRequestParameters fullScreenAdRequestParameters) {
            return new InterstitialRequest(fullScreenAdRequestParameters);
        }
    }
}
