package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxs {
    private static final zzgxq zza = new zzgxr();
    private static final zzgxq zzb;

    static {
        zzgxq zzgxq;
        try {
            zzgxq = (zzgxq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            zzgxq = null;
        }
        zzb = zzgxq;
    }

    static zzgxq zza() {
        zzgxq zzgxq = zzb;
        if (zzgxq != null) {
            return zzgxq;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }

    static zzgxq zzb() {
        return zza;
    }
}
