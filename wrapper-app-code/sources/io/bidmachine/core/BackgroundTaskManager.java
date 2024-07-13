package io.bidmachine.core;

import java.util.concurrent.Executor;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

public class BackgroundTaskManager implements Executor {
    private static final int CORE_POOL_SIZE;
    private static final int CPU_COUNT;
    private static final int KEEP_ALIVE_TIME = 1;
    private static final TimeUnit KEEP_ALIVE_TIME_UNIT = TimeUnit.SECONDS;
    private static final int MAXIMUM_POOL_SIZE = ((CPU_COUNT * 2) + 1);
    private static final BackgroundTaskManager instance = new BackgroundTaskManager();
    private final ThreadPoolExecutor serviceTaskThreadPool;

    static {
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        CPU_COUNT = availableProcessors;
        CORE_POOL_SIZE = Math.max(2, Math.min(availableProcessors - 1, 4));
    }

    public static void async(Runnable runnable) {
        instance.execute(runnable);
    }

    private BackgroundTaskManager() {
        LinkedBlockingQueue linkedBlockingQueue = new LinkedBlockingQueue();
        BidMachineRejectedExecutionHandler bidMachineRejectedExecutionHandler = new BidMachineRejectedExecutionHandler();
        this.serviceTaskThreadPool = new ThreadPoolExecutor(CORE_POOL_SIZE, MAXIMUM_POOL_SIZE, 1, KEEP_ALIVE_TIME_UNIT, linkedBlockingQueue, new ProcessPriorityThreadFactory(10), bidMachineRejectedExecutionHandler);
    }

    public void execute(Runnable runnable) {
        this.serviceTaskThreadPool.execute(runnable);
    }

    private static final class BidMachineRejectedExecutionHandler implements RejectedExecutionHandler {
        public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
        }

        private BidMachineRejectedExecutionHandler() {
        }
    }
}
