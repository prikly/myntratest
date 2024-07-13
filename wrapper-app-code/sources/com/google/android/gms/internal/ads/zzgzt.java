package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzt {
    private static final zzgzs zza;
    private static final zzgzs zzb = new zzgzs();

    static {
        zzgzs zzgzs;
        try {
            zzgzs = (zzgzs) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgzs = null;
        }
        zza = zzgzs;
    }

    static zzgzs zza() {
        return zza;
    }

    static zzgzs zzb() {
        return zzb;
    }
}
