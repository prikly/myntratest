package com.apm.insight.j;

import android.os.Handler;

public abstract class a implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    private Handler f10645a;

    /* renamed from: b  reason: collision with root package name */
    private final long f10646b;

    /* renamed from: c  reason: collision with root package name */
    private final long f10647c;

    a(Handler handler, long j, long j2) {
        this.f10645a = handler;
        this.f10646b = j;
        this.f10647c = j2;
    }

    /* access modifiers changed from: package-private */
    public void a() {
        int i = (b() > 0 ? 1 : (b() == 0 ? 0 : -1));
        Handler handler = this.f10645a;
        if (i > 0) {
            handler.postDelayed(this, b());
        } else {
            handler.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    public void a(long j) {
        if (j > 0) {
            this.f10645a.postDelayed(this, j);
        } else {
            this.f10645a.post(this);
        }
    }

    /* access modifiers changed from: package-private */
    public long b() {
        return this.f10646b;
    }

    /* access modifiers changed from: package-private */
    public long c() {
        return this.f10647c;
    }
}
