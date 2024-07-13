package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-base@@21.2.0 */
final class zzjq {
    private final Object zza;
    private final int zzb;

    zzjq(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzjq)) {
            return false;
        }
        zzjq zzjq = (zzjq) obj;
        if (this.zza == zzjq.zza && this.zzb == zzjq.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
