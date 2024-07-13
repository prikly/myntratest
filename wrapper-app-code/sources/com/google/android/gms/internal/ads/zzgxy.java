package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgxy implements zzgzl {
    private static final zzgxy zza = new zzgxy();

    private zzgxy() {
    }

    public static zzgxy zza() {
        return zza;
    }

    public final zzgzk zzb(Class cls) {
        if (zzgyd.class.isAssignableFrom(cls)) {
            try {
                return (zzgzk) zzgyd.zzaB(cls.asSubclass(zzgyd.class)).zzb(3, (Object) null, (Object) null);
            } catch (Exception e2) {
                throw new RuntimeException("Unable to get message info for ".concat(String.valueOf(cls.getName())), e2);
            }
        } else {
            throw new IllegalArgumentException("Unsupported message type: ".concat(String.valueOf(cls.getName())));
        }
    }

    public final boolean zzc(Class cls) {
        return zzgyd.class.isAssignableFrom(cls);
    }
}
