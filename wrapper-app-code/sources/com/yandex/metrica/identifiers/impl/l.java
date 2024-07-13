package com.yandex.metrica.identifiers.impl;

public enum l {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f3662a;

    static {
        OK = new l("OK", 0, "OK");
        IDENTIFIER_PROVIDER_UNAVAILABLE = new l("IDENTIFIER_PROVIDER_UNAVAILABLE", 1, "IDENTIFIER_PROVIDER_UNAVAILABLE");
        UNKNOWN = new l("UNKNOWN", 5, "UNKNOWN");
    }

    private l(String str) {
        this.f3662a = str;
    }

    public final String a() {
        return this.f3662a;
    }
}
