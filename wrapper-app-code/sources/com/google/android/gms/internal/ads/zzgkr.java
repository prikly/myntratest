package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgkr extends zzgli {
    public zzgkr() {
        super(zzgsr.class, new zzgkq(zzgge.class));
    }

    public final zzgsv zzb() {
        return zzgsv.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgsr.zzg(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.HpkePublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgsr zzgsr = (zzgsr) zzgzn;
        zzgvx.zzb(zzgsr.zza(), 0);
        if (zzgsr.zzl()) {
            zzgks.zza(zzgsr.zzc());
            return;
        }
        throw new GeneralSecurityException("Missing HPKE key params.");
    }
}
