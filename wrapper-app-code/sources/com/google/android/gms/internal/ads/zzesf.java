package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zza;
import com.google.android.gms.ads.internal.client.zzbe;
import com.google.android.gms.ads.internal.util.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzesf implements zza, zzdmc {
    private zzbe zza;

    public final synchronized void onAdClicked() {
        zzbe zzbe = this.zza;
        if (zzbe != null) {
            try {
                zzbe.zzb();
            } catch (RemoteException e2) {
                zze.zzk("Remote Exception at onAdClicked.", e2);
            }
        }
    }

    public final synchronized void zza(zzbe zzbe) {
        this.zza = zzbe;
    }

    public final synchronized void zzq() {
        zzbe zzbe = this.zza;
        if (zzbe != null) {
            try {
                zzbe.zzb();
            } catch (RemoteException e2) {
                zze.zzk("Remote Exception at onPhysicalClick.", e2);
            }
        }
    }

    public final synchronized void zzr() {
    }
}
