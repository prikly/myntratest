package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffp implements zzfga {
    private zzddw zza;

    /* renamed from: zza */
    public final synchronized zzddw zzd() {
        return this.zza;
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzfgb zzfgb, zzffz zzffz, Object obj) {
        return zzb(zzfgb, zzffz, (zzddw) null);
    }

    public final synchronized zzgfb zzb(zzfgb zzfgb, zzffz zzffz, zzddw zzddw) {
        zzdbu zzb;
        if (zzddw != null) {
            this.zza = zzddw;
        } else {
            this.zza = (zzddw) zzffz.zza(zzfgb.zzb).zzh();
        }
        zzb = this.zza.zzb();
        return zzb.zzi(zzb.zzj());
    }
}
