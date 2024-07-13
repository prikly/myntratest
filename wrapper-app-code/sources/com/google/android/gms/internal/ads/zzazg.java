package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzazg extends zzazk {
    private final AtomicReference zza;

    public zzazg() {
        this((zzazl) null);
    }

    protected static boolean zza(int i, boolean z) {
        int i2 = i & 3;
        return i2 == 3 || (z && i2 == 2);
    }

    private static int zzh(int i, int i2) {
        if (i == -1) {
            return i2 != -1 ? -1 : 0;
        }
        if (i2 == -1) {
            return 1;
        }
        return i - i2;
    }

    /* access modifiers changed from: protected */
    public final zzaze[] zzb(zzatj[] zzatjArr, zzaza[] zzazaArr, int[][][] iArr) throws zzasp {
        zzazh zzazh;
        zzazh zzazh2;
        int[] iArr2;
        ArrayList arrayList;
        zzayz zzayz;
        boolean z;
        int i;
        int i2;
        int i3 = 2;
        zzaze[] zzazeArr = new zzaze[2];
        zzazf zzazf = (zzazf) this.zza.get();
        int i4 = 0;
        boolean z2 = false;
        while (true) {
            int i5 = 1;
            if (i4 >= i3) {
                break;
            }
            if (zzatjArr[i4].zzc() == i3) {
                if (!z2) {
                    zzatj zzatj = zzatjArr[i4];
                    zzaza zzaza = zzazaArr[i4];
                    int[][] iArr3 = iArr[i4];
                    int i6 = zzazf.zzd;
                    int i7 = zzazf.zze;
                    int i8 = zzazf.zzf;
                    boolean z3 = zzazf.zzc;
                    boolean z4 = zzazf.zzb;
                    int i9 = zzazf.zzi;
                    int i10 = zzazf.zzj;
                    boolean z5 = zzazf.zzk;
                    boolean z6 = zzazf.zzg;
                    boolean z7 = zzazf.zzh;
                    int i11 = 0;
                    zzayz zzayz2 = null;
                    int i12 = 0;
                    int i13 = 0;
                    int i14 = -1;
                    int i15 = -1;
                    while (i11 < zzaza.zzb) {
                        zzayz zzb = zzaza.zzb(i11);
                        int i16 = zzb.zza;
                        ArrayList arrayList2 = new ArrayList(i5);
                        int i17 = 0;
                        while (true) {
                            int i18 = zzb.zza;
                            if (i17 > 0) {
                                break;
                            }
                            arrayList2.add(Integer.valueOf(i17));
                            i17++;
                        }
                        int[] iArr4 = iArr3[i11];
                        int i19 = i15;
                        int i20 = 0;
                        while (true) {
                            int i21 = zzb.zza;
                            if (i20 > 0) {
                                break;
                            }
                            zzaza zzaza2 = zzaza;
                            if (zza(iArr4[i20], true)) {
                                zzatd zzb2 = zzb.zzb(i20);
                                if (arrayList2.contains(Integer.valueOf(i20))) {
                                    int i22 = zzb2.zzj;
                                    int i23 = zzb2.zzk;
                                    int i24 = zzb2.zzb;
                                    zzayz = zzb;
                                    z = true;
                                } else {
                                    zzayz = zzb;
                                    z = false;
                                }
                                if (true != z) {
                                    arrayList = arrayList2;
                                    i = 1;
                                } else {
                                    arrayList = arrayList2;
                                    i = 2;
                                }
                                iArr2 = iArr4;
                                boolean zza2 = zza(iArr4[i20], false);
                                if (zza2) {
                                    i += 1000;
                                }
                                boolean z8 = i > i13;
                                if (i == i13) {
                                    if (zzb2.zza() != i19) {
                                        i2 = zzh(zzb2.zza(), i19);
                                    } else {
                                        i2 = zzh(zzb2.zzb, i14);
                                    }
                                    z8 = !zza2 || !z ? i2 < 0 : i2 > 0;
                                }
                                if (z8) {
                                    i14 = zzb2.zzb;
                                    i19 = zzb2.zza();
                                    i13 = i;
                                    i12 = i20;
                                    zzayz2 = zzayz;
                                }
                            } else {
                                zzayz = zzb;
                                iArr2 = iArr4;
                                arrayList = arrayList2;
                            }
                            i20++;
                            zzaza = zzaza2;
                            zzb = zzayz;
                            arrayList2 = arrayList;
                            iArr4 = iArr2;
                        }
                        zzaza zzaza3 = zzaza;
                        i11++;
                        i15 = i19;
                        i5 = 1;
                    }
                    if (zzayz2 == null) {
                        zzazh2 = null;
                    } else {
                        zzazh2 = new zzazh(zzayz2, i12, 0, (Object) null);
                    }
                    zzazeArr[i4] = zzazh2;
                    z2 = zzazh2 != null;
                }
                int i25 = zzazaArr[i4].zzb;
            }
            i4++;
            i3 = 2;
        }
        int i26 = 0;
        boolean z9 = false;
        while (i26 < i3) {
            if (zzatjArr[i26].zzc() == 1 && !z9) {
                zzaza zzaza4 = zzazaArr[i26];
                int[][] iArr5 = iArr[i26];
                String str = zzazf.zza;
                boolean z10 = zzazf.zzh;
                boolean z11 = zzazf.zzb;
                int i27 = -1;
                int i28 = -1;
                int i29 = 0;
                int i30 = 0;
                while (i29 < zzaza4.zzb) {
                    zzayz zzb3 = zzaza4.zzb(i29);
                    int[] iArr6 = iArr5[i29];
                    int i31 = i30;
                    int i32 = i28;
                    int i33 = i27;
                    int i34 = 0;
                    while (true) {
                        int i35 = zzb3.zza;
                        if (i34 > 0) {
                            break;
                        }
                        if (zza(iArr6[i34], true)) {
                            zzatd zzb4 = zzb3.zzb(i34);
                            int i36 = iArr6[i34];
                            int i37 = 1 != (zzb4.zzx & 1) ? 1 : 2;
                            if (zza(i36, false)) {
                                i37 += 1000;
                            }
                            if (i37 > i31) {
                                i32 = i34;
                                i33 = i29;
                                i31 = i37;
                            }
                        }
                        i34++;
                    }
                    i29++;
                    i27 = i33;
                    i28 = i32;
                    i30 = i31;
                }
                if (i27 == -1) {
                    zzazh = null;
                } else {
                    zzazh = new zzazh(zzaza4.zzb(i27), i28, 0, (Object) null);
                }
                zzazeArr[i26] = zzazh;
                z9 = zzazh != null;
            }
            i26++;
            i3 = 2;
        }
        return zzazeArr;
    }

    public zzazg(zzazl zzazl) {
        this.zza = new AtomicReference(new zzazf());
    }
}
