package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdvz implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;
    private final zzhfc zzc;

    public zzdvz(zzhfc zzhfc, zzhfc zzhfc2, zzhfc zzhfc3) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
        this.zzc = zzhfc3;
    }

    public final /* synthetic */ Object zzb() {
        zzhfc zzhfc = this.zza;
        zzhfc zzhfc2 = this.zzb;
        int i = ((zzdee) this.zzc).zza().zzo.zza;
        int i2 = i - 1;
        if (i == 0) {
            throw null;
        } else if (i2 != 0) {
            return ((zzepx) zzhfc2).zzb();
        } else {
            return ((zzepx) zzhfc).zzb();
        }
    }
}
