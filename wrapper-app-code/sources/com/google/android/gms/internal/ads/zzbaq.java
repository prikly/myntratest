package com.google.android.gms.internal.ads;

import kotlin.KotlinVersion;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbaq {
    public byte[] zza;
    private int zzb;
    private int zzc;
    private int zzd;

    public zzbaq() {
    }

    public zzbaq(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzd = i;
    }

    public final int zza(int i) {
        int i2;
        int i3;
        byte b2;
        byte b3;
        int i4 = i >> 3;
        boolean z = false;
        byte b4 = 0;
        for (int i5 = 0; i5 < i4; i5++) {
            int i6 = this.zzc;
            if (i6 != 0) {
                byte[] bArr = this.zza;
                int i7 = this.zzb;
                b3 = ((bArr[i7 + 1] & 255) >>> (8 - i6)) | ((bArr[i7] & 255) << i6);
            } else {
                b3 = this.zza[this.zzb];
            }
            i -= 8;
            b4 |= (255 & b3) << i;
            this.zzb++;
        }
        if (i > 0) {
            int i8 = this.zzc + i;
            byte b5 = (byte) (KotlinVersion.MAX_COMPONENT_VALUE >> (8 - i));
            if (i8 > 8) {
                byte[] bArr2 = this.zza;
                int i9 = this.zzb;
                int i10 = i9 + 1;
                b2 = (b5 & (((255 & bArr2[i10]) >> (16 - i8)) | ((bArr2[i9] & 255) << (i8 - 8)))) | b4;
                this.zzb = i10;
            } else {
                byte[] bArr3 = this.zza;
                int i11 = this.zzb;
                b2 = (b5 & ((255 & bArr3[i11]) >> (8 - i8))) | b4;
                if (i8 == 8) {
                    this.zzb = i11 + 1;
                }
            }
            b4 = b2;
            this.zzc = i8 % 8;
        }
        int i12 = this.zzb;
        if (i12 >= 0 && (i2 = this.zzc) >= 0 && (i12 < (i3 = this.zzd) || (i12 == i3 && i2 == 0))) {
            z = true;
        }
        zzbaj.zze(z);
        return b4;
    }
}
