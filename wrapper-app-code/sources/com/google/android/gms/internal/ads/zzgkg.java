package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkg {
    private static final byte[] zza = new byte[0];
    private final zzgkf zzb;
    private final BigInteger zzc;
    private final byte[] zzd;
    private final byte[] zze;
    private final byte[] zzf;
    private BigInteger zzg = BigInteger.ZERO;

    private zzgkg(byte[] bArr, byte[] bArr2, byte[] bArr3, BigInteger bigInteger, zzgkf zzgkf) {
        this.zzf = bArr;
        this.zzd = bArr2;
        this.zze = bArr3;
        this.zzc = bigInteger;
        this.zzb = zzgkf;
    }

    static zzgkg zzc(byte[] bArr, byte[] bArr2, zzgkj zzgkj, zzgke zzgke, zzgkf zzgkf, byte[] bArr3) throws GeneralSecurityException {
        zzgke zzgke2 = zzgke;
        byte[] zzb2 = zzgks.zzb(zzgkj.zzb(), zzgke.zzc(), zzgkf.zzb());
        byte[] zzb3 = zzgut.zzb(zzgks.zza, zzgke2.zze(zzgks.zzl, zza, "psk_id_hash", zzb2), zzgke2.zze(zzgks.zzl, bArr3, "info_hash", zzb2));
        zzgke zzgke3 = zzgke;
        byte[] zze2 = zzgke2.zze(bArr2, zza, "secret", zzb2);
        byte[] bArr4 = zzb3;
        byte[] bArr5 = zzb2;
        return new zzgkg(bArr, zzgke3.zzd(zze2, bArr4, "key", bArr5, zzgkf.zza()), zzgke3.zzd(zze2, bArr4, "base_nonce", bArr5, 12), BigInteger.ONE.shiftLeft(96).subtract(BigInteger.ONE), zzgkf);
    }

    private final synchronized byte[] zzd() throws GeneralSecurityException {
        byte[] zzc2;
        byte[] bArr = this.zze;
        byte[] byteArray = this.zzg.toByteArray();
        int length = byteArray.length;
        if (length != 12) {
            if (length > 13) {
                throw new GeneralSecurityException("integer too large");
            } else if (length != 13) {
                byte[] bArr2 = new byte[12];
                System.arraycopy(byteArray, 0, bArr2, 12 - length, length);
                byteArray = bArr2;
            } else if (byteArray[0] == 0) {
                byteArray = Arrays.copyOfRange(byteArray, 1, 13);
            } else {
                throw new GeneralSecurityException("integer too large");
            }
        }
        zzc2 = zzgut.zzc(bArr, byteArray);
        if (this.zzg.compareTo(this.zzc) < 0) {
            this.zzg = this.zzg.add(BigInteger.ONE);
        } else {
            throw new GeneralSecurityException("message limit reached");
        }
        return zzc2;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zza() {
        return this.zzf;
    }

    /* access modifiers changed from: package-private */
    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        return this.zzb.zzc(this.zzd, zzd(), bArr, bArr2);
    }
}
