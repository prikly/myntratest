package com.appodeal.ads.adapters.vast.video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;

public final class a implements S2SAdTask.Callback<UnifiedVastNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedVideoParams f16297a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedVideoCallback f16298b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16299c;

    public a(b bVar, UnifiedVideoParams unifiedVideoParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.f16299c = bVar;
        this.f16297a = unifiedVideoParams;
        this.f16298b = unifiedVideoCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16298b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16299c.loadVast(context, this.f16297a, (UnifiedVastNetworkParams) obj, this.f16298b);
    }
}
