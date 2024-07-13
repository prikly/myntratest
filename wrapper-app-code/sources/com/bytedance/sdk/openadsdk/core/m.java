package com.bytedance.sdk.openadsdk.core;

import android.app.Application;
import android.content.Context;
import com.bytedance.sdk.component.utils.l;
import com.bytedance.sdk.component.utils.o;
import com.bytedance.sdk.openadsdk.b.c;
import com.bytedance.sdk.openadsdk.b.d;
import com.bytedance.sdk.openadsdk.b.g;
import com.bytedance.sdk.openadsdk.b.h;
import com.bytedance.sdk.openadsdk.b.q;
import com.bytedance.sdk.openadsdk.b.r;
import com.bytedance.sdk.openadsdk.b.s;
import com.bytedance.sdk.openadsdk.b.t;
import com.bytedance.sdk.openadsdk.core.i.e;
import com.bytedance.sdk.openadsdk.core.i.f;
import com.bytedance.sdk.openadsdk.h.c.c;
import com.bytedance.sdk.openadsdk.k.h;
import com.bytedance.sdk.openadsdk.multipro.b;
import java.lang.reflect.Method;

/* compiled from: InternalContainer */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public static int f1375a = 8;

    /* renamed from: b  reason: collision with root package name */
    private static volatile c<com.bytedance.sdk.openadsdk.b.a> f1376b;

    /* renamed from: c  reason: collision with root package name */
    private static volatile c<c.a> f1377c;

    /* renamed from: d  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.b.c<c.a> f1378d;

    /* renamed from: e  reason: collision with root package name */
    private static volatile n<com.bytedance.sdk.openadsdk.b.a> f1379e;

    /* renamed from: f  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.k.a f1380f;

    /* renamed from: g  reason: collision with root package name */
    private static volatile com.bytedance.sdk.openadsdk.h.c.a f1381g;

    /* renamed from: h  reason: collision with root package name */
    private static volatile Context f1382h;
    private static volatile f i;

    public static synchronized Context a() {
        Context context;
        synchronized (m.class) {
            if (f1382h == null) {
                a((Context) null);
            }
            context = f1382h;
        }
        return context;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0031, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void a(android.content.Context r2) {
        /*
            java.lang.Class<com.bytedance.sdk.openadsdk.core.m> r0 = com.bytedance.sdk.openadsdk.core.m.class
            monitor-enter(r0)
            android.content.Context r1 = f1382h     // Catch:{ all -> 0x0032 }
            if (r1 != 0) goto L_0x0030
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.m.a.a()     // Catch:{ all -> 0x0032 }
            if (r1 == 0) goto L_0x001a
            android.app.Application r1 = com.bytedance.sdk.openadsdk.core.m.a.a()     // Catch:{ all -> 0x0019 }
            f1382h = r1     // Catch:{ all -> 0x0019 }
            android.content.Context r1 = f1382h     // Catch:{ all -> 0x0019 }
            if (r1 == 0) goto L_0x001a
            monitor-exit(r0)
            return
        L_0x0019:
        L_0x001a:
            if (r2 == 0) goto L_0x0030
            android.content.Context r2 = r2.getApplicationContext()     // Catch:{ all -> 0x0032 }
            f1382h = r2     // Catch:{ all -> 0x0032 }
            android.content.Context r2 = a()     // Catch:{ all -> 0x0032 }
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)     // Catch:{ all -> 0x0032 }
            int r2 = r2.getScaledTouchSlop()     // Catch:{ all -> 0x0032 }
            f1375a = r2     // Catch:{ all -> 0x0032 }
        L_0x0030:
            monitor-exit(r0)
            return
        L_0x0032:
            r2 = move-exception
            monitor-exit(r0)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.sdk.openadsdk.core.m.a(android.content.Context):void");
    }

    public static void b() {
        f1376b = null;
        f1380f = null;
        f1381g = null;
    }

    public static com.bytedance.sdk.openadsdk.b.c<com.bytedance.sdk.openadsdk.b.a> c() {
        if (!e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.c();
        }
        if (f1376b == null) {
            synchronized (m.class) {
                if (f1376b == null) {
                    if (b.c()) {
                        f1376b = new d();
                    } else {
                        f1376b = new com.bytedance.sdk.openadsdk.b.c<>(new g(f1382h), f(), j(), b(f1382h));
                    }
                }
            }
        }
        return f1376b;
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> d() {
        if (!e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.d();
        }
        if (f1378d == null) {
            synchronized (m.class) {
                if (f1378d == null) {
                    if (b.c()) {
                        f1378d = new r(false);
                    } else {
                        f1378d = a("ttad_bk_batch_stats", "AdStatsEventBatchThread", false);
                    }
                }
            }
        }
        return f1378d;
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> e() {
        if (!e.a()) {
            return com.bytedance.sdk.openadsdk.b.c.d();
        }
        if (f1377c == null) {
            synchronized (m.class) {
                if (f1377c == null) {
                    if (b.c()) {
                        f1377c = new r(true);
                    } else {
                        f1377c = a("ttad_bk_stats", "AdStatsEventThread", true);
                    }
                }
            }
        }
        return f1377c;
    }

    public static n<com.bytedance.sdk.openadsdk.b.a> f() {
        if (f1379e == null) {
            synchronized (m.class) {
                if (f1379e == null) {
                    f1379e = new o(f1382h);
                }
            }
        }
        return f1379e;
    }

    public static com.bytedance.sdk.openadsdk.k.a g() {
        if (!e.a()) {
            return com.bytedance.sdk.openadsdk.k.b.d();
        }
        if (f1380f == null) {
            synchronized (com.bytedance.sdk.openadsdk.k.a.class) {
                if (f1380f == null) {
                    if (b.c()) {
                        f1380f = new com.bytedance.sdk.openadsdk.k.c();
                    } else {
                        f1380f = new com.bytedance.sdk.openadsdk.k.b(f1382h, new h(f1382h));
                    }
                }
            }
        }
        return f1380f;
    }

    private static h.c j() {
        return h.c.a();
    }

    public static com.bytedance.sdk.openadsdk.b.c<c.a> a(String str, String str2, boolean z) {
        com.bytedance.sdk.openadsdk.b.f fVar;
        h.c cVar;
        if (z) {
            fVar = new s(f1382h);
            cVar = h.c.a();
        } else {
            cVar = h.c.b();
            fVar = new q(f1382h);
        }
        h.b b2 = b(f1382h);
        return new com.bytedance.sdk.openadsdk.b.c(fVar, (n) null, cVar, b2, new t(str, str2, fVar, (n) null, cVar, b2));
    }

    private static h.b b(final Context context) {
        return new h.b() {
            public boolean a() {
                Context context = context;
                if (context == null) {
                    context = m.a();
                }
                return o.a(context);
            }
        };
    }

    public static f h() {
        if (i == null) {
            synchronized (f.class) {
                if (i == null) {
                    i = new f();
                }
            }
        }
        return i;
    }

    public static com.bytedance.sdk.openadsdk.h.c.a i() {
        if (!e.a()) {
            return com.bytedance.sdk.openadsdk.h.c.c.c();
        }
        if (f1381g == null) {
            synchronized (com.bytedance.sdk.openadsdk.h.c.c.class) {
                if (f1381g == null) {
                    if (b.c()) {
                        f1381g = new com.bytedance.sdk.openadsdk.h.c.d();
                    } else {
                        f1381g = new com.bytedance.sdk.openadsdk.h.c.c();
                    }
                }
            }
        }
        return f1381g;
    }

    /* compiled from: InternalContainer */
    private static class a {

        /* renamed from: a  reason: collision with root package name */
        private static volatile Application f1384a;

        public static Application a() {
            return f1384a;
        }

        static {
            try {
                Object b2 = b();
                f1384a = (Application) b2.getClass().getMethod("getApplication", new Class[0]).invoke(b2, new Object[0]);
                l.e("MyApplication", "application get success");
            } catch (Throwable th) {
                l.c("MyApplication", "application get failed", th);
            }
        }

        private static Object b() {
            try {
                Method method = Class.forName("android.app.ActivityThread").getMethod("currentActivityThread", new Class[0]);
                method.setAccessible(true);
                return method.invoke((Object) null, new Object[0]);
            } catch (Throwable th) {
                l.c("MyApplication", "ActivityThread get error, maybe api level <= 4.2.2", th);
                return null;
            }
        }
    }
}
