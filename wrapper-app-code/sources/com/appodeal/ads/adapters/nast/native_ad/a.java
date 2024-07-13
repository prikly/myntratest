package com.appodeal.ads.adapters.nast.native_ad;

import android.content.Context;
import com.appodeal.ads.adapters.nast.native_ad.b;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedNativeCallback;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<String> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedNativeCallback f16290a;

    public a(UnifiedNativeCallback unifiedNativeCallback) {
        this.f16290a = unifiedNativeCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16290a.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        b.a a2 = b.a.a((String) obj);
        if (a2 == null) {
            this.f16290a.onAdLoadFailed(LoadingError.InternalError);
        } else {
            this.f16290a.onAdLoaded(a2);
        }
    }
}
