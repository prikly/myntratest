package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdxl implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;
    private final zzhfc zzd;
    private final zzhfc zze;

    public zzdxl(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3, zzhfc zzhfc4, zzhfc zzhfc5) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
        this.zzd = zzhfc4;
        this.zze = zzhfc5;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        Context zza2 = ((zzcpp) this.zza).zza();
        String zza3 = ((zzedw) this.zzb).zzb();
        zzchu zza4 = ((zzcqa) this.zzc).zza();
        zzbfg zzbfg = (zzbfg) this.zzd.zzb();
        String str = (String) this.zze.zzb();
        zzbew zzbew = new zzbew(new zzbfc(zza2));
        zzbhv zza5 = zzbhw.zza();
        zza5.zza(zza4.zzb);
        zza5.zzc(zza4.zzc);
        zza5.zzb(true != zza4.zzd ? 2 : 0);
        zzbew.zzb(new zzdxk(zzbfg, zza3, (zzbhw) zza5.zzak(), str));
        return zzbew;
    }
}
