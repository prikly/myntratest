package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzaba implements zzaam {
    final /* synthetic */ zzabd zza;
    private final long zzb;

    public zzaba(zzabd zzabd, long j) {
        this.zza = zzabd;
        this.zzb = j;
    }

    public final long zze() {
        return this.zzb;
    }

    public final zzaak zzg(long j) {
        zzaak zza2 = this.zza.zzg[0].zza(j);
        int i = 1;
        while (true) {
            zzabd zzabd = this.zza;
            if (i >= zzabd.zzg.length) {
                return zza2;
            }
            zzaak zza3 = zzabd.zzg[i].zza(j);
            if (zza3.zza.zzc < zza2.zza.zzc) {
                zza2 = zza3;
            }
            i++;
        }
    }

    public final boolean zzh() {
        return true;
    }
}
