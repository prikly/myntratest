package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;

public class Oc {

    /* renamed from: a  reason: collision with root package name */
    private final LocationManager f4649a;

    /* renamed from: b  reason: collision with root package name */
    private final H2 f4650b;

    /* renamed from: c  reason: collision with root package name */
    private final Xj f4651c = F0.g().v();

    public Oc(Context context) {
        this.f4649a = (LocationManager) context.getSystemService("location");
        this.f4650b = H2.a(context);
    }

    public LocationManager a() {
        return this.f4649a;
    }

    public Xj b() {
        return this.f4651c;
    }

    public H2 c() {
        return this.f4650b;
    }
}
