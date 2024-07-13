package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzenv extends zzbxj {
    final /* synthetic */ zzenw zza;
    private final zzekt zzb;

    /* synthetic */ zzenv(zzenw zzenw, zzekt zzekt, zzenu zzenu) {
        this.zza = zzenw;
        this.zzb = zzekt;
    }

    public final void zze(String str) throws RemoteException {
        ((zzems) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzems) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(zzbwi zzbwi) throws RemoteException {
        this.zza.zzc = zzbwi;
        ((zzems) this.zzb.zzc).zzo();
    }
}
