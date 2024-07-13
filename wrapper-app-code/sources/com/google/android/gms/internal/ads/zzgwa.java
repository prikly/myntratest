package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgwa {
    private final byte[] zza;

    private zzgwa(byte[] bArr, int i, int i2) {
        byte[] bArr2 = new byte[i2];
        this.zza = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i2);
    }

    public static zzgwa zzb(byte[] bArr) {
        if (bArr != null) {
            return new zzgwa(bArr, 0, bArr.length);
        }
        throw new NullPointerException("data must be non-null");
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgwa)) {
            return false;
        }
        return Arrays.equals(((zzgwa) obj).zza, this.zza);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.zza);
    }

    public final String toString() {
        String zza2 = zzgvo.zza(this.zza);
        return "Bytes(" + zza2 + ")";
    }

    public final int zza() {
        return this.zza.length;
    }

    public final byte[] zzc() {
        byte[] bArr = this.zza;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}
