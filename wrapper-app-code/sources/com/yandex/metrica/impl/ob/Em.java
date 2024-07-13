package com.yandex.metrica.impl.ob;

public enum Em {
    NONE(0),
    EXTERNALLY_ENCRYPTED_EVENT_CRYPTER(1),
    AES_VALUE_ENCRYPTION(2);
    

    /* renamed from: a  reason: collision with root package name */
    private final int f3972a;

    private Em(int i) {
        this.f3972a = i;
    }

    public int a() {
        return this.f3972a;
    }

    public static Em a(Integer num) {
        if (num != null) {
            Em[] values = values();
            for (int i = 0; i < 3; i++) {
                Em em = values[i];
                if (em.f3972a == num.intValue()) {
                    return em;
                }
            }
        }
        return NONE;
    }
}
