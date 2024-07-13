package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkh implements zzggd {
    private final zzgkl zza;
    private final zzgkj zzb;
    private final zzgkf zzc;
    private final zzgke zzd;

    private zzgkh(zzgkl zzgkl, zzgkj zzgkj, zzgke zzgke, zzgkf zzgkf, int i, byte[] bArr) {
        this.zza = zzgkl;
        this.zzb = zzgkj;
        this.zzd = zzgke;
        this.zzc = zzgkf;
    }

    static zzgkh zza(zzgso zzgso) throws GeneralSecurityException {
        int i;
        zzgkl zzgkl;
        if (!zzgso.zzk()) {
            throw new IllegalArgumentException("HpkePrivateKey is missing public_key field.");
        } else if (!zzgso.zzf().zzl()) {
            throw new IllegalArgumentException("HpkePrivateKey.public_key is missing params field.");
        } else if (!zzgso.zzg().zzD()) {
            zzgsl zzc2 = zzgso.zzf().zzc();
            zzgkj zzb2 = zzgkm.zzb(zzc2);
            zzgke zzc3 = zzgkm.zzc(zzc2);
            zzgkf zza2 = zzgkm.zza(zzc2);
            int zzg = zzc2.zzg();
            int i2 = zzg - 2;
            if (i2 == 1) {
                i = 32;
            } else if (i2 == 2) {
                i = 65;
            } else if (i2 == 3) {
                i = 97;
            } else if (i2 == 4) {
                i = 133;
            } else {
                throw new IllegalArgumentException("Unable to determine KEM-encoding length for ".concat(zzgsf.zza(zzg)));
            }
            int zzg2 = zzgso.zzf().zzc().zzg() - 2;
            if (zzg2 == 1) {
                zzgkl = zzgkw.zza(zzgso.zzg().zzE());
            } else if (zzg2 == 2 || zzg2 == 3 || zzg2 == 4) {
                zzgkl = zzgku.zza(zzgso.zzg().zzE(), zzgso.zzf().zzh().zzE(), zzgks.zzg(zzgso.zzf().zzc().zzg()));
            } else {
                throw new GeneralSecurityException("Unrecognized HPKE KEM identifier");
            }
            return new zzgkh(zzgkl, zzb2, zzc3, zza2, i, (byte[]) null);
        } else {
            throw new IllegalArgumentException("HpkePrivateKey.private_key is empty.");
        }
    }
}
