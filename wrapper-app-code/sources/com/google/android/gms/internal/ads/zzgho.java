package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgho {
    public static final Charset zza = Charset.forName("UTF-8");

    public static zzgto zza(zzgtj zzgtj) {
        zzgtl zza2 = zzgto.zza();
        zza2.zzb(zzgtj.zzc());
        for (zzgti zzgti : zzgtj.zzh()) {
            zzgtm zza3 = zzgtn.zza();
            zza3.zzc(zzgti.zzc().zzg());
            zza3.zzd(zzgti.zzk());
            zza3.zzb(zzgti.zzf());
            zza3.zza(zzgti.zza());
            zza2.zza((zzgtn) zza3.zzak());
        }
        return (zzgto) zza2.zzak();
    }

    public static void zzb(zzgtj zzgtj) throws GeneralSecurityException {
        int zzc = zzgtj.zzc();
        int i = 0;
        boolean z = false;
        boolean z2 = true;
        for (zzgti zzgti : zzgtj.zzh()) {
            if (zzgti.zzk() == 3) {
                if (!zzgti.zzj()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", new Object[]{Integer.valueOf(zzgti.zza())}));
                } else if (zzgti.zzf() == zzguc.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", new Object[]{Integer.valueOf(zzgti.zza())}));
                } else if (zzgti.zzk() != 2) {
                    if (zzgti.zza() == zzc) {
                        if (!z) {
                            z = true;
                        } else {
                            throw new GeneralSecurityException("keyset contains multiple primary keys");
                        }
                    }
                    z2 &= zzgti.zzc().zzc() == zzgsv.ASYMMETRIC_PUBLIC;
                    i++;
                } else {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", new Object[]{Integer.valueOf(zzgti.zza())}));
                }
            }
        }
        if (i == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        } else if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}
