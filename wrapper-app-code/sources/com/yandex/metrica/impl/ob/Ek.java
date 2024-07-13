package com.yandex.metrica.impl.ob;

import android.app.Activity;
import com.yandex.metrica.uiaccessor.a;

class Ek {

    class a implements a.C0058a {

        /* renamed from: a  reason: collision with root package name */
        final /* synthetic */ C0564mm f3967a;

        a(Ek ek, C0564mm mmVar) {
            this.f3967a = mmVar;
        }

        public void fragmentAttached(Activity activity) {
            this.f3967a.b(activity);
        }
    }

    class b implements com.yandex.metrica.uiaccessor.b {
        b(Ek ek) {
        }

        public void subscribe(Activity activity) throws Throwable {
        }

        public void unsubscribe(Activity activity) throws Throwable {
        }
    }

    Ek() {
    }

    /* access modifiers changed from: package-private */
    public com.yandex.metrica.uiaccessor.b a(C0564mm<Activity> mmVar) {
        com.yandex.metrica.uiaccessor.a aVar;
        try {
            aVar = new com.yandex.metrica.uiaccessor.a(new a(this, mmVar));
        } catch (Throwable unused) {
            aVar = null;
        }
        return aVar == null ? new b(this) : aVar;
    }
}
