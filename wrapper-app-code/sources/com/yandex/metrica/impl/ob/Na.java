package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Vm;

public class Na<R, M extends Vm> implements Vm {

    /* renamed from: a  reason: collision with root package name */
    public final R f4599a;

    /* renamed from: b  reason: collision with root package name */
    public final M f4600b;

    public Na(R r, M m) {
        this.f4599a = r;
        this.f4600b = m;
    }

    public int a() {
        return this.f4600b.a();
    }

    public String toString() {
        return "Result{result=" + this.f4599a + ", metaInfo=" + this.f4600b + '}';
    }
}
