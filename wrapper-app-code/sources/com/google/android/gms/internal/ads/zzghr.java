package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzghr implements zzgfw {
    private final zzghi zza;
    private final zzgok zzb;
    private final zzgok zzc;

    /* synthetic */ zzghr(zzghi zzghi, zzghq zzghq) {
        zzgok zzgok;
        this.zza = zzghi;
        if (zzghi.zzf()) {
            zzgol zzb2 = zzglt.zza().zzb();
            zzgoq zza2 = zzglq.zza(zzghi);
            this.zzb = zzb2.zza(zza2, "aead", "encrypt");
            zzgok = zzb2.zza(zza2, "aead", "decrypt");
        } else {
            zzgok = zzglq.zza;
            this.zzb = zzgok;
        }
        this.zzc = zzgok;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzghe zzghe : this.zza.zze(copyOf)) {
                try {
                    byte[] zza2 = ((zzgfw) zzghe.zze()).zza(copyOfRange, bArr2);
                    zzghe.zza();
                    int length2 = copyOfRange.length;
                    return zza2;
                } catch (GeneralSecurityException e2) {
                    zzghs.zza.logp(Level.INFO, "com.google.crypto.tink.aead.AeadWrapper$WrappedAead", "decrypt", "ciphertext prefix matches a key, but cannot decrypt: ".concat(e2.toString()));
                }
            }
        }
        for (zzghe zzghe2 : this.zza.zze(zzggb.zza)) {
            try {
                byte[] zza3 = ((zzgfw) zzghe2.zze()).zza(bArr, bArr2);
                zzghe2.zza();
                int length3 = bArr.length;
                return zza3;
            } catch (GeneralSecurityException unused) {
            }
        }
        throw new GeneralSecurityException("decryption failed");
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb2 = zzgut.zzb(this.zza.zza().zzf(), ((zzgfw) this.zza.zza().zze()).zzb(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb2;
        } catch (GeneralSecurityException e2) {
            throw e2;
        }
    }
}
