package com.google.android.gms.internal.ads;

import android.media.metrics.LogSessionId;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzmz {
    public static final zzmz zza = (zzen.zza < 31 ? new zzmz() : new zzmz(zzmy.zza));
    private final zzmy zzb;

    public zzmz() {
        this.zzb = null;
        zzdd.zzf(zzen.zza < 31);
    }

    private zzmz(zzmy zzmy) {
        this.zzb = zzmy;
    }

    public final LogSessionId zza() {
        zzmy zzmy = this.zzb;
        if (zzmy != null) {
            return zzmy.zzb;
        }
        throw null;
    }

    public zzmz(LogSessionId logSessionId) {
        this.zzb = new zzmy(logSessionId);
    }
}
