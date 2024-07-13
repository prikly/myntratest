package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.ads.internal.zzt;
import com.google.android.gms.internal.ads.zzcht;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzby extends zzb {
    private final zzcht zza;
    private final String zzb;

    public zzby(Context context, String str, String str2) {
        this.zza = new zzcht(zzt.zzp().zzc(context, str));
        this.zzb = str2;
    }

    public final void zza() {
        this.zza.zza(this.zzb);
    }
}
