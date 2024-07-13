package io.bidmachine.nativead;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public interface NativeMediaPublicData {
    Drawable getIconDrawable();

    Uri getIconUri();

    Drawable getImageDrawable();

    Uri getImageUri();

    Uri getVideoUri();
}
