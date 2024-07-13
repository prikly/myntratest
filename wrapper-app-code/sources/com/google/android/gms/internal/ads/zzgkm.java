package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkm {
    static zzgkf zza(zzgsl zzgsl) throws GeneralSecurityException {
        if (zzgsl.zze() == 3) {
            return new zzgkc(16);
        }
        if (zzgsl.zze() == 4) {
            return new zzgkc(32);
        }
        if (zzgsl.zze() == 5) {
            return new zzgkd();
        }
        throw new IllegalArgumentException("Unrecognized HPKE AEAD identifier");
    }

    static zzgkj zzb(zzgsl zzgsl) throws GeneralSecurityException {
        if (zzgsl.zzg() == 3) {
            return new zzgkv(new zzgke("HmacSha256"));
        }
        if (zzgsl.zzg() == 4) {
            return zzgkt.zzc(1);
        }
        if (zzgsl.zzg() == 5) {
            return zzgkt.zzc(2);
        }
        if (zzgsl.zzg() == 6) {
            return zzgkt.zzc(3);
        }
        throw new IllegalArgumentException("Unrecognized HPKE KEM identifier");
    }

    static zzgke zzc(zzgsl zzgsl) {
        if (zzgsl.zzf() == 3) {
            return new zzgke("HmacSha256");
        }
        if (zzgsl.zzf() == 4) {
            return new zzgke("HmacSha384");
        }
        if (zzgsl.zzf() == 5) {
            return new zzgke("HmacSha512");
        }
        throw new IllegalArgumentException("Unrecognized HPKE KDF identifier");
    }
}
