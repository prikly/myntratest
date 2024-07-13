package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.Vm;

/* renamed from: com.yandex.metrica.impl.ob.gn  reason: case insensitive filesystem */
public class C0416gn<V, M extends Vm> implements Vm {

    /* renamed from: a  reason: collision with root package name */
    public final V f5887a;

    /* renamed from: b  reason: collision with root package name */
    public final M f5888b;

    public C0416gn(V v, M m) {
        this.f5887a = v;
        this.f5888b = m;
    }

    public int a() {
        return this.f5888b.a();
    }

    public String toString() {
        return "TrimmingResult{value=" + this.f5887a + ", metaInfo=" + this.f5888b + '}';
    }
}
