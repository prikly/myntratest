package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzevt implements zzhep {
    private final zzhfc zza;
    private final zzhfc zzb;

    public zzevt(zzhfc zzhfc, zzhfc zzhfc2) {
        this.zza = zzhfc;
        this.zzb = zzhfc2;
    }

    public final /* bridge */ /* synthetic */ Object zzb() {
        return new zzevk(((zzevf) this.zza).zzb(), 10000, (Clock) this.zzb.zzb());
    }
}
