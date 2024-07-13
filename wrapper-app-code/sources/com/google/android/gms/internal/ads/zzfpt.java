package com.google.android.gms.internal.ads;

import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public abstract class zzfpt {
    public abstract void zzb(View view, zzfpz zzfpz, String str);

    public abstract void zzc();

    public abstract void zzd(View view);

    public abstract void zze();

    public static zzfpt zza(zzfpu zzfpu, zzfpv zzfpv) {
        if (zzfpr.zzb()) {
            return new zzfpx(zzfpu, zzfpv);
        }
        throw new IllegalStateException("Method called before OM SDK activation");
    }
}
