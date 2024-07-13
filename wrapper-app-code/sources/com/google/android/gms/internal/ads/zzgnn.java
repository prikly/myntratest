package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgnn extends zzglh {
    final /* synthetic */ zzgno zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgnn(zzgno zzgno, Class cls) {
        super(cls);
        this.zza = zzgno;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgsa zzgsa = (zzgsa) zzgzn;
        zzgrw zzc = zzgrx.zzc();
        zzc.zzc(0);
        zzc.zzb(zzgsa.zzg());
        zzc.zza(zzgwv.zzv(zzgvv.zza(zzgsa.zza())));
        return (zzgrx) zzc.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgsa.zzf(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("HMAC_SHA256_128BITTAG", zzgno.zzm(32, 16, 5, 1));
        hashMap.put("HMAC_SHA256_128BITTAG_RAW", zzgno.zzm(32, 16, 5, 3));
        hashMap.put("HMAC_SHA256_256BITTAG", zzgno.zzm(32, 32, 5, 1));
        hashMap.put("HMAC_SHA256_256BITTAG_RAW", zzgno.zzm(32, 32, 5, 3));
        hashMap.put("HMAC_SHA512_128BITTAG", zzgno.zzm(64, 16, 6, 1));
        hashMap.put("HMAC_SHA512_128BITTAG_RAW", zzgno.zzm(64, 16, 6, 3));
        hashMap.put("HMAC_SHA512_256BITTAG", zzgno.zzm(64, 32, 6, 1));
        hashMap.put("HMAC_SHA512_256BITTAG_RAW", zzgno.zzm(64, 32, 6, 3));
        hashMap.put("HMAC_SHA512_512BITTAG", zzgno.zzm(64, 64, 6, 1));
        hashMap.put("HMAC_SHA512_512BITTAG_RAW", zzgno.zzm(64, 64, 6, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* bridge */ /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgsa zzgsa = (zzgsa) zzgzn;
        if (zzgsa.zza() >= 16) {
            zzgno.zzn(zzgsa.zzg());
            return;
        }
        throw new GeneralSecurityException("key too short");
    }
}
