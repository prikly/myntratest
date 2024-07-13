package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgac extends zzfzq {
    final /* synthetic */ zzgae zza;
    private final Object zzb;
    private int zzc;

    zzgac(zzgae zzgae, int i) {
        this.zza = zzgae;
        this.zzb = zzgae.zzg(zzgae, i);
        this.zzc = i;
    }

    private final void zza() {
        int i = this.zzc;
        if (i == -1 || i >= this.zza.size() || !zzfxz.zza(this.zzb, zzgae.zzg(this.zza, this.zzc))) {
            this.zzc = this.zza.zzv(this.zzb);
        }
    }

    public final Object getKey() {
        return this.zzb;
    }

    public final Object getValue() {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.get(this.zzb);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            return null;
        }
        return zzgae.zzj(this.zza, i);
    }

    public final Object setValue(Object obj) {
        Map zzl = this.zza.zzl();
        if (zzl != null) {
            return zzl.put(this.zzb, obj);
        }
        zza();
        int i = this.zzc;
        if (i == -1) {
            this.zza.put(this.zzb, obj);
            return null;
        }
        Object zzj = zzgae.zzj(this.zza, i);
        zzgae.zzm(this.zza, this.zzc, obj);
        return zzj;
    }
}
