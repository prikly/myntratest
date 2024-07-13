package com.applovin.exoplayer2.l;

import android.os.Bundle;
import android.os.IBinder;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public final class b {

    /* renamed from: a  reason: collision with root package name */
    private static Method f13533a;

    public static IBinder a(Bundle bundle, String str) {
        return ai.f13525a >= 18 ? bundle.getBinder(str) : b(bundle, str);
    }

    private static IBinder b(Bundle bundle, String str) {
        String str2;
        Method method = f13533a;
        if (method == null) {
            try {
                Method method2 = Bundle.class.getMethod("getIBinder", new Class[]{String.class});
                f13533a = method2;
                method2.setAccessible(true);
                method = f13533a;
            } catch (NoSuchMethodException e2) {
                e = e2;
                str2 = "Failed to retrieve getIBinder method";
                q.a("BundleUtil", str2, e);
                return null;
            }
        }
        try {
            return (IBinder) method.invoke(bundle, new Object[]{str});
        } catch (IllegalAccessException | IllegalArgumentException | InvocationTargetException e3) {
            e = e3;
            str2 = "Failed to invoke getIBinder via reflection";
            q.a("BundleUtil", str2, e);
            return null;
        }
    }
}
