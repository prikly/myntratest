package com.appodeal.ads.adapters.mraid.mrec;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecParams f16281a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedMrecCallback f16282b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16283c;

    public a(b bVar, UnifiedMrecParams unifiedMrecParams, UnifiedMrecCallback unifiedMrecCallback) {
        this.f16283c = bVar;
        this.f16281a = unifiedMrecParams;
        this.f16282b = unifiedMrecCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16282b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16283c.loadMraid(context, this.f16281a, (UnifiedMraidNetworkParams) obj, this.f16282b);
    }
}
