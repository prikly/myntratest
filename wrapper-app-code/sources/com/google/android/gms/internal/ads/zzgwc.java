package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgwc {
    private final byte[] zza = new byte[256];
    private int zzb;
    private int zzc;

    public zzgwc(byte[] bArr) {
        for (int i = 0; i < 256; i++) {
            this.zza[i] = (byte) i;
        }
        byte b2 = 0;
        for (int i2 = 0; i2 < 256; i2++) {
            byte[] bArr2 = this.zza;
            byte b3 = bArr2[i2];
            b2 = (b2 + b3 + bArr[i2 % bArr.length]) & 255;
            bArr2[i2] = bArr2[b2];
            bArr2[b2] = b3;
        }
        this.zzb = 0;
        this.zzc = 0;
    }

    public final void zza(byte[] bArr) {
        int i = this.zzb;
        int i2 = this.zzc;
        for (int i3 = 0; i3 < 256; i3++) {
            i = (i + 1) & KotlinVersion.MAX_COMPONENT_VALUE;
            byte[] bArr2 = this.zza;
            byte b2 = bArr2[i];
            i2 = (i2 + b2) & KotlinVersion.MAX_COMPONENT_VALUE;
            bArr2[i] = bArr2[i2];
            bArr2[i2] = b2;
            bArr[i3] = (byte) (bArr2[(bArr2[i] + b2) & KotlinVersion.MAX_COMPONENT_VALUE] ^ bArr[i3]);
        }
        this.zzb = i;
        this.zzc = i2;
    }
}
