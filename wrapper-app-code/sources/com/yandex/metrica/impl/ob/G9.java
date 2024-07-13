package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;

public class G9 implements ProtobufConverter<Xb, If.k.a.C0047a> {

    /* renamed from: a  reason: collision with root package name */
    private final F9 f4043a;

    public G9() {
        this(new F9());
    }

    /* renamed from: a */
    public If.k.a.C0047a fromModel(Xb xb) {
        If.k.a.C0047a aVar = new If.k.a.C0047a();
        Qc qc = xb.f5332a;
        aVar.f4191a = qc.f4823a;
        aVar.f4192b = qc.f4824b;
        Wb wb = xb.f5333b;
        if (wb != null) {
            this.f4043a.getClass();
            If.k.a.C0047a.C0048a aVar2 = new If.k.a.C0047a.C0048a();
            aVar2.f4194a = wb.f5260a;
            aVar2.f4195b = wb.f5261b;
            aVar.f4193c = aVar2;
        }
        return aVar;
    }

    G9(F9 f9) {
        this.f4043a = f9;
    }

    /* renamed from: a */
    public Xb toModel(If.k.a.C0047a aVar) {
        Wb wb;
        If.k.a.C0047a.C0048a aVar2 = aVar.f4193c;
        if (aVar2 != null) {
            this.f4043a.getClass();
            wb = new Wb(aVar2.f4194a, aVar2.f4195b);
        } else {
            wb = null;
        }
        return new Xb(new Qc(aVar.f4191a, aVar.f4192b), wb);
    }
}
