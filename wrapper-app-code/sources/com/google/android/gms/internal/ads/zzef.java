package com.google.android.gms.internal.ads;

import com.applovin.exoplayer2.common.base.Ascii;
import java.nio.charset.Charset;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzef {
    private byte[] zza;
    private int zzb;
    private int zzc;

    public zzef() {
        this.zza = zzen.zzf;
    }

    public zzef(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzc = i;
    }

    public final void zzA(zzee zzee, int i) {
        zzB(zzee.zza, 0, i);
        zzee.zzh(0);
    }

    public final void zzB(byte[] bArr, int i, int i2) {
        System.arraycopy(this.zza, this.zzb, bArr, i, i2);
        this.zzb += i2;
    }

    public final void zzC(int i) {
        byte[] bArr = this.zza;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        zzD(bArr, i);
    }

    public final void zzD(byte[] bArr, int i) {
        this.zza = bArr;
        this.zzc = i;
        this.zzb = 0;
    }

    public final void zzE(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zza.length) {
            z = true;
        }
        zzdd.zzd(z);
        this.zzc = i;
    }

    public final void zzF(int i) {
        boolean z = false;
        if (i >= 0 && i <= this.zzc) {
            z = true;
        }
        zzdd.zzd(z);
        this.zzb = i;
    }

    public final void zzG(int i) {
        zzF(this.zzb + i);
    }

    public final byte[] zzH() {
        return this.zza;
    }

    public final int zza() {
        return this.zzc - this.zzb;
    }

    public final int zzb() {
        return this.zza.length;
    }

    public final int zzc() {
        return this.zzb;
    }

    public final int zzd() {
        return this.zzc;
    }

    public final int zze() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        this.zzb = i4 + 1;
        return (bArr[i4] & 255) | ((b2 & 255) << Ascii.CAN) | ((b3 & 255) << Ascii.DLE) | ((b4 & 255) << 8);
    }

    public final int zzf() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | (((b2 & 255) << Ascii.CAN) >> 8) | ((b3 & 255) << 8);
    }

    public final int zzg() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        this.zzb = i4 + 1;
        return ((bArr[i4] & 255) << Ascii.CAN) | (b2 & 255) | ((b3 & 255) << 8) | ((b4 & 255) << Ascii.DLE);
    }

    public final int zzh() {
        int zzg = zzg();
        if (zzg >= 0) {
            return zzg;
        }
        throw new IllegalStateException("Top bit not zero: " + zzg);
    }

    public final int zzi() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        this.zzb = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (b2 & 255);
    }

    public final int zzj() {
        return (zzk() << 21) | (zzk() << 14) | (zzk() << 7) | zzk();
    }

    public final int zzk() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        this.zzb = i + 1;
        return bArr[i] & 255;
    }

    public final int zzl() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        this.zzb = i3 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public final int zzm() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        this.zzb = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << Ascii.DLE) | ((b3 & 255) << 8);
    }

    public final int zzn() {
        int zze = zze();
        if (zze >= 0) {
            return zze;
        }
        throw new IllegalStateException("Top bit not zero: " + zze);
    }

    public final int zzo() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        this.zzb = i2 + 1;
        return (bArr[i2] & 255) | ((b2 & 255) << 8);
    }

    public final long zzp() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b5 = bArr[i4];
        int i6 = i5 + 1;
        this.zzb = i6;
        byte b6 = bArr[i5];
        int i7 = i6 + 1;
        this.zzb = i7;
        byte b7 = bArr[i6];
        int i8 = i7 + 1;
        this.zzb = i8;
        byte b8 = bArr[i7];
        this.zzb = i8 + 1;
        return ((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) b5) & 255) << 24) | ((((long) b6) & 255) << 32) | ((((long) b7) & 255) << 40) | ((((long) b8) & 255) << 48) | ((((long) bArr[i8]) & 255) << 56);
    }

    public final long zzq() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        this.zzb = i4 + 1;
        return ((((long) b3) & 255) << 8) | (((long) b2) & 255) | ((((long) b4) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    public final long zzr() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        int i5 = i4 + 1;
        this.zzb = i5;
        byte b5 = bArr[i4];
        int i6 = i5 + 1;
        this.zzb = i6;
        byte b6 = bArr[i5];
        int i7 = i6 + 1;
        this.zzb = i7;
        byte b7 = bArr[i6];
        int i8 = i7 + 1;
        this.zzb = i8;
        byte b8 = bArr[i7];
        this.zzb = i8 + 1;
        return ((((long) b3) & 255) << 48) | ((((long) b2) & 255) << 56) | ((((long) b4) & 255) << 40) | ((((long) b5) & 255) << 32) | ((((long) b6) & 255) << 24) | ((((long) b7) & 255) << 16) | ((((long) b8) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    public final long zzs() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        int i3 = i2 + 1;
        this.zzb = i3;
        byte b3 = bArr[i2];
        int i4 = i3 + 1;
        this.zzb = i4;
        byte b4 = bArr[i3];
        this.zzb = i4 + 1;
        return ((((long) b3) & 255) << 16) | ((((long) b2) & 255) << 24) | ((((long) b4) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    public final long zzt() {
        long zzr = zzr();
        if (zzr >= 0) {
            return zzr;
        }
        throw new IllegalStateException("Top bit not zero: " + zzr);
    }

    public final long zzu() {
        int i;
        int i2;
        long j = (long) this.zza[this.zzb];
        int i3 = 7;
        while (true) {
            i = 0;
            i2 = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i = 7 - i3;
            } else if (i3 == 7) {
                i = 1;
            }
        }
        if (i != 0) {
            while (i2 < i) {
                byte b2 = this.zza[this.zzb + i2];
                if ((b2 & 192) == 128) {
                    j = (j << 6) | ((long) (b2 & 63));
                    i2++;
                } else {
                    throw new NumberFormatException("Invalid UTF-8 sequence continuation byte: " + j);
                }
            }
            this.zzb += i;
            return j;
        }
        throw new NumberFormatException("Invalid UTF-8 sequence first byte: " + j);
    }

    public final String zzv(char c2) {
        int i = this.zzc;
        int i2 = this.zzb;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.zzc && this.zza[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.zza;
        int i3 = this.zzb;
        String zzJ = zzen.zzJ(bArr, i3, i2 - i3);
        this.zzb = i2;
        if (i2 < this.zzc) {
            this.zzb = i2 + 1;
        }
        return zzJ;
    }

    public final String zzw(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.zzb;
        int i3 = (i2 + i) - 1;
        String zzJ = zzen.zzJ(this.zza, i2, (i3 >= this.zzc || this.zza[i3] != 0) ? i : i - 1);
        this.zzb += i;
        return zzJ;
    }

    public final String zzx(int i, Charset charset) {
        byte[] bArr = this.zza;
        int i2 = this.zzb;
        String str = new String(bArr, i2, i, charset);
        this.zzb = i2 + i;
        return str;
    }

    public final short zzy() {
        byte[] bArr = this.zza;
        int i = this.zzb;
        int i2 = i + 1;
        this.zzb = i2;
        byte b2 = bArr[i];
        this.zzb = i2 + 1;
        return (short) ((bArr[i2] & 255) | ((b2 & 255) << 8));
    }

    public final void zzz(int i) {
        byte[] bArr = this.zza;
        if (i > bArr.length) {
            this.zza = Arrays.copyOf(bArr, i);
        }
    }

    public zzef(int i) {
        this.zza = new byte[i];
        this.zzc = i;
    }

    public zzef(byte[] bArr) {
        this.zza = bArr;
        this.zzc = bArr.length;
    }
}
