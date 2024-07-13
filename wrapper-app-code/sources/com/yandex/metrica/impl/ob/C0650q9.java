package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.StateSerializer;
import java.io.IOException;

/* renamed from: com.yandex.metrica.impl.ob.q9  reason: case insensitive filesystem */
public class C0650q9<T> implements StateSerializer<T> {

    /* renamed from: a  reason: collision with root package name */
    private final StateSerializer<T> f6551a;

    /* renamed from: b  reason: collision with root package name */
    private final C0806wm f6552b;

    public C0650q9(StateSerializer<T> stateSerializer, C0806wm wmVar) {
        this.f6551a = stateSerializer;
        this.f6552b = wmVar;
    }

    public T defaultValue() {
        return this.f6551a.defaultValue();
    }

    public byte[] toByteArray(T t) {
        try {
            return this.f6552b.a(this.f6551a.toByteArray(t));
        } catch (Throwable unused) {
            return new byte[0];
        }
    }

    public T toState(byte[] bArr) throws IOException {
        try {
            C0806wm wmVar = this.f6552b;
            wmVar.getClass();
            return this.f6551a.toState(wmVar.a(bArr, 0, bArr.length));
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
