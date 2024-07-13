package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzgam {
    static int zza(int i) {
        return (int) (((long) Integer.rotateLeft((int) (((long) i) * -862048943), 15)) * 461845907);
    }

    static int zzb(Object obj) {
        return zza(obj == null ? 0 : obj.hashCode());
    }
}
