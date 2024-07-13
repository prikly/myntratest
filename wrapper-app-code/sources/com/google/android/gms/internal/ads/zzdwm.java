package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdwm implements zzcoz {
    public final /* synthetic */ zzcig zza;

    public /* synthetic */ zzdwm(zzcig zzcig) {
        this.zza = zzcig;
    }

    public final void zza(boolean z) {
        zzcig zzcig = this.zza;
        if (z) {
            zzcig.zzd((Object) null);
        } else {
            zzcig.zze(new Exception("Ad Web View failed to load."));
        }
    }
}
