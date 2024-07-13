package com.ironsource.mediationsdk;

import com.ironsource.lifecycle.f;
import com.ironsource.mediationsdk.logger.IronLog;
import java.util.Calendar;
import java.util.concurrent.TimeUnit;

/* renamed from: com.ironsource.mediationsdk.x  reason: case insensitive filesystem */
public final class C0902x {

    /* renamed from: a  reason: collision with root package name */
    C0881c f8979a;

    /* renamed from: b  reason: collision with root package name */
    private Runnable f8980b;

    /* renamed from: c  reason: collision with root package name */
    private int f8981c = 0;

    /* renamed from: d  reason: collision with root package name */
    private f f8982d;

    public C0902x(int i, C0881c cVar) {
        this.f8979a = cVar;
        this.f8981c = i;
        this.f8980b = new Runnable() {
            public final void run() {
                IronLog.INTERNAL.verbose("loaded ads are expired");
                if (C0902x.this.f8979a != null) {
                    C0902x.this.f8979a.c_();
                }
            }
        };
    }

    private boolean b() {
        return this.f8981c > 0;
    }

    public final void a() {
        if (b() && this.f8982d != null) {
            IronLog.INTERNAL.verbose("canceling expiration timer");
            this.f8982d.c();
            this.f8982d = null;
        }
    }

    public final void a(long j) {
        if (b()) {
            long millis = TimeUnit.MINUTES.toMillis((long) this.f8981c) - Math.max(j, 0);
            if (millis > 0) {
                a();
                this.f8982d = new f(millis, this.f8980b, true);
                Calendar instance = Calendar.getInstance();
                instance.add(14, (int) millis);
                IronLog ironLog = IronLog.INTERNAL;
                ironLog.verbose("loaded ads will expire on: " + instance.getTime() + " in " + String.format("%.2f", new Object[]{Double.valueOf((((double) millis) / 1000.0d) / 60.0d)}) + " minutes");
                return;
            }
            IronLog.INTERNAL.verbose("no delay - onAdExpired called");
            this.f8979a.c_();
        }
    }
}
