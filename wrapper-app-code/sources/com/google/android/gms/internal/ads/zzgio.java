package com.google.android.gms.internal.ads;

import java.nio.BufferUnderflowException;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgio implements zzgfw {
    private static final byte[] zza = new byte[0];
    private final zzgtb zzb;
    private final zzgfw zzc;

    public zzgio(zzgtb zzgtb, zzgfw zzgfw) {
        this.zzb = zzgtb;
        this.zzc = zzgfw;
    }

    public final byte[] zza(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        try {
            ByteBuffer wrap = ByteBuffer.wrap(bArr);
            int i = wrap.getInt();
            if (i <= 0 || i > bArr.length - 4) {
                throw new GeneralSecurityException("invalid ciphertext");
            }
            byte[] bArr3 = new byte[i];
            wrap.get(bArr3, 0, i);
            byte[] bArr4 = new byte[wrap.remaining()];
            wrap.get(bArr4, 0, wrap.remaining());
            return ((zzgfw) zzghm.zzi(this.zzb.zzg(), this.zzc.zza(bArr3, zza), zzgfw.class)).zza(bArr4, bArr2);
        } catch (IndexOutOfBoundsException | NegativeArraySizeException | BufferUnderflowException e2) {
            throw new GeneralSecurityException("invalid ciphertext", e2);
        }
    }

    public final byte[] zzb(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] zzaw = zzghm.zzd(this.zzb).zzaw();
        byte[] zzb2 = this.zzc.zzb(zzaw, zza);
        byte[] zzb3 = ((zzgfw) zzghm.zzi(this.zzb.zzg(), zzaw, zzgfw.class)).zzb(bArr, bArr2);
        int length = zzb2.length;
        return ByteBuffer.allocate(length + 4 + zzb3.length).putInt(length).put(zzb2).put(zzb3).array();
    }
}
