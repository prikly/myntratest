package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzsx implements zzse, zzsf {
    private final zzsf[] zza;
    private final IdentityHashMap zzb;
    private final ArrayList zzc = new ArrayList();
    private final HashMap zzd = new HashMap();
    private zzse zze;
    private zzug zzf;
    private zzsf[] zzg;
    private zzua zzh;
    private final zzrs zzi;

    public zzsx(zzrs zzrs, long[] jArr, zzsf[] zzsfArr, byte... bArr) {
        this.zzi = zzrs;
        this.zza = zzsfArr;
        this.zzh = new zzrr(new zzua[0]);
        this.zzb = new IdentityHashMap();
        this.zzg = new zzsf[0];
        for (int i = 0; i < zzsfArr.length; i++) {
            long j = jArr[i];
            if (j != 0) {
                this.zza[i] = new zzsv(zzsfArr[i], j);
            }
        }
    }

    public final long zza(long j, zzkb zzkb) {
        zzsf[] zzsfArr = this.zzg;
        return (zzsfArr.length > 0 ? zzsfArr[0] : this.zza[0]).zza(j, zzkb);
    }

    public final long zzb() {
        return this.zzh.zzb();
    }

    public final long zzc() {
        return this.zzh.zzc();
    }

    public final long zzd() {
        long j = -9223372036854775807L;
        for (zzsf zzsf : this.zzg) {
            long zzd2 = zzsf.zzd();
            if (zzd2 != -9223372036854775807L) {
                if (j == -9223372036854775807L) {
                    zzsf[] zzsfArr = this.zzg;
                    int length = zzsfArr.length;
                    int i = 0;
                    while (i < length) {
                        zzsf zzsf2 = zzsfArr[i];
                        if (zzsf2 == zzsf) {
                            break;
                        } else if (zzsf2.zze(zzd2) == zzd2) {
                            i++;
                        } else {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j = zzd2;
                } else if (zzd2 != j) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (!(j == -9223372036854775807L || zzsf.zze(j) == j)) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j;
    }

    public final long zze(long j) {
        long zze2 = this.zzg[0].zze(j);
        int i = 1;
        while (true) {
            zzsf[] zzsfArr = this.zzg;
            if (i >= zzsfArr.length) {
                return zze2;
            }
            if (zzsfArr[i].zze(zze2) == zze2) {
                i++;
            } else {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
    }

    public final long zzf(zzvt[] zzvtArr, boolean[] zArr, zzty[] zztyArr, boolean[] zArr2, long j) {
        ArrayList arrayList;
        int i;
        zzvt[] zzvtArr2 = zzvtArr;
        zzty[] zztyArr2 = zztyArr;
        int length = zzvtArr2.length;
        int[] iArr = new int[length];
        int[] iArr2 = new int[length];
        int i2 = 0;
        while (true) {
            int length2 = zzvtArr2.length;
            if (i2 < length2) {
                zzty zzty = zztyArr2[i2];
                Integer num = zzty == null ? null : (Integer) this.zzb.get(zzty);
                if (num == null) {
                    i = -1;
                } else {
                    i = num.intValue();
                }
                iArr[i2] = i;
                iArr2[i2] = -1;
                zzvt zzvt = zzvtArr2[i2];
                if (zzvt != null) {
                    zzcp zzcp = (zzcp) this.zzd.get(zzvt.zze());
                    if (zzcp != null) {
                        int i3 = 0;
                        while (true) {
                            zzsf[] zzsfArr = this.zza;
                            if (i3 >= zzsfArr.length) {
                                break;
                            } else if (zzsfArr[i3].zzh().zza(zzcp) != -1) {
                                iArr2[i2] = i3;
                                break;
                            } else {
                                i3++;
                            }
                        }
                    } else {
                        throw null;
                    }
                }
                i2++;
            } else {
                this.zzb.clear();
                zzty[] zztyArr3 = new zzty[length2];
                zzty[] zztyArr4 = new zzty[length2];
                zzvt[] zzvtArr3 = new zzvt[length2];
                ArrayList arrayList2 = new ArrayList(this.zza.length);
                long j2 = j;
                int i4 = 0;
                while (i4 < this.zza.length) {
                    for (int i5 = 0; i5 < zzvtArr2.length; i5++) {
                        zztyArr4[i5] = iArr[i5] == i4 ? zztyArr2[i5] : null;
                        if (iArr2[i5] == i4) {
                            zzvt zzvt2 = zzvtArr2[i5];
                            if (zzvt2 != null) {
                                zzcp zzcp2 = (zzcp) this.zzd.get(zzvt2.zze());
                                if (zzcp2 != null) {
                                    zzvtArr3[i5] = new zzsu(zzvt2, zzcp2);
                                } else {
                                    throw null;
                                }
                            } else {
                                throw null;
                            }
                        } else {
                            zzvtArr3[i5] = null;
                        }
                    }
                    int i6 = i4;
                    ArrayList arrayList3 = arrayList2;
                    zzty[] zztyArr5 = zztyArr4;
                    zzvt[] zzvtArr4 = zzvtArr3;
                    long zzf2 = this.zza[i4].zzf(zzvtArr3, zArr, zztyArr4, zArr2, j2);
                    if (i6 == 0) {
                        j2 = zzf2;
                    } else if (zzf2 != j2) {
                        throw new IllegalStateException("Children enabled at different positions.");
                    }
                    boolean z = false;
                    for (int i7 = 0; i7 < zzvtArr2.length; i7++) {
                        boolean z2 = true;
                        if (iArr2[i7] == i6) {
                            zzty zzty2 = zztyArr5[i7];
                            if (zzty2 != null) {
                                zztyArr3[i7] = zzty2;
                                this.zzb.put(zzty2, Integer.valueOf(i6));
                                z = true;
                            } else {
                                throw null;
                            }
                        } else if (iArr[i7] == i6) {
                            if (zztyArr5[i7] != null) {
                                z2 = false;
                            }
                            zzdd.zzf(z2);
                        }
                    }
                    if (z) {
                        arrayList = arrayList3;
                        arrayList.add(this.zza[i6]);
                    } else {
                        arrayList = arrayList3;
                    }
                    i4 = i6 + 1;
                    arrayList2 = arrayList;
                    zztyArr4 = zztyArr5;
                    zzvtArr3 = zzvtArr4;
                }
                System.arraycopy(zztyArr3, 0, zztyArr2, 0, length2);
                zzsf[] zzsfArr2 = (zzsf[]) arrayList2.toArray(new zzsf[0]);
                this.zzg = zzsfArr2;
                this.zzh = new zzrr(zzsfArr2);
                return j2;
            }
        }
    }

    public final /* bridge */ /* synthetic */ void zzg(zzua zzua) {
        zzsf zzsf = (zzsf) zzua;
        zzse zzse = this.zze;
        if (zzse != null) {
            zzse.zzg(this);
            return;
        }
        throw null;
    }

    public final zzug zzh() {
        zzug zzug = this.zzf;
        if (zzug != null) {
            return zzug;
        }
        throw null;
    }

    public final void zzi(zzsf zzsf) {
        this.zzc.remove(zzsf);
        if (this.zzc.isEmpty()) {
            int i = 0;
            for (zzsf zzh2 : this.zza) {
                i += zzh2.zzh().zzc;
            }
            zzcp[] zzcpArr = new zzcp[i];
            int i2 = 0;
            int i3 = 0;
            while (true) {
                zzsf[] zzsfArr = this.zza;
                if (i2 >= zzsfArr.length) {
                    break;
                }
                zzug zzh3 = zzsfArr[i2].zzh();
                int i4 = zzh3.zzc;
                int i5 = 0;
                while (i5 < i4) {
                    zzcp zzb2 = zzh3.zzb(i5);
                    zzcp zzc2 = zzb2.zzc(i2 + ":" + zzb2.zzc);
                    this.zzd.put(zzc2, zzb2);
                    zzcpArr[i3] = zzc2;
                    i5++;
                    i3++;
                }
                i2++;
            }
            this.zzf = new zzug(zzcpArr);
            zzse zzse = this.zze;
            if (zzse != null) {
                zzse.zzi(this);
                return;
            }
            throw null;
        }
    }

    public final void zzj(long j, boolean z) {
        for (zzsf zzj : this.zzg) {
            zzj.zzj(j, false);
        }
    }

    public final void zzk() throws IOException {
        for (zzsf zzk : this.zza) {
            zzk.zzk();
        }
    }

    public final void zzl(zzse zzse, long j) {
        this.zze = zzse;
        Collections.addAll(this.zzc, this.zza);
        for (zzsf zzl : this.zza) {
            zzl.zzl(this, j);
        }
    }

    public final void zzm(long j) {
        this.zzh.zzm(j);
    }

    public final zzsf zzn(int i) {
        zzsf zzsf = this.zza[i];
        return zzsf instanceof zzsv ? ((zzsv) zzsf).zza : zzsf;
    }

    public final boolean zzo(long j) {
        if (this.zzc.isEmpty()) {
            return this.zzh.zzo(j);
        }
        int size = this.zzc.size();
        for (int i = 0; i < size; i++) {
            ((zzsf) this.zzc.get(i)).zzo(j);
        }
        return false;
    }

    public final boolean zzp() {
        return this.zzh.zzp();
    }
}
