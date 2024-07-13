package com.yandex.metrica.core.api;

public interface StateSerializer {
    Object defaultValue();

    byte[] toByteArray(Object obj);

    Object toState(byte[] bArr);
}
