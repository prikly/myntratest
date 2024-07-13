package com.yandex.metrica.profile;

import com.yandex.metrica.impl.ob.C0341dn;
import com.yandex.metrica.impl.ob.Dn;
import com.yandex.metrica.impl.ob.Xe;

public class NameAttribute extends StringAttribute {
    NameAttribute() {
        super("appmetrica_name", new C0341dn(100, "Name attribute"), new Dn(), new Xe());
    }
}
