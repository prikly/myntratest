package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0283bf;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Le;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;

public class BooleanAttribute {

    /* renamed from: a  reason: collision with root package name */
    private final Pe f7377a;

    BooleanAttribute(String str, Kn<String> kn, Je je) {
        this.f7377a = new Pe(str, kn, je);
    }

    public UserProfileUpdate<? extends C0283bf> withValue(boolean z) {
        return new UserProfileUpdate<>(new Le(this.f7377a.a(), z, this.f7377a.b(), new Me(this.f7377a.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueIfUndefined(boolean z) {
        return new UserProfileUpdate<>(new Le(this.f7377a.a(), z, this.f7377a.b(), new We(this.f7377a.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(3, this.f7377a.a(), this.f7377a.b(), this.f7377a.c()));
    }
}
