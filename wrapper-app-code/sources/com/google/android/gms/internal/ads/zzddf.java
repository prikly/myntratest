package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzddf implements zzdhi {
    private final Context zza;
    private final zzfjg zzb;
    private final zzchu zzc;
    private final zzg zzd;
    private final zzebj zze;
    private final zzfoy zzf;

    public zzddf(Context context, zzfjg zzfjg, zzchu zzchu, zzg zzg, zzebj zzebj, zzfoy zzfoy) {
        this.zza = context;
        this.zzb = zzfjg;
        this.zzc = zzchu;
        this.zzd = zzg;
        this.zze = zzebj;
        this.zzf = zzfoy;
    }

    public final void zzb(zzfix zzfix) {
    }

    public final void zzbG(zzccb zzccb) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzdv)).booleanValue()) {
            zzt.zza().zzc(this.zza, this.zzc, this.zzb.zzf, this.zzd.zzh(), this.zzf);
        }
        this.zze.zzr();
    }
}
