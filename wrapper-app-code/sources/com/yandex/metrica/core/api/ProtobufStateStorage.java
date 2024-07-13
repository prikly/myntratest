package com.yandex.metrica.core.api;

public interface ProtobufStateStorage {
    void delete();

    Object read();

    void save(Object obj);
}
