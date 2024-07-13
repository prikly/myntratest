package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.ArrayList;
import java.util.List;

public class V6 implements ProtobufConverter<E6, C0507kf> {

    /* renamed from: a  reason: collision with root package name */
    private final T6 f5221a;

    public V6() {
        this(new T6());
    }

    /* renamed from: a */
    public C0507kf fromModel(E6 e6) {
        C0507kf kfVar = new C0507kf();
        Integer num = e6.f3926e;
        kfVar.f6097e = num == null ? -1 : num.intValue();
        kfVar.f6096d = e6.f3925d;
        kfVar.f6094b = e6.f3923b;
        kfVar.f6093a = e6.f3922a;
        kfVar.f6095c = e6.f3924c;
        T6 t6 = this.f5221a;
        List<StackTraceElement> list = e6.f3927f;
        ArrayList arrayList = new ArrayList();
        for (StackTraceElement d6 : list) {
            arrayList.add(new D6(d6));
        }
        kfVar.f6098f = t6.fromModel(arrayList);
        return kfVar;
    }

    public Object toModel(Object obj) {
        C0507kf kfVar = (C0507kf) obj;
        throw new UnsupportedOperationException();
    }

    V6(T6 t6) {
        this.f5221a = t6;
    }
}
