package com.appodeal.ads.unified;

import android.content.Context;

public interface UnifiedBannerParams extends UnifiedViewAdParams {
    int getMaxHeight(Context context);

    int getMaxWidth(Context context);

    boolean needLeaderBoard(Context context);

    boolean useSmartBanners(Context context);
}
