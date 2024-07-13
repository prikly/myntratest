package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzemx implements zzfxt {
    public final /* synthetic */ zzemz zza;
    public final /* synthetic */ zzcno zzb;
    public final /* synthetic */ zzfil zzc;
    public final /* synthetic */ zzdmw zzd;

    public /* synthetic */ zzemx(zzemz zzemz, zzcno zzcno, zzfil zzfil, zzdmw zzdmw) {
        this.zza = zzemz;
        this.zzb = zzcno;
        this.zzc = zzfil;
        this.zzd = zzdmw;
    }

    public final Object apply(Object obj) {
        zzcno zzcno = this.zzb;
        zzfil zzfil = this.zzc;
        zzdmw zzdmw = this.zzd;
        if (zzfil.zzN) {
            zzcno.zzag();
        }
        zzcno.zzaa();
        zzcno.onPause();
        return zzdmw.zzg();
    }
}
