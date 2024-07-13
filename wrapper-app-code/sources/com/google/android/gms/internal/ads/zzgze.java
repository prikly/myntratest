package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgze implements zzgzl {
    private final zzgzl[] zza;

    zzgze(zzgzl... zzgzlArr) {
        this.zza = zzgzlArr;
    }

    public final zzgzk zzb(Class cls) {
        zzgzl[] zzgzlArr = this.zza;
        for (int i = 0; i < 2; i++) {
            zzgzl zzgzl = zzgzlArr[i];
            if (zzgzl.zzc(cls)) {
                return zzgzl.zzb(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(String.valueOf(cls.getName())));
    }

    public final boolean zzc(Class cls) {
        zzgzl[] zzgzlArr = this.zza;
        for (int i = 0; i < 2; i++) {
            if (zzgzlArr[i].zzc(cls)) {
                return true;
            }
        }
        return false;
    }
}
