package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdaz implements zzgen {
    final /* synthetic */ zzgen zza;
    final /* synthetic */ zzdbb zzb;

    zzdaz(zzdbb zzdbb, zzgen zzgen) {
        this.zzb = zzdbb;
        this.zza = zzgen;
    }

    public final void zza(Throwable th) {
        this.zza.zza(th);
        zzcib.zze.execute(new zzday(this.zzb));
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdbb.zzb(this.zzb, ((zzdau) obj).zza, this.zza);
    }
}
