package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
final class zzfyj extends zzfya {
    private final Object zza;

    zzfyj(Object obj) {
        this.zza = obj;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof zzfyj) {
            return this.zza.equals(((zzfyj) obj).zza);
        }
        return false;
    }

    public final int hashCode() {
        return this.zza.hashCode() + 1502476572;
    }

    public final String toString() {
        return "Optional.of(" + this.zza + ")";
    }

    public final zzfya zza(zzfxt zzfxt) {
        Object apply = zzfxt.apply(this.zza);
        zzfye.zzc(apply, "the Function passed to Optional.transform() must not return null.");
        return new zzfyj(apply);
    }

    public final Object zzb(Object obj) {
        return this.zza;
    }
}
