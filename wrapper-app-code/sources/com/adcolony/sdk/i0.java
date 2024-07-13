package com.adcolony.sdk;

import android.content.Context;
import com.adcolony.sdk.e0;
import com.unity3d.services.core.request.metrics.MetricCommonTags;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

class i0 {

    /* renamed from: a  reason: collision with root package name */
    private final LinkedHashMap<Integer, k0> f10094a = new LinkedHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    private int f10095b = 2;

    /* renamed from: c  reason: collision with root package name */
    private final HashMap<String, ArrayList<j0>> f10096c = new HashMap<>();

    /* renamed from: d  reason: collision with root package name */
    private int f10097d = 1;
    /* access modifiers changed from: private */

    /* renamed from: e  reason: collision with root package name */
    public final LinkedBlockingQueue<f1> f10098e = new LinkedBlockingQueue<>();
    /* access modifiers changed from: private */

    /* renamed from: f  reason: collision with root package name */
    public boolean f10099f = false;

    /* renamed from: g  reason: collision with root package name */
    private final ScheduledExecutorService f10100g = Executors.newSingleThreadScheduledExecutor();

    /* renamed from: h  reason: collision with root package name */
    private final ExecutorService f10101h = Executors.newSingleThreadExecutor();
    private ScheduledFuture<?> i;

    class a implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ Context f10102a;

        a(Context context) {
            this.f10102a = context;
        }

        public void run() {
            f1 b2 = a.b().u().b();
            f1 b3 = c0.b();
            c0.a(b2, "os_name", MetricCommonTags.METRIC_COMMON_TAG_PLATFORM_ANDROID);
            c0.a(b3, "filepath", a.b().z().a() + "7bf3a1e7bbd31e612eda3310c2cdb8075c43c6b5");
            c0.a(b3, "info", b2);
            c0.b(b3, "m_origin", 0);
            c0.b(b3, "m_id", i0.a(i0.this));
            c0.a(b3, "m_type", "Controller.create");
            try {
                l.b(this.f10102a, new h0(b3));
            } catch (RuntimeException e2) {
                e0.a aVar = new e0.a();
                aVar.a(e2.toString() + ": during WebView initialization.").a(" Disabling AdColony.").a(e0.f10045h);
                AdColony.disable();
            }
        }
    }

    class b implements Runnable {
        b() {
        }

        public void run() {
            while (true) {
                try {
                    f1 f1Var = (f1) i0.this.f10098e.poll(60, TimeUnit.SECONDS);
                    if (f1Var != null) {
                        i0.this.b(f1Var);
                    } else {
                        synchronized (i0.this.f10098e) {
                            if (i0.this.f10098e.peek() == null) {
                                boolean unused = i0.this.f10099f = false;
                                return;
                            }
                        }
                    }
                } catch (InterruptedException e2) {
                    new e0.a().a("Native messages thread was interrupted: ").a(e2.toString()).a(e0.i);
                }
            }
        }
    }

    class c implements Runnable {
        c() {
        }

        public void run() {
            a.f();
            if (!i0.this.f()) {
                i0.this.i();
            }
        }
    }

    class d implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ String f10106a;

        /* renamed from: b  reason: collision with root package name */
        final /* synthetic */ f1 f10107b;

        d(String str, f1 f1Var) {
            this.f10106a = str;
            this.f10107b = f1Var;
        }

        public void run() {
            i0.this.a(this.f10106a, this.f10107b);
        }
    }

    i0() {
    }

    static /* synthetic */ int a(i0 i0Var) {
        int i2 = i0Var.f10097d;
        i0Var.f10097d = i2 + 1;
        return i2;
    }

    private void g() {
        if (this.i == null) {
            try {
                this.i = this.f10100g.scheduleAtFixedRate(new c(), 0, 17, TimeUnit.MILLISECONDS);
            } catch (RejectedExecutionException e2) {
                new e0.a().a("Error when scheduling message pumping").a(e2.toString()).a(e0.i);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c(f1 f1Var) {
        try {
            if (f1Var.c("m_id", this.f10097d)) {
                this.f10097d++;
            }
            f1Var.c("m_origin", 0);
            int b2 = f1Var.b("m_target");
            if (b2 == 0) {
                a(f1Var);
                return;
            }
            k0 k0Var = this.f10094a.get(Integer.valueOf(b2));
            if (k0Var != null) {
                k0Var.a(f1Var);
            }
        } catch (JSONException e2) {
            new e0.a().a("JSON error in ADCMessageDispatcher's sendMessage(): ").a(e2.toString()).a(e0.i);
        }
    }

    /* access modifiers changed from: package-private */
    public LinkedHashMap<Integer, k0> d() {
        return this.f10094a;
    }

    /* access modifiers changed from: package-private */
    public int e() {
        int i2 = this.f10095b;
        this.f10095b = i2 + 1;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public boolean f() {
        for (k0 a2 : this.f10094a.values()) {
            if (a2.a()) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public void h() {
        if (f()) {
            g();
        }
    }

    /* access modifiers changed from: package-private */
    public void i() {
        ScheduledFuture<?> scheduledFuture = this.i;
        if (scheduledFuture != null) {
            if (!scheduledFuture.isCancelled()) {
                this.i.cancel(false);
            }
            this.i = null;
        }
    }

    /* access modifiers changed from: package-private */
    public void j() {
        synchronized (this.f10094a) {
            ArrayList arrayList = new ArrayList(this.f10094a.values());
            Collections.reverse(arrayList);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ((k0) it.next()).b();
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(String str, j0 j0Var) {
        synchronized (this.f10096c) {
            ArrayList arrayList = this.f10096c.get(str);
            if (arrayList != null) {
                arrayList.remove(j0Var);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void a(String str, j0 j0Var) {
        ArrayList arrayList = this.f10096c.get(str);
        if (arrayList == null) {
            arrayList = new ArrayList();
            this.f10096c.put(str, arrayList);
        }
        arrayList.add(j0Var);
    }

    /* access modifiers changed from: package-private */
    public boolean b(k0 k0Var) {
        return b(k0Var.getAdcModuleId());
    }

    /* access modifiers changed from: package-private */
    public boolean b(int i2) {
        synchronized (this.f10094a) {
            k0 k0Var = (k0) this.f10094a.remove(Integer.valueOf(i2));
            if (k0Var == null) {
                return false;
            }
            k0Var.c();
            return true;
        }
    }

    /* access modifiers changed from: package-private */
    public void a() {
        Context a2;
        k b2 = a.b();
        if (!b2.E() && !b2.F() && (a2 = a.a()) != null) {
            b();
            z0.b((Runnable) new a(a2));
        }
    }

    private void b() {
        if (!this.f10099f) {
            synchronized (this.f10098e) {
                if (!this.f10099f) {
                    this.f10099f = true;
                    new Thread(new b()).start();
                }
            }
        }
    }

    /* access modifiers changed from: package-private */
    public l c() {
        k0 a2 = a(1);
        if (a2 instanceof l) {
            return (l) a2;
        }
        return null;
    }

    /* access modifiers changed from: package-private */
    public k0 a(k0 k0Var) {
        synchronized (this.f10094a) {
            this.f10094a.put(Integer.valueOf(k0Var.getAdcModuleId()), k0Var);
            h();
        }
        return k0Var;
    }

    private void a(f1 f1Var) {
        b();
        this.f10098e.add(f1Var);
    }

    /* access modifiers changed from: private */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0022, code lost:
        if (r4.hasNext() == false) goto L_0x0040;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:?, code lost:
        ((com.adcolony.sdk.j0) r4.next()).a(r3);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002e, code lost:
        r3 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x002f, code lost:
        new com.adcolony.sdk.e0.a().a((java.lang.Object) r3).a(com.adcolony.sdk.e0.i);
        r3.printStackTrace();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:?, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0015, code lost:
        r3 = new com.adcolony.sdk.h0(r4);
        r4 = r1.iterator();
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a(java.lang.String r3, com.adcolony.sdk.f1 r4) {
        /*
            r2 = this;
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r0 = r2.f10096c
            monitor-enter(r0)
            java.util.HashMap<java.lang.String, java.util.ArrayList<com.adcolony.sdk.j0>> r1 = r2.f10096c     // Catch:{ all -> 0x0041 }
            java.lang.Object r3 = r1.get(r3)     // Catch:{ all -> 0x0041 }
            java.util.ArrayList r3 = (java.util.ArrayList) r3     // Catch:{ all -> 0x0041 }
            if (r3 != 0) goto L_0x000f
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            return
        L_0x000f:
            java.util.ArrayList r1 = new java.util.ArrayList     // Catch:{ all -> 0x0041 }
            r1.<init>(r3)     // Catch:{ all -> 0x0041 }
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            com.adcolony.sdk.h0 r3 = new com.adcolony.sdk.h0
            r3.<init>(r4)
            java.util.Iterator r4 = r1.iterator()
        L_0x001e:
            boolean r0 = r4.hasNext()
            if (r0 == 0) goto L_0x0040
            java.lang.Object r0 = r4.next()
            com.adcolony.sdk.j0 r0 = (com.adcolony.sdk.j0) r0
            r0.a(r3)     // Catch:{ RuntimeException -> 0x002e }
            goto L_0x001e
        L_0x002e:
            r3 = move-exception
            com.adcolony.sdk.e0$a r4 = new com.adcolony.sdk.e0$a
            r4.<init>()
            com.adcolony.sdk.e0$a r4 = r4.a((java.lang.Object) r3)
            com.adcolony.sdk.e0 r0 = com.adcolony.sdk.e0.i
            r4.a((com.adcolony.sdk.e0) r0)
            r3.printStackTrace()
        L_0x0040:
            return
        L_0x0041:
            r3 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0041 }
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.i0.a(java.lang.String, com.adcolony.sdk.f1):void");
    }

    /* access modifiers changed from: package-private */
    public k0 a(int i2) {
        return this.f10094a.get(Integer.valueOf(i2));
    }

    /* access modifiers changed from: private */
    public void b(f1 f1Var) {
        try {
            String e2 = f1Var.e("m_type");
            int b2 = f1Var.b("m_origin");
            d dVar = new d(e2, f1Var);
            if (b2 >= 2) {
                z0.b((Runnable) dVar);
            } else {
                this.f10101h.execute(dVar);
            }
        } catch (RejectedExecutionException e3) {
            new e0.a().a("RejectedExecutionException from message dispatcher's dispatchNativeMessage(): ").a(e3.toString()).a(e0.i);
        } catch (JSONException e4) {
            new e0.a().a("JSON error from message dispatcher's dispatchNativeMessage(): ").a(e4.toString()).a(e0.i);
        }
    }
}
