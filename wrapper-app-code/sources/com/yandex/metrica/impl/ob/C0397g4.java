package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.g4  reason: case insensitive filesystem */
public abstract class C0397g4 implements C0496k4 {

    /* renamed from: a  reason: collision with root package name */
    private final X3 f5840a;

    /* renamed from: b  reason: collision with root package name */
    private final Vc f5841b;

    public C0397g4(Context context, X3 x3) {
        this(context, x3, new Vc(C0772vc.a(context), H2.a(context), F0.g().s()));
    }

    public void a(C0293c0 c0Var, D3 d3) {
        b(c0Var, d3);
    }

    public X3 b() {
        return this.f5840a;
    }

    /* access modifiers changed from: protected */
    public abstract void b(C0293c0 c0Var, D3 d3);

    public Vc c() {
        return this.f5841b;
    }

    public void a() {
        this.f5840a.b(this);
        this.f5841b.b(this);
    }

    C0397g4(Context context, X3 x3, Vc vc) {
        context.getApplicationContext();
        this.f5840a = x3;
        this.f5841b = vc;
        x3.a((C0496k4) this);
        vc.a((Object) this);
    }
}
