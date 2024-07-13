package com.yandex.metrica.impl.ob;

public enum U0 {
    OK("OK"),
    IDENTIFIER_PROVIDER_UNAVAILABLE("IDENTIFIER_PROVIDER_UNAVAILABLE"),
    INVALID_ADV_ID("INVALID_ADV_ID"),
    NO_STARTUP("NO_STARTUP"),
    FEATURE_DISABLED("FEATURE_DISABLED"),
    UNKNOWN("UNKNOWN");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f5064a;

    private U0(String str) {
        this.f5064a = str;
    }

    public String a() {
        return this.f5064a;
    }

    public static U0 a(String str) {
        U0[] values = values();
        for (int i = 0; i < 6; i++) {
            U0 u0 = values[i];
            if (u0.f5064a.equals(str)) {
                return u0;
            }
        }
        return UNKNOWN;
    }
}
