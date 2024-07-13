package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgkx {
    private final zzgfw zza;
    private final zzggc zzb;

    public zzgkx(zzgfw zzgfw) {
        this.zza = zzgfw;
        this.zzb = null;
    }

    public zzgkx(zzggc zzggc) {
        this.zza = null;
        this.zzb = zzggc;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgfw zzgfw = this.zza;
        if (zzgfw != null) {
            return zzgfw.zzb(bArr, bArr2);
        }
        return this.zzb.zza(bArr, bArr2);
    }
}
