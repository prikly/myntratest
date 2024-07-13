package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzhez {
    private final List zza;
    private final List zzb;

    /* synthetic */ zzhez(int i, int i2, zzhey zzhey) {
        this.zza = zzhem.zzc(i);
        this.zzb = zzhem.zzc(i2);
    }

    public final zzhez zza(zzhfc zzhfc) {
        this.zzb.add(zzhfc);
        return this;
    }

    public final zzhez zzb(zzhfc zzhfc) {
        this.zza.add(zzhfc);
        return this;
    }

    public final zzhfa zzc() {
        return new zzhfa(this.zza, this.zzb, (zzhey) null);
    }
}
