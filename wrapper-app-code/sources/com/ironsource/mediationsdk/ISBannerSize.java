package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import ms.bd.o.Pgl.c;

public class ISBannerSize {
    public static final ISBannerSize BANNER = new ISBannerSize("BANNER", 320, 50);
    public static final ISBannerSize LARGE = new ISBannerSize("LARGE", 320, 90);
    public static final ISBannerSize RECTANGLE = new ISBannerSize("RECTANGLE", c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED);
    public static final ISBannerSize SMART = new ISBannerSize("SMART", 0, 0);

    /* renamed from: a  reason: collision with root package name */
    protected static final ISBannerSize f8185a = new ISBannerSize("LEADERBOARD", 728, 90);

    /* renamed from: b  reason: collision with root package name */
    private int f8186b;

    /* renamed from: c  reason: collision with root package name */
    private int f8187c;

    /* renamed from: d  reason: collision with root package name */
    private String f8188d;

    /* renamed from: e  reason: collision with root package name */
    private boolean f8189e;

    public ISBannerSize(int i, int i2) {
        this("CUSTOM", i, i2);
    }

    public ISBannerSize(String str, int i, int i2) {
        this.f8188d = str;
        this.f8186b = i;
        this.f8187c = i2;
    }

    public String getDescription() {
        return this.f8188d;
    }

    public int getHeight() {
        return this.f8187c;
    }

    public int getWidth() {
        return this.f8186b;
    }

    public boolean isAdaptive() {
        return this.f8189e;
    }

    public boolean isSmart() {
        return this.f8188d.equals("SMART");
    }

    public void setAdaptive(boolean z) {
        this.f8189e = z;
    }
}
