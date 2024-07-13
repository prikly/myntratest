package com.criteo.publisher.e0;

import android.os.Handler;
import android.os.Looper;
import java.util.concurrent.Executor;

/* compiled from: RunOnUiThreadExecutor */
public class c implements Executor {

    /* renamed from: a  reason: collision with root package name */
    private final Handler f2397a = new Handler(Looper.getMainLooper());

    public void execute(Runnable runnable) {
        if (Thread.currentThread() == this.f2397a.getLooper().getThread()) {
            runnable.run();
        } else {
            this.f2397a.post(runnable);
        }
    }

    public void a(Runnable runnable) {
        this.f2397a.post(runnable);
    }
}
