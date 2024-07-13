package com.ironsource.mediationsdk;

import com.ironsource.mediationsdk.logger.IronSourceLogger;
import com.ironsource.mediationsdk.logger.IronSourceLoggerManager;
import com.ironsource.mediationsdk.model.NetworkSettings;
import java.util.Timer;

/* renamed from: com.ironsource.mediationsdk.b  reason: case insensitive filesystem */
public abstract class C0880b {

    /* renamed from: a  reason: collision with root package name */
    a f8564a;

    /* renamed from: b  reason: collision with root package name */
    public AbstractAdapter f8565b;

    /* renamed from: c  reason: collision with root package name */
    NetworkSettings f8566c;

    /* renamed from: d  reason: collision with root package name */
    String f8567d;

    /* renamed from: e  reason: collision with root package name */
    boolean f8568e;

    /* renamed from: f  reason: collision with root package name */
    public String f8569f;

    /* renamed from: g  reason: collision with root package name */
    public String f8570g;

    /* renamed from: h  reason: collision with root package name */
    int f8571h;
    Timer i;
    Timer j;
    int k;
    int l;
    public int m;
    public int n;
    protected Long o;
    protected Long p;
    IronSourceLoggerManager q;
    private String r;
    private int s;
    private String t = "maxAdsPerSession";
    private String u = "maxAdsPerIteration";
    private String v = "maxAdsPerDay";

    /* renamed from: com.ironsource.mediationsdk.b$a */
    public enum a {
        NOT_INITIATED(0),
        INIT_FAILED(1),
        INITIATED(2),
        AVAILABLE(3),
        NOT_AVAILABLE(4),
        EXHAUSTED(5),
        CAPPED_PER_SESSION(6),
        INIT_PENDING(7),
        LOAD_PENDING(8),
        CAPPED_PER_DAY(9),
        NEEDS_RELOAD(10);
        
        public int l;

        private a(int i) {
            this.l = i;
        }
    }

    C0880b(NetworkSettings networkSettings) {
        this.r = networkSettings.getProviderTypeForReflection();
        this.f8567d = networkSettings.getProviderInstanceName();
        this.f8568e = networkSettings.isMultipleInstances();
        this.f8566c = networkSettings;
        this.f8569f = networkSettings.getSubProviderId();
        this.f8570g = networkSettings.getAdSourceNameForEvents();
        this.f8571h = 0;
        this.s = 0;
        this.f8564a = a.NOT_INITIATED;
        this.q = IronSourceLoggerManager.getLogger();
        this.o = null;
        this.p = null;
    }

    /* access modifiers changed from: package-private */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0043, code lost:
        return;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void a(com.ironsource.mediationsdk.C0880b.a r5) {
        /*
            r4 = this;
            monitor-enter(r4)
            com.ironsource.mediationsdk.b$a r0 = r4.f8564a     // Catch:{ all -> 0x0044 }
            if (r0 != r5) goto L_0x0007
            monitor-exit(r4)
            return
        L_0x0007:
            r4.f8564a = r5     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLoggerManager r0 = r4.q     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.logger.IronSourceLogger$IronSourceTag r1 = com.ironsource.mediationsdk.logger.IronSourceLogger.IronSourceTag.INTERNAL     // Catch:{ all -> 0x0044 }
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = "Smart Loading - "
            r2.<init>(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r4.f8567d     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = " state changed to "
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r3 = r5.toString()     // Catch:{ all -> 0x0044 }
            r2.append(r3)     // Catch:{ all -> 0x0044 }
            java.lang.String r2 = r2.toString()     // Catch:{ all -> 0x0044 }
            r3 = 0
            r0.log(r1, r2, r3)     // Catch:{ all -> 0x0044 }
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f8565b     // Catch:{ all -> 0x0044 }
            if (r0 == 0) goto L_0x0042
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C0880b.a.CAPPED_PER_SESSION     // Catch:{ all -> 0x0044 }
            if (r5 == r0) goto L_0x0039
            com.ironsource.mediationsdk.b$a r0 = com.ironsource.mediationsdk.C0880b.a.CAPPED_PER_DAY     // Catch:{ all -> 0x0044 }
            if (r5 != r0) goto L_0x0042
        L_0x0039:
            com.ironsource.mediationsdk.AbstractAdapter r0 = r4.f8565b     // Catch:{ all -> 0x0044 }
            java.lang.String r1 = r4.k()     // Catch:{ all -> 0x0044 }
            r0.setMediationState(r5, r1)     // Catch:{ all -> 0x0044 }
        L_0x0042:
            monitor-exit(r4)
            return
        L_0x0044:
            r5 = move-exception
            monitor-exit(r4)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ironsource.mediationsdk.C0880b.a(com.ironsource.mediationsdk.b$a):void");
    }

    /* access modifiers changed from: package-private */
    public final void a(String str, String str2) {
        IronSourceLoggerManager ironSourceLoggerManager = this.q;
        IronSourceLogger.IronSourceTag ironSourceTag = IronSourceLogger.IronSourceTag.INTERNAL;
        ironSourceLoggerManager.log(ironSourceTag, str + " exception: " + this.f8567d + " | " + str2, 3);
    }

    /* access modifiers changed from: package-private */
    public final boolean a() {
        return this.f8571h >= this.k;
    }

    /* access modifiers changed from: package-private */
    public final boolean b() {
        return this.s >= this.l;
    }

    /* access modifiers changed from: package-private */
    public final boolean c() {
        if (!a() && !b()) {
            if (!(this.f8564a == a.CAPPED_PER_DAY)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: package-private */
    public final void d() {
        this.f8571h++;
        this.s++;
        if (b()) {
            a(a.CAPPED_PER_SESSION);
        } else if (a()) {
            a(a.EXHAUSTED);
        }
    }

    /* access modifiers changed from: package-private */
    public final void e() {
        try {
            if (this.i != null) {
                this.i.cancel();
            }
        } catch (Exception e2) {
            a("stopInitTimer", e2.getLocalizedMessage());
        } finally {
            this.i = null;
        }
    }

    /* access modifiers changed from: package-private */
    public final void f() {
        try {
            if (this.j != null) {
                this.j.cancel();
            }
        } catch (Exception e2) {
            a("stopLoadTimer", e2.getLocalizedMessage());
        } finally {
            this.j = null;
        }
    }

    /* access modifiers changed from: package-private */
    public abstract void g();

    /* access modifiers changed from: package-private */
    public abstract void h();

    /* access modifiers changed from: package-private */
    public abstract void i();

    public final String j() {
        return this.f8568e ? this.r : this.f8567d;
    }

    /* access modifiers changed from: protected */
    public abstract String k();

    public final Long l() {
        return this.o;
    }

    public final Long m() {
        return this.p;
    }
}