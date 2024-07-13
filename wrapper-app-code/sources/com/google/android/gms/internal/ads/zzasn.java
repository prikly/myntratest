package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzasn implements zzati, zzatj {
    private final int zza;
    private zzatk zzb;
    private int zzc;
    private int zzd;
    private zzayv zze;
    private long zzf;
    private boolean zzg = true;
    private boolean zzh;

    public zzasn(int i) {
        this.zza = i;
    }

    public final boolean zzA() {
        return this.zzg;
    }

    public final boolean zzB() {
        return this.zzh;
    }

    /* access modifiers changed from: protected */
    public final boolean zzC() {
        return this.zzg ? this.zzh : this.zze.zze();
    }

    /* access modifiers changed from: protected */
    public final int zza() {
        return this.zzc;
    }

    public final int zzb() {
        return this.zzd;
    }

    public final int zzc() {
        return this.zza;
    }

    /* access modifiers changed from: protected */
    public final int zzd(zzate zzate, zzauy zzauy, boolean z) {
        zzate zzate2 = zzate;
        zzauy zzauy2 = zzauy;
        int zzb2 = this.zze.zzb(zzate2, zzauy2, z);
        if (zzb2 == -4) {
            if (zzauy.zzf()) {
                this.zzg = true;
                return this.zzh ? -4 : -3;
            }
            zzauy2.zzc += this.zzf;
        } else if (zzb2 == -5) {
            zzatd zzatd = zzate2.zza;
            long j = zzatd.zzw;
            if (j != Long.MAX_VALUE) {
                zzate2.zza = new zzatd(zzatd.zza, zzatd.zze, zzatd.zzf, zzatd.zzc, zzatd.zzb, zzatd.zzg, zzatd.zzj, zzatd.zzk, zzatd.zzl, zzatd.zzm, zzatd.zzn, zzatd.zzp, zzatd.zzo, zzatd.zzq, zzatd.zzr, zzatd.zzs, zzatd.zzt, zzatd.zzu, zzatd.zzv, zzatd.zzx, zzatd.zzy, zzatd.zzz, j + this.zzf, zzatd.zzh, zzatd.zzi, zzatd.zzd);
                return -5;
            }
        }
        return zzb2;
    }

    public int zze() throws zzasp {
        throw null;
    }

    public final zzatj zzf() {
        return this;
    }

    /* access modifiers changed from: protected */
    public final zzatk zzg() {
        return this.zzb;
    }

    public final zzayv zzh() {
        return this.zze;
    }

    public zzban zzi() {
        return null;
    }

    public final void zzj() {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzbaj.zze(z);
        this.zzd = 0;
        this.zze = null;
        this.zzh = false;
        zzn();
    }

    public final void zzk(zzatk zzatk, zzatd[] zzatdArr, zzayv zzayv, long j, boolean z, long j2) throws zzasp {
        zzbaj.zze(this.zzd == 0);
        this.zzb = zzatk;
        this.zzd = 1;
        zzo(z);
        zzt(zzatdArr, zzayv, j2);
        zzp(j, z);
    }

    public void zzl(int i, Object obj) throws zzasp {
    }

    public final void zzm() throws IOException {
        this.zze.zzc();
    }

    /* access modifiers changed from: protected */
    public void zzn() {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzo(boolean z) throws zzasp {
    }

    /* access modifiers changed from: protected */
    public void zzp(long j, boolean z) throws zzasp {
        throw null;
    }

    /* access modifiers changed from: protected */
    public void zzq() throws zzasp {
    }

    /* access modifiers changed from: protected */
    public void zzr() throws zzasp {
    }

    /* access modifiers changed from: protected */
    public void zzs(zzatd[] zzatdArr, long j) throws zzasp {
    }

    public final void zzt(zzatd[] zzatdArr, zzayv zzayv, long j) throws zzasp {
        zzbaj.zze(!this.zzh);
        this.zze = zzayv;
        this.zzg = false;
        this.zzf = j;
        zzs(zzatdArr, j);
    }

    public final void zzu(long j) throws zzasp {
        this.zzh = false;
        this.zzg = false;
        zzp(j, false);
    }

    public final void zzv() {
        this.zzh = true;
    }

    public final void zzw(int i) {
        this.zzc = i;
    }

    /* access modifiers changed from: protected */
    public final void zzx(long j) {
        this.zze.zzd(j - this.zzf);
    }

    public final void zzy() throws zzasp {
        boolean z = true;
        if (this.zzd != 1) {
            z = false;
        }
        zzbaj.zze(z);
        this.zzd = 2;
        zzq();
    }

    public final void zzz() throws zzasp {
        zzbaj.zze(this.zzd == 2);
        this.zzd = 1;
        zzr();
    }
}
