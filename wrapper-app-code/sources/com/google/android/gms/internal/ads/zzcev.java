package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.client.zzff;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcev {
    private final Clock zza;
    private final zzcet zzb;

    zzcev(Clock clock, zzcet zzcet) {
        this.zza = clock;
        this.zzb = zzcet;
    }

    public static zzcev zza(Context context) {
        return zzcfu.zzd(context).zzb();
    }

    public final void zzb(int i, long j) {
        this.zzb.zzb(i, j);
    }

    public final void zzc() {
        this.zzb.zza();
    }

    public final void zzd(zzff zzff) {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }

    public final void zze() {
        this.zzb.zzb(-1, this.zza.currentTimeMillis());
    }
}
