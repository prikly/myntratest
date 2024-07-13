package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;
import java.util.logging.Level;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgoe implements zzggz {
    private final zzghi zza;
    private final zzgok zzb;
    private final zzgok zzc;

    /* synthetic */ zzgoe(zzghi zzghi, zzgod zzgod) {
        zzgok zzgok;
        this.zza = zzghi;
        if (zzghi.zzf()) {
            zzgol zzb2 = zzglt.zza().zzb();
            zzgoq zza2 = zzglq.zza(zzghi);
            this.zzb = zzb2.zza(zza2, "mac", "compute");
            zzgok = zzb2.zza(zza2, "mac", "verify");
        } else {
            zzgok = zzglq.zza;
            this.zzb = zzgok;
        }
        this.zzc = zzgok;
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArr3;
        int length = bArr.length;
        if (length > 5) {
            byte[] copyOf = Arrays.copyOf(bArr, 5);
            byte[] copyOfRange = Arrays.copyOfRange(bArr, 5, length);
            for (zzghe zzghe : this.zza.zze(copyOf)) {
                if (zzghe.zzd().equals(zzguc.LEGACY)) {
                    bArr3 = zzgut.zzb(bArr2, zzgof.zzb);
                } else {
                    bArr3 = bArr2;
                }
                try {
                    ((zzggz) zzghe.zze()).zza(copyOfRange, bArr3);
                    zzghe.zza();
                    return;
                } catch (GeneralSecurityException e2) {
                    zzgof.zza.logp(Level.INFO, "com.google.crypto.tink.mac.MacWrapper$WrappedMac", "verifyMac", "tag prefix matches a key, but cannot verify: ".concat(e2.toString()));
                }
            }
            for (zzghe zzghe2 : this.zza.zze(zzggb.zza)) {
                try {
                    ((zzggz) zzghe2.zze()).zza(bArr, bArr2);
                    zzghe2.zza();
                    return;
                } catch (GeneralSecurityException unused) {
                }
            }
            throw new GeneralSecurityException("invalid MAC");
        }
        throw new GeneralSecurityException("tag too short");
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        if (this.zza.zza().zzd().equals(zzguc.LEGACY)) {
            bArr = zzgut.zzb(bArr, zzgof.zzb);
        }
        try {
            byte[] zzb2 = zzgut.zzb(this.zza.zza().zzf(), ((zzggz) this.zza.zza().zze()).zzb(bArr));
            this.zza.zza().zza();
            return zzb2;
        } catch (GeneralSecurityException e2) {
            throw e2;
        }
    }
}
