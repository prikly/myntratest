package com.yandex.metrica.core.api;

public interface Converter {
    Object fromModel(Object obj);

    Object toModel(Object obj);
}
