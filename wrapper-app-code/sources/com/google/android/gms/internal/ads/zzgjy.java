package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgjy implements zzgge {
    final zzghi zza;
    private final zzgok zzb;

    public zzgjy(zzghi zzghi) {
        this.zza = zzghi;
        this.zzb = zzghi.zzf() ? zzglt.zza().zzb().zza(zzglq.zza(zzghi), "hybrid_encrypt", "encrypt") : zzglq.zza;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzghi zzghi = this.zza;
        if (zzghi.zza() != null) {
            try {
                byte[] zzb2 = zzgut.zzb(zzghi.zza().zzf(), ((zzgge) this.zza.zza().zze()).zza(bArr, bArr2));
                this.zza.zza().zza();
                int length = bArr.length;
                return zzb2;
            } catch (GeneralSecurityException e2) {
                throw e2;
            }
        } else {
            throw new GeneralSecurityException("keyset without primary key");
        }
    }
}
