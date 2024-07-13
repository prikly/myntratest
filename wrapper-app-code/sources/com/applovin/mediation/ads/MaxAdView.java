package com.applovin.mediation.ads;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.applovin.adview.AppLovinAdView;
import com.applovin.impl.mediation.ads.MaxAdViewImpl;
import com.applovin.impl.mediation.ads.a;
import com.applovin.impl.sdk.utils.StringUtils;
import com.applovin.impl.sdk.utils.c;
import com.applovin.impl.sdk.utils.r;
import com.applovin.mediation.MaxAdFormat;
import com.applovin.mediation.MaxAdRequestListener;
import com.applovin.mediation.MaxAdRevenueListener;
import com.applovin.mediation.MaxAdReviewListener;
import com.applovin.mediation.MaxAdViewAdListener;
import com.applovin.sdk.AppLovinSdk;

public class MaxAdView extends RelativeLayout {

    /* renamed from: a  reason: collision with root package name */
    private MaxAdViewImpl f15987a;

    /* renamed from: b  reason: collision with root package name */
    private View f15988b;

    /* renamed from: c  reason: collision with root package name */
    private int f15989c;

    public MaxAdView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MaxAdView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        String a2 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adUnitId");
        String a3 = c.a(context, attributeSet, AppLovinAdView.NAMESPACE, "adFormat");
        MaxAdFormat formatFromString = StringUtils.isValidString(a3) ? MaxAdFormat.formatFromString(a3) : c.a(context);
        int attributeIntValue = attributeSet.getAttributeIntValue("http://schemas.android.com/apk/res/android", "gravity", 49);
        if (a2 == null) {
            throw new IllegalArgumentException("No ad unit ID specified");
        } else if (TextUtils.isEmpty(a2)) {
            throw new IllegalArgumentException("Empty ad unit ID specified");
        } else if (isInEditMode()) {
            a(context);
        } else {
            a(a2, formatFromString, attributeIntValue, AppLovinSdk.getInstance(context), context);
        }
    }

    public MaxAdView(String str, Context context) {
        this(str, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, Context context) {
        this(str, maxAdFormat, AppLovinSdk.getInstance(context), context);
    }

    public MaxAdView(String str, MaxAdFormat maxAdFormat, AppLovinSdk appLovinSdk, Context context) {
        super(context.getApplicationContext());
        a.logApiCall("MaxAdView", "MaxAdView(adUnitId=" + str + ", adFormat=" + maxAdFormat + ", sdk=" + appLovinSdk + ")");
        a(str, maxAdFormat, 49, appLovinSdk, context);
    }

    public MaxAdView(String str, AppLovinSdk appLovinSdk, Context context) {
        this(str, c.a(context), appLovinSdk, context);
    }

    private void a(Context context) {
        DisplayMetrics displayMetrics = context.getResources().getDisplayMetrics();
        int i = displayMetrics.widthPixels;
        int i2 = displayMetrics.heightPixels;
        TextView textView = new TextView(context);
        textView.setBackgroundColor(Color.rgb(220, 220, 220));
        textView.setTextColor(-16777216);
        textView.setText("AppLovin MAX Ad");
        textView.setGravity(17);
        addView(textView, i, i2);
    }

    private void a(String str, MaxAdFormat maxAdFormat, int i, AppLovinSdk appLovinSdk, Context context) {
        View view = new View(context.getApplicationContext());
        this.f15988b = view;
        view.setBackgroundColor(0);
        addView(this.f15988b);
        this.f15988b.setLayoutParams(new RelativeLayout.LayoutParams(-1, -1));
        this.f15989c = getVisibility();
        this.f15987a = new MaxAdViewImpl(str.trim(), maxAdFormat, this, this.f15988b, appLovinSdk.coreSdk, context);
        setGravity(i);
        if (getBackground() instanceof ColorDrawable) {
            setBackgroundColor(((ColorDrawable) getBackground()).getColor());
        }
        super.setBackgroundColor(0);
    }

    public void destroy() {
        this.f15987a.destroy();
    }

    public MaxAdFormat getAdFormat() {
        return this.f15987a.getAdFormat();
    }

    public String getAdUnitId() {
        return this.f15987a.getAdUnitId();
    }

    public String getPlacement() {
        this.f15987a.logApiCall("getPlacement()");
        return this.f15987a.getPlacement();
    }

    public void loadAd() {
        this.f15987a.logApiCall("loadAd()");
        this.f15987a.loadAd();
    }

    /* access modifiers changed from: protected */
    public void onWindowVisibilityChanged(int i) {
        super.onWindowVisibilityChanged(i);
        if (!isInEditMode()) {
            MaxAdViewImpl maxAdViewImpl = this.f15987a;
            maxAdViewImpl.logApiCall("onWindowVisibilityChanged(visibility=" + i + ")");
            if (this.f15987a != null && r.a(this.f15989c, i)) {
                this.f15987a.onWindowVisibilityChanged(i);
            }
            this.f15989c = i;
        }
    }

    public void setAdReviewListener(MaxAdReviewListener maxAdReviewListener) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setAdReviewListener(listener=" + maxAdReviewListener + ")");
        this.f15987a.setAdReviewListener(maxAdReviewListener);
    }

    public void setAlpha(float f2) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setAlpha(alpha=" + f2 + ")");
        View view = this.f15988b;
        if (view != null) {
            view.setAlpha(f2);
        }
    }

    public void setBackgroundColor(int i) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setBackgroundColor(color=" + i + ")");
        MaxAdViewImpl maxAdViewImpl2 = this.f15987a;
        if (maxAdViewImpl2 != null) {
            maxAdViewImpl2.setPublisherBackgroundColor(i);
        }
        View view = this.f15988b;
        if (view != null) {
            view.setBackgroundColor(i);
        }
    }

    public void setCustomData(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setCustomData(value=" + str + ")");
        this.f15987a.setCustomData(str);
    }

    public void setExtraParameter(String str, String str2) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setExtraParameter(key=" + str + ", value=" + str2 + ")");
        this.f15987a.setExtraParameter(str, str2);
    }

    public void setListener(MaxAdViewAdListener maxAdViewAdListener) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setListener(listener=" + maxAdViewAdListener + ")");
        this.f15987a.setListener(maxAdViewAdListener);
    }

    public void setLocalExtraParameter(String str, Object obj) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setLocalExtraParameter(key=" + str + ", value=" + obj + ")");
        this.f15987a.setLocalExtraParameter(str, obj);
    }

    public void setPlacement(String str) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setPlacement(placement=" + str + ")");
        this.f15987a.setPlacement(str);
    }

    public void setRequestListener(MaxAdRequestListener maxAdRequestListener) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setRequestListener(listener=" + maxAdRequestListener + ")");
        this.f15987a.setRequestListener(maxAdRequestListener);
    }

    public void setRevenueListener(MaxAdRevenueListener maxAdRevenueListener) {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        maxAdViewImpl.logApiCall("setRevenueListener(listener=" + maxAdRevenueListener + ")");
        this.f15987a.setRevenueListener(maxAdRevenueListener);
    }

    public void startAutoRefresh() {
        this.f15987a.logApiCall("startAutoRefresh()");
        this.f15987a.startAutoRefresh();
    }

    public void stopAutoRefresh() {
        this.f15987a.logApiCall("stopAutoRefresh()");
        this.f15987a.stopAutoRefresh();
    }

    public String toString() {
        MaxAdViewImpl maxAdViewImpl = this.f15987a;
        return maxAdViewImpl != null ? maxAdViewImpl.toString() : "MaxAdView";
    }
}
