package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgvt implements zzggz {
    private final zzgor zza;
    private final int zzb;

    public zzgvt(zzgor zzgor, int i) throws GeneralSecurityException {
        this.zza = zzgor;
        this.zzb = i;
        if (i >= 10) {
            zzgor.zza(new byte[0], i);
            return;
        }
        throw new InvalidAlgorithmParameterException("tag size too small, need at least 10 bytes");
    }

    public final void zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        if (!MessageDigest.isEqual(zzb(bArr2), bArr)) {
            throw new GeneralSecurityException("invalid MAC");
        }
    }

    public final byte[] zzb(byte[] bArr) throws GeneralSecurityException {
        return this.zza.zza(bArr, this.zzb);
    }
}
