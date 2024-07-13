package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzb;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzt;

/* compiled from: com.google.android.gms:play-services-ads@@21.5.0 */
final class zzcgt extends zzb {
    final /* synthetic */ zzcgx zza;

    zzcgt(zzcgx zzcgx) {
        this.zza = zzcgx;
    }

    public final void zza() {
        zzcgx zzcgx = this.zza;
        zzbjm zzbjm = new zzbjm(zzcgx.zze, zzcgx.zzf.zza);
        synchronized (this.zza.zza) {
            try {
                zzt.zze();
                zzbjp.zza(this.zza.zzh, zzbjm);
            } catch (IllegalArgumentException e2) {
                zze.zzk("Cannot config CSI reporter.", e2);
            }
        }
    }
}
