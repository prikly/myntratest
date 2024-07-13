package com.yandex.metrica.impl.ob;

import android.location.LocationManager;

public class Cc {

    /* renamed from: a  reason: collision with root package name */
    public final Sb f3817a;

    /* renamed from: b  reason: collision with root package name */
    public final LocationManager f3818b;

    /* renamed from: c  reason: collision with root package name */
    public final C0554mc f3819c;

    Cc(Sb sb, C0635pi piVar, C0554mc mcVar, LocationManager locationManager, Sc sc, Rb rb) {
        this.f3817a = sb;
        this.f3819c = mcVar;
        this.f3818b = locationManager;
    }

    public static Cc a(Nc nc, Sc sc, Rb rb, LocationManager locationManager) {
        return new Cc(nc.f4601a, nc.f4602b, nc.f4603c, locationManager, sc, rb);
    }
}
