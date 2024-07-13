package com.appodeal.ads.adapters.mraid.interstitial;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedInterstitialCallback;
import com.appodeal.ads.unified.UnifiedInterstitialParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidInterstitial;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class b extends UnifiedMraidInterstitial<UnifiedMraidNetworkParams> {
    public final void requestMraid(Context context, UnifiedAdParams unifiedAdParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallback unifiedAdCallback, String str) {
        UnifiedInterstitialCallback unifiedInterstitialCallback = (UnifiedInterstitialCallback) unifiedAdCallback;
        S2SAdTask.requestMraid(context, str, unifiedMraidNetworkParams, unifiedInterstitialCallback, new a(this, (UnifiedInterstitialParams) unifiedAdParams, unifiedInterstitialCallback));
    }
}
