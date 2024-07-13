package com.appnext.banners;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

public class BannerSize {
    public static final BannerSize BANNER = new BannerSize(320, 50, "BANNER");
    public static final BannerSize LARGE_BANNER = new BannerSize(320, 100, "LARGE_BANNER");
    public static final BannerSize MEDIUM_RECTANGLE = new BannerSize(c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MEDIUM_RECTANGLE");
    private int height;
    private String name;
    private int width;

    private BannerSize(int i, int i2, String str) {
        this.width = i;
        this.height = i2;
        this.name = str;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof BannerSize)) {
            return false;
        }
        BannerSize bannerSize = (BannerSize) obj;
        return this.width == bannerSize.width && this.height == bannerSize.height && this.name.equals(bannerSize.name);
    }

    public final int getWidth() {
        return this.width;
    }

    public final int getHeight() {
        return this.height;
    }

    public String toString() {
        return this.name;
    }
}
