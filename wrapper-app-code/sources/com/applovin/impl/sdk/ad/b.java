package com.applovin.impl.sdk.ad;

public enum b {
    UNKNOWN(0),
    APPLOVIN_PRIMARY_ZONE(1),
    APPLOVIN_CUSTOM_ZONE(2),
    APPLOVIN_MULTIZONE(3),
    REGULAR_AD_TOKEN(4),
    DECODED_AD_TOKEN_JSON(5);
    

    /* renamed from: g  reason: collision with root package name */
    private final int f15245g;

    private b(int i) {
        this.f15245g = i;
    }

    public static b a(int i) {
        return i == 1 ? APPLOVIN_PRIMARY_ZONE : i == 2 ? APPLOVIN_CUSTOM_ZONE : i == 3 ? APPLOVIN_MULTIZONE : i == 4 ? REGULAR_AD_TOKEN : i == 5 ? DECODED_AD_TOKEN_JSON : UNKNOWN;
    }

    public int a() {
        return this.f15245g;
    }
}
