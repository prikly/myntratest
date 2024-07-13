package com.yandex.metrica.impl.ob;

import com.yandex.metrica.billing_interface.a;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0823xf;
import java.util.ArrayList;

public class Y2 implements ProtobufConverter<X2, C0823xf> {

    /* renamed from: a  reason: collision with root package name */
    private final C0246a3 f5363a;

    public Y2() {
        this(new C0246a3());
    }

    public Object fromModel(Object obj) {
        X2 x2 = (X2) obj;
        C0823xf xfVar = new C0823xf();
        xfVar.f7106a = new C0823xf.a[x2.f5285a.size()];
        int i = 0;
        for (a a2 : x2.f5285a) {
            xfVar.f7106a[i] = this.f5363a.fromModel(a2);
            i++;
        }
        xfVar.f7107b = x2.f5286b;
        return xfVar;
    }

    public Object toModel(Object obj) {
        C0823xf xfVar = (C0823xf) obj;
        ArrayList arrayList = new ArrayList(xfVar.f7106a.length);
        for (C0823xf.a a2 : xfVar.f7106a) {
            arrayList.add(this.f5363a.toModel(a2));
        }
        return new X2(arrayList, xfVar.f7107b);
    }

    Y2(C0246a3 a3Var) {
        this.f5363a = a3Var;
    }
}
