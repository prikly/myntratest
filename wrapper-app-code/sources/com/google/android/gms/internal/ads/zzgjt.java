package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgjt extends zzgli {
    public zzgjt() {
        super(zzgrn.class, new zzgjs(zzgge.class));
    }

    public final zzgsv zzb() {
        return zzgsv.ASYMMETRIC_PUBLIC;
    }

    public final /* synthetic */ zzgzn zzc(zzgwv zzgwv) throws zzgyp {
        return zzgrn.zzg(zzgwv, zzgxp.zza());
    }

    public final String zzd() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey";
    }

    public final /* bridge */ /* synthetic */ void zze(zzgzn zzgzn) throws GeneralSecurityException {
        zzgrn zzgrn = (zzgrn) zzgzn;
        zzgvx.zzb(zzgrn.zza(), 0);
        zzgka.zza(zzgrn.zzc());
    }
}
