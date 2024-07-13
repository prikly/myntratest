package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.nativeAd.AppLovinNativeAdImpl;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

public class e extends b {
    public e(AppLovinNativeAdImpl appLovinNativeAdImpl) {
        super(appLovinNativeAdImpl);
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.NATIVE_DISPLAY, ImpressionType.BEGIN_TO_RENDER, Owner.NATIVE, Owner.NONE, false);
        } catch (Throwable th) {
            v vVar = this.f15183c;
            if (v.a()) {
                this.f15183c.b(this.f15184d, "Failed to create ad session configuration", th);
            }
            return null;
        }
    }

    /* access modifiers changed from: protected */
    public AdSessionContext a(WebView webView) {
        try {
            return AdSessionContext.createNativeAdSessionContext(this.f15182b.ao().d(), this.f15182b.ao().e(), this.f15181a.getOpenMeasurementVerificationScriptResources(), this.f15181a.getOpenMeasurementContentUrl(), this.f15181a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            v vVar = this.f15183c;
            if (v.a()) {
                this.f15183c.b(this.f15184d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
