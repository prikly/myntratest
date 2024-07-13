package com.yandex.metrica.impl.ob;

import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONObject;

/* renamed from: com.yandex.metrica.impl.ob.dl  reason: case insensitive filesystem */
class C0339dl {

    /* renamed from: a  reason: collision with root package name */
    private Pk f5695a;

    C0339dl() {
    }

    /* access modifiers changed from: package-private */
    public void a(Rk rk, View view, Hk hk) {
        Pk b2 = rk.b((C0685rl) null, view, 0);
        this.f5695a = b2;
        if (b2 != null) {
            a(rk, b2, view, 1, hk);
        }
    }

    /* access modifiers changed from: package-private */
    public JSONObject a(C0439hl hlVar, Ak ak, int i) {
        Pk pk = this.f5695a;
        JSONObject jSONObject = pk != null ? pk.a(hlVar, ak, i, 0).f4792c : null;
        return jSONObject == null ? new JSONObject() : jSONObject;
    }

    private void a(Rk rk, Pk pk, View view, int i, Hk hk) {
        ArrayList arrayList = (ArrayList) rk.a(view, i);
        if (arrayList.size() == 0) {
            hk.a(pk.a());
            return;
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            View view2 = (View) it.next();
            Pk b2 = rk.b(pk.a(), view2, i);
            if (b2 != null) {
                pk.a(b2);
                a(rk, b2, view2, i + 1, hk);
            }
        }
    }
}
