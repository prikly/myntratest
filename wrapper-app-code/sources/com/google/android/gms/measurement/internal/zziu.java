package com.google.android.gms.measurement.internal;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziu implements Runnable {
    final /* synthetic */ zzie zza;
    final /* synthetic */ zzjm zzb;

    zziu(zzjm zzjm, zzie zzie) {
        this.zzb = zzjm;
        this.zza = zzie;
    }

    public final void run() {
        zzjm zzjm = this.zzb;
        zzdx zzh = zzjm.zzb;
        if (zzh == null) {
            zzjm.zzt.zzay().zzd().zza("Failed to send current screen to service");
            return;
        }
        try {
            zzie zzie = this.zza;
            if (zzie == null) {
                zzh.zzq(0, (String) null, (String) null, zzjm.zzt.zzau().getPackageName());
            } else {
                zzh.zzq(zzie.zzc, zzie.zza, zzie.zzb, zzjm.zzt.zzau().getPackageName());
            }
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send current screen to the service", e2);
        }
    }
}
