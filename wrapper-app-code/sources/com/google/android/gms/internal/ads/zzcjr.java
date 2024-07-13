package com.google.android.gms.internal.ads;

import android.graphics.SurfaceTexture;
import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zzs;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzcjr {
    private final long zza = TimeUnit.MILLISECONDS.toNanos(((Long) zzba.zzc().zzb(zzbjj.zzB)).longValue());
    private long zzb;
    private boolean zzc = true;

    zzcjr() {
    }

    public final void zza(SurfaceTexture surfaceTexture, zzcjc zzcjc) {
        if (zzcjc != null) {
            long timestamp = surfaceTexture.getTimestamp();
            if (this.zzc || Math.abs(timestamp - this.zzb) >= this.zza) {
                this.zzc = false;
                this.zzb = timestamp;
                zzs.zza.post(new zzcjq(zzcjc));
            }
        }
    }

    public final void zzb() {
        this.zzc = true;
    }
}
