package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: com.yandex.metrica.impl.ob.i9  reason: case insensitive filesystem */
public final class C0452i9 extends C0427h9<C0847yf> {
    public Object defaultValue() {
        return new C0847yf();
    }

    public Object toState(byte[] bArr) {
        C0847yf yfVar = (C0847yf) MessageNano.mergeFrom(new C0847yf(), bArr);
        Intrinsics.checkNotNullExpressionValue(yfVar, "ClidsInfoProto.ClidsInfo.parseFrom(data)");
        return yfVar;
    }
}
