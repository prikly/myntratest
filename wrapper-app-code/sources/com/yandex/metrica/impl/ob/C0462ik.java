package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0685rl;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.yandex.metrica.impl.ob.ik  reason: case insensitive filesystem */
class C0462ik {

    /* renamed from: a  reason: collision with root package name */
    private final List<Object> f5995a;

    C0462ik(List<Object> list) {
        this.f5995a = list;
    }

    /* access modifiers changed from: package-private */
    public C0685rl.b a(String str) {
        Iterator<Object> it = this.f5995a.iterator();
        while (it.hasNext()) {
            Cl cl = (Cl) it.next();
            if (cl.a(str)) {
                return cl.a();
            }
        }
        return null;
    }
}
