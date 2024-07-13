package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdvq implements zzbqs {
    private final zzdfu zza;
    private final zzcdd zzb;
    private final String zzc;
    private final String zzd;

    public zzdvq(zzdfu zzdfu, zzfil zzfil) {
        this.zza = zzdfu;
        this.zzb = zzfil.zzm;
        this.zzc = zzfil.zzk;
        this.zzd = zzfil.zzl;
    }

    public final void zza(zzcdd zzcdd) {
        int i;
        String str;
        zzcdd zzcdd2 = this.zzb;
        if (zzcdd2 != null) {
            zzcdd = zzcdd2;
        }
        if (zzcdd != null) {
            str = zzcdd.zza;
            i = zzcdd.zzb;
        } else {
            i = 1;
            str = "";
        }
        this.zza.zzd(new zzcco(str, i), this.zzc, this.zzd);
    }

    public final void zzb() {
        this.zza.zze();
    }

    public final void zzc() {
        this.zza.zzf();
    }
}
