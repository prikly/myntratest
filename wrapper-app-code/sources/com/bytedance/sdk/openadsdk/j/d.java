package com.bytedance.sdk.openadsdk.j;

/* compiled from: NetType */
public enum d {
    TYPE_2G("2g"),
    TYPE_3G("3g"),
    TYPE_4G("4g"),
    TYPE_5G("5g"),
    TYPE_WIFI("wifi"),
    TYPE_UNKNOWN("mobile");
    

    /* renamed from: g  reason: collision with root package name */
    private String f2029g;

    private d(String str) {
        this.f2029g = str;
    }

    public String toString() {
        return this.f2029g;
    }
}
