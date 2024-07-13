package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffq implements zzfga {
    private final zzfga zza;
    private zzddw zzb;

    public zzffq(zzfga zzfga) {
        this.zza = zzfga;
    }

    /* renamed from: zza */
    public final synchronized zzddw zzd() {
        return this.zzb;
    }

    public final synchronized zzgfb zzb(zzfgb zzfgb, zzffz zzffz, zzddw zzddw) {
        this.zzb = zzddw;
        if (zzfgb.zza != null) {
            zzdbu zzb2 = this.zzb.zzb();
            return zzb2.zzi(zzb2.zzk(zzger.zzi(zzfgb.zza)));
        }
        return ((zzffp) this.zza).zzb(zzfgb, zzffz, zzddw);
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzfgb zzfgb, zzffz zzffz, Object obj) {
        return zzb(zzfgb, zzffz, (zzddw) null);
    }
}
