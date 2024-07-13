package com.yandex.metrica.impl.ob;

import java.util.ArrayList;

public class G4 extends K4<M4> {

    /* renamed from: a  reason: collision with root package name */
    private final C0741u5 f4037a;

    public G4(F3 f3) {
        this.f4037a = new C0741u5(f3);
    }

    public H4<M4> a(int i) {
        ArrayList arrayList = new ArrayList();
        int ordinal = C0244a1.a(i).ordinal();
        if (ordinal == 16) {
            arrayList.add(this.f4037a.a());
        } else if (ordinal == 24) {
            arrayList.add(this.f4037a.b());
        } else if (ordinal == 47) {
            arrayList.add(this.f4037a.c());
        }
        return new H4<>(arrayList);
    }
}
