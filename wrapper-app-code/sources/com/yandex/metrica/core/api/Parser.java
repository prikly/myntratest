package com.yandex.metrica.core.api;

public interface Parser {

    public final class DefaultImpls {
    }

    Object parse(Object obj);

    Object parseOrNull(Object obj);
}
