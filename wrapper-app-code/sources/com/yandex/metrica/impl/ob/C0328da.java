package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

/* renamed from: com.yandex.metrica.impl.ob.da  reason: case insensitive filesystem */
public class C0328da implements ProtobufConverter<C0805wl, If.w> {

    /* renamed from: a  reason: collision with root package name */
    private final C0278ba f5653a;

    public C0328da() {
        this(new C0278ba());
    }

    /* renamed from: a */
    public If.w fromModel(C0805wl wlVar) {
        If.w wVar = new If.w();
        wVar.f4248a = wlVar.f7065a;
        wVar.f4249b = wlVar.f7066b;
        wVar.f4250c = wlVar.f7067c;
        wVar.f4251d = wlVar.f7068d;
        wVar.f4252e = wlVar.f7069e;
        wVar.f4253f = wlVar.f7070f;
        wVar.f4254g = wlVar.f7071g;
        wVar.f4255h = this.f5653a.fromModel(wlVar.f7072h);
        return wVar;
    }

    C0328da(C0278ba baVar) {
        this.f5653a = baVar;
    }

    /* renamed from: a */
    public C0805wl toModel(If.w wVar) {
        return new C0805wl(wVar.f4248a, wVar.f4249b, wVar.f4250c, wVar.f4251d, wVar.f4252e, wVar.f4253f, wVar.f4254g, this.f5653a.toModel(wVar.f4255h));
    }
}
