package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0283bf;
import com.yandex.metrica.impl.ob.C0391fn;
import com.yandex.metrica.impl.ob.Je;
import com.yandex.metrica.impl.ob.Kn;
import com.yandex.metrica.impl.ob.Me;
import com.yandex.metrica.impl.ob.Pe;
import com.yandex.metrica.impl.ob.Ve;
import com.yandex.metrica.impl.ob.We;
import com.yandex.metrica.impl.ob.Ye;

public class StringAttribute {

    /* renamed from: a  reason: collision with root package name */
    private final C0391fn<String> f7381a;

    /* renamed from: b  reason: collision with root package name */
    private final Pe f7382b;

    StringAttribute(String str, C0391fn<String> fnVar, Kn<String> kn, Je je) {
        this.f7382b = new Pe(str, kn, je);
        this.f7381a = fnVar;
    }

    public UserProfileUpdate<? extends C0283bf> withValue(String str) {
        return new UserProfileUpdate<>(new Ye(this.f7382b.a(), str, this.f7381a, this.f7382b.b(), new Me(this.f7382b.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueIfUndefined(String str) {
        return new UserProfileUpdate<>(new Ye(this.f7382b.a(), str, this.f7381a, this.f7382b.b(), new We(this.f7382b.c())));
    }

    public UserProfileUpdate<? extends C0283bf> withValueReset() {
        return new UserProfileUpdate<>(new Ve(0, this.f7382b.a(), this.f7382b.b(), this.f7382b.c()));
    }
}
