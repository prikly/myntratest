package com.appodeal.ads.adapters.mraid.video;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedVideoParams f16287a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedVideoCallback f16288b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16289c;

    public a(b bVar, UnifiedVideoParams unifiedVideoParams, UnifiedVideoCallback unifiedVideoCallback) {
        this.f16289c = bVar;
        this.f16287a = unifiedVideoParams;
        this.f16288b = unifiedVideoCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16288b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16289c.loadMraid(context, this.f16287a, (UnifiedMraidNetworkParams) obj, this.f16288b);
    }
}
