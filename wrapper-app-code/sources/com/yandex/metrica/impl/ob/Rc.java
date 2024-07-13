package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.text.TextUtils;
import com.yandex.metrica.coreutils.services.SystemTimeProvider;
import com.yandex.metrica.impl.ob.C0604oc;

class Rc extends V<Location> {

    /* renamed from: b  reason: collision with root package name */
    private U7 f4863b;

    /* renamed from: c  reason: collision with root package name */
    private Vb f4864c;

    /* renamed from: d  reason: collision with root package name */
    private SystemTimeProvider f4865d;

    /* renamed from: e  reason: collision with root package name */
    private final E f4866e;

    /* renamed from: f  reason: collision with root package name */
    private final C0783w f4867f;

    Rc(V<Location> v, U7 u7, Vb vb, SystemTimeProvider systemTimeProvider, E e2, C0783w wVar) {
        super(v);
        this.f4863b = u7;
        this.f4864c = vb;
        this.f4865d = systemTimeProvider;
        this.f4866e = e2;
        this.f4867f = wVar;
    }

    public void b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            Hc hc = new Hc(C0604oc.a.a(this.f4867f.c()), this.f4865d.currentTimeMillis(), this.f4865d.elapsedRealtime(), location, this.f4866e.b(), (Long) null);
            String a2 = this.f4864c.a(hc);
            if (!TextUtils.isEmpty(a2)) {
                this.f4863b.a(hc.e(), a2);
            }
        }
    }
}
