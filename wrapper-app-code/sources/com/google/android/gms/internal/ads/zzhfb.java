package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhfb implements zzhfc {
    private static final Object zza = new Object();
    private volatile zzhfc zzb;
    private volatile Object zzc = zza;

    private zzhfb(zzhfc zzhfc) {
        this.zzb = zzhfc;
    }

    public static zzhfc zza(zzhfc zzhfc) {
        if ((zzhfc instanceof zzhfb) || (zzhfc instanceof zzheo)) {
            return zzhfc;
        }
        if (zzhfc != null) {
            return new zzhfb(zzhfc);
        }
        throw null;
    }

    public final Object zzb() {
        Object obj = this.zzc;
        if (obj != zza) {
            return obj;
        }
        zzhfc zzhfc = this.zzb;
        if (zzhfc == null) {
            return this.zzc;
        }
        Object zzb2 = zzhfc.zzb();
        this.zzc = zzb2;
        this.zzb = null;
        return zzb2;
    }
}
