package com.applovin.mediation.nativeAds;

import android.view.View;

public class MaxNativeAdViewBinder {
    protected final int advertiserTextViewId;
    protected final int bodyTextViewId;
    protected final int callToActionButtonId;
    protected final int iconContentViewId;
    protected final int iconImageViewId;
    protected final int layoutResourceId;
    protected final View mainView;
    protected final int mediaContentFrameLayoutId;
    protected final int mediaContentViewGroupId;
    protected final int optionsContentFrameLayoutId;
    protected final int optionsContentViewGroupId;
    protected final String templateType;
    protected final int titleTextViewId;

    public static class Builder {

        /* renamed from: a  reason: collision with root package name */
        private final View f16041a;

        /* renamed from: b  reason: collision with root package name */
        private final int f16042b;

        /* renamed from: c  reason: collision with root package name */
        private int f16043c;

        /* renamed from: d  reason: collision with root package name */
        private int f16044d;

        /* renamed from: e  reason: collision with root package name */
        private int f16045e;

        /* renamed from: f  reason: collision with root package name */
        private int f16046f;

        /* renamed from: g  reason: collision with root package name */
        private int f16047g;

        /* renamed from: h  reason: collision with root package name */
        private int f16048h;
        private int i;
        private int j;
        private int k;
        private int l;
        private String m;

        public Builder(int i2) {
            this(i2, (View) null);
        }

        private Builder(int i2, View view) {
            this.f16043c = -1;
            this.f16044d = -1;
            this.f16045e = -1;
            this.f16046f = -1;
            this.f16047g = -1;
            this.f16048h = -1;
            this.i = -1;
            this.j = -1;
            this.k = -1;
            this.l = -1;
            this.f16042b = i2;
            this.f16041a = view;
        }

        public Builder(View view) {
            this(-1, view);
        }

        public MaxNativeAdViewBinder build() {
            return new MaxNativeAdViewBinder(this.f16041a, this.f16042b, this.f16043c, this.f16044d, this.f16045e, this.f16046f, this.f16047g, this.f16048h, this.i, this.j, this.k, this.l, this.m);
        }

        public Builder setAdvertiserTextViewId(int i2) {
            this.f16044d = i2;
            return this;
        }

        public Builder setBodyTextViewId(int i2) {
            this.f16045e = i2;
            return this;
        }

        public Builder setCallToActionButtonId(int i2) {
            this.l = i2;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setIconContentViewId(int i2) {
            this.f16047g = i2;
            return this;
        }

        public Builder setIconImageViewId(int i2) {
            this.f16046f = i2;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setMediaContentFrameLayoutId(int i2) {
            this.k = i2;
            return this;
        }

        public Builder setMediaContentViewGroupId(int i2) {
            this.j = i2;
            return this;
        }

        /* access modifiers changed from: protected */
        @Deprecated
        public Builder setOptionsContentFrameLayoutId(int i2) {
            this.i = i2;
            return this;
        }

        public Builder setOptionsContentViewGroupId(int i2) {
            this.f16048h = i2;
            return this;
        }

        /* access modifiers changed from: protected */
        public Builder setTemplateType(String str) {
            this.m = str;
            return this;
        }

        public Builder setTitleTextViewId(int i2) {
            this.f16043c = i2;
            return this;
        }
    }

    private MaxNativeAdViewBinder(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, String str) {
        this.mainView = view;
        this.layoutResourceId = i;
        this.titleTextViewId = i2;
        this.advertiserTextViewId = i3;
        this.bodyTextViewId = i4;
        this.iconImageViewId = i5;
        this.iconContentViewId = i6;
        this.optionsContentViewGroupId = i7;
        this.optionsContentFrameLayoutId = i8;
        this.mediaContentViewGroupId = i9;
        this.mediaContentFrameLayoutId = i10;
        this.callToActionButtonId = i11;
        this.templateType = str;
    }
}
