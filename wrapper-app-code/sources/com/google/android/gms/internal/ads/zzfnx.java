package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfnx {
    public final String zza;
    public final String zzb;

    public zzfnx(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zzfnx)) {
            return false;
        }
        zzfnx zzfnx = (zzfnx) obj;
        return this.zza.equals(zzfnx.zza) && this.zzb.equals(zzfnx.zzb);
    }

    public final int hashCode() {
        return String.valueOf(this.zza).concat(String.valueOf(this.zzb)).hashCode();
    }
}
