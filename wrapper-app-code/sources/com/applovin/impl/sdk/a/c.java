package com.applovin.impl.sdk.a;

import android.webkit.WebView;
import com.applovin.impl.sdk.ad.a;
import com.applovin.impl.sdk.v;
import com.iab.omid.library.applovin.adsession.AdSessionConfiguration;
import com.iab.omid.library.applovin.adsession.AdSessionContext;
import com.iab.omid.library.applovin.adsession.CreativeType;
import com.iab.omid.library.applovin.adsession.ImpressionType;
import com.iab.omid.library.applovin.adsession.Owner;

public class c extends b {
    public c(a aVar) {
        super(aVar);
    }

    /* access modifiers changed from: protected */
    public AdSessionConfiguration a() {
        try {
            return AdSessionConfiguration.createAdSessionConfiguration(CreativeType.HTML_DISPLAY, ImpressionType.LOADED, Owner.NATIVE, Owner.NONE, false);
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
            return AdSessionContext.createHtmlAdSessionContext(this.f15182b.ao().d(), webView, this.f15181a.getOpenMeasurementContentUrl(), this.f15181a.getOpenMeasurementCustomReferenceData());
        } catch (Throwable th) {
            v vVar = this.f15183c;
            if (v.a()) {
                this.f15183c.b(this.f15184d, "Failed to create ad session context", th);
            }
            return null;
        }
    }
}
