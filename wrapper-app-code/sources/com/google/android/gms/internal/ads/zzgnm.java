package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgnm extends zzgmd {
    zzgnm(Class cls) {
        super(cls);
    }

    public final /* bridge */ /* synthetic */ Object zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgrx zzgrx = (zzgrx) zzgzn;
        int zzg = zzgrx.zzg().zzg();
        SecretKeySpec secretKeySpec = new SecretKeySpec(zzgrx.zzh().zzE(), "HMAC");
        int zza = zzgrx.zzg().zza();
        int i = zzg - 2;
        if (i == 1) {
            return new zzgvt(new zzgvs("HMACSHA1", secretKeySpec), zza);
        }
        if (i == 2) {
            return new zzgvt(new zzgvs("HMACSHA384", secretKeySpec), zza);
        }
        if (i == 3) {
            return new zzgvt(new zzgvs("HMACSHA256", secretKeySpec), zza);
        }
        if (i == 4) {
            return new zzgvt(new zzgvs("HMACSHA512", secretKeySpec), zza);
        }
        if (i == 5) {
            return new zzgvt(new zzgvs("HMACSHA224", secretKeySpec), zza);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}
