package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkt implements zzgkj {
    private final zzgke zza;
    private final int zzb;

    private zzgkt(zzgke zzgke, int i) {
        this.zza = zzgke;
        this.zzb = i;
    }

    static zzgkt zzc(int i) throws GeneralSecurityException {
        int i2 = i - 1;
        if (i2 == 0) {
            return new zzgkt(new zzgke("HmacSha256"), 1);
        }
        if (i2 != 1) {
            return new zzgkt(new zzgke("HmacSha512"), 3);
        }
        return new zzgkt(new zzgke("HmacSha384"), 2);
    }

    public final zzgkk zza(byte[] bArr) throws GeneralSecurityException {
        KeyPair zzc = zzgvc.zzc(zzgvc.zzk(this.zzb));
        byte[] zzg = zzgvc.zzg((ECPrivateKey) zzc.getPrivate(), zzgvc.zzj(zzgvc.zzk(this.zzb), 1, bArr));
        byte[] zzl = zzgvc.zzl(this.zzb, 1, ((ECPublicKey) zzc.getPublic()).getW());
        byte[] zzb2 = zzgut.zzb(zzl, bArr);
        byte[] zzd = zzgks.zzd(zzb());
        zzgke zzgke = this.zza;
        return new zzgkk(zzgke.zzb((byte[]) null, zzg, "eae_prk", zzb2, "shared_secret", zzd, zzgke.zza()), zzl);
    }

    public final byte[] zzb() throws GeneralSecurityException {
        int i = this.zzb - 1;
        if (i == 0) {
            return zzgks.zzc;
        }
        if (i != 1) {
            return zzgks.zze;
        }
        return zzgks.zzd;
    }
}
