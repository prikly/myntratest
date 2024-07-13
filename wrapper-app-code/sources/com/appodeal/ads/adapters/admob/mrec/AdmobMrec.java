package com.appodeal.ads.adapters.admob.mrec;

import android.content.Context;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class AdmobMrec extends UnifiedAdmobMrec<AdView, AdRequest> {
    public AdView createAdView(Context context) {
        return new AdView(context);
    }
}
