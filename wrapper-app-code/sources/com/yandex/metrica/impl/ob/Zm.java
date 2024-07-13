package com.yandex.metrica.impl.ob;

public class Zm {

    /* renamed from: a  reason: collision with root package name */
    private final String f5432a;

    /* renamed from: b  reason: collision with root package name */
    private final C0315cm f5433b;

    public Zm(int i, String str, C0315cm cmVar) {
        this.f5432a = str;
        this.f5433b = cmVar;
    }

    public boolean a(C0265am amVar, String str, String str2) {
        int a2 = amVar.a();
        if (str2 != null) {
            a2 += str2.length();
        }
        if (amVar.containsKey(str)) {
            String str3 = (String) amVar.get(str);
            if (str3 != null) {
                a2 -= str3.length();
            }
        } else {
            a2 += str.length();
        }
        return a2 > 4500;
    }

    public void a(String str) {
        if (this.f5433b.isEnabled()) {
            this.f5433b.fw("The %s has reached the total size limit that equals %d symbols. Item with key %s will be ignored", this.f5432a, 4500, str);
        }
    }
}
