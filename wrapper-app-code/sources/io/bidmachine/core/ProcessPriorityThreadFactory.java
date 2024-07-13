package io.bidmachine.core;

import java.lang.Thread;
import java.util.concurrent.ThreadFactory;

final class ProcessPriorityThreadFactory implements ThreadFactory {
    private final int threadPriority;

    ProcessPriorityThreadFactory(int i) {
        this.threadPriority = i;
    }

    public Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(this.threadPriority);
        thread.setUncaughtExceptionHandler(new Thread.UncaughtExceptionHandler() {
            public void uncaughtException(Thread thread, Throwable th) {
                Logger.log(th);
            }
        });
        return thread;
    }
}
