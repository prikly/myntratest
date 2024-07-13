package com.ironsource.mediationsdk.adunit.e;

import android.text.TextUtils;
import com.ironsource.mediationsdk.adunit.c.b.a;
import com.ironsource.mediationsdk.adunit.d.a.c;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Iterator;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

public final class a<Smash extends c<?>> {

    /* renamed from: a  reason: collision with root package name */
    ConcurrentHashMap<String, CopyOnWriteArrayList<Smash>> f8549a = new ConcurrentHashMap<>();

    /* renamed from: b  reason: collision with root package name */
    public String f8550b = "";

    /* renamed from: c  reason: collision with root package name */
    private String f8551c = "";

    /* renamed from: d  reason: collision with root package name */
    private c<?> f8552d;

    /* renamed from: e  reason: collision with root package name */
    private final List<String> f8553e;

    /* renamed from: f  reason: collision with root package name */
    private final int f8554f;

    /* renamed from: g  reason: collision with root package name */
    private final Timer f8555g = new Timer();

    /* renamed from: h  reason: collision with root package name */
    private b f8556h;
    private final int i = 5;

    public a(List<String> list, int i2, b bVar) {
        this.f8553e = list;
        this.f8554f = i2;
        this.f8556h = bVar;
    }

    private synchronized void b() {
        if (this.f8552d != null) {
            this.f8552d.o();
        }
    }

    private synchronized boolean c() {
        return this.f8552d != null && this.f8552d.p() && this.f8552d.n().equals(this.f8551c);
    }

    private void d() {
        Iterator it = a().iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (!cVar.equals(this.f8552d)) {
                cVar.o();
            }
        }
    }

    public final CopyOnWriteArrayList<Smash> a() {
        CopyOnWriteArrayList<Smash> copyOnWriteArrayList = this.f8549a.get(this.f8550b);
        return copyOnWriteArrayList == null ? new CopyOnWriteArrayList<>() : copyOnWriteArrayList;
    }

    public final void a(a.C0085a aVar, CopyOnWriteArrayList<Smash> copyOnWriteArrayList, String str) {
        IronLog ironLog = IronLog.INTERNAL;
        ironLog.verbose("updating new waterfall with id " + str);
        d();
        if (aVar == a.C0085a.AUTOMATIC_LOAD_WHILE_SHOW) {
            this.f8549a.put(str, copyOnWriteArrayList);
            if (!TextUtils.isEmpty(this.f8551c)) {
                if (c()) {
                    IronLog ironLog2 = IronLog.INTERNAL;
                    ironLog2.verbose("ad from previous waterfall " + this.f8551c + " is still showing - the current waterfall " + this.f8550b + " will be deleted instead");
                    String str2 = this.f8550b;
                    this.f8550b = this.f8551c;
                    this.f8551c = str2;
                }
                final String str3 = this.f8551c;
                this.f8555g.schedule(new TimerTask() {
                    public final void run() {
                        try {
                            IronLog ironLog = IronLog.INTERNAL;
                            ironLog.verbose("removing waterfall with id " + str3 + " from memory");
                            a.this.f8549a.remove(str3);
                            IronLog ironLog2 = IronLog.INTERNAL;
                            ironLog2.verbose("waterfall size is currently " + a.this.f8549a.size());
                        } finally {
                            cancel();
                        }
                    }
                }, (long) this.f8554f);
            }
        } else {
            this.f8549a.clear();
            this.f8549a.put(str, copyOnWriteArrayList);
        }
        this.f8551c = this.f8550b;
        this.f8550b = str;
        if (this.f8549a.size() > 5) {
            this.f8556h.a(this.f8549a.size());
        }
    }

    public final synchronized void a(c<?> cVar) {
        IronLog.INTERNAL.verbose("");
        if (this.f8552d != null && !this.f8552d.equals(cVar)) {
            b();
        }
        this.f8552d = cVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0031, code lost:
        if (r3.f8553e.contains(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003d, code lost:
        if (r3.f8552d.m().equals(r6) == false) goto L_0x0007;
     */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0041  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized boolean a(com.ironsource.mediationsdk.adunit.c.b.a.C0085a r4, java.lang.String r5, java.lang.String r6, com.ironsource.mediationsdk.LoadWhileShowSupportState r7) {
        /*
            r3 = this;
            monitor-enter(r3)
            com.ironsource.mediationsdk.adunit.c.b.a$a r0 = com.ironsource.mediationsdk.adunit.c.b.a.C0085a.AUTOMATIC_LOAD_WHILE_SHOW     // Catch:{ all -> 0x0059 }
            r1 = 0
            r2 = 1
            if (r4 == r0) goto L_0x0009
        L_0x0007:
            r1 = 1
            goto L_0x003f
        L_0x0009:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f8552d     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f8552d     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.p()     // Catch:{ all -> 0x0059 }
            if (r4 != 0) goto L_0x0016
            goto L_0x0007
        L_0x0016:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.LOAD_WHILE_SHOW_BY_NETWORK     // Catch:{ all -> 0x0059 }
            if (r7 != r4) goto L_0x0027
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f8552d     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.k()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r5)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0027
            goto L_0x003f
        L_0x0027:
            com.ironsource.mediationsdk.LoadWhileShowSupportState r4 = com.ironsource.mediationsdk.LoadWhileShowSupportState.NONE     // Catch:{ all -> 0x0059 }
            if (r7 == r4) goto L_0x0033
            java.util.List<java.lang.String> r4 = r3.f8553e     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.contains(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x0033:
            com.ironsource.mediationsdk.adunit.d.a.c<?> r4 = r3.f8552d     // Catch:{ all -> 0x0059 }
            java.lang.String r4 = r4.m()     // Catch:{ all -> 0x0059 }
            boolean r4 = r4.equals(r6)     // Catch:{ all -> 0x0059 }
            if (r4 == 0) goto L_0x0007
        L_0x003f:
            if (r1 != 0) goto L_0x0057
            com.ironsource.mediationsdk.logger.IronLog r4 = com.ironsource.mediationsdk.logger.IronLog.INTERNAL     // Catch:{ all -> 0x0059 }
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch:{ all -> 0x0059 }
            r6.<init>()     // Catch:{ all -> 0x0059 }
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = " does not support load while show and will not be added to the auction request"
            r6.append(r5)     // Catch:{ all -> 0x0059 }
            java.lang.String r5 = r6.toString()     // Catch:{ all -> 0x0059 }
            r4.verbose(r5)     // Catch:{ all -> 0x0059 }
        L_0x0057:
            monitor-exit(r3)
            return r1
        L_0x0059:
            r4 = move-exception
            monitor-exit(r3)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.adunit.e.a.a(com.ironsource.mediationsdk.adunit.c.b.a$a, java.lang.String, java.lang.String, com.ironsource.mediationsdk.LoadWhileShowSupportState):boolean");
    }
}
