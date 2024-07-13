package com.yandex.metrica.impl.ob;

import android.location.Location;
import com.yandex.metrica.impl.ob.C0632pf;
import java.util.concurrent.TimeUnit;

/* renamed from: com.yandex.metrica.impl.ob.ad  reason: case insensitive filesystem */
public class C0256ad {
    public C0632pf.b a(Hc hc) {
        C0632pf.b bVar = new C0632pf.b();
        Location c2 = hc.c();
        bVar.f6452a = hc.b() == null ? bVar.f6452a : hc.b().longValue();
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        bVar.f6454c = timeUnit.toSeconds(c2.getTime());
        bVar.k = J1.a(hc.f4106a);
        bVar.f6453b = timeUnit.toSeconds(hc.e());
        bVar.l = timeUnit.toSeconds(hc.d());
        bVar.f6455d = c2.getLatitude();
        bVar.f6456e = c2.getLongitude();
        bVar.f6457f = Math.round(c2.getAccuracy());
        bVar.f6458g = Math.round(c2.getBearing());
        bVar.f6459h = Math.round(c2.getSpeed());
        bVar.i = (int) Math.round(c2.getAltitude());
        String provider = c2.getProvider();
        int i = 0;
        if ("gps".equals(provider)) {
            i = 1;
        } else if ("network".equals(provider)) {
            i = 2;
        } else if ("fused".equals(provider)) {
            i = 3;
        }
        bVar.j = i;
        bVar.m = J1.a(hc.a());
        return bVar;
    }
}
