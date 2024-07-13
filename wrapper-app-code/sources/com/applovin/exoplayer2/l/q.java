package com.applovin.exoplayer2.l;

import android.text.TextUtils;
import android.util.Log;
import java.net.UnknownHostException;

public final class q {

    /* renamed from: a  reason: collision with root package name */
    private static int f13570a = 0;

    /* renamed from: b  reason: collision with root package name */
    private static boolean f13571b = true;

    private static String a(String str, Throwable th) {
        String a2 = a(th);
        if (TextUtils.isEmpty(a2)) {
            return str;
        }
        return str + "\n  " + a2.replace("\n", "\n  ") + 10;
    }

    public static String a(Throwable th) {
        if (th == null) {
            return null;
        }
        return b(th) ? "UnknownHostException (no network)" : !f13571b ? th.getMessage() : Log.getStackTraceString(th).trim().replace("\t", "    ");
    }

    public static void a(String str, String str2) {
        if (f13570a == 0) {
            Log.d(str, str2);
        }
    }

    public static void a(String str, String str2, Throwable th) {
        b(str, a(str2, th));
    }

    public static void b(String str, String str2) {
        if (f13570a <= 1) {
            Log.i(str, str2);
        }
    }

    public static void b(String str, String str2, Throwable th) {
        c(str, a(str2, th));
    }

    private static boolean b(Throwable th) {
        while (th != null) {
            if (th instanceof UnknownHostException) {
                return true;
            }
            th = th.getCause();
        }
        return false;
    }

    public static void c(String str, String str2) {
        if (f13570a <= 2) {
            Log.w(str, str2);
        }
    }

    public static void c(String str, String str2, Throwable th) {
        d(str, a(str2, th));
    }

    public static void d(String str, String str2) {
        if (f13570a <= 3) {
            Log.e(str, str2);
        }
    }
}
