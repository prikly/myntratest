package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhen implements zzhep {
    private zzhfc zza;

    public static void zza(zzhfc zzhfc, zzhfc zzhfc2) {
        zzhen zzhen = (zzhen) zzhfc;
        if (zzhen.zza == null) {
            zzhen.zza = zzhfc2;
            return;
        }
        throw new IllegalStateException();
    }

    public final Object zzb() {
        zzhfc zzhfc = this.zza;
        if (zzhfc != null) {
            return zzhfc.zzb();
        }
        throw new IllegalStateException();
    }
}
