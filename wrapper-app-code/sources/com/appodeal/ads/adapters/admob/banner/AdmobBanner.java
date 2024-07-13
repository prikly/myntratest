package com.appodeal.ads.adapters.admob.banner;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdmobBanner extends UnifiedAdmobBanner<AdView, AdRequest> {
    public AdView createAdView(Context context) {
        return new AdView(context);
    }
}
