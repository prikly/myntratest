package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzgnr {
    public static final zzgnr zza = new zzgnr("SHA1");
    public static final zzgnr zzb = new zzgnr("SHA224");
    public static final zzgnr zzc = new zzgnr("SHA256");
    public static final zzgnr zzd = new zzgnr("SHA384");
    public static final zzgnr zze = new zzgnr("SHA512");
    private final String zzf;

    private zzgnr(String str) {
        this.zzf = str;
    }

    public final String toString() {
        return this.zzf;
    }
}
