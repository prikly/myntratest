package com.applovin.impl.sdk.d;

import java.util.Map;

public class a {

    /* renamed from: a  reason: collision with root package name */
    private final String f15372a;

    /* renamed from: b  reason: collision with root package name */
    private final String f15373b;

    /* renamed from: c  reason: collision with root package name */
    private final Map<String, String> f15374c;

    /* renamed from: d  reason: collision with root package name */
    private final boolean f15375d;

    public a(String str, String str2) {
        this(str, str2, (Map<String, String>) null, false);
    }

    public a(String str, String str2, Map<String, String> map, boolean z) {
        this.f15372a = str;
        this.f15373b = str2;
        this.f15374c = map;
        this.f15375d = z;
    }

    public String a() {
        return this.f15372a;
    }

    public String b() {
        return this.f15373b;
    }

    public Map<String, String> c() {
        return this.f15374c;
    }

    public boolean d() {
        return this.f15375d;
    }

    public String toString() {
        return "AdEventPostback{url='" + this.f15372a + '\'' + ", backupUrl='" + this.f15373b + '\'' + ", headers='" + this.f15374c + '\'' + ", shouldFireInWebView='" + this.f15375d + '\'' + '}';
    }
}
