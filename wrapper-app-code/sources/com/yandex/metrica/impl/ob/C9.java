package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.impl.ob.If;
import kotlin.jvm.internal.Intrinsics;

public final class C9 implements ProtobufConverter<Uh, If.h> {
    /* renamed from: a */
    public If.h fromModel(Uh uh) {
        If.h hVar = new If.h();
        hVar.f4166a = uh.c();
        hVar.f4167b = uh.b();
        hVar.f4168c = uh.a();
        hVar.f4170e = uh.e();
        hVar.f4169d = uh.d();
        return hVar;
    }

    /* renamed from: a */
    public Uh toModel(If.h hVar) {
        String str = hVar.f4166a;
        Intrinsics.checkNotNullExpressionValue(str, "nano.url");
        return new Uh(str, hVar.f4167b, hVar.f4168c, hVar.f4169d, hVar.f4170e);
    }
}
