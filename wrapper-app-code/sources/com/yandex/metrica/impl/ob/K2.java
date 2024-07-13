package com.yandex.metrica.impl.ob;

import android.location.Location;

public final class K2 extends Location {

    /* renamed from: a  reason: collision with root package name */
    private final String f4390a;

    private K2(Location location, String str) {
        super(location);
        this.f4390a = str;
    }

    public static K2 b(Location location) {
        return new K2(new Location(location), "");
    }

    public String a() {
        return this.f4390a;
    }

    public static K2 a(Location location) {
        Location location2 = new Location(location);
        String provider = location2.getProvider();
        location2.setProvider("");
        return new K2(location2, provider);
    }
}
