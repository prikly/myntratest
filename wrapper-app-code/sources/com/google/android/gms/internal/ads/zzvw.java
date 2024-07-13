package com.google.android.gms.internal.ads;

import android.util.Pair;
import java.util.Arrays;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzvw extends zzvz {
    private zzvv zza;

    /* access modifiers changed from: protected */
    public abstract Pair zzb(zzvv zzvv, int[][][] iArr, int[] iArr2, zzsh zzsh, zzcn zzcn) throws zzha;

    public final zzwa zzn(zzjz[] zzjzArr, zzug zzug, zzsh zzsh, zzcn zzcn) throws zzha {
        boolean z;
        int[] iArr;
        zzug zzug2 = zzug;
        int[] iArr2 = new int[3];
        zzcp[][] zzcpArr = new zzcp[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzug2.zzc;
            zzcpArr[i] = new zzcp[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            iArr4[i4] = zzjzArr[i4].zze();
        }
        int i5 = 0;
        while (i5 < zzug2.zzc) {
            zzcp zzb = zzug2.zzb(i5);
            int i6 = zzb.zzd;
            int i7 = 0;
            int i8 = 2;
            int i9 = 0;
            boolean z2 = true;
            while (i7 < i3) {
                zzjz zzjz = zzjzArr[i7];
                int i10 = 0;
                int i11 = 0;
                while (true) {
                    int i12 = zzb.zzb;
                    if (i10 > 0) {
                        break;
                    }
                    i11 = Math.max(i11, zzjz.zzO(zzb.zzb(i10)) & 7);
                    i10++;
                }
                boolean z3 = iArr2[i7] == 0;
                if (i11 > i9) {
                    z2 = z3;
                    i8 = i7;
                    i9 = i11;
                } else if (i11 == i9 && i6 == 5 && !z2 && z3) {
                    i8 = i7;
                    i9 = i11;
                    z2 = true;
                }
                i7++;
                i3 = 2;
            }
            if (i8 == i3) {
                int i13 = zzb.zzb;
                iArr = new int[1];
            } else {
                zzjz zzjz2 = zzjzArr[i8];
                int i14 = zzb.zzb;
                int[] iArr5 = new int[1];
                int i15 = 0;
                while (true) {
                    int i16 = zzb.zzb;
                    if (i15 > 0) {
                        break;
                    }
                    iArr5[i15] = zzjz2.zzO(zzb.zzb(i15));
                    i15++;
                }
                iArr = iArr5;
            }
            int i17 = iArr2[i8];
            zzcpArr[i8][i17] = zzb;
            iArr3[i8][i17] = iArr;
            iArr2[i8] = i17 + 1;
            i5++;
            i3 = 2;
        }
        zzug[] zzugArr = new zzug[i3];
        String[] strArr = new String[i3];
        int[] iArr6 = new int[i3];
        int i18 = 0;
        while (i18 < i3) {
            int i19 = iArr2[i18];
            zzugArr[i18] = new zzug((zzcp[]) zzen.zzae(zzcpArr[i18], i19));
            iArr3[i18] = (int[][]) zzen.zzae(iArr3[i18], i19);
            strArr[i18] = zzjzArr[i18].zzK();
            iArr6[i18] = zzjzArr[i18].zzb();
            i18++;
            i3 = 2;
        }
        zzvv zzvv = new zzvv(strArr, iArr6, zzugArr, iArr4, iArr3, new zzug((zzcp[]) zzen.zzae(zzcpArr[2], iArr2[2])));
        Pair zzb2 = zzb(zzvv, iArr3, iArr4, zzsh, zzcn);
        zzvx[] zzvxArr = (zzvx[]) zzb2.second;
        List[] listArr = new List[zzvxArr.length];
        for (int i20 = 0; i20 < zzvxArr.length; i20++) {
            zzvx zzvx = zzvxArr[i20];
            listArr[i20] = zzvx != null ? zzgau.zzp(zzvx) : zzgau.zzo();
        }
        zzgar zzgar = new zzgar();
        for (int i21 = 0; i21 < 2; i21++) {
            zzug zzd = zzvv.zzd(i21);
            List list = listArr[i21];
            for (int i22 = 0; i22 < zzd.zzc; i22++) {
                zzcp zzb3 = zzd.zzb(i22);
                boolean z4 = zzvv.zza(i21, i22, false) != 0;
                int i23 = zzb3.zzb;
                int[] iArr7 = new int[1];
                boolean[] zArr = new boolean[1];
                int i24 = 0;
                while (true) {
                    int i25 = zzb3.zzb;
                    if (i24 > 0) {
                        break;
                    }
                    iArr7[i24] = zzvv.zzb(i21, i22, i24) & 7;
                    int i26 = 0;
                    while (true) {
                        if (i26 >= list.size()) {
                            z = false;
                            break;
                        }
                        zzvx zzvx2 = (zzvx) list.get(i26);
                        if (zzvx2.zze().equals(zzb3) && zzvx2.zzb(i24) != -1) {
                            z = true;
                            break;
                        }
                        i26++;
                    }
                    zArr[i24] = z;
                    i24++;
                }
                zzgar.zze(new zzcx(zzb3, z4, iArr7, zArr));
            }
        }
        zzug zze = zzvv.zze();
        for (int i27 = 0; i27 < zze.zzc; i27++) {
            zzcp zzb4 = zze.zzb(i27);
            int i28 = zzb4.zzb;
            int[] iArr8 = new int[1];
            Arrays.fill(iArr8, 0);
            int i29 = zzb4.zzb;
            zzgar.zze(new zzcx(zzb4, false, iArr8, new boolean[1]));
        }
        return new zzwa((zzka[]) zzb2.first, (zzvt[]) zzb2.second, new zzcy(zzgar.zzg()), zzvv);
    }

    public final void zzo(Object obj) {
        this.zza = (zzvv) obj;
    }
}
