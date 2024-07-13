package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfdn implements Runnable {
    public final /* synthetic */ zzfdo zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfdn(zzfdo zzfdo, zze zze) {
        this.zza = zzfdo;
        this.zzb = zze;
    }

    public final void run() {
        zzfdo zzfdo = this.zza;
        zzfdo.zze.zzd.zza(this.zzb);
    }
}
