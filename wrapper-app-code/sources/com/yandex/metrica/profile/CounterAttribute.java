package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0283bf;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Oe;
import com.yandex.metrica.impl.ob.Pe;

public final class CounterAttribute {

    /* renamed from: a  reason: collision with root package name */
    private final Pe f7378a;

    CounterAttribute(String str, Kn<String> kn, Je je) {
        this.f7378a = new Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C0283bf> withDelta(double d2) {
        return new UserProfileUpdate<>(new Oe(this.f7378a.a(), d2));
    }
}
