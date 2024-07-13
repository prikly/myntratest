package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdac implements zzbbx, zzdgb {
    private final zzfil zza;
    private final zzdff zzb;
    private final zzdgk zzc;
    private final AtomicBoolean zzd = new AtomicBoolean();
    private final AtomicBoolean zze = new AtomicBoolean();

    public zzdac(zzfil zzfil, zzdff zzdff, zzdgk zzdgk) {
        this.zza = zzfil;
        this.zzb = zzdff;
        this.zzc = zzdgk;
    }

    private final void zza() {
        if (this.zzd.compareAndSet(false, true)) {
            this.zzb.zza();
        }
    }

    public final void zzc(zzbbw zzbbw) {
        if (this.zza.zzf == 1 && zzbbw.zzj) {
            zza();
        }
        if (zzbbw.zzj && this.zze.compareAndSet(false, true)) {
            this.zzc.zza();
        }
    }

    public final synchronized void zzn() {
        if (this.zza.zzf != 1) {
            zza();
        }
    }
}
