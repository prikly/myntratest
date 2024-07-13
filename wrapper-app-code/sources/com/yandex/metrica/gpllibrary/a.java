package com.yandex.metrica.gpllibrary;

import android.content.Context;
import android.location.LocationListener;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationCallback;
import com.google.android.gms.location.LocationRequest;
import java.util.concurrent.Executor;

public class a implements b {

    /* renamed from: a  reason: collision with root package name */
    private final FusedLocationProviderClient f3615a;

    /* renamed from: b  reason: collision with root package name */
    private final LocationListener f3616b;

    /* renamed from: c  reason: collision with root package name */
    private final LocationCallback f3617c;

    /* renamed from: d  reason: collision with root package name */
    private final Looper f3618d;

    /* renamed from: e  reason: collision with root package name */
    private final Executor f3619e;

    /* renamed from: f  reason: collision with root package name */
    private final long f3620f;

    /* renamed from: com.yandex.metrica.gpllibrary.a$a  reason: collision with other inner class name */
    static class C0043a {

        /* renamed from: a  reason: collision with root package name */
        private final Context f3621a;

        C0043a(Context context) {
            this.f3621a = context;
        }

        /* access modifiers changed from: package-private */
        public FusedLocationProviderClient a() throws Throwable {
            return new FusedLocationProviderClient(this.f3621a);
        }
    }

    public enum b {
        PRIORITY_NO_POWER,
        PRIORITY_LOW_POWER,
        PRIORITY_BALANCED_POWER_ACCURACY,
        PRIORITY_HIGH_ACCURACY
    }

    public a(Context context, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this(new C0043a(context), locationListener, looper, executor, j);
    }

    public void startLocationUpdates(b bVar) throws Throwable {
        Log.d("[GplLibraryWrapper]", "startLocationUpdates");
        FusedLocationProviderClient fusedLocationProviderClient = this.f3615a;
        LocationRequest interval = LocationRequest.create().setInterval(this.f3620f);
        int ordinal = bVar.ordinal();
        fusedLocationProviderClient.requestLocationUpdates(interval.setPriority(ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? 105 : 100 : 102 : 104), this.f3617c, this.f3618d);
    }

    public void stopLocationUpdates() throws Throwable {
        Log.d("[GplLibraryWrapper]", "stopLocationUpdates");
        this.f3615a.removeLocationUpdates(this.f3617c);
    }

    public void updateLastKnownLocation() throws Throwable {
        Log.d("[GplLibraryWrapper]", "updateLastKnownLocation");
        this.f3615a.getLastLocation().addOnSuccessListener(this.f3619e, new GplOnSuccessListener(this.f3616b));
    }

    a(C0043a aVar, LocationListener locationListener, Looper looper, Executor executor, long j) throws Throwable {
        this.f3615a = aVar.a();
        this.f3616b = locationListener;
        this.f3618d = looper;
        this.f3619e = executor;
        this.f3620f = j;
        this.f3617c = new GplLocationCallback(locationListener);
    }
}
