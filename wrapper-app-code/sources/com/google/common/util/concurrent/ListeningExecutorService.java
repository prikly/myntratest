package com.google.common.util.concurrent;

import com.google.errorprone.annotations.DoNotMock;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

@DoNotMock("Use TestingExecutors.sameThreadScheduledExecutor, or wrap a real Executor from java.util.concurrent.Executors with MoreExecutors.listeningDecorator")
public interface ListeningExecutorService extends ExecutorService {

    /* renamed from: com.google.common.util.concurrent.ListeningExecutorService$-CC  reason: invalid class name */
    public final /* synthetic */ class CC {
    }

    ListenableFuture<?> submit(Runnable runnable);

    <T> ListenableFuture<T> submit(Runnable runnable, T t);

    <T> ListenableFuture<T> submit(Callable<T> callable);
}
