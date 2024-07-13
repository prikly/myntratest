package com.yandex.metrica.coreutils.services;

import android.os.SystemClock;

public class SystemTimeProvider implements TimeProvider {
    public long currentTimeMillis() {
        return System.currentTimeMillis();
    }

    public long currentTimeSeconds() {
        return System.currentTimeMillis() / 1000;
    }

    public long elapsedRealtime() {
        return SystemClock.elapsedRealtime();
    }

    public long systemNanoTime() {
        return System.nanoTime();
    }
}
