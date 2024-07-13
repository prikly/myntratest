package com.yandex.metrica.impl.ob;

import android.content.Context;

public class Q2 {

    /* renamed from: a  reason: collision with root package name */
    private final C0440hm f4809a;

    /* renamed from: b  reason: collision with root package name */
    private Boolean f4810b;

    /* renamed from: c  reason: collision with root package name */
    private S0 f4811c;

    /* renamed from: d  reason: collision with root package name */
    private T0 f4812d;

    public Q2() {
        this(new C0440hm());
    }

    public synchronized S0 a(Context context, Im im) {
        if (this.f4811c == null) {
            if (a(context)) {
                this.f4811c = new C0586nj(im.b(), im.b().getHandler(), im.a(), new Q());
            } else {
                this.f4811c = new P2(context, im);
            }
        }
        return this.f4811c;
    }

    Q2(C0440hm hmVar) {
        this.f4809a = hmVar;
    }

    public synchronized T0 a(Context context, S0 s0) {
        if (this.f4812d == null) {
            if (a(context)) {
                this.f4812d = new C0611oj();
            } else {
                this.f4812d = new T2(context, s0);
            }
        }
        return this.f4812d;
    }

    private synchronized boolean a(Context context) {
        if (this.f4810b == null) {
            this.f4810b = Boolean.valueOf(!this.f4809a.a(context));
        }
        return this.f4810b.booleanValue();
    }
}
