package com.yandex.metrica.core.api.executors;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

public interface ICommonExecutor extends IInterruptionSafeThread, Executor {
    void execute(Runnable runnable);

    void executeDelayed(Runnable runnable, long j);

    void executeDelayed(Runnable runnable, long j, TimeUnit timeUnit);

    void remove(Runnable runnable);

    void removeAll();

    Future submit(Callable callable);
}
