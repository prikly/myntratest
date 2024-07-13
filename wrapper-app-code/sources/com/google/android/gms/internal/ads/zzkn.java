package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzkn {
    public final long zza;
    public final zzcn zzb;
    public final int zzc;
    public final zzsh zzd;
    public final long zze;
    public final zzcn zzf;
    public final int zzg;
    public final zzsh zzh;
    public final long zzi;
    public final long zzj;

    public zzkn(long j, zzcn zzcn, int i, zzsh zzsh, long j2, zzcn zzcn2, int i2, zzsh zzsh2, long j3, long j4) {
        this.zza = j;
        this.zzb = zzcn;
        this.zzc = i;
        this.zzd = zzsh;
        this.zze = j2;
        this.zzf = zzcn2;
        this.zzg = i2;
        this.zzh = zzsh2;
        this.zzi = j3;
        this.zzj = j4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzkn zzkn = (zzkn) obj;
            return this.zza == zzkn.zza && this.zzc == zzkn.zzc && this.zze == zzkn.zze && this.zzg == zzkn.zzg && this.zzi == zzkn.zzi && this.zzj == zzkn.zzj && zzfxz.zza(this.zzb, zzkn.zzb) && zzfxz.zza(this.zzd, zzkn.zzd) && zzfxz.zza(this.zzf, zzkn.zzf) && zzfxz.zza(this.zzh, zzkn.zzh);
        }
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Long.valueOf(this.zza), this.zzb, Integer.valueOf(this.zzc), this.zzd, Long.valueOf(this.zze), this.zzf, Integer.valueOf(this.zzg), this.zzh, Long.valueOf(this.zzi), Long.valueOf(this.zzj)});
    }
}
