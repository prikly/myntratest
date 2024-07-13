package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfgl implements Runnable {
    public final /* synthetic */ zzfgn zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfgl(zzfgn zzfgn, zze zze) {
        this.zza = zzfgn;
        this.zzb = zze;
    }

    public final void run() {
        zzfgn zzfgn = this.zza;
        zzfgn.zze.zzd.zza(this.zzb);
    }
}
