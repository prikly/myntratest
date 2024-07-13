package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzfsf extends zzfsb {
    private final String zza;
    private final boolean zzb;
    private final boolean zzc;

    /* synthetic */ zzfsf(String str, boolean z, boolean z2, zzfse zzfse) {
        this.zza = str;
        this.zzb = z;
        this.zzc = z2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof zzfsb) {
            zzfsb zzfsb = (zzfsb) obj;
            return this.zza.equals(zzfsb.zzb()) && this.zzb == zzfsb.zzd() && this.zzc == zzfsb.zzc();
        }
    }

    public final int hashCode() {
        int i = 1237;
        int hashCode = (((this.zza.hashCode() ^ 1000003) * 1000003) ^ (true != this.zzb ? 1237 : 1231)) * 1000003;
        if (true == this.zzc) {
            i = 1231;
        }
        return hashCode ^ i;
    }

    public final String toString() {
        String str = this.zza;
        boolean z = this.zzb;
        boolean z2 = this.zzc;
        return "AdShield2Options{clientVersion=" + str + ", shouldGetAdvertisingId=" + z + ", isGooglePlayServicesAvailable=" + z2 + "}";
    }

    public final String zzb() {
        return this.zza;
    }

    public final boolean zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzb;
    }
}
