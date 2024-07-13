package com.applovin.impl.sdk;

import android.location.Location;
import android.location.LocationManager;
import android.provider.Settings;
import com.applovin.impl.sdk.c.b;
import com.applovin.impl.sdk.utils.h;
import java.util.concurrent.TimeUnit;

public class u {

    /* renamed from: a  reason: collision with root package name */
    private final n f15789a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationManager f15790b;

    /* renamed from: c  reason: collision with root package name */
    private double f15791c;

    /* renamed from: d  reason: collision with root package name */
    private double f15792d;

    /* renamed from: e  reason: collision with root package name */
    private long f15793e;

    u(n nVar) {
        this.f15789a = nVar;
        this.f15790b = (LocationManager) nVar.P().getSystemService("location");
    }

    private Location a(String str, String str2) {
        v D;
        StringBuilder sb;
        String str3;
        if (!h.a(str2, this.f15789a.P())) {
            return null;
        }
        try {
            return this.f15790b.getLastKnownLocation(str);
        } catch (SecurityException e2) {
            th = e2;
            this.f15789a.D();
            if (v.a()) {
                D = this.f15789a.D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": access denied.";
                sb.append(str3);
                D.b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (IllegalArgumentException e3) {
            th = e3;
            this.f15789a.D();
            if (v.a()) {
                D = this.f15789a.D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": device does not support this location provider.";
                sb.append(str3);
                D.b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (NullPointerException e4) {
            th = e4;
            this.f15789a.D();
            if (v.a()) {
                D = this.f15789a.D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ": location provider is not available.";
                sb.append(str3);
                D.b("LocationManager", sb.toString(), th);
            }
            return null;
        } catch (Throwable th) {
            th = th;
            this.f15789a.D();
            if (v.a()) {
                D = this.f15789a.D();
                sb = new StringBuilder();
                sb.append("Failed to retrieve location from ");
                sb.append(str);
                str3 = ".";
                sb.append(str3);
                D.b("LocationManager", sb.toString(), th);
            }
            return null;
        }
    }

    private boolean f() {
        long millis = TimeUnit.MINUTES.toMillis(((Long) this.f15789a.a(b.eg)).longValue());
        if (this.f15793e != 0 && System.currentTimeMillis() - this.f15793e < millis) {
            return false;
        }
        Location a2 = a("gps", "android.permission.ACCESS_FINE_LOCATION");
        if (a2 == null) {
            a2 = a("network", "android.permission.ACCESS_COARSE_LOCATION");
        }
        if (a2 == null) {
            return false;
        }
        this.f15791c = a2.getLatitude();
        this.f15792d = a2.getLongitude();
        this.f15793e = System.currentTimeMillis();
        return true;
    }

    public boolean a() {
        return h.a("android.permission.ACCESS_COARSE_LOCATION", this.f15789a.P());
    }

    public boolean b() {
        return h.h() ? this.f15790b.isLocationEnabled() : !h.c() || Settings.Secure.getInt(this.f15789a.P().getContentResolver(), "location_mode", 0) != 0;
    }

    public boolean c() {
        if (this.f15789a.q().isLocationCollectionEnabled() && ((Boolean) this.f15789a.a(b.ef)).booleanValue() && a()) {
            return f() || this.f15793e != 0;
        }
        return false;
    }

    public double d() {
        return this.f15791c;
    }

    public double e() {
        return this.f15792d;
    }
}
