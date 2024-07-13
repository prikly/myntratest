package com.yandex.metrica.impl.ob;

import android.content.Context;

public class M5 {

    /* renamed from: a  reason: collision with root package name */
    private final int f4536a;

    /* renamed from: b  reason: collision with root package name */
    private final Q5 f4537b;

    /* renamed from: c  reason: collision with root package name */
    private N5 f4538c;

    public M5(Context context, I3 i3, int i) {
        this(new Q5(context, i3), i);
    }

    private void b() {
        this.f4537b.a(this.f4538c);
    }

    public D0 a(String str) {
        D0 d0;
        if (this.f4538c == null) {
            N5 a2 = this.f4537b.a();
            this.f4538c = a2;
            int d2 = a2.d();
            int i = this.f4536a;
            if (d2 != i) {
                this.f4538c.b(i);
                b();
            }
        }
        int hashCode = str.hashCode();
        if (this.f4538c.b().contains(Integer.valueOf(hashCode))) {
            return D0.NON_FIRST_OCCURENCE;
        }
        if (this.f4538c.e()) {
            d0 = D0.FIRST_OCCURRENCE;
        } else {
            d0 = D0.UNKNOWN;
        }
        if (this.f4538c.c() < 1000) {
            this.f4538c.a(hashCode);
        } else {
            this.f4538c.a(false);
        }
        b();
        return d0;
    }

    M5(Q5 q5, int i) {
        this.f4536a = i;
        this.f4537b = q5;
    }

    public void a() {
        if (this.f4538c == null) {
            N5 a2 = this.f4537b.a();
            this.f4538c = a2;
            int d2 = a2.d();
            int i = this.f4536a;
            if (d2 != i) {
                this.f4538c.b(i);
                b();
            }
        }
        this.f4538c.a();
        this.f4538c.a(true);
        b();
    }
}
