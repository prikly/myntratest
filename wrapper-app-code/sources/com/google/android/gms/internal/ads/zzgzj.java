package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgzj {
    private static final zzgzi zza;
    private static final zzgzi zzb = new zzgzi();

    static {
        zzgzi zzgzi;
        try {
            zzgzi = (zzgzi) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgzi = null;
        }
        zza = zzgzi;
    }

    static zzgzi zza() {
        return zza;
    }

    static zzgzi zzb() {
        return zzb;
    }
}
