package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxo {
    private final Object zza;
    private final int zzb;

    zzgxo(Object obj, int i) {
        this.zza = obj;
        this.zzb = i;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgxo)) {
            return false;
        }
        zzgxo zzgxo = (zzgxo) obj;
        if (this.zza == zzgxo.zza && this.zzb == zzgxo.zzb) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (System.identityHashCode(this.zza) * 65535) + this.zzb;
    }
}
