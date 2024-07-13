package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.impl.ob.C0853yl;

/* renamed from: com.yandex.metrica.impl.ob.el  reason: case insensitive filesystem */
class C0364el {

    /* renamed from: a  reason: collision with root package name */
    private final C0709sl f5767a;

    /* renamed from: b  reason: collision with root package name */
    private final C0853yl.a f5768b;

    /* renamed from: c  reason: collision with root package name */
    private final C0733tl f5769c;

    C0364el() {
        this(new C0709sl(), new C0853yl.a(), new C0733tl());
    }

    /* access modifiers changed from: package-private */
    public C0339dl a(Activity activity, C0805wl wlVar, Ak ak, Hk hk, boolean z) throws Throwable {
        if (z) {
            return new C0339dl();
        }
        C0733tl tlVar = this.f5769c;
        this.f5768b.getClass();
        return tlVar.a(activity, hk, wlVar, ak, new C0853yl(wlVar, C0609oh.a()), this.f5767a);
    }

    C0364el(C0709sl slVar, C0853yl.a aVar, C0733tl tlVar) {
        this.f5767a = slVar;
        this.f5768b = aVar;
        this.f5769c = tlVar;
    }
}
