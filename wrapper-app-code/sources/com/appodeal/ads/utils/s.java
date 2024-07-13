package com.appodeal.ads.utils;

import com.appodeal.ads.h0;
import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public final class s implements Executor {

    /* renamed from: b  reason: collision with root package name */
    public static final TimeUnit f17565b = TimeUnit.SECONDS;

    /* renamed from: c  reason: collision with root package name */
    public static final int f17566c;

    /* renamed from: d  reason: collision with root package name */
    public static final int f17567d;

    /* renamed from: e  reason: collision with root package name */
    public static s f17568e = new s();

    /* renamed from: a  reason: collision with root package name */
    public final ThreadPoolExecutor f17569a;

    public static final class a implements RejectedExecutionHandler {
        public a() {
        }

        public /* synthetic */ a(int i) {
            this();
        }

        public final void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            StringBuilder a2 = h0.a("Task ");
            a2.append(runnable.toString());
            a2.append(" rejected from ");
            a2.append(threadPoolExecutor.toString());
            Log.log(new com.appodeal.ads.utils.exception_handler.a(a2.toString()));
        }
    }

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        f17566c = Math.max(2, Math.min(availableProcessors - 1, 4));
        f17567d = (availableProcessors * 2) + 1;
    }

    public s() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        a aVar = new a(0);
        this.f17569a = new ThreadPoolExecutor(f17566c, f17567d, 1, f17565b, linkedBlockingQueue, new u(), aVar);
    }

    public final void execute(Runnable runnable) {
        this.f17569a.execute(runnable);
    }
}
