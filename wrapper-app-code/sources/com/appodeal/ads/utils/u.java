package com.appodeal.ads.utils;

import java.util.concurrent.ThreadFactory;

public final class u implements ThreadFactory {
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setPriority(10);
        thread.setUncaughtExceptionHandler($$Lambda$syeNCHWyvCzmYC2DgCYYJqsEJvc.INSTANCE);
        return thread;
    }
}
