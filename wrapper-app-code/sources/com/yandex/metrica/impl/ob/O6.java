package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufConverter;

public class O6<T> {

    /* renamed from: a  reason: collision with root package name */
    private final ProtobufConverter<T, ? extends MessageNano> f4639a;

    O6(ProtobufConverter<T, ? extends MessageNano> protobufConverter) {
        this.f4639a = protobufConverter;
    }

    public byte[] a(T t) {
        return MessageNano.toByteArray((MessageNano) this.f4639a.fromModel(t));
    }
}
