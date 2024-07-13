package com.google.android.gms.internal.ads;

import java.io.Closeable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzfuk implements Closeable {
    public static zzfuw zza() {
        return new zzfuw();
    }

    public static zzfuw zzb(int i, zzfuv zzfuv) {
        return new zzfuw(new zzfui(i), zzfuj.zza, zzfuv);
    }

    public static zzfuw zzc(zzfyu<Integer> zzfyu, zzfyu<Integer> zzfyu2, zzfuv zzfuv) {
        return new zzfuw(zzfyu, zzfyu2, zzfuv);
    }

    static /* synthetic */ Integer zze() {
        return -1;
    }
}
