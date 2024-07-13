package com.google.android.gms.internal.ads;

import android.media.AudioTrack;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzop extends AudioTrack.StreamEventCallback {
    final /* synthetic */ zzos zza;
    final /* synthetic */ zzoq zzb;

    zzop(zzoq zzoq, zzos zzos) {
        this.zzb = zzoq;
        this.zza = zzos;
    }

    public final void onDataRequest(AudioTrack audioTrack, int i) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzos zzos = this.zzb.zza;
            if (zzos.zzq != null && zzos.zzR) {
                zzos.zzq.zzb();
            }
        }
    }

    public final void onTearDown(AudioTrack audioTrack) {
        if (audioTrack.equals(this.zzb.zza.zzt)) {
            zzos zzos = this.zzb.zza;
            if (zzos.zzq != null && zzos.zzR) {
                zzos.zzq.zzb();
            }
        }
    }
}
