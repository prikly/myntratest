package io.bidmachine.nativead;

import io.bidmachine.ImageData;

public interface NativePublicData {
    String getCallToAction();

    String getDescription();

    ImageData getIcon();

    ImageData getMainImage();

    float getRating();

    String getTitle();

    boolean hasVideo();
}
