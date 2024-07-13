package com.yandex.metrica.impl.ob;

public enum D0 {
    UNKNOWN(0),
    FIRST_OCCURRENCE(1),
    NON_FIRST_OCCURENCE(2);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f3843a;

    private D0(int i) {
        this.f3843a = i;
    }

    public static D0 a(Integer num) {
        if (num != null) {
            D0[] values = values();
            for (int i = 0; i < 3; i++) {
                D0 d0 = values[i];
                if (d0.f3843a == num.intValue()) {
                    return d0;
                }
            }
        }
        return UNKNOWN;
    }
}
