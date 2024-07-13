package com.google.android.gms.internal.ads;

import java.io.IOException;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
abstract class zzago {
    private final zzagh zza = new zzagh();
    private zzaaq zzb;
    private zzzm zzc;
    private zzagj zzd;
    private long zze;
    private long zzf;
    private long zzg;
    private int zzh;
    private int zzi;
    private zzagl zzj = new zzagl();
    private long zzk;
    private boolean zzl;
    private boolean zzm;

    /* access modifiers changed from: protected */
    public abstract long zza(zzef zzef);

    /* access modifiers changed from: protected */
    public void zzb(boolean z) {
        int i;
        if (z) {
            this.zzj = new zzagl();
            this.zzf = 0;
            i = 0;
        } else {
            i = 1;
        }
        this.zzh = i;
        this.zze = -1;
        this.zzg = 0;
    }

    /* access modifiers changed from: protected */
    public abstract boolean zzc(zzef zzef, long j, zzagl zzagl) throws IOException;

    /* access modifiers changed from: package-private */
    public final int zze(zzzk zzzk, zzaaj zzaaj) throws IOException {
        zzzk zzzk2 = zzzk;
        zzdd.zzb(this.zzb);
        int i = zzen.zza;
        int i2 = this.zzh;
        if (i2 == 0) {
            while (this.zza.zze(zzzk2)) {
                long zzf2 = zzzk.zzf();
                long j = this.zzf;
                this.zzk = zzf2 - j;
                if (zzc(this.zza.zza(), j, this.zzj)) {
                    this.zzf = zzzk.zzf();
                } else {
                    zzaf zzaf = this.zzj.zza;
                    this.zzi = zzaf.zzA;
                    if (!this.zzm) {
                        this.zzb.zzk(zzaf);
                        this.zzm = true;
                    }
                    zzagj zzagj = this.zzj.zzb;
                    if (zzagj != null) {
                        this.zzd = zzagj;
                    } else if (zzzk.zzd() == -1) {
                        this.zzd = new zzagn((zzagm) null);
                    } else {
                        zzagi zzb2 = this.zza.zzb();
                        this.zzd = new zzagc(this, this.zzf, zzzk.zzd(), (long) (zzb2.zzd + zzb2.zze), zzb2.zzb, (zzb2.zza & 4) != 0);
                    }
                    this.zzh = 2;
                    this.zza.zzd();
                    return 0;
                }
            }
            this.zzh = 3;
            return -1;
        } else if (i2 == 1) {
            ((zzyz) zzzk2).zzo((int) this.zzf, false);
            this.zzh = 2;
            return 0;
        } else if (i2 != 2) {
            return -1;
        } else {
            long zzd2 = this.zzd.zzd(zzzk2);
            if (zzd2 >= 0) {
                zzaaj.zza = zzd2;
                return 1;
            }
            if (zzd2 < -1) {
                zzi(-(zzd2 + 2));
            }
            if (!this.zzl) {
                zzaam zze2 = this.zzd.zze();
                zzdd.zzb(zze2);
                this.zzc.zzN(zze2);
                this.zzl = true;
            }
            if (this.zzk > 0 || this.zza.zze(zzzk2)) {
                this.zzk = 0;
                zzef zza2 = this.zza.zza();
                long zza3 = zza(zza2);
                if (zza3 >= 0) {
                    long j2 = this.zzg;
                    if (j2 + zza3 >= this.zze) {
                        long zzf3 = zzf(j2);
                        zzaao.zzb(this.zzb, zza2, zza2.zzd());
                        this.zzb.zzs(zzf3, 1, zza2.zzd(), 0, (zzaap) null);
                        this.zze = -1;
                    }
                }
                this.zzg += zza3;
                return 0;
            }
            this.zzh = 3;
            return -1;
        }
    }

    /* access modifiers changed from: protected */
    public final long zzf(long j) {
        return (j * 1000000) / ((long) this.zzi);
    }

    /* access modifiers changed from: protected */
    public final long zzg(long j) {
        return (((long) this.zzi) * j) / 1000000;
    }

    /* access modifiers changed from: package-private */
    public final void zzh(zzzm zzzm, zzaaq zzaaq) {
        this.zzc = zzzm;
        this.zzb = zzaaq;
        zzb(true);
    }

    /* access modifiers changed from: protected */
    public void zzi(long j) {
        this.zzg = j;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(long j, long j2) {
        this.zza.zzc();
        if (j == 0) {
            zzb(!this.zzl);
        } else if (this.zzh != 0) {
            this.zze = zzg(j2);
            zzagj zzagj = this.zzd;
            int i = zzen.zza;
            zzagj.zzg(this.zze);
            this.zzh = 2;
        }
    }
}
