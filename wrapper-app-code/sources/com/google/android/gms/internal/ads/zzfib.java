package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfib implements zzesq {
    final /* synthetic */ zzfic zza;

    zzfib(zzfic zzfic) {
        this.zza = zzfic;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdvt zzdvt = (zzdvt) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdvt;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzda)).booleanValue()) {
                zzdvt.zzd().zza = this.zza.zzd;
            }
            this.zza.zzg.zzab();
        }
    }
}
