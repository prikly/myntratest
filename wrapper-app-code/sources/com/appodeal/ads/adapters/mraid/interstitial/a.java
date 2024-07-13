package com.appodeal.ads.adapters.mraid.interstitial;

import android.content.Context;
import com.appodeal.ads.networking.LoadingError;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class a implements S2SAdTask.Callback<UnifiedMraidNetworkParams> {

    /* renamed from: a  reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialParams f16278a;

    /* renamed from: b  reason: collision with root package name */
    public final /* synthetic */ UnifiedInterstitialCallback f16279b;

    /* renamed from: c  reason: collision with root package name */
    public final /* synthetic */ b f16280c;

    public a(b bVar, UnifiedInterstitialParams unifiedInterstitialParams, UnifiedInterstitialCallback unifiedInterstitialCallback) {
        this.f16280c = bVar;
        this.f16278a = unifiedInterstitialParams;
        this.f16279b = unifiedInterstitialCallback;
    }

    public final void onFail(LoadingError loadingError) {
        this.f16279b.onAdLoadFailed(loadingError);
    }

    public final void onSuccess(Context context, Object obj) {
        this.f16280c.loadMraid(context, this.f16278a, (UnifiedMraidNetworkParams) obj, this.f16279b);
    }
}
