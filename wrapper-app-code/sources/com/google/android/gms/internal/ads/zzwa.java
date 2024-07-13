package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzwa {
    public final int zza;
    public final zzka[] zzb;
    public final zzvt[] zzc;
    public final zzcy zzd;
    public final Object zze;

    public zzwa(zzka[] zzkaArr, zzvt[] zzvtArr, zzcy zzcy, Object obj) {
        this.zzb = zzkaArr;
        this.zzc = (zzvt[]) zzvtArr.clone();
        this.zzd = zzcy;
        this.zze = obj;
        this.zza = zzkaArr.length;
    }

    public final boolean zza(zzwa zzwa, int i) {
        if (zzwa != null && zzen.zzT(this.zzb[i], zzwa.zzb[i]) && zzen.zzT(this.zzc[i], zzwa.zzc[i])) {
            return true;
        }
        return false;
    }

    public final boolean zzb(int i) {
        return this.zzb[i] != null;
    }
}
