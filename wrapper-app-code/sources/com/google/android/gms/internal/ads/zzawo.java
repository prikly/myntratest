package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawo {
    public final zzawx zza = new zzawx();
    public final zzavp zzb;
    public zzawv zzc;
    public zzawl zzd;
    public int zze;
    public int zzf;
    public int zzg;
    public zzavo zzh;
    public zzaww zzi;

    public zzawo(zzavp zzavp) {
        this.zzb = zzavp;
    }

    public final void zzb() {
        zzawx zzawx = this.zza;
        zzawx.zzd = 0;
        zzawx.zzr = 0;
        zzawx.zzl = false;
        zzawx.zzq = false;
        zzawx.zzn = null;
        this.zze = 0;
        this.zzg = 0;
        this.zzf = 0;
        this.zzh = null;
        this.zzi = null;
    }

    public final void zza(zzawv zzawv, zzawl zzawl) {
        if (zzawv != null) {
            this.zzc = zzawv;
            if (zzawl != null) {
                this.zzd = zzawl;
                this.zzb.zza(zzawv.zzf);
                zzb();
                return;
            }
            throw null;
        }
        throw null;
    }
}
