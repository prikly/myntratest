package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgux implements zzggd {
    private final ECPrivateKey zza;
    private final zzguz zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzguw zze;

    public zzgux(ECPrivateKey eCPrivateKey, byte[] bArr, String str, int i, zzguw zzguw) throws GeneralSecurityException {
        this.zza = eCPrivateKey;
        this.zzb = new zzguz(eCPrivateKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zze = zzguw;
    }
}
