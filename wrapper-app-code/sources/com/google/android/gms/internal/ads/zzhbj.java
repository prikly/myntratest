package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzhbj {
    zzhbj() {
    }

    static final String zzd(ByteBuffer byteBuffer, int i, int i2) throws zzgyp {
        if ((i | i2 | ((byteBuffer.limit() - i) - i2)) >= 0) {
            int i3 = i + i2;
            char[] cArr = new char[i2];
            int i4 = 0;
            while (r11 < i3) {
                byte b2 = byteBuffer.get(r11);
                if (!zzhbi.zzd(b2)) {
                    break;
                }
                i = r11 + 1;
                cArr[i4] = (char) b2;
                i4++;
            }
            int i5 = i4;
            while (r11 < i3) {
                int i6 = r11 + 1;
                byte b3 = byteBuffer.get(r11);
                if (zzhbi.zzd(b3)) {
                    int i7 = i5 + 1;
                    cArr[i5] = (char) b3;
                    r11 = i6;
                    while (true) {
                        i5 = i7;
                        if (r11 >= i3) {
                            break;
                        }
                        byte b4 = byteBuffer.get(r11);
                        if (!zzhbi.zzd(b4)) {
                            break;
                        }
                        r11++;
                        i7 = i5 + 1;
                        cArr[i5] = (char) b4;
                    }
                } else if (zzhbi.zzf(b3)) {
                    if (i6 < i3) {
                        zzhbi.zzc(b3, byteBuffer.get(i6), cArr, i5);
                        r11 = i6 + 1;
                        i5++;
                    } else {
                        throw zzgyp.zzd();
                    }
                } else if (zzhbi.zze(b3)) {
                    if (i6 < i3 - 1) {
                        int i8 = i6 + 1;
                        zzhbi.zzb(b3, byteBuffer.get(i6), byteBuffer.get(i8), cArr, i5);
                        r11 = i8 + 1;
                        i5++;
                    } else {
                        throw zzgyp.zzd();
                    }
                } else if (i6 < i3 - 2) {
                    int i9 = i6 + 1;
                    int i10 = i9 + 1;
                    zzhbi.zza(b3, byteBuffer.get(i6), byteBuffer.get(i9), byteBuffer.get(i10), cArr, i5);
                    i5 += 2;
                    r11 = i10 + 1;
                } else {
                    throw zzgyp.zzd();
                }
            }
            return new String(cArr, 0, i5);
        }
        throw new ArrayIndexOutOfBoundsException(String.format("buffer limit=%d, index=%d, limit=%d", new Object[]{Integer.valueOf(byteBuffer.limit()), Integer.valueOf(i), Integer.valueOf(i2)}));
    }

    /* access modifiers changed from: package-private */
    public abstract int zza(int i, byte[] bArr, int i2, int i3);

    /* access modifiers changed from: package-private */
    public abstract String zzb(byte[] bArr, int i, int i2) throws zzgyp;

    /* access modifiers changed from: package-private */
    public final boolean zzc(byte[] bArr, int i, int i2) {
        return zza(0, bArr, i, i2) == 0;
    }
}
