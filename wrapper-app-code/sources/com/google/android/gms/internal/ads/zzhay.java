package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.io.IOException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhay {
    private static final zzhay zza = new zzhay(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzhay() {
        this(0, new int[8], new Object[8], true);
    }

    private zzhay(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzhay zzc() {
        return zza;
    }

    static zzhay zze(zzhay zzhay, zzhay zzhay2) {
        int i = zzhay.zzb + zzhay2.zzb;
        int[] copyOf = Arrays.copyOf(zzhay.zzc, i);
        System.arraycopy(zzhay2.zzc, 0, copyOf, zzhay.zzb, zzhay2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzhay.zzd, i);
        System.arraycopy(zzhay2.zzd, 0, copyOf2, zzhay.zzb, zzhay2.zzb);
        return new zzhay(i, copyOf, copyOf2, true);
    }

    static zzhay zzf() {
        return new zzhay(0, new int[8], new Object[8], true);
    }

    private final void zzl(int i) {
        int[] iArr = this.zzc;
        if (i > iArr.length) {
            int i2 = this.zzb;
            int i3 = i2 + (i2 / 2);
            if (i3 >= i) {
                i = i3;
            }
            if (i < 8) {
                i = 8;
            }
            this.zzc = Arrays.copyOf(iArr, i);
            this.zzd = Arrays.copyOf(this.zzd, i);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzhay)) {
            return false;
        }
        zzhay zzhay = (zzhay) obj;
        int i = this.zzb;
        if (i == zzhay.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzhay.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzhay.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int i;
        int i2;
        int i3;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.zzd[i6]).longValue();
                    i = zzgxk.zzE(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzE = zzgxk.zzE(i8 << 3);
                    int zzd2 = ((zzgwv) this.zzd[i6]).zzd();
                    i5 += zzE + zzgxk.zzE(zzd2) + zzd2;
                } else if (i9 == 3) {
                    int zzD = zzgxk.zzD(i8);
                    i3 = zzD + zzD;
                    i2 = ((zzhay) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).intValue();
                    i = zzgxk.zzE(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzgyp.zza());
                }
                i5 += i;
            } else {
                long longValue = ((Long) this.zzd[i6]).longValue();
                i3 = zzgxk.zzE(i8 << 3);
                i2 = zzgxk.zzF(longValue);
            }
            i = i3 + i2;
            i5 += i;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int zzE = zzgxk.zzE(8);
            int zzd2 = ((zzgwv) this.zzd[i3]).zzd();
            i2 += zzE + zzE + zzgxk.zzE(16) + zzgxk.zzE(i4 >>> 3) + zzgxk.zzE(24) + zzgxk.zzE(zzd2) + zzd2;
        }
        this.zze = i2;
        return i2;
    }

    /* access modifiers changed from: package-private */
    public final zzhay zzd(zzhay zzhay) {
        if (zzhay.equals(zza)) {
            return this;
        }
        zzg();
        int i = this.zzb + zzhay.zzb;
        zzl(i);
        System.arraycopy(zzhay.zzc, 0, this.zzc, this.zzb, zzhay.zzb);
        System.arraycopy(zzhay.zzd, 0, this.zzd, this.zzb, zzhay.zzb);
        this.zzb = i;
        return this;
    }

    /* access modifiers changed from: package-private */
    public final void zzg() {
        if (!this.zzf) {
            throw new UnsupportedOperationException();
        }
    }

    public final void zzh() {
        this.zzf = false;
    }

    /* access modifiers changed from: package-private */
    public final void zzi(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzgzp.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    /* access modifiers changed from: package-private */
    public final void zzj(int i, Object obj) {
        zzg();
        zzl(this.zzb + 1);
        int[] iArr = this.zzc;
        int i2 = this.zzb;
        iArr[i2] = i;
        this.zzd[i2] = obj;
        this.zzb = i2 + 1;
    }

    public final void zzk(zzgxl zzgxl) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzgxl.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzgxl.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzgxl.zzd(i3, (zzgwv) obj);
                } else if (i4 == 3) {
                    zzgxl.zzE(i3);
                    ((zzhay) obj).zzk(zzgxl);
                    zzgxl.zzh(i3);
                } else if (i4 == 5) {
                    zzgxl.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzgyp.zza());
                }
            }
        }
    }
}
