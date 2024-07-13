package com.yandex.metrica.impl.ob;

import java.util.concurrent.Callable;

/* renamed from: com.yandex.metrica.impl.ob.dm  reason: case insensitive filesystem */
public abstract class C0340dm<T> implements Callable<T> {
    public abstract T a() throws Exception;

    public T call() {
        try {
            return a();
        } catch (Throwable unused) {
            return null;
        }
    }
}
