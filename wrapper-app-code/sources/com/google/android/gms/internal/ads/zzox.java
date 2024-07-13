package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzox implements zznt {
    final /* synthetic */ zzoy zza;

    /* synthetic */ zzox(zzoy zzoy, zzow zzow) {
        this.zza = zzoy;
    }

    public final void zza(Exception exc) {
        zzdw.zzc("MediaCodecAudioRenderer", "Audio sink error", exc);
        this.zza.zzc.zzb(exc);
    }

    public final void zzb() {
        zzoy zzoy = this.zza;
        if (zzoy.zzl != null) {
            zzoy.zzl.zzb();
        }
    }
}
