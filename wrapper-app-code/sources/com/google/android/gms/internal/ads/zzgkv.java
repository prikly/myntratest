package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkv implements zzgkj {
    private final zzgke zza;

    zzgkv(zzgke zzgke) {
        this.zza = zzgke;
    }

    public final zzgkk zza(byte[] bArr) throws GeneralSecurityException {
        byte[] zzb = zzgvy.zzb();
        byte[] zza2 = zzgvy.zza(zzb, bArr);
        byte[] zzc = zzgvy.zzc(zzb);
        byte[] zzb2 = zzgut.zzb(zzc, bArr);
        byte[] zzd = zzgks.zzd(zzgks.zzb);
        zzgke zzgke = this.zza;
        return new zzgkk(zzgke.zzb((byte[]) null, zza2, "eae_prk", zzb2, "shared_secret", zzd, zzgke.zza()), zzc);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        if (Arrays.equals(this.zza.zzc(), zzgks.zzf)) {
            return zzgks.zzb;
        }
        throw new GeneralSecurityException("Could not determine HPKE KEM ID");
    }
}
