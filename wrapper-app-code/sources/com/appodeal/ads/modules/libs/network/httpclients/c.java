package com.appodeal.ads.modules.libs.network.httpclients;

import com.appodeal.ads.modules.libs.network.HttpClient;
import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

public final class c {

    /* renamed from: a  reason: collision with root package name */
    public final HttpClient.Method f16784a;

    /* renamed from: b  reason: collision with root package name */
    public final String f16785b;

    /* renamed from: c  reason: collision with root package name */
    public final byte[] f16786c;

    /* renamed from: d  reason: collision with root package name */
    public final Map<String, List<String>> f16787d;

    public c(HttpClient.Method method, String str, byte[] bArr, Map<String, ? extends List<String>> map) {
        Intrinsics.checkNotNullParameter(method, "method");
        Intrinsics.checkNotNullParameter(str, "url");
        Intrinsics.checkNotNullParameter(map, "headers");
        this.f16784a = method;
        this.f16785b = str;
        this.f16786c = bArr;
        this.f16787d = map;
    }

    public final byte[] a() {
        return this.f16786c;
    }

    public final Map<String, List<String>> b() {
        return this.f16787d;
    }

    public final HttpClient.Method c() {
        return this.f16784a;
    }

    public final String d() {
        return this.f16785b;
    }
}
