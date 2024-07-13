package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.g9  reason: case insensitive filesystem */
public class C0402g9 extends C0427h9<C0799wf> {
    public Object defaultValue() {
        return new C0799wf();
    }

    public Object toState(byte[] bArr) throws IOException {
        return (C0799wf) MessageNano.mergeFrom(new C0799wf(), bArr);
    }
}
