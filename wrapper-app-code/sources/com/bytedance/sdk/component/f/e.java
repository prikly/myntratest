package com.bytedance.sdk.component.f;

import com.bytedance.sdk.component.f.a;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: TTExecutor */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public static final int f19224a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b  reason: collision with root package name */
    public static c f19225b;

    /* renamed from: c  reason: collision with root package name */
    public static int f19226c = 120;

    /* renamed from: d  reason: collision with root package name */
    public static boolean f19227d = true;

    /* renamed from: e  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19228e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19229f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile ThreadPoolExecutor f19230g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile ScheduledExecutorService f19231h;

    public static ExecutorService a() {
        return a(10);
    }

    public static ExecutorService a(int i) {
        if (f19228e == null) {
            synchronized (e.class) {
                if (f19228e == null) {
                    f19228e = new a.C0234a().a("io").a(4).b(i).a(40).a(TimeUnit.SECONDS).a((BlockingQueue<Runnable>) new PriorityBlockingQueue(f19224a)).a(f()).a();
                    f19228e.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f19228e;
    }

    public static void a(g gVar) {
        if (f19228e == null) {
            a();
        }
        if (f19228e != null) {
            f19228e.execute(gVar);
        }
    }

    public static void a(g gVar, int i) {
        if (f19228e == null) {
            a();
        }
        if (gVar != null && f19228e != null) {
            gVar.a(i);
            f19228e.execute(gVar);
        }
    }

    public static void a(g gVar, int i, int i2) {
        if (f19228e == null) {
            a(i2);
        }
        if (gVar != null && f19228e != null) {
            gVar.a(i);
            f19228e.execute(gVar);
        }
    }

    public static ExecutorService b() {
        if (f19229f == null) {
            synchronized (e.class) {
                if (f19229f == null) {
                    f19229f = new a.C0234a().a("log").b(10).a(2).a(40).a(TimeUnit.SECONDS).a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).a(f()).a();
                    f19229f.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f19229f;
    }

    public static void b(g gVar) {
        if (f19229f == null) {
            b();
        }
        if (f19229f != null) {
            f19229f.execute(gVar);
        }
    }

    public static void b(g gVar, int i) {
        if (f19229f == null) {
            b();
        }
        if (gVar != null && f19229f != null) {
            gVar.a(i);
            f19229f.execute(gVar);
        }
    }

    public static void c(g gVar, int i) {
        if (f19230g == null) {
            c();
        }
        if (gVar != null && f19230g != null) {
            gVar.a(i);
            f19230g.execute(gVar);
        }
    }

    public static ExecutorService c() {
        if (f19230g == null) {
            synchronized (e.class) {
                if (f19230g == null) {
                    f19230g = new a.C0234a().a("aidl").b(10).a(2).a(30).a(TimeUnit.SECONDS).a((BlockingQueue<Runnable>) new PriorityBlockingQueue()).a(f()).a();
                    f19230g.allowCoreThreadTimeOut(true);
                }
            }
        }
        return f19230g;
    }

    public static ScheduledExecutorService d() {
        if (f19231h == null) {
            synchronized (e.class) {
                if (f19231h == null) {
                    f19231h = Executors.newSingleThreadScheduledExecutor(new h(5, "scheduled"));
                }
            }
        }
        return f19231h;
    }

    public static boolean e() {
        return f19227d;
    }

    public static void a(boolean z) {
        f19227d = z;
    }

    public static RejectedExecutionHandler f() {
        return new RejectedExecutionHandler() {
            public void rejectedExecution(Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {
            }
        };
    }

    public static c g() {
        return f19225b;
    }

    public static void a(c cVar) {
        f19225b = cVar;
    }

    public static void b(int i) {
        f19226c = i;
    }
}
