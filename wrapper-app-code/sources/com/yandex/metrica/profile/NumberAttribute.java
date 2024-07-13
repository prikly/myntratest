package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0283bf;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Qe;
import com.yandex.metrica.impl.ob.Re;
import com.yandex.metrica.impl.ob.Te;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Wm;

public final class NumberAttribute {

    /* renamed from: a  reason: collision with root package name */
    private final Pe f7380a;

    NumberAttribute(String str, Kn<String> kn, Je je) {
        this.f7380a = new Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C0283bf> withValue(double d2) {
        return new UserProfileUpdate<>(new Te(this.f7380a.a(), d2, new Qe(), new Me(new Re(new Wm(100)))));
    }

    public UserProfileUpdate<? extends C0283bf> withValueIfUndefined(double d2) {
        return new UserProfileUpdate<>(new Te(this.f7380a.a(), d2, new Qe(), new We(new Re(new Wm(100)))));
    }

    public UserProfileUpdate<? extends C0283bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(1, this.f7380a.a(), new Qe(), new Re(new Wm(100))));
    }
}
