package com.bytedance.sdk.component.a;

import android.util.Log;

/* compiled from: DebugUtil */
class i {

    /* renamed from: a  reason: collision with root package name */
    private static boolean f18235a;

    static void a(boolean z) {
        f18235a = z;
    }

    static void a(String str) {
        if (f18235a) {
            Log.i("JsBridge2", str);
        }
    }

    static void b(String str) {
        if (f18235a) {
            Log.w("JsBridge2", str);
        }
    }

    static void a(String str, Throwable th) {
        if (f18235a) {
            Log.w("JsBridge2", str, th);
            Log.w("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    static void b(String str, Throwable th) {
        if (f18235a) {
            Log.e("JsBridge2", str, th);
            Log.e("JsBridge2", "Stacktrace: " + Log.getStackTraceString(th));
        }
    }

    static void a(RuntimeException runtimeException) {
        if (f18235a) {
            throw runtimeException;
        }
    }
}
