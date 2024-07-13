package com.google.android.gms.internal.ads;

import android.os.ParcelFileDescriptor;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.util.zzaz;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzehv implements zzgen {
    final /* synthetic */ zzcbu zza;

    zzehv(zzehw zzehw, zzcbu zzcbu) {
        this.zza = zzcbu;
    }

    public final void zza(Throwable th) {
        try {
            this.zza.zze(zzaz.zzb(th));
        } catch (RemoteException e2) {
            zze.zzb("Ad service can't call client", e2);
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        try {
            this.zza.zzf((ParcelFileDescriptor) obj);
        } catch (RemoteException e2) {
            zze.zzb("Ad service can't call client", e2);
        }
    }
}
