package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzawe {
    public final int zza;
    public int zzb;
    public int zzc;
    public long zzd;
    private final boolean zze;
    private final zzbar zzf;
    private final zzbar zzg;
    private int zzh;
    private int zzi;

    public zzawe(zzbar zzbar, zzbar zzbar2, boolean z) {
        this.zzg = zzbar;
        this.zzf = zzbar2;
        this.zze = z;
        zzbar2.zzv(12);
        this.zza = zzbar2.zzi();
        zzbar.zzv(12);
        this.zzi = zzbar.zzi();
        zzbaj.zzf(zzbar.zze() != 1 ? false : true, "first_chunk must be 1");
        this.zzb = -1;
    }

    public final boolean zza() {
        long j;
        int i = this.zzb + 1;
        this.zzb = i;
        if (i == this.zza) {
            return false;
        }
        if (this.zze) {
            j = this.zzf.zzn();
        } else {
            j = this.zzf.zzm();
        }
        this.zzd = j;
        if (this.zzb == this.zzh) {
            this.zzc = this.zzg.zzi();
            this.zzg.zzw(4);
            int i2 = -1;
            int i3 = this.zzi - 1;
            this.zzi = i3;
            if (i3 > 0) {
                i2 = -1 + this.zzg.zzi();
            }
            this.zzh = i2;
        }
        return true;
    }
}
