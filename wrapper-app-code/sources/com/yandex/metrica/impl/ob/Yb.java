package com.yandex.metrica.impl.ob;

import android.location.Location;

public class Yb extends V<Location> {

    /* renamed from: b  reason: collision with root package name */
    private final C0820xc f5379b;

    public Yb(V<Location> v, C0820xc xcVar) {
        super(v);
        this.f5379b = xcVar;
    }

    public void b(Object obj) {
        Location location = (Location) obj;
        if (location != null) {
            this.f5379b.b(location);
        }
    }
}
