package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzaan {
    public static final zzaan zza = new zzaan(0, 0);
    public final long zzb;
    public final long zzc;

    public zzaan(long j, long j2) {
        this.zzb = j;
        this.zzc = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            zzaan zzaan = (zzaan) obj;
            return this.zzb == zzaan.zzb && this.zzc == zzaan.zzc;
        }
    }

    public final int hashCode() {
        return (((int) this.zzb) * 31) + ((int) this.zzc);
    }

    public final String toString() {
        long j = this.zzb;
        long j2 = this.zzc;
        return "[timeUs=" + j + ", position=" + j2 + "]";
    }
}
