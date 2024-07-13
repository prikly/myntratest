package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzdap implements zzdaq {
    private final Map zza;

    zzdap(Map map) {
        this.zza = map;
    }

    public final zzekq zza(int i, String str) {
        return (zzekq) this.zza.get(str);
    }
}
