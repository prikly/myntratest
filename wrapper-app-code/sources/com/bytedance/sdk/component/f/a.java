package com.bytedance.sdk.component.f;

import android.os.Looper;
import android.text.TextUtils;
import com.bytedance.sdk.component.utils.l;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: ADThreadPoolExecutor */
class a extends ThreadPoolExecutor {

    /* renamed from: a  reason: collision with root package name */
    private String f19196a;

    public a(String str, int i, int i2, long j, TimeUnit timeUnit, BlockingQueue<Runnable> blockingQueue, ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        super(i, i2, j, timeUnit, blockingQueue, threadFactory, rejectedExecutionHandler);
        this.f19196a = str;
    }

    private void a(Runnable runnable) {
        try {
            super.execute(runnable);
        } catch (OutOfMemoryError e2) {
            a(runnable, e2);
        } catch (Throwable th) {
            a(runnable, th);
        }
    }

    private void a(Runnable runnable, OutOfMemoryError outOfMemoryError) {
        a(runnable, (Throwable) outOfMemoryError);
    }

    private void a(Runnable runnable, Throwable th) {
        if (Looper.myLooper() != Looper.getMainLooper()) {
            try {
                runnable.run();
            } catch (Throwable th2) {
                l.c("", "try exc failed", th2);
            }
        }
    }

    private void a(BlockingQueue<Runnable> blockingQueue, int i) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() <= 0) {
            try {
                setCorePoolSize(i);
                l.a("ADThreadPoolExecutor", "reduceCoreThreadSize: reduce poolType =  ", this.f19196a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e2) {
                l.c("ADThreadPoolExecutor", e2.getMessage());
            }
        }
    }

    private void a(BlockingQueue<Runnable> blockingQueue, int i, int i2) {
        if (getCorePoolSize() != i && blockingQueue != null && blockingQueue.size() >= i2) {
            try {
                setCorePoolSize(i);
                l.a("ADThreadPoolExecutor", "increaseCoreThreadSize: increase poolType =  ", this.f19196a, " coreSize=", Integer.valueOf(getCorePoolSize()), "  maxSize=", Integer.valueOf(getMaximumPoolSize()));
            } catch (Exception e2) {
                l.c("ADThreadPoolExecutor", e2.getMessage());
            }
        }
    }

    public void execute(final Runnable runnable) {
        BlockingQueue queue;
        if (runnable instanceof g) {
            a(new b((g) runnable, this));
        } else {
            a(new b(new g(DtbDeviceDataRetriever.ORIENTATION_UNKNOWN) {
                public void run() {
                    runnable.run();
                }
            }, this));
        }
        if (e.e() && !TextUtils.isEmpty(this.f19196a) && (queue = getQueue()) != null) {
            String str = this.f19196a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c2 = 1;
                    }
                } else if (str.equals("log")) {
                    c2 = 2;
                }
            } else if (str.equals("io")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a(queue, e.f19224a + 2, getCorePoolSize() * 2);
            } else if (c2 == 1) {
                a(queue, 5, 5);
            } else if (c2 == 2) {
                a(queue, 6, 6);
            }
        }
    }

    /* access modifiers changed from: protected */
    public void afterExecute(Runnable runnable, Throwable th) {
        BlockingQueue queue;
        super.afterExecute(runnable, th);
        if (e.e() && !TextUtils.isEmpty(this.f19196a) && (queue = getQueue()) != null) {
            String str = this.f19196a;
            char c2 = 65535;
            int hashCode = str.hashCode();
            if (hashCode != 3366) {
                if (hashCode != 107332) {
                    if (hashCode == 2993840 && str.equals("aidl")) {
                        c2 = 1;
                    }
                } else if (str.equals("log")) {
                    c2 = 2;
                }
            } else if (str.equals("io")) {
                c2 = 0;
            }
            if (c2 == 0) {
                a((BlockingQueue<Runnable>) queue, 4);
            } else if (c2 == 1) {
                a((BlockingQueue<Runnable>) queue, 2);
            } else if (c2 == 2) {
                a((BlockingQueue<Runnable>) queue, 2);
            }
        }
    }

    public List<Runnable> shutdownNow() {
        if ("io".equals(this.f19196a) || "aidl".equals(this.f19196a)) {
            return Collections.emptyList();
        }
        return super.shutdownNow();
    }

    public void shutdown() {
        if (!"io".equals(this.f19196a) && !"aidl".equals(this.f19196a)) {
            super.shutdown();
        }
    }

    public String a() {
        return this.f19196a;
    }

    /* renamed from: com.bytedance.sdk.component.f.a$a  reason: collision with other inner class name */
    /* compiled from: ADThreadPoolExecutor */
    public static class C0234a {

        /* renamed from: a  reason: collision with root package name */
        private String f19199a = "io";

        /* renamed from: b  reason: collision with root package name */
        private int f19200b = 1;

        /* renamed from: c  reason: collision with root package name */
        private long f19201c = 30;

        /* renamed from: d  reason: collision with root package name */
        private TimeUnit f19202d = TimeUnit.SECONDS;

        /* renamed from: e  reason: collision with root package name */
        private int f19203e = Integer.MAX_VALUE;

        /* renamed from: f  reason: collision with root package name */
        private BlockingQueue<Runnable> f19204f = null;

        /* renamed from: g  reason: collision with root package name */
        private ThreadFactory f19205g = null;

        /* renamed from: h  reason: collision with root package name */
        private RejectedExecutionHandler f19206h;
        private int i = 5;

        public C0234a a(String str) {
            this.f19199a = str;
            return this;
        }

        public C0234a a(int i2) {
            this.f19200b = i2;
            return this;
        }

        public C0234a a(long j) {
            this.f19201c = j;
            return this;
        }

        public C0234a a(TimeUnit timeUnit) {
            this.f19202d = timeUnit;
            return this;
        }

        public C0234a a(BlockingQueue<Runnable> blockingQueue) {
            this.f19204f = blockingQueue;
            return this;
        }

        public C0234a a(RejectedExecutionHandler rejectedExecutionHandler) {
            this.f19206h = rejectedExecutionHandler;
            return this;
        }

        public C0234a b(int i2) {
            this.i = i2;
            return this;
        }

        public a a() {
            if (this.f19205g == null) {
                this.f19205g = new h(this.i, this.f19199a);
            }
            if (this.f19206h == null) {
                this.f19206h = e.f();
            }
            if (this.f19204f == null) {
                this.f19204f = new LinkedBlockingQueue();
            }
            return new a(this.f19199a, this.f19200b, this.f19203e, this.f19201c, this.f19202d, this.f19204f, this.f19205g, this.f19206h);
        }
    }
}
