package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzod implements Runnable {
    public final /* synthetic */ AudioTrack zza;
    public final /* synthetic */ zzdg zzb;

    public /* synthetic */ zzod(AudioTrack audioTrack, zzdg zzdg) {
        this.zza = audioTrack;
        this.zzb = zzdg;
    }

    public final void run() {
        zzos.zzC(this.zza, this.zzb);
    }
}
