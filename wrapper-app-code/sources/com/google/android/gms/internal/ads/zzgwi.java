package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgwi {
    static int zza(byte[] bArr, int i, zzgwh zzgwh) throws zzgyp {
        int zzj = zzj(bArr, i, zzgwh);
        int i2 = zzgwh.zza;
        if (i2 < 0) {
            throw zzgyp.zzf();
        } else if (i2 > bArr.length - zzj) {
            throw zzgyp.zzj();
        } else if (i2 == 0) {
            zzgwh.zzc = zzgwv.zzb;
            return zzj;
        } else {
            zzgwh.zzc = zzgwv.zzw(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzb(byte[] bArr, int i) {
        return ((bArr[i + 3] & 255) << Ascii.CAN) | (bArr[i] & 255) | ((bArr[i + 1] & 255) << 8) | ((bArr[i + 2] & 255) << Ascii.DLE);
    }

    static int zzc(zzhag zzhag, byte[] bArr, int i, int i2, int i3, zzgwh zzgwh) throws IOException {
        Object zze = zzhag.zze();
        int zzn = zzn(zze, zzhag, bArr, i, i2, i3, zzgwh);
        zzhag.zzf(zze);
        zzgwh.zzc = zze;
        return zzn;
    }

    static int zzd(zzhag zzhag, byte[] bArr, int i, int i2, zzgwh zzgwh) throws IOException {
        Object zze = zzhag.zze();
        int zzo = zzo(zze, zzhag, bArr, i, i2, zzgwh);
        zzhag.zzf(zze);
        zzgwh.zzc = zze;
        return zzo;
    }

    static int zze(zzhag zzhag, int i, byte[] bArr, int i2, int i3, zzgym zzgym, zzgwh zzgwh) throws IOException {
        int zzd = zzd(zzhag, bArr, i2, i3, zzgwh);
        zzgym.add(zzgwh.zzc);
        while (zzd < i3) {
            int zzj = zzj(bArr, zzd, zzgwh);
            if (i != zzgwh.zza) {
                break;
            }
            zzd = zzd(zzhag, bArr, zzj, i3, zzgwh);
            zzgym.add(zzgwh.zzc);
        }
        return zzd;
    }

    static int zzf(byte[] bArr, int i, zzgym zzgym, zzgwh zzgwh) throws IOException {
        zzgye zzgye = (zzgye) zzgym;
        int zzj = zzj(bArr, i, zzgwh);
        int i2 = zzgwh.zza + zzj;
        while (zzj < i2) {
            zzj = zzj(bArr, zzj, zzgwh);
            zzgye.zzh(zzgwh.zza);
        }
        if (zzj == i2) {
            return zzj;
        }
        throw zzgyp.zzj();
    }

    static int zzg(byte[] bArr, int i, zzgwh zzgwh) throws zzgyp {
        int zzj = zzj(bArr, i, zzgwh);
        int i2 = zzgwh.zza;
        if (i2 < 0) {
            throw zzgyp.zzf();
        } else if (i2 == 0) {
            zzgwh.zzc = "";
            return zzj;
        } else {
            zzgwh.zzc = new String(bArr, zzj, i2, zzgyn.zzb);
            return zzj + i2;
        }
    }

    static int zzh(byte[] bArr, int i, zzgwh zzgwh) throws zzgyp {
        int zzj = zzj(bArr, i, zzgwh);
        int i2 = zzgwh.zza;
        if (i2 < 0) {
            throw zzgyp.zzf();
        } else if (i2 == 0) {
            zzgwh.zzc = "";
            return zzj;
        } else {
            zzgwh.zzc = zzhbm.zzh(bArr, zzj, i2);
            return zzj + i2;
        }
    }

    static int zzi(int i, byte[] bArr, int i2, int i3, zzhay zzhay, zzgwh zzgwh) throws zzgyp {
        if ((i >>> 3) != 0) {
            int i4 = i & 7;
            if (i4 == 0) {
                int zzm = zzm(bArr, i2, zzgwh);
                zzhay.zzj(i, Long.valueOf(zzgwh.zzb));
                return zzm;
            } else if (i4 == 1) {
                zzhay.zzj(i, Long.valueOf(zzp(bArr, i2)));
                return i2 + 8;
            } else if (i4 == 2) {
                int zzj = zzj(bArr, i2, zzgwh);
                int i5 = zzgwh.zza;
                if (i5 < 0) {
                    throw zzgyp.zzf();
                } else if (i5 <= bArr.length - zzj) {
                    if (i5 == 0) {
                        zzhay.zzj(i, zzgwv.zzb);
                    } else {
                        zzhay.zzj(i, zzgwv.zzw(bArr, zzj, i5));
                    }
                    return zzj + i5;
                } else {
                    throw zzgyp.zzj();
                }
            } else if (i4 == 3) {
                int i6 = (i & -8) | 4;
                zzhay zzf = zzhay.zzf();
                int i7 = 0;
                while (true) {
                    if (i2 >= i3) {
                        break;
                    }
                    int zzj2 = zzj(bArr, i2, zzgwh);
                    int i8 = zzgwh.zza;
                    if (i8 == i6) {
                        i7 = i8;
                        i2 = zzj2;
                        break;
                    }
                    i7 = i8;
                    i2 = zzi(i8, bArr, zzj2, i3, zzf, zzgwh);
                }
                if (i2 > i3 || i7 != i6) {
                    throw zzgyp.zzg();
                }
                zzhay.zzj(i, zzf);
                return i2;
            } else if (i4 == 5) {
                zzhay.zzj(i, Integer.valueOf(zzb(bArr, i2)));
                return i2 + 4;
            } else {
                throw zzgyp.zzc();
            }
        } else {
            throw zzgyp.zzc();
        }
    }

    static int zzj(byte[] bArr, int i, zzgwh zzgwh) {
        int i2 = i + 1;
        byte b2 = bArr[i];
        if (b2 < 0) {
            return zzk(b2, bArr, i2, zzgwh);
        }
        zzgwh.zza = b2;
        return i2;
    }

    static int zzk(int i, byte[] bArr, int i2, zzgwh zzgwh) {
        int i3 = i & 127;
        int i4 = i2 + 1;
        byte b2 = bArr[i2];
        if (b2 >= 0) {
            zzgwh.zza = i3 | (b2 << 7);
            return i4;
        }
        int i5 = i3 | ((b2 & Ascii.DEL) << 7);
        int i6 = i4 + 1;
        byte b3 = bArr[i4];
        if (b3 >= 0) {
            zzgwh.zza = i5 | (b3 << Ascii.SO);
            return i6;
        }
        int i7 = i5 | ((b3 & Ascii.DEL) << Ascii.SO);
        int i8 = i6 + 1;
        byte b4 = bArr[i6];
        if (b4 >= 0) {
            zzgwh.zza = i7 | (b4 << Ascii.NAK);
            return i8;
        }
        int i9 = i7 | ((b4 & Ascii.DEL) << Ascii.NAK);
        int i10 = i8 + 1;
        byte b5 = bArr[i8];
        if (b5 >= 0) {
            zzgwh.zza = i9 | (b5 << Ascii.FS);
            return i10;
        }
        int i11 = i9 | ((b5 & Ascii.DEL) << Ascii.FS);
        while (true) {
            int i12 = i10 + 1;
            if (bArr[i10] < 0) {
                i10 = i12;
            } else {
                zzgwh.zza = i11;
                return i12;
            }
        }
    }

    static int zzl(int i, byte[] bArr, int i2, int i3, zzgym zzgym, zzgwh zzgwh) {
        zzgye zzgye = (zzgye) zzgym;
        int zzj = zzj(bArr, i2, zzgwh);
        zzgye.zzh(zzgwh.zza);
        while (zzj < i3) {
            int zzj2 = zzj(bArr, zzj, zzgwh);
            if (i != zzgwh.zza) {
                break;
            }
            zzj = zzj(bArr, zzj2, zzgwh);
            zzgye.zzh(zzgwh.zza);
        }
        return zzj;
    }

    static int zzm(byte[] bArr, int i, zzgwh zzgwh) {
        int i2 = i + 1;
        long j = (long) bArr[i];
        if (j >= 0) {
            zzgwh.zzb = j;
            return i2;
        }
        int i3 = i2 + 1;
        byte b2 = bArr[i2];
        long j2 = (j & 127) | (((long) (b2 & Ascii.DEL)) << 7);
        int i4 = 7;
        while (b2 < 0) {
            int i5 = i3 + 1;
            byte b3 = bArr[i3];
            i4 += 7;
            j2 |= ((long) (b3 & Ascii.DEL)) << i4;
            int i6 = i5;
            b2 = b3;
            i3 = i6;
        }
        zzgwh.zzb = j2;
        return i3;
    }

    static int zzn(Object obj, zzhag zzhag, byte[] bArr, int i, int i2, int i3, zzgwh zzgwh) throws IOException {
        int zzc = ((zzgzq) zzhag).zzc(obj, bArr, i, i2, i3, zzgwh);
        zzgwh.zzc = obj;
        return zzc;
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v2, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r3v0, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v5, resolved type: byte} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r9v6, resolved type: byte} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    static int zzo(java.lang.Object r6, com.google.android.gms.internal.ads.zzhag r7, byte[] r8, int r9, int r10, com.google.android.gms.internal.ads.zzgwh r11) throws java.io.IOException {
        /*
            int r0 = r9 + 1
            byte r9 = r8[r9]
            if (r9 >= 0) goto L_0x000c
            int r0 = zzk(r9, r8, r0, r11)
            int r9 = r11.zza
        L_0x000c:
            r3 = r0
            if (r9 < 0) goto L_0x001e
            int r10 = r10 - r3
            if (r9 > r10) goto L_0x001e
            int r9 = r9 + r3
            r0 = r7
            r1 = r6
            r2 = r8
            r4 = r9
            r5 = r11
            r0.zzi(r1, r2, r3, r4, r5)
            r11.zzc = r6
            return r9
        L_0x001e:
            com.google.android.gms.internal.ads.zzgyp r6 = com.google.android.gms.internal.ads.zzgyp.zzj()
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzgwi.zzo(java.lang.Object, com.google.android.gms.internal.ads.zzhag, byte[], int, int, com.google.android.gms.internal.ads.zzgwh):int");
    }

    static long zzp(byte[] bArr, int i) {
        return ((((long) bArr[i + 7]) & 255) << 56) | (((long) bArr[i]) & 255) | ((((long) bArr[i + 1]) & 255) << 8) | ((((long) bArr[i + 2]) & 255) << 16) | ((((long) bArr[i + 3]) & 255) << 24) | ((((long) bArr[i + 4]) & 255) << 32) | ((((long) bArr[i + 5]) & 255) << 40) | ((((long) bArr[i + 6]) & 255) << 48);
    }
}
