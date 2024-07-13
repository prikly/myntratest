package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzdtb implements zzcoz {
    public final /* synthetic */ zzcif zza;

    public /* synthetic */ zzdtb(zzcif zzcif) {
        this.zza = zzcif;
    }

    public final void zza(boolean z) {
        zzcif zzcif = this.zza;
        if (z) {
            zzcif.zzb();
        } else {
            zzcif.zze(new zzeom(1, "Image Web View failed to load."));
        }
    }
}
