package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.k9  reason: case insensitive filesystem */
public class C0501k9 extends C0427h9<Bf> {
    public Object defaultValue() {
        return new Bf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Bf) MessageNano.mergeFrom(new Bf(), bArr);
    }
}
