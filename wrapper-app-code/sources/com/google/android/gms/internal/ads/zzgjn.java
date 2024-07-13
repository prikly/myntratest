package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgjn implements zzggc {
    private final zzghi zza;
    private final zzgok zzb;
    private final zzgok zzc;

    public zzgjn(zzghi zzghi) {
        zzgok zzgok;
        this.zza = zzghi;
        if (zzghi.zzf()) {
            zzgol zzb2 = zzglt.zza().zzb();
            zzgoq zza2 = zzglq.zza(zzghi);
            this.zzb = zzb2.zza(zza2, "daead", "encrypt");
            zzgok = zzb2.zza(zza2, "daead", "decrypt");
        } else {
            zzgok = zzglq.zza;
            this.zzb = zzgok;
        }
        this.zzc = zzgok;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            byte[] zzb2 = zzgut.zzb(this.zza.zza().zzf(), ((zzggc) this.zza.zza().zze()).zza(bArr, bArr2));
            this.zza.zza().zza();
            int length = bArr.length;
            return zzb2;
        } catch (GeneralSecurityException e2) {
            throw e2;
        }
    }
}
