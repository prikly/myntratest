package com.yandex.metrica.impl.ob;

import android.os.Handler;
import android.os.Looper;
import com.yandex.metrica.core.api.executors.ICommonExecutor;
import com.yandex.metrica.core.api.executors.IHandlerExecutor;
import java.util.concurrent.Executor;

public class Pm {

    /* renamed from: a  reason: collision with root package name */
    private final Om f4796a;

    /* renamed from: b  reason: collision with root package name */
    private volatile ICommonExecutor f4797b;

    /* renamed from: c  reason: collision with root package name */
    private volatile ICommonExecutor f4798c;

    /* renamed from: d  reason: collision with root package name */
    private volatile ICommonExecutor f4799d;

    /* renamed from: e  reason: collision with root package name */
    private volatile IHandlerExecutor f4800e;

    /* renamed from: f  reason: collision with root package name */
    private volatile ICommonExecutor f4801f;

    /* renamed from: g  reason: collision with root package name */
    private volatile ICommonExecutor f4802g;

    /* renamed from: h  reason: collision with root package name */
    private volatile ICommonExecutor f4803h;
    private volatile ICommonExecutor i;
    private volatile Executor j;

    public Pm() {
        this(new Om());
    }

    public ICommonExecutor a() {
        if (this.f4803h == null) {
            synchronized (this) {
                if (this.f4803h == null) {
                    this.f4796a.getClass();
                    this.f4803h = new Jm("YMM-DE");
                }
            }
        }
        return this.f4803h;
    }

    public IHandlerExecutor b() {
        if (this.f4800e == null) {
            synchronized (this) {
                if (this.f4800e == null) {
                    this.f4796a.getClass();
                    this.f4800e = new Jm("YMM-UH-1");
                }
            }
        }
        return this.f4800e;
    }

    public ICommonExecutor c() {
        if (this.f4797b == null) {
            synchronized (this) {
                if (this.f4797b == null) {
                    this.f4796a.getClass();
                    this.f4797b = new Jm("YMM-MC");
                }
            }
        }
        return this.f4797b;
    }

    public ICommonExecutor d() {
        if (this.f4801f == null) {
            synchronized (this) {
                if (this.f4801f == null) {
                    this.f4796a.getClass();
                    this.f4801f = new Jm("YMM-CTH");
                }
            }
        }
        return this.f4801f;
    }

    public ICommonExecutor e() {
        if (this.f4798c == null) {
            synchronized (this) {
                if (this.f4798c == null) {
                    this.f4796a.getClass();
                    this.f4798c = new Jm("YMM-MSTE");
                }
            }
        }
        return this.f4798c;
    }

    public ICommonExecutor f() {
        if (this.i == null) {
            synchronized (this) {
                if (this.i == null) {
                    this.f4796a.getClass();
                    this.i = new Jm("YMM-RTM");
                }
            }
        }
        return this.i;
    }

    public ICommonExecutor g() {
        if (this.f4802g == null) {
            synchronized (this) {
                if (this.f4802g == null) {
                    this.f4796a.getClass();
                    this.f4802g = new Jm("YMM-SIO");
                }
            }
        }
        return this.f4802g;
    }

    public ICommonExecutor h() {
        if (this.f4799d == null) {
            synchronized (this) {
                if (this.f4799d == null) {
                    this.f4796a.getClass();
                    this.f4799d = new Jm("YMM-TP");
                }
            }
        }
        return this.f4799d;
    }

    public Executor i() {
        if (this.j == null) {
            synchronized (this) {
                if (this.j == null) {
                    Om om = this.f4796a;
                    om.getClass();
                    this.j = new Nm(om, new Handler(Looper.getMainLooper()));
                }
            }
        }
        return this.j;
    }

    Pm(Om om) {
        this.f4796a = om;
    }

    public Lm b(Runnable runnable) {
        this.f4796a.getClass();
        return Mm.a("YMM-IB", runnable);
    }

    public Lm a(Runnable runnable) {
        this.f4796a.getClass();
        return Mm.a("YMM-HMSR", runnable);
    }
}
