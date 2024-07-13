package com.applovin.impl.sdk;

import android.os.Process;
import java.lang.Thread;
import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

public class AppLovinExceptionHandler implements Thread.UncaughtExceptionHandler {

    /* renamed from: a  reason: collision with root package name */
    private static final AppLovinExceptionHandler f15134a = new AppLovinExceptionHandler();

    /* renamed from: b  reason: collision with root package name */
    private final Set<n> f15135b = new HashSet(2);

    /* renamed from: c  reason: collision with root package name */
    private final AtomicBoolean f15136c = new AtomicBoolean();

    /* renamed from: d  reason: collision with root package name */
    private Thread.UncaughtExceptionHandler f15137d;

    public static AppLovinExceptionHandler shared() {
        return f15134a;
    }

    public void addSdk(n nVar) {
        this.f15135b.add(nVar);
    }

    public void enable() {
        if (this.f15136c.compareAndSet(false, true)) {
            this.f15137d = Thread.getDefaultUncaughtExceptionHandler();
            Thread.setDefaultUncaughtExceptionHandler(this);
        }
    }

    public void uncaughtException(Thread thread, Throwable th) {
        for (n next : this.f15135b) {
            next.D();
            if (v.a()) {
                next.D().b("AppLovinExceptionHandler", "Detected unhandled exception");
            }
            ((EventServiceImpl) next.x()).trackEventSynchronously("paused");
            ((EventServiceImpl) next.x()).trackEventSynchronously("crashed");
        }
        try {
            Thread.sleep(100);
        } catch (InterruptedException unused) {
        }
        Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f15137d;
        if (uncaughtExceptionHandler != null) {
            uncaughtExceptionHandler.uncaughtException(thread, th);
            return;
        }
        Process.killProcess(Process.myPid());
        System.exit(1);
    }
}
