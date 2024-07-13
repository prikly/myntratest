package com.bytedance.sdk.component.d.a;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: DefaultThreadFactory */
public class a implements ThreadFactory {

    /* renamed from: a  reason: collision with root package name */
    private final ThreadGroup f18940a;

    /* renamed from: b  reason: collision with root package name */
    private final AtomicInteger f18941b = new AtomicInteger(1);

    public a(String str) {
        this.f18940a = new ThreadGroup("tt_img_" + str);
    }

    public Thread newThread(Runnable runnable) {
        ThreadGroup threadGroup = this.f18940a;
        Thread thread = new Thread(threadGroup, runnable, "tt_img_" + this.f18941b.getAndIncrement());
        if (thread.isDaemon()) {
            thread.setDaemon(false);
        }
        return thread;
    }
}
