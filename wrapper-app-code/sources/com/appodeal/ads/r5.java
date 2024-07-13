package com.appodeal.ads;

import android.content.Context;
import android.view.View;
import com.appodeal.ads.r;
import com.appodeal.ads.unified.UnifiedViewAd;
import com.appodeal.ads.unified.UnifiedViewAdCallback;
import com.appodeal.ads.unified.UnifiedViewAdParams;

public abstract class r5<AdRequestType extends r, UnifiedAdType extends UnifiedViewAd, UnifiedAdParamsType extends UnifiedViewAdParams, UnifiedAdCallbackType extends UnifiedViewAdCallback> extends l<AdRequestType, UnifiedAdType, UnifiedAdParamsType, UnifiedAdCallbackType> {
    public View s;

    public r5(r rVar, AdNetwork adNetwork, d0 d0Var) {
        super(rVar, adNetwork, d0Var, 5000);
    }

    public abstract int a(Context context);

    public abstract int b(Context context);

    public final void i() {
        super.g();
        this.s = null;
    }
}
