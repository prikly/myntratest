package com.applovin.mediation.hybridAds;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;
import com.applovin.impl.mediation.a.c;
import com.applovin.impl.sdk.e.a;
import com.applovin.impl.sdk.e.o;
import com.applovin.impl.sdk.e.z;
import com.applovin.impl.sdk.n;
import com.applovin.mediation.adapter.listeners.MaxAdapterListener;
import com.applovin.mediation.nativeAds.MaxNativeAd;
import com.applovin.mediation.nativeAds.MaxNativeAdView;
import com.applovin.mediation.nativeAds.MaxNativeAdViewBinder;
import com.applovin.sdk.R;

public class MaxHybridNativeAdActivity extends b {
    /* access modifiers changed from: private */

    /* renamed from: c  reason: collision with root package name */
    public MaxNativeAdView f16000c;

    /* access modifiers changed from: protected */
    public void a(c cVar, final MaxNativeAd maxNativeAd, n nVar, MaxAdapterListener maxAdapterListener) {
        super.a(cVar, nVar, maxAdapterListener);
        MaxNativeAdView maxNativeAdView = new MaxNativeAdView(maxNativeAd, new MaxNativeAdViewBinder.Builder(R.layout.max_hybrid_native_ad_view).setTitleTextViewId(R.id.applovin_native_title_text_view).setBodyTextViewId(R.id.applovin_native_body_text_view).setAdvertiserTextViewId(R.id.applovin_native_advertiser_text_view).setIconImageViewId(R.id.applovin_native_icon_image_view).setMediaContentViewGroupId(R.id.applovin_native_media_content_view).setOptionsContentViewGroupId(R.id.applovin_native_options_view).setCallToActionButtonId(R.id.applovin_native_cta_button).build(), (Context) this);
        this.f16000c = maxNativeAdView;
        maxNativeAdView.renderCustomNativeAdView(maxNativeAd);
        AnonymousClass1 r1 = new Runnable() {
            public void run() {
                if (!maxNativeAd.prepareForInteraction(MaxHybridNativeAdActivity.this.f16000c.getClickableViews(), MaxHybridNativeAdActivity.this.f16000c)) {
                    maxNativeAd.prepareViewForInteraction(MaxHybridNativeAdActivity.this.f16000c);
                }
            }
        };
        if (maxNativeAd.shouldPrepareViewForInteractionOnMainThread()) {
            runOnUiThread(r1);
        } else {
            nVar.V().a((a) new z(nVar, r1), o.a.MEDIATION_MAIN);
        }
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        ((ViewGroup) findViewById(16908290)).addView(this.f16000c);
        this.f16004a.bringToFront();
    }
}
