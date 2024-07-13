package com.google.android.gms.internal.ads;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbrx implements BaseGmsClient.BaseOnConnectionFailedListener {
    final /* synthetic */ zzcig zza;

    zzbrx(zzbry zzbry, zzcig zzcig) {
        this.zza = zzcig;
    }

    public final void onConnectionFailed(ConnectionResult connectionResult) {
        this.zza.zze(new RuntimeException("Connection failed."));
    }
}
