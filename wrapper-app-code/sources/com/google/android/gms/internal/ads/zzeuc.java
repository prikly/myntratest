package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeuc implements zzezl {
    private final Bundle zza;

    /* synthetic */ zzeuc(Bundle bundle, zzeub zzeub) {
        this.zza = bundle;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        Bundle bundle = (Bundle) obj;
        if (!this.zza.isEmpty()) {
            bundle.putBundle("installed_adapter_data", this.zza);
        }
    }
}
