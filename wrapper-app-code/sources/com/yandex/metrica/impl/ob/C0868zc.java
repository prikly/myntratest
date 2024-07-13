package com.yandex.metrica.impl.ob;

import android.location.Location;
import android.location.LocationListener;
import android.os.Bundle;

/* renamed from: com.yandex.metrica.impl.ob.zc  reason: case insensitive filesystem */
public class C0868zc implements LocationListener {

    /* renamed from: a  reason: collision with root package name */
    private final Pc f7224a;

    public C0868zc(Pc pc) {
        this.f7224a = pc;
    }

    public void onLocationChanged(Location location) {
        if (location != null) {
            this.f7224a.a(location);
        }
    }

    public void onProviderDisabled(String str) {
    }

    public void onProviderEnabled(String str) {
    }

    public void onStatusChanged(String str, int i, Bundle bundle) {
    }
}
