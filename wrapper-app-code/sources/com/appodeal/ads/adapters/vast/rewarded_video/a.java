package com.appodeal.ads.adapters.vast.rewarded_video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;

public final class a implements S2SAdTask.Callback<UnifiedVastNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedParams f16294a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f16295b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16296c;

    public a(b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f16296c = bVar;
        this.f16294a = unifiedRewardedParams;
        this.f16295b = unifiedRewardedCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16295b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16296c.loadVast(context, this.f16294a, (UnifiedVastNetworkParams) obj, this.f16295b);
    }
}
