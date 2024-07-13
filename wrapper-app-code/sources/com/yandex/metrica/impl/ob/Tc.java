package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Looper;

class Tc extends Dc<Xb> {

    /* renamed from: f  reason: collision with root package name */
    private final LocationManager f5017f;
    /* access modifiers changed from: private */

    /* renamed from: g  reason: collision with root package name */
    public final String f5018g;

    Tc(Context context, Looper looper, LocationManager locationManager, C0869zd zdVar, String str, LocationListener locationListener) {
        super(context, locationListener, zdVar, looper);
        this.f5017f = locationManager;
        this.f5018g = str;
    }

    public void b() {
        Location location;
        if (this.f3870b.a(this.f3869a)) {
            LocationManager locationManager = this.f5017f;
            if (locationManager != null) {
                try {
                    location = locationManager.getLastKnownLocation(this.f5018g);
                } catch (Throwable unused) {
                }
                this.f3871c.onLocationChanged(location);
            }
            location = null;
            this.f3871c.onLocationChanged(location);
        }
    }

    public boolean c() {
        if (!this.f3870b.a(this.f3869a)) {
            return false;
        }
        String str = this.f5018g;
        long j = Dc.f3868e;
        LocationListener locationListener = this.f3871c;
        Looper looper = this.f3872d;
        LocationManager locationManager = this.f5017f;
        if (locationManager == null) {
            return false;
        }
        try {
            locationManager.requestLocationUpdates(str, j, 0.0f, locationListener, looper);
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }

    public /* bridge */ /* synthetic */ boolean a(Object obj) {
        Xb xb = (Xb) obj;
        return c();
    }

    public void a() {
        LocationManager locationManager = this.f5017f;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this.f3871c);
            } catch (Throwable unused) {
            }
        }
    }
}
