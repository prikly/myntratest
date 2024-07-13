package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzdba implements zzgen {
    final /* synthetic */ zzgen zza;
    final /* synthetic */ zzdbb zzb;

    zzdba(zzdbb zzdbb, zzgen zzgen) {
        this.zzb = zzdbb;
        this.zza = zzgen;
    }

    public final void zza(Throwable th) {
        zzcib.zze.execute(new zzday(this.zzb));
        this.zza.zza(th);
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcib.zze.execute(new zzday(this.zzb));
        this.zza.zzb((zzdan) obj);
    }
}
