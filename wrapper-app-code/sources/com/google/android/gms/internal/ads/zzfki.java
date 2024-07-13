package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.DefaultClock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzfki implements zzhep {
    private final zzfkh zza;

    public zzfki(zzfkh zzfkh) {
        this.zza = zzfkh;
    }

    public final /* synthetic */ Object zzb() {
        Clock instance = DefaultClock.getInstance();
        zzhex.zzb(instance);
        return instance;
    }
}
