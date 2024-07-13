package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzjb implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzaw zzc;
    final /* synthetic */ String zzd;
    final /* synthetic */ zzjm zze;

    zzjb(zzjm zzjm, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.zze = zzjm;
        this.zza = zzq;
        this.zzb = z2;
        this.zzc = zzaw;
        this.zzd = str;
    }

    public final void run() {
        zzaw zzaw;
        zzjm zzjm = this.zze;
        zzdx zzh = zzjm.zzb;
        if (zzh == null) {
            zzjm.zzt.zzay().zzd().zza("Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjm zzjm2 = this.zze;
        if (this.zzb) {
            zzaw = null;
        } else {
            zzaw = this.zzc;
        }
        zzjm2.zzD(zzh, zzaw, this.zza);
        this.zze.zzQ();
    }
}
