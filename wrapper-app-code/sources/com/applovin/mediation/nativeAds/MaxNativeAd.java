package com.applovin.mediation.nativeAds;

import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.applovin.impl.mediation.nativeAds.MaxNativeAdImpl;
import com.applovin.mediation.MaxAdFormat;
import java.util.List;

public class MaxNativeAd extends MaxNativeAdImpl {
    private final String advertiser;
    private final String body;
    private final String callToAction;
    private final MaxAdFormat format;
    private final MaxNativeAdImage icon;
    private final View iconView;
    private boolean isExpired;
    private final MaxNativeAdImage mainImage;
    private final float mediaContentAspectRatio;
    private final View mediaView;
    private MaxNativeAdView nativeAdView;
    private final View optionsView;
    private final String title;

    public static class Builder {
        /* access modifiers changed from: private */

        /* renamed from: a  reason: collision with root package name */
        public MaxAdFormat f16016a;
        /* access modifiers changed from: private */

        /* renamed from: b  reason: collision with root package name */
        public String f16017b;
        /* access modifiers changed from: private */

        /* renamed from: c  reason: collision with root package name */
        public String f16018c;
        /* access modifiers changed from: private */

        /* renamed from: d  reason: collision with root package name */
        public String f16019d;
        /* access modifiers changed from: private */

        /* renamed from: e  reason: collision with root package name */
        public String f16020e;
        /* access modifiers changed from: private */

        /* renamed from: f  reason: collision with root package name */
        public MaxNativeAdImage f16021f;
        /* access modifiers changed from: private */

        /* renamed from: g  reason: collision with root package name */
        public View f16022g;
        /* access modifiers changed from: private */

        /* renamed from: h  reason: collision with root package name */
        public View f16023h;
        /* access modifiers changed from: private */
        public View i;
        /* access modifiers changed from: private */
        public MaxNativeAdImage j;
        /* access modifiers changed from: private */
        public float k;

        public MaxNativeAd build() {
            return new MaxNativeAd(this);
        }

        public Builder setAdFormat(MaxAdFormat maxAdFormat) {
            this.f16016a = maxAdFormat;
            return this;
        }

        public Builder setAdvertiser(String str) {
            this.f16018c = str;
            return this;
        }

        public Builder setBody(String str) {
            this.f16019d = str;
            return this;
        }

        public Builder setCallToAction(String str) {
            this.f16020e = str;
            return this;
        }

        public Builder setIcon(MaxNativeAdImage maxNativeAdImage) {
            this.f16021f = maxNativeAdImage;
            return this;
        }

        public Builder setIconView(View view) {
            this.f16022g = view;
            return this;
        }

        public Builder setMainImage(MaxNativeAdImage maxNativeAdImage) {
            this.j = maxNativeAdImage;
            return this;
        }

        public Builder setMediaContentAspectRatio(float f2) {
            this.k = f2;
            return this;
        }

        public Builder setMediaView(View view) {
            this.i = view;
            return this;
        }

        public Builder setOptionsView(View view) {
            this.f16023h = view;
            return this;
        }

        public Builder setTitle(String str) {
            this.f16017b = str;
            return this;
        }
    }

    public static class MaxNativeAdImage {

        /* renamed from: a  reason: collision with root package name */
        private Drawable f16024a;

        /* renamed from: b  reason: collision with root package name */
        private Uri f16025b;

        public MaxNativeAdImage(Drawable drawable) {
            this.f16024a = drawable;
        }

        public MaxNativeAdImage(Uri uri) {
            this.f16025b = uri;
        }

        public Drawable getDrawable() {
            return this.f16024a;
        }

        public Uri getUri() {
            return this.f16025b;
        }
    }

    public MaxNativeAd(Builder builder) {
        this.format = builder.f16016a;
        this.title = builder.f16017b;
        this.advertiser = builder.f16018c;
        this.body = builder.f16019d;
        this.callToAction = builder.f16020e;
        this.icon = builder.f16021f;
        this.iconView = builder.f16022g;
        this.optionsView = builder.f16023h;
        this.mediaView = builder.i;
        this.mainImage = builder.j;
        this.mediaContentAspectRatio = builder.k;
    }

    public final String getAdvertiser() {
        return this.advertiser;
    }

    public final String getBody() {
        return this.body;
    }

    public final String getCallToAction() {
        return this.callToAction;
    }

    public final MaxAdFormat getFormat() {
        return this.format;
    }

    public final MaxNativeAdImage getIcon() {
        return this.icon;
    }

    public final View getIconView() {
        return this.iconView;
    }

    public final MaxNativeAdImage getMainImage() {
        return this.mainImage;
    }

    public final float getMediaContentAspectRatio() {
        return this.mediaContentAspectRatio;
    }

    public final View getMediaView() {
        return this.mediaView;
    }

    public final View getOptionsView() {
        return this.optionsView;
    }

    public final String getTitle() {
        return this.title;
    }

    public boolean isContainerClickable() {
        return false;
    }

    public final boolean isExpired() {
        return this.isExpired;
    }

    public void performClick() {
        Button callToActionButton;
        MaxNativeAdView maxNativeAdView = this.nativeAdView;
        if (maxNativeAdView != null && (callToActionButton = maxNativeAdView.getCallToActionButton()) != null) {
            callToActionButton.performClick();
        }
    }

    public boolean prepareForInteraction(List<View> list, ViewGroup viewGroup) {
        return false;
    }

    @Deprecated
    public void prepareViewForInteraction(MaxNativeAdView maxNativeAdView) {
    }

    public void setExpired() {
        this.isExpired = true;
    }

    public void setNativeAdView(MaxNativeAdView maxNativeAdView) {
        this.nativeAdView = maxNativeAdView;
    }

    public boolean shouldPrepareViewForInteractionOnMainThread() {
        return true;
    }
}
