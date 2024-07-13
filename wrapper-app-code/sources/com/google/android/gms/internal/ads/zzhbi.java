package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzhbi {
    static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (zzg(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zzg(b4) || zzg(b5)) {
            throw zzgyp.zzd();
        }
        byte b6 = ((b2 & 7) << Ascii.DC2) | ((b3 & 63) << Ascii.FF) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((b6 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b6 & 1023) + Ascii.NUL);
    }

    static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || zzg(b3)) {
            throw zzgyp.zzd();
        }
        cArr[i] = (char) (((b2 & Ascii.US) << 6) | (b3 & 63));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    static /* bridge */ /* synthetic */ boolean zze(byte b2) {
        return b2 < -16;
    }

    static /* bridge */ /* synthetic */ boolean zzf(byte b2) {
        return b2 < -32;
    }

    private static boolean zzg(byte b2) {
        return b2 > -65;
    }

    static /* bridge */ /* synthetic */ void zzb(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zzg(b3)) {
            if (b2 == -32) {
                if (b3 >= -96) {
                    b2 = -32;
                }
            }
            if (b2 == -19) {
                if (b3 < -96) {
                    b2 = -19;
                }
            }
            if (!zzg(b4)) {
                cArr[i] = (char) (((b2 & Ascii.SI) << Ascii.FF) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzgyp.zzd();
    }
}
