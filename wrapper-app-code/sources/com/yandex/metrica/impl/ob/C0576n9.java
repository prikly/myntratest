package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

@Deprecated
/* renamed from: com.yandex.metrica.impl.ob.n9  reason: case insensitive filesystem */
public class C0576n9 extends C0427h9<Ef> {
    public Object defaultValue() {
        return new Ef();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Ef) MessageNano.mergeFrom(new Ef(), bArr);
    }
}
