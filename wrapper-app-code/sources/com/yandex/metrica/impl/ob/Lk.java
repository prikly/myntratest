package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C0853yl;
import com.yandex.metrica.uiaccessor.b;
import java.util.List;

class Lk implements C0829xl {

    /* renamed from: a  reason: collision with root package name */
    private final b f4508a;

    /* renamed from: b  reason: collision with root package name */
    private final C0853yl.a f4509b;

    /* renamed from: c  reason: collision with root package name */
    private final El f4510c;

    /* renamed from: d  reason: collision with root package name */
    private final Dl f4511d;

    Lk(C0564mm<Activity> mmVar, El el) {
        this(new C0853yl.a(), mmVar, el, new Ek(), new Dl());
    }

    public void a(Activity activity, long j) {
    }

    public void a(Activity activity, boolean z) {
        if (!z) {
            try {
                this.f4508a.subscribe(activity);
            } catch (Throwable unused) {
            }
        }
    }

    public boolean a(C0389fl flVar) {
        return false;
    }

    Lk(C0853yl.a aVar, C0564mm<Activity> mmVar, El el, Ek ek, Dl dl) {
        this.f4509b = aVar;
        this.f4510c = el;
        this.f4508a = ek.a(mmVar);
        this.f4511d = dl;
    }

    public void a(long j, Activity activity, C0339dl dlVar, List<C0685rl> list, C0389fl flVar, Bk bk) {
        C0439hl hlVar;
        C0439hl hlVar2;
        if (flVar.f5822b && (hlVar2 = flVar.f5826f) != null) {
            this.f4510c.b(this.f4511d.a(activity, dlVar, hlVar2, bk.b(), j));
        }
        if (flVar.f5824d && (hlVar = flVar.f5828h) != null) {
            this.f4510c.a(this.f4511d.a(activity, dlVar, hlVar, bk.d(), j));
        }
    }

    public void a(Throwable th, C0805wl wlVar) {
        this.f4509b.getClass();
        new C0853yl(wlVar, C0609oh.a()).a("ui_parsing", th);
    }

    public void a(Activity activity) {
        try {
            this.f4508a.unsubscribe(activity);
        } catch (Throwable unused) {
        }
    }
}
