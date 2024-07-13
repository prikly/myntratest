package io.bidmachine.nativead.utils;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class NativeNetworkExecutor implements Executor {
    private static NativeNetworkExecutor executor;
    private final ThreadPoolExecutor loaderExecutor;

    public static NativeNetworkExecutor getInstance() {
        if (executor == null) {
            executor = new NativeNetworkExecutor();
        }
        return executor;
    }

    private NativeNetworkExecutor() {
        int availableProcessors = Runtime.getRuntime().availableProcessors() * 2;
        int i = availableProcessors;
        this.loaderExecutor = new ThreadPoolExecutor(i, availableProcessors, 0, TimeUnit.MICROSECONDS, new LinkedBlockingQueue());
    }

    public void execute(Runnable runnable) {
        this.loaderExecutor.execute(runnable);
    }
}
