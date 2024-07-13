package com.adcolony.sdk;

import android.util.Log;
import com.adcolony.sdk.f0;
import com.applovin.sdk.AppLovinEventTypes;
import com.onesignal.OneSignalDbContract;
import com.unity3d.ads.metadata.MediationMetaData;
import io.bidmachine.ads.networks.adcolony.BuildConfig;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;

class s0 {

    /* renamed from: a  reason: collision with root package name */
    d0 f10278a;

    /* renamed from: b  reason: collision with root package name */
    ScheduledExecutorService f10279b;

    /* renamed from: c  reason: collision with root package name */
    List<f0> f10280c = new ArrayList();

    /* renamed from: d  reason: collision with root package name */
    HashMap<String, Object> f10281d;

    /* renamed from: e  reason: collision with root package name */
    private b0 f10282e = new b0("adcolony_android", BuildConfig.ADAPTER_SDK_VERSION_NAME, "Production");

    class a implements Runnable {
        a() {
        }

        public void run() {
            s0.this.a();
        }
    }

    class b implements Runnable {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ f0 f10284a;

        b(f0 f0Var) {
            this.f10284a = f0Var;
        }

        public void run() {
            s0.this.f10280c.add(this.f10284a);
        }
    }

    s0(d0 d0Var, ScheduledExecutorService scheduledExecutorService, HashMap<String, Object> hashMap) {
        this.f10278a = d0Var;
        this.f10279b = scheduledExecutorService;
        this.f10281d = hashMap;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(long j, TimeUnit timeUnit) {
        try {
            if (!this.f10279b.isShutdown() && !this.f10279b.isTerminated()) {
                this.f10279b.scheduleAtFixedRate(new a(), j, j, timeUnit);
            }
        } catch (RuntimeException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Can't wrap try/catch for region: R(2:9|10) */
    /* JADX WARNING: Code restructure failed: missing block: B:10:?, code lost:
        r4.f10279b.shutdownNow();
        java.lang.Thread.currentThread().interrupt();
     */
    /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x003c */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public synchronized void b() {
        /*
            r4 = this;
            monitor-enter(r4)
            java.util.concurrent.ScheduledExecutorService r0 = r4.f10279b     // Catch:{ all -> 0x004a }
            r0.shutdown()     // Catch:{ all -> 0x004a }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f10279b     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.TimeUnit r1 = java.util.concurrent.TimeUnit.SECONDS     // Catch:{ InterruptedException -> 0x003c }
            r2 = 1
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.util.concurrent.ScheduledExecutorService r0 = r4.f10279b     // Catch:{ InterruptedException -> 0x003c }
            r0.shutdownNow()     // Catch:{ InterruptedException -> 0x003c }
            java.util.concurrent.ScheduledExecutorService r0 = r4.f10279b     // Catch:{ InterruptedException -> 0x003c }
            boolean r0 = r0.awaitTermination(r2, r1)     // Catch:{ InterruptedException -> 0x003c }
            if (r0 != 0) goto L_0x0048
            java.io.PrintStream r0 = java.lang.System.err     // Catch:{ InterruptedException -> 0x003c }
            java.lang.StringBuilder r1 = new java.lang.StringBuilder     // Catch:{ InterruptedException -> 0x003c }
            r1.<init>()     // Catch:{ InterruptedException -> 0x003c }
            java.lang.Class<com.adcolony.sdk.s0> r2 = com.adcolony.sdk.s0.class
            java.lang.String r2 = r2.getSimpleName()     // Catch:{ InterruptedException -> 0x003c }
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r2 = ": ScheduledExecutorService did not terminate"
            r1.append(r2)     // Catch:{ InterruptedException -> 0x003c }
            java.lang.String r1 = r1.toString()     // Catch:{ InterruptedException -> 0x003c }
            r0.println(r1)     // Catch:{ InterruptedException -> 0x003c }
            goto L_0x0048
        L_0x003c:
            java.util.concurrent.ScheduledExecutorService r0 = r4.f10279b     // Catch:{ all -> 0x004a }
            r0.shutdownNow()     // Catch:{ all -> 0x004a }
            java.lang.Thread r0 = java.lang.Thread.currentThread()     // Catch:{ all -> 0x004a }
            r0.interrupt()     // Catch:{ all -> 0x004a }
        L_0x0048:
            monitor-exit(r4)
            return
        L_0x004a:
            r0 = move-exception
            monitor-exit(r4)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.s0.b():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void c(String str) {
        b(new f0.a().a(2).a(this.f10282e).a(str).a());
    }

    /* access modifiers changed from: package-private */
    public synchronized void d(String str) {
        b(new f0.a().a(1).a(this.f10282e).a(str).a());
    }

    /* access modifiers changed from: package-private */
    public synchronized void e(String str) {
        this.f10281d.put("controllerVersion", str);
    }

    /* access modifiers changed from: package-private */
    public synchronized void f(String str) {
        this.f10281d.put("sessionId", str);
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Missing exception handler attribute for start block: B:6:0x001e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void a() {
        /*
            r2 = this;
            monitor-enter(r2)
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f10280c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            int r0 = r0.size()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            if (r0 <= 0) goto L_0x0029
            com.adcolony.sdk.b0 r0 = r2.f10282e     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r1 = r2.f10280c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.lang.String r0 = r2.a((com.adcolony.sdk.b0) r0, (java.util.List<com.adcolony.sdk.f0>) r1)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            com.adcolony.sdk.d0 r1 = r2.f10278a     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r1.a(r0)     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f10280c     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            r0.clear()     // Catch:{ IOException -> 0x0024, JSONException -> 0x001e }
            goto L_0x0029
        L_0x001c:
            r0 = move-exception
            goto L_0x002b
        L_0x001e:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f10280c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
            goto L_0x0029
        L_0x0024:
            java.util.List<com.adcolony.sdk.f0> r0 = r2.f10280c     // Catch:{ all -> 0x001c }
            r0.clear()     // Catch:{ all -> 0x001c }
        L_0x0029:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            return
        L_0x002b:
            monitor-exit(r2)     // Catch:{ all -> 0x001c }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.adcolony.sdk.s0.a():void");
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(String str) {
        b(new f0.a().a(0).a(this.f10282e).a(str).a());
    }

    /* access modifiers changed from: package-private */
    public synchronized void b(f0 f0Var) {
        try {
            if (!this.f10279b.isShutdown() && !this.f10279b.isTerminated()) {
                this.f10279b.submit(new b(f0Var));
            }
        } catch (RejectedExecutionException unused) {
            Log.e("ADCLogError", "Internal error when submitting remote log to executor service");
        }
        return;
    }

    /* access modifiers changed from: package-private */
    public synchronized void a(String str) {
        b(new f0.a().a(3).a(this.f10282e).a(str).a());
    }

    /* access modifiers changed from: package-private */
    public String a(b0 b0Var, List<f0> list) throws JSONException {
        f1 f1Var = new f1();
        f1Var.a("index", b0Var.b());
        f1Var.a("environment", b0Var.a());
        f1Var.a(MediationMetaData.KEY_VERSION, b0Var.c());
        e1 e1Var = new e1();
        for (f0 a2 : list) {
            e1Var.a(a(a2));
        }
        f1Var.a("logs", e1Var);
        return f1Var.toString();
    }

    private synchronized f1 a(f0 f0Var) throws JSONException {
        f1 f1Var;
        f1Var = new f1((Map<?, ?>) this.f10281d);
        f1Var.a("environment", f0Var.a().a());
        f1Var.a(AppLovinEventTypes.USER_COMPLETED_LEVEL, f0Var.b());
        f1Var.a(OneSignalDbContract.NotificationTable.COLUMN_NAME_MESSAGE, f0Var.c());
        f1Var.a("clientTimestamp", f0Var.d());
        f1 f1Var2 = new f1(a.b().u().getMediationInfo());
        f1 f1Var3 = new f1(a.b().u().getPluginInfo());
        f1Var.a("mediation_network", c0.h(f1Var2, "name"));
        f1Var.a("mediation_network_version", c0.h(f1Var2, MediationMetaData.KEY_VERSION));
        f1Var.a("plugin", c0.h(f1Var3, "name"));
        f1Var.a("plugin_version", c0.h(f1Var3, MediationMetaData.KEY_VERSION));
        e1 b2 = a.b().q().b();
        if (b2 == null || b2.a("batteryInfo")) {
            f1Var.b("batteryInfo", a.b().n().l());
        }
        if (b2 != null) {
            f1Var.a(b2);
        }
        return f1Var;
    }
}
