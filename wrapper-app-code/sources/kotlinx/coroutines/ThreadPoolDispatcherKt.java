package kotlinx.coroutines;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a\u0018\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0007\u001a\u0010\u0010\u0006\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0005H\u0007¨\u0006\u0007"}, d2 = {"newFixedThreadPoolContext", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "nThreads", "", "name", "", "newSingleThreadContext", "kotlinx-coroutines-core"}, k = 2, mv = {1, 6, 0}, xi = 48)
/* compiled from: ThreadPoolDispatcher.kt */
public final class ThreadPoolDispatcherKt {
    public static final ExecutorCoroutineDispatcher newSingleThreadContext(String str) {
        return newFixedThreadPoolContext(1, str);
    }

    public static final ExecutorCoroutineDispatcher newFixedThreadPoolContext(int i, String str) {
        boolean z = true;
        if (i < 1) {
            z = false;
        }
        if (z) {
            return ExecutorsKt.from(Executors.newScheduledThreadPool(i, new ThreadFactory(i, str, new AtomicInteger()) {
                public final /* synthetic */ int f$0;
                public final /* synthetic */ String f$1;
                public final /* synthetic */ AtomicInteger f$2;

                {
                    this.f$0 = r1;
                    this.f$1 = r2;
                    this.f$2 = r3;
                }

                public final Thread newThread(Runnable runnable) {
                    return ThreadPoolDispatcherKt.m63newFixedThreadPoolContext$lambda1(this.f$0, this.f$1, this.f$2, runnable);
                }
            }));
        }
        throw new IllegalArgumentException(("Expected at least one thread, but " + i + " specified").toString());
    }

    /* access modifiers changed from: private */
    /* renamed from: newFixedThreadPoolContext$lambda-1  reason: not valid java name */
    public static final Thread m63newFixedThreadPoolContext$lambda1(int i, String str, AtomicInteger atomicInteger, Runnable runnable) {
        if (i != 1) {
            str = str + '-' + atomicInteger.incrementAndGet();
        }
        Thread thread = new Thread(runnable, str);
        thread.setDaemon(true);
        return thread;
    }
}
