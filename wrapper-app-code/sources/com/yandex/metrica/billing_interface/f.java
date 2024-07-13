package com.yandex.metrica.billing_interface;

public abstract class f implements Runnable {
    public abstract void a() throws Throwable;

    public void run() {
        try {
            a();
        } catch (Throwable unused) {
        }
    }
}
