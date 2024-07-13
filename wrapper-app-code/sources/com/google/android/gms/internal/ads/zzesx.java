package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzesx implements zzgen {
    final /* synthetic */ zzesq zza;
    final /* synthetic */ zzfow zzb;
    final /* synthetic */ zzfol zzc;
    final /* synthetic */ zzdos zzd;
    final /* synthetic */ zzesy zze;

    zzesx(zzesy zzesy, zzesq zzesq, zzfow zzfow, zzfol zzfol, zzdos zzdos) {
        this.zze = zzesy;
        this.zza = zzesq;
        this.zzb = zzfow;
        this.zzc = zzfol;
        this.zzd = zzdos;
    }

    public final void zza(Throwable th) {
        zzfow zzfow;
        zze zza2 = this.zzd.zza().zza(th);
        this.zzd.zzb().zza(zza2);
        this.zze.zzb.zzB().execute(new zzesw(this, zza2));
        zzfka.zzb(zza2.zza, th, "NativeAdLoader.onFailure");
        this.zza.zza();
        if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
            zzfoy zze2 = this.zze.zze;
            zzfol zzfol = this.zzc;
            zzfol.zza(zza2);
            zzfol.zzg(th);
            zzfol.zzf(false);
            zze2.zzb(zzfol.zzl());
            return;
        }
        zzfow.zzc(zza2);
        zzfol zzfol2 = this.zzc;
        zzfol2.zzg(th);
        zzfol2.zzf(false);
        zzfow.zza(zzfol2);
        zzfow.zzg();
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzfow zzfow;
        zzdan zzdan = (zzdan) obj;
        synchronized (this.zze) {
            zzdan.zzn().zza(this.zze.zzd.zzd());
            this.zza.zzb(zzdan);
            this.zze.zzb.zzB().execute(new zzesv(this));
            if (!((Boolean) zzbks.zzc.zze()).booleanValue() || (zzfow = this.zzb) == null) {
                zzfoy zze2 = this.zze.zze;
                zzfol zzfol = this.zzc;
                zzfol.zzb(zzdan.zzp().zzb);
                zzfol.zzd(zzdan.zzl().zzg());
                zzfol.zzf(true);
                zze2.zzb(zzfol.zzl());
            } else {
                zzfow.zzf(zzdan.zzp().zzb);
                zzfow.zze(zzdan.zzl().zzg());
                zzfol zzfol2 = this.zzc;
                zzfol2.zzf(true);
                zzfow.zza(zzfol2);
                zzfow.zzg();
            }
        }
    }
}
