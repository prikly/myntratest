package com.applovin.sdk;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Locale;
import ms.bd.o.Pgl.c;

public class AppLovinAdSize {
    public static final AppLovinAdSize BANNER = new AppLovinAdSize(-1, 50, "BANNER");
    public static final AppLovinAdSize CROSS_PROMO = new AppLovinAdSize(-1, -1, "XPROMO");
    public static final AppLovinAdSize INTERSTITIAL = new AppLovinAdSize(-1, -1, "INTER");
    public static final AppLovinAdSize LEADER = new AppLovinAdSize(-1, 90, "LEADER");
    public static final AppLovinAdSize MREC = new AppLovinAdSize(c.COLLECT_MODE_FINANCE, IronSourceConstants.INTERSTITIAL_DAILY_CAPPED, "MREC");
    public static final AppLovinAdSize NATIVE = new AppLovinAdSize(-1, -1, "NATIVE");
    public static final int SPAN = -1;

    /* renamed from: a  reason: collision with root package name */
    private final String f16078a;

    /* renamed from: b  reason: collision with root package name */
    private final int f16079b;

    /* renamed from: c  reason: collision with root package name */
    private final int f16080c;

    private AppLovinAdSize(int i, int i2, String str) {
        this.f16079b = i;
        this.f16080c = i2;
        this.f16078a = str;
    }

    public static AppLovinAdSize fromString(String str) {
        if ("BANNER".equalsIgnoreCase(str)) {
            return BANNER;
        }
        if ("MREC".equalsIgnoreCase(str)) {
            return MREC;
        }
        if ("LEADER".equalsIgnoreCase(str)) {
            return LEADER;
        }
        if ("INTERSTITIAL".equalsIgnoreCase(str) || "INTER".equalsIgnoreCase(str)) {
            return INTERSTITIAL;
        }
        if ("XPROMO".equalsIgnoreCase(str)) {
            return CROSS_PROMO;
        }
        if ("NATIVE".equalsIgnoreCase(str)) {
            return NATIVE;
        }
        throw new IllegalArgumentException("Unknown Ad Size: " + str);
    }

    public int getHeight() {
        return this.f16080c;
    }

    public String getLabel() {
        return this.f16078a.toUpperCase(Locale.ENGLISH);
    }

    public int getWidth() {
        return this.f16079b;
    }

    public String toString() {
        return getLabel();
    }
}
