package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.util.Pair;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzjk {
    private final zzck zza = new zzck();
    private final zzcm zzb = new zzcm();
    private final zzkm zzc;
    private final Handler zzd;
    private long zze;
    private int zzf;
    private boolean zzg;
    private zzjh zzh;
    private zzjh zzi;
    private zzjh zzj;
    private int zzk;
    private Object zzl;
    private long zzm;

    public zzjk(zzkm zzkm, Handler handler) {
        this.zzc = zzkm;
        this.zzd = handler;
    }

    private final boolean zzA(zzcn zzcn, zzsh zzsh) {
        if (!zzC(zzsh)) {
            return false;
        }
        int i = zzcn.zzn(zzsh.zza, this.zza).zzd;
        if (zzcn.zze(i, this.zzb, 0).zzp == zzcn.zza(zzsh.zza)) {
            return true;
        }
        return false;
    }

    private final boolean zzB(zzcn zzcn) {
        zzjh zzjh = this.zzh;
        if (zzjh == null) {
            return true;
        }
        int zza2 = zzcn.zza(zzjh.zzb);
        while (true) {
            zza2 = zzcn.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg);
            while (zzjh.zzg() != null && !zzjh.zzf.zzg) {
                zzjh = zzjh.zzg();
            }
            zzjh zzg2 = zzjh.zzg();
            if (zza2 == -1 || zzg2 == null || zzcn.zza(zzg2.zzb) != zza2) {
                boolean zzm2 = zzm(zzjh);
                zzjh.zzf = zzg(zzcn, zzjh.zzf);
            } else {
                zzjh = zzg2;
            }
        }
        boolean zzm22 = zzm(zzjh);
        zzjh.zzf = zzg(zzcn, zzjh.zzf);
        if (!zzm22) {
            return true;
        }
        return false;
    }

    private static final boolean zzC(zzsh zzsh) {
        return !zzsh.zzb() && zzsh.zze == -1;
    }

    private final long zzs(zzcn zzcn, Object obj, int i) {
        zzcn.zzn(obj, this.zza);
        this.zza.zzh(i);
        this.zza.zzj(i);
        return 0;
    }

    private final zzji zzt(zzcn zzcn, zzjh zzjh, long j) {
        long j2;
        zzcn zzcn2 = zzcn;
        zzji zzji = zzjh.zzf;
        long zze2 = (zzjh.zze() + zzji.zze) - j;
        if (zzji.zzg) {
            long j3 = 0;
            int zzi2 = zzcn.zzi(zzcn2.zza(zzji.zza.zza), this.zza, this.zzb, this.zzf, this.zzg);
            if (zzi2 == -1) {
                return null;
            }
            int i = zzcn2.zzd(zzi2, this.zza, true).zzd;
            Object obj = this.zza.zzc;
            if (obj != null) {
                long j4 = zzji.zza.zzd;
                if (zzcn2.zze(i, this.zzb, 0).zzo == zzi2) {
                    Pair zzm2 = zzcn.zzm(this.zzb, this.zza, i, -9223372036854775807L, Math.max(0, zze2));
                    if (zzm2 == null) {
                        return null;
                    }
                    obj = zzm2.first;
                    long longValue = ((Long) zzm2.second).longValue();
                    zzjh zzg2 = zzjh.zzg();
                    if (zzg2 == null || !zzg2.zzb.equals(obj)) {
                        j4 = this.zze;
                        this.zze = 1 + j4;
                    } else {
                        j4 = zzg2.zzf.zza.zzd;
                    }
                    j2 = longValue;
                    j3 = -9223372036854775807L;
                } else {
                    j2 = 0;
                }
                zzsh zzx = zzx(zzcn, obj, j2, j4, this.zzb, this.zza);
                if (!(j3 == -9223372036854775807L || zzji.zzc == -9223372036854775807L)) {
                    zzcn2.zzn(zzji.zza.zza, this.zza).zzb();
                }
                return zzu(zzcn, zzx, j3, j2);
            }
            throw null;
        }
        zzsh zzsh = zzji.zza;
        zzcn2.zzn(zzsh.zza, this.zza);
        if (zzsh.zzb()) {
            int i2 = zzsh.zzb;
            if (this.zza.zza(i2) == -1) {
                return null;
            }
            int zzf2 = this.zza.zzf(i2, zzsh.zzc);
            if (zzf2 < 0) {
                return zzv(zzcn, zzsh.zza, i2, zzf2, zzji.zzc, zzsh.zzd);
            }
            long j5 = zzji.zzc;
            if (j5 == -9223372036854775807L) {
                zzcm zzcm = this.zzb;
                zzck zzck = this.zza;
                Pair zzm3 = zzcn.zzm(zzcm, zzck, zzck.zzd, -9223372036854775807L, Math.max(0, zze2));
                if (zzm3 == null) {
                    return null;
                }
                j5 = ((Long) zzm3.second).longValue();
            }
            zzs(zzcn2, zzsh.zza, zzsh.zzb);
            return zzw(zzcn, zzsh.zza, Math.max(0, j5), zzji.zzc, zzsh.zzd);
        }
        int zze3 = this.zza.zze(zzsh.zze);
        this.zza.zzl(zzsh.zze);
        if (zze3 != this.zza.zza(zzsh.zze)) {
            return zzv(zzcn, zzsh.zza, zzsh.zze, zze3, zzji.zze, zzsh.zzd);
        }
        zzs(zzcn2, zzsh.zza, zzsh.zze);
        return zzw(zzcn, zzsh.zza, 0, zzji.zze, zzsh.zzd);
    }

    private final zzji zzu(zzcn zzcn, zzsh zzsh, long j, long j2) {
        zzsh zzsh2 = zzsh;
        zzcn zzcn2 = zzcn;
        zzcn.zzn(zzsh2.zza, this.zza);
        if (zzsh.zzb()) {
            return zzv(zzcn, zzsh2.zza, zzsh2.zzb, zzsh2.zzc, j, zzsh2.zzd);
        }
        return zzw(zzcn, zzsh2.zza, j2, j, zzsh2.zzd);
    }

    private final zzji zzv(zzcn zzcn, Object obj, int i, int i2, long j, long j2) {
        zzsh zzsh = new zzsh(obj, i, i2, j2);
        long zzg2 = zzcn.zzn(zzsh.zza, this.zza).zzg(zzsh.zzb, zzsh.zzc);
        if (i2 == this.zza.zze(i)) {
            this.zza.zzi();
        }
        this.zza.zzl(zzsh.zzb);
        long j3 = 0;
        if (zzg2 != -9223372036854775807L && zzg2 <= 0) {
            j3 = Math.max(0, -1 + zzg2);
        }
        return new zzji(zzsh, j3, j, -9223372036854775807L, zzg2, false, false, false, false);
    }

    private final zzji zzw(zzcn zzcn, Object obj, long j, long j2, long j3) {
        long j4;
        long j5;
        long j6;
        zzcn zzcn2 = zzcn;
        Object obj2 = obj;
        long j7 = j;
        zzcn2.zzn(obj2, this.zza);
        int zzc2 = this.zza.zzc(j7);
        if (zzc2 == -1) {
            this.zza.zzb();
        } else {
            this.zza.zzl(zzc2);
        }
        zzsh zzsh = new zzsh(obj2, j3, zzc2);
        boolean zzC = zzC(zzsh);
        boolean zzA = zzA(zzcn2, zzsh);
        boolean zzz = zzz(zzcn2, zzsh, zzC);
        if (zzc2 != -1) {
            this.zza.zzl(zzc2);
        }
        if (zzc2 != -1) {
            this.zza.zzh(zzc2);
            j4 = 0;
        } else {
            j4 = -9223372036854775807L;
        }
        if (j4 != -9223372036854775807L) {
            j6 = j4;
            j5 = j6;
        } else {
            j5 = this.zza.zze;
            j6 = -9223372036854775807L;
        }
        if (j5 != -9223372036854775807L && j7 >= j5) {
            j7 = Math.max(0, j5 - 1);
        }
        return new zzji(zzsh, j7, j2, j6, j5, false, zzC, zzA, zzz);
    }

    private static zzsh zzx(zzcn zzcn, Object obj, long j, long j2, zzcm zzcm, zzck zzck) {
        zzcn.zzn(obj, zzck);
        zzcn.zze(zzck.zzd, zzcm, 0);
        zzcn.zza(obj);
        if (zzck.zze == 0) {
            zzck.zzb();
        }
        zzcn.zzn(obj, zzck);
        int zzd2 = zzck.zzd(j);
        if (zzd2 == -1) {
            return new zzsh(obj, j2, zzck.zzc(j));
        }
        return new zzsh(obj, zzd2, zzck.zze(zzd2), j2);
    }

    private final void zzy() {
        zzsh zzsh;
        zzgar zzi2 = zzgau.zzi();
        for (zzjh zzjh = this.zzh; zzjh != null; zzjh = zzjh.zzg()) {
            zzi2.zze(zzjh.zzf.zza);
        }
        zzjh zzjh2 = this.zzi;
        if (zzjh2 == null) {
            zzsh = null;
        } else {
            zzsh = zzjh2.zzf.zza;
        }
        this.zzd.post(new zzjj(this, zzi2, zzsh));
    }

    private final boolean zzz(zzcn zzcn, zzsh zzsh, boolean z) {
        int zza2 = zzcn.zza(zzsh.zza);
        if (!zzcn.zze(zzcn.zzd(zza2, this.zza, false).zzd, this.zzb, 0).zzi) {
            if (zzcn.zzi(zza2, this.zza, this.zzb, this.zzf, this.zzg) != -1 || !z) {
                return false;
            }
            return true;
        }
        return false;
    }

    public final zzjh zza() {
        zzjh zzjh = this.zzh;
        if (zzjh == null) {
            return null;
        }
        if (zzjh == this.zzi) {
            this.zzi = zzjh.zzg();
        }
        zzjh.zzn();
        int i = this.zzk - 1;
        this.zzk = i;
        if (i == 0) {
            this.zzj = null;
            zzjh zzjh2 = this.zzh;
            this.zzl = zzjh2.zzb;
            this.zzm = zzjh2.zzf.zza.zzd;
        }
        this.zzh = this.zzh.zzg();
        zzy();
        return this.zzh;
    }

    public final zzjh zzb() {
        zzjh zzjh = this.zzi;
        boolean z = false;
        if (!(zzjh == null || zzjh.zzg() == null)) {
            z = true;
        }
        zzdd.zzf(z);
        this.zzi = this.zzi.zzg();
        zzy();
        return this.zzi;
    }

    public final zzjh zzc() {
        return this.zzj;
    }

    public final zzjh zzd() {
        return this.zzh;
    }

    public final zzjh zze() {
        return this.zzi;
    }

    public final zzji zzf(long j, zzjs zzjs) {
        zzjh zzjh = this.zzj;
        if (zzjh != null) {
            return zzt(zzjs.zza, zzjh, j);
        }
        return zzu(zzjs.zza, zzjs.zzb, zzjs.zzc, zzjs.zzr);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x005d  */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0065  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.google.android.gms.internal.ads.zzji zzg(com.google.android.gms.internal.ads.zzcn r19, com.google.android.gms.internal.ads.zzji r20) {
        /*
            r18 = this;
            r0 = r18
            r1 = r19
            r2 = r20
            com.google.android.gms.internal.ads.zzsh r3 = r2.zza
            boolean r12 = zzC(r3)
            boolean r13 = r0.zzA(r1, r3)
            boolean r14 = r0.zzz(r1, r3, r12)
            com.google.android.gms.internal.ads.zzsh r4 = r2.zza
            java.lang.Object r4 = r4.zza
            com.google.android.gms.internal.ads.zzck r5 = r0.zza
            r1.zzn(r4, r5)
            boolean r1 = r3.zzb()
            r4 = -1
            r5 = 0
            r7 = -9223372036854775807(0x8000000000000001, double:-4.9E-324)
            if (r1 != 0) goto L_0x0037
            int r1 = r3.zze
            if (r1 != r4) goto L_0x0030
            goto L_0x0037
        L_0x0030:
            com.google.android.gms.internal.ads.zzck r9 = r0.zza
            r9.zzh(r1)
            r9 = r5
            goto L_0x0038
        L_0x0037:
            r9 = r7
        L_0x0038:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x004b
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r5 = r3.zzb
            int r6 = r3.zzc
            long r5 = r1.zzg(r5, r6)
        L_0x0048:
            r7 = r9
            r9 = r5
            goto L_0x0057
        L_0x004b:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 == 0) goto L_0x0052
            r7 = r5
            r9 = r7
            goto L_0x0057
        L_0x0052:
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            long r5 = r1.zze
            goto L_0x0048
        L_0x0057:
            boolean r1 = r3.zzb()
            if (r1 == 0) goto L_0x0065
            com.google.android.gms.internal.ads.zzck r1 = r0.zza
            int r4 = r3.zzb
            r1.zzl(r4)
            goto L_0x006e
        L_0x0065:
            int r1 = r3.zze
            if (r1 == r4) goto L_0x006e
            com.google.android.gms.internal.ads.zzck r4 = r0.zza
            r4.zzl(r1)
        L_0x006e:
            com.google.android.gms.internal.ads.zzji r15 = new com.google.android.gms.internal.ads.zzji
            long r4 = r2.zzb
            long r1 = r2.zzc
            r11 = 0
            r16 = r1
            r1 = r15
            r2 = r3
            r3 = r4
            r5 = r16
            r1.<init>(r2, r3, r5, r7, r9, r11, r12, r13, r14)
            return r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.zzjk.zzg(com.google.android.gms.internal.ads.zzcn, com.google.android.gms.internal.ads.zzji):com.google.android.gms.internal.ads.zzji");
    }

    public final zzsh zzh(zzcn zzcn, Object obj, long j) {
        long j2;
        int zza2;
        int i = zzcn.zzn(obj, this.zza).zzd;
        Object obj2 = this.zzl;
        if (obj2 == null || (zza2 = zzcn.zza(obj2)) == -1 || zzcn.zzd(zza2, this.zza, false).zzd != i) {
            zzjh zzjh = this.zzh;
            while (true) {
                if (zzjh == null) {
                    zzjh zzjh2 = this.zzh;
                    while (true) {
                        if (zzjh2 != null) {
                            int zza3 = zzcn.zza(zzjh2.zzb);
                            if (zza3 != -1 && zzcn.zzd(zza3, this.zza, false).zzd == i) {
                                j2 = zzjh2.zzf.zza.zzd;
                                break;
                            }
                            zzjh2 = zzjh2.zzg();
                        } else {
                            j2 = this.zze;
                            this.zze = 1 + j2;
                            if (this.zzh == null) {
                                this.zzl = obj;
                                this.zzm = j2;
                            }
                        }
                    }
                } else if (zzjh.zzb.equals(obj)) {
                    j2 = zzjh.zzf.zza.zzd;
                    break;
                } else {
                    zzjh = zzjh.zzg();
                }
            }
        } else {
            j2 = this.zzm;
        }
        long j3 = j2;
        zzcn.zzn(obj, this.zza);
        zzcn.zze(this.zza.zzd, this.zzb, 0);
        int zza4 = zzcn.zza(obj);
        Object obj3 = obj;
        while (true) {
            zzcm zzcm = this.zzb;
            if (zza4 < zzcm.zzo) {
                return zzx(zzcn, obj3, j, j3, zzcm, this.zza);
            }
            zzcn.zzd(zza4, this.zza, true);
            this.zza.zzb();
            zzck zzck = this.zza;
            if (zzck.zzd(zzck.zze) == -1 || (obj3 = this.zza.zzc) != null) {
                zza4--;
            } else {
                throw null;
            }
        }
    }

    public final void zzi() {
        if (this.zzk != 0) {
            zzjh zzjh = this.zzh;
            zzdd.zzb(zzjh);
            this.zzl = zzjh.zzb;
            this.zzm = zzjh.zzf.zza.zzd;
            while (zzjh != null) {
                zzjh.zzn();
                zzjh = zzjh.zzg();
            }
            this.zzh = null;
            this.zzj = null;
            this.zzi = null;
            this.zzk = 0;
            zzy();
        }
    }

    /* access modifiers changed from: package-private */
    public final /* synthetic */ void zzj(zzgar zzgar, zzsh zzsh) {
        this.zzc.zzT(zzgar.zzg(), zzsh);
    }

    public final void zzk(long j) {
        zzjh zzjh = this.zzj;
        if (zzjh != null) {
            zzjh.zzm(j);
        }
    }

    public final boolean zzl(zzsf zzsf) {
        zzjh zzjh = this.zzj;
        return zzjh != null && zzjh.zza == zzsf;
    }

    public final boolean zzm(zzjh zzjh) {
        boolean z = false;
        zzdd.zzf(zzjh != null);
        if (zzjh.equals(this.zzj)) {
            return false;
        }
        this.zzj = zzjh;
        while (zzjh.zzg() != null) {
            zzjh = zzjh.zzg();
            if (zzjh == this.zzi) {
                this.zzi = this.zzh;
                z = true;
            }
            zzjh.zzn();
            this.zzk--;
        }
        this.zzj.zzo((zzjh) null);
        zzy();
        return z;
    }

    public final boolean zzn() {
        zzjh zzjh = this.zzj;
        if (zzjh != null) {
            return !zzjh.zzf.zzi && zzjh.zzr() && this.zzj.zzf.zze != -9223372036854775807L && this.zzk < 100;
        }
        return true;
    }

    public final boolean zzo(zzcn zzcn, long j, long j2) {
        zzji zzji;
        long j3;
        boolean z;
        zzcn zzcn2 = zzcn;
        zzjh zzjh = this.zzh;
        zzjh zzjh2 = null;
        while (zzjh != null) {
            zzji zzji2 = zzjh.zzf;
            if (zzjh2 == null) {
                zzji = zzg(zzcn2, zzji2);
                long j4 = j;
            } else {
                zzji zzt = zzt(zzcn2, zzjh2, j);
                if (zzt == null) {
                    return !zzm(zzjh2);
                }
                if (zzji2.zzb != zzt.zzb || !zzji2.zza.equals(zzt.zza)) {
                    return !zzm(zzjh2);
                }
                zzji = zzt;
            }
            zzjh.zzf = zzji.zza(zzji2.zzc);
            long j5 = zzji2.zze;
            long j6 = zzji.zze;
            if (j5 == -9223372036854775807L || j5 == j6) {
                zzjh2 = zzjh;
                zzjh = zzjh.zzg();
            } else {
                zzjh.zzq();
                long j7 = zzji.zze;
                if (j7 == -9223372036854775807L) {
                    j3 = Long.MAX_VALUE;
                } else {
                    j3 = j7 + zzjh.zze();
                }
                if (zzjh == this.zzi) {
                    boolean z2 = zzjh.zzf.zzf;
                    if (j2 == Long.MIN_VALUE || j2 >= j3) {
                        z = true;
                        return zzm(zzjh) && !z;
                    }
                }
                z = false;
                if (zzm(zzjh)) {
                }
            }
        }
        return true;
    }

    public final boolean zzp(zzcn zzcn, int i) {
        this.zzf = i;
        return zzB(zzcn);
    }

    public final boolean zzq(zzcn zzcn, boolean z) {
        this.zzg = z;
        return zzB(zzcn);
    }

    public final zzjh zzr(zzjz[] zzjzArr, zzvz zzvz, zzwi zzwi, zzjr zzjr, zzji zzji, zzwa zzwa) {
        long j;
        zzjh zzjh = this.zzj;
        if (zzjh == null) {
            j = 1000000000000L;
            zzji zzji2 = zzji;
        } else {
            j = (zzjh.zze() + zzjh.zzf.zze) - zzji.zzb;
        }
        zzjh zzjh2 = new zzjh(zzjzArr, j, zzvz, zzwi, zzjr, zzji, zzwa, (byte[]) null);
        zzjh zzjh3 = this.zzj;
        if (zzjh3 != null) {
            zzjh3.zzo(zzjh2);
        } else {
            this.zzh = zzjh2;
            this.zzi = zzjh2;
        }
        this.zzl = null;
        this.zzj = zzjh2;
        this.zzk++;
        zzy();
        return zzjh2;
    }
}
