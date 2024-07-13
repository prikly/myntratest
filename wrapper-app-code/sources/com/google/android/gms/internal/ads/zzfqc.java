package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfqc {
    private final String zza;
    private final String zzb;

    private zzfqc(String str, String str2) {
        this.zza = str;
        this.zzb = str2;
    }

    public static zzfqc zza(String str, String str2) {
        zzfra.zza(str, "Name is null or empty");
        zzfra.zza(str2, "Version is null or empty");
        return new zzfqc(str, str2);
    }

    public final String zzb() {
        return this.zza;
    }

    public final String zzc() {
        return this.zzb;
    }
}
