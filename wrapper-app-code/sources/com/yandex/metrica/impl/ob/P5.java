package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

public class P5 extends C0427h9<Af> {
    public Object defaultValue() {
        return new Af();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Af) MessageNano.mergeFrom(new Af(), bArr);
    }
}
