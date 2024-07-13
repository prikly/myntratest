package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgnu extends zzgoc {
    private final int zza;
    private final int zzb;
    private final zzgns zzc;
    private final zzgnr zzd;

    /* synthetic */ zzgnu(int i, int i2, zzgns zzgns, zzgnr zzgnr, zzgnt zzgnt) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgns;
        this.zzd = zzgnr;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnu)) {
            return false;
        }
        zzgnu zzgnu = (zzgnu) obj;
        if (zzgnu.zza == this.zza && zzgnu.zzb() == zzb() && zzgnu.zzc == this.zzc && zzgnu.zzd == this.zzd) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc, this.zzd});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        String valueOf2 = String.valueOf(this.zzd);
        int i = this.zzb;
        int i2 = this.zza;
        return "HMAC Parameters (variant: " + valueOf + ", hashType: " + valueOf2 + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgns zzgns = this.zzc;
        if (zzgns == zzgns.zzd) {
            return this.zzb;
        }
        if (zzgns == zzgns.zza || zzgns == zzgns.zzb || zzgns == zzgns.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgns zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgns.zzd;
    }
}
