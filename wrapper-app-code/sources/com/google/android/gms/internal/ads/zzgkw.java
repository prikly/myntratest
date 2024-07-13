package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgkw implements zzgkl {
    private final zzgwa zza;
    private final zzgwa zzb;

    private zzgkw(byte[] bArr, byte[] bArr2) {
        this.zza = zzgwa.zzb(bArr);
        this.zzb = zzgwa.zzb(bArr2);
    }

    static zzgkw zza(byte[] bArr) throws GeneralSecurityException {
        return new zzgkw(bArr, zzgvy.zzc(bArr));
    }
}
