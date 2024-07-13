package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

public class Lm extends Thread implements IInterruptionSafeThread {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f4517a = true;

    public Lm() {
    }

    public synchronized boolean isRunning() {
        return this.f4517a;
    }

    public synchronized void stopRunning() {
        this.f4517a = false;
        interrupt();
    }

    public Lm(Runnable runnable, String str) {
        super(runnable, str);
    }

    public Lm(String str) {
        super(str);
    }
}
