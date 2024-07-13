package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcew implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzcew(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    /* renamed from: zza */
    public final zzcev zzb() {
        return new zzcev((Clock) this.zza.zzb(), (zzcet) this.zzb.zzb());
    }
}
