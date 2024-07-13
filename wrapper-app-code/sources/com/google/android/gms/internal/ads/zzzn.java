package com.google.android.gms.internal.ads;

import java.io.EOFException;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzzn {
    public static int zza(zzzk zzzk, byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        while (i3 < i2) {
            int zzb = zzzk.zzb(bArr, i + i3, i2 - i3);
            if (zzb == -1) {
                break;
            }
            i3 += zzb;
        }
        return i3;
    }

    public static void zzb(boolean z, String str) throws zzbu {
        if (!z) {
            throw zzbu.zza(str, (Throwable) null);
        }
    }

    public static boolean zzc(zzzk zzzk, byte[] bArr, int i, int i2, boolean z) throws IOException {
        try {
            return zzzk.zzm(bArr, 0, i2, z);
        } catch (EOFException e2) {
            if (z) {
                return false;
            }
            throw e2;
        }
    }

    public static boolean zzd(zzzk zzzk, byte[] bArr, int i, int i2) throws IOException {
        try {
            ((zzyz) zzzk).zzn(bArr, i, i2, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }

    public static boolean zze(zzzk zzzk, int i) throws IOException {
        try {
            ((zzyz) zzzk).zzo(i, false);
            return true;
        } catch (EOFException unused) {
            return false;
        }
    }
}
