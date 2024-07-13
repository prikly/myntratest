package com.appodeal.ads;

import android.os.Handler;
import android.os.Looper;

public final class h5 {

    /* renamed from: a  reason: collision with root package name */
    public static final Handler f16458a = new Handler(Looper.getMainLooper());

    public static void a(Runnable runnable) {
        f16458a.post(runnable);
    }

    public static void a(Runnable runnable, long j) {
        f16458a.postDelayed(runnable, j);
    }
}
