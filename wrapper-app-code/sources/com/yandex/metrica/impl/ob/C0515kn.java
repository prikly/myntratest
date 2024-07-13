package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.kn  reason: case insensitive filesystem */
public class C0515kn extends C0441hn<String, Vm> {
    public C0515kn(int i) {
        super(i);
    }

    public C0416gn<String, Vm> a(String str) {
        int i = 0;
        if (str != null && str.length() > a()) {
            String substring = str.substring(0, a());
            int length = C0267b.b(str).length;
            int length2 = C0267b.b(substring).length;
            String str2 = substring;
            i = str.getBytes().length - substring.getBytes().length;
            str = str2;
        }
        return new C0416gn<>(str, new Um(i));
    }
}
