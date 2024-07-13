package io.bidmachine.nativead;

import com.explorestack.protobuf.adcom.Placement;
import io.bidmachine.AdRequestParameters;
import io.bidmachine.AdsType;
import io.bidmachine.MediaAssetType;
import io.bidmachine.utils.ProtoUtils;
import java.util.List;

public class NativeAdRequestParameters extends AdRequestParameters {
    private final List<MediaAssetType> mediaAssetTypes;
    private boolean validateAssets = true;

    public NativeAdRequestParameters(List<MediaAssetType> list) {
        super(AdsType.Native);
        this.mediaAssetTypes = list;
    }

    public List<MediaAssetType> getMediaAssetTypes() {
        return this.mediaAssetTypes;
    }

    public boolean containsAssetType(MediaAssetType mediaAssetType) {
        return this.mediaAssetTypes.isEmpty() || this.mediaAssetTypes.contains(mediaAssetType) || this.mediaAssetTypes.contains(MediaAssetType.All);
    }

    public boolean isPlacementObjectValid(Placement placement) throws Throwable {
        return ProtoUtils.isNativePlacement(placement);
    }

    public boolean isParametersMatched(AdRequestParameters adRequestParameters) {
        return super.isParametersMatched(adRequestParameters) && (adRequestParameters instanceof NativeAdRequestParameters) && isParametersMatchedInternal((NativeAdRequestParameters) adRequestParameters);
    }

    public boolean isValidateAssets() {
        return this.validateAssets;
    }

    /* access modifiers changed from: package-private */
    public void setValidateAssets(boolean z) {
        this.validateAssets = z;
    }

    private boolean isParametersMatchedInternal(NativeAdRequestParameters nativeAdRequestParameters) {
        return MediaAssetType.isAll(nativeAdRequestParameters.mediaAssetTypes) || nativeAdRequestParameters.mediaAssetTypes.containsAll(this.mediaAssetTypes);
    }
}
