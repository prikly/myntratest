package androidx.core.provider;

import android.os.Handler;
import android.os.Process;
import androidx.core.util.Consumer;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

class RequestExecutor {
    static <T> void execute(Executor executor, Callable<T> callable, Consumer<T> consumer) {
        executor.execute(new ReplyRunnable(CalleeHandler.create(), callable, consumer));
    }

    static <T> T submit(ExecutorService executorService, Callable<T> callable, int i) throws InterruptedException {
        try {
            return executorService.submit(callable).get((long) i, TimeUnit.MILLISECONDS);
        } catch (ExecutionException e2) {
            throw new RuntimeException(e2);
        } catch (InterruptedException e3) {
            throw e3;
        } catch (TimeoutException unused) {
            throw new InterruptedException("timeout");
        }
    }

    static ThreadPoolExecutor createDefaultExecutor(String str, int i, int i2) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, (long) i2, TimeUnit.MILLISECONDS, new LinkedBlockingDeque(), new DefaultThreadFactory(str, i));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        return threadPoolExecutor;
    }

    private static class ReplyRunnable<T> implements Runnable {
        private Callable<T> mCallable;
        private Consumer<T> mConsumer;
        private Handler mHandler;

        ReplyRunnable(Handler handler, Callable<T> callable, Consumer<T> consumer) {
            this.mCallable = callable;
            this.mConsumer = consumer;
            this.mHandler = handler;
        }

        public void run() {
            final T t;
            try {
                t = this.mCallable.call();
            } catch (Exception unused) {
                t = null;
            }
            final Consumer<T> consumer = this.mConsumer;
            this.mHandler.post(new Runnable() {
                public void run() {
                    consumer.accept(t);
                }
            });
        }
    }

    private static class DefaultThreadFactory implements ThreadFactory {
        private int mPriority;
        private String mThreadName;

        DefaultThreadFactory(String str, int i) {
            this.mThreadName = str;
            this.mPriority = i;
        }

        public Thread newThread(Runnable runnable) {
            return new ProcessPriorityThread(runnable, this.mThreadName, this.mPriority);
        }

        private static class ProcessPriorityThread extends Thread {
            private final int mPriority;

            ProcessPriorityThread(Runnable runnable, String str, int i) {
                super(runnable, str);
                this.mPriority = i;
            }

            public void run() {
                Process.setThreadPriority(this.mPriority);
                super.run();
            }
        }
    }
}
