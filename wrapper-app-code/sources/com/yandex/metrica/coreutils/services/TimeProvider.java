package com.yandex.metrica.coreutils.services;

public interface TimeProvider {
    long currentTimeMillis();

    long currentTimeSeconds();

    long elapsedRealtime();
}
