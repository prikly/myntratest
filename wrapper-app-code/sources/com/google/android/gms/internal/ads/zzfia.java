package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdd;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfia extends zzfrt {
    final /* synthetic */ zzdd zza;
    final /* synthetic */ zzfic zzb;

    zzfia(zzfic zzfic, zzdd zzdd) {
        this.zzb = zzfic;
        this.zza = zzdd;
    }

    public final void zzv() {
        if (this.zzb.zzg != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                zze.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
