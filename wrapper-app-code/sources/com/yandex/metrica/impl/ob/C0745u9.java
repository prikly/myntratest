package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.C0799wf;
import com.yandex.metrica.impl.ob.C0855z;

/* renamed from: com.yandex.metrica.impl.ob.u9  reason: case insensitive filesystem */
public class C0745u9 implements ProtobufConverter<C0855z, C0799wf.a> {
    /* renamed from: a */
    public C0799wf.a fromModel(C0855z zVar) {
        C0799wf.a aVar = new C0799wf.a();
        C0855z.a aVar2 = zVar.f7189a;
        if (aVar2 != null) {
            int ordinal = aVar2.ordinal();
            if (ordinal == 0) {
                aVar.f7046a = 1;
            } else if (ordinal == 1) {
                aVar.f7046a = 2;
            } else if (ordinal == 2) {
                aVar.f7046a = 3;
            } else if (ordinal == 3) {
                aVar.f7046a = 4;
            } else if (ordinal == 4) {
                aVar.f7046a = 5;
            }
        }
        Boolean bool = zVar.f7190b;
        if (bool != null) {
            if (bool.booleanValue()) {
                aVar.f7047b = 1;
            } else {
                aVar.f7047b = 0;
            }
        }
        return aVar;
    }

    /* renamed from: a */
    public C0855z toModel(C0799wf.a aVar) {
        C0855z.a aVar2;
        int i = aVar.f7046a;
        Boolean bool = null;
        if (i == 1) {
            aVar2 = C0855z.a.ACTIVE;
        } else if (i == 2) {
            aVar2 = C0855z.a.WORKING_SET;
        } else if (i == 3) {
            aVar2 = C0855z.a.FREQUENT;
        } else if (i != 4) {
            aVar2 = i != 5 ? null : C0855z.a.RESTRICTED;
        } else {
            aVar2 = C0855z.a.RARE;
        }
        int i2 = aVar.f7047b;
        if (i2 == 0) {
            bool = Boolean.FALSE;
        } else if (i2 == 1) {
            bool = Boolean.TRUE;
        }
        return new C0855z(aVar2, bool);
    }
}
