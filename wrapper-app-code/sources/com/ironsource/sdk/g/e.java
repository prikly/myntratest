package com.ironsource.sdk.g;

public final class e {

    /* renamed from: a  reason: collision with root package name */
    public String f9555a;

    /* renamed from: b  reason: collision with root package name */
    public int f9556b;

    public e(int i, String str) {
        this.f9556b = i;
        this.f9555a = str == null ? "" : str;
    }

    public final String toString() {
        return "error - code:" + this.f9556b + ", message:" + this.f9555a;
    }
}
