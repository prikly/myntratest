package com.appodeal.ads.adapters.mraid.rewarded_video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedRewardedCallback;
import com.appodeal.ads.unified.UnifiedRewardedParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedParams f16284a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedRewardedCallback f16285b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16286c;

    public a(b bVar, UnifiedRewardedParams unifiedRewardedParams, UnifiedRewardedCallback unifiedRewardedCallback) {
        this.f16286c = bVar;
        this.f16284a = unifiedRewardedParams;
        this.f16285b = unifiedRewardedCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16285b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16286c.loadMraid(context, this.f16284a, (UnifiedMraidNetworkParams) obj, this.f16285b);
    }
}
