package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeyn implements zzezl {
    private final String zza;
    private final Bundle zzb;

    public zzeyn(String str, Bundle bundle) {
        this.zza = str;
        this.zzb = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        bundle.putString("rtb", this.zza);
        if (!this.zzb.isEmpty()) {
            bundle.putBundle("adapter_initialization_status", this.zzb);
        }
    }
}
