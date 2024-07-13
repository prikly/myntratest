package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfrh implements Runnable {
    zzfrh() {
    }

    public final void run() {
        if (zzfrk.zzc != null) {
            zzfrk.zzc.post(zzfrk.zzd);
            zzfrk.zzc.postDelayed(zzfrk.zze, 200);
        }
    }
}
