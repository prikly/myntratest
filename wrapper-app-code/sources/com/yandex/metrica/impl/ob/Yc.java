package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C0632pf;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;

public class Yc {
    public C0632pf.a a(C0529lc lcVar) {
        int i;
        int i2;
        C0632pf.a aVar = new C0632pf.a();
        aVar.f6445a = lcVar.f() == null ? aVar.f6445a : lcVar.f().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        aVar.f6446b = timeUnit.toSeconds(lcVar.d());
        aVar.f6449e = timeUnit.toSeconds(lcVar.c());
        if (lcVar.b() == null) {
            i = 0;
        } else {
            i = J1.a(lcVar.b());
        }
        aVar.f6450f = i;
        if (lcVar.e() == null) {
            i2 = 3;
        } else {
            i2 = J1.a(lcVar.e());
        }
        aVar.f6451g = i2;
        JSONArray a2 = lcVar.a();
        if (a2 != null) {
            aVar.f6447c = J1.b(a2);
        }
        JSONArray g2 = lcVar.g();
        if (g2 != null) {
            aVar.f6448d = J1.a(g2);
        }
        return aVar;
    }
}
