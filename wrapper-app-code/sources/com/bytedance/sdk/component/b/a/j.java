package com.bytedance.sdk.component.b.a;

/* compiled from: Protocol */
public enum j {
    HTTP_1_0("http/1.0"),
    HTTP_1_1("http/1.1"),
    SPDY_3("spdy/3.1"),
    HTTP_2("h2");
    

    /* renamed from: e  reason: collision with root package name */
    private final String f18928e;

    private j(String str) {
        this.f18928e = str;
    }

    public String toString() {
        return this.f18928e;
    }
}
