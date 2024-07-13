package com.appodeal.ads.adapters.mraid.mrec;

import android.content.Context;
import com.appodeal.ads.unified.UnifiedAdCallback;
import com.appodeal.ads.unified.UnifiedAdParams;
import com.appodeal.ads.unified.UnifiedMrecCallback;
import com.appodeal.ads.unified.UnifiedMrecParams;
import com.appodeal.ads.unified.mraid.UnifiedMraidMrec;
import com.appodeal.ads.unified.mraid.UnifiedMraidNetworkParams;
import com.appodeal.ads.unified.tasks.S2SAdTask;

public final class b extends UnifiedMraidMrec<UnifiedMraidNetworkParams> {
    public final void requestMraid(Context context, UnifiedAdParams unifiedAdParams, UnifiedMraidNetworkParams unifiedMraidNetworkParams, UnifiedAdCallback unifiedAdCallback, String str) {
        UnifiedMrecCallback unifiedMrecCallback = (UnifiedMrecCallback) unifiedAdCallback;
        S2SAdTask.requestMraid(context, str, unifiedMraidNetworkParams, unifiedMrecCallback, new a(this, (UnifiedMrecParams) unifiedAdParams, unifiedMrecCallback));
    }
}
