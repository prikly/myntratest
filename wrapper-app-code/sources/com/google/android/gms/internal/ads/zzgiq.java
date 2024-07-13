package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgiq extends zzglh {
    final /* synthetic */ zzgir zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgiq(zzgir zzgir, Class cls) {
        super(cls);
        this.zza = zzgir;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgtw zzc = zzgtx.zzc();
        zzc.zza((zzgua) zzgzn);
        zzc.zzb(0);
        return (zzgtx) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgua.zze(zzgwv, zzgxp.zza());
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgua zzgua = (zzgua) zzgzn;
        if (zzgua.zzf().isEmpty() || !zzgua.zzg()) {
            throw new GeneralSecurityException("invalid key format: missing KEK URI or DEK template");
        }
    }
}
