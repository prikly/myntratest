package io.bidmachine.models;

import io.bidmachine.MediaAssetType;
import io.bidmachine.models.INativeRequestBuilder;

public interface INativeRequestBuilder<SelfType extends INativeRequestBuilder> {
    SelfType setMediaAssetTypes(MediaAssetType... mediaAssetTypeArr);
}
