package com.yandex.metrica.impl.ob;

import android.content.Context;

/* renamed from: com.yandex.metrica.impl.ob.yd  reason: case insensitive filesystem */
public class C0845yd {

    /* renamed from: a  reason: collision with root package name */
    private C0797wd f7156a;

    public C0845yd(C0797wd wdVar) {
        this.f7156a = wdVar;
    }

    public void a(C0797wd wdVar) {
        this.f7156a = wdVar;
    }

    public boolean b(Context context) {
        if (!this.f7156a.a("android.permission.READ_PHONE_STATE")) {
            return false;
        }
        return C0773vd.a(context, "android.permission.READ_PHONE_STATE");
    }

    public boolean c(Context context) {
        if (!this.f7156a.a("android.permission.ACCESS_WIFI_STATE")) {
            return false;
        }
        return C0773vd.a(context, "android.permission.ACCESS_WIFI_STATE");
    }

    public boolean a(Context context) {
        if (!this.f7156a.a("android.permission.ACCESS_COARSE_LOCATION")) {
            return false;
        }
        return C0773vd.a(context, "android.permission.ACCESS_COARSE_LOCATION");
    }
}
