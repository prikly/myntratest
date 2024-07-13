package com.yandex.metrica;

@Deprecated
public enum b {
    PHONE("phone"),
    TABLET("tablet"),
    TV("tv");
    

    /* renamed from: a  reason: collision with root package name */
    private final String f3432a;

    private b(String str) {
        this.f3432a = str;
    }

    public String a() {
        return this.f3432a;
    }

    public static b a(String str) {
        b[] values = values();
        for (int i = 0; i < 3; i++) {
            b bVar = values[i];
            if (bVar.f3432a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }
}
