package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzekz implements zzfxt {
    public final /* synthetic */ zzelc zza;
    public final /* synthetic */ zzcno zzb;
    public final /* synthetic */ zzfil zzc;
    public final /* synthetic */ zzcxv zzd;

    public /* synthetic */ zzekz(zzelc zzelc, zzcno zzcno, zzfil zzfil, zzcxv zzcxv) {
        this.zza = zzelc;
        this.zzb = zzcno;
        this.zzc = zzfil;
        this.zzd = zzcxv;
    }

    public final Object apply(Object obj) {
        zzcno zzcno = this.zzb;
        zzfil zzfil = this.zzc;
        zzcxv zzcxv = this.zzd;
        if (zzfil.zzN) {
            zzcno.zzag();
        }
        zzcno.zzaa();
        zzcno.onPause();
        return zzcxv.zza();
    }
}
