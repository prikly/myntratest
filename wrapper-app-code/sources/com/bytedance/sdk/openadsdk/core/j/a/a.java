package com.bytedance.sdk.openadsdk.core.j.a;

/* compiled from: VastErrorCode */
public enum a {
    XML_PARSING_ERROR(100),
    SCHEMA_VALIDATION_ERROR(101),
    WRAPPER_TIMEOUT(301),
    NO_ADS_VAST_RESPONSE(303),
    GENERAL_LINEAR_AD_ERROR(400),
    GENERAL_COMPANION_AD_ERROR(600),
    UNDEFINED_ERROR(900);
    

    /* renamed from: h  reason: collision with root package name */
    private final int f1280h;

    private a(int i2) {
        this.f1280h = i2;
    }

    public String a() {
        return String.valueOf(this.f1280h);
    }
}
