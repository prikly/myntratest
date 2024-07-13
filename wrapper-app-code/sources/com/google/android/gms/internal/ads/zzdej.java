package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdej implements zzhep {
    private final zzdei zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;

    public zzdej(zzdei zzdei, zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4) {
        this.zza = zzdei;
        this.zzb = zzhfc;
        this.zzc = zzhfc2;
        this.zzd = zzhfc3;
        this.zze = zzhfc4;
    }

    public final /* synthetic */ Object zzb() {
        Context context = (Context) this.zzb.zzb();
        zzchu zza2 = ((zzcqa) this.zzc).zza();
        zzfil zza3 = ((zzdbd) this.zzd).zza();
        zzcel zzcel = new zzcel();
        if (zza3.zzB != null) {
            return new zzcek(context, zza2, zza3.zzB, zza3.zzt.zzb, zzcel, (byte[]) null);
        }
        return null;
    }
}
