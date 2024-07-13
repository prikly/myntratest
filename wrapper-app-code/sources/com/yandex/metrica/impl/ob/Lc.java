package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;

public class Lc {

    /* renamed from: a  reason: collision with root package name */
    protected final Cc f4484a;

    /* renamed from: b  reason: collision with root package name */
    private final G1 f4485b;

    /* renamed from: c  reason: collision with root package name */
    private final Ic f4486c;

    public Lc(Cc cc) {
        this(cc, new G1());
    }

    private Ic a() {
        return new Ic();
    }

    Lc(Cc cc, G1 g1) {
        this.f4484a = cc;
        this.f4485b = g1;
        this.f4486c = a();
    }

    public Ec<Xb> a(Pc pc, Xb xb) {
        Sb sb = this.f4484a.f3817a;
        Context context = sb.f4924a;
        Looper looper = sb.f4925b.getLooper();
        Cc cc = this.f4484a;
        return new Ec(new Tc(context, looper, cc.f3818b, this.f4485b.c(cc.f3817a.f4926c), "passive", new C0868zc(pc)), this.f4486c, new Kc(), new Jc(), xb);
    }
}
