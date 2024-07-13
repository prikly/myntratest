package com.appodeal.ads.adapters.mraid.video;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedVideoCallback;
import com.appodeal.ads.unified.UnifiedVideoParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidVideo;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class b extends UnifiedMraidVideo<UnifiedMraidNetworkParams> {
    public final void requestMraid(Context context, UnifiedAdParams unifiedAdParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallback unifiedAdCallback, String str) {
        UnifiedVideoCallback unifiedVideoCallback = (UnifiedVideoCallback) unifiedAdCallback;
        S2SAdTask.requestMraid(context, str, unifiedMraidNetworkParams, unifiedVideoCallback, new a(this, (UnifiedVideoParams) unifiedAdParams, unifiedVideoCallback));
    }
}
