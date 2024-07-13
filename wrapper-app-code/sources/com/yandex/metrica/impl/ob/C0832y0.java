package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.y0  reason: case insensitive filesystem */
public enum C0832y0 {
    NATIVE(0),
    JS(1);
    

    /* renamed from: a  reason: collision with root package name */
    public final int f7134a;

    private C0832y0(int i) {
        this.f7134a = i;
    }

    public static C0832y0 a(int i) {
        C0832y0[] values = values();
        for (int i2 = 0; i2 < 2; i2++) {
            C0832y0 y0Var = values[i2];
            if (y0Var.f7134a == i) {
                return y0Var;
            }
        }
        return NATIVE;
    }
}
