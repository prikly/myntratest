package io.bidmachine.displays;

import com.explorestack.protobuf.Any;
import com.explorestack.protobuf.Message;
import com.explorestack.protobuf.adcom.Ad;
import com.explorestack.protobuf.adcom.NativeDataAssetType;
import com.explorestack.protobuf.adcom.NativeImageAssetType;
import com.explorestack.protobuf.adcom.Placement;
import com.explorestack.protobuf.adcom.SizeUnit;
import com.explorestack.protobuf.adcom.VideoCreativeType;
import io.bidmachine.AdContentType;
import io.bidmachine.AdsType;
import io.bidmachine.Constants;
import io.bidmachine.ContextProvider;
import io.bidmachine.MediaAssetType;
import io.bidmachine.NetworkAdUnit;
import io.bidmachine.NetworkConfig;
import io.bidmachine.models.AdObjectParams;
import io.bidmachine.unified.UnifiedNativeAdRequestParams;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class NativePlacementBuilder extends PlacementBuilder<UnifiedNativeAdRequestParams> {
    static final int CTA_ASSET_ID = 8;
    static final int DESC_ASSET_ID = 127;
    static final int ICON_ASSET_ID = 124;
    static final int IMAGE_ASSET_ID = 128;
    static final int RATING_ASSET_ID = 7;
    static final int TITLE_ASSET_ID = 123;
    static final int VIDEO_ASSET_ID = 4;
    private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ctaAsset;
    private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder descAsset;
    private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder ratingAsset;
    private static final Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder titleAsset;

    static {
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        titleAsset = newBuilder;
        newBuilder.setId(123);
        titleAsset.setReq(true);
        titleAsset.setTitle(Placement.DisplayPlacement.NativeFormat.AssetFormat.TitleAssetFormat.newBuilder().setLen(104).build());
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder2 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        descAsset = newBuilder2;
        newBuilder2.setId(DESC_ASSET_ID);
        descAsset.setReq(true);
        descAsset.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_DESC).build());
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder3 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        ctaAsset = newBuilder3;
        newBuilder3.setId(8);
        ctaAsset.setReq(true);
        ctaAsset.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_CTA_TEXT).build());
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder4 = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        ratingAsset = newBuilder4;
        newBuilder4.setId(7);
        ratingAsset.setReq(false);
        ratingAsset.setData(Placement.DisplayPlacement.NativeFormat.AssetFormat.DataAssetFormat.newBuilder().setType(NativeDataAssetType.NATIVE_DATA_ASSET_TYPE_RATING).build());
    }

    static Placement.DisplayPlacement.NativeFormat.AssetFormat createIconAsset(UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        newBuilder.setId(124);
        newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Icon));
        newBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_ICON_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
        return newBuilder.build();
    }

    static Placement.DisplayPlacement.NativeFormat.AssetFormat createImageAsset(UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        newBuilder.setId(128);
        newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Image));
        newBuilder.setImg(Placement.DisplayPlacement.NativeFormat.AssetFormat.ImageAssetFormat.newBuilder().setType(NativeImageAssetType.NATIVE_IMAGE_ASSET_TYPE_MAIN_IMAGE).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).build());
        return newBuilder.build();
    }

    static Placement.DisplayPlacement.NativeFormat.AssetFormat createVideoAsset(UnifiedNativeAdRequestParams unifiedNativeAdRequestParams) {
        Placement.DisplayPlacement.NativeFormat.AssetFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.AssetFormat.newBuilder();
        newBuilder.setId(4);
        newBuilder.setReq(unifiedNativeAdRequestParams.getAdRequestParameters().containsAssetType(MediaAssetType.Video));
        newBuilder.setVideo(Placement.VideoPlacement.newBuilder().setSkip(false).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_3_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_2_0).addCtype(VideoCreativeType.VIDEO_CREATIVE_TYPE_VAST_WRAPPER_3_0).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES)).setMinbitr(56).setMaxbitr(4096).setMindur(5).setMaxdur(30).setLinearValue(1).build());
        return newBuilder.build();
    }

    public NativePlacementBuilder() {
        super(AdContentType.All);
    }

    public Message.Builder createPlacement(ContextProvider contextProvider, UnifiedNativeAdRequestParams unifiedNativeAdRequestParams, AdsType adsType, Collection<NetworkConfig> collection, List<NetworkAdUnit> list, int i) throws Exception {
        Placement.DisplayPlacement.Builder addAllMime = Placement.DisplayPlacement.newBuilder().setInstl(false).setUnit(SizeUnit.SIZE_UNIT_DIPS).addAllMime(Arrays.asList(Constants.IMAGE_MIME_TYPES)).addAllMime(Arrays.asList(Constants.VIDEO_MIME_TYPES));
        Placement.DisplayPlacement.NativeFormat.Builder newBuilder = Placement.DisplayPlacement.NativeFormat.newBuilder();
        newBuilder.addAsset(titleAsset);
        newBuilder.addAsset(descAsset);
        newBuilder.addAsset(ctaAsset);
        newBuilder.addAsset(ratingAsset);
        newBuilder.addAsset(createIconAsset(unifiedNativeAdRequestParams));
        newBuilder.addAsset(createImageAsset(unifiedNativeAdRequestParams));
        newBuilder.addAsset(createVideoAsset(unifiedNativeAdRequestParams));
        addAllMime.setNativefmt(newBuilder);
        Message.Builder createHeaderBiddingPlacement = createHeaderBiddingPlacement(contextProvider, unifiedNativeAdRequestParams, adsType, collection, list, i);
        if (createHeaderBiddingPlacement != null) {
            addAllMime.addExtProto(Any.pack(createHeaderBiddingPlacement.build()));
        }
        return addAllMime;
    }

    public AdObjectParams createAdObjectParams(Ad ad) {
        AdObjectParams createHeaderBiddingAdObjectParams = createHeaderBiddingAdObjectParams(ad);
        return (createHeaderBiddingAdObjectParams != null || !ad.hasDisplay() || !ad.getDisplay().hasNative()) ? createHeaderBiddingAdObjectParams : new NativeAdObjectParams(ad);
    }
}
