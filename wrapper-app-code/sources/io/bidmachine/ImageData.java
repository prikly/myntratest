package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface ImageData {
    Drawable getImage();

    Uri getLocalUri();

    String getRemoteUrl();
}
