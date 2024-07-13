package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeve implements zzezl {
    public final double zza;
    public final boolean zzb;

    public zzeve(double d2, boolean z) {
        this.zza = d2;
        this.zzb = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfjr.zza(bundle, "device");
        bundle.putBundle("device", zza2);
        Bundle zza3 = zzfjr.zza(zza2, "battery");
        zza2.putBundle("battery", zza3);
        zza3.putBoolean("is_charging", this.zzb);
        zza3.putDouble("battery_level", this.zza);
    }
}
