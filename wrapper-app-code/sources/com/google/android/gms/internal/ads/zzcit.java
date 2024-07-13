package com.google.android.gms.internal.ads;

import android.media.MediaPlayer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcit implements Runnable {
    final /* synthetic */ MediaPlayer zza;
    final /* synthetic */ zzcjb zzb;

    zzcit(zzcjb zzcjb, MediaPlayer mediaPlayer) {
        this.zzb = zzcjb;
        this.zza = mediaPlayer;
    }

    public final void run() {
        zzcjb.zzl(this.zzb, this.zza);
        zzcjb zzcjb = this.zzb;
        if (zzcjb.zzr != null) {
            zzcjb.zzr.zzf();
        }
    }
}
