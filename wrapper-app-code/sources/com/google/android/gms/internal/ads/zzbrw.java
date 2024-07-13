package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.internal.BaseGmsClient;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbrw implements BaseGmsClient.BaseConnectionCallbacks {
    final /* synthetic */ zzcig zza;
    final /* synthetic */ zzbry zzb;

    zzbrw(zzbry zzbry, zzcig zzcig) {
        this.zzb = zzbry;
        this.zza = zzcig;
    }

    public final void onConnected(Bundle bundle) {
        try {
            this.zza.zzd(this.zzb.zza.zzp());
        } catch (DeadObjectException e2) {
            this.zza.zze(e2);
        }
    }

    public final void onConnectionSuspended(int i) {
        zzcig zzcig = this.zza;
        zzcig.zze(new RuntimeException("onConnectionSuspended: " + i));
    }
}
