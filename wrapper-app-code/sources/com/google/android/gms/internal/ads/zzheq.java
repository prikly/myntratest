package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzheq implements zzhej, zzhep {
    private static final zzheq zza = new zzheq((Object) null);
    private final Object zzb;

    private zzheq(Object obj) {
        this.zzb = obj;
    }

    public static zzhep zza(Object obj) {
        zzhex.zza(obj, "instance cannot be null");
        return new zzheq(obj);
    }

    public static zzhep zzc(Object obj) {
        return obj == null ? zza : new zzheq(obj);
    }

    public final Object zzb() {
        return this.zzb;
    }
}
