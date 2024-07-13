package com.yandex.metrica.impl.ob;

import android.app.Activity;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.gk  reason: case insensitive filesystem */
class C0413gk implements C0781vl {

    /* renamed from: a  reason: collision with root package name */
    private final C0512kk f5881a;

    /* renamed from: b  reason: collision with root package name */
    private final C0277b9 f5882b;

    /* renamed from: c  reason: collision with root package name */
    private final C0538ll f5883c;

    /* renamed from: d  reason: collision with root package name */
    private final a f5884d;

    /* renamed from: e  reason: collision with root package name */
    private final boolean f5885e;

    /* renamed from: com.yandex.metrica.impl.ob.gk$a */
    static class a {
        a() {
        }
    }

    /* renamed from: com.yandex.metrica.impl.ob.gk$b */
    static class b {
        b() {
        }
    }

    C0413gk(C0512kk kkVar, C0277b9 b9Var, boolean z, C0538ll llVar, a aVar) {
        this.f5881a = kkVar;
        this.f5882b = b9Var;
        this.f5885e = z;
        this.f5883c = llVar;
        this.f5884d = aVar;
    }

    private boolean b(C0389fl flVar) {
        if (!flVar.f5823c || flVar.f5827g == null) {
            return false;
        }
        if (this.f5885e || this.f5882b.a(false)) {
            return true;
        }
        return false;
    }

    public void a(long j, Activity activity, C0339dl dlVar, List<C0685rl> list, C0389fl flVar, Bk bk) {
        Fk fk;
        if (b(flVar)) {
            a aVar = this.f5884d;
            C0439hl hlVar = flVar.f5827g;
            aVar.getClass();
            if (hlVar.f5950h) {
                fk = new Fk();
            } else {
                fk = new Ck(list);
            }
            this.f5881a.a(fk.a(activity, dlVar, flVar.f5827g, bk.a(), j));
            this.f5883c.onResult(this.f5881a.a());
        }
    }

    public void a(Throwable th, C0805wl wlVar) {
        C0538ll llVar = this.f5883c;
        llVar.onError("exception: " + th.getMessage());
    }

    public boolean a(C0389fl flVar) {
        return b(flVar) && !flVar.f5827g.f5950h;
    }
}
