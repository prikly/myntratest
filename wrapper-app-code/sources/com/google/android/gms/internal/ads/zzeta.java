package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.appodeal.ads.adapters.admob.BuildConfig;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeta implements zzezl {
    private final boolean zza;

    public zzeta(boolean z) {
        this.zza = z;
    }

    public final /* bridge */ /* synthetic */ void zzf(Object obj) {
        ((Bundle) obj).putString("adid_p", true != this.zza ? BuildConfig.ADAPTER_VERSION : "1");
    }
}
