package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufStateSerializer;

/* renamed from: com.yandex.metrica.impl.ob.h9  reason: case insensitive filesystem */
public abstract class C0427h9<T extends MessageNano> implements ProtobufStateSerializer<T> {
    public byte[] toByteArray(Object obj) {
        return MessageNano.toByteArray((MessageNano) obj);
    }
}
