package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0570n3;

/* renamed from: com.yandex.metrica.impl.ob.p3  reason: case insensitive filesystem */
public class C0620p3<T extends C0570n3> {

    /* renamed from: a  reason: collision with root package name */
    private final C0595o3<T> f6425a;

    /* renamed from: b  reason: collision with root package name */
    private final C0545m3<T> f6426b;

    /* renamed from: com.yandex.metrica.impl.ob.p3$b */
    public static final class b<T extends C0570n3> {

        /* renamed from: a  reason: collision with root package name */
        final C0595o3<T> f6427a;

        /* renamed from: b  reason: collision with root package name */
        C0545m3<T> f6428b;

        b(C0595o3<T> o3Var) {
            this.f6427a = o3Var;
        }

        public b<T> a(C0545m3<T> m3Var) {
            this.f6428b = m3Var;
            return this;
        }

        public C0620p3<T> a() {
            return new C0620p3<>(this);
        }
    }

    /* access modifiers changed from: package-private */
    public final boolean a(C0570n3 n3Var) {
        C0545m3<T> m3Var = this.f6426b;
        if (m3Var == null) {
            return false;
        }
        return m3Var.a(n3Var);
    }

    public void b(C0570n3 n3Var) {
        this.f6425a.a(n3Var);
    }

    private C0620p3(b bVar) {
        this.f6425a = bVar.f6427a;
        this.f6426b = bVar.f6428b;
    }

    public static <T extends C0570n3> b<T> a(C0595o3<T> o3Var) {
        return new b<>(o3Var);
    }
}
