package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzber implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcig zza;
    final /* synthetic */ zzbes zzb;

    zzber(zzbes zzbes, zzcig zzcig) {
        this.zzb = zzbes;
        this.zza = zzcig;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        synchronized (this.zzb.zzd) {
            this.zza.zze(new RuntimeException("Connection failed."));
        }
    }
}
