package com.google.android.gms.internal.measurement;

import com.applovin.exoplayer2.common.base.Ascii;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzmz {
    static /* bridge */ /* synthetic */ void zza(byte b2, byte b3, byte b4, byte b5, char[] cArr, int i) {
        if (zze(b3) || (((b2 << Ascii.FS) + (b3 + 112)) >> 30) != 0 || zze(b4) || zze(b5)) {
            throw zzkp.zzc();
        }
        byte b6 = ((b2 & 7) << Ascii.DC2) | ((b3 & 63) << Ascii.FF) | ((b4 & 63) << 6) | (b5 & 63);
        cArr[i] = (char) ((b6 >>> 10) + 55232);
        cArr[i + 1] = (char) ((b6 & 1023) + Ascii.NUL);
    }

    static /* bridge */ /* synthetic */ void zzc(byte b2, byte b3, char[] cArr, int i) {
        if (b2 < -62 || zze(b3)) {
            throw zzkp.zzc();
        }
        cArr[i] = (char) (((b2 & Ascii.US) << 6) | (b3 & 63));
    }

    static /* bridge */ /* synthetic */ boolean zzd(byte b2) {
        return b2 >= 0;
    }

    private static boolean zze(byte b2) {
        return b2 > -65;
    }

    static /* bridge */ /* synthetic */ void zzb(byte b2, byte b3, byte b4, char[] cArr, int i) {
        if (!zze(b3)) {
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
            if (!zze(b4)) {
                cArr[i] = (char) (((b2 & Ascii.SI) << Ascii.FF) | ((b3 & 63) << 6) | (b4 & 63));
                return;
            }
        }
        throw zzkp.zzc();
    }
}
