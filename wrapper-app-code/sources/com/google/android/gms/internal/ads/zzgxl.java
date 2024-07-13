package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxl {
    private final zzgxk zza;

    private zzgxl(zzgxk zzgxk) {
        zzgyn.zzf(zzgxk, "output");
        this.zza = zzgxk;
        zzgxk.zze = this;
    }

    public static zzgxl zza(zzgxk zzgxk) {
        zzgxl zzgxl = zzgxk.zze;
        return zzgxl != null ? zzgxl : new zzgxl(zzgxk);
    }

    public final void zzA(int i, int i2) throws IOException {
        this.zza.zzr(i, (i2 >> 31) ^ (i2 + i2));
    }

    public final void zzC(int i, long j) throws IOException {
        this.zza.zzt(i, (j >> 63) ^ (j + j));
    }

    @Deprecated
    public final void zzE(int i) throws IOException {
        this.zza.zzq(i, 3);
    }

    public final void zzF(int i, String str) throws IOException {
        this.zza.zzo(i, str);
    }

    public final void zzG(int i, List list) throws IOException {
        int i2 = 0;
        if (list instanceof zzgyv) {
            zzgyv zzgyv = (zzgyv) list;
            while (i2 < list.size()) {
                Object zzf = zzgyv.zzf(i2);
                if (zzf instanceof String) {
                    this.zza.zzo(i, (String) zzf);
                } else {
                    this.zza.zzQ(i, (zzgwv) zzf);
                }
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzo(i, (String) list.get(i2));
            i2++;
        }
    }

    public final void zzH(int i, int i2) throws IOException {
        this.zza.zzr(i, i2);
    }

    public final void zzJ(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzb(int i, boolean z) throws IOException {
        this.zza.zzP(i, z);
    }

    public final void zzd(int i, zzgwv zzgwv) throws IOException {
        this.zza.zzQ(i, zzgwv);
    }

    public final void zze(int i, List list) throws IOException {
        for (int i2 = 0; i2 < list.size(); i2++) {
            this.zza.zzQ(i, (zzgwv) list.get(i2));
        }
    }

    public final void zzf(int i, double d2) throws IOException {
        this.zza.zzj(i, Double.doubleToRawLongBits(d2));
    }

    @Deprecated
    public final void zzh(int i) throws IOException {
        this.zza.zzq(i, 4);
    }

    public final void zzi(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzk(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzm(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzo(int i, float f2) throws IOException {
        this.zza.zzh(i, Float.floatToRawIntBits(f2));
    }

    public final void zzq(int i, Object obj, zzhag zzhag) throws IOException {
        zzgxk zzgxk = this.zza;
        zzgxk.zzq(i, 3);
        zzhag.zzn((zzgzn) obj, zzgxk.zze);
        zzgxk.zzq(i, 4);
    }

    public final void zzr(int i, int i2) throws IOException {
        this.zza.zzl(i, i2);
    }

    public final void zzt(int i, long j) throws IOException {
        this.zza.zzt(i, j);
    }

    public final void zzv(int i, Object obj, zzhag zzhag) throws IOException {
        this.zza.zzn(i, (zzgzn) obj, zzhag);
    }

    public final void zzw(int i, int i2) throws IOException {
        this.zza.zzh(i, i2);
    }

    public final void zzy(int i, long j) throws IOException {
        this.zza.zzj(i, j);
    }

    public final void zzB(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                int intValue = ((Integer) list.get(i4)).intValue();
                i3 += zzgxk.zzE((intValue >> 31) ^ (intValue + intValue));
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                zzgxk zzgxk = this.zza;
                int intValue2 = ((Integer) list.get(i2)).intValue();
                zzgxk.zzs((intValue2 >> 31) ^ (intValue2 + intValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzgxk zzgxk2 = this.zza;
            int intValue3 = ((Integer) list.get(i2)).intValue();
            zzgxk2.zzr(i, (intValue3 >> 31) ^ (intValue3 + intValue3));
            i2++;
        }
    }

    public final void zzD(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                long longValue = ((Long) list.get(i4)).longValue();
                i3 += zzgxk.zzF((longValue >> 63) ^ (longValue + longValue));
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                zzgxk zzgxk = this.zza;
                long longValue2 = ((Long) list.get(i2)).longValue();
                zzgxk.zzu((longValue2 >> 63) ^ (longValue2 + longValue2));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            zzgxk zzgxk2 = this.zza;
            long longValue3 = ((Long) list.get(i2)).longValue();
            zzgxk2.zzt(i, (longValue3 >> 63) ^ (longValue3 + longValue3));
            i2++;
        }
    }

    public final void zzI(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxk.zzE(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzs(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzr(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzK(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxk.zzF(((Long) list.get(i4)).longValue());
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzt(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzc(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Boolean) list.get(i4)).booleanValue();
                i3++;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzO(((Boolean) list.get(i2)).booleanValue() ? (byte) 1 : 0);
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzP(i, ((Boolean) list.get(i2)).booleanValue());
            i2++;
        }
    }

    public final void zzj(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxk.zzy(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzl(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzn(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzs(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxk.zzy(((Integer) list.get(i4)).intValue());
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzm(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzl(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzu(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                i3 += zzgxk.zzF(((Long) list.get(i4)).longValue());
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzu(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzt(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzx(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Integer) list.get(i4)).intValue();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzi(((Integer) list.get(i2)).intValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, ((Integer) list.get(i2)).intValue());
            i2++;
        }
    }

    public final void zzz(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Long) list.get(i4)).longValue();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzk(((Long) list.get(i2)).longValue());
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, ((Long) list.get(i2)).longValue());
            i2++;
        }
    }

    public final void zzg(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Double) list.get(i4)).doubleValue();
                i3 += 8;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzk(Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzj(i, Double.doubleToRawLongBits(((Double) list.get(i2)).doubleValue()));
            i2++;
        }
    }

    public final void zzp(int i, List list, boolean z) throws IOException {
        int i2 = 0;
        if (z) {
            this.zza.zzq(i, 2);
            int i3 = 0;
            for (int i4 = 0; i4 < list.size(); i4++) {
                ((Float) list.get(i4)).floatValue();
                i3 += 4;
            }
            this.zza.zzs(i3);
            while (i2 < list.size()) {
                this.zza.zzi(Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
                i2++;
            }
            return;
        }
        while (i2 < list.size()) {
            this.zza.zzh(i, Float.floatToRawIntBits(((Float) list.get(i2)).floatValue()));
            i2++;
        }
    }
}
