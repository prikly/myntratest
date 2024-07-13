package com.ironsource.mediationsdk;

import com.ironsource.environment.e.c;
import com.ironsource.mediationsdk.logger.IronLog;
import com.ironsource.mediationsdk.logger.IronSourceError;

/* renamed from: com.ironsource.mediationsdk.j  reason: case insensitive filesystem */
public final class C0888j {

    /* renamed from: b  reason: collision with root package name */
    private static C0888j f8650b;

    /* renamed from: a  reason: collision with root package name */
    int f8651a;

    /* renamed from: c  reason: collision with root package name */
    private long f8652c = 0;

    /* renamed from: d  reason: collision with root package name */
    private boolean f8653d = false;

    private C0888j() {
    }

    public static synchronized C0888j a() {
        C0888j jVar;
        synchronized (C0888j.class) {
            if (f8650b == null) {
                f8650b = new C0888j();
            }
            jVar = f8650b;
        }
        return jVar;
    }

    public final void a(final IronSourceBannerLayout ironSourceBannerLayout, final IronSourceError ironSourceError) {
        synchronized (this) {
            if (!this.f8653d) {
                long currentTimeMillis = System.currentTimeMillis() - this.f8652c;
                if (currentTimeMillis > ((long) (this.f8651a * 1000))) {
                    b(ironSourceBannerLayout, ironSourceError);
                    return;
                }
                this.f8653d = true;
                long j = ((long) (this.f8651a * 1000)) - currentTimeMillis;
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("delaying callback by " + j);
                c cVar = c.f8074a;
                c.b(new Runnable() {
                    public final void run() {
                        C0888j.this.b(ironSourceBannerLayout, ironSourceError);
                    }
                }, j);
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void b(IronSourceBannerLayout ironSourceBannerLayout, IronSourceError ironSourceError) {
        if (ironSourceBannerLayout != null) {
            this.f8652c = System.currentTimeMillis();
            this.f8653d = false;
            ironSourceBannerLayout.a(ironSourceError);
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (this) {
            z = this.f8653d;
        }
        return z;
    }
}
