package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgll extends zzghb {
    private final String zza;
    private final zzguc zzb;

    /* synthetic */ zzgll(String str, zzguc zzguc, zzglk zzglk) {
        this.zza = str;
        this.zzb = zzguc;
    }

    public final String toString() {
        Object[] objArr = new Object[2];
        objArr[0] = this.zza;
        zzguc zzguc = this.zzb;
        zzgsv zzgsv = zzgsv.UNKNOWN_KEYMATERIAL;
        zzguc zzguc2 = zzguc.UNKNOWN_PREFIX;
        int ordinal = zzguc.ordinal();
        objArr[1] = ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? "UNKNOWN" : "CRUNCHY" : "RAW" : "LEGACY" : "TINK";
        return String.format("(typeUrl=%s, outputPrefixType=%s)", objArr);
    }
}
