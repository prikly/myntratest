package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbuc implements Runnable {
    public final /* synthetic */ zzbud zza;
    public final /* synthetic */ zzbta zzb;

    public /* synthetic */ zzbuc(zzbud zzbud, zzbta zzbta) {
        this.zza = zzbud;
        this.zzb = zzbta;
    }

    public final void run() {
        zzbta zzbta = this.zzb;
        zzbta.zzr("/result", zzbqc.zzo);
        zzbta.zzc();
    }
}
