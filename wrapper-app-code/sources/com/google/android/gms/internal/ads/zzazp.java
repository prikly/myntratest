package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzazp {
    public final zzaza zza;
    public final zzazm zzb;
    public final Object zzc;
    public final zzatk[] zzd;

    public zzazp(zzaza zzaza, zzazm zzazm, Object obj, zzatk[] zzatkArr) {
        this.zza = zzaza;
        this.zzb = zzazm;
        this.zzc = obj;
        this.zzd = zzatkArr;
    }

    public final boolean zza(zzazp zzazp, int i) {
        if (zzazp != null && zzbay.zzo(this.zzb.zza(i), zzazp.zzb.zza(i)) && zzbay.zzo(this.zzd[i], zzazp.zzd[i])) {
            return true;
        }
        return false;
    }
}
