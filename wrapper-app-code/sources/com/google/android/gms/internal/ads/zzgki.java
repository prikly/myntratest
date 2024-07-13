package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgki implements zzgge {
    private static final byte[] zza = new byte[0];
    private final zzgsr zzb;
    private final zzgkj zzc;
    private final zzgkf zzd;
    private final zzgke zze;

    private zzgki(zzgsr zzgsr, zzgkj zzgkj, zzgke zzgke, zzgkf zzgkf, byte[] bArr) {
        this.zzb = zzgsr;
        this.zzc = zzgkj;
        this.zze = zzgke;
        this.zzd = zzgkf;
    }

    static zzgki zzb(zzgsr zzgsr) throws GeneralSecurityException {
        if (!zzgsr.zzh().zzD()) {
            zzgsl zzc2 = zzgsr.zzc();
            return new zzgki(zzgsr, zzgkm.zzb(zzc2), zzgkm.zzc(zzc2), zzgkm.zza(zzc2), (byte[]) null);
        }
        throw new IllegalArgumentException("HpkePublicKey.public_key is empty.");
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (bArr2 == null) {
            bArr2 = new byte[0];
        }
        byte[] bArr3 = bArr2;
        zzgsr zzgsr = this.zzb;
        zzgkj zzgkj = this.zzc;
        zzgke zzgke = this.zze;
        zzgkf zzgkf = this.zzd;
        zzgkk zza2 = zzgkj.zza(zzgsr.zzh().zzE());
        zzgkg zzc2 = zzgkg.zzc(zza2.zza(), zza2.zzb(), zzgkj, zzgke, zzgkf, bArr3);
        return zzgut.zzb(zzc2.zza(), zzc2.zzb(bArr, zza));
    }
}
