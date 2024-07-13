package io.bidmachine.interstitial;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.utils.ProtoUtils;

public class InterstitialAdRequestParameters extends FullScreenAdRequestParameters {
    public InterstitialAdRequestParameters(AdContentType adContentType) {
        super(AdsType.Interstitial, adContentType);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isInterstitialPlacement(placement);
    }
}
