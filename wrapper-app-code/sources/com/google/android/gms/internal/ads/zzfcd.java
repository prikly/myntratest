package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.internal.client.zzba;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfcd implements zzezm {
    final ScheduledExecutorService zza;
    final Context zzb;
    final zzbzu zzc;

    public zzfcd(zzbzu zzbzu, ScheduledExecutorService scheduledExecutorService, Context context, byte[] bArr) {
        this.zzc = zzbzu;
        this.zza = scheduledExecutorService;
        this.zzb = context;
    }

    public final int zza() {
        return 49;
    }

    public final zzgfb zzb() {
        return zzger.zzm(zzger.zzo(zzger.zzi(new Bundle()), ((Long) zzba.zzc().zzb(zzbjj.zzdC)).longValue(), TimeUnit.MILLISECONDS, this.zza), zzfcc.zza, zzcib.zza);
    }
}
