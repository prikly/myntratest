package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgjl extends zzgli {
    zzgjl() {
        super(zzgqn.class, new zzgjj(zzggc.class));
    }

    public final zzglh zza() {
        return new zzgjk(this, zzgqq.class);
    }

    public final zzgsv zzb() {
        return zzgsv.SYMMETRIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgqn.zze(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqn zzgqn = (zzgqn) zzgzn;
        zzgvx.zzb(zzgqn.zza(), 0);
        if (zzgqn.zzf().zzd() != 64) {
            int zzd = zzgqn.zzf().zzd();
            throw new InvalidKeyException("invalid key size: " + zzd + ". Valid keys must have 64 bytes.");
        }
    }
}
