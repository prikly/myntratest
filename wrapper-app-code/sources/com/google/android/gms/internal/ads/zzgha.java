package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgha {
    @Deprecated
    public static final zzggw zza(byte[] bArr) throws GeneralSecurityException {
        try {
            zzgtj zzg = zzgtj.zzg(bArr, zzgxp.zza());
            for (zzgti zzgti : zzg.zzh()) {
                if (zzgti.zzc().zzc() == zzgsv.UNKNOWN_KEYMATERIAL || zzgti.zzc().zzc() == zzgsv.SYMMETRIC || zzgti.zzc().zzc() == zzgsv.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return zzggw.zza(zzg);
        } catch (zzgyp unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
