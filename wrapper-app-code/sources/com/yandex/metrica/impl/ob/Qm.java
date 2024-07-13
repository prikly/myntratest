package com.yandex.metrica.impl.ob;

public class Qm extends Gm {
    public synchronized void execute(Runnable runnable) {
        if (runnable != null) {
            runnable.run();
        }
    }
}
