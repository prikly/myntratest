package com.ironsource.mediationsdk.b;

import java.util.Timer;
import java.util.TimerTask;

public abstract class a<T> {

    /* renamed from: a  reason: collision with root package name */
    protected T f8580a;

    /* renamed from: b  reason: collision with root package name */
    private Timer f8581b;

    /* renamed from: c  reason: collision with root package name */
    private long f8582c;

    public a(long j) {
        this.f8582c = j;
    }

    /* access modifiers changed from: protected */
    public abstract void a();

    /* access modifiers changed from: protected */
    public final void a(T t) {
        if (!(this.f8582c <= 0) && t != null) {
            this.f8580a = t;
            b();
            Timer timer = new Timer();
            this.f8581b = timer;
            timer.schedule(new TimerTask() {
                public final void run() {
                    a.this.a();
                }
            }, this.f8582c);
        }
    }

    /* access modifiers changed from: protected */
    public final void b() {
        Timer timer = this.f8581b;
        if (timer != null) {
            timer.cancel();
            this.f8581b = null;
        }
    }

    public final void c() {
        this.f8580a = null;
    }
}
