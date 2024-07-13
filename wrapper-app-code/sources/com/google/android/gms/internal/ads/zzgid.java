package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgid extends zzglh {
    final /* synthetic */ zzgie zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgid(zzgie zzgie, Class cls) {
        super(cls);
        this.zza = zzgie;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgqa zzc = zzgqb.zzc();
        zzc.zza(zzgwv.zzv(zzgvv.zza(((zzgqe) zzgzn).zza())));
        zzc.zzb(0);
        return (zzgqb) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgqe.zze(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_GCM", zzgie.zzg(16, 1));
        hashMap.put("AES128_GCM_RAW", zzgie.zzg(16, 3));
        hashMap.put("AES256_GCM", zzgie.zzg(32, 1));
        hashMap.put("AES256_GCM_RAW", zzgie.zzg(32, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgvx.zza(((zzgqe) zzgzn).zza());
    }
}
