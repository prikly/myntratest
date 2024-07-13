package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzti {
    public final int zza;
    public final boolean zzb;

    public zzti(int i, boolean z) {
        this.zza = i;
        this.zzb = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzti zzti = (zzti) obj;
            return this.zza == zzti.zza && this.zzb == zzti.zzb;
        }
    }

    public final int hashCode() {
        return (this.zza * 31) + (this.zzb ? 1 : 0);
    }
}
