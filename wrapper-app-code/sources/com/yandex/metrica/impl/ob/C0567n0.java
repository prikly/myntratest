package com.yandex.metrica.impl.ob;

import java.util.Map;

/* renamed from: com.yandex.metrica.impl.ob.n0  reason: case insensitive filesystem */
public class C0567n0 {

    /* renamed from: a  reason: collision with root package name */
    public final Map<String, String> f6296a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6297b;

    /* renamed from: c  reason: collision with root package name */
    public final String f6298c;

    public C0567n0(String str, Map<String, String> map, String str2) {
        this.f6297b = str;
        this.f6296a = map;
        this.f6298c = str2;
    }

    public String toString() {
        return "DeferredDeeplinkState{mParameters=" + this.f6296a + ", mDeeplink='" + this.f6297b + '\'' + ", mUnparsedReferrer='" + this.f6298c + '\'' + '}';
    }
}
