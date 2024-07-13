package com.yandex.metrica.impl.ob;

public class Rd {

    /* renamed from: a  reason: collision with root package name */
    private final String f4868a;

    /* renamed from: b  reason: collision with root package name */
    private final String f4869b;

    public Rd(String str) {
        this(str, (String) null);
    }

    public String a() {
        return this.f4869b;
    }

    public String b() {
        return this.f4868a;
    }

    public Rd(String str, String str2) {
        this.f4868a = str;
        this.f4869b = a(str2);
    }

    public final String a(String str) {
        if (str == null) {
            return this.f4868a;
        }
        return this.f4868a + str;
    }
}
