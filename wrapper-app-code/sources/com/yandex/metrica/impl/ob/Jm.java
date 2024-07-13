package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;
import java.util.concurrent.TimeUnit;

public class Jm implements IHandlerExecutor {

    /* renamed from: a  reason: collision with root package name */
    private final Looper f4387a;

    /* renamed from: b  reason: collision with root package name */
    private final Handler f4388b;

    /* renamed from: c  reason: collision with root package name */
    private final Km f4389c;

    public Jm(String str) {
        this(a(str));
    }

    private static Km a(String str) {
        Km b2 = new Mm(str).b();
        b2.start();
        return b2;
    }

    public void execute(Runnable runnable) {
        this.f4388b.post(runnable);
    }

    public void executeDelayed(Runnable runnable, long j) {
        this.f4388b.postDelayed(runnable, TimeUnit.MILLISECONDS.toMillis(j));
    }

    public Handler getHandler() {
        return this.f4388b;
    }

    public Looper getLooper() {
        return this.f4387a;
    }

    public boolean isRunning() {
        return this.f4389c.isRunning();
    }

    public void remove(Runnable runnable) {
        this.f4388b.removeCallbacks(runnable);
    }

    public void removeAll() {
        this.f4388b.removeCallbacksAndMessages((Object) null);
    }

    public void stopRunning() {
        this.f4389c.stopRunning();
    }

    public <T> Future<T> submit(Callable<T> callable) {
        FutureTask futureTask = new FutureTask(callable);
        this.f4388b.post(futureTask);
        return futureTask;
    }

    Jm(Km km) {
        this(km, km.getLooper(), new Handler(km.getLooper()));
    }

    public Jm(Km km, Looper looper, Handler handler) {
        this.f4389c = km;
        this.f4387a = looper;
        this.f4388b = handler;
    }

    public void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit) {
        this.f4388b.postDelayed(runnable, timeUnit.toMillis(j));
    }
}
