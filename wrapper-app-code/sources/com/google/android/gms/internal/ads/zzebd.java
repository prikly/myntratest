package com.google.android.gms.internal.ads;

import android.os.RemoteException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzebd implements Runnable {
    public final /* synthetic */ zzebj zza;
    public final /* synthetic */ zzbsg zzb;

    public /* synthetic */ zzebd(zzebj zzebj, zzbsg zzbsg) {
        this.zza = zzebj;
        this.zzb = zzbsg;
    }

    public final void run() {
        zzebj zzebj = this.zza;
        try {
            this.zzb.zzb(zzebj.zzg());
        } catch (RemoteException e2) {
            zzcho.zzh("", e2);
        }
    }
}
