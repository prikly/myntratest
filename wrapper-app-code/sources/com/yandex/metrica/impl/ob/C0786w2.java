package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.P3;

/* renamed from: com.yandex.metrica.impl.ob.w2  reason: case insensitive filesystem */
public class C0786w2<C extends P3> implements C0519l2 {

    /* renamed from: a  reason: collision with root package name */
    private C f7016a;

    /* renamed from: b  reason: collision with root package name */
    final Object f7017b = new Object();

    /* renamed from: c  reason: collision with root package name */
    boolean f7018c = false;

    /* renamed from: d  reason: collision with root package name */
    private final C0850yi f7019d;

    public C0786w2(C c2, C0850yi yiVar) {
        this.f7016a = c2;
        this.f7019d = yiVar;
    }

    public void a() {
        synchronized (this.f7017b) {
            if (this.f7018c) {
                this.f7018c = false;
            }
        }
    }

    public void b() {
        synchronized (this.f7017b) {
            if (!this.f7018c) {
                c();
                this.f7018c = true;
            }
        }
    }

    /* access modifiers changed from: package-private */
    public void c() {
    }

    public void d() {
        synchronized (this.f7017b) {
            if (!this.f7018c) {
                synchronized (this.f7017b) {
                    if (!this.f7018c) {
                        f();
                    }
                }
                c();
            }
        }
    }

    public C e() {
        return this.f7016a;
    }

    /* access modifiers changed from: package-private */
    public void f() {
        this.f7019d.a();
    }
}
