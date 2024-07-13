package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdbc {
    private final zzfix zza;
    private final zzfil zzb;
    private final String zzc;

    public zzdbc(zzfix zzfix, zzfil zzfil, String str) {
        this.zza = zzfix;
        this.zzb = zzfil;
        this.zzc = str == null ? "com.google.ads.mediation.admob.AdMobAdapter" : str;
    }

    public final zzfil zza() {
        return this.zzb;
    }

    public final zzfio zzb() {
        return this.zza.zzb.zzb;
    }

    public final zzfix zzc() {
        return this.zza;
    }

    public final String zzd() {
        return this.zzc;
    }
}
