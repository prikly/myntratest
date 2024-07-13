package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbed implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzbee zza;

    zzbed(zzbee zzbee) {
        this.zza = zzbee;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zza.zzc) {
            this.zza.zzf = null;
            zzbee zzbee = this.zza;
            if (zzbee.zzd != null) {
                zzbee.zzd = null;
            }
            this.zza.zzc.notifyAll();
        }
    }
}
