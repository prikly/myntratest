package com.google.android.gms.internal.measurement;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@21.2.0 */
final class zzih extends zzig {
    private final Object zza;

    zzih(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzih) {
            return this.zza.equals(((zzih) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    public final Object zza() {
        return this.zza;
    }

    public final boolean zzb() {
        return true;
    }
}
