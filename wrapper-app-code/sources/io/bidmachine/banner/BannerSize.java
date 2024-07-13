package io.bidmachine.banner;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

public enum BannerSize {
    Size_320x50(320, 50),
    Size_300x250(c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED),
    Size_728x90(728, 90);
    
    public final int height;
    public final int width;

    private BannerSize(int i, int i2) {
        this.width = i;
        this.height = i2;
    }
}
