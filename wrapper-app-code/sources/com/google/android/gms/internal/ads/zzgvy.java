package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.security.InvalidKeyException;
import java.security.MessageDigest;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgvy {
    public static byte[] zza(byte[] bArr, byte[] bArr2) throws InvalidKeyException {
        byte[] bArr3 = bArr;
        byte[] bArr4 = bArr2;
        if (bArr3.length == 32) {
            long[] jArr = new long[11];
            byte[] copyOf = Arrays.copyOf(bArr3, 32);
            copyOf[0] = (byte) (copyOf[0] & 248);
            byte b2 = copyOf[31] & Ascii.DEL;
            copyOf[31] = (byte) b2;
            copyOf[31] = (byte) (b2 | 64);
            int i = zzguv.zzb;
            if (bArr4.length == 32) {
                byte[] copyOf2 = Arrays.copyOf(bArr4, 32);
                copyOf2[31] = (byte) (copyOf2[31] & Ascii.DEL);
                int i2 = 0;
                while (i2 < 7) {
                    if (!MessageDigest.isEqual(zzguv.zza[i2], copyOf2)) {
                        i2++;
                    } else {
                        throw new InvalidKeyException("Banned public key: ".concat(zzgvo.zza(zzguv.zza[i2])));
                    }
                }
                long[] zzk = zzgvn.zzk(copyOf2);
                long[] jArr2 = new long[19];
                long[] jArr3 = new long[19];
                jArr3[0] = 1;
                long[] jArr4 = new long[19];
                jArr4[0] = 1;
                long[] jArr5 = new long[19];
                long[] jArr6 = new long[19];
                long[] jArr7 = new long[19];
                jArr7[0] = 1;
                long[] jArr8 = new long[19];
                long[] jArr9 = new long[19];
                jArr9[0] = 1;
                System.arraycopy(zzk, 0, jArr2, 0, 10);
                int i3 = 0;
                for (int i4 = 32; i3 < i4; i4 = 32) {
                    byte b3 = copyOf[(32 - i3) - 1] & 255;
                    int i5 = 0;
                    while (i5 < 8) {
                        int i6 = (b3 >> (7 - i5)) & 1;
                        zzguv.zza(jArr4, jArr2, i6);
                        zzguv.zza(jArr5, jArr3, i6);
                        byte[] bArr5 = copyOf;
                        long[] copyOf3 = Arrays.copyOf(jArr4, 10);
                        byte b4 = b3;
                        long[] jArr10 = jArr;
                        long[] jArr11 = new long[19];
                        int i7 = i3;
                        long[] jArr12 = new long[19];
                        int i8 = i5;
                        long[] jArr13 = new long[19];
                        int i9 = i6;
                        long[] jArr14 = new long[19];
                        long[] jArr15 = jArr9;
                        long[] jArr16 = new long[19];
                        long[] jArr17 = new long[19];
                        zzgvn.zzi(jArr4, jArr4, jArr5);
                        zzgvn.zzh(jArr5, copyOf3, jArr5);
                        long[] copyOf4 = Arrays.copyOf(jArr2, 10);
                        zzgvn.zzi(jArr2, jArr2, jArr3);
                        zzgvn.zzh(jArr3, copyOf4, jArr3);
                        zzgvn.zzb(jArr13, jArr2, jArr5);
                        zzgvn.zzb(jArr14, jArr4, jArr3);
                        zzgvn.zze(jArr13);
                        zzgvn.zzd(jArr13);
                        zzgvn.zze(jArr14);
                        zzgvn.zzd(jArr14);
                        long[] jArr18 = jArr2;
                        System.arraycopy(jArr13, 0, copyOf4, 0, 10);
                        zzgvn.zzi(jArr13, jArr13, jArr14);
                        zzgvn.zzh(jArr14, copyOf4, jArr14);
                        zzgvn.zzg(jArr17, jArr13);
                        zzgvn.zzg(jArr16, jArr14);
                        zzgvn.zzb(jArr14, jArr16, zzk);
                        zzgvn.zze(jArr14);
                        zzgvn.zzd(jArr14);
                        System.arraycopy(jArr17, 0, jArr6, 0, 10);
                        System.arraycopy(jArr14, 0, jArr7, 0, 10);
                        zzgvn.zzg(jArr11, jArr4);
                        zzgvn.zzg(jArr12, jArr5);
                        zzgvn.zzb(jArr8, jArr11, jArr12);
                        zzgvn.zze(jArr8);
                        zzgvn.zzd(jArr8);
                        zzgvn.zzh(jArr12, jArr11, jArr12);
                        long[] jArr19 = new long[19];
                        Arrays.fill(jArr19, 10, 18, 0);
                        zzgvn.zzf(jArr19, jArr12, 121665);
                        zzgvn.zzd(jArr19);
                        zzgvn.zzi(jArr19, jArr19, jArr11);
                        long[] jArr20 = jArr15;
                        zzgvn.zzb(jArr20, jArr12, jArr19);
                        zzgvn.zze(jArr20);
                        zzgvn.zzd(jArr20);
                        int i10 = i9;
                        zzguv.zza(jArr8, jArr6, i10);
                        zzguv.zza(jArr20, jArr7, i10);
                        i5 = i8 + 1;
                        byte[] bArr6 = bArr2;
                        jArr9 = jArr5;
                        jArr2 = jArr6;
                        b3 = b4;
                        jArr = jArr10;
                        i3 = i7;
                        jArr6 = jArr18;
                        jArr5 = jArr20;
                        copyOf = bArr5;
                        long[] jArr21 = jArr4;
                        jArr4 = jArr8;
                        jArr8 = jArr21;
                        long[] jArr22 = jArr7;
                        jArr7 = jArr3;
                        jArr3 = jArr22;
                    }
                    byte[] bArr7 = copyOf;
                    long[] jArr23 = jArr9;
                    long[] jArr24 = jArr;
                    long[] jArr25 = jArr2;
                    i3++;
                    byte[] bArr8 = bArr2;
                    copyOf = bArr7;
                }
                long[] jArr26 = jArr;
                long[] jArr27 = new long[10];
                long[] jArr28 = new long[10];
                long[] jArr29 = new long[10];
                long[] jArr30 = new long[10];
                long[] jArr31 = new long[10];
                long[] jArr32 = new long[10];
                long[] jArr33 = new long[10];
                long[] jArr34 = new long[10];
                long[] jArr35 = new long[10];
                long[] jArr36 = new long[10];
                long[] jArr37 = jArr2;
                long[] jArr38 = new long[10];
                zzgvn.zzg(jArr28, jArr5);
                zzgvn.zzg(jArr38, jArr28);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zza(jArr29, jArr36, jArr5);
                zzgvn.zza(jArr30, jArr29, jArr28);
                zzgvn.zzg(jArr36, jArr30);
                zzgvn.zza(jArr31, jArr36, jArr29);
                zzgvn.zzg(jArr36, jArr31);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zza(jArr32, jArr36, jArr31);
                zzgvn.zzg(jArr36, jArr32);
                zzgvn.zzg(jArr38, jArr36);
                for (int i11 = 2; i11 < 10; i11 += 2) {
                    zzgvn.zzg(jArr36, jArr38);
                    zzgvn.zzg(jArr38, jArr36);
                }
                zzgvn.zza(jArr33, jArr38, jArr32);
                zzgvn.zzg(jArr36, jArr33);
                zzgvn.zzg(jArr38, jArr36);
                for (int i12 = 2; i12 < 20; i12 += 2) {
                    zzgvn.zzg(jArr36, jArr38);
                    zzgvn.zzg(jArr38, jArr36);
                }
                zzgvn.zza(jArr36, jArr38, jArr33);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zzg(jArr36, jArr38);
                for (int i13 = 2; i13 < 10; i13 += 2) {
                    zzgvn.zzg(jArr38, jArr36);
                    zzgvn.zzg(jArr36, jArr38);
                }
                zzgvn.zza(jArr34, jArr36, jArr32);
                zzgvn.zzg(jArr36, jArr34);
                zzgvn.zzg(jArr38, jArr36);
                for (int i14 = 2; i14 < 50; i14 += 2) {
                    zzgvn.zzg(jArr36, jArr38);
                    zzgvn.zzg(jArr38, jArr36);
                }
                zzgvn.zza(jArr35, jArr38, jArr34);
                zzgvn.zzg(jArr38, jArr35);
                zzgvn.zzg(jArr36, jArr38);
                for (int i15 = 2; i15 < 100; i15 += 2) {
                    zzgvn.zzg(jArr38, jArr36);
                    zzgvn.zzg(jArr36, jArr38);
                }
                zzgvn.zza(jArr38, jArr36, jArr35);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zzg(jArr38, jArr36);
                for (int i16 = 2; i16 < 50; i16 += 2) {
                    zzgvn.zzg(jArr36, jArr38);
                    zzgvn.zzg(jArr38, jArr36);
                }
                zzgvn.zza(jArr36, jArr38, jArr34);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zzg(jArr36, jArr38);
                zzgvn.zzg(jArr38, jArr36);
                zzgvn.zza(jArr27, jArr38, jArr30);
                long[] jArr39 = jArr26;
                zzgvn.zza(jArr39, jArr4, jArr27);
                long[] jArr40 = new long[10];
                long[] jArr41 = new long[10];
                long[] jArr42 = new long[11];
                long[] jArr43 = new long[11];
                long[] jArr44 = new long[11];
                zzgvn.zza(jArr40, zzk, jArr39);
                zzgvn.zzi(jArr41, zzk, jArr39);
                long[] jArr45 = new long[10];
                jArr45[0] = 486662;
                zzgvn.zzi(jArr43, jArr41, jArr45);
                zzgvn.zza(jArr43, jArr43, jArr3);
                long[] jArr46 = jArr37;
                zzgvn.zzi(jArr43, jArr43, jArr46);
                zzgvn.zza(jArr43, jArr43, jArr40);
                zzgvn.zza(jArr43, jArr43, jArr46);
                zzgvn.zzf(jArr42, jArr43, 4);
                zzgvn.zzd(jArr42);
                zzgvn.zza(jArr43, jArr40, jArr3);
                zzgvn.zzh(jArr43, jArr43, jArr3);
                zzgvn.zza(jArr44, jArr41, jArr46);
                zzgvn.zzi(jArr43, jArr43, jArr44);
                zzgvn.zzg(jArr43, jArr43);
                if (MessageDigest.isEqual(zzgvn.zzj(jArr42), zzgvn.zzj(jArr43))) {
                    return zzgvn.zzj(jArr39);
                }
                throw new IllegalStateException("Arithmetic error in curve multiplication with the public key: ".concat(zzgvo.zza(bArr2)));
            }
            throw new InvalidKeyException("Public key length is not 32-byte");
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }

    public static byte[] zzb() {
        byte[] zza = zzgvv.zza(32);
        zza[0] = (byte) (zza[0] | 7);
        byte b2 = zza[31] & 63;
        zza[31] = (byte) b2;
        zza[31] = (byte) (b2 | 128);
        return zza;
    }

    public static byte[] zzc(byte[] bArr) throws InvalidKeyException {
        if (bArr.length == 32) {
            byte[] bArr2 = new byte[32];
            bArr2[0] = 9;
            return zza(bArr, bArr2);
        }
        throw new InvalidKeyException("Private key must have 32 bytes.");
    }
}
