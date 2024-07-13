package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzesn implements zzdeq {
    public final /* synthetic */ zzesb zza;
    public final /* synthetic */ zzbsu zzb;

    public /* synthetic */ zzesn(zzesb zzesb, zzbsu zzbsu) {
        this.zza = zzesb;
        this.zzb = zzbsu;
    }

    public final void zza(zze zze) {
        zzesb zzesb = this.zza;
        zzbsu zzbsu = this.zzb;
        zzesb.zza(zze);
        if (zzbsu != null) {
            try {
                zzbsu.zzf(zze);
            } catch (RemoteException e2) {
                zzcho.zzl("#007 Could not call remote method.", e2);
            }
        }
        if (zzbsu != null) {
            try {
                zzbsu.zze(zze.zza);
            } catch (RemoteException e3) {
                zzcho.zzl("#007 Could not call remote method.", e3);
            }
        }
    }
}
