package com.yandex.metrica.impl.ob;

import com.yandex.metrica.core.api.executors.ICommonExecutor;

public class P {
    private static volatile P j;

    /* renamed from: a  reason: collision with root package name */
    private final Xl f4720a;

    /* renamed from: b  reason: collision with root package name */
    private final C0517l0 f4721b;

    /* renamed from: c  reason: collision with root package name */
    private final Im f4722c;

    /* renamed from: d  reason: collision with root package name */
    private final C0857z1 f4723d;

    /* renamed from: e  reason: collision with root package name */
    private final C0640q f4724e;

    /* renamed from: f  reason: collision with root package name */
    private final C0594o2 f4725f;

    /* renamed from: g  reason: collision with root package name */
    private final C0243a0 f4726g;

    /* renamed from: h  reason: collision with root package name */
    private final C0616p f4727h;
    private final C0872zg i;

    private P() {
        this(new Xl(), new C0640q(), new Im());
    }

    public static P g() {
        if (j == null) {
            synchronized (P.class) {
                if (j == null) {
                    j = new P(new Xl(), new C0640q(), new Im());
                }
            }
        }
        return j;
    }

    public C0616p a() {
        return this.f4727h;
    }

    public C0640q b() {
        return this.f4724e;
    }

    public ICommonExecutor c() {
        return this.f4722c.a();
    }

    public Im d() {
        return this.f4722c;
    }

    public C0243a0 e() {
        return this.f4726g;
    }

    public C0517l0 f() {
        return this.f4721b;
    }

    public Xl h() {
        return this.f4720a;
    }

    public C0857z1 i() {
        return this.f4723d;
    }

    public C0290bm j() {
        return this.f4720a;
    }

    public C0872zg k() {
        return this.i;
    }

    public C0594o2 l() {
        return this.f4725f;
    }

    private P(Xl xl, C0640q qVar, Im im) {
        this(xl, qVar, im, new C0616p(qVar, im.a()));
    }

    private P(Xl xl, C0640q qVar, Im im, C0616p pVar) {
        this(xl, new C0517l0(), im, pVar, new C0857z1(xl), qVar, new C0594o2(qVar, im.a(), pVar), new C0243a0(qVar), new C0872zg());
    }

    P(Xl xl, C0517l0 l0Var, Im im, C0616p pVar, C0857z1 z1Var, C0640q qVar, C0594o2 o2Var, C0243a0 a0Var, C0872zg zgVar) {
        this.f4720a = xl;
        this.f4721b = l0Var;
        this.f4722c = im;
        this.f4727h = pVar;
        this.f4723d = z1Var;
        this.f4724e = qVar;
        this.f4725f = o2Var;
        this.f4726g = a0Var;
        this.i = zgVar;
    }
}
