package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Looper;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;

public abstract class Pb {

    /* renamed from: a  reason: collision with root package name */
    protected final C0352e9 f4754a;

    /* renamed from: b  reason: collision with root package name */
    protected final Cc f4755b;

    /* renamed from: c  reason: collision with root package name */
    protected final G1 f4756c;

    /* renamed from: d  reason: collision with root package name */
    private final C0405gc f4757d;

    /* renamed from: e  reason: collision with root package name */
    private final Mb f4758e;

    /* renamed from: f  reason: collision with root package name */
    private final Nb f4759f;

    public Pb(Cc cc, C0352e9 e9Var, G1 g1) {
        this.f4755b = cc;
        this.f4754a = e9Var;
        this.f4756c = g1;
        C0405gc a2 = a();
        this.f4757d = a2;
        this.f4758e = new Mb(a2, c());
        this.f4759f = new Nb(cc.f3817a.f4925b);
    }

    public Ec<Xb> a(Pc pc, Xb xb) {
        Sb sb = this.f4755b.f3817a;
        Context context = sb.f4924a;
        Looper looper = sb.f4925b.getLooper();
        Cc cc = this.f4755b;
        return new Ec(new Tc(context, looper, cc.f3818b, a(cc.f3817a.f4926c), b(), new C0868zc(pc)), this.f4758e, new Ob(this.f4757d, new SystemTimeProvider()), this.f4759f, xb);
    }

    /* access modifiers changed from: protected */
    public abstract C0405gc a();

    /* access modifiers changed from: protected */
    public abstract C0869zd a(C0845yd ydVar);

    /* access modifiers changed from: protected */
    public abstract String b();

    /* access modifiers changed from: protected */
    public abstract String c();
}
