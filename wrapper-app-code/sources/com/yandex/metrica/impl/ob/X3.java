package com.yandex.metrica.impl.ob;

import android.content.Context;
import com.yandex.metrica.impl.ob.D3;
import com.yandex.metrica.impl.ob.P3;
import com.yandex.metrica.impl.ob.S3;
import java.util.ArrayList;
import java.util.List;

public class X3<COMPONENT extends S3 & P3> implements R3, C0510ki {

    /* renamed from: a  reason: collision with root package name */
    private final Context f5287a;

    /* renamed from: b  reason: collision with root package name */
    private final I3 f5288b;

    /* renamed from: c  reason: collision with root package name */
    private final C0596o4<COMPONENT> f5289c;

    /* renamed from: d  reason: collision with root package name */
    private final C0682ri f5290d;

    /* renamed from: e  reason: collision with root package name */
    private final C0297c4 f5291e;

    /* renamed from: f  reason: collision with root package name */
    private COMPONENT f5292f;

    /* renamed from: g  reason: collision with root package name */
    private Q3 f5293g;

    /* renamed from: h  reason: collision with root package name */
    private List<C0510ki> f5294h = new ArrayList();
    private final J3<C0496k4> i;

    public X3(Context context, I3 i3, D3 d3, C0297c4 c4Var, C0596o4<COMPONENT> o4Var, J3<C0496k4> j3, C0361ei eiVar) {
        this.f5287a = context;
        this.f5288b = i3;
        this.f5291e = c4Var;
        this.f5289c = o4Var;
        this.i = j3;
        this.f5290d = eiVar.a(context, i3, d3.f3847a);
        eiVar.a(i3, (C0510ki) this);
    }

    public void a(C0293c0 c0Var, D3 d3) {
        COMPONENT component;
        ((C0860z4) a()).a();
        if (C0856z0.a(c0Var.o())) {
            component = a();
        } else {
            if (this.f5292f == null) {
                synchronized (this) {
                    COMPONENT a2 = this.f5289c.a(this.f5287a, this.f5288b, this.f5291e.a(), this.f5290d);
                    this.f5292f = a2;
                    this.f5294h.add(a2);
                }
            }
            component = this.f5292f;
        }
        if (!C0856z0.b(c0Var.o())) {
            D3.a aVar = d3.f3848b;
            synchronized (this) {
                this.f5291e.a(aVar);
                Q3 q3 = this.f5293g;
                if (q3 != null) {
                    ((C0860z4) q3).a(aVar);
                }
                COMPONENT component2 = this.f5292f;
                if (component2 != null) {
                    component2.a(aVar);
                }
            }
        }
        component.a(c0Var);
    }

    public synchronized void b(C0496k4 k4Var) {
        this.i.b(k4Var);
    }

    public synchronized void a(C0496k4 k4Var) {
        this.i.a(k4Var);
    }

    private Q3 a() {
        if (this.f5293g == null) {
            synchronized (this) {
                Q3 b2 = this.f5289c.b(this.f5287a, this.f5288b, this.f5291e.a(), this.f5290d);
                this.f5293g = b2;
                this.f5294h.add(b2);
            }
        }
        return this.f5293g;
    }

    public synchronized void a(C0635pi piVar) {
        for (C0510ki a2 : this.f5294h) {
            a2.a(piVar);
        }
    }

    public synchronized void a(C0411gi giVar, C0635pi piVar) {
        for (C0510ki a2 : this.f5294h) {
            a2.a(giVar, piVar);
        }
    }

    public void a(D3 d3) {
        this.f5290d.a(d3.f3847a);
        D3.a aVar = d3.f3848b;
        synchronized (this) {
            this.f5291e.a(aVar);
            Q3 q3 = this.f5293g;
            if (q3 != null) {
                ((C0860z4) q3).a(aVar);
            }
            COMPONENT component = this.f5292f;
            if (component != null) {
                component.a(aVar);
            }
        }
    }
}
