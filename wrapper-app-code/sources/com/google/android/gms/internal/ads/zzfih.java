package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzby;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfih extends zzfrt {
    final /* synthetic */ zzby zza;
    final /* synthetic */ zzfii zzb;

    zzfih(zzfii zzfii, zzby zzby) {
        this.zzb = zzfii;
        this.zza = zzby;
    }

    public final void zzv() {
        if (this.zzb.zzd != null) {
            try {
                this.zza.zze();
            } catch (RemoteException e2) {
                zze.zzl("#007 Could not call remote method.", e2);
            }
        }
    }
}
