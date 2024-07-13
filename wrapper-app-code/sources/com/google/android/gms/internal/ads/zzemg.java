package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import android.view.View;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.dynamic.IObjectWrapper;
import com.google.android.gms.dynamic.ObjectWrapper;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzemg extends zzbxd {
    final /* synthetic */ zzemh zza;
    private final zzekt zzb;

    /* synthetic */ zzemg(zzemh zzemh, zzekt zzekt, zzemf zzemf) {
        this.zza = zzemh;
        this.zzb = zzekt;
    }

    public final void zze(String str) throws RemoteException {
        ((zzems) this.zzb.zzc).zzi(0, str);
    }

    public final void zzf(zze zze) throws RemoteException {
        ((zzems) this.zzb.zzc).zzh(zze);
    }

    public final void zzg(IObjectWrapper iObjectWrapper) throws RemoteException {
        this.zza.zzc = (View) ObjectWrapper.unwrap(iObjectWrapper);
        ((zzems) this.zzb.zzc).zzo();
    }

    public final void zzh(zzbwc zzbwc) throws RemoteException {
        this.zza.zzd = zzbwc;
        ((zzems) this.zzb.zzc).zzo();
    }
}
