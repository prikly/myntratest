package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.H0;

public abstract class G0<T> implements H0.d {

    /* renamed from: a  reason: collision with root package name */
    protected final G<T> f4023a;

    /* renamed from: b  reason: collision with root package name */
    private H0 f4024b;

    public G0(long j, long j2) {
        this.f4023a = new G<>(j, j2);
    }

    /* access modifiers changed from: protected */
    public abstract long a(Ph ph);

    public T a() {
        H0 h0;
        if (b() && (h0 = this.f4024b) != null) {
            h0.b();
        }
        if (this.f4023a.c()) {
            this.f4023a.a(null);
        }
        return this.f4023a.a();
    }

    /* access modifiers changed from: protected */
    public abstract boolean a(T t);

    /* access modifiers changed from: protected */
    public abstract long b(Ph ph);

    public void b(T t) {
        if (a(t)) {
            this.f4023a.a(t);
            H0 h0 = this.f4024b;
            if (h0 != null) {
                h0.a();
            }
        }
    }

    public abstract boolean b();

    public void c(Ph ph) {
        this.f4023a.a(b(ph), a(ph));
    }

    public void a(H0 h0) {
        this.f4024b = h0;
    }
}
