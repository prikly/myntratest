package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.dn  reason: case insensitive filesystem */
public class C0341dn extends Sm<String> {
    public C0341dn(int i, String str) {
        this(i, str, C0315cm.a());
    }

    public C0341dn(int i, String str, C0315cm cmVar) {
        super(i, str, cmVar);
    }

    public String a(String str) {
        if (str == null || str.length() <= super.b()) {
            return str;
        }
        String substring = str.substring(0, super.b());
        if (this.f4985c.isEnabled()) {
            this.f4985c.fw("\"%s\" %s size exceeded limit of %d characters", super.a(), str, Integer.valueOf(super.b()));
        }
        return substring;
    }
}
