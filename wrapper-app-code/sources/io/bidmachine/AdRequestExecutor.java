package io.bidmachine;

import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

class AdRequestExecutor extends ThreadPoolExecutor {
    private static volatile AdRequestExecutor instance;

    public static AdRequestExecutor get() {
        if (instance == null) {
            synchronized (AdRequestExecutor.class) {
                if (instance == null) {
                    instance = new AdRequestExecutor(Runtime.getRuntime().availableProcessors() * 2);
                }
            }
        }
        return instance;
    }

    AdRequestExecutor(int i) {
        super(i, i, 0, TimeUnit.MILLISECONDS, new LinkedBlockingQueue());
    }
}
