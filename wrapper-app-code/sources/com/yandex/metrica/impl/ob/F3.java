package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.os.Bundle;
import android.os.ResultReceiver;
import com.yandex.metrica.impl.ob.D3;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class F3 implements P3, R3, C0510ki {

    /* renamed from: a  reason: collision with root package name */
    private final Context f3989a;

    /* renamed from: b  reason: collision with root package name */
    private final I3 f3990b;

    /* renamed from: c  reason: collision with root package name */
    private final C0361ei f3991c;

    /* renamed from: d  reason: collision with root package name */
    private final C0682ri f3992d;

    /* renamed from: e  reason: collision with root package name */
    private final C0297c4 f3993e;

    /* renamed from: f  reason: collision with root package name */
    private final C0819xb f3994f;

    /* renamed from: g  reason: collision with root package name */
    private final N4<M4, F3> f3995g;

    /* renamed from: h  reason: collision with root package name */
    private final C0786w2<F3> f3996h;
    private List<V0> i = new ArrayList();
    private final J3<C0571n4> j;
    private Jf k;
    private final M l;
    private final C0752ug m;
    private final Object n = new Object();

    class a implements C0309cg {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ ResultReceiver f3997a;

        a(F3 f3, ResultReceiver resultReceiver) {
            this.f3997a = resultReceiver;
        }

        public void a(C0334dg dgVar) {
            byte[] bArr;
            ResultReceiver resultReceiver = this.f3997a;
            int i = C0359eg.f5751b;
            if (resultReceiver != null) {
                Bundle bundle = new Bundle();
                if (dgVar == null) {
                    bArr = null;
                } else {
                    bArr = dgVar.a();
                }
                bundle.putByteArray("referrer", bArr);
                resultReceiver.send(1, bundle);
            }
        }
    }

    F3(Context context, C0361ei eiVar, I3 i3, D3 d3, C0297c4 c4Var, C0704sg sgVar, J3<C0571n4> j3, H3 h3, N n2, C0819xb xbVar, C0752ug ugVar) {
        Context applicationContext = context.getApplicationContext();
        this.f3989a = applicationContext;
        this.f3990b = i3;
        this.f3991c = eiVar;
        this.f3993e = c4Var;
        this.j = j3;
        this.f3995g = h3.a(this);
        C0682ri a2 = eiVar.a(applicationContext, i3, d3.f3847a);
        this.f3992d = a2;
        this.f3994f = xbVar;
        xbVar.a(applicationContext, a2.d());
        this.l = n2.a(a2, xbVar, applicationContext);
        this.f3996h = h3.a(this, a2);
        this.m = ugVar;
        eiVar.a(i3, (C0510ki) this);
    }

    public void a(D3.a aVar) {
        this.f3993e.a(aVar);
    }

    public synchronized void b(C0571n4 n4Var) {
        this.j.b(n4Var);
    }

    public synchronized void a(C0571n4 n4Var) {
        this.j.a(n4Var);
        n4Var.a(this.l.a(Tl.a(this.f3992d.d().v())));
    }

    public Context b() {
        return this.f3989a;
    }

    public void a(C0293c0 c0Var, C0571n4 n4Var) {
        this.f3995g.a(c0Var, n4Var);
    }

    public D3.a a() {
        return this.f3993e.a();
    }

    public void a(C0635pi piVar) {
        this.f3994f.a(piVar);
        synchronized (this.n) {
            for (C0571n4 a2 : this.j.a()) {
                a2.a(this.l.a(Tl.a(piVar.v())));
            }
            ArrayList arrayList = new ArrayList();
            for (V0 next : this.i) {
                if (next.a(piVar)) {
                    a(next.c(), next.a());
                } else {
                    arrayList.add(next);
                }
            }
            this.i = new ArrayList(arrayList);
            if (!arrayList.isEmpty()) {
                this.f3996h.d();
            }
        }
        if (this.k == null) {
            this.k = F0.g().l();
        }
        this.k.a(piVar);
    }

    public void a(C0411gi giVar, C0635pi piVar) {
        synchronized (this.n) {
            for (V0 next : this.i) {
                ResultReceiver c2 = next.c();
                L a2 = this.l.a(next.a());
                int i2 = C0368f0.f5774b;
                if (c2 != null) {
                    Bundle bundle = new Bundle();
                    giVar.a(bundle);
                    a2.c(bundle);
                    c2.send(2, bundle);
                }
            }
            this.i.clear();
        }
    }

    public void a(V0 v0) {
        ResultReceiver resultReceiver;
        Map hashMap = new HashMap();
        List<String> list = null;
        if (v0 != null) {
            list = v0.b();
            resultReceiver = v0.c();
            hashMap = v0.a();
        } else {
            resultReceiver = null;
        }
        boolean a2 = this.f3992d.a(list, hashMap);
        if (!a2) {
            a(resultReceiver, (Map<String, String>) hashMap);
        }
        if (this.f3992d.e()) {
            synchronized (this.n) {
                if (a2 && v0 != null) {
                    this.i.add(v0);
                }
            }
            this.f3996h.d();
        } else if (a2) {
            a(resultReceiver, (Map<String, String>) hashMap);
        }
    }

    public void a(ResultReceiver resultReceiver) {
        this.m.a((C0309cg) new a(this, resultReceiver));
    }

    public void a(D3 d3) {
        this.f3992d.a(d3.f3847a);
        this.f3993e.a(d3.f3848b);
    }

    private void a(ResultReceiver resultReceiver, Map<String, String> map) {
        L a2 = this.l.a(map);
        int i2 = C0368f0.f5774b;
        if (resultReceiver != null) {
            Bundle bundle = new Bundle();
            a2.c(bundle);
            resultReceiver.send(1, bundle);
        }
    }
}
