package com.bytedance.sdk.openadsdk.core.e;

/* compiled from: LoadingInfo */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private long f1123a = 10000;

    /* renamed from: b  reason: collision with root package name */
    private long f1124b = 10000;

    /* renamed from: c  reason: collision with root package name */
    private String f1125c = "";

    public long a() {
        return this.f1123a;
    }

    public void a(long j) {
        if (j <= 0) {
            this.f1123a = 10;
        } else {
            this.f1123a = j;
        }
    }

    public long b() {
        return this.f1124b;
    }

    public void b(long j) {
        if (j < 0) {
            this.f1124b = 20;
        } else {
            this.f1124b = j;
        }
    }

    public String c() {
        return this.f1125c;
    }

    public void a(String str) {
        this.f1125c = str;
    }
}
