package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqp {
    zzbnm zza;
    zzbnj zzb;
    zzbnz zzc;
    zzbnw zzd;
    zzbsu zze;
    final SimpleArrayMap zzf = new SimpleArrayMap();
    final SimpleArrayMap zzg = new SimpleArrayMap();

    public final zzdqp zza(zzbnj zzbnj) {
        this.zzb = zzbnj;
        return this;
    }

    public final zzdqp zzb(zzbnm zzbnm) {
        this.zza = zzbnm;
        return this;
    }

    public final zzdqp zzc(String str, zzbns zzbns, zzbnp zzbnp) {
        this.zzf.put(str, zzbns);
        if (zzbnp != null) {
            this.zzg.put(str, zzbnp);
        }
        return this;
    }

    public final zzdqp zzd(zzbsu zzbsu) {
        this.zze = zzbsu;
        return this;
    }

    public final zzdqp zze(zzbnw zzbnw) {
        this.zzd = zzbnw;
        return this;
    }

    public final zzdqp zzf(zzbnz zzbnz) {
        this.zzc = zzbnz;
        return this;
    }

    public final zzdqr zzg() {
        return new zzdqr(this);
    }
}
