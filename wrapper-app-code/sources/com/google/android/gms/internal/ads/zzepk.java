package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzepk implements Runnable {
    public final /* synthetic */ zzepl zza;
    public final /* synthetic */ zzfix zzb;
    public final /* synthetic */ zzfil zzc;
    public final /* synthetic */ zzekt zzd;

    public /* synthetic */ zzepk(zzepl zzepl, zzfix zzfix, zzfil zzfil, zzekt zzekt) {
        this.zza = zzepl;
        this.zzb = zzfix;
        this.zzc = zzfil;
        this.zzd = zzekt;
    }

    public final void run() {
        zzepl zzepl = this.zza;
        zzepn.zze(this.zzb, this.zzc, this.zzd);
    }
}
