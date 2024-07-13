package com.yandex.metrica.impl.ob;

import android.app.Activity;
import android.os.Bundle;

class Vk {

    /* renamed from: a  reason: collision with root package name */
    private final Ok f5236a;

    /* renamed from: b  reason: collision with root package name */
    private final Yk f5237b;

    Vk(Ok ok, Yk yk) {
        this.f5236a = ok;
        this.f5237b = yk;
    }

    /* access modifiers changed from: package-private */
    public boolean a(Activity activity, C0805wl wlVar) {
        String str;
        Bundle a2 = this.f5236a.a(activity);
        if (a2 == null) {
            str = null;
        } else {
            str = a2.getString("yandex:ads:context");
        }
        return this.f5237b.a(str, wlVar);
    }
}
