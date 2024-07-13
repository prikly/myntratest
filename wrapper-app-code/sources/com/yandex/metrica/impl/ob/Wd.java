package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.Cf;
import com.yandex.metrica.impl.ob.Ud;
import java.util.ArrayList;

public class Wd implements ProtobufConverter<Ud, Cf> {

    /* renamed from: a  reason: collision with root package name */
    private final C0382fe f5263a;

    /* renamed from: b  reason: collision with root package name */
    private final Sd f5264b;

    public Wd() {
        this(new C0382fe(), new Sd());
    }

    public Object fromModel(Object obj) {
        Ud ud = (Ud) obj;
        Cf cf = new Cf();
        cf.f3820a = this.f5263a.fromModel(ud.f5097a);
        cf.f3821b = new Cf.b[ud.f5098b.size()];
        int i = 0;
        for (Ud.a a2 : ud.f5098b) {
            cf.f3821b[i] = this.f5264b.fromModel(a2);
            i++;
        }
        return cf;
    }

    public Object toModel(Object obj) {
        C0357ee eeVar;
        Cf cf = (Cf) obj;
        ArrayList arrayList = new ArrayList(cf.f3821b.length);
        for (Cf.b a2 : cf.f3821b) {
            arrayList.add(this.f5264b.toModel(a2));
        }
        Cf.a aVar = cf.f3820a;
        if (aVar == null) {
            eeVar = this.f5263a.toModel(new Cf.a());
        } else {
            eeVar = this.f5263a.toModel(aVar);
        }
        return new Ud(eeVar, arrayList);
    }

    Wd(C0382fe feVar, Sd sd) {
        this.f5263a = feVar;
        this.f5264b = sd;
    }
}
