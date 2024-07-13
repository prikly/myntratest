package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcey {
    private Context zza;
    private Clock zzb;
    private zzg zzc;
    private zzcft zzd;

    private zzcey() {
    }

    /* synthetic */ zzcey(zzcex zzcex) {
    }

    public final zzcey zza(zzg zzg) {
        this.zzc = zzg;
        return this;
    }

    public final zzcey zzb(Context context) {
        if (context != null) {
            this.zza = context;
            return this;
        }
        throw null;
    }

    public final zzcey zzc(Clock clock) {
        if (clock != null) {
            this.zzb = clock;
            return this;
        }
        throw null;
    }

    public final zzcey zzd(zzcft zzcft) {
        this.zzd = zzcft;
        return this;
    }

    public final zzcfu zze() {
        zzhex.zzc(this.zza, Context.class);
        zzhex.zzc(this.zzb, Clock.class);
        zzhex.zzc(this.zzc, zzg.class);
        zzhex.zzc(this.zzd, zzcft.class);
        return new zzcfa(this.zza, this.zzb, this.zzc, this.zzd, (zzcez) null);
    }
}
