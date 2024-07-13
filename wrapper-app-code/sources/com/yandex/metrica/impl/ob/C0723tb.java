package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.tb  reason: case insensitive filesystem */
public class C0723tb {

    /* renamed from: a  reason: collision with root package name */
    public final a f6824a;

    /* renamed from: b  reason: collision with root package name */
    public final String f6825b;

    /* renamed from: c  reason: collision with root package name */
    public final Boolean f6826c;

    /* renamed from: com.yandex.metrica.impl.ob.tb$a */
    public enum a {
        GOOGLE,
        HMS,
        YANDEX
    }

    public C0723tb(a aVar, String str, Boolean bool) {
        this.f6824a = aVar;
        this.f6825b = str;
        this.f6826c = bool;
    }

    public String toString() {
        return "AdTrackingInfo{provider=" + this.f6824a + ", advId='" + this.f6825b + '\'' + ", limitedAdTracking=" + this.f6826c + '}';
    }
}
