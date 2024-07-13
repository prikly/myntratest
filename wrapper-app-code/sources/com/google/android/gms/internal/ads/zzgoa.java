package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgoa {
    @Deprecated
    public static final zzguf zza;
    @Deprecated
    public static final zzguf zzb;
    @Deprecated
    public static final zzguf zzc;

    static {
        new zzgno();
        zzguf zzc2 = zzguf.zzc();
        zza = zzc2;
        zzb = zzc2;
        zzc = zzc2;
        try {
            zza();
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }

    public static void zza() throws GeneralSecurityException {
        zzghm.zzo(new zzgof());
        zzghm.zzn(new zzgno(), true);
        zzgnz.zza();
        if (!zzgji.zzb()) {
            zzghm.zzn(new zzgmx(), true);
            zzgnh.zza();
        }
    }
}
