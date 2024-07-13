package com.google.android.gms.measurement.internal;

import android.os.Bundle;
import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zziv implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ Bundle zzb;
    final /* synthetic */ zzjm zzc;

    zziv(zzjm zzjm, zzq zzq, Bundle bundle) {
        this.zzc = zzjm;
        this.zza = zzq;
        this.zzb = bundle;
    }

    public final void run() {
        zzjm zzjm = this.zzc;
        zzdx zzh = zzjm.zzb;
        if (zzh == null) {
            zzjm.zzt.zzay().zzd().zza("Failed to send default event parameters to service");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzr(this.zzb, this.zza);
        } catch (RemoteException e2) {
            this.zzc.zzt.zzay().zzd().zzb("Failed to send default event parameters to service", e2);
        }
    }
}
