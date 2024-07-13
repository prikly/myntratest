package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcku {
    private final zzazw zza = new zzazw(true, 65536);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    zzcku() {
    }

    public final void zza() {
        zze(false);
    }

    public final void zzb() {
        zze(true);
    }

    public final void zzc() {
        zze(true);
    }

    public final void zzd(zzati[] zzatiArr, zzaza zzaza, zzazm zzazm) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzazm.zza(i) != null) {
                this.zzf += zzbay.zzf(zzatiArr[i].zzc());
            }
        }
        this.zza.zzf(this.zzf);
    }

    /* access modifiers changed from: package-private */
    public final void zze(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzf(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzg(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized boolean zzj(long j) {
        boolean z;
        z = true;
        char c2 = j > this.zzc ? 0 : j < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (c2 != 2) {
            if (c2 != 1 || !this.zzg || zza2 >= i) {
                z = false;
            }
        }
        this.zzg = z;
        return z;
    }

    public final synchronized boolean zzk(long j, boolean z) {
        long j2;
        j2 = z ? this.zze : this.zzd;
        return j2 <= 0 || j >= j2;
    }

    public final zzazw zzl() {
        return this.zza;
    }
}
