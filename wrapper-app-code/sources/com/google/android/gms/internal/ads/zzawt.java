package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Stack;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzawt implements zzavg, zzavn {
    public static final zzavi zza = new zzawr();
    private static final int zzb = zzbay.zzg("qt  ");
    private final zzbar zzc = new zzbar(zzbap.zza);
    private final zzbar zzd = new zzbar(4);
    private final zzbar zze = new zzbar(16);
    private final Stack zzf = new Stack();
    private int zzg;
    private int zzh;
    private long zzi;
    private int zzj;
    private zzbar zzk;
    private int zzl;
    private int zzm;
    private zzavh zzn;
    private zzaws[] zzo;
    private long zzp;
    private boolean zzq;

    private final void zzh() {
        this.zzg = 0;
        this.zzj = 0;
    }

    private final void zzi(long j) throws zzatg {
        zzaxo zzaxo;
        zzaxo zzaxo2;
        zzavk zzavk;
        zzawv zza2;
        while (!this.zzf.isEmpty() && ((zzawb) this.zzf.peek()).zza == j) {
            zzawb zzawb = (zzawb) this.zzf.pop();
            if (zzawb.zzaR == zzawd.zzE) {
                ArrayList arrayList = new ArrayList();
                zzavk zzavk2 = new zzavk();
                zzawc zzb2 = zzawb.zzb(zzawd.zzaC);
                if (zzb2 != null) {
                    zzaxo = zzawk.zzc(zzb2, this.zzq);
                    if (zzaxo != null) {
                        zzavk2.zzb(zzaxo);
                    }
                } else {
                    zzaxo = null;
                }
                long j2 = -9223372036854775807L;
                long j3 = Long.MAX_VALUE;
                int i = 0;
                while (i < zzawb.zzc.size()) {
                    zzawb zzawb2 = (zzawb) zzawb.zzc.get(i);
                    if (zzawb2.zzaR == zzawd.zzG && (zza2 = zzawk.zza(zzawb2, zzawb.zzb(zzawd.zzF), -9223372036854775807L, (zzavc) null, this.zzq)) != null) {
                        zzawy zzb3 = zzawk.zzb(zza2, zzawb2.zza(zzawd.zzH).zza(zzawd.zzI).zza(zzawd.zzJ), zzavk2);
                        if (zzb3.zza != 0) {
                            zzaws zzaws = new zzaws(zza2, zzb3, this.zzn.zzbi(i, zza2.zzb));
                            zzatd zze2 = zza2.zzf.zze(zzb3.zzd + 30);
                            if (zza2.zzb == 1) {
                                if (zzavk2.zza()) {
                                    zze2 = zze2.zzd(zzavk2.zzb, zzavk2.zzc);
                                }
                                if (zzaxo != null) {
                                    zze2 = zze2.zzf(zzaxo);
                                }
                            }
                            zzaws.zzc.zza(zze2);
                            zzavk = zzavk2;
                            zzaxo2 = zzaxo;
                            long max = Math.max(j2, zza2.zze);
                            arrayList.add(zzaws);
                            long j4 = zzb3.zzb[0];
                            if (j4 < j3) {
                                j2 = max;
                                j3 = j4;
                            } else {
                                j2 = max;
                            }
                            i++;
                            zzavk2 = zzavk;
                            zzaxo = zzaxo2;
                        }
                    }
                    zzavk = zzavk2;
                    zzaxo2 = zzaxo;
                    i++;
                    zzavk2 = zzavk;
                    zzaxo = zzaxo2;
                }
                this.zzp = j2;
                this.zzo = (zzaws[]) arrayList.toArray(new zzaws[arrayList.size()]);
                this.zzn.zzb();
                this.zzn.zzc(this);
                this.zzf.clear();
                this.zzg = 2;
            } else if (!this.zzf.isEmpty()) {
                ((zzawb) this.zzf.peek()).zzc(zzawb);
            }
        }
        if (this.zzg != 2) {
            zzh();
        }
    }

    public final long zza() {
        return this.zzp;
    }

    public final long zzb(long j) {
        long j2 = Long.MAX_VALUE;
        for (zzaws zzaws : this.zzo) {
            zzawy zzawy = zzaws.zzb;
            int zza2 = zzawy.zza(j);
            if (zza2 == -1) {
                zza2 = zzawy.zzb(j);
            }
            long j3 = zzawy.zzb[zza2];
            if (j3 < j2) {
                j2 = j3;
            }
        }
        return j2;
    }

    public final boolean zzc() {
        return true;
    }

    public final void zzd(zzavh zzavh) {
        this.zzn = zzavh;
    }

    public final void zze(long j, long j2) {
        this.zzf.clear();
        this.zzj = 0;
        this.zzl = 0;
        this.zzm = 0;
        if (j == 0) {
            zzh();
            return;
        }
        zzaws[] zzawsArr = this.zzo;
        if (zzawsArr != null) {
            for (zzaws zzaws : zzawsArr) {
                zzawy zzawy = zzaws.zzb;
                int zza2 = zzawy.zza(j2);
                if (zza2 == -1) {
                    zza2 = zzawy.zzb(j2);
                }
                zzaws.zzd = zza2;
            }
        }
    }

    public final boolean zzg(zzavf zzavf) throws IOException, InterruptedException {
        return zzawu.zzb(zzavf);
    }

    public final int zzf(zzavf zzavf, zzavl zzavl) throws IOException, InterruptedException {
        zzaws[] zzawsArr;
        boolean z;
        boolean z2;
        zzavf zzavf2 = zzavf;
        zzavl zzavl2 = zzavl;
        while (true) {
            int i = this.zzg;
            if (i == 0) {
                if (this.zzj == 0) {
                    if (!zzavf2.zzh(this.zze.zza, 0, 8, true)) {
                        return -1;
                    }
                    this.zzj = 8;
                    this.zze.zzv(0);
                    this.zzi = this.zze.zzm();
                    this.zzh = this.zze.zze();
                }
                if (this.zzi == 1) {
                    zzavf2.zzh(this.zze.zza, 8, 8, false);
                    this.zzj += 8;
                    this.zzi = this.zze.zzn();
                }
                int i2 = this.zzh;
                if (i2 == zzawd.zzE || i2 == zzawd.zzG || i2 == zzawd.zzH || i2 == zzawd.zzI || i2 == zzawd.zzJ || i2 == zzawd.zzS) {
                    long zzd2 = (zzavf.zzd() + this.zzi) - ((long) this.zzj);
                    this.zzf.add(new zzawb(this.zzh, zzd2));
                    if (this.zzi == ((long) this.zzj)) {
                        zzi(zzd2);
                    } else {
                        zzh();
                    }
                } else {
                    int i3 = this.zzh;
                    if (i3 == zzawd.zzU || i3 == zzawd.zzF || i3 == zzawd.zzV || i3 == zzawd.zzW || i3 == zzawd.zzao || i3 == zzawd.zzap || i3 == zzawd.zzaq || i3 == zzawd.zzT || i3 == zzawd.zzar || i3 == zzawd.zzas || i3 == zzawd.zzat || i3 == zzawd.zzau || i3 == zzawd.zzav || i3 == zzawd.zzR || i3 == zzawd.zzd || i3 == zzawd.zzaC) {
                        zzbaj.zze(this.zzj == 8);
                        zzbaj.zze(this.zzi <= 2147483647L);
                        this.zzk = new zzbar((int) this.zzi);
                        System.arraycopy(this.zze.zza, 0, this.zzk.zza, 0, 8);
                    } else {
                        this.zzk = null;
                    }
                    this.zzg = 1;
                }
            } else if (i != 1) {
                long j = Long.MAX_VALUE;
                int i4 = 0;
                int i5 = -1;
                while (true) {
                    zzawsArr = this.zzo;
                    if (i4 >= zzawsArr.length) {
                        break;
                    }
                    zzaws zzaws = zzawsArr[i4];
                    int i6 = zzaws.zzd;
                    zzawy zzawy = zzaws.zzb;
                    if (i6 != zzawy.zza) {
                        long j2 = zzawy.zzb[i6];
                        if (j2 < j) {
                            i5 = i4;
                            j = j2;
                        }
                    }
                    i4++;
                }
                if (i5 == -1) {
                    return -1;
                }
                zzaws zzaws2 = zzawsArr[i5];
                zzavp zzavp = zzaws2.zzc;
                int i7 = zzaws2.zzd;
                zzawy zzawy2 = zzaws2.zzb;
                long j3 = zzawy2.zzb[i7];
                int i8 = zzawy2.zzc[i7];
                if (zzaws2.zza.zzg == 1) {
                    j3 += 8;
                    i8 -= 8;
                }
                long zzd3 = (j3 - zzavf.zzd()) + ((long) this.zzl);
                if (zzd3 < 0 || zzd3 >= 262144) {
                    zzavl2.zza = j3;
                    return 1;
                }
                int i9 = (int) zzd3;
                boolean z3 = false;
                zzavf2.zzi(i9, false);
                int i10 = zzaws2.zza.zzk;
                if (i10 == 0) {
                    while (true) {
                        int i11 = this.zzl;
                        if (i11 >= i8) {
                            break;
                        }
                        int zzd4 = zzavp.zzd(zzavf2, i8 - i11, false);
                        this.zzl += zzd4;
                        this.zzm -= zzd4;
                    }
                } else {
                    byte[] bArr = this.zzd.zza;
                    bArr[0] = 0;
                    bArr[1] = 0;
                    bArr[2] = 0;
                    int i12 = 4 - i10;
                    while (this.zzl < i8) {
                        int i13 = this.zzm;
                        if (i13 == 0) {
                            zzavf2.zzh(this.zzd.zza, i12, i10, z3);
                            this.zzd.zzv(z3 ? 1 : 0);
                            this.zzm = this.zzd.zzi();
                            this.zzc.zzv(z3);
                            zzavp.zzb(this.zzc, 4);
                            this.zzl += 4;
                            i8 += i12;
                        } else {
                            int zzd5 = zzavp.zzd(zzavf2, i13, z3);
                            this.zzl += zzd5;
                            this.zzm -= zzd5;
                            z3 = false;
                        }
                    }
                }
                int i14 = i8;
                zzawy zzawy3 = zzaws2.zzb;
                zzavp.zzc(zzawy3.zze[i7], zzawy3.zzf[i7], i14, 0, (zzavo) null);
                zzaws2.zzd++;
                this.zzl = 0;
                this.zzm = 0;
                return 0;
            } else {
                long j4 = this.zzi;
                int i15 = this.zzj;
                long j5 = j4 - ((long) i15);
                long zzd6 = zzavf.zzd() + j5;
                zzbar zzbar = this.zzk;
                if (zzbar != null) {
                    zzavf2.zzh(zzbar.zza, i15, (int) j5, false);
                    if (this.zzh == zzawd.zzd) {
                        zzbar zzbar2 = this.zzk;
                        zzbar2.zzv(8);
                        if (zzbar2.zze() == zzb) {
                            z2 = true;
                        } else {
                            zzbar2.zzw(4);
                            while (true) {
                                if (zzbar2.zza() > 0) {
                                    if (zzbar2.zze() == zzb) {
                                        break;
                                    }
                                } else {
                                    z2 = false;
                                    break;
                                }
                            }
                            z2 = true;
                        }
                        this.zzq = z2;
                    } else if (!this.zzf.isEmpty()) {
                        ((zzawb) this.zzf.peek()).zzd(new zzawc(this.zzh, this.zzk));
                    }
                } else if (j5 < 262144) {
                    zzavf2.zzi((int) j5, false);
                } else {
                    zzavl2.zza = zzavf.zzd() + j5;
                    z = true;
                    zzi(zzd6);
                    if (z && this.zzg != 2) {
                        return 1;
                    }
                }
                z = false;
                zzi(zzd6);
                return 1;
            }
        }
    }
}
