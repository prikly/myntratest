package com.bytedance.sdk.component.b.a.a.a;

import com.bytedance.sdk.component.b.a.b;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: NetDispatcher */
public class d extends com.bytedance.sdk.component.b.a.d {

    /* renamed from: a  reason: collision with root package name */
    private ExecutorService f18853a;

    /* renamed from: b  reason: collision with root package name */
    private List<b> f18854b = new CopyOnWriteArrayList();

    /* renamed from: c  reason: collision with root package name */
    private List<b> f18855c = new CopyOnWriteArrayList();

    /* renamed from: d  reason: collision with root package name */
    private AtomicInteger f18856d = new AtomicInteger(64);

    public d() {
        if (this.f18853a == null) {
            this.f18853a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 20, TimeUnit.SECONDS, new SynchronousQueue(), new ThreadFactory() {
                public Thread newThread(Runnable runnable) {
                    Thread thread = new Thread(runnable, "systemHttp Dispatcher");
                    thread.setDaemon(false);
                    thread.setPriority(10);
                    return thread;
                }
            });
        }
    }

    public ExecutorService b() {
        return this.f18853a;
    }

    public void a(int i) {
        this.f18856d.set(i);
    }

    public List<b> c() {
        return this.f18854b;
    }

    public List<b> d() {
        return this.f18855c;
    }

    public int a() {
        return this.f18856d.get();
    }
}
