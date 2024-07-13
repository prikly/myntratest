package com.yandex.metrica.impl.ob;

import android.telephony.CellInfo;
import com.yandex.metrica.impl.ob.C0755uj;

/* renamed from: com.yandex.metrica.impl.ob.pj  reason: case insensitive filesystem */
public abstract class C0636pj<T extends CellInfo> implements Object<T> {

    /* renamed from: a  reason: collision with root package name */
    private final String f6474a = ("[" + getClass().getName() + "]");

    /* renamed from: b  reason: collision with root package name */
    private volatile Sh f6475b;

    private boolean b(T t) {
        Sh sh = this.f6475b;
        if (sh == null || !sh.t) {
            return false;
        }
        boolean isRegistered = t.isRegistered();
        if (!sh.u || isRegistered) {
            return true;
        }
        return false;
    }

    public void a(T t, C0755uj.a aVar) {
        b(t, aVar);
        if (b(t)) {
            c(t, aVar);
        }
    }

    /* access modifiers changed from: protected */
    public abstract void b(T t, C0755uj.a aVar);

    /* access modifiers changed from: protected */
    public abstract void c(T t, C0755uj.a aVar);

    public void a(Sh sh) {
        this.f6475b = sh;
    }
}
