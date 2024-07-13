package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzejo implements zzfnk {
    private final zzejc zza;
    private final zzejg zzb;

    zzejo(zzejc zzejc, zzejg zzejg) {
        this.zza = zzejc;
        this.zzb = zzejg;
    }

    public final void zzbH(zzfnd zzfnd, String str) {
    }

    public final void zzbI(zzfnd zzfnd, String str, Throwable th) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue() && zzfnd.RENDERER == zzfnd && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }

    public final void zzc(zzfnd zzfnd, String str) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue()) {
            if (zzfnd.RENDERER == zzfnd) {
                this.zza.zzg(zzt.zzB().elapsedRealtime());
            } else if (zzfnd.PRELOADED_LOADER == zzfnd || zzfnd.SERVER_TRANSACTION == zzfnd) {
                this.zza.zzh(zzt.zzB().elapsedRealtime());
                zzejg zzejg = this.zzb;
                zzejg.zza.zza(new zzejf(zzejg, this.zza.zzd()));
            }
        }
    }

    public final void zzd(zzfnd zzfnd, String str) {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue() && zzfnd.RENDERER == zzfnd && this.zza.zzc() != 0) {
            this.zza.zzf(zzt.zzB().elapsedRealtime() - this.zza.zzc());
        }
    }
}
