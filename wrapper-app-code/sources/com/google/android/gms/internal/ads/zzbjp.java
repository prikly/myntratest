package com.google.android.gms.internal.ads;

import android.text.TextUtils;

@Deprecated
/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzbjp {
    public static final void zza(zzbjo zzbjo, zzbjm zzbjm) {
        if (zzbjm.zza() == null) {
            throw new IllegalArgumentException("Context can't be null. Please set up context in CsiConfiguration.");
        } else if (!TextUtils.isEmpty(zzbjm.zzb())) {
            zzbjo.zzd(zzbjm.zza(), zzbjm.zzb(), zzbjm.zzc(), zzbjm.zzd());
        } else {
            throw new IllegalArgumentException("AfmaVersion can't be null or empty. Please set up afmaVersion in CsiConfiguration.");
        }
    }
}
