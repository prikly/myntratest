package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfig implements zzesq {
    final /* synthetic */ zzfii zza;

    zzfig(zzfii zzfii) {
        this.zza = zzfii;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdvt zzdvt = (zzdvt) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdvt;
            if (((Boolean) zzba.zzc().zzb(zzbjj.zzda)).booleanValue()) {
                zzdvt.zzd().zza = this.zza.zzc;
            }
            this.zza.zzd.zzab();
        }
    }
}
