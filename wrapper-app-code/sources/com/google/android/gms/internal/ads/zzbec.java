package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbec implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzbee zza;

    zzbec(zzbee zzbee) {
        this.zza = zzbee;
    }

    public final void onConnected(Bundle bundle) {
        synchronized (this.zza.zzc) {
            try {
                zzbee zzbee = this.zza;
                if (zzbee.zzd != null) {
                    zzbee.zzf = zzbee.zzd.zzq();
                }
            } catch (DeadObjectException e2) {
                zze.zzh("Unable to obtain a cache service instance.", e2);
                zzbee.zzh(this.zza);
            }
            this.zza.zzc.notifyAll();
        }
    }

    public final void onConnectionSuspended(int i) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            this.zza.zzc.notifyAll();
        }
    }
}
