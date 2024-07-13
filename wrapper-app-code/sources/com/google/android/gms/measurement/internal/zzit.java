package com.google.android.gms.measurement.internal;

import android.os.RemoteException;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.safeparcel.AbstractSafeParcelable;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzit implements Runnable {
    final /* synthetic */ zzq zza;
    final /* synthetic */ zzjm zzb;

    zzit(zzjm zzjm, zzq zzq) {
        this.zzb = zzjm;
        this.zza = zzq;
    }

    public final void run() {
        zzjm zzjm = this.zzb;
        zzdx zzh = zzjm.zzb;
        if (zzh == null) {
            zzjm.zzt.zzay().zzd().zza("Discarding data. Failed to send app launch");
            return;
        }
        try {
            Preconditions.checkNotNull(this.zza);
            zzh.zzj(this.zza);
            this.zzb.zzt.zzi().zzm();
            this.zzb.zzD(zzh, (AbstractSafeParcelable) null, this.zza);
            this.zzb.zzQ();
        } catch (RemoteException e2) {
            this.zzb.zzt.zzay().zzd().zzb("Failed to send app launch to the service", e2);
        }
    }
}
