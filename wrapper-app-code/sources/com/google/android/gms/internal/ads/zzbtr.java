package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzca;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzbtr implements zzbqd {
    final /* synthetic */ zzbta zza;
    final /* synthetic */ zzca zzb;
    final /* synthetic */ zzbuf zzc;

    zzbtr(zzbuf zzbuf, zzapj zzapj, zzbta zzbta, zzca zzca) {
        this.zzc = zzbuf;
        this.zza = zzbta;
        this.zzb = zzca;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [com.google.android.gms.internal.ads.zzbqd, java.lang.Object] */
    public final /* bridge */ /* synthetic */ void zza(Object obj, Map map) {
        zzbug zzbug = (zzbug) obj;
        synchronized (this.zzc.zza) {
            zze.zzi("JS Engine is requesting an update");
            if (this.zzc.zzi == 0) {
                zze.zzi("Starting reload.");
                this.zzc.zzi = 2;
                this.zzc.zzd((zzapj) null);
            }
            this.zza.zzr("/requestReload", this.zzb.zza());
        }
    }
}
