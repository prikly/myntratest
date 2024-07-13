package com.google.android.gms.internal.ads;

import androidx.collection.SimpleArrayMap;
import java.util.ArrayList;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdqr {
    public static final zzdqr zza = new zzdqr(new zzdqp());
    private final zzbnm zzb;
    private final zzbnj zzc;
    private final zzbnz zzd;
    private final zzbnw zze;
    private final zzbsu zzf;
    private final SimpleArrayMap zzg;
    private final SimpleArrayMap zzh;

    private zzdqr(zzdqp zzdqp) {
        this.zzb = zzdqp.zza;
        this.zzc = zzdqp.zzb;
        this.zzd = zzdqp.zzc;
        this.zzg = new SimpleArrayMap(zzdqp.zzf);
        this.zzh = new SimpleArrayMap(zzdqp.zzg);
        this.zze = zzdqp.zzd;
        this.zzf = zzdqp.zze;
    }

    public final zzbnj zza() {
        return this.zzc;
    }

    public final zzbnm zzb() {
        return this.zzb;
    }

    public final zzbnp zzc(String str) {
        return (zzbnp) this.zzh.get(str);
    }

    public final zzbns zzd(String str) {
        return (zzbns) this.zzg.get(str);
    }

    public final zzbnw zze() {
        return this.zze;
    }

    public final zzbnz zzf() {
        return this.zzd;
    }

    public final zzbsu zzg() {
        return this.zzf;
    }

    public final ArrayList zzh() {
        ArrayList arrayList = new ArrayList(this.zzg.size());
        for (int i = 0; i < this.zzg.size(); i++) {
            arrayList.add((String) this.zzg.keyAt(i));
        }
        return arrayList;
    }

    public final ArrayList zzi() {
        ArrayList arrayList = new ArrayList();
        if (this.zzd != null) {
            arrayList.add(Integer.toString(6));
        }
        if (this.zzb != null) {
            arrayList.add(Integer.toString(1));
        }
        if (this.zzc != null) {
            arrayList.add(Integer.toString(2));
        }
        if (!this.zzg.isEmpty()) {
            arrayList.add(Integer.toString(3));
        }
        if (this.zzf != null) {
            arrayList.add(Integer.toString(7));
        }
        return arrayList;
    }
}
