package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgjm {
    public static final String zza = "type.googleapis.com/google.crypto.tink.AesSivKey";
    @Deprecated
    public static final zzguf zzb = zzguf.zzc();
    @Deprecated
    public static final zzguf zzc = zzguf.zzc();

    static {
        new zzgjl();
        try {
            zzghm.zzo(new zzgjo());
            if (!zzgji.zzb()) {
                zzghm.zzn(new zzgjl(), true);
            }
        } catch (GeneralSecurityException e2) {
            throw new ExceptionInInitializerError(e2);
        }
    }
}
