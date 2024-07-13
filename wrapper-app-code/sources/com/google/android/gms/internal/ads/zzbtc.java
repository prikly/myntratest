package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Predicate;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final /* synthetic */ class zzbtc implements Predicate {
    public final /* synthetic */ zzbqd zza;

    public /* synthetic */ zzbtc(zzbqd zzbqd) {
        this.zza = zzbqd;
    }

    public final boolean apply(Object obj) {
        zzbqd zzbqd = (zzbqd) obj;
        return (zzbqd instanceof zzbth) && zzbth.zzb((zzbth) zzbqd).equals(this.zza);
    }
}
