package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.Cf;
import java.io.IOException;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.he  reason: case insensitive filesystem */
public class C0432he extends C0427h9<Cf.a> {
    public Object defaultValue() {
        return new Cf.a();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Cf.a) MessageNano.mergeFrom(new Cf.a(), bArr);
    }
}
