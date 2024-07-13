package com.yandex.metrica.impl.ob;

import java.lang.Thread;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;

class C1 implements Thread.UncaughtExceptionHandler {

    /* renamed from: f  reason: collision with root package name */
    private static final AtomicBoolean f3793f = new AtomicBoolean();

    /* renamed from: a  reason: collision with root package name */
    private final List<A6> f3794a;

    /* renamed from: b  reason: collision with root package name */
    private final Thread.UncaughtExceptionHandler f3795b;

    /* renamed from: c  reason: collision with root package name */
    private final C0495k3 f3796c;

    /* renamed from: d  reason: collision with root package name */
    private final C0290bm f3797d;

    /* renamed from: e  reason: collision with root package name */
    private final C0446i3 f3798e;

    C1(Thread.UncaughtExceptionHandler uncaughtExceptionHandler, List<A6> list, C0290bm bmVar, C0446i3 i3Var, C0495k3 k3Var) {
        this.f3794a = list;
        this.f3795b = uncaughtExceptionHandler;
        this.f3797d = bmVar;
        this.f3798e = i3Var;
        this.f3796c = k3Var;
    }

    public static boolean a() {
        return f3793f.get();
    }

    public void uncaughtException(Thread thread, Throwable th) {
        try {
            f3793f.set(true);
            C0790w6 w6Var = new C0790w6(this.f3798e.a(thread), this.f3796c.a(thread), ((Xl) this.f3797d).b());
            for (A6 a2 : this.f3794a) {
                a2.a(th, w6Var);
            }
        } finally {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = this.f3795b;
            if (uncaughtExceptionHandler != null) {
                uncaughtExceptionHandler.uncaughtException(thread, th);
            }
        }
    }
}
