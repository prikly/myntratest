package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.i6  reason: case insensitive filesystem */
public final class C0449i6 extends C0427h9<Gf> {
    public Object defaultValue() {
        return new Gf();
    }

    public Object toState(byte[] bArr) {
        Gf gf = (Gf) MessageNano.mergeFrom(new Gf(), bArr);
        Intrinsics.checkNotNullExpressionValue(gf, "SessionExtrasProtobuf.Se…ionExtras.parseFrom(data)");
        return gf;
    }
}
