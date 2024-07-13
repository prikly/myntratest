package com.yandex.metrica.impl.ob;

import android.os.HandlerThread;
import com.yandex.metrica.core.api.executors.IInterruptionSafeThread;

public class Km extends HandlerThread implements IInterruptionSafeThread {

    /* renamed from: a  reason: collision with root package name */
    private volatile boolean f4444a = true;

    public Km(String str) {
        super(str);
    }

    public synchronized boolean isRunning() {
        return this.f4444a;
    }

    public synchronized void stopRunning() {
        this.f4444a = false;
        interrupt();
    }
}
