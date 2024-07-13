package com.google.android.gms.internal.ads;

import androidx.collection.ArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdsd implements zzdfh {
    private final zzdqg zza;
    private final zzdql zzb;

    public zzdsd(zzdqg zzdqg, zzdql zzdql) {
        this.zza = zzdqg;
        this.zzb = zzdql;
    }

    public final void zzl() {
        zzdqg zzdqg = this.zza;
        if (zzdqg.zzu() != null) {
            zzcno zzq = zzdqg.zzq();
            zzcno zzr = zzdqg.zzr();
            if (zzq == null) {
                zzq = zzr == null ? null : zzr;
            }
            if (this.zzb.zzd() && zzq != null) {
                zzq.zzd("onSdkImpression", new ArrayMap());
            }
        }
    }
}
