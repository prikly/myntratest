package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzayy extends zzato {
    private static final Object zzb = new Object();
    private final long zzc;
    private final long zzd;

    public zzayy(long j, boolean z) {
        this.zzc = j;
        this.zzd = j;
    }

    public final int zza(Object obj) {
        return zzb.equals(obj) ? 0 : -1;
    }

    public final int zzb() {
        return 1;
    }

    public final int zzc() {
        return 1;
    }

    public final zzatm zzd(int i, zzatm zzatm, boolean z) {
        zzbaj.zza(i, 0, 1);
        Object obj = z ? zzb : null;
        long j = this.zzc;
        zzatm.zza = obj;
        zzatm.zzb = obj;
        zzatm.zzc = j;
        return zzatm;
    }

    public final zzatn zze(int i, zzatn zzatn, boolean z, long j) {
        zzbaj.zza(i, 0, 1);
        zzatn.zza = this.zzd;
        return zzatn;
    }
}
