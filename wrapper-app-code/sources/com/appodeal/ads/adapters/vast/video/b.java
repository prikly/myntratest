package com.appodeal.ads.adapters.vast.video;

import android.content.Context;
import com.appodeal.ads.adapters.vast.VASTNetwork;
import com.appodeal.ads.unified.UnifiedFullscreenAdCallback;
import com.appodeal.ads.unified.UnifiedFullscreenAdParams;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;
import com.appodeal.ads.unified.vast.UnifiedVastNetworkParams;
import com.appodeal.ads.unified.vast.UnifiedVastVideo;

public final class b extends UnifiedVastVideo<VASTNetwork.RequestParams> {
    public final void performVastRequest(Context context, UnifiedFullscreenAdParams unifiedFullscreenAdParams, UnifiedVastNetworkParams unifiedVastNetworkParams, UnifiedFullscreenAdCallback unifiedFullscreenAdCallback, String str) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedFullscreenAdCallback;
        S2SAdTask.requestVast(context, str, unifiedVastNetworkParams, unifiedVideoCallback, new a(this, (UnifiedVideoParams) unifiedFullscreenAdParams, unifiedVideoCallback));
    }
}
