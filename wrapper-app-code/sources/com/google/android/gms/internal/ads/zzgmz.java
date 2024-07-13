package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgmz {
    private Integer zza;
    private Integer zzb;
    private zzgna zzc;

    private zzgmz() {
        this.zza = null;
        this.zzb = null;
        throw null;
    }

    /* synthetic */ zzgmz(zzgmy zzgmy) {
        this.zza = null;
        this.zzb = null;
        this.zzc = zzgna.zzd;
    }

    public final zzgmz zzc(zzgna zzgna) {
        this.zzc = zzgna;
        return this;
    }

    public final zzgnc zzd() throws GeneralSecurityException {
        Integer num = this.zza;
        if (num != null && this.zzb != null) {
            return new zzgnc(num.intValue(), this.zzb.intValue(), this.zzc, (zzgnb) null);
        }
        throw new GeneralSecurityException("Key size and/or tag size not set");
    }

    public final zzgmz zza(int i) throws GeneralSecurityException {
        if (i == 16 || i == 32) {
            this.zza = Integer.valueOf(i);
            return this;
        }
        throw new InvalidAlgorithmParameterException(String.format("Invalid key size %d; only 128-bit and 256-bit AES keys are supported", new Object[]{Integer.valueOf(i * 8)}));
    }

    public final zzgmz zzb(int i) throws GeneralSecurityException {
        if (i < 10 || i > 16) {
            throw new GeneralSecurityException("Invalid tag size for AesCmacParameters: " + i);
        }
        this.zzb = Integer.valueOf(i);
        return this;
    }
}
