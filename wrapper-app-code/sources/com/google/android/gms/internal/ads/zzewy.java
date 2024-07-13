package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzewy implements zzezl {
    public final Bundle zza;

    public zzewy(Bundle bundle) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        Bundle zza2 = zzfjr.zza(bundle, "device");
        zza2.putBundle("android_mem_info", this.zza);
        bundle.putBundle("device", zza2);
    }
}
