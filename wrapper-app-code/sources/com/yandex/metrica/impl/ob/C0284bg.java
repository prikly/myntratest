package com.yandex.metrica.impl.ob;

import android.os.Handler;
import com.yandex.metrica.DeferredDeeplinkListener;
import com.yandex.metrica.DeferredDeeplinkParametersListener;

/* renamed from: com.yandex.metrica.impl.ob.bg  reason: case insensitive filesystem */
public class C0284bg implements C0309cg {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f5533a;

    /* renamed from: b  reason: collision with root package name */
    private final T1 f5534b;

    /* renamed from: c  reason: collision with root package name */
    private final C0277b9 f5535c;

    /* renamed from: d  reason: collision with root package name */
    private final C0592o0 f5536d;

    /* renamed from: e  reason: collision with root package name */
    private final K1 f5537e;

    /* renamed from: f  reason: collision with root package name */
    private final Handler f5538f;

    public C0284bg(T1 t1, C0277b9 b9Var, Handler handler) {
        this(t1, b9Var, handler, b9Var.w());
    }

    public void a() {
        if (!this.f5533a) {
            this.f5534b.a(new C0359eg(this.f5538f, this));
        }
    }

    private C0284bg(T1 t1, C0277b9 b9Var, Handler handler, boolean z) {
        this(t1, b9Var, handler, z, new C0592o0(z), new K1());
    }

    public void a(C0334dg dgVar) {
        String str = dgVar == null ? null : dgVar.f5664a;
        if (!this.f5533a) {
            synchronized (this) {
                this.f5536d.a(this.f5537e.a(str));
            }
        }
    }

    C0284bg(T1 t1, C0277b9 b9Var, Handler handler, boolean z, C0592o0 o0Var, K1 k1) {
        this.f5534b = t1;
        this.f5535c = b9Var;
        this.f5533a = z;
        this.f5536d = o0Var;
        this.f5537e = k1;
        this.f5538f = handler;
    }

    public synchronized void a(DeferredDeeplinkParametersListener deferredDeeplinkParametersListener) {
        try {
            this.f5536d.a(deferredDeeplinkParametersListener);
            this.f5535c.y();
        } catch (Throwable th) {
            this.f5535c.y();
            throw th;
        }
    }

    public synchronized void a(DeferredDeeplinkListener deferredDeeplinkListener) {
        try {
            this.f5536d.a(deferredDeeplinkListener);
            this.f5535c.y();
        } catch (Throwable th) {
            this.f5535c.y();
            throw th;
        }
    }
}
