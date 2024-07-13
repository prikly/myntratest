package com.bytedance.sdk.openadsdk.utils;

import android.os.Looper;
import com.bytedance.sdk.component.f.e;
import com.bytedance.sdk.component.f.g;

/* compiled from: ThreadUtils */
public class t {
    public static boolean a() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

    public static void a(g gVar) {
        e.a(gVar, 5);
    }

    public static void b(g gVar) {
        e.b(gVar);
    }
}
