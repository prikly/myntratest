package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0408gf;
import java.util.EnumMap;

public class P6 implements ProtobufConverter<C0325d7, C0408gf> {

    /* renamed from: a  reason: collision with root package name */
    private static final EnumMap<C0400g7, Integer> f4750a;

    static {
        EnumMap<C0400g7, Integer> enumMap = new EnumMap<>(C0400g7.class);
        f4750a = enumMap;
        enumMap.put(C0400g7.UNKNOWN, 0);
        enumMap.put(C0400g7.BREAKPAD, 2);
        enumMap.put(C0400g7.CRASHPAD, 3);
    }

    /* renamed from: a */
    public C0408gf fromModel(C0325d7 d7Var) {
        C0408gf gfVar = new C0408gf();
        gfVar.f5864f = 1;
        C0408gf.a aVar = new C0408gf.a();
        gfVar.f5865g = aVar;
        aVar.f5867a = d7Var.a();
        C0300c7 b2 = d7Var.b();
        gfVar.f5865g.f5868b = new Cif();
        Integer num = f4750a.get(b2.b());
        if (num != null) {
            gfVar.f5865g.f5868b.f5990a = num.intValue();
        }
        Cif ifVar = gfVar.f5865g.f5868b;
        String a2 = b2.a();
        if (a2 == null) {
            a2 = "";
        }
        ifVar.f5991b = a2;
        return gfVar;
    }

    public Object toModel(Object obj) {
        C0408gf gfVar = (C0408gf) obj;
        throw new UnsupportedOperationException();
    }
}
