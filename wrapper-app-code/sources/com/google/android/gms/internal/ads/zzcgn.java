package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.identifier.AdvertisingIdClient;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcgn implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzcig zzb;

    zzcgn(zzcgo zzcgo, Context context, zzcig zzcig) {
        this.zza = context;
        this.zzb = zzcig;
    }

    public final void run() {
        try {
            this.zzb.zzd(AdvertisingIdClient.getAdvertisingIdInfo(this.zza));
        } catch (GooglePlayServicesNotAvailableException | GooglePlayServicesRepairableException | IOException | IllegalStateException e2) {
            this.zzb.zze(e2);
            zzcho.zzh("Exception while getting advertising Id info", e2);
        }
    }
}
