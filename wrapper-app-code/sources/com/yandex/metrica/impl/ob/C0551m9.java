package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.m9  reason: case insensitive filesystem */
public class C0551m9 extends C0427h9<Df> {
    public Object defaultValue() {
        return new Df();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (Df) MessageNano.mergeFrom(new Df(), bArr);
    }
}
