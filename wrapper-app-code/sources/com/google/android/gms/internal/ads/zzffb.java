package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzffb implements zzfga {
    private zzddw zza;
    private final Executor zzb = zzgfi.zzb();

    public final zzddw zza() {
        return this.zza;
    }

    public final zzgfb zzb(zzfgb zzfgb, zzffz zzffz, zzddw zzddw) {
        zzddv zza2 = zzffz.zza(zzfgb.zzb);
        zza2.zzb(new zzfgg(true));
        zzddw zzddw2 = (zzddw) zza2.zzh();
        this.zza = zzddw2;
        zzdbu zzb2 = zzddw2.zzb();
        zzflb zzflb = new zzflb();
        return zzger.zzm(zzger.zzn(zzgei.zzv(zzb2.zzj()), new zzfez(this, zzflb, zzb2), this.zzb), new zzffa(zzflb), this.zzb);
    }

    public final /* bridge */ /* synthetic */ zzgfb zzc(zzfgb zzfgb, zzffz zzffz, Object obj) {
        return zzb(zzfgb, zzffz, (zzddw) null);
    }

    public final /* synthetic */ Object zzd() {
        return this.zza;
    }
}
