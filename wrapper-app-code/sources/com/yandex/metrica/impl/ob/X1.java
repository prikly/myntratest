package com.yandex.metrica.impl.ob;

import java.io.File;

public final class X1 {

    /* renamed from: a  reason: collision with root package name */
    private static final B0 f5283a = new B0();

    /* renamed from: b  reason: collision with root package name */
    private static final String[] f5284b = {"/sbin/", "/system/bin/", "/system/xbin/", "/data/local/xbin/", "/data/local/bin/", "/system/sd/xbin/", "/system/bin/failsafe/", "/data/local/"};

    public static int a() {
        return (b() || c()) ? 1 : 0;
    }

    public static boolean b() {
        File file;
        try {
            if (A2.a(21)) {
                file = new File("/system/app/Superuser/Superuser.apk");
            } else {
                file = new File("/system/app/Superuser.apk");
            }
            return file.exists();
        } catch (Throwable unused) {
            return false;
        }
    }

    public static boolean c() {
        boolean z;
        String[] strArr = f5284b;
        int length = strArr.length;
        int i = 0;
        while (i < length) {
            String str = strArr[i];
            try {
                if (!A2.a(31)) {
                    z = new File(str + "su").exists();
                } else {
                    z = false;
                }
                if (z) {
                    return true;
                }
                i++;
            } catch (Throwable unused) {
            }
        }
        return false;
    }
}
