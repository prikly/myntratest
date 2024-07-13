package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgnc extends zzgoc {
    private final int zza;
    private final int zzb;
    private final zzgna zzc;

    /* synthetic */ zzgnc(int i, int i2, zzgna zzgna, zzgnb zzgnb) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = zzgna;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgnc)) {
            return false;
        }
        zzgnc zzgnc = (zzgnc) obj;
        if (zzgnc.zza == this.zza && zzgnc.zzb() == zzb() && zzgnc.zzc == this.zzc) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.zzb), this.zzc});
    }

    public final String toString() {
        String valueOf = String.valueOf(this.zzc);
        int i = this.zzb;
        int i2 = this.zza;
        return "AES-CMAC Parameters (variant: " + valueOf + ", " + i + "-byte tags, and " + i2 + "-byte key)";
    }

    public final int zza() {
        return this.zza;
    }

    public final int zzb() {
        zzgna zzgna = this.zzc;
        if (zzgna == zzgna.zzd) {
            return this.zzb;
        }
        if (zzgna == zzgna.zza || zzgna == zzgna.zzb || zzgna == zzgna.zzc) {
            return this.zzb + 5;
        }
        throw new IllegalStateException("Unknown variant");
    }

    public final zzgna zzc() {
        return this.zzc;
    }

    public final boolean zzd() {
        return this.zzc != zzgna.zzd;
    }
}
