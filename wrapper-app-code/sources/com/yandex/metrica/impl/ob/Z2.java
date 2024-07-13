package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

public class Z2 extends C0427h9<C0823xf> {
    public Object defaultValue() {
        return new C0823xf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C0823xf) MessageNano.mergeFrom(new C0823xf(), bArr);
    }
}
