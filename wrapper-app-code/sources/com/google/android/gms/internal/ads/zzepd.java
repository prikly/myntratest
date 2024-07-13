package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzepd implements zzfxt {
    public final /* synthetic */ zzeph zza;
    public final /* synthetic */ zzcno zzb;
    public final /* synthetic */ zzfil zzc;
    public final /* synthetic */ zzdvu zzd;

    public /* synthetic */ zzepd(zzeph zzeph, zzcno zzcno, zzfil zzfil, zzdvu zzdvu) {
        this.zza = zzeph;
        this.zzb = zzcno;
        this.zzc = zzfil;
        this.zzd = zzdvu;
    }

    public final Object apply(Object obj) {
        zzcno zzcno = this.zzb;
        zzfil zzfil = this.zzc;
        zzdvu zzdvu = this.zzd;
        if (zzfil.zzN) {
            zzcno.zzag();
        }
        zzcno.zzaa();
        zzcno.onPause();
        return zzdvu.zzk();
    }
}
