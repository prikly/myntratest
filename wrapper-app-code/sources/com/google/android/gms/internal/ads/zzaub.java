package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaub extends Thread {
    final /* synthetic */ AudioTrack zza;
    final /* synthetic */ zzaul zzb;

    zzaub(zzaul zzaul, AudioTrack audioTrack) {
        this.zzb = zzaul;
        this.zza = audioTrack;
    }

    public final void run() {
        try {
            this.zza.flush();
            this.zza.release();
        } finally {
            this.zzb.zze.open();
        }
    }
}
