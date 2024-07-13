package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

public class Zd extends C0427h9<Cf> {
    public Object defaultValue() {
        return new Cf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Cf) MessageNano.mergeFrom(new Cf(), bArr);
    }
}
