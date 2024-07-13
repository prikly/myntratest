package com.google.android.gms.internal.ads;

import android.util.SparseArray;
import android.util.SparseBooleanArray;
import java.util.Arrays;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzazk extends zzazo {
    private final SparseArray zza = new SparseArray();
    private final SparseBooleanArray zzb = new SparseBooleanArray();
    private zzazi zzc;

    /* access modifiers changed from: protected */
    public abstract zzaze[] zzb(zzatj[] zzatjArr, zzaza[] zzazaArr, int[][][] iArr) throws zzasp;

    public final zzazp zzc(zzatj[] zzatjArr, zzaza zzaza) throws zzasp {
        zzazj zzazj;
        int[] iArr;
        zzatj[] zzatjArr2 = zzatjArr;
        zzaza zzaza2 = zzaza;
        int[] iArr2 = new int[3];
        zzayz[][] zzayzArr = new zzayz[3][];
        int[][][] iArr3 = new int[3][][];
        for (int i = 0; i < 3; i++) {
            int i2 = zzaza2.zzb;
            zzayzArr[i] = new zzayz[i2];
            iArr3[i] = new int[i2][];
        }
        int i3 = 2;
        int[] iArr4 = new int[2];
        for (int i4 = 0; i4 < 2; i4++) {
            zzatjArr2[i4].zze();
            iArr4[i4] = 4;
        }
        int i5 = 0;
        while (i5 < zzaza2.zzb) {
            zzayz zzb2 = zzaza2.zzb(i5);
            int i6 = 0;
            int i7 = 0;
            int i8 = 2;
            while (true) {
                if (i6 >= i3) {
                    i6 = i8;
                    break;
                }
                zzatj zzatj = zzatjArr2[i6];
                int i9 = 0;
                while (true) {
                    int i10 = zzb2.zza;
                    if (i9 > 0) {
                        break;
                    }
                    int zzG = zzatj.zzG(zzb2.zzb(i9)) & 3;
                    if (zzG > i7) {
                        if (zzG == 3) {
                            break;
                        }
                        i8 = i6;
                        i7 = zzG;
                    }
                    i9++;
                }
                i6++;
                i3 = 2;
            }
            if (i6 == 2) {
                int i11 = zzb2.zza;
                iArr = new int[1];
            } else {
                zzatj zzatj2 = zzatjArr2[i6];
                int i12 = zzb2.zza;
                int[] iArr5 = new int[1];
                int i13 = 0;
                while (true) {
                    int i14 = zzb2.zza;
                    if (i13 > 0) {
                        break;
                    }
                    iArr5[i13] = zzatj2.zzG(zzb2.zzb(i13));
                    i13++;
                }
                iArr = iArr5;
            }
            int i15 = iArr2[i6];
            zzayzArr[i6][i15] = zzb2;
            iArr3[i6][i15] = iArr;
            iArr2[i6] = i15 + 1;
            i5++;
            i3 = 2;
        }
        zzaza[] zzazaArr = new zzaza[2];
        int[] iArr6 = new int[2];
        int i16 = 0;
        for (int i17 = 2; i16 < i17; i17 = 2) {
            int i18 = iArr2[i16];
            zzazaArr[i16] = new zzaza((zzayz[]) Arrays.copyOf(zzayzArr[i16], i18));
            iArr3[i16] = (int[][]) Arrays.copyOf(iArr3[i16], i18);
            iArr6[i16] = zzatjArr2[i16].zzc();
            i16++;
        }
        zzaza zzaza3 = new zzaza((zzayz[]) Arrays.copyOf(zzayzArr[2], iArr2[2]));
        zzaze[] zzb3 = zzb(zzatjArr2, zzazaArr, iArr3);
        int i19 = 0;
        for (int i20 = 2; i19 < i20; i20 = 2) {
            if (this.zzb.get(i19)) {
                zzb3[i19] = null;
            } else {
                zzaza zzaza4 = zzazaArr[i19];
                Map map = (Map) this.zza.get(i19);
                if (map == null) {
                    zzazj = null;
                } else {
                    zzazj = (zzazj) map.get(zzaza4);
                }
                if (zzazj != null) {
                    throw null;
                }
            }
            i19++;
        }
        zzazi zzazi = new zzazi(iArr6, zzazaArr, iArr4, iArr3, zzaza3);
        zzatk[] zzatkArr = new zzatk[2];
        for (int i21 = 0; i21 < 2; i21++) {
            zzatkArr[i21] = zzb3[i21] != null ? zzatk.zza : null;
        }
        return new zzazp(zzaza2, new zzazm(zzb3, (byte[]) null), zzazi, zzatkArr);
    }

    public final void zzd(Object obj) {
        this.zzc = (zzazi) obj;
    }

    public final void zze(int i, boolean z) {
        if (this.zzb.get(i) != z) {
            this.zzb.put(i, z);
            zzg();
        }
    }
}
