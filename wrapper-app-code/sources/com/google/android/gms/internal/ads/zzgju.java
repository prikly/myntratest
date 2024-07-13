package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgju {
    @Deprecated
    public static final zzguf zza = zzguf.zzc();
    @Deprecated
    public static final zzguf zzb = zzguf.zzc();
    @Deprecated
    public static final zzguf zzc = zzguf.zzc();

    static {
        new zzgjt();
        new zzgjr();
        try {
            zzghm.zzo(new zzgjw());
            zzghm.zzo(new zzgjz());
            zzghp.zza();
            if (!zzgji.zzb()) {
                zzghm.zzl(new zzgjr(), new zzgjt(), true);
                zzghm.zzl(new zzgkp(), new zzgkr(), true);
            }
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
