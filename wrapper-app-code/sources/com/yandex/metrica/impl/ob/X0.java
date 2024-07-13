package com.yandex.metrica.impl.ob;

import com.yandex.metrica.coreutils.services.TimeProvider;

public class X0 {

    /* renamed from: a  reason: collision with root package name */
    private final TimeProvider f5277a;

    /* renamed from: b  reason: collision with root package name */
    private final C0810x2 f5278b;

    /* renamed from: c  reason: collision with root package name */
    private final C0352e9 f5279c;

    /* renamed from: d  reason: collision with root package name */
    private long f5280d;

    /* renamed from: e  reason: collision with root package name */
    private Zh f5281e;

    /* renamed from: f  reason: collision with root package name */
    private final M0 f5282f;

    X0(C0352e9 e9Var, Zh zh, TimeProvider timeProvider, C0810x2 x2Var, M0 m0) {
        this.f5279c = e9Var;
        this.f5281e = zh;
        this.f5280d = e9Var.d(0);
        this.f5277a = timeProvider;
        this.f5278b = x2Var;
        this.f5282f = m0;
    }

    public void a() {
        Zh zh = this.f5281e;
        if (zh != null && this.f5278b.b(this.f5280d, zh.f5425a, "should send EVENT_IDENTITY_LIGHT")) {
            this.f5282f.b();
            long currentTimeSeconds = this.f5277a.currentTimeSeconds();
            this.f5280d = currentTimeSeconds;
            this.f5279c.i(currentTimeSeconds);
        }
    }

    public void a(Zh zh) {
        this.f5281e = zh;
    }
}
