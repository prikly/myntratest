package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfhu implements Runnable {
    public final /* synthetic */ zzfhv zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfhu(zzfhv zzfhv, zze zze) {
        this.zza = zzfhv;
        this.zzb = zze;
    }

    public final void run() {
        zzfhv zzfhv = this.zza;
        zzfhv.zze.zzd.zza(this.zzb);
    }
}
