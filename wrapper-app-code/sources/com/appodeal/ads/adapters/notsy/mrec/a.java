package com.appodeal.ads.adapters.notsy.mrec;

import android.content.Context;
import com.appodeal.ads.adapters.admob.mrec.UnifiedAdmobMrec;
import com.google.android.gms.ads.BaseAdView;
import com.google.android.gms.ads.admanager.AdManagerAdRequest;
import com.google.android.gms.ads.admanager.AdManagerAdView;

public final class a extends UnifiedAdmobMrec<AdManagerAdView, AdManagerAdRequest> {
    public final BaseAdView createAdView(Context context) {
        return new AdManagerAdView(context);
    }
}
