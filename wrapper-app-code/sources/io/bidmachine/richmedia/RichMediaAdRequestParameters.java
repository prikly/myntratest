package io.bidmachine.richmedia;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.FullScreenAdRequestParameters;
import io.bidmachine.utils.ProtoUtils;

public class RichMediaAdRequestParameters extends FullScreenAdRequestParameters {
    public RichMediaAdRequestParameters() {
        super(AdsType.RichMedia, AdContentType.Video);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isVideoPlacement(placement);
    }
}
