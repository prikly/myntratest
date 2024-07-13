package com.ironsource.sdk.utils;

import android.text.TextUtils;
import android.util.Log;
import com.ironsource.sdk.g.d;

public class Logger {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f9610a;

    public static void d(String str, String str2) {
        if (f9610a) {
            Log.d(str, str2);
        }
    }

    public static void d(String str, String str2, Throwable th) {
        if (f9610a) {
            Log.d(str, str2, th);
        }
    }

    public static void e(String str, String str2) {
        if (f9610a) {
            Log.e(str, str2);
        }
    }

    public static void e(String str, String str2, Throwable th) {
        if (f9610a) {
            Log.e(str, str2, th);
        }
    }

    public static void enableLogging(int i) {
        f9610a = d.C0090d.MODE_0.f9547d != i;
    }

    public static void i(String str, String str2) {
        if (f9610a) {
            Log.i(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        if (f9610a && !TextUtils.isEmpty(str2)) {
            Log.i(str, str2, th);
        }
    }

    public static void v(String str, String str2) {
        if (f9610a) {
            Log.v(str, str2);
        }
    }

    public static void v(String str, String str2, Throwable th) {
        if (f9610a) {
            Log.v(str, str2, th);
        }
    }

    public static void w(String str, String str2) {
        if (f9610a) {
            Log.w(str, str2);
        }
    }

    public static void w(String str, String str2, Throwable th) {
        if (f9610a) {
            Log.w(str, str2, th);
        }
    }
}
