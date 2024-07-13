package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.o9  reason: case insensitive filesystem */
public class C0601o9 extends C0427h9<Ff> {
    public Object defaultValue() {
        return new Ff();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Ff) MessageNano.mergeFrom(new Ff(), bArr);
    }
}
