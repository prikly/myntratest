package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzq;
import com.google.android.gms.ads.internal.zza;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdwp {
    private final zzcoa zza;
    private final Context zzb;
    private final zzapj zzc;
    private final zzbki zzd;
    private final zzchu zze;
    private final zza zzf;
    private final zzbew zzg;
    /* access modifiers changed from: private */
    public final zzdhc zzh;

    public zzdwp(zzcoa zzcoa, Context context, zzapj zzapj, zzbki zzbki, zzchu zzchu, zza zza2, zzbew zzbew, zzdhc zzdhc) {
        this.zza = zzcoa;
        this.zzb = context;
        this.zzc = zzapj;
        this.zzd = zzbki;
        this.zze = zzchu;
        this.zzf = zza2;
        this.zzg = zzbew;
        this.zzh = zzdhc;
    }

    public final zzcno zza(zzq zzq, zzfil zzfil, zzfio zzfio) throws zzcnz {
        return zzcoa.zza(this.zzb, zzcpd.zzc(zzq), zzq.zza, false, false, this.zzc, this.zzd, this.zze, (zzbjy) null, new zzdwe(this), this.zzf, this.zzg, zzfil, zzfio);
    }
}
