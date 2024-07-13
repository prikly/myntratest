package com.yandex.metrica.impl.ob;

public final class In {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f4292a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4293b;

    private In(Kn<?> kn, boolean z, String str) {
        kn.getClass();
        this.f4292a = z;
        this.f4293b = str;
    }

    public final String a() {
        return this.f4293b;
    }

    public final boolean b() {
        return this.f4292a;
    }

    public static final In a(Kn<?> kn) {
        return new In(kn, true, "");
    }

    public static final In a(Kn<?> kn, String str) {
        return new In(kn, false, str);
    }
}
