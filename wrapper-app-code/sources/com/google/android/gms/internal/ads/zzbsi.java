package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.initialization.AdapterStatus;
import com.google.android.gms.ads.initialization.InitializationStatus;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads-lite@@21.5.0 */
public final class zzbsi implements InitializationStatus {
    private final Map zza;

    public zzbsi(Map map) {
        this.zza = map;
    }

    public final Map<String, AdapterStatus> getAdapterStatusMap() {
        return this.zza;
    }
}
