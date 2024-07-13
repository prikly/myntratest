package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import java.util.List;

public class W6 implements ProtobufConverter<F6, C0532lf> {

    /* renamed from: a  reason: collision with root package name */
    private final T6 f5251a;

    public W6() {
        this(new T6());
    }

    /* renamed from: a */
    public C0532lf fromModel(F6 f6) {
        C0532lf lfVar = new C0532lf();
        String b2 = f6.b();
        String str = "";
        if (b2 == null) {
            b2 = str;
        }
        lfVar.f6151a = b2;
        String c2 = f6.c();
        if (c2 != null) {
            str = c2;
        }
        lfVar.f6152b = str;
        lfVar.f6153c = this.f5251a.fromModel(f6.d());
        if (f6.a() != null) {
            lfVar.f6154d = fromModel(f6.a());
        }
        List<F6> e2 = f6.e();
        int i = 0;
        if (e2 == null) {
            lfVar.f6155e = new C0532lf[0];
        } else {
            lfVar.f6155e = new C0532lf[e2.size()];
            for (F6 a2 : e2) {
                lfVar.f6155e[i] = fromModel(a2);
                i++;
            }
        }
        return lfVar;
    }

    public Object toModel(Object obj) {
        C0532lf lfVar = (C0532lf) obj;
        throw new UnsupportedOperationException();
    }

    W6(T6 t6) {
        this.f5251a = t6;
    }
}
