package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdq;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzeme implements zzdal {
    public final /* synthetic */ zzekt zza;

    public /* synthetic */ zzeme(zzekt zzekt) {
        this.zza = zzekt;
    }

    public final zzdq zza() {
        try {
            return ((zzbxq) this.zza.zzb).zze();
        } catch (RemoteException e2) {
            throw new zzfjl(e2);
        }
    }
}
