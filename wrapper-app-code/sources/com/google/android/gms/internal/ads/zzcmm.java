package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcmm implements zzjf {
    private final zzwi zza = new zzwi(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcmm() {
    }

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        zzj(false);
    }

    public final void zzc() {
        zzj(true);
    }

    public final void zzd() {
        zzj(true);
    }

    public final void zze(zzjy[] zzjyArr, zzug zzug, zzvt[] zzvtArr) {
        int i = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjyArr.length;
            if (i < 2) {
                if (zzvtArr[i] != null) {
                    this.zzf += zzjyArr[i].zzb() != 1 ? 131072000 : 13107200;
                }
                i++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j, long j2, float f2) {
        boolean z = true;
        char c2 = j2 > this.zzc ? 0 : j2 < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (c2 != 2 && (c2 != 1 || !this.zzg || zza2 >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final boolean zzh(long j, float f2, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    public final zzwi zzi() {
        return this.zza;
    }

    /* access modifiers changed from: package-private */
    public final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = ((long) i) * 1000;
    }
}
