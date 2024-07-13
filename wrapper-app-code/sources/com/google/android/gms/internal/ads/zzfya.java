package com.google.android.gms.internal.ads;

import java.io.Serializable;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public abstract class zzfya implements Serializable {
    zzfya() {
    }

    public static zzfya zzc() {
        return zzfxj.zza;
    }

    public static zzfya zzd(Object obj) {
        return obj == null ? zzfxj.zza : new zzfyj(obj);
    }

    public abstract zzfya zza(zzfxt zzfxt);

    public abstract Object zzb(Object obj);
}
