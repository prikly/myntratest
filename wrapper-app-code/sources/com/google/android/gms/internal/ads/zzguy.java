package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPublicKey;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzguy implements zzgge {
    private static final byte[] zza = new byte[0];
    private final zzgvb zzb;
    private final String zzc;
    private final byte[] zzd;
    private final zzguw zze;
    private final int zzf;

    public zzguy(ECPublicKey eCPublicKey, byte[] bArr, String str, int i, zzguw zzguw) throws GeneralSecurityException {
        zzgvc.zzd(eCPublicKey.getW(), eCPublicKey.getParams().getCurve());
        this.zzb = new zzgvb(eCPublicKey);
        this.zzd = bArr;
        this.zzc = str;
        this.zzf = i;
        this.zze = zzguw;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        zzgva zza2 = this.zzb.zza(this.zzc, this.zzd, bArr2, this.zze.zza(), this.zzf);
        byte[] zza3 = this.zze.zzb(zza2.zzb()).zza(bArr, zza);
        byte[] zza4 = zza2.zza();
        return ByteBuffer.allocate(zza4.length + zza3.length).put(zza4).put(zza3).array();
    }
}
