package com.yandex.metrica.impl.ob;

import com.google.protobuf.nano.ym.MessageNano;
import com.yandex.metrica.core.api.ProtobufConverter;
import com.yandex.metrica.core.api.ProtobufStateSerializer;
import com.yandex.metrica.core.api.ProtobufStateStorage;

/* renamed from: com.yandex.metrica.impl.ob.l9  reason: case insensitive filesystem */
public class C0526l9<T, P extends MessageNano> implements ProtobufStateStorage<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f6129a;

    /* renamed from: b  reason: collision with root package name */
    private final R7 f6130b;

    /* renamed from: c  reason: collision with root package name */
    private final ProtobufStateSerializer<P> f6131c;

    /* renamed from: d  reason: collision with root package name */
    private final ProtobufConverter<T, P> f6132d;

    public C0526l9(String str, R7 r7, ProtobufStateSerializer<P> protobufStateSerializer, ProtobufConverter<T, P> protobufConverter) {
        this.f6129a = str;
        this.f6130b = r7;
        this.f6131c = protobufStateSerializer;
        this.f6132d = protobufConverter;
    }

    public void delete() {
        this.f6130b.b(this.f6129a);
    }

    public T read() {
        try {
            byte[] a2 = this.f6130b.a(this.f6129a);
            if (A2.a(a2)) {
                return this.f6132d.toModel(this.f6131c.defaultValue());
            }
            return this.f6132d.toModel(this.f6131c.toState(a2));
        } catch (Throwable unused) {
            return this.f6132d.toModel(this.f6131c.defaultValue());
        }
    }

    public void save(T t) {
        this.f6130b.a(this.f6129a, this.f6131c.toByteArray(this.f6132d.fromModel(t)));
    }
}
