package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.impl.ob.If;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.p9  reason: case insensitive filesystem */
public class C0626p9 extends C0427h9<If> {
    public Object defaultValue() {
        If ifR = new If();
        ifR.k = new If.i();
        return ifR;
    }

    public Object toState(byte[] bArr) throws IOException {
        return (If) MessageNano.mergeFrom(new If(), bArr);
    }
}
