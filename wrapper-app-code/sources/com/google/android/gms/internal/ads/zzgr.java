package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzgr implements zzjy, zzjz {
    private final int zza;
    private final zzje zzb = new zzje();
    private zzka zzc;
    private int zzd;
    private zzmz zze;
    private int zzf;
    private zzty zzg;
    private zzaf[] zzh;
    private long zzi;
    private long zzj = Long.MIN_VALUE;
    private boolean zzk;
    private boolean zzl;

    public zzgr(int i) {
        this.zza = i;
    }

    private final void zzP(long j, boolean z) throws zzha {
        this.zzk = false;
        this.zzj = j;
        zzu(j, z);
    }

    public final void zzA() {
        zzdd.zzf(this.zzf == 0);
        zzje zzje = this.zzb;
        zzje.zzb = null;
        zzje.zza = null;
        zzv();
    }

    public final void zzB(long j) throws zzha {
        zzP(j, false);
    }

    public final void zzC() {
        this.zzk = true;
    }

    public /* synthetic */ void zzD(float f2, float f3) {
    }

    public final void zzE() throws zzha {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzdd.zzf(z);
        this.zzf = 2;
        zzw();
    }

    public final void zzF() {
        zzdd.zzf(this.zzf == 2);
        this.zzf = 1;
        zzx();
    }

    public final boolean zzG() {
        return this.zzj == Long.MIN_VALUE;
    }

    public final boolean zzH() {
        return this.zzk;
    }

    /* access modifiers changed from: protected */
    public final zzaf[] zzJ() {
        zzaf[] zzafArr = this.zzh;
        if (zzafArr != null) {
            return zzafArr;
        }
        throw null;
    }

    public final int zzb() {
        return this.zza;
    }

    public final int zzbe() {
        return this.zzf;
    }

    /* access modifiers changed from: protected */
    public final int zzbf(zzje zzje, zzgi zzgi, int i) {
        zzty zzty = this.zzg;
        if (zzty != null) {
            int zza2 = zzty.zza(zzje, zzgi, i);
            if (zza2 == -4) {
                if (zzgi.zzg()) {
                    this.zzj = Long.MIN_VALUE;
                    return this.zzk ? -4 : -3;
                }
                long j = zzgi.zzd + this.zzi;
                zzgi.zzd = j;
                this.zzj = Math.max(this.zzj, j);
            } else if (zza2 == -5) {
                zzaf zzaf = zzje.zza;
                if (zzaf != null) {
                    long j2 = zzaf.zzq;
                    if (j2 != Long.MAX_VALUE) {
                        zzad zzb2 = zzaf.zzb();
                        zzb2.zzW(j2 + this.zzi);
                        zzje.zza = zzb2.zzY();
                        return -5;
                    }
                } else {
                    throw null;
                }
            }
            return zza2;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzha zzbg(Throwable th, zzaf zzaf, boolean z, int i) {
        int i2;
        if (zzaf != null && !this.zzl) {
            this.zzl = true;
            try {
                int zzO = zzO(zzaf) & 7;
                this.zzl = false;
                i2 = zzO;
            } catch (zzha unused) {
                this.zzl = false;
            } catch (Throwable th2) {
                this.zzl = false;
                throw th2;
            }
            return zzha.zzb(th, zzK(), this.zzd, zzaf, i2, z, i);
        }
        i2 = 4;
        return zzha.zzb(th, zzK(), this.zzd, zzaf, i2, z, i);
    }

    public int zze() throws zzha {
        return 0;
    }

    public final long zzf() {
        return this.zzj;
    }

    /* access modifiers changed from: protected */
    public final zzje zzh() {
        zzje zzje = this.zzb;
        zzje.zzb = null;
        zzje.zza = null;
        return zzje;
    }

    public zzjg zzi() {
        return null;
    }

    public final zzjz zzj() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzka zzk() {
        zzka zzka = this.zzc;
        if (zzka != null) {
            return zzka;
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final zzmz zzl() {
        zzmz zzmz = this.zze;
        if (zzmz != null) {
            return zzmz;
        }
        throw null;
    }

    public final zzty zzm() {
        return this.zzg;
    }

    public final void zzn() {
        boolean z = true;
        if (this.zzf != 1) {
            z = false;
        }
        zzdd.zzf(z);
        zzje zzje = this.zzb;
        zzje.zzb = null;
        zzje.zza = null;
        this.zzf = 0;
        this.zzg = null;
        this.zzh = null;
        this.zzk = false;
        zzs();
    }

    public final void zzo(zzka zzka, zzaf[] zzafArr, zzty zzty, long j, boolean z, boolean z2, long j2, long j3) throws zzha {
        boolean z3 = z;
        zzdd.zzf(this.zzf == 0);
        this.zzc = zzka;
        this.zzf = 1;
        zzt(z, z2);
        zzz(zzafArr, zzty, j2, j3);
        long j4 = j;
        zzP(j, z);
    }

    public void zzp(int i, Object obj) throws zzha {
    }

    public final void zzq(int i, zzmz zzmz) {
        this.zzd = i;
        this.zze = zzmz;
    }

    /* access modifiers changed from: protected */
    public void zzs() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzt(boolean z, boolean z2) throws zzha {
    }

    /* access modifiers changed from: protected */
    public void zzu(long j, boolean z) throws zzha {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzv() {
    }

    /* access modifiers changed from: protected */
    public void zzw() throws zzha {
    }

    /* access modifiers changed from: protected */
    public void zzx() {
    }

    /* access modifiers changed from: protected */
    public void zzy(zzaf[] zzafArr, long j, long j2) throws zzha {
        throw null;
    }

    public final void zzz(zzaf[] zzafArr, zzty zzty, long j, long j2) throws zzha {
        zzdd.zzf(!this.zzk);
        this.zzg = zzty;
        if (this.zzj == Long.MIN_VALUE) {
            this.zzj = j;
        }
        this.zzh = zzafArr;
        this.zzi = j2;
        zzy(zzafArr, j, j2);
    }

    /* access modifiers changed from: protected */
    public final boolean zzI() {
        if (zzG()) {
            return this.zzk;
        }
        zzty zzty = this.zzg;
        if (zzty != null) {
            return zzty.zze();
        }
        throw null;
    }

    /* access modifiers changed from: protected */
    public final int zzd(long j) {
        zzty zzty = this.zzg;
        if (zzty != null) {
            return zzty.zzb(j - this.zzi);
        }
        throw null;
    }

    public final void zzr() throws IOException {
        zzty zzty = this.zzg;
        if (zzty != null) {
            zzty.zzd();
            return;
        }
        throw null;
    }
}
