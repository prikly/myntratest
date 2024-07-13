package io.bidmachine.nativead;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import io.bidmachine.ImageData;
import io.bidmachine.nativead.view.NativeMediaView;
import java.util.Set;

public class NativeNetworkAdapter implements NativeData {
    private String callToAction;
    private String clickUrl;
    private String description;
    private boolean hasVideo;
    private ImageData iconImageData;
    private boolean isNetworkControlLoadingAssets = true;
    private ImageData mainImageData;
    private float rating = -1.0f;
    private String title;
    private String videoAdm;
    private String videoUrl;

    public ViewGroup configureContainer(Context context) {
        return null;
    }

    public boolean configureMediaView(NativeMediaView nativeMediaView) {
        return false;
    }

    public View createProviderView(Context context) {
        return null;
    }

    public void destroy() {
    }

    public void registerNative(ViewGroup viewGroup, ImageView imageView, NativeMediaView nativeMediaView, Set<View> set) {
    }

    public void unregisterNative() {
    }

    public String getTitle() {
        return this.title;
    }

    public NativeNetworkAdapter setTitle(String str) {
        this.title = str;
        return this;
    }

    public String getDescription() {
        return this.description;
    }

    public NativeNetworkAdapter setDescription(String str) {
        this.description = str;
        return this;
    }

    public String getCallToAction() {
        return this.callToAction;
    }

    public NativeNetworkAdapter setCallToAction(String str) {
        this.callToAction = str;
        return this;
    }

    public float getRating() {
        return this.rating;
    }

    public NativeNetworkAdapter setRating(float f2) {
        this.rating = f2;
        return this;
    }

    public ImageData getIcon() {
        return this.iconImageData;
    }

    public NativeNetworkAdapter setIcon(ImageData imageData) {
        this.iconImageData = imageData;
        return this;
    }

    public ImageData getMainImage() {
        return this.mainImageData;
    }

    public NativeNetworkAdapter setMainImage(ImageData imageData) {
        this.mainImageData = imageData;
        return this;
    }

    public String getClickUrl() {
        return this.clickUrl;
    }

    public NativeNetworkAdapter setClickUrl(String str) {
        this.clickUrl = str;
        return this;
    }

    public String getVideoUrl() {
        return this.videoUrl;
    }

    public NativeNetworkAdapter setVideoUrl(String str) {
        this.videoUrl = str;
        return this;
    }

    public String getVideoAdm() {
        return this.videoAdm;
    }

    public NativeNetworkAdapter setVideoAdm(String str) {
        this.videoAdm = str;
        return this;
    }

    public boolean hasVideo() {
        return this.hasVideo;
    }

    public NativeNetworkAdapter setHasVideo(boolean z) {
        this.hasVideo = z;
        return this;
    }

    public boolean isNetworkControlLoadingAssets() {
        return this.isNetworkControlLoadingAssets;
    }

    public NativeNetworkAdapter setNetworkControlLoadingAssets(boolean z) {
        this.isNetworkControlLoadingAssets = z;
        return this;
    }

    public boolean isValid() {
        return !TextUtils.isEmpty(getTitle()) && !TextUtils.isEmpty(getDescription()) && !TextUtils.isEmpty(getCallToAction());
    }
}
