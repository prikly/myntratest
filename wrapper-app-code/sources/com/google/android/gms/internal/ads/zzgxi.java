package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.io.OutputStream;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxi extends zzgxf {
    private final OutputStream zzf;

    zzgxi(OutputStream outputStream, int i) {
        super(i);
        this.zzf = outputStream;
    }

    private final void zzL() throws IOException {
        this.zzf.write(this.zza, 0, this.zzc);
        this.zzc = 0;
    }

    private final void zzM(int i) throws IOException {
        if (this.zzb - this.zzc < i) {
            zzL();
        }
    }

    public final void zzN() throws IOException {
        if (this.zzc > 0) {
            zzL();
        }
    }

    public final void zzO(byte b2) throws IOException {
        if (this.zzc == this.zzb) {
            zzL();
        }
        zzc(b2);
    }

    public final void zzP(int i, boolean z) throws IOException {
        zzM(11);
        zzf(i << 3);
        zzc(z ? (byte) 1 : 0);
    }

    public final void zzQ(int i, zzgwv zzgwv) throws IOException {
        zzs((i << 3) | 2);
        zzs(zzgwv.zzd());
        zzgwv.zzo(this);
    }

    public final void zza(byte[] bArr, int i, int i2) throws IOException {
        zzp(bArr, i, i2);
    }

    public final void zzh(int i, int i2) throws IOException {
        zzM(14);
        zzf((i << 3) | 5);
        zzd(i2);
    }

    public final void zzi(int i) throws IOException {
        zzM(4);
        zzd(i);
    }

    public final void zzj(int i, long j) throws IOException {
        zzM(18);
        zzf((i << 3) | 1);
        zze(j);
    }

    public final void zzk(long j) throws IOException {
        zzM(8);
        zze(j);
    }

    public final void zzl(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        if (i2 >= 0) {
            zzf(i2);
        } else {
            zzg((long) i2);
        }
    }

    public final void zzm(int i) throws IOException {
        if (i >= 0) {
            zzs(i);
        } else {
            zzu((long) i);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzn(int i, zzgzn zzgzn, zzhag zzhag) throws IOException {
        zzs((i << 3) | 2);
        zzs(((zzgwe) zzgzn).zzas(zzhag));
        zzhag.zzn(zzgzn, this.zze);
    }

    public final void zzo(int i, String str) throws IOException {
        zzs((i << 3) | 2);
        zzv(str);
    }

    public final void zzp(byte[] bArr, int i, int i2) throws IOException {
        int i3 = this.zzb;
        int i4 = this.zzc;
        int i5 = i3 - i4;
        if (i5 >= i2) {
            System.arraycopy(bArr, i, this.zza, i4, i2);
            this.zzc += i2;
            this.zzd += i2;
            return;
        }
        System.arraycopy(bArr, i, this.zza, i4, i5);
        int i6 = i + i5;
        int i7 = i2 - i5;
        this.zzc = this.zzb;
        this.zzd += i5;
        zzL();
        if (i7 <= this.zzb) {
            System.arraycopy(bArr, i6, this.zza, 0, i7);
            this.zzc = i7;
        } else {
            this.zzf.write(bArr, i6, i7);
        }
        this.zzd += i7;
    }

    public final void zzq(int i, int i2) throws IOException {
        zzs((i << 3) | i2);
    }

    public final void zzr(int i, int i2) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzf(i2);
    }

    public final void zzs(int i) throws IOException {
        zzM(5);
        zzf(i);
    }

    public final void zzt(int i, long j) throws IOException {
        zzM(20);
        zzf(i << 3);
        zzg(j);
    }

    public final void zzu(long j) throws IOException {
        zzM(10);
        zzg(j);
    }

    public final void zzv(String str) throws IOException {
        int i;
        int i2;
        try {
            int length = str.length() * 3;
            int zzE = zzE(length);
            int i3 = zzE + length;
            int i4 = this.zzb;
            if (i3 > i4) {
                byte[] bArr = new byte[length];
                int zzd = zzhbm.zzd(str, bArr, 0, length);
                zzs(zzd);
                zzp(bArr, 0, zzd);
                return;
            }
            if (i3 > i4 - this.zzc) {
                zzL();
            }
            int zzE2 = zzE(str.length());
            i = this.zzc;
            if (zzE2 == zzE) {
                int i5 = i + zzE2;
                this.zzc = i5;
                int zzd2 = zzhbm.zzd(str, this.zza, i5, this.zzb - i5);
                this.zzc = i;
                i2 = (zzd2 - i) - zzE2;
                zzf(i2);
                this.zzc = zzd2;
            } else {
                i2 = zzhbm.zze(str);
                zzf(i2);
                this.zzc = zzhbm.zzd(str, this.zza, this.zzc, i2);
            }
            this.zzd += i2;
        } catch (zzhbl e2) {
            this.zzd -= this.zzc - i;
            this.zzc = i;
            throw e2;
        } catch (ArrayIndexOutOfBoundsException e3) {
            throw new zzgxh(e3);
        } catch (zzhbl e4) {
            zzJ(str, e4);
        }
    }
}
