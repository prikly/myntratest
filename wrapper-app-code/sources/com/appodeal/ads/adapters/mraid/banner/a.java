package com.appodeal.ads.adapters.mraid.banner;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedBannerCallback;
import com.appodeal.ads.unified.UnifiedBannerParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerParams f16275a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedBannerCallback f16276b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16277c;

    public a(b bVar, UnifiedBannerParams unifiedBannerParams, UnifiedBannerCallback unifiedBannerCallback) {
        this.f16277c = bVar;
        this.f16275a = unifiedBannerParams;
        this.f16276b = unifiedBannerCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16276b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16277c.loadMraid(context, this.f16275a, (UnifiedMraidNetworkParams) obj, this.f16276b);
    }
}
