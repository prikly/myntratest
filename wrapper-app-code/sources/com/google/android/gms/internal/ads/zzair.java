package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzair {
    public static int zza(byte[] bArr, int i, int i2) {
        while (i < i2 && bArr[i] != 71) {
            i++;
        }
        return i;
    }

    public static long zzb(zzef zzef, int i, int i2) {
        zzef.zzF(i);
        if (zzef.zza() < 5) {
            return -9223372036854775807L;
        }
        int zze = zzef.zze();
        if ((8388608 & zze) != 0 || ((zze >> 8) & 8191) != i2 || (zze & 32) == 0 || zzef.zzk() < 7 || zzef.zza() < 7 || (zzef.zzk() & 16) != 16) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[6];
        zzef.zzB(bArr, 0, 6);
        byte b2 = bArr[0];
        byte b3 = bArr[1];
        byte b4 = bArr[2];
        long j = ((long) bArr[3]) & 255;
        return ((((long) b3) & 255) << 17) | ((((long) b2) & 255) << 25) | ((((long) b4) & 255) << 9) | (j + j) | ((((long) bArr[4]) & 255) >> 7);
    }
}
