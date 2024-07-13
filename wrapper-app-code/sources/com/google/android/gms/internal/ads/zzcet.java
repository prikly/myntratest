package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.util.zzg;
import com.google.android.gms.common.util.Clock;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcet {
    private final Clock zza;
    private final zzg zzb;
    private final zzcft zzc;

    zzcet(Clock clock, zzg zzg, zzcft zzcft) {
        this.zza = clock;
        this.zzb = zzg;
        this.zzc = zzcft;
    }

    public final void zza() {
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzao)).booleanValue()) {
            this.zzc.zzt();
        }
    }

    public final void zzb(int i, long j) {
        if (!((Boolean) zzba.zzc().zzb(zzbjj.zzan)).booleanValue()) {
            if (j - this.zzb.zzf() < 0) {
                zze.zza("Receiving npa decision in the past, ignoring.");
                return;
            }
            if (!((Boolean) zzba.zzc().zzb(zzbjj.zzao)).booleanValue()) {
                this.zzb.zzK(-1);
                this.zzb.zzL(j);
            } else {
                this.zzb.zzK(i);
                this.zzb.zzL(j);
            }
            zza();
        }
    }
}
