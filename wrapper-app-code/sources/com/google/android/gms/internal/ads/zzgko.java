package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgko extends zzglh {
    final /* synthetic */ zzgkp zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    zzgko(zzgkp zzgkp, Class cls) {
        super(cls);
        this.zza = zzgkp;
    }

    public final /* bridge */ /* synthetic */ zzgzn zza(zzgzn zzgzn) throws GeneralSecurityException {
        byte[] bArr;
        byte[] bArr2;
        zzgsi zzgsi = (zzgsi) zzgzn;
        int zzg = zzgsi.zze().zzg() - 2;
        if (zzg == 1) {
            bArr = zzgvy.zzb();
            bArr2 = zzgvy.zzc(bArr);
        } else if (zzg == 2 || zzg == 3 || zzg == 4) {
            int zzg2 = zzgks.zzg(zzgsi.zze().zzg());
            KeyPair zzc = zzgvc.zzc(zzgvc.zzk(zzg2));
            bArr2 = zzgvc.zzl(zzg2, 1, ((ECPublicKey) zzc.getPublic()).getW());
            bArr = ((ECPrivateKey) zzc.getPrivate()).getS().toByteArray();
        } else {
            throw new GeneralSecurityException("Invalid KEM");
        }
        zzgsq zzd = zzgsr.zzd();
        zzd.zzc(0);
        zzd.zza(zzgsi.zze());
        zzd.zzb(zzgwv.zzv(bArr2));
        zzgsn zzc2 = zzgso.zzc();
        zzc2.zzc(0);
        zzc2.zzb((zzgsr) zzd.zzak());
        zzc2.zza(zzgwv.zzv(bArr));
        return (zzgso) zzc2.zzak();
    }

    public final /* synthetic */ zzgzn zzb(zzgwv zzgwv) throws zzgyp {
        return zzgsi.zzd(zzgwv, zzgxp.zza());
    }

    public final Map zzc() {
        HashMap hashMap = new HashMap();
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgkp.zzg(3, 3, 3, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgkp.zzg(3, 3, 3, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgkp.zzg(3, 3, 4, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgkp.zzg(3, 3, 4, 3));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305", zzgkp.zzg(3, 3, 5, 1));
        hashMap.put("DHKEM_X25519_HKDF_SHA256_HKDF_SHA256_CHACHA20_POLY1305_RAW", zzgkp.zzg(3, 3, 5, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM", zzgkp.zzg(4, 3, 3, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_128_GCM_RAW", zzgkp.zzg(4, 3, 3, 3));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM", zzgkp.zzg(4, 3, 4, 1));
        hashMap.put("DHKEM_P256_HKDF_SHA256_HKDF_SHA256_AES_256_GCM_RAW", zzgkp.zzg(4, 3, 4, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM", zzgkp.zzg(5, 4, 3, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_128_GCM_RAW", zzgkp.zzg(5, 4, 3, 3));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM", zzgkp.zzg(5, 4, 4, 1));
        hashMap.put("DHKEM_P384_HKDF_SHA384_HKDF_SHA384_AES_256_GCM_RAW", zzgkp.zzg(5, 4, 4, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM", zzgkp.zzg(6, 5, 3, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_128_GCM_RAW", zzgkp.zzg(6, 5, 3, 3));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM", zzgkp.zzg(6, 5, 4, 1));
        hashMap.put("DHKEM_P521_HKDF_SHA512_HKDF_SHA512_AES_256_GCM_RAW", zzgkp.zzg(6, 5, 4, 3));
        return Collections.unmodifiableMap(hashMap);
    }

    public final /* synthetic */ void zzd(zzgzn zzgzn) throws GeneralSecurityException {
        zzgks.zza(((zzgsi) zzgzn).zze());
    }
}
