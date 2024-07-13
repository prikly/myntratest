package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzghu extends zzglh {
    final /* synthetic */ zzghv zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzghu(zzghv zzghv, Class cls) {
        super(cls);
        this.zza = zzghv;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgpg zzgpg = (zzgpg) zzgzn;
        new zzghy();
        zzgpj zzf = zzghx.zzf(zzgpg.zze());
        zzgzn zza2 = new zzgno().zza().zza(zzgpg.zzf());
        zzgpc zzc = zzgpd.zzc();
        zzc.zza(zzf);
        zzc.zzb((zzgrx) zza2);
        zzc.zzc(0);
        return (zzgpd) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgpg.zzd(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("AES128_CTR_HMAC_SHA256", zzghv.zzg(16, 16, 32, 16, 5, 1));
        hashMap.put("AES128_CTR_HMAC_SHA256_RAW", zzghv.zzg(16, 16, 32, 16, 5, 3));
        hashMap.put("AES256_CTR_HMAC_SHA256", zzghv.zzg(32, 16, 32, 32, 5, 1));
        hashMap.put("AES256_CTR_HMAC_SHA256_RAW", zzghv.zzg(32, 16, 32, 32, 5, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgpg zzgpg = (zzgpg) zzgzn;
        ((zzghx) new zzghy().zza()).zzd(zzgpg.zze());
        new zzgno().zza().zzd(zzgpg.zzf());
        zzgvx.zza(zzgpg.zze().zza());
    }
}
