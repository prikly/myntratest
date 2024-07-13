package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzoi {
    private final zzne[] zza;
    private final zzpa zzb;
    private final zzpc zzc;

    public zzoi(zzne... zzneArr) {
        zzpa zzpa = new zzpa();
        zzpc zzpc = new zzpc();
        zzne[] zzneArr2 = new zzne[2];
        this.zza = zzneArr2;
        System.arraycopy(zzneArr, 0, zzneArr2, 0, 0);
        this.zzb = zzpa;
        this.zzc = zzpc;
        zzne[] zzneArr3 = this.zza;
        zzneArr3[0] = zzpa;
        zzneArr3[1] = zzpc;
    }

    public final long zza(long j) {
        return this.zzc.zzi(j);
    }

    public final long zzb() {
        return this.zzb.zzo();
    }

    public final zzby zzc(zzby zzby) {
        this.zzc.zzk(zzby.zzc);
        this.zzc.zzj(zzby.zzd);
        return zzby;
    }

    public final boolean zzd(boolean z) {
        this.zzb.zzp(z);
        return z;
    }

    public final zzne[] zze() {
        return this.zza;
    }
}
