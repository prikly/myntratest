package io.bidmachine.rewarded;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.utils.ProtoUtils;

public class RewardedAdRequestParameters extends FullScreenAdRequestParameters {
    public RewardedAdRequestParameters(AdContentType adContentType) {
        super(AdsType.Rewarded, adContentType);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isRewardedPlacement(placement);
    }
}
