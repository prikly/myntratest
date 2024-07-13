package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzba;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
public final class zzeja implements zzdeq, zzdgb {
    private static final Object zza = new Object();
    private static int zzb = 0;
    private final zzg zzc;
    private final zzejk zzd;

    public zzeja(zzejk zzejk, zzg zzg) {
        this.zzd = zzejk;
        this.zzc = zzg;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzba.zzc().zzb(zzbjj.zzfE)).booleanValue() && !this.zzc.zzP()) {
            synchronized (zza) {
                i = zzb;
                intValue = ((Integer) zzba.zzc().zzb(zzbjj.zzfF)).intValue();
            }
            if (i < intValue) {
                this.zzd.zzd(z);
                synchronized (zza) {
                    zzb++;
                }
            }
        }
    }

    public final void zza(zze zze) {
        zzb(false);
    }

    public final void zzn() {
        zzb(true);
    }
}
