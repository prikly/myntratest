package com.google.android.gms.internal.ads;

import android.os.Looper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcjs implements Runnable {
    zzcjs(zzcju zzcju) {
    }

    public final void run() {
        Looper.myLooper().quit();
    }
}
