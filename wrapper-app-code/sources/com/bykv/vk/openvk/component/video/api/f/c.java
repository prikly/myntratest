package com.bykv.vk.openvk.component.video.api.f;

import android.util.Log;

/* compiled from: VLogger */
public class c {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18189a = false;

    /* renamed from: b  reason: collision with root package name */
    private static int f18190b = 4;

    public static void a(int i) {
        f18190b = i;
    }

    public static void a() {
        f18189a = true;
        a(3);
    }

    public static boolean b() {
        return f18189a;
    }

    public static void a(String str, String str2) {
        if (f18189a && str2 != null && f18190b <= 3) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        if (f18189a) {
            if (!(str2 == null && th == null) && f18190b <= 3) {
                Log.d(str, str2, th);
            }
        }
    }

    public static void a(String str, Object... objArr) {
        if (f18189a && objArr != null && f18190b <= 3) {
            Log.v(str, a(objArr));
        }
    }

    public static void a(String str) {
        if (f18189a) {
            b("Logger", str);
        }
    }

    public static void b(String str, String str2) {
        if (f18189a && str2 != null && f18190b <= 4) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        if (f18189a) {
            if (!(str2 == null && th == null) && f18190b <= 4) {
                Log.i(str, str2, th);
            }
        }
    }

    public static void b(String str, Object... objArr) {
        if (f18189a && objArr != null && f18190b <= 4) {
            Log.v(str, a(objArr));
        }
    }

    public static void c(String str, String str2) {
        if (f18189a && str2 != null && f18190b <= 6) {
            Log.e(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        if (f18189a) {
            if (!(str2 == null && th == null) && f18190b <= 6) {
                Log.e(str, str2, th);
            }
        }
    }

    private static String a(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }
}
