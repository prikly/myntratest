package com.appodeal.ads.adapters.admob.unified;

import com.google.android.gms.ads.AdRequest;

public class UnifiedAdmobRequestParams<AdRequestType extends AdRequest> {
    public final Boolean isMuted;
    public final String key;
    public final AdRequestType request;
    public final boolean useAdaptiveBanner;
    public final boolean useSmartBanner;

    public UnifiedAdmobRequestParams(AdRequestType adrequesttype, String str, Boolean bool, boolean z, boolean z2) {
        this.key = str;
        this.isMuted = bool;
        this.useAdaptiveBanner = z;
        this.useSmartBanner = z2;
        this.request = adrequesttype;
    }
}
