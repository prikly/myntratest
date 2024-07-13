package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaak {
    public final zzaan zza;
    public final zzaan zzb;

    public zzaak(zzaan zzaan, zzaan zzaan2) {
        this.zza = zzaan;
        this.zzb = zzaan2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaak zzaak = (zzaak) obj;
            return this.zza.equals(zzaak.zza) && this.zzb.equals(zzaak.zzb);
        }
    }

    public final int hashCode() {
        return (this.zza.hashCode() * 31) + this.zzb.hashCode();
    }

    public final String toString() {
        String obj = this.zza.toString();
        String concat = this.zza.equals(this.zzb) ? "" : ", ".concat(this.zzb.toString());
        return "[" + obj + concat + "]";
    }
}
