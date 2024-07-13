package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgjk extends zzglh {
    final /* synthetic */ zzgjl zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgjk(zzgjl zzgjl, Class cls) {
        super(cls);
        this.zza = zzgjl;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqm zzc = zzgqn.zzc();
        zzc.zza(zzgwv.zzv(zzgvv.zza(((zzgqq) zzgzn).zza())));
        zzc.zzb(0);
        return (zzgqn) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgqq.zze(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        zzgqp zzc = zzgqq.zzc();
        zzc.zza(64);
        hashMap.put("AES256_SIV", new zzglg((zzgqq) zzc.zzak(), 1));
        zzgqp zzc2 = zzgqq.zzc();
        zzc2.zza(64);
        hashMap.put("AES256_SIV_RAW", new zzglg((zzgqq) zzc2.zzak(), 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqq zzgqq = (zzgqq) zzgzn;
        if (zzgqq.zza() != 64) {
            int zza2 = zzgqq.zza();
            throw new InvalidAlgorithmParameterException("invalid key size: " + zza2 + ". Valid keys must have 64 bytes.");
        }
    }
}
