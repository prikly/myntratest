package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbtn implements Runnable {
    public final /* synthetic */ zzbuf zza;
    public final /* synthetic */ zzbue zzb;
    public final /* synthetic */ zzbta zzc;

    public /* synthetic */ zzbtn(zzbuf zzbuf, zzbue zzbue, zzbta zzbta) {
        this.zza = zzbuf;
        this.zzb = zzbue;
        this.zzc = zzbta;
    }

    public final void run() {
        this.zza.zzi(this.zzb, this.zzc);
    }
}
