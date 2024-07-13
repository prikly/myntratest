package com.yandex.metrica.impl.ob;

/* renamed from: com.yandex.metrica.impl.ob.xd  reason: case insensitive filesystem */
class C0821xd implements C0797wd {

    /* renamed from: a  reason: collision with root package name */
    private final boolean f7105a;

    C0821xd(boolean z) {
        this.f7105a = z;
    }

    public boolean a(String str) {
        if ("android.permission.ACCESS_FINE_LOCATION".equals(str) || "android.permission.ACCESS_COARSE_LOCATION".equals(str)) {
            return this.f7105a;
        }
        return true;
    }

    public String toString() {
        return "LocationFlagStrategy{mEnabled=" + this.f7105a + '}';
    }
}
