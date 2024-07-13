package io.bidmachine;

import android.graphics.drawable.Drawable;
import android.net.Uri;

public class ImageDataImpl implements ImageData {
    private Drawable image;
    private Uri localUri;
    private String remoteUrl;

    public ImageDataImpl() {
    }

    public ImageDataImpl(String str) {
        this.remoteUrl = str;
    }

    public ImageDataImpl(Drawable drawable) {
        this.image = drawable;
    }

    public ImageDataImpl(ImageData imageData) {
        if (imageData != null) {
            this.remoteUrl = imageData.getRemoteUrl();
            this.image = imageData.getImage();
            this.localUri = imageData.getLocalUri();
        }
    }

    public String getRemoteUrl() {
        return this.remoteUrl;
    }

    public ImageDataImpl setRemoteUrl(String str) {
        this.remoteUrl = str;
        return this;
    }

    public Drawable getImage() {
        return this.image;
    }

    public ImageDataImpl setImage(Drawable drawable) {
        this.image = drawable;
        return this;
    }

    public Uri getLocalUri() {
        return this.localUri;
    }

    public ImageDataImpl setLocalUri(Uri uri) {
        this.localUri = uri;
        return this;
    }

    public void destroy() {
        this.remoteUrl = null;
        this.image = null;
        this.localUri = null;
    }
}
