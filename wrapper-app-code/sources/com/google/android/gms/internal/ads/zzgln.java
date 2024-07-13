package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgln extends zzghb {
    private final zzgmg zza;

    public zzgln(zzgmg zzgmg) {
        this.zza = zzgmg;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zzgln)) {
            return false;
        }
        zzgmg zzgmg = ((zzgln) obj).zza;
        if (!this.zza.zzb().zze().equals(zzgmg.zzb().zze()) || !this.zza.zzb().zzg().equals(zzgmg.zzb().zzg()) || !this.zza.zzb().zzf().equals(zzgmg.zzb().zzf())) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        zzgmg zzgmg = this.zza;
        return Arrays.hashCode(new Object[]{zzgmg.zzb(), zzgmg.zzd()});
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza.zzb().zzg();
        zzguc zze = this.zza.zzb().zze();
        zzguc zzguc = zzguc.UNKNOWN_PREFIX;
        int ordinal = zze.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }

    public final zzgmg zza() {
        return this.zza;
    }
}
