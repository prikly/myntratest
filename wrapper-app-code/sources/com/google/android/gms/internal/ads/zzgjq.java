package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgjq extends zzglh {
    final /* synthetic */ zzgjr zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgjq(zzgjr zzgjr, Class cls) {
        super(cls);
        this.zza = zzgjr;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        zzgre zzgre = (zzgre) zzgzn;
        KeyPair zzc = zzgvc.zzc(zzgvc.zzk(zzgka.zzc(zzgre.zze().zzf().zzg())));
        ECPoint w = ((ECPublicKey) zzc.getPublic()).getW();
        zzgrm zzd = zzgrn.zzd();
        zzd.zzb(0);
        zzd.zza(zzgre.zze());
        zzd.zzc(zzgwv.zzv(w.getAffineX().toByteArray()));
        zzd.zzd(zzgwv.zzv(w.getAffineY().toByteArray()));
        zzgrj zzc2 = zzgrk.zzc();
        zzc2.zzc(0);
        zzc2.zzb((zzgrn) zzd.zzak());
        zzc2.zza(zzgwv.zzv(((ECPrivateKey) zzc.getPrivate()).getS().toByteArray()));
        return (zzgrk) zzc2.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgre.zzd(zzgwv, zzgxp.zza());
    }

    public final Map zzc() throws GeneralSecurityException {
        HashMap hashMap = new HashMap();
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM", zzgjr.zzh(4, 5, 3, zzggq.zza("AES128_GCM"), zzgjr.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgjr.zzh(4, 5, 3, zzggq.zza("AES128_GCM"), zzgjr.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM", zzgjr.zzh(4, 5, 4, zzggq.zza("AES128_GCM"), zzgjr.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_GCM_RAW", zzgjr.zzh(4, 5, 4, zzggq.zza("AES128_GCM"), zzgjr.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_GCM_COMPRESSED_WITHOUT_PREFIX", zzgjr.zzh(4, 5, 4, zzggq.zza("AES128_GCM"), zzgjr.zza, 3));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgjr.zzh(4, 5, 3, zzggq.zza("AES128_CTR_HMAC_SHA256"), zzgjr.zza, 1));
        hashMap.put("ECIES_P256_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgjr.zzh(4, 5, 3, zzggq.zza("AES128_CTR_HMAC_SHA256"), zzgjr.zza, 3));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256", zzgjr.zzh(4, 5, 4, zzggq.zza("AES128_CTR_HMAC_SHA256"), zzgjr.zza, 1));
        hashMap.put("ECIES_P256_COMPRESSED_HKDF_HMAC_SHA256_AES128_CTR_HMAC_SHA256_RAW", zzgjr.zzh(4, 5, 4, zzggq.zza("AES128_CTR_HMAC_SHA256"), zzgjr.zza, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgka.zza(((zzgre) zzgzn).zze());
    }
}
