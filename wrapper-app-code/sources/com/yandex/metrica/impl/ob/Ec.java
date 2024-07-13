package com.yandex.metrica.impl.ob;

public class Ec<T> implements C0629pc<T> {

    /* renamed from: a  reason: collision with root package name */
    private final Dc<T> f3930a;

    /* renamed from: b  reason: collision with root package name */
    private final Lb<T> f3931b;

    /* renamed from: c  reason: collision with root package name */
    private final Gc f3932c;

    /* renamed from: d  reason: collision with root package name */
    private final Qb<T> f3933d;

    /* renamed from: e  reason: collision with root package name */
    private final Runnable f3934e = new a();

    /* renamed from: f  reason: collision with root package name */
    private T f3935f;

    class a implements Runnable {
        a() {
        }

        public void run() {
            Ec.this.b();
        }
    }

    public Ec(Dc<T> dc, Lb<T> lb, Gc gc, Qb<T> qb, T t) {
        this.f3930a = dc;
        this.f3931b = lb;
        this.f3932c = gc;
        this.f3933d = qb;
        this.f3935f = t;
    }

    public void a() {
        T t = this.f3935f;
        if (t != null && this.f3931b.a(t) && this.f3930a.a(this.f3935f)) {
            this.f3932c.a();
            this.f3933d.a(this.f3934e, this.f3935f);
        }
    }

    public void b() {
        this.f3933d.a();
        this.f3930a.a();
    }

    public void c() {
        T t = this.f3935f;
        if (t != null && this.f3931b.b(t)) {
            this.f3930a.b();
        }
        a();
    }

    public void a(T t) {
        if (!A2.a((Object) this.f3935f, (Object) t)) {
            this.f3935f = t;
            b();
            a();
        }
    }
}
