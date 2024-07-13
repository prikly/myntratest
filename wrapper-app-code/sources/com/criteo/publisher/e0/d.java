package com.criteo.publisher.e0;

import com.criteo.publisher.s;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ThreadPoolExecutorFactory */
public class d implements s.a<ThreadPoolExecutor> {
    /* renamed from: b */
    public ThreadPoolExecutor a() {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(1, 20, 3, TimeUnit.SECONDS, new SynchronousQueue(), Executors.defaultThreadFactory());
        threadPoolExecutor.setRejectedExecutionHandler(new b());
        return threadPoolExecutor;
    }

    /* compiled from: ThreadPoolExecutorFactory */
    private static class b implements RejectedExecutionHandler {

        /* renamed from: a  reason: collision with root package name */
        private ThreadPoolExecutor f2398a;

        private b() {
        }

        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            synchronized (this) {
                if (this.f2398a == null) {
                    this.f2398a = new ThreadPoolExecutor(5, 5, 3, TimeUnit.SECONDS, new LinkedBlockingQueue(), Executors.defaultThreadFactory());
                }
            }
            this.f2398a.execute(runnable);
        }
    }
}
