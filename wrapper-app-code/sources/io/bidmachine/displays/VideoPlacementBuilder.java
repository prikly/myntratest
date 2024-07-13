package io.bidmachine.displays;

import android.graphics.Point;
import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.ApiFramework;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.PlacementPosition;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import com.explorestack.protobuf.adcom.VideoPlacementType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.core.Utils;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedAdRequestParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class VideoPlacementBuilder<UnifiedAdRequestParamsType extends UnifiedAdRequestParams> extends PlacementBuilder<UnifiedAdRequestParamsType> implements ISizableDisplayPlacement<UnifiedAdRequestParamsType> {
    private final boolean canSkip;

    public VideoPlacementBuilder(boolean z) {
        super(AdContentType.Video);
        this.canSkip = z;
    }

    public Message.Builder createPlacement(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) throws Exception {
        Point size = getSize(contextProvider, unifiedadrequestparamstype);
        Placement.VideoPlacement.Builder linearValue = Placement.VideoPlacement.newBuilder().addApi(ApiFramework.API_FRAMEWORK_OMID_1_0).setSkip(this.canSkip).setUnit(SizeUnit.SIZE_UNIT_DIPS).setPos(PlacementPosition.PLACEMENT_POSITION_FULLSCREEN).setW(size.x).setH(size.y).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setPtype(VideoPlacementType.VIDEO_PLACEMENT_TYPE_INTERSTITIAL).setLinearValue(1);
        Message.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedadrequestparamstype, adsType, collection, list, i);
        if (createHeaderBiddingPlacement != null) {
            linearValue.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
        }
        return linearValue;
    }

    public Point getSize(ContextProvider contextProvider, UnifiedAdRequestParamsType unifiedadrequestparamstype) {
        return Utils.getScreenSize(contextProvider.getContext());
    }

    public AdObjectParams createAdObjectParams(Ad ad) {
        if (!ad.hasVideo()) {
            return null;
        }
        AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
        if (createHeaderBiddingAdObjectParams != null) {
            return createHeaderBiddingAdObjectParams;
        }
        Ad.Video video = ad.getVideo();
        VideoAdObjectParams videoAdObjectParams = new VideoAdObjectParams(ad);
        videoAdObjectParams.setCreativeAdm(video.getAdm());
        return videoAdObjectParams;
    }
}
