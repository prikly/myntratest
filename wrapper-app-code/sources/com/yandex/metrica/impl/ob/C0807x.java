package com.yandex.metrica.impl.ob;

import android.content.Context;
import android.location.LocationManager;

/* renamed from: com.yandex.metrica.impl.ob.x  reason: case insensitive filesystem */
public class C0807x {

    /* renamed from: a  reason: collision with root package name */
    private final LocationManager f7076a;

    public C0807x(Context context) {
        this((LocationManager) context.getSystemService("location"));
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:8:0x0012  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.util.List<java.lang.String> a() {
        /*
            r3 = this;
            android.location.LocationManager r0 = r3.f7076a
            java.util.List r1 = java.util.Collections.emptyList()
            if (r0 == 0) goto L_0x000e
            r2 = 1
            java.util.List r0 = r0.getProviders(r2)     // Catch:{ all -> 0x000e }
            goto L_0x000f
        L_0x000e:
            r0 = 0
        L_0x000f:
            if (r0 != 0) goto L_0x0012
            goto L_0x0013
        L_0x0012:
            r1 = r0
        L_0x0013:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.yandex.metrica.impl.ob.C0807x.a():java.util.List");
    }

    C0807x(LocationManager locationManager) {
        this.f7076a = locationManager;
    }
}
