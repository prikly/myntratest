package com.yandex.metrica.impl.ob;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.yandex.metrica.IMetricaService;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.o1  reason: case insensitive filesystem */
public class C0593o1 {
    public static final long j = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: a  reason: collision with root package name */
    private final Context f6368a;

    /* renamed from: b  reason: collision with root package name */
    private final ICommonExecutor f6369b;

    /* renamed from: c  reason: collision with root package name */
    private boolean f6370c;

    /* renamed from: d  reason: collision with root package name */
    private final List<c> f6371d;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public IMetricaService f6372e;

    /* renamed from: f  reason: collision with root package name */
    private final Object f6373f;

    /* renamed from: g  reason: collision with root package name */
    private final C0857z1 f6374g;

    /* renamed from: h  reason: collision with root package name */
    private final Runnable f6375h;
    private final ServiceConnection i;

    /* renamed from: com.yandex.metrica.impl.ob.o1$a */
    class a implements Runnable {
        a() {
        }

        public void run() {
            C0593o1.a(C0593o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$b */
    class b implements ServiceConnection {
        b() {
        }

        public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            synchronized (C0593o1.this) {
                IMetricaService unused = C0593o1.this.f6372e = IMetricaService.a.a(iBinder);
            }
            C0593o1.b(C0593o1.this);
        }

        public void onServiceDisconnected(ComponentName componentName) {
            synchronized (C0593o1.this) {
                IMetricaService unused = C0593o1.this.f6372e = null;
            }
            C0593o1.c(C0593o1.this);
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.o1$c */
    interface c {
        void onServiceConnected();

        void onServiceDisconnected();
    }

    public C0593o1(Context context, ICommonExecutor iCommonExecutor) {
        this(context, iCommonExecutor, P.g().i());
    }

    static void c(C0593o1 o1Var) {
        for (c onServiceDisconnected : o1Var.f6371d) {
            onServiceDisconnected.onServiceDisconnected();
        }
    }

    public void b() {
        synchronized (this) {
            if (this.f6372e == null) {
                Intent a2 = C0569n2.a(this.f6368a);
                try {
                    this.f6374g.a(this.f6368a);
                    this.f6368a.bindService(a2, this.i, 1);
                } catch (Throwable unused) {
                }
            }
        }
    }

    public synchronized IMetricaService d() {
        return this.f6372e;
    }

    public synchronized boolean e() {
        return this.f6372e != null;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        synchronized (this.f6373f) {
            this.f6369b.remove(this.f6375h);
        }
    }

    public void g() {
        ICommonExecutor iCommonExecutor = this.f6369b;
        synchronized (this.f6373f) {
            iCommonExecutor.remove(this.f6375h);
            if (!this.f6370c) {
                iCommonExecutor.executeDelayed(this.f6375h, j);
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:1|2|(2:6|7)|8|9|(2:12|10)|18|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:8:0x0015 */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0023 A[LOOP:0: B:10:0x001d->B:12:0x0023, LOOP_END] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static void a(com.yandex.metrica.impl.ob.C0593o1 r3) {
        /*
            monitor-enter(r3)
            android.content.Context r0 = r3.f6368a     // Catch:{ all -> 0x002f }
            r1 = 0
            if (r0 == 0) goto L_0x0015
            boolean r0 = r3.e()     // Catch:{ all -> 0x002f }
            if (r0 == 0) goto L_0x0015
            r3.f6372e = r1     // Catch:{ all -> 0x0015 }
            android.content.Context r0 = r3.f6368a     // Catch:{ all -> 0x0015 }
            android.content.ServiceConnection r2 = r3.i     // Catch:{ all -> 0x0015 }
            r0.unbindService(r2)     // Catch:{ all -> 0x0015 }
        L_0x0015:
            r3.f6372e = r1     // Catch:{ all -> 0x002f }
            java.util.List<com.yandex.metrica.impl.ob.o1$c> r0 = r3.f6371d     // Catch:{ all -> 0x002f }
            java.util.Iterator r0 = r0.iterator()     // Catch:{ all -> 0x002f }
        L_0x001d:
            boolean r1 = r0.hasNext()     // Catch:{ all -> 0x002f }
            if (r1 == 0) goto L_0x002d
            java.lang.Object r1 = r0.next()     // Catch:{ all -> 0x002f }
            com.yandex.metrica.impl.ob.o1$c r1 = (com.yandex.metrica.impl.ob.C0593o1.c) r1     // Catch:{ all -> 0x002f }
            r1.onServiceDisconnected()     // Catch:{ all -> 0x002f }
            goto L_0x001d
        L_0x002d:
            monitor-exit(r3)
            return
        L_0x002f:
            r0 = move-exception
            monitor-exit(r3)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0593o1.a(com.yandex.metrica.impl.ob.o1):void");
    }

    C0593o1(Context context, ICommonExecutor iCommonExecutor, C0857z1 z1Var) {
        this.f6371d = new CopyOnWriteArrayList();
        this.f6372e = null;
        this.f6373f = new Object();
        this.f6375h = new a();
        this.i = new b();
        this.f6368a = context.getApplicationContext();
        this.f6369b = iCommonExecutor;
        this.f6370c = false;
        this.f6374g = z1Var;
    }

    public void c() {
        synchronized (this.f6373f) {
            this.f6370c = true;
            f();
        }
    }

    static void b(C0593o1 o1Var) {
        for (c onServiceConnected : o1Var.f6371d) {
            onServiceConnected.onServiceConnected();
        }
    }

    public void a(c cVar) {
        this.f6371d.add(cVar);
    }

    public void a() {
        synchronized (this.f6373f) {
            this.f6370c = false;
            g();
        }
    }
}
