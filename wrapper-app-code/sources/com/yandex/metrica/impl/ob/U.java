package com.yandex.metrica.impl.ob;

import android.os.Build;
import java.util.ArrayList;
import java.util.Collections;

public class U {

    /* renamed from: f  reason: collision with root package name */
    private static final Object f5050f = new Object();

    /* renamed from: g  reason: collision with root package name */
    private static volatile U f5051g;

    /* renamed from: a  reason: collision with root package name */
    public final String f5052a = Build.MANUFACTURER;

    /* renamed from: b  reason: collision with root package name */
    public final String f5053b = Build.MODEL;

    /* renamed from: c  reason: collision with root package name */
    public final String f5054c = Build.VERSION.RELEASE;

    /* renamed from: d  reason: collision with root package name */
    public final int f5055d = Build.VERSION.SDK_INT;

    /* renamed from: e  reason: collision with root package name */
    public final String f5056e = String.valueOf(X1.a());

    class a extends ArrayList<String> {
        a(U u) {
            if (X1.b()) {
                add("Superuser.apk");
            }
            if (X1.c()) {
                add("su.so");
            }
        }
    }

    public U() {
        Collections.unmodifiableList(new a(this));
    }

    public static U a() {
        if (f5051g == null) {
            synchronized (f5050f) {
                if (f5051g == null) {
                    f5051g = new U();
                }
            }
        }
        return f5051g;
    }
}
