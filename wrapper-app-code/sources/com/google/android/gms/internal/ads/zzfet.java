package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zze;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzfet implements Runnable {
    public final /* synthetic */ zzfeu zza;
    public final /* synthetic */ zze zzb;

    public /* synthetic */ zzfet(zzfeu zzfeu, zze zze) {
        this.zza = zzfeu;
        this.zzb = zze;
    }

    public final void run() {
        zzfeu zzfeu = this.zza;
        zzfeu.zze.zzd.zza(this.zzb);
    }
}
