package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzun extends zzup {
    private final zzwh zzd;
    private final zzgau zze;
    private final zzde zzf;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    protected zzun(zzcp zzcp, int[] iArr, int i, zzwh zzwh, long j, long j2, long j3, int i2, int i3, float f2, float f3, List list, zzde zzde) {
        super(zzcp, iArr, 0);
        zzcp zzcp2 = zzcp;
        int[] iArr2 = iArr;
        this.zzd = zzwh;
        this.zze = zzgau.zzm(list);
        this.zzf = zzde;
    }

    static /* bridge */ /* synthetic */ zzgau zzf(zzvs[] zzvsArr) {
        int i;
        int i2;
        double d2;
        ArrayList arrayList = new ArrayList();
        char c2 = 0;
        int i3 = 0;
        while (true) {
            i = 2;
            i2 = 1;
            if (i3 >= 2) {
                break;
            }
            zzvs zzvs = zzvsArr[i3];
            if (zzvs == null || zzvs.zzb.length <= 1) {
                arrayList.add((Object) null);
            } else {
                zzgar zzi = zzgau.zzi();
                zzi.zze(new zzul(0, 0));
                arrayList.add(zzi);
            }
            i3++;
        }
        long[][] jArr = new long[2][];
        for (int i4 = 0; i4 < 2; i4++) {
            zzvs zzvs2 = zzvsArr[i4];
            if (zzvs2 == null) {
                jArr[i4] = new long[0];
            } else {
                jArr[i4] = new long[zzvs2.zzb.length];
                int i5 = 0;
                while (true) {
                    int[] iArr = zzvs2.zzb;
                    if (i5 >= iArr.length) {
                        break;
                    }
                    long j = (long) zzvs2.zza.zzb(iArr[i5]).zzi;
                    long[] jArr2 = jArr[i4];
                    if (j == -1) {
                        j = 0;
                    }
                    jArr2[i5] = j;
                    i5++;
                }
                Arrays.sort(jArr[i4]);
            }
        }
        int[] iArr2 = new int[2];
        long[] jArr3 = new long[2];
        for (int i6 = 0; i6 < 2; i6++) {
            long[] jArr4 = jArr[i6];
            jArr3[i6] = jArr4.length == 0 ? 0 : jArr4[0];
        }
        zzg(arrayList, jArr3);
        zzgbf zza = zzgbx.zzc(zzgcc.zzc()).zzb(2).zza();
        int i7 = 0;
        while (i7 < i) {
            int length = jArr[i7].length;
            if (length > i2) {
                double[] dArr = new double[length];
                int i8 = 0;
                while (true) {
                    long[] jArr5 = jArr[i7];
                    double d3 = 0.0d;
                    if (i8 >= jArr5.length) {
                        break;
                    }
                    long j2 = jArr5[i8];
                    if (j2 != -1) {
                        d3 = Math.log((double) j2);
                    }
                    dArr[i8] = d3;
                    i8++;
                }
                int i9 = length - 1;
                double d4 = dArr[i9] - dArr[c2];
                int i10 = 0;
                while (i10 < i9) {
                    int i11 = i10 + 1;
                    double d5 = (dArr[i10] + dArr[i11]) * 0.5d;
                    if (d4 == 0.0d) {
                        d2 = 1.0d;
                    } else {
                        d2 = (d5 - dArr[c2]) / d4;
                    }
                    zza.zzs(Double.valueOf(d2), Integer.valueOf(i7));
                    i10 = i11;
                    c2 = 0;
                }
            }
            i7++;
            c2 = 0;
            i = 2;
            i2 = 1;
        }
        zzgau zzm = zzgau.zzm(zza.zzt());
        for (int i12 = 0; i12 < zzm.size(); i12++) {
            int intValue = ((Integer) zzm.get(i12)).intValue();
            int i13 = iArr2[intValue] + 1;
            iArr2[intValue] = i13;
            jArr3[intValue] = jArr[intValue][i13];
            zzg(arrayList, jArr3);
        }
        for (int i14 = 0; i14 < 2; i14++) {
            if (arrayList.get(i14) != null) {
                long j3 = jArr3[i14];
                jArr3[i14] = j3 + j3;
            }
        }
        zzg(arrayList, jArr3);
        zzgar zzi2 = zzgau.zzi();
        for (int i15 = 0; i15 < arrayList.size(); i15++) {
            zzgar zzgar = (zzgar) arrayList.get(i15);
            zzi2.zze(zzgar == null ? zzgau.zzo() : zzgar.zzg());
        }
        return zzi2.zzg();
    }

    private static void zzg(List list, long[] jArr) {
        long j = 0;
        for (int i = 0; i < 2; i++) {
            j += jArr[i];
        }
        for (int i2 = 0; i2 < list.size(); i2++) {
            zzgar zzgar = (zzgar) list.get(i2);
            if (zzgar != null) {
                zzgar.zze(new zzul(j, jArr[i2]));
            }
        }
    }
}
