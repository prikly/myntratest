package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzio implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ boolean zzb;
    final /* synthetic */ zzkw zzc;
    final /* synthetic */ zzjm zzd;

    zzio(zzjm zzjm, zzq zzq, boolean z, zzkw zzkw) {
        this.zzd = zzjm;
        this.zza = zzq;
        this.zzb = z;
        this.zzc = zzkw;
    }

    public final void run() {
        zzkw zzkw;
        zzjm zzjm = this.zzd;
        zzdx zzh = zzjm.zzb;
        if (zzh == null) {
            zzjm.zzt.zzay().zzd().zza("Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjm zzjm2 = this.zzd;
        if (this.zzb) {
            zzkw = null;
        } else {
            zzkw = this.zzc;
        }
        zzjm2.zzD(zzh, zzkw, this.zza);
        this.zzd.zzQ();
    }
}
