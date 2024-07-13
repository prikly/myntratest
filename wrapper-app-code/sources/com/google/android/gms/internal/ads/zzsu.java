package com.google.android.gms.internal.ads;

import com.ironsource.mediationsdk.logger.IronSourceError;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzsu implements zzvt {
    private final zzvt zza;
    private final zzcp zzb;

    public zzsu(zzvt zzvt, zzcp zzcp) {
        this.zza = zzvt;
        this.zzb = zzcp;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzsu)) {
            return false;
        }
        zzsu zzsu = (zzsu) obj;
        return this.zza.equals(zzsu.zza) && this.zzb.equals(zzsu.zzb);
    }

    public final int hashCode() {
        return ((this.zzb.hashCode() + IronSourceError.ERROR_NON_EXISTENT_INSTANCE) * 31) + this.zza.hashCode();
    }

    public final int zza(int i) {
        return this.zza.zza(0);
    }

    public final int zzb(int i) {
        return this.zza.zzb(i);
    }

    public final int zzc() {
        return this.zza.zzc();
    }

    public final zzaf zzd(int i) {
        return this.zza.zzd(i);
    }

    public final zzcp zze() {
        return this.zzb;
    }
}
