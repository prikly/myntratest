package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgig extends zzglh {
    final /* synthetic */ zzgih zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgig(zzgih zzgih, Class cls) {
        super(cls);
        this.zza = zzgih;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqg zzc = zzgqh.zzc();
        zzc.zza(zzgwv.zzv(zzgvv.zza(((zzgqk) zzgzn).zza())));
        zzc.zzb(0);
        return (zzgqh) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgqk.zze(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM_SIV", zzgih.zzh(16, 1));
        hashMap.put("AES128_GCM_SIV_RAW", zzgih.zzh(16, 3));
        hashMap.put("AES256_GCM_SIV", zzgih.zzh(32, 1));
        hashMap.put("AES256_GCM_SIV_RAW", zzgih.zzh(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgvx.zza(((zzgqk) zzgzn).zza());
    }
}
