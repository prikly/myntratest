package com.google.android.gms.internal.ads;

import android.content.Context;
import android.content.pm.ApplicationInfo;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzedq implements zzhep {
    private final zzhfc zza;

    public zzedq(zzhfc zzhfc) {
        this.zza = zzhfc;
    }

    /* renamed from: zza */
    public final ApplicationInfo zzb() {
        ApplicationInfo applicationInfo = ((Context) this.zza.zzb()).getApplicationInfo();
        zzhex.zzb(applicationInfo);
        return applicationInfo;
    }
}
